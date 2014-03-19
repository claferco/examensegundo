
public class examen2ejercicio1 
{
	static int funcrec (int num)
	{
		if (num==0)
		{
			return 0;
		}
		if (num==1)
		{
			return 1;
		}
		return funcrec(num-1)*funcrec(num-2)+num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(funcrec(6));
	}

}

/*Ejercicio 2 Claudio Fernandez 977033*/