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
}