public class There extends Two {
    public int tricket;

    public There(String namef, String namel, int age, double many, String bookname, String genre, double price, int old, int tricket) {
        super(namef, namel, age, many, bookname, genre, price, old);
        this.tricket = tricket;
    }
    void lucky(){
        if (tricket % 2 == 0){
            System.out.println("Вітаю у вас щасливий білет");
        }
        else{
            System.out.println("Повезе в наступний раз");
        }
    }
}
