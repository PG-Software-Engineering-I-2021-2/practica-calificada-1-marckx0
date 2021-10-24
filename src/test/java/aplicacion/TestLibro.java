package aplicacion;

import data.entidades.Libro;
import org.junit.Assert;
import org.junit.Test;

public class TestLibro {

    @Test
    public void checkBook() {
        Libro book = new Libro("Algotihms II", 1974, "Cormen", 10 );
        Assert.assertEquals( "1974", book.getYear().toString());
        Assert.assertEquals( "10", book.getStock().toString());
    }
}
