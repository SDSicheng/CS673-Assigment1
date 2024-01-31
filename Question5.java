import java.math.BigInteger;
public class Question5 {

    public void Fibonacci(int n){
        BigInteger[] Fiblist = new BigInteger[n];
        Fiblist[0] = BigInteger.valueOf(1);;
        Fiblist[1] = BigInteger.valueOf(1);;
        for(int i = 2; i<n ;i++)
            Fiblist[i] = Fiblist[i - 1].add(Fiblist[i - 2]);
        for(int i = 0; i<n ;i++)
            System.out.println("Fibonacci(" + (i + 1) + ") = " + Fiblist[i]);
    }
}
