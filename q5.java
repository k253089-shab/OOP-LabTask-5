class Student{
    private int studentID;
    private String name;
    private double marks;

    public Student(int studentID, String name, double marks){
        this.studentID=studentID;
        this.name=name;
        this.marks=marks;
    }

    public double getMarks(){
        return marks;
    }

    public void displayStudentDetails(){
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public boolean isPassed(){
        return marks>=40;
    }
}

class College{
    private String collegeName;
    private String city;
    private Student[] students;

    public College(String collegeName, String city, Student[] students){
        this.collegeName=collegeName;
        this.city=city;
        this.students = students;
    }

    public void displayCollegeDetails(){
        System.out.println("College Information: \nName: " + collegeName);
        System.out.println("City: " + city);
        
        int count=0;
        int pCount=0;
        int fCount=0;
        double totalMarks=0;

        for(int i=0; i<5; i++){
            students[i].displayStudentDetails();
            count++;
            totalMarks+=students[i].getMarks();

            if(students[i].isPassed())
                pCount++;
            else
                fCount++;
        }

        double avgMarks = totalMarks/count;

        System.out.println("\nTotal Students: " + count);
        System.out.println("Passed: " + pCount);
        System.out.println("Failed: " + fCount);
        System.out.println("Average Marks: " + avgMarks);
    }
}


public class Main{
    public static void main(String[] args){
        Student[] students = new Student[5];

        students[0] = new Student(1, "Ali", 75);
        students[1] = new Student(2, "Ahmed", 55);
        students[2] = new Student(3, "Sara", 30);
        students[3] = new Student(4, "Ayesha", 90);
        students[4] = new Student(5, "Bilal", 38);

        College college = new College("ABC College", "Karachi", students);
        college.displayCollegeDetails();
    }
}
