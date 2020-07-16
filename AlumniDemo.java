import java.util.*;
import java.io.*;

class Employee{

	String name1;
	int num;

	Employee(String m, int n){
		name1=m;
		num=n;
	}

	void details(){
			System.out.println("name :"+name1+"  " +"phone number : " +num);
		}
	}

 class AlumniDemo{
 	static int sum=0;
	public static void main(String args[])throws Exception{
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to Alumni management System");	
	System.out.println("-------------------------------------------");
	System.out.println("1.Register a society");
	System.out.println("2.Calculate the annual returns");
	System.out.println("3.List of organisation members");
	System.out.print("Enter your choice:");
	int ch=sc.nextInt();

	BufferedWriter output=null;

switch(ch){

case 1:
	File fil = new File("Register.txt");
	fil.createNewFile();


	output=new BufferedWriter(new FileWriter("Register.txt", true));

	
	System.out.println("Enter the name of your society:");
	String namesociety=sc.next();
	

	System.out.println("Enter the name of chairman of the society:");
	String name=sc.next();
	
	System.out.println("Enter the phone number of chairman:");
	int ph=sc.nextInt();
	
		output.write("name of your society:"+namesociety); output.newLine();
		output.write("name of chairman of the society:"+name);  output.newLine();
		output.write("phone number of chairman:"+ph); output.newLine();
		

	output.close();
break;	
	
case 2:
	File fil1 = new File("Annual_returns.txt");
	fil1.createNewFile();
	
	output=new BufferedWriter(new FileWriter("Annual_returns.txt", true));

	System.out.println("Enter the number of events organised:");
	int e=sc.nextInt();
	
	for(int i=0;i<e;i++){
	System.out.println("Enter the funds received in event "+ (i+1) +" in rupees :");
	int fund=sc.nextInt();
	sum+=fund;
	output.write("fund received in event "+ (i+1) +":"+fund);
	output.newLine();
	}
	output.write("Total Annual funds: "+sum+" Rupees");
	output.close();
break;


case 3:
		Employee emp[] = new Employee[10];
		File file = new File("details.txt");
		String name1;
		int i=0;
		int n2;
		Scanner input=new Scanner(file);
		while(input.hasNext()) {
			name1=input.next();
			n2=input.nextInt();
			emp[i]=new Employee(name1,n2);
			emp[i].details();
		}
break;

default :
	System.out.println("Enter a valid option");
break;
		}
	}
	
}