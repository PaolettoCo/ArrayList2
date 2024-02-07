import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student Paolo = new Student("Paolo", 31);
        Student Daniel = new Student("Daniel", 25);
        Student Fabio = new Student("Fabio", 23);
        Student Alfredo = new Student("Alfredo", 32);
        Student Mary = new Student("Mary", 33);
        Student Alessandro = new Student("Alessando", 37);
        Student Derrik = new Student("Derrik", 24);
        Student Simon = new Student("Simon", 22);
        Student Manuel = new Student("Manuel", 24);
        Student Marco = new Student("Marco", 23);
        Student Simona = new Student("Simona", 26);
        ArrayList<Student> listaStudent = new ArrayList<>(Arrays.asList(Paolo,Daniel,Fabio, Alfredo,Mary,Alessandro,Derrik,Simon,Manuel,Marco,Simona));
        //System.out.println(listaStudent);
        for (Student studente : listaStudent) {
            System.out.println(studente);
        }
        System.out.println("----------------------------------------------------------");
        listaStudent.sort(Comparator.comparing(Student::getAge));
        for (Student studente : listaStudent) {
            System.out.println(studente);
        }
    }
}
