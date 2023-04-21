import java.io.*;
class volume
{
	double depth,height,width;
	double volume()
	{
		return width*height*depth;
	}
}
public class box
{
	public static void main(String args[])
	{
		double vol;
		volume myvolume=new volume();
		myvolume.width=10;
		myvolume.depth=15;
		myvolume.height=20;
		vol=myvolume.volume();
		System.out.println("Volume of the box is : "+vol);
	}
}..