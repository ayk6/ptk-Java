package ClassPrac;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("A",10,100,85,15);
        Fighter f2=new Fighter("B",9,90,80,25);

        Match match=new Match(f1,f2,80,90);
        match.run();
    }
}
