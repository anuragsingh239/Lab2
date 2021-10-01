/*
Anonymous class
abstract
interface
if you do not know the definition / behaviour then we will create abstract method
 */
abstract class First
{
    abstract  void method1();
}
//class Second extends First
//{

//    @Override
//    public void method1() {
//        System.out.println("welcome");
//    }
//}
interface i1{
    default public void m1() {

    }
//    public void m2();
//    abstract void m3();
//    public abstract

}
public class Result {
    public static void main(String[] args) {
        i1 obj=new i1() {
            @Override
            public void m1() {
                System.out.println("Welcome");
            }
        };
        obj.m1();

    }
    public void m4() {

    }
}
