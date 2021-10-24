package data.entidades;

import java.util.logging.Logger;

public class Estudiante {
    private static Logger logger = Logger.getLogger(Estudiante.class.getName());

    private final String name;


    public Estudiante(String name) {
        this.name = name;

    }

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        Estudiante.logger = logger;
    }

    public String getName() {
        return name;
    }

    public String subscribeStock(Libro book, String email, String phone) {
        return String.format("El estudiante sera notificado cuando %s este disponible por email %s y telefono %s", book.getName(), email, phone);
    }

    public String subscribeOffer(Oferta offer) {
        return String.format("El estudiante sera notificado cuando nuevos libros de %s arrive", offer.getTopic());
    }
}
