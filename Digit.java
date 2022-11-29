import java.util.*;
class Digit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num,count=0;
		System.out.println("Enter number:");
		num=sc.nextInt();
		for(int i=0;i<=9;i++){
			if(num!=0){
				num=num/10;
				count++;
			}
		}
		System.out.println("number of digits are: "+count);
	}
}
		