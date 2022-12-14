public class Main {
    public static void main(String[] args) {
        Author ericYoung = new Author("Eric", "Young");
        Author anaManning = new Author("Ana", "Manning");
        Author donnaCain = new Author("donna", "Cain");

        Book one = new Book("One", ericYoung, 2000);
        Book two = new Book("Two", anaManning, 2012);
        Book three = new Book("Three", donnaCain, 2020);

        one.setYear(2001);
    }
}