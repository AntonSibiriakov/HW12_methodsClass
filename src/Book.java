public class Book {
    String name;
    Author author;
    int year;

    Book(String name,Author author, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getName() {
       return name;
    }

    public String getAuthorBook() {
        String authorStr = author.getAuthor();
        return authorStr;

    }

    public int getYear() {
        return year;
    }


    public void setYear(int year) {

        this.year = year;
    }
}
