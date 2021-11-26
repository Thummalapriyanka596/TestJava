package Patterns;

import java.util.*;

public class StringsSearch {
	public static void main(String args[]) {
		List<String> datalist = new LinkedList<String>();
		List<String> inputlist = new LinkedList<String>();
		
		Map<String,List> output = new HashMap<String,List>();
		datalist.addAll(Arrays.asList("priya", "priyanka", "siri", "sireesha","somi", "somi", "sowmya", "kknc", "bala","balakrishna"));
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//System.out.println("n" + n);
		int i = 0;
		//System.out.println("i" + i);
		for (i = 0; i < n; i++) {
			//System.out.println("i" + i);
			String data = s.next();
			//System.out.println(data);
			inputlist.add(data);
		}
		for(i=0;i<n;i++)
		{
			List<String> matchinglist = new LinkedList<String>();
			for(int j=0;j<datalist.size();j++)
			{                                      
			if(datalist.get(j).contains(inputlist.get(i)))
					{
				
				matchinglist.add(datalist.get(j));
					}
			}
			output.put(inputlist.get(i),matchinglist);
		}
		for(Map.Entry<String, List> map:output.entrySet())
		{
			System.out.println("names matched with "+map.getKey()+" are "+map.getValue());
			
			
		}
	}
}

/*package Patterns;

import java.util.*;

public class StringsSearch {
	public static void main(String args[]) {
		List<String> l = new LinkedList<String>();
		List<String> l1 = new LinkedList<String>();
		
		Map<String,List> m = new HashMap<String,List>();
		l.addAll(Arrays.asList("priya", "priyanka", "siri", "sireesha","somi", "somi", "sowmya", "kknc", "bala","balakrishna"));
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//System.out.println("n" + n);
		int i = 0;
		//System.out.println("i" + i);
		for (i = 0; i < n; i++) {
			//System.out.println("i" + i);
			String data = s.next();
			//System.out.println(data);
			l1.add(data);
		}
		for(i=0;i<n;i++)
		{
			List<String> l2 = new LinkedList<String>();
			for(int j=0;j<l.size();j++)
			{                                      
			if(l.get(j).contains(l1.get(i)))
					{
				
				l2.add(l.get(j));
					}
			}
			m.put(l1.get(i),l2);
		}
		for(Map.Entry<String, List> map:m.entrySet())
		{
			System.out.println("names matched with "+map.getKey()+" are "+map.getValue());
			
			
		}
	}
}
*/