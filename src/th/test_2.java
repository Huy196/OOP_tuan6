package th;

/*Chuong trinh thay doi thuoc tinh chung cua tat ca doi tuong (truong static).  */

class Student {
    int rollno;
    String name;
    static String college = "BachKhoa";

    static void change() {
        college = "QuocGia";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Thanh");
        Student s3 = new Student(333, "Nam");
        s1.display();change();
        s2.display();
        s3.display();
    }
}

/*Chuong trinh lay cube (gia tri lap phuong) cua so da cho boi phuong thuc static  */
//class Calculate {
//    static int cube(int x) {
//        return x * x * x;
//    }
//
//    public static void main(String args[]) {
//        int result = Calculate.cube(5);
//        System.out.println(result);
//    }
//}

//class A {
//
//    static {
//        System.out.println("Khoi static dược triệu hồi");
//    }
//    /*non static*/
//    public static void main(String args[]) {
//        System.out.println("Hello main ");
//    }
//}
//Phương thức ko có main ko chạy được
//class A3 {
//    static {
//        System.out.println("Khoi static duoc trieu hoi");
//        System.exit(0);
//    }
//}