//Written by Manan Mrig(MRIG0001)
import java.lang.Math;
import java.awt.Color;

public class Rectangle{
	double x;
	double y;
	double width;
	double height;
	Color color;


	public Rectangle(double x, double y, double width, double height, Color color){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.color=color;
	}
	public double calculatePerimeter(){
		double peri= 2*(width+height);
		return peri;
	}
	public double calculateArea(){
		double area = width*height;
		return area;
	}
	public void setColor(Color newColor){
		color = newColor;
	}
	public void setPos(double x, double y){
		this.x=x;
		this.y=y;
	}
	public void setWidth(double radius){
		this.width=width;
	}
	public void setHeight(double radius){
		this.height=height;
	}
	public Color getColor(){
		return this.color;
	}
	public double getXPos(){
		return this.x;
	}
	public double getYPos(){
		return this.y;
	}
	public double getWidth(){
		return this.width;
	}
	public double getHeight(){
		return this.height;
	}

}