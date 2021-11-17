public class KeyCreator {
    public static void main(String[] args) {
        final Boolean[] WHOLE_HALF = {true, true, false, true, true, true}; //Acts as whole step half step equation (WWHWWWH)
        int[] key = {0, 0, 0, 0, 0, 0, 0}; //This array will store the current key according to the root value. It is an array to make it more versatile.

        for (int root = 0; root < 12; root++) { //For loop that determines the root note for the key
            key[0] = root; //Sets the first "note" of the key to the root as the root will always be the first note
            for (int j = 0; j < WHOLE_HALF.length; j++) { //This for loop compares the KEY array index to the WHOLE_HALF array index
                int k = j+1; //k acts as the value of the next note to the current one
                if (WHOLE_HALF[j] == true) { //Essentially if the scale degree of the current note is true, it is a whole step therefore the next note (or k) is going to be the current note plus 2
                    key[k] = key[j] + 2;
                    if (key[k] > 11) {
                        key[k] = key[k] - 12;
                    }
                }
                if (WHOLE_HALF[j] == false) { //Same thing as first if statement accept for half steps so the next not will only be + 1
                    key[k] = key[j] + 1;
                    if (key[k] > 11) { //This if statement just subtracts 12 when the next note is greater than 11
                        key[k] = key[k] - 12;
                    }
                }
            }
            for (int y = 0; y<key.length; y++) {
                System.out.println(key[y]);
            }
            System.out.println("-------");
        }
    }
}

/*
For reference:
0  1  2  3  4  5  6  7  8  9  10  11
A  A# B  C  C# D  D# E  F  F#  G  G#
*/