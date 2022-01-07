import java.util.*;
class RnaTranscription {
    String transcribe(String dnaStrand) {
        Map < Character, Character > nucleotideComplements = new HashMap < > ();
        nucleotideComplements.put('C', 'G');
        nucleotideComplements.put('G', 'C');
        nucleotideComplements.put('T', 'A');
        nucleotideComplements.put('A', 'U');
        String rnaTranscription = "";
        char[] nucleotides = dnaStrand.toCharArray();
        for (char nucleotide: nucleotides) {
            rnaTranscription += nucleotideComplements.get(nucleotide);
        }
        return rnaTranscription;
    }
}
