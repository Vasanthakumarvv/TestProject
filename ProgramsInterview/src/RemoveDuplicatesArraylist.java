import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"Tamil","English","Tamil","English"};
		
		List<String> arrlist = new ArrayList<String>(Arrays.asList(a));
		Set<String> set = new HashSet<String>();
		set.addAll(arrlist);
		System.out.println("Set " +set);
		for(int i=0;i<arrlist.size();i++)
		{
			String str = arrlist.get(i);
			for(int j=i+1;j<arrlist.size();j++)
			{
				String str1 = arrlist.get(j);
				if(str.equalsIgnoreCase(str1))
				{
					arrlist.remove(j);
				}
			}
			
		}
		
		System.out.println(arrlist);

	}

}
