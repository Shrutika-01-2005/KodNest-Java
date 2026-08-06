
public class Nested {

    public static void main(String[] args) {

        int marks = 75;
        int attendance = 85;

        if (marks >= 35) {
            if (attendance >= 75) {
                System.out.println("Student Passed and Eligible");
            } else {
                System.out.println("Student Passed but Attendance is Low");
            }
        } else {
            System.out.println("Student Failed");
        }
    }
}
