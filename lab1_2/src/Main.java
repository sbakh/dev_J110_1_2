import books.Book;
import books.PublishingHouse;

public class Main {


    public static void main(String[] args) {
        PublishingHouse prospect = new PublishingHouse("Проспект", "Москва");
        PublishingHouse piter = new PublishingHouse("Питер","Санкт-Петербург");
        PublishingHouse bhv = new PublishingHouse("БХВ","Санкт-Петебург");
        PublishingHouse dialektika = new PublishingHouse("Диалектика","Киев");
        Book book1 = new Book();
        book1.setAuthors(new String[]{"Седжвик Роберт", "Уэйн Кевин"});
        book1.setName("Computer Science: Основы программирования на Java, ООП, алгоритмы и структуры данных");
        book1.setPublishingHouse(piter);
        book1.setYear(2018);
        Book book2 = new Book();
        book2.setAuthors(new String[]{"Вигерс Карл"});
        book2.setName("Разработка требований к программному обеспечению. 3-е издание, дополненное");
        book2.setPublishingHouse(bhv);
        book2.setYear(2019);
        Book book3 = new Book();
        book3.setAuthors(new String[]{"Шилдт Герберт"});
        book3.setName("Java. Полное руководство, 10-е издание");
        book3.setPublishingHouse(dialektika);
        book3.setYear(2018);
        Book book4 = new Book();
        book4.setAuthors(new String[]{"Полубенцева М.И."});
        book4.setName("C/C++. Процедурное программирование");
        book4.setPublishingHouse(bhv);
        book4.setYear(2017);
        Book book5 = new Book();
  //      book5.setAuthors(new String[]{"Полубенцева М.И."});
        book5.setName("Конституция РФ");
        book5.setPublishingHouse(prospect);
        book5.setYear(2020);

        //Book[] books = new Book[]{book1,book2,book3,book4,book5};
        Book book = new Book();
        book.books = new Book[]{book1,book2,book3,book4,book5};
        book.printAll();
        bhv.setCity("Санкт-Петербург");// Исправили название города для издательства БХВ
        book2.setPublishingHouse(bhv);
        book4.setPublishingHouse(bhv);
        book.books = new Book[]{book1,book2,book3,book4,book5};
        book.printAll();//вывод на печать выводит весь массив, а нетолько измененные объекты
    }
}