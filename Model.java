package mojaSatnica;

import javafx.collections.ObservableList;

public class Model {
private double bonusOldValue;	
private int  oldValue;
private String objekat;
private String datum;
private String imeIPrezime;
private int satiDolazak;
private int minutiDolazak;
private int satiOdlazak;
private int minutiOdlazak;
private double bonus;
private int ukupnoSati;
private int ukupnoMinuti;
private double normalniKoeficijent;
private int redovniSati;
private double extraKoefcijent;
private int vanredniSati;
private int totalSati;
private int totalMinuti;
private double totalBonus;
private double nPlata;
private double iznos;
private double oldIznos;
private double obrok;
private double totalObrok;
private int preklapanjeVanredniSati;
boolean cellEditListener = false; //osluskuje da li je i koja je  celija u fokusu
boolean mo = false;				//prati da li su u pitanju sati dolaska ili sati odlaska , odnosno minuti dolaska ili odlaska
protected ObservableList<Model> mojaLista;


public String getImeIPrezime() {
	return imeIPrezime;
}
public void setImeIPrezime(String imeIPrezime) {
	this.imeIPrezime = imeIPrezime;
}
public String getObjekat() {
	return objekat;
}
public void setObjekat(String objekat) {
	this.objekat = objekat;
}
public String getDatum() {
	return datum;
}
public void setDatum(String datum) {
	this.datum = datum;
}
public int getSatiDolazak() {
	return satiDolazak;
}
public void setSatiDolazak(int satiDolazak) {
	this.satiDolazak = satiDolazak;
}
public int getMinutiDolazak() {
	return minutiDolazak;
}
public void setMinutiDolazak(int minutiDolazak) {
	this.minutiDolazak = minutiDolazak;
}
public int getSatiOdlazak() {
	return satiOdlazak;
}
public void setSatiOdlazak(int satiOdlazak) {
	this.satiOdlazak = satiOdlazak;
}
public int getMinutiOdlazak() {
	return minutiOdlazak;
}
public void setMinutiOdlazak(int minutiOdlazak) {
	this.minutiOdlazak = minutiOdlazak;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
public int getUkupnoSati() {
	return ukupnoSati;
}
public void setUkupnoSati(int ukupnoSati) {
	this.ukupnoSati = ukupnoSati;
}
public int getUkupnoMinuti() {
	return ukupnoMinuti;
}
public void setUkupnoMinuti(int ukupnoMinuti) {
	this.ukupnoMinuti = ukupnoMinuti;
}
public double getNormalniKoeficijent() {
	return normalniKoeficijent;
}
public void setNormalniKoeficijent(double normalniKoeficijent) {
	this.normalniKoeficijent = normalniKoeficijent;
}
public int getRedovniSati() {
	return redovniSati;
}
public void setRedovniSati(int redovniSati) {
	this.redovniSati = redovniSati;
}
public double getExtraKoeficijent() {
	return extraKoefcijent;
}
public void setExtraKoeficijent(double extraKoefcijent) {
	this.extraKoefcijent = extraKoefcijent;
}
public int getVanredniSati() {
	return vanredniSati;
}
public void setVanredniSati(int vanredniSati) {
	this.vanredniSati = vanredniSati;
}
public int getTotalSati() {
	return totalSati;
}
public void setTotalSati(int totalSati) {
	this.totalSati = totalSati;
}
public int getTotalMinuti() {
	return totalMinuti;
}
public void setTotalMinuti(int totalMinuti) {
	this.totalMinuti = totalMinuti;
}
public double getTotalBonus() {
	return totalBonus;
}
public void setTotalBonus(double totalBonus) {
	this.totalBonus = totalBonus;
}

public double getNPlata() {
	return nPlata;
}
public void setNPlata(double nPlata) {
	this.nPlata = nPlata;
}
public int getOldValue() {
	return oldValue;
}
public void setOldValue(int oldValue) {
	this.oldValue = oldValue;
}
public double getIznos() {
	return iznos;
}
public void setIznos(double iznos) {
	this.iznos = iznos;
}

public double getBonusOldValue() {
	return bonusOldValue;
}
public void setBonusOldValue(double bonusOldValue) {
	this.bonusOldValue = bonusOldValue;
}
public double getOldIznos() {
	return oldIznos;
}
public void setOldIznos(double oldIznos) {
	this.oldIznos = oldIznos;
}
public int getPreklapanjeVanredniSati() {
	return preklapanjeVanredniSati;
}
public void setPreklapanjeVanredniSati(int preklapanjeVanredniSati) {
	this.preklapanjeVanredniSati = preklapanjeVanredniSati;
}
public double getObrok() {
	return obrok;
}
public void setObrok(double obrok) {
	this.obrok = obrok;
}
public double getTotalObrok() {
	return totalObrok;
}
public void setTotalObrok(double totalObrok) {
	this.totalObrok = totalObrok;
}

}//class Model
