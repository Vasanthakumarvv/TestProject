
public class NoofoccuranceUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"Tamil","English","Tamil","English"};
		String temp ="";
		int cnt=1;
		for(int i=0;i<a.length;i++)
		{
			String str = a[i];
			for(int j=i+1;j<a.length;j++)
			{
				String str1 = a[j];
				if(str.equalsIgnoreCase(str1))
				{
					if(str1.equalsIgnoreCase("Tamil"))
					{
						cnt++;
						break;
					}
					
				}
			}
			
		}
		
		System.out.println(cnt);

	}

}
