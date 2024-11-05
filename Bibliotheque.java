package tp6;

public class Bibliotheque {
  private document tab[];
  private int nbD;
  private int cap;
  public Bibliotheque(int cap)
  {
	  this.cap=cap;
	  tab=new document[this.cap];
	  
  }
  public int getCapacite()
  {
	  return cap;
  }
  
  public void Ajout_doc(document d)
  {
	  if(nbD==cap)
	  {
		  System.out.println("vous avez atteinné la capacité maximale");
		  
	  }
	  else {
		  tab[nbD]=d;
		  nbD++;
	  }
  }
  public void Supprim_doc(int num)
  {
	  int i=0;
	  while(i<nbD && tab[i].getId()!=num)
	  {
		  i++;
	  }
	  if(i==nbD)
	  {
		  System.out.println("le document n'existe pas ");
		  
	  }
	  else {
		  for(int j=i;j<nbD;j++)
		  {
			  tab[j]=tab[j+1];
		  }
		  nbD--;
	  }
  }
  public void Inventaire()
  {
	  for(int i=0;i<nbD;i++)
	  {
		  if(tab[i] instanceof Article)
		  {
			  
			  tab[i].edition();
		  }
		  else {
			  if(tab[i] instanceof Livre)
			  {
				 
				  tab[i].edition();
			  }
			  else {
				  if(tab[i] instanceof Periodique)
				  {
					
					  tab[i].edition();}
				  else {
					     
					     tab[i].edition();
					  }
				  }
				  
			  }
		  }
	  }
  public int getNombre_document()
  {
    return nbD;
  }
  public Bibliotheque liste_livre()
  {
	  Bibliotheque bib=new Bibliotheque(cap);
	  for(int i=0;i<nbD;i++)
	  {
		  if(tab[i] instanceof Livre)
		  {
			  bib.Ajout_doc(tab[i]);
		  }
	  }
	  return bib;
  }
  public Bibliotheque liste_article()
  {
	  Bibliotheque bib=new Bibliotheque(cap);
	  for(int i=0;i<nbD;i++)
	  {
		  if(tab[i] instanceof Article)
		  {
			  bib.Ajout_doc(tab[i]);
		  }
	  }
	  return bib;
  }
  public Bibliotheque liste_docsimple()
  {
	  Bibliotheque bib=new Bibliotheque(cap);
	  for(int i=0;i<nbD;i++)
	  {
		  if(tab[i] instanceof document)
		  {
			  bib.Ajout_doc(tab[i]);
		  }
	  }
	  return bib;
  }
  public Bibliotheque liste_periodique()
  {
	  Bibliotheque bib=new Bibliotheque(cap);
	  for(int i=0;i<nbD;i++)
	  {
		  if(tab[i] instanceof Periodique)
		  {
			  bib.Ajout_doc(tab[i]);
		  }
	  }
	  return bib;
  }
  }
  
  

