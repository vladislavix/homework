class Reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fullName, int ticketNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String[] bookNames) {
        String bookList = "";
        for (int i = 0; i < bookNames.length; i++) {
            bookList += bookNames[i];
            if (i != bookNames.length - 1) {
                bookList += ", ";
            }
        }
        System.out.println(fullName + " взял книги: " + bookList + ".");
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");
    }

    public void returnBook(String[] bookNames) {
        String bookList = "";
        for (int i = 0; i < bookNames.length; i++) {
            bookList += bookNames[i];
            if (i != bookNames.length - 1) {
                bookList += ", ";
            }
        }
        System.out.println(fullName + " вернул книги: " + bookList + ".");
    }
}
public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Иванов И. И.", 613671, "Факультет математики", "01.01.2000", "+7 (999) 111-22-33");
        readers[1] = new Reader("Петров П. П.", 5251255, "Факультет физики", "02.02.2001", "+7 (999) 222-33-44");
        readers[2] = new Reader("Монстрий С. С.", 362, "Факультет иностранных языков", "03.03.1927", "+7 (999) 333-44-55");
        readers[3] = new Reader("Матвей К. К.", 2636, "Факультет экономики", "04.04.1989", "+7 (999) 444-55-66");
        readers[4] = new Reader("Михаил Коськи Н.", 623632, "Факультет истории", "05.05.2020", "+7 (999) 555-66-77");

        readers[0].takeBook(3);
        readers[1].takeBook(new String[]{"Приключения", "Словарь", "Энциклопедия"});
        readers[2].returnBook(2);
        readers[3].returnBook(new String[]{"Приключения", "Словарь", "Тетрадь"});
        readers[4].takeBook(new String[]{"Учебник", "Словарь", "Решебник"});
    }
}
