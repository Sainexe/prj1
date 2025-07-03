import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main (String[] args){
        try {
            
            File file1 = new File(args[0]);
            Scanner f1 = new Scanner(file1);
            double x0 = f1.nextDouble();
            double y0 = f1.nextDouble();
            double r = f1.nextDouble();
            f1.close();

            File file2 = new File(args[1]);
            Scanner f2 = new Scanner(file2);
            while (f2.hasNextDouble()) {
                double x = f2.nextDouble();
                double y = f2.nextDouble();
                double distance = Math.sqrt(Math.pow(x-x0,2) + Math.pow(y-y0,2));
                int position;
                
                if (distance<r) {
                    position=1;
                } else if (distance>r) {
                    position=2;
                } else {
                    position=0;
                }
                System.out.println(position);
            }
            f2.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден");
        }
    }
}
