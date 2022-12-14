public class Author {
    String name;
    char space = ' ';
    String lastName;

    Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public String getAuthor() {

        String fullName = name + space + lastName;
        return fullName;
    }
}
