package tpAnual;

import java.io.BufferedReader;
import java.io.FileReader;

public class ExternoEntidadesBancarias{

	public BufferedReader consultar(String palabra){
        try {
                BufferedReader reader = new BufferedReader(new FileReader("bancos.json"));
                return reader;
                 
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
	
}