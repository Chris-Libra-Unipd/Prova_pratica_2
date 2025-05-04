//////////////////////////////////////////////////////////////////// 
 // [Davide] [Lorenzon] [2 101 075] 
 // [Christian] [Libralato] [ 2 101 047] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss; 
 public class RomanPrinter { 

 public static String print(int num){ 
   return printAsciiArt(IntegerToRoman.convert(num)); 
 } 


private static String printAsciiArt(String romanNumber){ 
  if (romanNumber == null || romanNumber.isEmpty()) {
    return "";
}

StringBuilder risultato = new StringBuilder();

try {
    // Converti ogni carattere in maiuscolo per sicurezza
    romanNumber = romanNumber.toUpperCase();
    
    // Per ogni riga dell'ASCII art (6 righe)
    for (int row = 0; row < 6; row++) {
        // Per ogni carattere nel numero romano
        for (char lettera : romanNumber.toCharArray()) {
            RomanLetters romanLetter = RomanLetters.fromChar(lettera);
            if (romanLetter != null) {
                // Aggiungi la riga corrispondente dell'ASCII art
                risultato.append(romanLetter.getAsciiArt()[row]);
                risultato.append(" "); // Spaziatura tra lettere
            }
        }
        risultato.append("\n"); // Nuova linea dopo ogni riga
    }
} catch (Exception e) {
    System.err.println("Errore durante la generazione dell'ASCII art: " + e.getMessage());
    return "";
}

return(risultato.toString());

}
 } 

