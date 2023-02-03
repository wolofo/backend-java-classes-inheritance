# Opdrachtbeschrijving

## Inleiding
In deze opdracht gaan we leren hoe we inheritance kunnen gebruiken
We gaan hier door op de vorige opdracht waar we een Customer hebben geschreven.

## Voor je begint

### Java installeren

Intellij kan Java voor je installeren:
1. Om dit te doen kan je het volgende scherm openen: `File -> Project Structure -> Project Settings -> Project`.
2. Bij SDK kan je in de dropdown `download JDK` selecteren.
3. Kies hier voor versie 17 en laat deze downloaden en installeren.

### Uitvoeren met Maven

We maken hier ook gebruik maken van de build tool maven.
Dit kunnen we zien aan het bestand `pom.xml`.
Deze file bevat de configuratie voor ons project.
Voor een klein project als dit is deze configuratie nog erg klein.
We zien hier dat we voor nu even Java versie 8 gebruiken, dit doen we nog even om te voorkomen dat Intellij je teveel gaat helpen terwijl je nog concepten aan het leren bent.
Later in deze cursus gaan we java 17 gebruiken.
We kunnen ook kijken of het programma via Maven te draaien is.
Hiervoor kun je helemaal onderin het scherm op het tabblad `terminal` klikken.
Hier kun je het volgende commando uitvoeren:

```shell
./mvnw clean compile exec:java
```

of

```shell
mvnw.cmd clean compile exec:java
```

Als het goed is komt er nu een boel tekst hier te staan waaronder de tekst "BUILD SUCCESS" en hierboven de tekst "Hello world".
Als dit werkt weet je dat maven correct werkt.

### Uitvoeren vanuit Intellij

Dit is een project dat gebruik maakt van Maven en Intellij kan hier mee omgaan.
Er is een kans dat Intellij dit al voor je gedaan heeft, maar dit kunnen we controleren door helemaal aan de rechterkant het tabblad `Maven` te openen.
Als dit tabblad leeg is moet er op het `+` icoon gedrukt worden en de `pom.xml` van dit project geselecteerd worden.
Nu zie je als het goed is het project `Helloworld` in dit tabblad staan.

Als alles goed is gegaan zie je nu in de map `src/main/java` de classe `Main` staan.
Hier zie je een groen play knopje voor de methode `main` staan.
Als je hier op klikt krijg je de mogelijkheid om `run Main.main()` te doen.
Als je hiervoor kiest gaat het programma draaien en zal je onderin in het `run` scherm de tekst:
"Hello world" te zien moeten krijgen (met daaronder de tekst "Process finished with exit code 0").
Als je dit ziet betekend dat Java goed is geinstalleerd.

## Opdracht

### Opdracht 1

Een Customer moet natuurlijk kunnen betalen.
Dit kan heel goed met een creditcard.
Maak een klasse `CreditCard` en geef deze een private property `int debt`, geef deze getters en setters en een constructor waarin deze property is opgenomen.
Voeg nu een property `creditcard` toe aan de `Customer` klasse, maak hier ook getters en setters voor en voeg de property toe aan beide constructors.
Pas ook de main methode aan om de 2 customers een `CreditCard` te geven.

Deze aanroep zou er dan ongeveer zo uit moeten zien:
`Customer customer = new Customer("Frodo", "Balings", new CreditCard(100));`

### Opdracht 2

Voeg een methode toe `void pay(int amount)` toe aan de CreditCard klasse.
Deze methode moet de `CreditCard` een nieuw bedrag geven gelijk aan het oude bedrag + amount te doen (een CreditCard verzamelt namelijk schuld).

Je kan nu in de main methode een betaling doen door
`customer.getCreditCard().pay(10)` te doen, en de huidige schuld is te printen door `System.out.println(customer.getCreditCard().getDebt());` te doen.

### Opdracht 3

Er zijn 2 grote creditcard maatschappijen in de wereld namelijk VisaCard en MasterCard.
Wat als VisaCard je klanten korting wil geven, hoe zouden we dit in kunnen bouwen.
Hiervoor kunnen we inheritance gebruiken.
Maak een nieuwe klasse `VisaCard` aan en zorg dat deze van de klasse `CreditCard` extends (`public class VisaCard extends CreditCard`)
Je ziet dat de code niet compileert, dit komt doordat de super klasse (CreditCard) een constructor heeft, dus moet de subklasse VisaCard dit ook hebben.
Dit is op te lossen door een constructor aan `VisaCard` toe te voegen: 
```
public VisaCard(int debt) {
    super(debt);
}
```
We hebben nu een klasse `VisaCard`, maak nu ook een klasse `MasterCard` aan en laat deze ook `CreditCard` extenden.

Nu we ervoor hebben gekozen om voor alle creditcards een implementatie te maken heeft het geen zin meer om toe te staan dat er een instantie van de super class `CreditCard` gemaakt kan worden.
Maak deze klasse `abstract` door deze abstract te maken `public abstract class CreditCard`.

We zien nu in Main dat we geen nieuwe instantie meer kunnen maken van CreditCard.
Geef daarom 1 customer een VisaCard en de andere een MasterCard.

Doordat de methode `pay` op `CreditCard` zit, en `VisaCard` en `MasterCard` beide hiervan overerven hebben ze ook beide automatisch de methode `pay` tot hun beschikking.
Je zult daarom ook zien dat `customer.getCreditCard().pay(10)` nog steeds prima werkt.

### Opdracht 4

Nu we een aparte klasse voor `VisaCard` en `MasterCard` hebben kunnen we ook zorgen dat ze ander gedrag gaan vertonen.
Stel VisaCard wil 10% korting geven op alle aankopen.
Wat we nu kunnen doen is de methode `pay` overschrijven in de klasse `VisaCard`.
```
@Override
public void pay(int amount) {
    super.pay(amount);
}
```
De aanroep naar `super.pay()` betekend hier dat de methode `pay` van de super klasse (CreditCard) wordt aangeroepen.
Zorg er hier voor dat het amount 10% lager wordt (door bijvoorbeeld (int)(amount * 0.9) te doen).
Je zult nu zien dat als je in Main zowel `customer` als `customer2` beide een andere creditcard geeft met een amount 0, en op beide `pay` aanroept met het bedrag 100, de schuld op beide kaarten nu anders zal zijn.


### Stappenplan
_Let op:_ het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken:
1. 


## Bonusopdracht


