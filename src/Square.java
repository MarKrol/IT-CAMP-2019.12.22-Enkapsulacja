public class Square {
    private double side;                   //długość boku
    private int area;                   //pole

    Square(int side){
        this();
        this.side=side;
        this.area=side*side;
    }

    private Square(){
        System.out.println("Tworze jakiś szkielet kwadratu");
    }

    private Square(double x){
        System.out.println("Tworze jakiś szkielet kwadratu");
    }


    public double getSide() {
        return side;
    }

    public int getArea() {
        return area;
    }

    public void setSide(int side) {
        this.side = side;
        this.area = side * side;
    }

    public void setArea(int area) {
        this.area = area;
        this.side = Math.sqrt(area);
    }

    public void zrobCos(){
        System.out.println("Metoda coś robi");
    }

    public void zrobCos(int parametr){
        System.out.println("Metoda coś robi z parametrem int: " + parametr);
    }

    public void zrobCos(double parametr){
        System.out.println("Metoda coś robi z parametrem int: " + parametr);
    }
}
