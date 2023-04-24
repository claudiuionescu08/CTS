class Circle {
    public void draw(){
        System.out.println("Cercul este deseneat");
    }
}

class Rectangle{
    public void draw(){
        System.out.println("Dreptunghiul este deseneat");
    }
}

class Square{
    public void draw(){
        System.out.println("Patratul este deseneat");
    }
}

class ShapeMaker {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMaker(){
        circle=new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}