import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        try {
            File file = new File(args[0]);
            Scanner numb = new Scanner(file);
            int[] nums = new int[0];

            while (numb.hasNextInt()) {
                nums = Arrays.copyOf(nums, nums.length + 1);
                nums[nums.length - 1] = numb.nextInt();
            }
            numb.close();
            
            int minSteps = calculateMinSteps(nums);
            System.out.println("Минимальное количество ходов: " + minSteps);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при чтении файла");
        }
    }
    private static int calculateMinSteps(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int step = 0;
        for (int num : nums) {
            step += Math.abs(num - median);
        }
        return step;
    }
}