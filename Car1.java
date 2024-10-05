class Car1 {
    String modelName;
    String owner;
    int regNumber;
    
    public Car1 (String modelName,String owner,int regNumber){
        this.modelName = modelName;
        this.owner=owner;
        this.regNumber=regNumber;
    }
    public void startEngine(){
        System.out.println("car can started");
    }
    public void accelerate(){
        System.out.println("car can be accelerated");
    }
    public void stop(){
        System.out.println("car can be stopped");
    }
    public void showCarInformation(){
        System.out.println("car is owned by"+owner);
        System.out.println("car model is "+modelName);
        System.out.println("car regnumber is"+regNumber);
    }
    public static void main(String[] args){
        Car1 myCar=new Car1("Suzuki","sahil",1234);
        myCar.startEngine();
        myCar.accelerate();
        myCar.stop();
        myCar.showCarInformation();
    }
}  
  