class Stud{
	int age;
	String name;
	String address;
	Student()
	{
		age=0;
		name="Jhon";
		adress"I don't Know";
	}
	public void setInfo(int age, String name)
	{
		this.name=name;
		this.age=age;
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("adress:" +adress);
	}
	public void setInfo(int age,String name,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:" +address);
	}
}
class Usestudent
{
	public static void main(String[] args) 
	{
		int i=1;
		Scanner scanf=new Scanner(System.in);
		Student []std1=new Student[10];
		std1[0]=new Student();
		System.out.println("Student1 :"+(i++));
		std1[0].setInfo(20, "Ambedgar Omgar");
		System.out.println();
		System.out.printlm("Student:" +1);
		std1[0].setInfo(84,"Shoukat","Dis: Amanullah Khan");

	}
}