import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    CoinCase MyCase = new CoinCase();

    for(int i = 0; i < 10; i++) {
      System.out.println("硬貨の種類を入力してください");
      int kind = Integer.parseInt(br.readLine());
      System.out.println("硬貨の枚数を入力してください");
      int count = Integer.parseInt(br.readLine());

      MyCase.AddCoins(kind, count);
    }

    System.out.println("500円が" + MyCase.GetCount(500) + "枚");
    System.out.println("100円が" + MyCase.GetCount(100) + "枚");
    System.out.println("50円が" + MyCase.GetCount(50) + "枚");
    System.out.println("10円が" + MyCase.GetCount(10) + "枚");
    System.out.println("5円が" + MyCase.GetCount(5) + "枚");
    System.out.println("1円が" + MyCase.GetCount(1) + "枚");
    System.out.println("総額は" + MyCase.GetAmount() + "円");
  }

}