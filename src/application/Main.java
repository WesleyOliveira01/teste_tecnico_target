public class Main {

  public static void main(String[] args) {
    // Testes das questões 2 e 5
    Integer numero = 21, numero1 = 37;
    String palavra = "qualquer coisa";
    String palavraInvertida = reverteString(palavra);
    estaNaSequencia(numero);
    estaNaSequencia(numero1);
    System.out.println(palavraInvertida);
  }
  // Resolução da questão 2) 
  public static void estaNaSequencia(Integer num) {
    Integer a = 0, b = 1;
    while (b <= num) {
      if (b == num) {
        System.out.printf("%d pertence à sequência de Fibonacci.\n", num);
        return;
      }
      int c = a + b;
      a = b;
      b = c;
    }
    System.out.printf("%d não pertence à sequência de Fibonacci.\n", num);
    return;
  }
  // Resolução da questão 5)
  public static String reverteString(String palavra) {
    char[] caracteres = palavra.toCharArray();
    int inicio = 0;
    int fim = caracteres.length - 1;

    while (inicio < fim) {
      char temp = caracteres[inicio];
      caracteres[inicio] = caracteres[fim];
      caracteres[fim] = temp;
      inicio++;
      fim--;
    }

    return new String(caracteres);
  }
}
