/*
* @Author : mthaw
* @Date : Dec. 11, 2020
* @Description : Programme avec des methodes permettant de manipuler des tableaux:
* Pour trouver la somme des elements, pour compter le nombre de chiffres pairs et pour enlever le plus petit element du tableau
*/

import java.util.*;

public class ExercisesTableau {
/**
 * 
 * @param tableau, on veut trouver et afficher sa somme
 */
	static void sommeTableau(int tableau[]) {
		int somme = 0;
		for (int i = 0; i < tableau.length; i++) {
			somme += tableau[i];//Pour chaque element dans tableau, augmenter somme par ce valeur
		}
		System.out.println(somme);//Afficher la somme
	}
	
/**
 * 
 * @param tableau, on veut trouver combien il y a de nombres pairs dans tableau
 */

	static void compterPairs(int tableau[]) {
		int compteur = 0;
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] % 2 == 0) {//Pour chaque element pair dans tableau
				compteur++;//incrementer le compteur par 1
			}
		}
		System.out.println(compteur);//Afficher le nombre d'elements pairs dans tableau
	}
	
	/**
	 * 
	 * @param tableau, le tableau original
	 * @return un nouveau tableau qui est tableau, mais avec le plus petit element enleve, et tous les elements a droite déplacés vers la gauche pour remplir l'espace de l'élément enleve
	 */
	static int[] enleverPlusPetit(int tableau[]) {
		int tableauResultat[] = new int[tableau.length];
		int positionPlusPetit = MethodesTableaux.plusPetitIndex(tableau);//Trouver l'index du plus petit valeur
		
		for(int i = 0; i < tableau.length-1; i++) {
			if(i < positionPlusPetit) {//Si l'element se trouve a gauche de l'element le plus petit
				tableauResultat[i] = tableau[i];//le recopier directement
			}else {//Sinon
				tableauResultat[i] = tableau[i+1];//Placer l'element a droite
			}
		}
		tableauResultat[tableauResultat.length-1] = tableau[tableau.length-1];//Mettre le dernier element qui se retrouve en double
		return tableauResultat;//Retourner le tableau resultat
	}

	public static void main(String[] args) {
		//Creer un tableau rempli d'entiers au hazard dans l'intervale [0,1000]
		int[] monTableau = new int[10];
		for (int i = 0; i < monTableau.length; i++) {
			monTableau[i] = (int) (Math.random() * 1000);
		}
		//Appeler les methodes / afficher le resultat
		sommeTableau(monTableau);
		compterPairs(monTableau);
		int[] sansPlusPetit = enleverPlusPetit(monTableau);
		for(int i = 0; i < sansPlusPetit.length; i++) {
			System.out.print(sansPlusPetit[i]+" ");
		}
	}
}
