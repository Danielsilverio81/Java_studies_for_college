package Inheritanceexample;

public class Pessoa {
	String sexo;
	String corPele;
	int peso;
	
	// Create Method 1
	public void comer()
	{
		System.out.println("Estou com fome");
	}
	// Create Method 2 
		public void sono()
		{
			System.out.println("Estou com sono");
		}
	// Create Method 2 
		public void estudar()
		{
			System.out.println("O/a estudante vai estudar");
		}
	// Example private method this cannot be inherited
		private void correr()
		{
			System.out.println("Necessário correr para exercita!!");
		}
}

