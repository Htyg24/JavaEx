import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ParseString {

    public void parse(String str) throws IOException {
        UserData userData = new UserData();
        String[] data = str.split(" ");
        if (data.length < 6)
            throw new RuntimeException("Less data entered");
        else if (data.length > 6)
            throw new RuntimeException("More data entered");
        for (String s:data) {

            if (s.contains(".")) {
                if (userData.getDate() != null) {
                    throw new RuntimeException("Date is already there");
                }
                if(!s.matches("^(0?[1-9]|[12][0-9]|3[0-1])\\.(0?[1-9]|1[0-9])\\.\\d{4}$")){
                    throw new RuntimeException("Wrong date format");
                }
                userData.setDate(s);

            } else if (s.length() == 1) {
                if (userData.getSex() != ' ') {
                    throw new RuntimeException("Sex is already there");
                }
                userData.setSex(s.toCharArray()[0]);

            } else if (isNumber(s)) {
                if (userData.getPhoneNumber() != -1){
                    throw new RuntimeException("Phone Number already there");
                }
                userData.setPhoneNumber(Long.parseLong(s));

            } else if (userData.getSurname() == null)
                userData.setSurname(s);

            else if (userData.getName() == null)
                userData.setName(s);

            else if (userData.getPatronymic() == null)
                userData.setPatronymic(s);

            else {
                System.out.println(s);
                throw new RuntimeException("Wrong data");

            }
        }
        userData.fileWriter();
    }

    private boolean isNumber(String str) {
        try {
            Long.parseLong(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
