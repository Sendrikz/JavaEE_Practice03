import java.util.List;

public class CricketCoach {

    private String name;
    private String email;
    private List<String> studentList;

    CricketCoach() {}

    public CricketCoach(String name, String email, List<String> studentList) {
        this.name = name;
        this.email = email;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<String> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "CricketCoach{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
