class Circle
{
	double radius;
	double area;
	void findarea()
	{
	area=3.14*radius*radius;
	}
	void displayarea()
	{
	System.out.print("display area"+ area);
	}
}

class Circledemo
{
	public static void main(String args[])
	{
	Circle c= new Circle();
	c.radius=2;
	c.findarea();
	c.displayarea();
	}
}