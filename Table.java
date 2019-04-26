import java.util.Scanner;
class Table{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Table no");
		int x=s.nextInt();
		System.out.println("Enter the starting point");
		int a=s.nextInt();
		System.out.println("Enter the ending point");
		int b=s.nextInt();
		for(int i=a;i<=b;i++)
		{
			System.out.println(x+"*"+i+"="+x*i);
		}
		
	}
}