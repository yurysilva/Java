
public class Aplication {
	public static void main(String[] args) {
		Conta c = new Conta(); //instância do objeto
		
		c.setCliente("Gloria Maria"); //Atribuição de valores
		c.setNumero(1);
		c.setSaldo(00.0);
		
		System.out.println(c.getCliente()); //Consulta de valores
		System.out.println(c.getNumero());
		System.out.println(c.getSaldo());
	}
}
