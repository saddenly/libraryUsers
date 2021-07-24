public class AdministratorLibrarian extends User implements Administrator, Librarian {
    public AdministratorLibrarian(String name) {
        super(name);
    }

    @Override
    public void giveBook(Book book) {
        System.out.println("Библиотекарь " + getName() + " дал читателю книгу " + book.getName());
    }

    @Override
    public void notifyOverdue(Reader reader) {
        System.out.println("Библиотекарь " + getName() + " уведомил читателя " + ((User) reader).getName() + " об истечении аренды");
    }

    @Override
    public void orderBook(String book, BookSupplier supplier) {
        System.out.println("Библиотекарь " + getName() + " заказал у поставщика " + ((User) supplier).getName() + " книгу " + book);
    }
}