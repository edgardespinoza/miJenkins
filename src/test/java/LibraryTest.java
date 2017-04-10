/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import com.exe.main.IProcesar;
import com.exe.main.ProcesarImp;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    
    @Test
    public void procesar(){
    	IProcesar p = new ProcesarImp();
    	p.procesarSuma(2, 3);
    	assertEquals(p.procesarSuma(2, 3), 5);
    	
    }
}
