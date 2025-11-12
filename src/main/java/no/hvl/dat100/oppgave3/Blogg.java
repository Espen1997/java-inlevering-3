package no.hvl.dat100.oppgave3;

import no.hvl.dat100.oppgave1.Innlegg;

public class Blogg {

    private Innlegg[] innleggTabell;
    private int nesteLedig;

    public Blogg() {
        innleggTabell = new Innlegg[20];
        nesteLedig = 0;
    }

    public Blogg(int lengde) {
        innleggTabell = new Innlegg[lengde];
        nesteLedig = 0;
    }

    public int getAntall() {
        return nesteLedig;
    }

    public Innlegg[] getSamling() {
        return innleggTabell;
    }

    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteLedig; i++) {
            if (innleggTabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

    public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
    }

    public boolean ledigPlass() {
        return nesteLedig < innleggTabell.length;
    }

    public boolean leggTil(Innlegg innlegg) {
        if (!finnes(innlegg) && ledigPlass()) {
            innleggTabell[nesteLedig] = innlegg;
            nesteLedig++;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String tekst = nesteLedig + "\n";
        for (int i = 0; i < nesteLedig; i++) {
            tekst += innleggTabell[i].toString();
        }
        return tekst;
    }
}


