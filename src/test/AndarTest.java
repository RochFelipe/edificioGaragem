package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.Andar;
import main.Corredor;

public class AndarTest {
	
@Test 
void TestAndarLivre() {
	Corredor corredor1 = new Corredor(6, 0);	
	Corredor corredor2 = new Corredor(10, 1);	
	Andar andar1 = new Andar(2,0,Arrays.asList(corredor1, corredor2));
	assertEquals(16, andar1.vagasDesocupadas());
}
}
