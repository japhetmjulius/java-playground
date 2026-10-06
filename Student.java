public class Student {
    String name;
    int age;
    double marks;
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
    void checkGrade() {
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("Dogo", 20,  10.22);
        student1.displayStudent();
        student1.checkGrade();

        Student student2 = new Student("Dennomfupi", 22, 9.0);
        student2.displayStudent();
        student2.checkGrade();
}

}