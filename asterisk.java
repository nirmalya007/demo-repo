interface star
{
	public void printstar();
}
class triangle implements star
{
	public void printstar(int n)
	{
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{	
				System.out.println("*");
			}
			System.out.println(" ");
		}
	}
}
class asterisk
{
	public static void main(String args[])
	{
		int m;
		triangle tri = new triangle();
		m=Integer.parseInt(args[0]);
		tri.printstar(m);
	}
}