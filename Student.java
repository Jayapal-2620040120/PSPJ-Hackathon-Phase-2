import java.util.Scanner;

class Student {
    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    // Parameterized constructor
    Student(String studentName, int rollNumber, double marks,
            String courseName, int courseCredits) {

        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // Calculate course fee
    double calculateFee() {
        return courseCredits * 1500;
    }

    // Check eligibility
    boolean checkEligibility() {
        return marks >= 50;
    }

    // Calculate scholarship percentage
    double calculateScholarship() {
        double fee = calculateFee();

        if (marks >= 85) {
            return fee * 20 / 100;
        } 
        else if (marks >= 70) {
            return fee * 10 / 100;
        } 
        else {
            return 0;
        }
    }

    // Calculate final fee
    double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    // Display all details
    void displayDetails() {
        System.out.println("\n----- Student Course Registration Details -----");

        System.out.println("Student Name   : " + studentName);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Marks          : " + marks);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Course Credits : " + courseCredits);

        System.out.println("Eligibility    : Eligible");
        System.out.println("Total Fee      : Rs. " + calculateFee());
        System.out.println("Scholarship    : Rs. " + calculateScholarship());
        System.out.println("Final Fee      : Rs. " + calculateFinalFee());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read student details
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        sc.nextLine(); // Clear input buffer

        // Read course details
        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int courseCredits = sc.nextInt();

        // Create object using parameterized constructor
        Student student = new Student(
            studentName,
            rollNumber,
            marks,
            courseName,
            courseCredits
        );

        // Check eligibility first
        if (student.checkEligibility()) {
            student.displayDetails();
        } 
        else {
            System.out.println("\nStudent is not eligible for course registration.");
            System.out.println("Minimum required marks are 50.");
        }

        sc.close();
    }
}