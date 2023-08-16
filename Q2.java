import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        System.out.println("Give the size of List : ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println("Give the number of List : ");

        Set<Integer> set =new HashSet<>();

        for(int i=0;i<n;i++)
        {
            int inputNum=scanner.nextInt();
            set.add(inputNum);
        }

        for(Integer num: set)
        {
            System.out.println(num);
        }


    }
}