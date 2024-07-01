package Codigo;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamReset extends ObjectOutputStream {

    public ObjectOutputStreamReset(OutputStream out) throws IOException {
        super(out);
    }

    public ObjectOutputStreamReset() throws IOException, SecurityException {
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //Se usa este método tanto para escribir como para agregar elementos
        
        File archivo = new File("registroAtletas.bin");
        
        if(archivo.length() == 0){  //Si el archivo está vació
            //Usamos el método de la clase padre ObjectOutputStream
            super.writeStreamHeader();
        }
        else{
            //El archivo no está vacio
            reset();
        }
    }
}