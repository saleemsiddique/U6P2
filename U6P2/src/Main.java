import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Que numero quieres?");
        n = validaInt();
        StringBuilder numS = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            numS.append(i);
        }
        System.out.println(numS.toString());
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
