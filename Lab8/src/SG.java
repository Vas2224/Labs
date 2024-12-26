import java.util.ArrayList;
import java.util.List;

public class SG {
    List<Student> studData = new ArrayList<>(); //studData список объектов класса Student
    List<Grade> gradeData = new ArrayList<>();// тоже самое только Grade

    public void addStudentsInfo(List<Student> studData, List<Grade> gradeData) { //метод который принимает 2 списка
        this.studData = studData; //здесь сохраняем их во внутр. переменные класса
        this.gradeData = gradeData;
        for (Student pup: studData){
            ArrayList<String> marks = new ArrayList<>();// новый список для хранения оценок
            for (Grade mark: gradeData) { //проходимся по всем оценкам в gradeDate и и ищем оценки, id чтоб совпадало с id студ.
                if (pup.getId().equals(mark.getId())) {
                    marks.add(mark.getMark());
                }
            }
            pup.setMarks(marks);//устанавливаем эти оценки для студ.
        }
    }

    public void printAllStudents() {
        for (Student i: studData) {
            System.out.println(i.getFirstName() + " " + i.getLastName() + " " + i.getMarks());
        }
    }

    public void averageGrade() { // этот метод вычисляет среднюю оценку
        for (Student kuk: studData) {
            double bufer = 0; //переменная для суммы оценок
            for (String a: kuk.getMarks()) {
                bufer += Integer.parseInt(a);// с помощью этого мы переводим их из строки в числа, но сначала суммир.
            }
            double averageGrade = bufer / kuk.getMarks().size();//вычисляем среднюю оценку
            System.out.println("У " + kuk.getFirstName() + " " + kuk.getLastName() + " средняя оценка равна " + averageGrade);
        }
    }

    public void averageGradeInRange(double lowerBound, double upperBound) {// для нахождения чьи оценки попадают в диапозон
        boolean flag = false;//для отслеживания нашелся ли студент
        for (Student i: studData) {
            double bufer = 0;
            for (String a: i.getMarks()) {//считаем сумму оценок
                bufer += Integer.parseInt(a);
            }
            double averageGrade = bufer / i.getMarks().size();
            if (averageGrade >= lowerBound & averageGrade <=upperBound) {//проверка на попадание в диапозон
                flag = true;
                System.out.println("В этом диапазоне находится " + i.getFirstName() + " " + i.getLastName());
            }
        }
        if (!flag) {
            System.out.println("В этом диапазоне студентов нет");
        }
    }
}
