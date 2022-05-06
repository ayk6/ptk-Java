package Classes;

public class Course {

    Teacher tch;  // referans - teacher sınıfından oluşturulan nesne
                  // sınıflar arası işleme izin verir

    String name;
    String code;
    String prefix;
    int note;

    Course (String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        note =0;
    }
    void addTeacher(Teacher tch){
        if(tch.branch.equals(this.prefix)){
        this.tch = tch;}
        else System.out.println("Hatalı giriş");
    }

    void printTeacher(){
        this.tch.print();
    }

}
