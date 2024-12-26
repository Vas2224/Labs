import java.util.ArrayList;

public class Student {
    private String lastName;
    private String firstName;
    private String id;
    ArrayList<String> marks = new ArrayList<>();

    public Student(String id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ArrayList<String> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<String> marks) {
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return id + " " + firstName + " " + lastName;
    }
}
