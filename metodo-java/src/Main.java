public class Main {
    public static void main(String[] args) {

        // Calculadora
        Calculadora.soma(5,5);;
        Calculadora.subtracao(10, 2);
        Calculadora.multiplicacao(30, 4);
        Calculadora.divisao(40, 20);

        // Mensagem Hora
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(3);

        // Empréstimo
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        // Quadrilátero
        Quadrilatero.area(3);
        Quadrilatero.area(5, 5);
        Quadrilatero.area(7, 8, 9);
    }

    
}
