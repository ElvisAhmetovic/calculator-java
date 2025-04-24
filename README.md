#Izvještaj – Metrike i pregled koda

## LOC (linije koda)

Pomoću alata `cloc` sam izračunao da projekat ima:

Ukupno linija koda: 148
Od toga prazne linije: 61
Komentari: 5
Prava koda: 148 linija

## Pregled fajlova

### Start.java

linija 9 – Scanner se pravi u petlji, bolje je da se pravi samo jednom

linija 10 – Nema provjere unosa, ako neko unese nešto što ne treba može doći do greške

linija 13 – Scanner se zatvara samo kad se unese "exit", to može izazvati problem


### Calculator.java

linija 7 – Metoda `ToString()` nije ispravna, trebalo bi da je `toString()`

linija 32 – Hvata sve greške, bolje je koristiti tačan tip greške

linija 60+ – Kod ima puno `if`-ova i ponavljanja, može se bolje organizovati

linija 66 – Nema provjere za dijeljenje sa nulom


## Korišteni alati
`cloc` – za brojanje linija koda

Visual Studio Code – za pregled koda

Ručno sam gledao fajlove bez pokretanja programa
