class Work
{
	public void pak(int n, char c)
	{
		System.out.println("Integer:"  +n);
		System.out.println("Character:"+c);
	}
	public void pak(cahr c,int n)
	{
		System.out.println("Character:" +c);
		System.out.println("Integer:" +n);
	}
}
class Usework
{
	public static void main(String[] args) 
	{
		Work work=new Work();
		work.pak(3, 'r');
		work.pak('s',7);
		
	}
}