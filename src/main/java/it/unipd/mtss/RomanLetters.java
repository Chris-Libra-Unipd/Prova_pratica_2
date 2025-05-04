//////////////////////////////////////////////////////////////////// 
 // [Davide] [Lorenzon] [2 101 075] 
 // [Christian] [Libralato] [ 2 101 047] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss; 

public enum RomanLetters {
    I(new String[] {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    }),
    V(new String[] {
        "__        __",
        "\\ \\      / /",
        " \\ \\    / / ",
        "  \\ \\  / /",
        "   \\   /   ",
        "    \\/   "
    }),
    X(new String[] {
        "__   __",
        "\\ \\ / /",
        " \\ V / " ,
        "  > <  "  ,
        " / . \\ " ,
        "/_/ \\_\\"
    }),
    L(new String[] {
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|"
    }),
    C(new String[] {
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    }),
    D(new String[] {
        " _____  ",
        "|  __ \\ ",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ "
    }),
    M(new String[] {
        " __  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    });

    private final String[] asciiArt;

    private RomanLetters(String[] asciiArt) {
        this.asciiArt = asciiArt;
    }

    public String[] getAsciiArt() {
        return asciiArt;
    }

    public static RomanLetters fromChar(char c) {
        try {
            return valueOf(String.valueOf(c));
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}