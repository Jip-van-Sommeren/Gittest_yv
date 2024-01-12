/*
 1 maak een klasse x
 2 geef hem een kenmerk van het type int of string x
 3 maak een object x
 4 ken voor het het object een waarde toe aan het kenmerk x
 5 maak een methode x
 6 roep de methode aan x
 7 geef de methode een parameter
 8 roep de methode aan
 9 gebruik in de methode  een field
10 vul mbv de methode en zijn parameter een field
 
11 gebruik een ander returntype dan void
12 print de waarde die de methode returned
13 maak een methode met meerdere parameters
 
14 maak een methode met een parameter van een eigen klasse
15 roep m aan
16 maak een methode met een returntype van een eigen klasse
17 vang m op
 
18 maak een constructor werkend
19 maak een constructor met een parameter
 
20 maak een has-a relatie  - minimaal 1 field en 1 methode
21 maak een is-a relatie - minimaal 1 field en 1 methode
*/
class Persoon{
    int leeftijd;
    String naam;
    Persoon broer;

    int jarig() {
        leeftijd += 1;
        return leeftijd;
    }

    void nieuwenaam(String naam_nieuw){
        this.naam = naam_nieuw;
    }

    Persoon nieuwnaam(Persoon p, String naam_nieuw){
        p.naam = naam_nieuw;
        return p;
    }
    Persoon (int leeftijd, String naam) {
        this.leeftijd = leeftijd;
        this.naam = naam;
    }
}

class Geslacht extends Persoon {
    Geslacht(Persoon p, String geslacht) {
        super(0, "");
        this.geslacht = geslacht;
    }
    String geslacht;
}

public class test {
    public static void main (String [] args){

        Persoon p = new Persoon(20, "Hans");
        p.nieuwenaam("Gerard");

        int nieweleeftijd = p.jarig();
        System.out.println(nieweleeftijd);

        System.out.println(p.naam);

        p.nieuwnaam(p, "Kees");
        System.out.println(p.naam);

        Geslacht man = new Geslacht(p, "Man");
        System.out.println(man.geslacht);

        p.broer = new Persoon(12, "Henk");

        System.out.println(p.broer.naam);
    }
}