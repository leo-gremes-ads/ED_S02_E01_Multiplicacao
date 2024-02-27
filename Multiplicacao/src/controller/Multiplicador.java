package controller;

public class Multiplicador
{
	public Multiplicador()
	{
		super();
	}
	public int multiplicador(int a, int b)
	{		
		if (b == 0)
			return 0;
		if (b < 0)
			return multiplicador(a, b + 1) - a;
		return multiplicador(a, b - 1) + a;
	}
}