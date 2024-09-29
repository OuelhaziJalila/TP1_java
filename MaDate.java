package tp1_ex3;

public class MaDate {
	private int jour;
	private int mois;
	private int annee;
	
public MaDate(int jour,int mois,int annee) {
	this.jour=jour;
	this.mois=mois;
	this.annee=annee;
}

public MaDate(int annee) {
	this.jour=28;
	this.mois=9;
	this.annee=annee;
}	
public int getJour(){
	return jour;
}
public int getMois(){
	return mois;
}
public int getAnnee(){
	return annee;
}
public void setJour(int jour) {
    this.mois = mois;
}
public void setMois(int mois) {
    this.mois = mois;
}
public void setAnnee(int annee){
    this.annee = annee;
}
public String toString() {
    return jour + "/" + mois + "/" + annee;
}

public void ajouterUnJour() {
        jour++;
        if (jour > nbJoursParMois()) {
            jour = 1;
            ajouterUnMois();
        }}
public void ajouterPlusieursJours(int n) {
    for (int i = 0; i < n; i++) {
        ajouterUnJour();
    }
}
public void ajouterUnMois() {
	mois++;
    if (mois > 12) {
        mois = 1;
        ajouterUnAn();
    }}
public void ajouterUnAn() {
    annee++;
    }

private int nbJoursParMois() {
    switch (mois) {
        case 1:
        case 4: 
        case 6: 
        case 9:
        case 11:
            return 30;
        case 2:
            return (verif() ? 29 : 28);
        default:
            return 31;
    }
}
private boolean verif() {
    return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
}
}


