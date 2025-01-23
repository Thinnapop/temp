

public class circle{
    protected double radius;

    public circle(){

    }
    public circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (Math.pow(radius, 2));
    }
    @Override
    public String toString(){
        
        return "The Area of circle are: "+getArea();
    }
}