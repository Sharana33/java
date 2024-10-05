public class Car {
    // public void Display(String name){
    //     System.out.println("Name:"+name);
    //}
    // public static int square(int number){
    //     return number* number;
    // }
    String brand;
    int year;

    //constructor

    public Car(String brand,int year){
        this.brand=brand;
        this.year=year;

    }
    public void DisplayCarInfo(){
        System.out.println("car brand:"+brand);
        System.out.println("manufacturing year:"+year);

    }
    public static void main(String[] args) {
        // Instancemethod a=new Instancemethod();
        // a.Display("hi");
        // int result=Instancemethod.square(5);
        // System.out.println("square of 5 is:"+result);
        Car myCar=new Car("BMW",1995);
        myCar.DisplayCarInfo();

    }


}

