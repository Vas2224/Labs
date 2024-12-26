import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Files {
    private List<Student> studentList;
    private List<Grade> gradeList;

    public List<Student> getStudentInfo(){ //метод возвр. список студентов
        return studentList;
    }
    public List<Grade> getGradeInfo(){ //оценки
        return gradeList;
    }

    public Files(String filePath) { //filePath это путь к файлу
        List<String> data = new ArrayList<>();//код взят из группы
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) { //читаем строки из файла и и доб. в список data
                data.add(line);
            }
        } catch (IOException e) { //то если ошибка при чтении
            throw new RuntimeException(e);
        }
        if (data.get(0).split(",").length == 3){
            this.studentList = mapS(data);
        } else {
            this.gradeList = mapG(data);
        }
    }

    private List<Student> mapS(List<String> lines) {
        List<Student> student = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++){ //проходим по всем строкам, нач. с 1. метод size возвр. кол-во элементов в списке
            String[] line = lines.get(i).split(",");
            student.add(new Student(line[0], line[1], line[2]));
        }
        return student;
    }

    private List<Grade> mapG(List<String> lines) {
        List<Grade> grade = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++){
            String[] line = lines.get(i).split(",");
            grade.add(new Grade(line[0], line[1]));
        }
        return grade;
    }
}
