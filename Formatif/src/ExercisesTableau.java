import java.util.*;

public class ExercisesTableau {

	static void sommeTableau(int tableau[]) {
		int somme = 0;
		for (int i = 0; i < tableau.length; i++) {
			somme += tableau[i];
		}
		System.out.println(somme);
	}

	static void compterPairs(int tableau[]) {
		int compteur = 0;
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] % 2 == 0) {
				compteur++;
			}
		}
		System.out.println(compteur);
	}

	public static void main(String[] args) {
		int[] monTableau = new int[10];
		for (int i = 0; i < monTableau.length; i++) {
			monTableau[i] = (int) (Math.random() * 1000);
		}
		sommeTableau(monTableau);
	}
}
