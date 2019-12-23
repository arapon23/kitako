import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int sum = 0;

    for (int i = 0; i < 3; i++) {

      System.out.print("整数をあと" + (3 - i) + "回 入力してください  ");
      int x = Integer.parseInt( br.readLine() );
      sum += x;
    }
      int avg = sum / 3;
      System.out.println("平均は" + (sum / 3));
  }
}