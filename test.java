package tp6;

public class test {
   public static void main(String args[])
   {
	   Bibliotheque bib=new Bibliotheque(6);
	   document d=new Article("titre1",10,120,"auteur1");
	   document d2=new Periodique("titre2",14,200,"mensuel");
	   document d3=new Livre("titre3",7,250,"auteur2","editeur1");
	   document d4=new Livre("titre4",8,150,"auteur3","editeur2");
	   document d5=new document("titredoc1",4,10);
	   bib.Ajout_doc(d);
	   bib.Ajout_doc(d2);
	   bib.Ajout_doc(d3);
	   bib.Ajout_doc(d4);
	   bib.Ajout_doc(d5);
	   System.out.println("le tableau après l'ajout ");
	   bib.Inventaire();
	   System.out.println(bib.getNombre_document());
	  Bibliotheque bib_article= bib.liste_article();
	  Bibliotheque bib_doc= bib.liste_docsimple();
	  Bibliotheque bib_livre= bib.liste_livre();
	  Bibliotheque bib_periodique=bib.liste_periodique();
	  System.out.println("les articles ");
	  bib_article.Inventaire();
	  System.out.println("les documents ");
	  bib_doc.Inventaire();
	  System.out.println("les livres ");
	  bib_livre.Inventaire();
	  System.out.println("les periodiques ");
	  bib_periodique.Inventaire();
	  bib.Supprim_doc(14);
	  System.out.println("le tableau apres suppression ");
	  bib.Inventaire();
	  System.out.println(bib.getNombre_document());
   }
}
