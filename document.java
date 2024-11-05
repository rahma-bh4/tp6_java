package tp6;

public class document {
	private String titre;
	private int id;
	private int nbPages;
	public void edition()
	{
		System.out.println("le titre de document est :"+titre+" son id est :"+id+"et le nombre de pages est :"+nbPages);
		
		
	}
	public document(String titre, int id,int nbPages)
	{
		this.titre=titre;
		this.id=id;
		this.nbPages=nbPages;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	
	

}
