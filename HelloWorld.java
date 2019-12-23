class Main {
  public static void main(final String[] args) {
      System.out.println("HelloWorld");

      final int[] score = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

      int sum = 0;  // 合計を代入するための変数を用意する（初めの合計は０から始まる）
      
      for (int i = 0; i < score.length; i++) {
        sum += score[i]; // 配列の要素を順番に取り出し、前の合計に対して足していくことを繰り返す
      }
        System.out.println(sum);
  }
}