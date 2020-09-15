package desafio2;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new  Funcionario();
		
		funcionario.setNome("Uncle Bob ");
		funcionario.setRg("123.456.456-89");
		
		funcionario.setSalario_inicial(1000.00);
		funcionario.setPercetual(1.5);
		
		double salarioInicial = funcionario.getSalario_inicial();
		double perc = funcionario.getPercetual() / 100;	
		
		
		funcionario.setSalario_total(salarioInicial * perc + salarioInicial);

		funcionario.setPercetual(3);
		
		double perc2 = funcionario.getPercetual() / 100;	
		
		funcionario.setSalario_total(funcionario.getSalario_total() * perc2 + funcionario.getSalario_total());

		System.out.println(funcionario.getNome() +" RG :  " + funcionario.getRg()  + ",salario  R$ " + funcionario.getSalario_total());

	}

}
