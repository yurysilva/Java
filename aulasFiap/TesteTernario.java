public class TesteTernario {
  public static void main(String[] args) {
    int horasGerais = 9;
    int horasExtras = horasGerais % 8;
    int horaTotal = (horasGerais > 8) ? horasExtras : horasGerais;
    //int a = 1;
    //b = 2;
    //int b = (a > 0) ? 1 : 2;
    System.out.println(horaTotal);
  }
}
