import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    private ArrayList<Integer> sides;

    public Rectangle(int num1 , int num2, int num3 , int num4){
        sides = new ArrayList<>();
        sides.add(num1);
        sides.add(num2);
        sides.add(num3);
        sides.add(num4);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isSquare(){
        boolean check = false ;
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);
        if((a == b )& (a == c))
             check = true ;
        return  check;
    }

    public double calculatePerimeter(){
        double outp  = 0;
        for(int a : sides){
            outp += a;
        }
        return outp;
    }

    public double calculateArea(){
        double outp = 0;
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);
        if(isSquare())
            outp = a*b;
        else{
            if(a>b)
                outp= a*b;
            else
                outp = a*c;
        }
        return  outp;
    }

    public void draw(){
        System.out.println("Rectangle");
        double o = calculateArea();
        double oo = calculatePerimeter();
        System.out.println("area is : "+ o);
        System.out.println("perimeter is : "+ oo);
    }

    public String toString(){
        String s = "this is Rectangle";
        String rad = sides.toString();
        String output = s.concat(rad);
        return output;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

}
