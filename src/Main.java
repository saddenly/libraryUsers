public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Игра Престолов", "Фэнтези");
        Book b2 = new Book("451 градусов по Фаренгейту", "Антиутопия");

        Administrator librarianAdmin = new AdministratorLibrarian("Олег");
        ReaderSupplier readerSupplier = new ReaderSupplier("Паша");

        readerSupplier.takeBook(librarianAdmin, b2);
    }
}