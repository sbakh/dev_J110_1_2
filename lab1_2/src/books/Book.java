package books;

public class Book {
//    static Book[] books = new Book[5];
    public static Book[] books;
    private String name;
    private PublishingHouse publishingHouse;
    private int year;
    String[] authors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(PublishingHouse publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
    public int getAuthorsLength() {
        if (authors != null) {
            return authors.length + 1;
        } else {
            return 0;
        }
    }
    public String getAuthor(int nomer) {
        try {
            return getAuthors()[nomer];
        } catch (Exception exception) {
            return "Автора " + nomer + " не существует";
        }
    }
    public void printBook(){
        String str = "";
        if (this.getAuthorsLength() > 0) {
            for (String author : this.authors) {
                str = str.concat(author + ", ");
 //               System.out.print(author + ", ");
            }
            str = str.substring(0,str.length()-3);
            System.out.print(str + "; ");
        }
        System.out.print(this.name);

        System.out.print("; " + this.publishingHouse.getName());//+ this.publishingHouse.getCity() + ", ");
        System.out.println("; " + this.year + ";");
    }
//qaqaq
    public void printBook(Book book){
        if (book.getAuthorsLength() > 0)
            for (String author : book.getAuthors()) {
                System.out.print(author + ", ");
            }
        System.out.print(book.getName() + ", ");

        System.out.print(book.getPublishingHouse().getName() + ", " + book.getPublishingHouse().getCity() + ", ");
        System.out.println(book.getYear());
    }


    public static void printAll() {
        for (Book book: books) {
            book.printBook();
        }
    }

    public Book() {

    }

    public Book(String name, PublishingHouse publishingHouse, int year, String[] authors) {
        this.name = name;
        this.publishingHouse = publishingHouse;
        this.year = year;
        if (authors != null) this.authors = authors;
        else this.authors = new String[0];
    }
}
