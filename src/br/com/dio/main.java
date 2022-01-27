package br.com.dio;

public class main {

	public static void main(String[] args) {
		
		Calc.soma(10, 20);
		Calc.subt(20, 10);
		Calc.mult(10, 20);
		Calc.div(20, 10);
		Mensagem.saudacao(9);
		Mensagem.saudacao(15);
		Mensagem.saudacao(22);
		Mensagem.saudacao(25);
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
	}

}
