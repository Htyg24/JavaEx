import java.io.FileWriter;
import java.io.IOException;

public class UserData {
    public UserData() throws IOException {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    private String surname = null;
    private String name = null;
    private String patronymic = null;
    private String date = null;
    private long phoneNumber = -1;
    private char sex = ' ';

    public void fileWriter() {
        try (FileWriter writer = new FileWriter("D:\\GB\\JavaEx\\Homework3\\src\\main\\" + this.surname + ".txt", true)) {
            writer.append("<" + this.surname + "><" + this.name + "><" + this.patronymic + "><" + this.date + "><" + this.phoneNumber + "><" + this.sex +">\n");
        } catch (IOException e) {
            System.out.println("");
        }
    }

}
