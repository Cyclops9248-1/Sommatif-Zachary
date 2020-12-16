
public class Erreurs {
	
	// On a besoin de static dans la méthode main
	//public void main(String[] args)
	public static void main(String[] args) {
		
		System.out.println(saluerAmi("John"));
		
//		public String saluerAmi(String a) {
//			String message="Bonjour mon ami" + a;
//			return message;
//		}
		
	}
	
	// Les méthodes doivent être déclarés dehors 
	// du méthode main.
	
	// De plus, ce méthode doit être static pour qu'on peut
	// l'appeler dans la méthode main
	//public String saluerAmi(String a)
	public static String saluerAmi(String a) {
		// Pas un erreur majeure, mais c'est plus bon de mettre un espace
		// entre le message et le nom
		//String message="Bonjour mon ami" + a;
		String message="Bonjour mon ami " + a;
		return message;
	}
}
