//over loading.compilepolymorphism.same name different parameters
class Cpoly {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    
}
public class Cpolymarphism{
    public static void main(String[] args) {
        Cpoly p=new Cpoly();
        System.out.println("sum of two integers:"+p.add(10,20));
        System.out.println("sum of three integers:"+p.add(10,20,30));
        System.out.println("sum of two doubles:"+p.add(10.5,20.5));


    }
}
