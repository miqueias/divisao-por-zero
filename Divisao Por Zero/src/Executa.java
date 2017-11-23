public class Executa {
	public static void main(String[] args) {	
		try {//dentro do try fica o codigo a ser testado
			Numero n = new Numero(); //criando o objeto
			n.num1 = 10; //setando valor ao atributo
			n.num2 = 0; //setando valor ao atributo
			
			int resultado; //criando variavel
			resultado = n.dividir(); //chamando o metodo de calculo
			
			System.out.println("O resultado é: " + resultado);
		}catch(ArithmeticException e) { 
			//o catch captura a excessao caso ela aconteça
			System.out.println("Não é possível dividir por zero");
		}catch (MagoException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Obrigado por usar o sistema");
		}
	}
}
