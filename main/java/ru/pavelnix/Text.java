package ru.pavelnix;

/**
 * Class text
 */
public class Text {
    private String[] text;

    public Text(String[] text) {
        this.text = text;
    }

    /**
     * Method remove duplicates lines of text
     */
    public String[] removeDuplicatesLinesText() {
        String[] tempText = new String[text.length];

        boolean flag = true;
        int index = 1;

        tempText[0] = text[0];
        for (int i = 1; i < text.length; i++) {
            int j = 0;
            do {
                if (text[i].equals(text[j])) {
                    flag = false;
                }
            } while ((flag) && (++j < i));

            if (flag) {
                tempText[index++] = text[i];
            }
            flag = true;
        }

        String[] finalText = new String[index];
        System.arraycopy(tempText, 0, finalText, 0, index);

        return finalText;
    }
}