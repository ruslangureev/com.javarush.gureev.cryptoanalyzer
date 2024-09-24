public class Algorithm {
    static char[] getCipherChars(char[] inputChars, int realSizeInputChars, int key) {
        char[] cipherChars = new char[realSizeInputChars];

        if (key < 0 ){
            key = (key % Alphabet.RUS_ALPHABET.length) + Alphabet.RUS_ALPHABET.length;
        }
        for (int i = 0; i < cipherChars.length; i++) {
            for (int j = 0; j < Alphabet.RUS_ALPHABET.length; j++) {
                if (inputChars[i] == Alphabet.RUS_ALPHABET[j]){
                    cipherChars[i] = Alphabet.RUS_ALPHABET[(j + key) % Alphabet.RUS_ALPHABET.length];
                } else if (inputChars[i] == '\n' || inputChars[i] == '\r') {
                    cipherChars[i] = inputChars[i];
                }

            }


        } return cipherChars;

    }
}
