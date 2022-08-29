class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("poamap poamap");
  }
}
class Truck extends Vehicle {
  public String modelName = "TATA"; 
    public void honk1() {
    System.out.println("Horn please poamap poopopop ");
  }
}

class Car extends Truck {
  private String modelName1 = "Maruti";
  public static void main(String[] args) {
    Car myFastCar = new Car();
   myFastCar.honk();
    myFastCar.honk1();
    logger.info("Model name" + myFastCar.brand);
    logger.info("Model name" + myFastCar.modelName);
    logger.info("Model name" + myFastCar.modelName1);
  }

}
