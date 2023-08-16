import java.util.*;

public class Q3 {
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
           int temp=-1;

            for(int j=i+1;j<n;j++)
            {
                if(list.get(i)<list.get(j))
                {
                    temp=list.get(j);
                    break;
                }
            }
            System.out.print(temp+" ");
        }


    }
}