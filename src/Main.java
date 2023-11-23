public class Main {
    public static void main(String[] args) {
        System.out.println("Бібліотека");
        One one = new One("Богдан","Проданик",18,0);
        Two two = new Two(one.getNamef(), one.getNamel(), one.getAge(), one.getMany(), "Гаррі потер і філософський камінь","Фантастика",380,16);
        Four four = new Four();
        four.test();

    }
}