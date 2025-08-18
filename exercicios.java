public class exercicios{
    public static void main(String[]args){
      System.out.println("Fatorial de 3: " + fatorial(3));
        System.out.println("Somatório de 3: " + somatorio(3));
        System.out.println("Somatório de -3: " + somatorio(-3));
        System.out.println("Fibonacci de 3: " + fibonacci(3));
        System.out.println("Soma entre  3 e 5: " + somaEntre(3,5));
        System.out.println("subinoonibus é palindromo? "+ isPal("subinoonibus"));
    }
    public static int fatorial(int n){
        if(n<0){
            return 0;
        }
        if(n==0||n==1){
            return 1;
        }else{
            return n * fatorial(n-1);
        }

    }
    public static int somatorio(int n){
        if(n==0){
            return 0;
        }if(n<0){
            return n+somatorio(n+1);
        }else{
            return n+somatorio(n-1);
        }

    }
    public static int fibonacci(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
  }
  public static int somaEntre(int k,int j){
        if(k==j){
            return k;

        }
        if(k<j){
            return k+somaEntre(k+1,j);
        }else{
            return k+somaEntre(k-1,j);
        }
  }
  public static boolean isPal(String s){
    if(s.length() <= 1){
        return true;
    }
    if(s.charAt(0)!=s.charAt(s.length()-1)){
        return false;
    }
    return isPal(s.substring(1,s.length()-1));
  }

// A Multiplicação Inteira de n-bits recebe dois números inteiros x e y de n-bits e retorna o resutado de x * y.

// Assim, novamente:

// implemente o algortimo abaixo;
// teste-o para os 3 casos de valores inteiros: com 4 bits, com 16 bits e com 64 bits. Nestes testes, contabilize o número de iterações que o algoritmo executa, e o tempo gasto.
// O algoritmo está dado abaixo:

// MULTIPLY(x, y, n) 
//    IF (n = 1)
//       RETURN x * y.
//    ELSE
//       m ← ⎡ n / 2 ⎤.
//       a ← ⎣ x / 2^m ⎦; b ← x mod 2^m.
//       c ← ⎣ y / 2^m ⎦; d ← y mod 2^m.
//       e ← MULTIPLY(a, c, m).
//       f ← MULTIPLY(b, d, m).
//       g ← MULTIPLY(b, c, m).
//       h ← MULTIPLY(a, d, m).
//       RETURN 2^(2m)*e + 2^m*(g + h) + f.

public static int multiply(int x, int y,int n) {
    if (n == 1) {
        return x * y;
    } else {
       int m=n/2;
       int a= Math.floorDiv(x, (int)Math.pow(2, m));
       int b=x%(int)Math.pow(2,m);
       int c=Math.floorDiv(y,(int)Math.pow(a, b));
       int d=y%(int)Math.pow(2,m);
       int e=multiply(a, c, m);
       int f=multiply(b, d, m);
       int g=multiply(b, c, m);
       int h=multiply(a, d, m);    
       return (int)(Math.pow(2, 2*m) * e + Math.pow(2, m) * (g + h) + f);
  } 
}