import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("中間試験の点数を入力してください  ");
    int score1 = Integer.parseInt(br.readLine());
    System.out.print("期末試験の点数を入力してください  ");
    int score2 = Integer.parseInt(br.readLine());

    if (score1 >= 60 && score2 >= 60) {
      System.out.println("合格");
    } else if (score1 + score2 >= 130) { 
      System.out.println("合格");
    } else if ((score1 + score2 >= 100) && (score1 >= 90 || score2 >= 90)) {
      System.out.println("合格");
    } else {
      System.out.println("不合格");
    }
  }
}