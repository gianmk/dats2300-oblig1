# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Hoang Duc Nguyen, S189261, s189261@oslomet.no
* ...

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
Oppgaven ble løst alene.

# Oppgavebeskrivelse

I I oppgave 1 så ble bubble sort brukt. Det kjøres en for løkke som looper gjennom hele array der det største tallet blir boblet frem dermed vil største verdien blir returnert i siste posisjon. Samme teknikk ble brukt i ombyttinger(), det ble også laget en teller som øke for hvergang det skjer en bytting av posisjon. 

I oppgave 2 ble det sjekket først om array er sortert i stigende rekkefølge og gi feilmelding om det ikke er så. Derrette sjekker det om de to tallene er ulike. Dersom de er ulike vil antall økes med 1 og siden det er i stigende rekkefølge vil funksjonen kun telle antall dersom tallet før er mindre . Dette skjer hver gang det looper gjennom array. Tilslutt returner det antall ganger det er ulike tall i array. 

i oppgave 3 ble to indekser (i og J) sammelignet i to nested for loop. teller starter med 0 fordi det kjøres to nested loop for å sammeligner tall, uavhengig av rekkfølge på tallene. Det ble brukt boolean for å registrer om tallen er like eller ikke. Teller økes med en om tall er ulike.

i oppgave4 ble høyre og venstrepeker brukt for å sorterte odde- og partall. En for løkke kjøre gjennom array. Venstre og høyrepeker ble brukt for å sjekke hvert fall, om de er oddetall eller partall. Dersom venstrepeker er på oddetall vil det bli flyttet mot høyre, og vice versa for høyrepeker med partall. Hjelpemetoden bytt ble kalt for bytte verdiene til riktig side. tilslutt ble det array.sort for å sortere array i to deler, først fra indeks 0 til og med venstrepeker(oddetall) også fra venstrepeker til siste indeks i array (partall)


