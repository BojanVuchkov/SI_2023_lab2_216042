import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SILab2Test {
    private final User bojan=new User("bojan@gmail.com","bojan123","bojan@gmail.com");
    private final User stefan=new User("Stefan","stefan123","stefan@gmail.com");
    public List<User> users=new ArrayList<>(Arrays.asList(stefan,bojan));

    @Test
    void everyBranch() {
        //test1
        RuntimeException exception=assertThrows(RuntimeException.class,()-> SILab2.function(new User("Bojan",null,"bojan@gmail.com"),users));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
        //test2
        assertFalse(SILab2.function(new User(null, "finki", "bojan@gmail.com"), users));
        //test3
        assertFalse(SILab2.function(new User("Bojan", "softversko123$", "bojangmail.com"), users));
        //test4
        assertFalse(SILab2.function(new User("Bojan", "softversko 123$", "bojan@gmail.com"), users));
        //test5
        assertFalse(SILab2.function(new User("Bojan", "softversko123", "bojan@gmail.com"), users));
    }
    @Test
    void multipleCondition() {
        //test1
        RuntimeException exception=assertThrows(RuntimeException.class,()-> SILab2.function(null,users));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
        //test2
        exception=assertThrows(RuntimeException.class,()-> SILab2.function(new User("Bojan",null,"bojan@gmail.com"),users));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
        //test3
        exception=assertThrows(RuntimeException.class,()-> SILab2.function(new User("Bojan","bojan123",null),users));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));
        //test4
        assertFalse(SILab2.function(new User("Bojan", "softversko123$", "bojangmail.com"), users));
    }
}