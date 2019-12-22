public class Main {
    public static void main(String[] args) {
        Square kwadrat =new Square(5);
        //Square kwadrat2 = new Square();
        System.out.println(kwadrat.getSide());
        System.out.println(kwadrat.getArea());

        kwadrat.setSide(7);
        kwadrat.setArea(36);

        System.out.println(kwadrat.getSide());
        System.out.println(kwadrat.getArea());

        kwadrat.zrobCos();
        kwadrat.zrobCos(7);
        kwadrat.zrobCos(5.5);


    }
}
