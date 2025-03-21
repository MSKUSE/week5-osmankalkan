public class Rectangle {

    private Point topLeft;
    private int sideA , sideB;

    public Rectangle(Point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
       setSideA(sideA);
       setSideB(sideB);
    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA<0){
            this.sideA = 0;
            System.out.println("Side A can't be negative");
        }else{
            this.sideA = sideA;
        }
        this.sideA = sideA;
    }

    public int getSideB() {

        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0 ){
            this.sideB = 0;
            System.out.println("Side B can't be negative");
        }else{
            this.sideB = sideB;
        }
        this.sideB = sideB;
    }

    public int perimeter(){
        return (2*this.sideA) + (2* this.sideB);
    }

    public int area(){
        return  this.sideA * this.sideB;
    }
}
