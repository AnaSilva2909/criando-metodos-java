 public class Emprestimo {
   
    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.30;
    }

    public static double getTaxaTresParcelas(){
        return 0.40;
    }

    public static void calcular(double valor, int parcelas) {
        if(parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final de empréstimo para duas parcelas é " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final de empréstimo para três parcelas é " + valorFinal);

        }else {
            System.out.println("Valor de parcelas inválidas");
        }
    }
}
