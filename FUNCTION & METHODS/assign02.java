public class assign02 {
    public static void main(String[] args) {
        ElectriCar ec = new ElectriCar();
        ec.drive();
        System.out.println(ec.drive());
    }
}

class Automobile{
    private String drive(){
        return "Driving vehicle";
    }
}

class ElectriCar extends Car{
    public String drive(){
        return "Driving an elctric car";
    }
}