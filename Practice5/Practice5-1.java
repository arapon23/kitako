import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int values[] = new int[3];

    for (int i = 0; i < 3; i++)
      values[i] = Integer.parseInt(br.readLine());

    System.out.println();
    for( int n : values )
    System.out.println( n * 2 );
  }
} 