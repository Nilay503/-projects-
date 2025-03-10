import java.util.* ;

class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
    }
}

class Subject {
    private String subjectCode;
    private String subjectName;

    public Subject(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }
}

class Marksheet {
    private Student student;
    private Subject[] subjects;
    private int[] marks;

     Marksheet(Student student, Subject[] subjects) {
        this.student = student;
        this.subjects = subjects;
        this.marks = new int[subjects.length];
    }

    void setMarks(int[] marks) {
        if (marks.length == this.marks.length) {
            this.marks = marks;
        } else {
            System.out.println("Error: Number of marks does not match number of subjects.");
        }
    }

    int getTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    private double calculateSGP() {
        return (double) getTotalMarks() / subjects.length;
    }

    private double calculateCGP() {
        return calculateSGP() / 10.0; // Assuming CGP is a scaled down value of SGP
    }

    

    private String calculateGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B+";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

     void displayMarksheet() {
        student.displayStudentDetails();
        System.out.println("\n--- Marksheet ---");
        for (int i = 0; i < subjects.length; i++) {
            String grade = calculateGrade(marks[i]);
            System.out.println(subjects[i].getSubjectName() + ": " + marks[i] + " (Grade: " + grade + ")");
        }
        System.out.printf("\nSGP: %.2f\n", calculateSGP());
        System.out.printf("CGP: %.2f\n", calculateCGP());
    }

     Student getStudent() {
        return student;
    }
}

public class SimpleMarksheetSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Marksheet System");

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Marksheet[] marksheets = new Marksheet[numStudents];

        // Adding multiple students
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEntering details for Student " + (i + 1));
            System.out.print("Enter Student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            Student student = new Student(studentId, studentName);

            // Adding multiple subjects
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Subject[] subjects = new Subject[numSubjects];

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter Subject " + (j + 1) + " Code: ");
                String subjectCode = scanner.nextLine();
                System.out.print("Enter Subject " + (j + 1) + " Name: ");
                String subjectName = scanner.nextLine();
                subjects[j] = new Subject(subjectCode, subjectName);
            }

            // Create a marksheet for the student
            Marksheet marksheet = new Marksheet(student, subjects);

            // Enter marks for each subject
            int[] marks = new int[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for " + subjects[j].getSubjectName() + ": ");
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline

            marksheet.setMarks(marks);
            marksheets[i] = marksheet;
        }

        // Sorting students by total marks
        Arrays.sort(marksheets, (m1, m2) -> m2.getTotalMarks() - m1.getTotalMarks());

        // Displaying sorted marksheets
        System.out.println("\n--- Sorted Marksheet by Total Marks ---");
        for (Marksheet marksheet : marksheets) {
            marksheet.displayMarksheet();
            System.out.println("----------------------");
        }

        // Searching for a student by ID
        System.out.print("\nEnter Student ID to search: ");
        String searchId = scanner.nextLine();
        boolean found = false;

        for (Marksheet marksheet : marksheets) {
            if (marksheet.getStudent().getStudentId().equalsIgnoreCase(searchId)) {
                System.out.println("\nStudent Found:");
                marksheet.displayMarksheet();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nStudent with ID " + searchId + " not found.");
        }

        scanner.close();
    }
}