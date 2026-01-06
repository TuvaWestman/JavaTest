Spelupplägg & programstruktur
Dragon Treasure är ett textbaserat äventyrsspel där spelaren skriver in sitt namn och därefter får navigera genom olika 
rum i en dungeon. Spelaren skriver in sitt namn vid start och använder kommandon för att röra sig mellan rummen i jakt på den slutliga skatten.

Navigering sker genom att spelaren skriver: 
n – north

s – south

w – west

e – east

Överiga inputs:
i - visa inventory

q- avsluta

Målet är att hitta rätt väg genom dungeonen och nå det sista rummet där skatten finns.



Spelet fungerar på så vis att:

- Spelaren skriver in sitt namn.

- Spelaren placeras i dungeonens start-rum.

- Varje rum har ett antal dörrar som leder till andra rum.

- Spelaren väljer riktning genom att skriva in ett kommando.

- Om riktningen existerar flyttas spelaren till nästa rum.

- Om riktningen inte finns visas ett felmeddelande.

- Vissa rum innehåller föremål (items).

- Vissa rum innehåller monster som attackerar spelaren och påverkar spelarens hälsopoäng.

- Spelarens inventory visas genom att skriva in ett kommando.

- I det sista rummet finns skatten som avslutar spelet.


Spelet är uppbygt med hjälp av objektorienterad programmering (OOP). Delar av spelet representeras av en egen klass.


Spelet innehåller följande klasser:

DragonTresure (Main): Där alla rum, dörrar, dungeon och spelare skapas.

Dungeon: Innehåller: 
    själva spel-loopen
    navigation mellan rummen
    hantering av inputs
    hanterar händelser som monster, items och skatten  

Player: Innehåller:
    Håller spelarens namn
    Spelarens inventory

Room: Står för ett rum samt de tillgängliga dörrarna.Dörrar leder spelaren från ett rum, till ett annat rum.

Door: Val av riktning (direction) leder till rum. Används för att navigera vilket rum spelaren är i.

Item: Abstrakt superklass

Subklasser till Item:
    Treasure: Innehåller guld en bild 
    Key: läggs i inventory och används för att låsa upp dörr.
    Weapon: är i spelarens inventory och kan användas mot monster.
    Potion: kan påverka spelarens hälsa

Monster: Monster befinner sig i olika rum och har: namn, hälsa, skada, ASCII art
.

Spelets struktur är byggt så att varje rum är kopplat till andra rum via dörrar, vilket skapar en liten "labyrint" som
spelaren måste ta sig igenom. Genom att testa sig fram så kan spelaren hitta rätt väg och tillslut nå "Final Room", 
där man kan välja att antigen avsluta spelet eller börja om.

Projektet visar hur man med logik kan bygga ett enkelt spel med klasser, objekt samt relationer.
Varje del av spelet är uppdelad i en egen klass för att göra koden tydlig och lättare att underhålla.

Spelet startas genom DragonTreasure-klassen, som skapar alla rum & dörrar och därefter börjar äventyret när spelaren 
kliver in i dungeon's första rum.
Själva spelet sker i Dungeon-klassen, där programmet tar emot kommandon och låter spelare röra sig mellan rummen.


Antaganden
Rummen är organiserade i en ArrayList för enkel hantering och framtida utbyggnad.
Dörrar är kopplade direkt till rummen istället för att skapa nya dörrar för varje rum.
Navigation sker via switch-case istället för listor för tydlighet.
Getter- och setter-metoder används för att kapsla data i klasser som:
    Player
    Room
    Door
Items är abstrakta för att möjliggöra utbyggnad utan att ändra befintlig kod.

Vårat arbete
Vi skapande en Github repository för att kunna koda agilt och par-koda på ett enkelt vis. Vi arbetade agilt med sprint planering i Miro. Samt kontinuerliga möten via Google meet. 

FÖrfattare
Tuva Westman, Anneli Bengtsson, Carlos Arsalan Hisham, Martina Johansson



























