import java.util.*;

public class Q7 {

    public static void main(String[] args)
    {
        System.out.println("Give the size of List and value of K : ");
        Scanner scanner = new Scanner(System.in);

        int size=scanner.nextInt();
        int k=scanner.nextInt();

        System.out.println("Give the Element in the List : ");

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<size;i++)
        {
            int element=scanner.nextInt();

            if(map.containsKey(element)==true)
            {
                int freq=map.get(element);
                freq++;
                map.put(element,freq);

            }
            else
            {
                map.put(element,1);
            }

        }

        //System.out.println(map);

        List<Integer> ans = new ArrayList<Integer>();

        for(int i=0;i<k;i++)
        {
            int freq=0;
            int max=0;

            for(Map.Entry<Integer,Integer> mp:map.entrySet())
            {
                if(mp.getValue()>freq)
                {
                    freq= mp.getValue();
                    max=mp.getKey();
                }
            }

            map.put(max,0);
            ans.add(max);
        }


        for(Integer list: ans) {

            System.out.println(list+" ");

        }



    }
}
