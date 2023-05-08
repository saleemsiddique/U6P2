import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Que numero quieres?");
        n = validaInt();
        StringBuilder numS = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            numS.append(i);
        }
        BigInteger num = BigInteger.valueOf(Long.parseLong(numS.toString()));
        BigInteger numMod = BigInteger.valueOf(3);
        System.out.println(numS);
        if (num.mod(numMod).equals(BigInteger.ZERO)){
            System.out.println("Si es divisible por 3");
        } else {
            System.out.println("No es divisible por 3");
        }
    }


    public static int validaInt(){
        int n = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String numS = br.readLine();
            n = Integer.parseInt(numS);
            return n;
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return n;
        }
    }
}
