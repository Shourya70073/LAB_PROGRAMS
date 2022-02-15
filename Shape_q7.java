public abstract class Shape_q7 {
    public abstract  void draw();
    public abstract void erase();
    public static void main(String[] args) {
        Triangle obj1=new Triangle();
        Circle obj2=new Circle();
        Square obj3=new Square();
        obj1.draw();
        obj1.erase();
        obj2.draw();
        obj2.erase();
        obj3.draw();
        obj3.erase();
    } 
}
class Triangle extends Shape_q7{
    public void draw(){
      System.out.println("traingle drawn");
    }
    public void erase(){
        System.out.println("triangle Erasing");
    }
}
class Circle extends Shape_q7{
    public void draw(){
      System.out.println("Circle drawn");
    }
    public void erase(){
        System.out.println("Circle Erasing");
    }
}
class Square extends Shape_q7{
    public void draw(){
      System.out.println("Square drawn");
    }
    public void erase(){
        System.out.println("Square Erasing");
    }
}
