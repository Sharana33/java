class Hybridinherit {
    public static void main(String[] args) {
        D object=new D();
        object.Display();

    }
    
}
class A {
    
    int a=1;
}
class B extends A{
    int b=2;
}
interface C{
    int c=3;
}
class D extends B implements C{
    int d=4;
    int sum =a + b + c +d;
    public void Display(){
        System.out.println("value of a is"+a);
        System.out.println("value of b is"+b);
        System.out.println("value of c is"+C.c);
        System.out.println("value of d is"+d);
        System.out.println("the sum is "+sum);


    }

} 
