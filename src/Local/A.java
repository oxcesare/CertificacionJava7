/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Local;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author cralducinr
 */
public class A {

    public static void main(String[] args) {
        A a = new A();
        
    }
     
private static void copyFileUsingFileStreams(File source, File dest)
		throws IOException {
	InputStream input = null;
	OutputStream output = null;
	try {
		input = new FileInputStream(source);
		output = new FileOutputStream(dest);
		byte[] buf = new byte[1024];
		int bytesRead;
		while ((bytesRead = input.read(buf)) > 0) {
			output.write(buf, 0, bytesRead);
		}
	} finally {
		input.close();
		output.close();
	}
}
    
    
    public void copiar(File original, File copia) {
        FileInputStream archivoOriginal = null;
        FileOutputStream archivoCopia = null;
        if ((original != null) && (copia != null)) {
            try {
                copia.createNewFile();
                archivoOriginal = new FileInputStream(original);
                archivoCopia = new FileOutputStream(copia);
                //lectura por segmentos de 0.5MB 
                byte buffer[] = new byte[512 * 1024];
                int nbLectura;
                while ((nbLectura = archivoOriginal.read(buffer)) != -1) {
                    archivoCopia.write(buffer, 0, nbLectura);
                }
            } catch (FileNotFoundException fnf) {
            } catch (IOException io) {
            } finally {
                try {
                    archivoOriginal.close();
                } catch (Exception e) {
                }
                try {
                    archivoCopia.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
