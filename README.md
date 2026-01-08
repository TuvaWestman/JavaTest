Spelupplägg & programstruktur
Dragon Treasure är ett textbaserat äventyrsspel där spelaren skriver in sitt namn och därefter får navigera genom olika 
rum i en dungeon. Spelaren skriver in sitt namn vid start och använder kommandon för att röra sig mellan rummen i jakt på en skatt.

Navigering sker genom att spelaren skriver: 
n – north

s – south

w – west

e – east

Överiga inputs:
i - visa inventory

q- avsluta spelet

a- använda weapon när spelaren möter ett monster

b- använd potion för att heal när spelaren slagits mot ett monster


Spelet fungerar på så vis att:

- Spelaren skriver in sitt namn.

- Spelaren placeras i dungeonens start-rum.

- Varje rum har ett antal dörrar som leder till andra rum.

- Spelaren väljer riktning genom att skriva in ett kommando.

- Om riktningen existerar flyttas spelaren till nästa rum.

- Vissa rum innehåller föremål (items- treasure, items- key)

- Vissa föremål finns hos spelaren (items- weapon, items- potion)

- Två rum innehåller monster som attackerar spelaren och påverkar spelarens hälsopoäng.

- Vid interaktion med monster är det möjligt för spelaren att använda vapen och sedan heala sig själv

- En dörr är låst och om spelaren har en nyckel i sitt inventory kan dörren låsas upp

- Spelarens inventory visas genom att skriva in ett kommando.

- I det sista rummet finns skatten som avslutar spelet.


Spelet är uppbygt med hjälp av objektorienterad programmering (OOP). Delar av spelet representeras av en egen klass.


Spelet innehåller följande klasser:

- DragonTresure (Main). Innehåller:
    Skpande av 
        rum
        dörrar
        dungeon
        spelare
        items
        monster

- Dungeon. Innehåller: 
    själva spel-loopen
    navigation mellan rummen
    hantering av inputs
    hanterar händelser som monster, items och skatten  

- Player. Innehåller:
    Spelarens namn
    Spelarens inventory

- Room. Innehåller:
    metod för strid
    relation till dörrar
    metod för beskrivning av rum

- Door. Innehåller:
    Riktningar
    Om dörren är låst eller inte

- Item(abstrakt superklass)

- Subklasser till Item:
    - Treasure. Innehåller:
        Guldvärde
        Arv från Item
    - Key. Innehåller:
        Namn
        Arv från Item
    - Weapon. Innehåller:
        Arv från Item
    - Potion. Innehåller:
        Healing 
        Arv från Item

- Monster. Innehåller:
    Namn 
    Hälsa
    Skada

Spelets struktur är byggt så att varje rum är kopplat till andra rum via dörrar, vilket skapar en liten "labyrint" som
spelaren måste ta sig igenom. Genom att testa sig fram så kan spelaren hitta rätt väg och tillslut komma till slutrummet med skatten.

Projektet visar hur man med logik kan bygga ett enkelt spel med klasser, objekt samt relationer.
Varje del av spelet är uppdelad i en egen klass för att göra koden tydlig och lättare att underhålla.

Spelet startas genom DragonTreasure-klassen, som skapar alla rum och dörrar och därefter börjar spelet.
Själva spelet sker i Dungeon-klassen, där programmet tar emot kommandon och låter spelare röra sig mellan rummen.

Antaganden
Rummen är organiserade i en ArrayList för enkel hantering och framtida utbyggnad.
Dörrar är kopplade direkt till rummen istället för att skapa nya dörrar för varje rum.
Navigation sker via switch-case.
Getter- och setter-metoder används för att kapsla data i klasser som:
    Player
    Room
    Door
Items är abstrakta för att möjliggöra utbyggnad utan att ändra befintlig kod.

Vårt arbete
Vi skapande en Github repository för att kunna arbeta tillsammans och par-koda på ett enkelt sätt. Vi arbetade agilt med sprint planering i Miro, samt kontinuerliga möten via Google meet. 

Författare
Anneli Bengtsson 
Carlos Arsalan Hisham
Martina Johansson
Tuva Westman



























