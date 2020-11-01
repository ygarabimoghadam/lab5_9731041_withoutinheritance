import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Triangle {

    private ArrayList<Integer> sides;

    public Triangle(int num1 , int num2, int num3){
        sides = new ArrayList<>();
        sides.add(num1);
        sides.add(num2);
        sides.add(num3);
    }

    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isEquilateral(){
        boolean cc= false ;
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);
        if((a == c)  & (a== b))
            cc = true;
        return  cc;
    }

    public double calculatePerimeter(){
        double outp  = 0;
        for(int a : sides){
            outp += a;
        }
        return outp;
    }

    public double calculateArea(){
        double p = calculatePerimeter()/2;
        double s=sqrt(p*(p-sides.get(0))*(p-sides.get(1))*(p-sides.get(2)));
        return  s;
    }

    public void draw(){
        System.out.println("triangle");
        double o = calculateArea();
        double oo = calculatePerimeter();
        System.out.println("area is : "+ o);
        System.out.println("perimeter is : "+ oo);
    }

    public String toString(){
        String s = "this is triangle";
        String rad = sides.toString();
        String output = s.concat(rad);
        return output;
    }


}



