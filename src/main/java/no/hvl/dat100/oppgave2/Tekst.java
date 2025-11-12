package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {

    private String tekst;

    public Tekst() {
        super(); // Kall konstruktøren til superklassen
    }

    public Tekst(int id, String bruker, String dato, String tekst) {
        super(id, bruker, dato); // Kall konstruktøren til superklassen
        this.tekst = tekst;
    }

    public Tekst(int id, String bruker, String dato, int likes, String tekst) {
        super(id, bruker, dato, likes); // Kall konstruktøren til superklassen
        this.tekst = tekst;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    @Override
    public String toString() {
        return "TEKST\n" +
                getId() + "\n" +
                getBruker() + "\n" +
                getDato() + "\n" +
                getLikes() + "\n" +
                tekst + "\n";
    }

    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {
        return null; // Implementer denne hvis du vil ha HTML-utskrift
    }
}

