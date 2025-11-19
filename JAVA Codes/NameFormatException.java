class NameFormatException extends Exception {
    public NameFormatException(String msg) {
        super(msg);
    }
}

class NameCheck {

    static void validateName(String name) throws NameFormatException {
        String parts[] = name.split(" ");

        if (parts.length != 2) {
            throw new NameFormatException("Invalid format! Name must contain only First and Last name.");
        }

        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameFormatException("Invalid characters in name!");
        }
    }

    static void compare(String n1, String n2) throws NameFormatException {
        validateName(n1);
        validateName(n2);

        String[] a = n1.split(" ");
        String[] b = n2.split(" ");

        if (a[0].equalsIgnoreCase(b[0]) && a[1].equalsIgnoreCase(b[1])) {
            System.out.println("Fully matched");
        } else if (a[0].equalsIgnoreCase(b[0])) {
            System.out.println("Same first names");
        } else if (a[1].equalsIgnoreCase(b[1])) {
            System.out.println("Same last names");
        } else {
            System.out.println("No match");
        }
    }

    public static void main(String[] args) {
        try {
            compare("Rohan Das", "Rohan Patnaik");
        } catch (NameFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}