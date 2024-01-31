public class Question2 {

    public void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}
