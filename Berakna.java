import java.util.Scanner;

public class Berakna {

/************************************************* 
* Username: nickro-3   						 *
* Author: Niclas Kroon, nickro-3@student.ltu.se  *
* Date: 2013-04-18 								 *
*************************************************/

public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	while(true) {
	System.out.println("BERAKNINGAR 2013\n\nVilken metod vill du köra?\n1. Klotet's volym\n2. Cylindern's volym\n3. Bråktal\n4. Summering\n5. Räta linjens ekvation\n6. Räta linjen del 2\n7. Avsluta programmet.");

	int val = in.nextInt();

	switch (val) {
		
		case 1: 
		System.out.println("Klotet's volym");
		System.out.print("Ange radie: ");
		double radie = in.nextDouble();
		double resultat = computeSphereVolume(radie);
		System.out.println("Volymen är: " + resultat);
		break;
		
		
		case 2: 
		System.out.println("Cylindern's volym");
		System.out.print("Ange radie: ");
		double radie2 = in.nextDouble();
		System.out.println("Ange höjd: ");
		double height = in.nextDouble();
		resultat = computeCylinderVolume(radie2, height);
		System.out.println("Resultatet: " + resultat);
		break;
		
		
		case 3:
		System.out.println("Bråktal");
		System.out.println("Ange en täljare: ");
		int taljare = in.nextInt();
		System.out.print("Ange en nämnare: ");
		int namnare = in.nextInt();
		String res3 = fraction(taljare, namnare);
		System.out.println(res3);
		break; 
		
		
		case 4: 
		System.out.println("Summering");
		System.out.print("Ange ett tal: ");
		int tal2 = in.nextInt();
		resultat = sum(tal2);
		System.out.print("Summan blev: " + resultat);
		break;
		
		
		case 5:
		System.out.println("Räta linjens ekvation");
		System.out.print("Ange värdet för x: ");
		int x = in.nextInt();
		System.out.print("Ange värdet för k: ");
		int k = in.nextInt();
		System.out.print("Ange värdet för m: ");
		int m = in.nextInt();
		printPoint(x,k,m);
		break;
		
		
		case 6:
		System.out.println("Räta linjen del 2");
		System.out.print("Ange värdet för n: ");
		int n = in.nextInt();
		System.out.print("Ange värdet för k: ");
		int k1 = in.nextInt();
		System.out.print("Ange värdet för m: ");
		int m1 = in.nextInt();
		
		printLine(n,k1,m1);
		break;
		
		case 7:
		
		if (val == 7)
			System.out.println("Avslutar programmet.");
			in.close();
			System.exit(0);
		break;
	}
	}
}

	//ber?kna punkterna f?r y/x
	
public static int calcPoint(int x, int k, int m) {
	
	int y = k * x + m;
	return y;
	
}

public static void printPoint(int x, int k, int m) {
	
	int y = calcPoint(x,k,m);
	System.out.println("\nSvaret: y(" + x + ") = " + y);
	
}

public static int[] calcLine(int n, int k, int m) {
	
	int[] anArray = new int[n]; 																						
	
	if (n != 0) {
		
		int x = 1;
		for(;x <= n;x++)
			anArray[x-1] = calcPoint(x,k,m); 	
		
	}
	return anArray;														
}

public static void printLine(int n, int k, int m) {
	
	
	int[] answer = calcLine(n,k,m);
	System.out.println("---RESULTAT----------");
	
	for (int i = 1; i <= answer.length; i++) {
		System.out.println("y(" + i + ") = " + answer[i-1]);
	}
	System.out.println("---------------------");
}

public static String fraction(int taljare, int namnare) {
	
	int kvot = (taljare / namnare);
	int rest = taljare % namnare;
	
	String utanrest = kvot +"";
	String medrest = kvot + " " + rest + "/" + namnare;
	
	if (rest != 0)
		return medrest;
	else
		return utanrest;
}

public static int sum(int talet) {

	
	int summa = 0;
	for(int i = 1;i <= talet;i++) {
		summa = summa + i;
		// felsökning System.out.println("Svar: " + summa);
	}
	return summa;	
	
}

public static double computeSphereVolume(double radius) {

	double pi = 3.14;
	double volume = (4*pi*radius*radius*radius) / 3;
	return volume; 
}

public static double computeCylinderVolume(double radius, double height) {

	double pi = 3.14;
	double volume = pi * radius * radius * height;
	return volume; 

}


}
