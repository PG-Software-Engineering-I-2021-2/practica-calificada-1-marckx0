package data.entidades;

import java.util.ArrayList;
import java.util.List;

public class Oliver {
    private static Oliver instance;
    private List<Libro> books = new ArrayList<>();
    private List<Oferta> offers = new ArrayList<>();
    private List<Estudiante> students = new ArrayList<>();

    public String health() {
        return "Alive";
    }

    public static Oliver getInstance() {
        if (instance == null) {
            instance = new Oliver();
        }

        return instance;
    }

    public void registerStudent(String name) {
        students.add(new Estudiante(name));
    }

    public void registerBook(String name, Integer year, String author, Integer stock) {
        books.add(new Libro(name, year, author, stock));
    }

    public void registerOffer(String topic, String season) {
        offers.add(new Oferta(topic, season));
    }

    public List<Libro> search(String searchTerm) {
        List<Libro> result = new ArrayList<>();
        for (Libro book : books) {
            if (book.getName().equals(searchTerm) || book.getAuthor().equals(searchTerm)) {
                result.add(book);
            }
        }
        return  result;
    }
}
