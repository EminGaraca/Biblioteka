import java.util.ArrayList;

public class Biblioteka {

	private ArrayList<Korisnik> bazaKorisnika=new ArrayList<>();
	private ArrayList<Knjiga> bazaKnjiga=new ArrayList<>();
	
	public Biblioteka(ArrayList <Korisnik> bazaKorisnika,ArrayList<Knjiga>bazaKnjiga) {
		this.bazaKorisnika=bazaKorisnika;
		this.bazaKnjiga=bazaKnjiga;
	}
	public Biblioteka() {
		
	}
	public ArrayList<Korisnik> getBazaKorisnika() {
		return bazaKorisnika;
	}
	public void setBazaKorisnika(ArrayList<Korisnik> bazaKorisnika) {
		this.bazaKorisnika= bazaKorisnika;
	}
	public ArrayList<Knjiga> getBazaKnjiga() {
		return bazaKnjiga;
	}
	public void setBazaKnjiga(ArrayList<Knjiga> bazaKnjiga) {
		this.bazaKnjiga= bazaKnjiga;
	}
	
	
	

	
}
