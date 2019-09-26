package Lab1.task3;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alex";
        s1.mark = 9.2f;
        s1.age = 18;

        Student s2 = new Student();
        s2.name = "Jane";
        s2.mark = 9.5f;
        s2.age = 18;

        Student s3 = new Student();
        s3.name = "Pavel";
        s3.mark = 9f;
        s3.age = 19;

        Student s4 = new Student();
        s4.name = "Tatiana";
        s4.mark = 8.6f;
        s4.age = 20;

        Student s5 = new Student();
        s5.name = "Dorin";
        s5.mark = 5.0f;
        s5.age = 22;

        Student s6 = new Student();
        s6.name = "Jora";
        s6.mark = 6.7f;
        s6.age = 19;

        Student[] students1 = new Student[2];
        students1[0] = s1;
        students1[1] = s2;

        Student[] students2 = new Student[2];
        students2[0] = s3;
        students2[1] = s4;

        Student[] students3 = new Student[2];
        students3[0] = s5;
        students3[1] = s6;

        University uni1 = new University();
        uni1.name = "UTM";
        uni1.foundyear = 1964;
        uni1.students = students1;

        University uni2 = new University();
        uni2.name = "ASEM";
        uni2.foundyear = 1972;
        uni2.students = students2;

        University uni3 = new University();
        uni3.name = "USM";
        uni3.foundyear = 1956;
        uni3.students = students3;


        float sumUTM = 0;
        int i;
        float avg1;
        for (i = 0; i < students1.length; i++) {
            sumUTM += students1[i].mark; }
        avg1 = sumUTM/2;

        System.out.println("Average mark of UTM is = " + avg1);

        float sumASEM = 0;
        int j;
        float avg2;
        for (j = 0; j < students2.length; j++) {
            sumASEM += students2[j].mark; }
        avg2 = sumASEM/2;


        System.out.println("Average mark of ASEM is = " + avg2);

        float sumUSM = 0;
        int l;
        float avg3;
        for (l = 0; l < students3.length; l++) {
            sumUSM += students3[l].mark; }
        avg3 = sumUSM/2;


        System.out.println("Average mark of USM is = " + avg3);

        System.out.println("Average of all universities:" +((avg1)+(avg2)+(avg3))/3);

    }


}
