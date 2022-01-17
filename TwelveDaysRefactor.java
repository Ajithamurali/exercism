class TwelveDays {
    
	private static final String lyrics[] = new String[] {
			"a Partridge in a Pear Tree", "two Turtle Doves",
			"three French Hens", "four Calling Birds", "five Gold Rings",
			"six Geese-a-Laying", "seven Swans-a-Swimming",
			"eight Maids-a-Milking", "nine Ladies Dancing",
			"ten Lords-a-Leaping", "eleven Pipers Piping",
			"twelve Drummers Drumming" };
    
	private static final String days[] = new String[] { "first", "second",
			"third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth",
			"tenth", "eleventh", "twelfth" };
    
    String verse(int verseNumber) {
       StringBuilder result = new StringBuilder("On the " + days[verseNumber - 1]
				+ " day of Christmas my true love gave to me: ");
		for (int index = verseNumber - 1; index >= 0; index--) {
			result.append(((verseNumber > 1 && index == 0) ? "and " : "")
					+ lyrics[index] + ", ");
		}
		return result.substring(0, result.length() - 2) + ".\n";
    }

    String verses(int startVerse, int endVerse) {
       StringBuilder result = new StringBuilder();
		for (int index = startVerse ; index <=endVerse; index++) {
			result.append(verse(index)+"\n");
		}
		return result.substring(0, result.length() - 1);
    }
    
    String sing() {
        return verses(1,12);
    }
}
