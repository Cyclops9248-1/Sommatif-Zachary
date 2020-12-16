
public class Erreurs {
	
	// On a besoin de static dans la m�thode main
	//public void main(String[] args)
	public static void main(String[] args) {
		
		System.out.println(saluerAmi("John"));
		
//		public String saluerAmi(String a) {
//			String message="Bonjour mon ami" + a;
//			return message;
//		}
		
	}
	
	// Les m�thodes doivent �tre d�clar�s dehors 
	// du m�thode main.
	
	// De plus, ce m�thode doit �tre static pour qu'on peut
	// l'appeler dans la m�thode main
	//public String saluerAmi(String a)
	public static String saluerAmi(String a) {
		// Pas un erreur majeure, mais c'est plus bon de mettre un espace
		// entre le message et le nom
		//String message="Bonjour mon ami" + a;
		String message="Bonjour mon ami " + a;
		return message;
	}
}
