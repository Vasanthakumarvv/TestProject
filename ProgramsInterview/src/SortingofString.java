import java.util.Arrays;

public class SortingofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"Tamil","English","Maths","Science","Tamil"}; 
		String temp;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i].compareTo(a[j])>0)
				{
					temp = a[i];
					a[i]=a[j];
					a[j] =temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int val[] = {3,6,2,5,21,7,1,3,2,1}; 
		
		
		for(int i=0;i<val.length;i++)
		{
			
			for(int j=i+1;j<val.length;j++)
			{
				
				if(val[i]>val[j])
				{
					int tempint = val[i];
					val[i]=val[j];
					val[j] =tempint;
				}
			}
		}

		System.out.println(Arrays.toString(val));
		int b=0;
		val[b]=val[0];
		for(int i=0;i<val.length;i++)
		{
			if(val[b]!=val[i])
			{
			   b++;
			   val[b]=val[i];
		    }
		}
		
		for(int i=0;i<b;i++)
		{
			System.out.println(val[i]+"\t");
		}
	}

}
