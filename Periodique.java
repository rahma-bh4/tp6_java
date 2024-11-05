package tp6;

public class Periodique extends document {
	private String fr;
	public Periodique(String titre, int id,int nbPages,String fr)
	{
		super(titre,id,nbPages);
		this.fr=fr;
		
	}
	public void edition()
	{
		System.out.println("le titre de periodique est :"+super.getTitre()+" son id est :"+super.getId()+"et le nombre de pages est :"+super.getNbPages()+" la fréquence de parution est :"+fr);
	}
	public String getFr() {
		return fr;
	}
	public void setFr(String fr) {
		this.fr = fr;
	}

}
