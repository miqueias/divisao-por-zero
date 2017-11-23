
public class Numero {
	//atributos
	int num1;
	int num2;
	
	//construtor
	Numero() {
		
	}
	
	int dividir() throws MagoException {
		
		if(num2 == 0) {
			throw new MagoException("Num 2 não pode ser zero");
		}
		
		return num1/num2;
	}

}
