import java.util.*;

public class Q5 {

    public static void main(String[] args)
    {
        System.out.println("Give the input string : ");
        Scanner scanner = new Scanner(System.in);

        String string= scanner.nextLine();

        Set<Character> set= new HashSet<>();

        int size=string.length();
        int ans=0;
        int left=0;

        for(int right=0;right<size;right++)
        {

            while(set.add(string.charAt(right))!=true)
            {
                set.remove(string.charAt(left++));

            }

            ans=Math.max(ans,right-left+1);

        }

        System.out.println(ans);


    }
}
