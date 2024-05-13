package th;

class Zoo {
    public String coolMethod() {
        return "wow baby";
    }
}

//class Moo {
//    public void useAZoo() {
//        Zoo z = new Zoo();
//        System.out.println("A Zoo says, " + z.coolMethod());
//    }
//
//    public static void main(String[] args) {
//        Moo mo = new Moo();
//        mo.useAZoo();
//    }
//}
class Moo extends Zoo{
    public static void main(String[] args) {
//        System.out.println("Mo say : " + this.coolMethod());

        Zoo z = new Zoo();
        System.out.println("Zoo says, " + z.coolMethod());
    }
}