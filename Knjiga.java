import java.util.ArrayList;

public class Knjiga {

	private int serijskiBrojKnjige;
	private String nazivKnjige;
	private boolean statusKnjige;

	
	public Knjiga (int serijskiBroj,String nazivKnjige,boolean statusKnjige) {
		this.serijskiBrojKnjige=serijskiBroj;
		this.nazivKnjige=nazivKnjige;
		this.statusKnjige=statusKnjige;
	}
	public int getSerijskiBrojKnjige() {
		return serijskiBrojKnjige;
		
	}
	public void setserijskiBrojKnjige(int serijskiBrojKnjige) {
		this.serijskiBrojKnjige = serijskiBrojKnjige;
	}
	public String getImeKnjige() {
		return nazivKnjige;
	}
	public void setNazivKnjige(String nazivKnjige) {
		this.nazivKnjige = nazivKnjige;
	}
	public boolean isStatusKnjige() {
		return statusKnjige;
	}
	public void setStatusKnjige(boolean statusKnjige) {
		this.statusKnjige = statusKnjige;
	}

    public static boolean  dodajKnjigu(int brojKnjige,String imeKnjige,boolean izdato,ArrayList<Knjiga>bazaKnjiga) {
    	if (provjeraKnjige(brojKnjige,bazaKnjiga) && brojKnjige>=0) {
    		Knjiga knjiga = new Knjiga(brojKnjige, imeKnjige, izdato);
			bazaKnjiga.add(knjiga);
			System.out.println("Knjiga je  dodata.");
			return true;
    	}
    	else {
    		System.out.println("Neuspješno dodavanje knjige !");
    	}
		return false;
    }
    public static boolean provjeraKnjige(int brojKnjige, ArrayList<Knjiga> bazaKnjiga) {
		for (Knjiga knjiga : bazaKnjiga) {
			if (brojKnjige == knjiga.getSerijskiBrojKnjige()) {
				return false;
			}

		}
		return true;
	}

}
