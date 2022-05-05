import java.util.*; 
class Sorting
{
	void insertionSort(int a1[],int n)
	{
		for(int i=n-2;i>=0;i--)
		{
			int temp = a1[i];
			int j = i+1;
			while(temp>a1[j] && j<=n-1)
			{
				a1[j] = a1[j-1];
				j = j-1; 
				//display(a1,n);
			}
			a1[j] = temp;
			System.out.println(" ");
			display(a1,n);
		}
		//display(a1,n);
	}
	
	void display(int a1[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n;
		n = sc.nextInt();
		
		int a1[] = new int[n];
		System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++)
		{
			a1[i] = sc.nextInt();
		}
		
		Sorting s1 = new Sorting();
		
		s1.insertionSort(a1,n);
		//s1.display(a1,n);
		
	}
}