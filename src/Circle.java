public class Circle {
    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculatePerimeter(double r){
        double output = 2*r*(Math.PI);
        return output;
    }

    public double calculateArea(double r){
        double output = r*r*(Math.PI);
        return output;
    }

    public void draw(){
        System.out.println("circle");
        double o = calculateArea(radius);
        double oo = calculatePerimeter(radius);
        System.out.println("area is : "+ o);
        System.out.println("perimeter is : "+ oo);
    }

    public boolean equals(double r){
        boolean check = false ;

        if(r == radius)
            check = true ;
        else
            check = false ;
                    return check;
    }

    public String toString(){
        String s = "this is circule";
        String rad = Double.toString(radius);
        String output = s.concat(rad);
        return output;
    }
}