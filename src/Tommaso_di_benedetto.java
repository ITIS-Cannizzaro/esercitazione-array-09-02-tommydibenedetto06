import java.util.Scanner;
public class Tommaso_di_benedetto
{
	static Scanner in = new Scanner(System.in);

	public static void main (String[] args)
	{
		System.out.println("primo esercizio");
		System.out.println("inserire la quantità degli indici del primo array:");
		int k = Integer.parseInt(in.nextLine());
		int [] primo = new int [k];

		for (int i = 0; i < primo.length; i++)
		{			
			System.out.println("inserire un numero:");
			primo[i] = Integer.parseInt(in.nextLine());
		}

		System.out.println("inserire la quantità degli indici del secondo array:");
		int n = Integer.parseInt(in.nextLine());
		int [] secondo = new int [n];

		for (int i = 0; i < primo.length; i++)
		{			
			System.out.println("inserire un numero:");
			secondo[i] = Integer.parseInt(in.nextLine());
		}

		int numero_indici_3 = primo.length + secondo.length;
		int [] terzo = new int [numero_indici_3];

		for (int j = 0; j < primo.length; j++)
		{
			terzo [j] = primo [j];
		}

		for (int a = 0; a < secondo.length ; a++)
		{
			terzo [a + primo.length] = secondo [a];
		}

		for (int i =0; i < terzo.length-1; i++)
		{
			for (int j = 0; j < terzo.length-1; j++)
			{
				if (terzo[j] > terzo[j+1])
					swap(terzo, j,j+1);
			}
		}
		System.out.println("la stringa invertita:");
		for (int j = 0; j < terzo.length; j++)
		{
			System.out.print("|" + terzo [j]);
		}
		System.out.println();
		SecondoArray ();
	}
	public static void swap (int [] terzo, int a, int b)
	{
		int variabile = terzo [a];
		terzo [a] = terzo [b];
		terzo [b] = variabile;
	}
	public static void SecondoArray ()
	{
		int m = 0;
		System.out.println("secondo esercizio");
		System.out.println("inserire la quantità degli indici del array:");
		int n = Integer.parseInt(in.nextLine());
		int [] random = new int [n];
		for (int i = 0; i < random.length; i++)		
			random[i] = (int) (Math.random()*20)-10;
		
		int k = 0;
		for (int i = 0; i < random.length; i++)
			if (random[i] >= 0)
				k++;

		int [] selezionati = new int [k];
		int j = 0;
		for (int i = 0; i < random.length; i++)
			if (random[i] >= 0)
			{
				selezionati [j] = random[i];
				j += 1;
			}
		
		System.out.println("i numeri maggiori o uguali a zero sono:");
		for (int i = 0; i < selezionati.length; i++)
		{
			System.out.print("|" + selezionati [i]);
		}
	}
}