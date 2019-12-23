import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // int n = br.readLine(); // 1行分の文字列を入力する（整数型に変換が必要）
    int n = Integer.parseInt( br.readLine() );
    System.out.println(n);
  }
}