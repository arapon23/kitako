import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("xを入力してください  ");
    int x = Integer.parseInt( br.readLine() );

    System.out.print("yを入力してください  ");
    int y = Integer.parseInt( br.readLine() );

    System.out.println(Math.max(x, y));
  }
}