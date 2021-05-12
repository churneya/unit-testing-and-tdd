package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    @Test //BDD
    public void shouldSizeIncrementedAndContainsItemWhenAddItem() {
        //region Arrange | Fixture | Given
        final List<Object> sut = new ArrayList<>();
        final Object dummy = new Object();
        //endregion

        //region Act | When
        sut.add(dummy);
        //endregion

        //region Assert | Then
        assertEquals(1, sut.size());
        assertTrue(sut.contains(dummy)); //assertEquals(dummy, sut.get(0));
        //endregion
    }
}
