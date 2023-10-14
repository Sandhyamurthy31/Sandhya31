package week1.day2;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,7,6,8};
		Arrays.sort(arr);
        System.out.println("the missing element"+":-");
        for (int i = arr[1]; i <=arr.length-1; i++)
        {
			if(i!=arr[i])
			{
				System.out.println(i);
			break;
		}
	}

}
}
