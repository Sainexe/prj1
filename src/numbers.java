public class numbers {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){

            if (i%15==0){
                System.out.println("fifteen");
            }
            else if (i%5==0){
                System.out.println("five");
            }
            else if (i%3==0){
                System.out.println("three");
            }
            else{
                System.out.println(i);
            }
        }
    } 
}
