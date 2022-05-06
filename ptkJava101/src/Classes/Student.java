package Classes;

public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stdNo;
    String classes;

    double average;
    boolean isPass;

    Student(String name, String stdNo, String classes,
            Course c1, Course c2, Course c3) {
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
    }

    void addExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (note1 >= 0 && note1 <= 100) {
            c2.note = note2;
        }
        if (note1 >= 0 && note1 <= 100) {
            c3.note = note3;
        }
    }

    void printNote() {
        System.out.println(name);
        System.out.println(c1.name + " : " + c1.note);
        System.out.println(c2.name + " : " + c2.note);
        System.out.println(c3.name + " : " + c3.note);
    }

    void checkPass() {
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3;
        if (this.average > 55) {
            printNote();
            System.out.println("geçti");
        } else {
            printNote();
            System.out.println("kaldı");
        }
    }
}
