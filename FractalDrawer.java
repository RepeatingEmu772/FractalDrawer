//Written by Manan Mrig(MRIG0001)

// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area

    public FractalDrawer() {}  // contructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas drawing = new Canvas(1000,1000);
        if(type.equals("circle")){
            this.drawCircleFractal(100,400,400,Color.PINK,drawing,1);
        }
        else if(type.equals("triangle")){
            this.drawTriangleFractal(200,200,400,500,Color.PINK,drawing,1);
        }
        else if(type.equals("rectangle")){
            this.drawRectangleFractal(400,400,100,200,Color.WHITE,drawing,1);
        }
        return totalArea;
    }

    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas drawing, int level) {
        if(level<8){
           
             Circle circle1= new Circle(x, y, radius, c);
            drawing.drawShape(circle1);

            drawCircleFractal(radius/2, x, y-((3*radius)/2), Color.RED, drawing, level+1);
            drawCircleFractal(radius/2, x-((3*radius)/2), y, Color.YELLOW, drawing, level+1);
            drawCircleFractal(radius/2, x, y+((3*radius)/2), Color.BLUE, drawing, level+1);
            drawCircleFractal(radius/2, x+((3*radius)/2), y, Color.CYAN, drawing, level+1);
            //level=level+1;
        }
    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas drawing, int level){
        
        
        if(level<9){
            Triangle triangle1 = new Triangle(x, y, width, height,c);
            drawing.drawShape(triangle1);

            drawTriangleFractal(width/2, height/2, x-(width/4), y+(height/2), Color.BLUE, drawing, level+1);            
            drawTriangleFractal(width/2, height/2, x+((3*width)/4), y+(height/2), Color.CYAN, drawing, level+1);

            drawTriangleFractal(width/2, height/2, x+height-((3*width)/4), y-height, Color.RED, drawing, level+1);
            //level=level+1;
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas drawing, int level) {
        
       

        if(level<7){
             Rectangle rectangle1 = new Rectangle(x,y,width,height,c);
             //System.out.println(x+" "+y);
            drawing.drawShape(rectangle1);
            drawRectangleFractal(width/2, height/2, x, y, Color.RED, drawing, level+1);
            drawRectangleFractal(width/2, height/2, x+(width/2), y, Color.CYAN, drawing, level+1);
            drawRectangleFractal(width/2, height/2, x, y+(width/2), Color.GREEN, drawing, level+1);

            //Circle circle1= new Circle(x+((3*width)/4), y+((3*width)/4), width/4, Color.YELLOW);
            //drawing.drawShape(circle1);
            //drawRectangleFractal(width/2, height/2, x+(width/2), y+(width/2) , Color.YELLOW, drawing, level+1);

        }

    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){       
        Scanner myScanner=new Scanner(System.in);
        String type = myScanner.nextLine();
        FractalDrawer fracto = new FractalDrawer();
        fracto.drawFractal(type);

    }
}
