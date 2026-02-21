public class Student{
    private int studentID;
    private String name;
    private static int numberOfStudents=0;

    public Student(int studentID, String name){
        this.studentID=studentID;
        this.name=name;
        numberOfStudents++;
    }

    public static void displayStudentsNo(){
        System.out.println("\nTotal number of students: " + numberOfStudents);
    }

    public void displayStudent(){
        System.out.println("\nStudent ID: " + studentID + "\nName: " + name);
    }
}

public class Main{
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Sara");
        Student s3 = new Student(3, "Wick");

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        Student.displayStudentsNo();
    }
}
