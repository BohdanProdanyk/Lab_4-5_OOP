public class One {
    private String namef;
    private String namel;
    private int age;
    private double many;
    public One(){

    }

    public One(String namef, String namel, int age, double many) {
        this.namef = namef;
        this.namel = namel;
        this.age = age;
        this.many = many;
    }
    void method1(){
        System.out.println("Моя чудова логіка");
    }



    public String getNamef() {
        return namef;
    }

    public String getNamel() {
        return namel;
    }

    public int getAge() {
        return age;
    }

    public double getMany() {
        return many;
    }

    public void setNamef(String namef) {
        this.namef = namef;
    }

    public void setNamel(String namel) {
        this.namel = namel;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMany(double many) {
        this.many = many;
    }
}
