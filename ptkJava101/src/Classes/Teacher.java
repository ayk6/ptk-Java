package Classes;

public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    Teacher (String name, String branch, String phoneNumber){
        this.name = name;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
    }
    void  print(){
        System.out.println("Öğretmen ismi \t: "+ this.name);
        System.out.println("İletişim \t\t: "+ this.phoneNumber);
        System.out.println("Branş \t\t\t: "+this.branch);
    }
}
