package guru.springframework.sfgdi.interfacesegregationprinciple;

public class ToyBuilder {
    public static  ToyHouse buildToyHouse(){
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(15.00);
        toyHouse.setColor("Green");
  return toyHouse;
    }
    public static  ToyCar buildToyCar(){
        ToyCar toyCar = new ToyCar();
        toyCar.setPrice(25.00);
        toyCar.setColor("Red");
        toyCar.move();
        return toyCar;
    }

    public static  ToyPlane buildToyPlane(){
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(125.00);
        toyPlane.setColor("White");
        toyPlane.move();
        toyPlane.fly();
        return toyPlane;
    }



}
