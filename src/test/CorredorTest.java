package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.Corredor;

public class CorredorTest {
	
@Test 
void TestVagasCorretas() {
	Corredor corredor1 = new Corredor(6, 0);		
	assertEquals(6, corredor1.getQuantidadeVagasDesocupada());
	
	Corredor corredor2 = new Corredor(10, 1);		
	assertEquals(10, corredor2.getQuantidadeVagasDesocupada());
}
}
