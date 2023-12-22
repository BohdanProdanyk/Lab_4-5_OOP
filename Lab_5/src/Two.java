public class Two extends One {
    private String bookname;
    private String genre;
    private double price;
    private int old;
    public Two(){

    }

    public Two(String namef, String namel, int age, double many, String bookname, String genre, double price, int old) {
        super(namef, namel, age, many);
        this.bookname = bookname;
        this.genre = genre;
        this.price = price;
        this.old = old;
    }
    void perevantagenya(){
        double s = 2 + 2;
        System.out.println(s);
    }
    void method1(){
        super.method1();
        System.out.println("task 2");
    }
    public void method2(){
        double ManyM = getMany();

        if(ManyM == 0){
            System.out.println("Мама передала тобі гроші, щоб ти купив собі книжечку");
            ManyM += 500;
        } else {
            System.out.println("Купи собі книжку");
        }
        setMany(ManyM);
    }







    public String getBookname() {
        return bookname;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public int getOld() {
        return old;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOld(int old) {
        this.old = old;
    }
}
