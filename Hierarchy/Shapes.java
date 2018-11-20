class BidimensionalShape {
    private double width;
    private double height;

    BidimensionalShape(){
        width = 0.0;
        height = 0.0;
    }

    BidimensionalShape(double w, double h){
        width = w;
        height = h;
    }

    BidimensionalShape(double x){
        width = x;
        height = x;
    }

    BidimensionalShape(BidimensionalShape obj){
        width = obj.width;
        height = obj.height;
    }

    void setWidth(double w){
        width = w;
    }

    void setHeight(int h){
        height = h;
    }

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    void showDimensions(){
        System.out.println("Width: " + width + "\nHeight: " + height);
    }
}

class Triangle extends BidimensionalShape {
    private String style;

    Triangle(){
        super();
        style = "none";
    }

    Triangle(String s, double w, double h){
        super(w, h);
        style = s;
    }

    Triangle(double x){
        super(x);
        style = "none";
    }

    Triangle(Triangle obj){
        super(obj);
        style = obj.style;
    }

    double getArea(){
        return getWidth() * getHeight();
    }

    void showStyle(){
        System.out.println("Triangle has " + style + " style.");
    }
}

class ColoredTriangle extends Triangle{
    private String color;

    ColoredTriangle(String c, String s, double w, double h){
        super(s, w, h);
        color = c;
    }

    void setColor(String c){
        color = c;
    }

    String getColor(){
        return color;
    }

    void showColor(){
        System.out.println("Color is " + color);
    }
}
