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

class boxdemo
{
	public static void main(String args[])
	{
	double vol;
	box b1 = new box();
	b1.width=2;
	b1.height=5;
	b1.depth=10;
	b1.Set Dim();
	vol=b1.volume();
	System.out.print("volume is"+ vol);

	}
}