package Tools.swing;

import javax.swing.JFrame;

public class Toolui {

    public static void uI(String name) {
        validateInput(name);

        JFrame JF = new JFrame(name);
        JF.show();
    }

    private static void validateInput(String name) {
        if (isEmpty(name)) {
            throw new InvalidInputException("The name parameter was empty");
        }
    }

    private static boolean isEmpty(String string) {
        return string == null || string.trim().isEmpty();
    }
}
