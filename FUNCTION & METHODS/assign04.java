public class assign04 {
    public static void main(String[] args) {
          Base base = new Derived("asdf");      
    }
}

class Base{
    public Base(){
        System.out.println("Base");
    }

    public Base(String s){
        System.out.println("Base"+s);
    }
}

class Derived extends Base{
    public Derived(String s){
        // super();
        super(s);
        System.out.println("Derived");
    }
}
