package Classes;

public class StuInfSys {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut hoca", "tarih", "3141592");


        Teacher t2 = new Teacher("Kemal hoca", "fizik", "3141593");


        Course tarih = new Course("Tarih","101","tarih");
        tarih.addTeacher(t1);
        tarih.printTeacher();

        Course fizik = new Course("Fizik","102","fizik");
        Course kimya = new Course("Kimya","103","kimya");

        Student s1 = new Student("saffet","123","2",
                fizik,kimya,tarih);

        s1.addExamNote(55,65,10);

        s1.checkPass();
    }
}
