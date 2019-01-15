import java.util.*;
class box
{
	double width,w;
	double height,h;
	double depth,d;
	void box demo()
	{
	w=width;
	h=height;
	d=depth;
	}
	double volume()
	{
	return 
	}
}

class boxdemosc
{
	public static void main(String args[])
	{
	double vol;
	Scanner input=new Scanner(System.in);
	box b1 = new box();
	System.out.print("enter the values for box1");
	b1.width=input.Nextint();
	b1.height=input.Nextint();
	b1.depth=input.Nextint();
	b1.Set Dim();
	vol=b1.volume();
	System.out.print("volume is"+ vol);

	}
}