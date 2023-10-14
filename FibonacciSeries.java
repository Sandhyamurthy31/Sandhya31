package week1.day2;

public class FibonacciSeries{
public static void main(String[] args) 
{
	int num=8;
	int firstNum =0;
	int secondNum=1;
	int nextNum;
	String fib = "Output: ";
	String separator =","; 
	for (int i = 0; i <num; i++) 
	{
		if (i==num-1)
		{
			separator="";
		}
		fib = fib+" "+firstNum+separator;
		nextNum = firstNum+secondNum; //0+1 =1 2 
		firstNum = secondNum; //1
		secondNum = nextNum; //1
	}
	System.out.println(fib);
}}