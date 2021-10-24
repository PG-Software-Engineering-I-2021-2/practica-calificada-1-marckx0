package aplicacion;

import static org.junit.Assert.assertTrue;

import data.entidades.Oliver;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestAplicacion
{

    @Test
    public void shouldAnswerWithTrue()
    {

        Oliver oliver = Oliver.getInstance();
        Assert.assertEquals("Alive", oliver.health());
    }
}
