package tp6;

public class Livre extends Article {
  private String nomEd;
  public Livre(String titre, int id,int nbPages,String auteur,String nomEd)
  {
	  super(titre,id,nbPages,auteur);
	  this.nomEd=nomEd;
  }
  public void edition()
  {
	  System.out.println("le titre de livre est :"+super.getTitre()+" son id est :"+super.getId()+" et le nombre de pages est :"+super.getNbPages()+" l'auteur est : "+super.getAuteur()+" le nom d'editeur est : "+this.nomEd);
	  
  }
public String getNomEd() {
	return nomEd;
}
public void setNomEd(String nomEd) {
	this.nomEd = nomEd;
}
  
}
