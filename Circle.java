//Written by Manan Mrig(MRIG0001)

import java.lang.Math;
import java.awt.Color;


public class Circle{

	double x;
	double y;
	double radius;
	Color color;


	public Circle(double x, double y, double radius, Color color){
		this.x=x;
		this.y=y;
		this.radius=radius;
		this.color=color;
	}
	public double calculatePerimeter(){
		double peri= 2*Math.PI*radius;
		return peri;
	}
	public double calculateArea(){
		double area = Math.PI*(radius*radius);
		return area;
	}
	public void setColor(Color color){
		this.color=color;
	}
	public void setPos(double x, double y){
		this.x=x;
		this.y=y;
	}
	public void setRadius(double radius){
		this.radius=radius;
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
	public double getRadius(){
		return this.radius;
	}

}
