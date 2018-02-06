import java.util.ArrayList;

public class Korisnik {
     
	private int brojRacuna;
	private int brojKnjiga;
	private String imePrezimeKorisnika;
	private ArrayList<Knjiga> listaKnjiga;
	
	public Korisnik ( int brRacuna,int brKnjiga , String imeprezimekorisnika) {
		this.brojRacuna=brRacuna;
		this.brojKnjiga=brKnjiga;
		this.imePrezimeKorisnika=imeprezimekorisnika;
	}
	public int getBrojRacuna() {
		return brojRacuna;
	}
	
	public void setBrojRacuna (int brRacuna) {
		this.brojRacuna=brRacuna;
	}
	public int getBrojKnjiga() {
		return brojKnjiga;
	}
	public void setBrojKnjiga(int brojKnjiga) {
		this.brojKnjiga = brojKnjiga;
	}
	public String getImeKorisnika() {
		return imePrezimeKorisnika;
	}
	public void setImeKorisnika(String imeKorisnika) {
		this.imePrezimeKorisnika = imeKorisnika;
	}
	public ArrayList<Knjiga> getListaknjiga() {
		return listaKnjiga;
	}

	public void setListaknjiga(ArrayList<Knjiga> listaknjiga) {
		this.listaKnjiga = listaknjiga;
	}
	
	

	public static boolean napraviRacun(int brRacuna, String imePrezime, int brKnjiga,ArrayList<Korisnik> bazaKorisnika) {
		if (provjera(brRacuna,bazaKorisnika,brKnjiga)) {
			Korisnik korisnik=new Korisnik(brRacuna,brKnjiga,imePrezime);
			System.out.println("Unijeli ste " + imePrezime + " korisnika !");
			bazaKorisnika.add(korisnik);
			return true;
		}
		else {
			System.out.println("Neuspješna registracija. Pokušajte ponovo !");
			return false;
		}
		
	}
	private static boolean  provjera(int brRacuna, ArrayList<Korisnik> bazaKorisnika, int brKnjiga) {
		if (ProvjeraRacuna(brRacuna, bazaKorisnika)) {
			
			return true ;
		}
		if (brRacuna < 0 || brKnjiga == 0) {
			 return false ;
		}
		return true;
	}
	private static boolean ProvjeraRacuna(int brRacuna, ArrayList<Korisnik> bazaKorisnika) {
		for (Korisnik korisnik:bazaKorisnika) {
			if(brRacuna==korisnik.getBrojRacuna())  {
				return true;
			}
			
			}
		return false;
		}
		
	}
