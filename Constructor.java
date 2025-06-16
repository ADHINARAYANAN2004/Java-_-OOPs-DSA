public class Constructor {
    public static void main(String[] args) {
        // Array to store roll numbers, names, and marks
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] mark = new float[5];

        // Array of student objects
        student[] students = new student[5];

        // Initializing each student object in the array
        for (int i = 0; i < 5; i++) {
            students[i] = new student();
        }

        // Creating an individual student object
        student arun = new student();

        // Printing default values from Arun's object
        System.out.println(arun.rollno);
        System.out.println(arun.name);
        System.out.println(arun.mark);
    }

    // Inner class student
    static class student {
        int rollno;
        String name;
        float mark;

        // Constructor to initialize values
        student() {
            this.rollno = 101;
            this.name = "Arun Kumar";
            this.mark = 88.5f;
        }
    }
}

