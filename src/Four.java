public class Four extends Two{
    public Four(String namef, String namel, int age, double many, String bookname, String genre, double price, int old) {
        super(namef, namel, age, many, bookname, genre, price, old);
    }
    public Four(){

    }
    void method4(){
        method1();
        method2();
    }
    void test(){
        FourDemo fd = new FourDemo();
        fd.methodDemo();
    }

    class FourDemo{
        void methodDemo(){
            method4();
            System.out.println("Нема логіки");
        }
    }
}
