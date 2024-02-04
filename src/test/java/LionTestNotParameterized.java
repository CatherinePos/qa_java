package com.example;
        import org.junit.Test;
        import static org.junit.Assert.assertEquals;
        import static org.junit.Assert.assertThrows;

public class LionTestNotParameterized {

    @Test
    public void testCheckException() {
        Exception actualException = assertThrows(Exception.class, () ->
                new Lion("something"));
        assertEquals("Используйте допустимые значения пола животного - самец или самка",
                actualException.getMessage());
    }
}