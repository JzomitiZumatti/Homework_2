public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String eMail;
    private long phoneNumber;
    private int age;

    public Employee(String surname, String name, String patronymic, String position, String eMail, long phoneNumber, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.age = age;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}