class box
{
	double width;
	double height;
	double depth;
	box()
	{
	System.out.println("constructing box");
	width = 1;
	height = 1;
	depth = 1;	
	}
	box(double w,double h,double d)
	{
	width = w;
	height = h;
	depth = d;
	}
	box(double len)
	{
		width = height = depth = len;
	}
	double volume ()
	{
	return width*height*depth;
	}
}
class boxdemo7
{
	public static void main(String args[])
	{
	box mybox1 = new box();
	box mybox2 = new box(3,6,9);
	double vol;
	vol =mybox1.volume();
	System.out.println("volume is"+ vol);
	vol =mybox2.volume();
	System.out.println("volume is"+ vol);
	box mycube = new box(7);
	vol = mycube.volume();
	System.out.println("volume of mycube is"+ vol);
	}
}