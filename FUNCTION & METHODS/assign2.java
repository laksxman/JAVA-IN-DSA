public class assign2 {
    public static void main(String[] args) {
        // Vehicle obj1 = new Car();
        // obj1.print1(); // We can't call print1, Beacause it doesnot in vehicle class

        Vehicle obj2 = new Vehicle();
        obj2.print(); 
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class (Car)");
    }
}