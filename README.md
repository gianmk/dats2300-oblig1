# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Hoang Duc Nguyen, S189261, s189261@oslomet.no
* ...

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
Oppgaven ble løst alene.

# Oppgavebeskrivelse

I I oppgave 1 så ble bubblind metoden. Det kjøres en for løkke som looper gjennom hele array der det største tallet blir boblet frem dermed vil største verdien blir returnert i siste posisjon. Samme teknikk ble brukt i ombyttinger(), det ble også laget en teller som øke for hvergang det skjer en bytting av posisjon. 

I oppgave 2 ble det sjekket først om array er sortert i stigende rekkefølge og gi feilmelding om det ikke er så. Derrette sjekker det om de to tallene er ulike. Dersom de er ulike vil antall økes med 1 og siden det er i stigende rekkefølge vil funksjonen kun telle antall dersom tallet før er mindre . Dette skjer hver gang det looper gjennom array. Tilslutt returner det antall ganger det er ulike tall i array. 

i oppgave 3 ble to indekser (i og J) sammelignet i to nested for loop. teller starter med 0 fordi det kjøres to nested loop for å sammeligner tall, uavhengig av rekkfølge på tallene. Det ble brukt boolean for å registrer om tallen er like eller ikke. Teller økes med en om tall er ulike.

i oppgave 4 ble høyre og venstrepeker brukt for å sorterte odde- og partall. En for løkke kjøre gjennom array. Venstre og høyrepeker ble brukt for å sjekke hvert fall, om de er oddetall eller partall. Dersom venstrepeker er på oddetall vil det bli flyttet mot høyre, og vice versa for høyrepeker med partall. Hjelpemetoden bytt ble kalt for bytte verdiene til riktig side. tilslutt ble det array.sort for å sortere array i to deler, først fra indeks 0 til og med venstrepeker(oddetall) også fra venstrepeker til siste indeks i array (partall). la til metode som sjekke om array kun inneholdt oddetall/partall. Sortere bare array dersom det er kun odde/partall.

I oppgave 5 ble en hjelpe tabell opprettet. Hjelpetabell lagre siste verdien før rotasjon skjer. For loop kjører gjennom array og verdien inni array blir forskyvet ett hakk til høyre, og til slitt blir siste verdi satt til først posisjon. 

i oppgave 7 a) starte først med å finne minste tegnstreng ved bruk av math.min(). Den tomt hjelpetabell ble derette opprettet. Tabell ble brukt for å fylle inn annen hver tegn fra  tegnstreng fra string S og T. først fra String s så string T.


I oppgave 7b) her ble sammen fremsgangsmåten som i oppgave 7a brukt, men her måttte det først finne  totalt antall tegnstrenger. En tomt tabell ble oprettet. her blir det fylt inn først tegn fra hvert tegnstreng. Funksjon charAt() ble derette brukt for å finne indeks til tegnet. 
7b med string builder. antok at vi er på siste runden. Går gjennom alle strings og sjekker om det er flere tegn. Dersom det er flre tegn vil det bli satt inn, dersom ikke vil det itinere på nytt

