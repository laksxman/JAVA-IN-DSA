public class assign03 {

    public static void main(String[] args) {
        Derived d = new DeDerived();
        Base b = new DeDerived();
        DeDerived d2 = new DeDerived();
        // output will be Base Derived Dederived
    }
}

class Base{
    public Base(){
        System.out.println("Base");
    }
}
class Derived extends Base{
    public Derived(){
        System.out.println("Derived");
    }
}
class DeDerived extends Derived{
    public DeDerived(){
        System.out.println("DeDerived");
    }
}