import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()); //입력 크기 입력받음 => 이것이 수행 홧수
        br.close();
        System.out.println(n*n*n);
        System.out.println(3);
    }
}