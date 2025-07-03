import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scan.nextInt();
        System.out.print("Введите длину интервала: ");
        int m = scan.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=i+1;
        }
        int end=0;
        do{ 
            System.out.print(arr[end]);
            end=(end+m-1)%n;
        } while(end!=0);
        scan.close();        
    }
}