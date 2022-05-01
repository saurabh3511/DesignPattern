package designPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        VehicleFactory shapeFactory = new VehicleFactory();

        //get an object of Fourwheeler and call its model method.
        vehicle shape1 = shapeFactory.getShape("FourWheeler");
        shape1.model();

        //get an object of Threewheeler and call its model method.
        vehicle shape2 = shapeFactory.getShape("ThreeWheeler");

        shape2.model();

        //get an object of TwoWheeler and call its model method.
        vehicle shape3 = shapeFactory.getShape("TwoWheeler");

        shape3.model();
    }
}
