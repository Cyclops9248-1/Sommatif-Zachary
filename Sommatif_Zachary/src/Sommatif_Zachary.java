/*
 * Auteur: Zachary Xie
 * Date: Décembre 16 2020
 * Description: Cette programe génére par hazard 20 nombres dans un tableau
 * et dans une méthode, on calcule la moyenne des nombres impaires dans le tableau.
 * 
 */

public class Sommatif_Zachary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclare une nouvelle tableau
		int[] tableau = new int[20];
		
		// Pour chaque valeur du tableau...
		for(int i = 0; i < 20; i++) {
			//On le donne un valeur par hazard, de 0 à 20
			tableau[i] = (int) (Math.random() * 21); //21 au lieu de 20 car le Math.random donne un nombre toujours inférieure à 1 
		}
		
		// Imprime la moyenne des nombres impaires du tableau en nombre entier
		System.out.println(moyenneImpairs(tableau, true));
		
		// La même méthode, mais retourne le vrai moyenne en nombre non entier
		System.out.println(moyenneImpairs(tableau, false));

	}
	
	// Méthode pour déterminer la moyenne; un input pour le tableau, un input pour configurer si on veut un nombre entier
	public static double moyenneImpairs(int[] tableau, boolean nombreEntier) {
		
		// Variables temporaires
		int somme = 0; // Somme des nombres impaires
		int nombreImpairs = 0; // Nombre de nombres impaires
		
		// Pour chaque valeur du tableau...
		for(int i : tableau) {
			// Si on divise la valeur par deux et il reste 1...
			if(i % 2 == 1) {
				// On ajoute la valeur au somme et on ajoute 1 au nombres impaires
				somme += i;
				nombreImpairs++;
			}
		}
		
		//Si il y a au moins un nombre impair dans le tableau...
		if(nombreImpairs != 0) {
			// Si on configure la méthode pour donner un nombre entier on divise les nombres comme un int
			if(nombreEntier) return somme / nombreImpairs;
			// Sinon, on caste une des variables comme un double pour reçevoir un nombre non entier 
			else return (double) somme / nombreImpairs;
		}
		else {
			// Si il n'y avait pas de nombres impaires on retourne 0, car on ne peut pas diviser par 0
			System.out.println("Pas de nombres impaires");
			return 0;
		}
	}

}
