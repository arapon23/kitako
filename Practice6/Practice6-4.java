class Main {
  public static void main(String[] args) {
    DrawTriangle(5, '正');
  }

  static void DrawTriangle(int size, char c) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j <= i; j++)
        System.out.print(c);

      System.out.println();
    }
  }
}