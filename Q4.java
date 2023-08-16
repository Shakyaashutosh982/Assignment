import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        System.out.println("Give the size of List : ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        System.out.println("Give the number of List : ");

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int inputNum=scanner.nextInt();
            list.add(inputNum);

        }


       for(int i=0;i<n;i++)
       {
           int minIndex=i;

           for(int j=i+1;j<n;j++)
           {
               if(list.get(j)<list.get(minIndex))
               {
                   minIndex=j;
               }
           }
           Collections.swap(list,i,minIndex);

       }

       System.out.println("List after Sorting : ");

       for(Integer num: list)
           System.out.print(num+" ");


    }
}