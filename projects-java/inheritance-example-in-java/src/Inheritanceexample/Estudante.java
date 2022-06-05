package Inheritanceexample;

public class Estudante extends Pessoa {
// creates a class that calls a method of the person class and overrides
	
	@Override
	public void estudar()
	{
		System.out.println("O/a estudante optou pela Faculdade");
	}
}
