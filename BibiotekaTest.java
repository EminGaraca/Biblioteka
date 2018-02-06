import java.util.ArrayList;
import java.util.Scanner;

public class BibiotekaTest {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		Scanner unos1=new Scanner(System.in);
		int odabir;
		System.out.println("Izaberite jednu od usluga ?");	
		System.out.println("1. Kreiranje raèuna ");
		System.out.println("2. Kreiranje knjiga");
		System.out.println("3. Izlaz iz programa");
		odabir=unos.nextInt();
		Biblioteka biblioteka1=new Biblioteka();
		
		
		while (odabir!=3) {
			if (odabir==1) {
				System.out.println("Unesite ime: ");
				String ime = unos.next();

				System.out.println("Unesite broj racuna: ");
				int brojRacuna = unos.nextInt();
				System.out.println("Unesite broj knjige: ");

				int brKnjiga = unos.nextInt();

				Korisnik.napraviRacun(brojRacuna,ime,brKnjiga,biblioteka1.getBazaKorisnika());
				System.out.println("Izaberite jednu od usluga ?");	
				System.out.println("1. Kreiranje raèuna ");
				System.out.println("2. Kreiranje knjiga");
				System.out.println("3. Izlaz iz programa");
				odabir=unos.nextInt();

			}
			if (odabir==2) {
				
				System.out.println("Unesite ime knjige:");
				String ime=unos1.nextLine();
				
				System.out.println("Unesite broj knjige:");
				int brojKnjige=unos1.nextInt();
			
				boolean izdato=true;
				Knjiga.dodajKnjigu(brojKnjige, ime, izdato, biblioteka1.getBazaKnjiga());
				
				System.out.println("Izaberite jednu od usluga ?");	
				System.out.println("1. Kreiranje raèuna ");
				System.out.println("2. Kreiranje knjiga");
				System.out.println("3. Izlaz iz programa");
				odabir=unos.nextInt();
					
			}
			
		}
		System.out.println("Navratite opet !");
	
	}
}
	
		
	

		
	


