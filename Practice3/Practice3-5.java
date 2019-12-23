import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("整数を入力してください  ");
    int x = Integer.parseInt( br.readLine() );

    if (x % 2 == 0) {
      System.out.println("偶数です");
    } else {
      System.out.println("奇数です");
    }
  }
}