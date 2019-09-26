package Lab1.task2;
public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alex";
        s1.mark = 9.2;
        s1.age = 18;

        Student s2 = new Student();
        s2.name = "Jane";
        s2.mark = 9.5;
        s2.age = 18;

        Student s3 = new Student();
        s3.name = "Pavel";
        s3.mark = 9;
        s3.age = 19;

        Student s4 = new Student();
        s4.name = "Tatiana";
        s4.mark = 8.6;
        s4.age = 20;

        Student[] students1 = new Student[2];
        students1[0] = s1;
        students1[1] = s2;

        Student[] students2 = new Student[2];
        students2[0] = s3;
        students2[1] = s4;

        University uni1 = new University();
        uni1.name = "UTM";
        uni1.foundyear = 1964;
        uni1.students = students1;

        University uni2 = new University();
        uni2.name = "ASEM";
        uni2.foundyear = 1972;
        uni2.students = students2;


        for (Student student : uni1.students) {
            System.out.println(uni1.name + " " + uni1.foundyear + " " + student.name);
        }

        for (Student student : uni2.students) {
            System.out.println(uni2.name + " " + uni2.foundyear + " " + student.name);
        }
    }
}
