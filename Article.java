package tp6;

public class Article extends document{
	private String auteur;
	public Article(String titre, int id,int nbPages,String auteur)
	{
		super(titre,id,nbPages);
		this.auteur=auteur;
	}
	
	public void edition()
	{
		System.out.println("le titre de Article est :"+super.getTitre()+" son id est :"+super.getId()+"et le nombre de pages est :"+super.getNbPages()+"l'auteur est : "+this.auteur);
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		
		this.auteur = auteur;
	}
	
	
	

}
