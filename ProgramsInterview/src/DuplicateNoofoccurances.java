import java.util.HashMap;
import java.util.Map;

public class DuplicateNoofoccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "TesTing";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<a.length();i++)
		{
			
			char c =a.charAt(i);
			if(map.containsKey(c))
			{
				int cnt =1;
				map.put(c, ++cnt);
				
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		Integer occurence = map.get('t');
		System.out.println(occurence);
		System.out.println("Count "+map);
		
		for(Map.Entry<Character,Integer> e : map.entrySet())
		{
			
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
