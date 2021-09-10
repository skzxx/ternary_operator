import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    int OperatorInput_user;
    int Variabel_Ternary;
    Scanner Input_Prompt = new Scanner (System.in);
    System.out.print("Masukam digit angka \n");
    OperatorInput_user = Input_Prompt.nextInt();
    System.out.print("Digin yang anda masukan adalah " + OperatorInput_user + "\n");
    Variabel_Ternary = (OperatorInput_user == 10) ? (OperatorInput_user * OperatorInput_user ) : (OperatorInput_user/2);
    System.out.print("Maka hasilnya adalah " + Variabel_Ternary);
    /*
    Jika menggunakan if else:
    
    if(OperatorInput_user == 10) {
    int some_variabel = (OperatorInput_user * OperatorInput_user);
      System.out.print("Maka hasilnya adalah " + some_variabel);
    } else {
      some_variabel2 = (OperatorInput_user/2);
      System.out.print("Maka hasilnya adalah " + some_variabel2);
    }
    
    */
  }
}