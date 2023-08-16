import java.security.Principal;
import java.util.*;

public class Q6 {

    public static void main(String[] args)
    {
        System.out.println("Give size of list containing strings : ");

        Scanner scanner= new Scanner(System.in);

        int size= scanner.nextInt();

        System.out.println("Give the input strings : ");

        List<String> list =new ArrayList<>();

        Map<String,ArrayList<String>> map =new HashMap<>();

        for(int i=0;i<=size;i++)
        {
            String s=scanner.nextLine();
            char temp[]= s.toCharArray();
            Arrays.sort(temp);

            String newString= new String(temp);

            if(map.containsKey(newString)==false)
            {
                map.put(newString,new ArrayList<>());
            }
                map.get(newString).add(s);

        }

        System.out.println(map);




    }

}
