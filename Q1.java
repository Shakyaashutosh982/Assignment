import java.util.*;

public class Q1 {
    public static void main(String[] args) {

      System.out.println("Give the size of List : ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println("Give the number of List : ");

        List<Integer> list = new ArrayList<>();

        Set<Integer> set =new HashSet<>();

        for(int i=0;i<n;i++)
        {
            int inputNum=scanner.nextInt();
            list.add(inputNum);
            set.add(list.get(i));

        }

        System.out.println("Occurance of each number : ");

        for(Integer num: set)
        {
            System.out.println(num+" -> "+Collections.frequency(list,num));
        }


    }
}