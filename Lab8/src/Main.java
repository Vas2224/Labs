import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studData = new Files("C:\\Users\\vs767\\Downloads\\Lab8\\students.csv").getStudentInfo();
        List<Grade> gradeData = new Files("C:\\Users\\vs767\\Downloads\\Lab8\\grade.csv").getGradeInfo();
        SG a = new SG();
        a.addStudentsInfo(studData, gradeData);

        a.printAllStudents();
        a.averageGrade();
        a.averageGradeInRange(4.2, 4.6);

    }
}
