package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.Andar;
import main.Corredor;
import main.Garagem;

public class GaragemTest {

@Test 
void TestGaragemAndarLivre() {
	Corredor corredor1 = new Corredor(6, 0);	
	Corredor corredor2 = new Corredor(10, 1);	
	Andar andar1 = new Andar(2,0,Arrays.asList(corredor1, corredor2));
	Corredor corredor3 = new Corredor(5, 0);	
	Corredor corredor4 = new Corredor(9, 1);	
	Andar andar2 = new Andar(2,1,Arrays.asList(corredor3, corredor4));
	
	Garagem garagem = new Garagem(1,0,Arrays.asList(andar1, andar2));
	
	assertEquals(0, garagem.andarMaisLivre());	
}

@Test 
void TestGaragemOrdenarVagas() {
	Corredor corredor1 = new Corredor(6, 0);	
	Corredor corredor2 = new Corredor(10, 1);	
	Andar andar1 = new Andar(2,0,Arrays.asList(corredor1, corredor2));
	Corredor corredor3 = new Corredor(5, 0);	
	Corredor corredor4 = new Corredor(9, 1);	
	Andar andar2 = new Andar(2,1,Arrays.asList(corredor3, corredor4));
	
	Garagem garagem = new Garagem(1,0,Arrays.asList(andar1, andar2));
	
	assertEquals(0, garagem.ordenarAndaresLivres());
	}

@Test 
void TestGaragemTotalArrecadado() {
	Corredor corredor1 = new Corredor(6, 0);	
	Corredor corredor2 = new Corredor(10, 1);	
	Andar andar1 = new Andar(2,0,Arrays.asList(corredor1, corredor2));
	Corredor corredor3 = new Corredor(5, 0);	
	Corredor corredor4 = new Corredor(9, 1);	
	Andar andar2 = new Andar(2,1,Arrays.asList(corredor3, corredor4));
	
	Garagem garagem = new Garagem(1,0,Arrays.asList(andar1, andar2));
	
	assertEquals(0, garagem.totalArrecadado());
	}

}
