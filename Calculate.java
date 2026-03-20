package mojaSatnica;

public class Calculate extends Model {

	
	static int tempTotalSati = 0;      //total sati
	static int tempTotalMinuti = 0;    //total minuti		
	static double plata = 0; 				//ukupno plata
	static double totalBonus1;			//ukupno bonus
	static double totalObrok = 0;
	boolean provera = false;             //proverava da li je pritisnuto dugme remove
	static boolean testBonus = false;
	boolean preklapanje = false;
	int counter = 0;
	boolean isSelect = false;
	//racuna zbir ukupno sati jedne kolumne
	public int ukupnoSati() {
	int satiUkupno = 0;
	
	if(getSatiDolazak() <= getSatiOdlazak())
		satiUkupno = getSatiOdlazak() - getSatiDolazak();
	else if(getSatiDolazak() > getSatiOdlazak())
		satiUkupno = 24-(getSatiDolazak() - getSatiOdlazak());
	//ukoliko su minuti odlaska manji od minuta dolaska onda sati ukupno umanjuju za jedan sat
	if(getMinutiOdlazak()<getMinutiDolazak())
		satiUkupno--;
	
	return satiUkupno;
	
	}//ukupnoSati()
	
	
	//racuna ukupno zbir minuta jednog reda
	public int ukupnoMinuti() {
	int minutiUkupno = 0;
	
	if(getMinutiOdlazak() >= getMinutiDolazak())
		minutiUkupno = getMinutiOdlazak() - getMinutiDolazak();
	
	else if(getMinutiOdlazak() < getMinutiDolazak()) 
		minutiUkupno=(getMinutiOdlazak()-getMinutiDolazak())+60;
	
	return minutiUkupno;
	}//ukupnoMinuti()
	
	
	//zbir ukupno sati - total iz svih redova
	public int totalSati() {
		if(provera==false)  				//provera dugme remove nije pritisnuto
			tempTotalSati+=getUkupnoSati();
		else if (provera==true)				//provera dugme remove je pritisnuto
		
			tempTotalSati-=getUkupnoSati();
	
		//tempTotalSati += getUkupnoSati();
		return tempTotalSati;
	}//totalSati()
	
	
	//zbir svih ukupno minuta total iz svih redova
	public int totalMinuti() {
	
		if(provera == false) {						//provera dugme remove nije pritisnuto
			tempTotalMinuti += getUkupnoMinuti();
			sinhronizacija();
		}
		else if(provera == true) {					//provera dugme remove je pritisnuto
			tempTotalMinuti -= getUkupnoMinuti();
			sinhronizacija();
		}
		return tempTotalMinuti;
	}//totalMinuti()
	
	
	int sinhronizacija() {
		//ako je provera true ili false
		if(tempTotalMinuti >= 60) {				//ako su total minuti >= od 60 onda total minuti - 60  i total sati +1
			tempTotalMinuti = tempTotalMinuti - 60;
			tempTotalSati++;						
		}
		else if(tempTotalMinuti < 0) {			//ako su total minuti < od 0 onda total minuti + 60 total sati -1
			tempTotalMinuti = tempTotalMinuti + 60;
			--tempTotalSati;
		}
		return tempTotalSati;
	}//sinhronizacija()
	
	//obracun vanrednih sati
	public int vanredniSati() {
		int tempVanredniSati = 0;
	
		if(tempTotalSati > getRedovniSati()) 							//ako su total sati > od redovnih sati 
				tempVanredniSati += tempTotalSati-getRedovniSati();
		
		else if(tempTotalSati<=getRedovniSati()){					//ako su total sati <= od redovnih sati vanredni sati = 0
				tempVanredniSati = 0;
				}
		return tempVanredniSati;	
	}//vanredniSati()
	
	public double iznosDnevnePlate() {
		double tempDnevniIznos = 0;
		int totalSati = tempTotalSati;
		int ukupnoSati = getUkupnoSati();
		
		
		if(totalSati <= getRedovniSati()) {
			tempDnevniIznos = (ukupnoSati * 60 + getUkupnoMinuti()) * (getNormalniKoeficijent() / 60) + getBonus();
			
		}
		
		
		else if(getVanredniSati() < ukupnoSati && totalSati > getRedovniSati()) {
			
			if(ukupnoSati * getNormalniKoeficijent() != getIznos() || ukupnoSati * getExtraKoeficijent() != getIznos() ) {
				preklapanje = true;
				if(provera)
					tempDnevniIznos = (((ukupnoSati - getVanredniSati()) * 60 ) * ((getNormalniKoeficijent() / 60)) + ((getVanredniSati() * 60 + getUkupnoMinuti() ) * (getExtraKoeficijent()/60)))  + getBonus();
				else {
					tempDnevniIznos = (((ukupnoSati - getVanredniSati()) * 60 ) * ((getNormalniKoeficijent() / 60)) + ((getVanredniSati() * 60 + getUkupnoMinuti() ) * (getExtraKoeficijent()/60)))  + getBonus();
				
				}//else
				
			}//if
			else  {
				tempDnevniIznos =  (((ukupnoSati + getVanredniSati()) * 60 + getUkupnoMinuti()) * ((getNormalniKoeficijent() / 60)) + ((getVanredniSati() * 60  ) * (getExtraKoeficijent()/60)))   + getBonus();
				
			}
			
		}
		
		else if(getVanredniSati() >= ukupnoSati && totalSati > getRedovniSati() ) {
			tempDnevniIznos = (ukupnoSati * 60 + getUkupnoMinuti()) * (getExtraKoeficijent() / 60) + getBonus();
				System.out.println("inside elseif 2");
				System.out.println(ukupnoSati + " " + getVanredniSati() + " " + getUkupnoMinuti());
			}
		else 
			System.out.println("Greska u metodu iznosDnevnePlate()");
		//sinhronizacija();
		return tempDnevniIznos;
	}//iznosDnevnePlate()
	
	
	public double obracunPlate() {
		
		
				if(provera == false) {								//provera remove dugme  nije pritisnuto
						plata += iznosDnevnePlate();
					}//if provera
				else if(provera == true) {	
					//provera remove dugme  je pritisnuto
					plata -= getIznos();
						
					}
		
		return plata;
			}//obracunPlate()
	
	
	//Obracun ukupnog bonusa
	double obracunTotalBonusa() {
		//Ukoliko se koristi dodavnje bonusa ulaskom u celiju u tabeli u kolmuni bonus
		if(provera == false) {
			System.out.println("old value = " + getBonusOldValue());
			//totalBonus1 -= getBonusOldValue() ;
			totalBonus1 += getBonus() ;
			
			System.out.println("Total bonus = " + totalBonus1);
			}//if
		
		
		
		else if(provera == true) 
			totalBonus1 -= getBonus();
			
		return totalBonus1;
	}
	
	double totalObrok() {
		if(!provera)
			totalObrok += getObrok();
		
		else if(provera) {
			System.out.println(getObrok() + "Obrok");	
			totalObrok -= getObrok();
		
		}
		
		return totalObrok;
	}//totalObrok()

	
	}//class Calculate
