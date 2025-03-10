public class TestaLacosTabuada {
	public static void main(String[] args) {
		
		for(int tabuada = 1; tabuada <= 10; tabuada++) {
			for(int contador = 0; contador <=10; contador++) {
				int multiplicador = tabuada * contador;
				System.out.print(tabuada + " x " + contador + " = " + multiplicador);
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}
}