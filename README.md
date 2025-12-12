Spelupplägg & programstruktur
Dragon Treasure är ett textbaserat äventyrsspel där spelaren skriver in sitt namn och därefter får navigera genom olika 
rum i en dungeon. Varje rum har olika dörrar som leder i olika riktningar, 
n för north, s för south, w för west och e för east. Spelaren måste välja rätt väg för att hitta skatten.

Spelet är uppbygt med hjälp av objektorienterad programmering (OOP).
Spelet innehåller följande klasser:

Player: Håller spelarens namn.

Room: Står för ett rum samt de tillgängliga dörrarna.Dörrar leder spelaren från ett rum, till ett annat rum.

Door: Val av riktning (direction) leder till rum. 

DragonTresure (Main): Där alla rum, dörrar, dungeon och spelare skapas.

Dungeon: Här ligger spel-loopen där navigationen sker och där kommandon körs (spel-logiken).



Spelet fungerar på så vis att:

-Spelaren skriver in sitt namn.

-Man blir introducerad till första rummet.

-Spelaren kan välja mellan olika riktningar.

-Om riktningen existerar så förs man till nästa rum.

-Om riktningen inte existerar så kommer ett felmeddelande upp. 


.

Spelets struktur är byggt så att varje rum är kopplat till andra rum via dörrar, vilket skapar en liten "labyrint" som
spelaren måste ta sig igenom. Genom att testa sig fram så kan spelaren hitta rätt väg och tillslut nå "Final Room", 
där man kan välja att antigen avsluta spelet eller börja om.

Projektet visar hur man med logik kan bygga ett enkelt spel med klasser, objekt samt relationer.
Varje del av spelet är uppdelad i en egen klass för att göra koden tydlig och lättare att underhålla.

Spelet startas genom DragonTreasure-klassen, som skapar alla rum & dörrar och därefter börjar äventyret när spelaren 
kliver in i dungeon's första rum.
Själva spelet sker i Dungeon-klassen, där programmet tar emot kommandon och låter spelare röra sig mellan rummen.


Vi skapande en Github repository för att kunna koda agilt och par-koda på ett enkelt vis. 

Antaganden
Rummen är annordnade i en Arraylist, för att underlätta ändringar och smidighet. 
Vi valde att koppla dörrarna till rummen och inte göra nya dörrar för varje rum. 
Dörrarna är riktningar (s, w, e, n) i en Switch istället för en Arraylist. 
Vi valde set och get metod i Door, Player och Room. 

FÖrfattare
Tuva Westman, Anneli Bengtsson, Carlos Arsalan Hisham, Martina Johansson



























