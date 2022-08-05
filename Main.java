public class Main {

    public static void main(String[] args) {

        //Exercício Calculadora
        System.out.println("Exercício Calculadora :");
        Calculadora.somar(1,5);
        Calculadora.subtrair(50,89);
        Calculadora.divisão(89,89);
        Calculadora.multiplicação(2,8);

        //Exercício Mensagem
        System.out.println("Exercício Mensagem :");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Exercício Empréstimo
        System.out.println("Exercício Empréstimo :");
        Emprestimo.calcular(500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);

    }

}
