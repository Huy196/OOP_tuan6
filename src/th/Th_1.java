package th;

public class Th_1 {
    private int stt;
    private String name;
    private static String collage;

    Th_1(int r, String n){
        stt = r;
        name = n;
    }
    static void change(){
        collage = "Code_gym";
    }
    void display(){
        System.out.println(stt + " " + name + " "+ collage);
    }

    public static void main(String[] args) {
        Th_1.change();
        Th_1 s1 = new Th_1(111,"Hoang");
        Th_1 s2 = new Th_1(222,"Khanh");
        Th_1 s3 = new Th_1(333,"Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
