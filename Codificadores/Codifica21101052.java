package Codificadores;

import java.lang.reflect.Array;
import java.util.Base64;

public class Codifica21101052 implements Codifica {

    @Override
    public String getNomeAutor() {
        return "Lucas Dias Nardino";
    }

    @Override
    public String getMatriculaAutor() {
        return "21101052";
    }

    


    @Override
    public String codifica(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    @Override
    public String decodifica(String str) {
        String decodificada = new String(Base64.getDecoder().decode(str));
        return decodificada;
    }
    
}
