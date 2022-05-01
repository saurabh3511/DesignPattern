package designPattern;

public class VehicleFactory {
    public vehicle getShape(String vehicleType){
        if(vehicleType == null){
            return null;
        }
        if(vehicleType.equalsIgnoreCase("TwoWheeler")){
            return new TwoWheeler();

        } else if(vehicleType.equalsIgnoreCase("ThreeWheeler")){
            return new ThreeWheeler();

        } else if(vehicleType.equalsIgnoreCase("FourWheeler")){
            return new FourWheeler();
        }

        return null;
    }
}
