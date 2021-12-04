package lab8p2_franciscogarcia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminPartida {
    
    private ArrayList <Partida> partidas = new ArrayList();
    private File archivo;

    public adminPartida(String path) {
        archivo = new File(path);
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "partidas=" + partidas;
    }
    
    public void setPartidas(Partida a){
        partidas.add(a);
    }
    
    public void cargarArchivo() {
        try {
            partidas = new ArrayList();
            Partida temp;
            System.out.println("I");
            if (archivo.exists()) {
                    System.out.println("I");
                ObjectInputStream objeto = new ObjectInputStream(new FileInputStream("./partidas.cmb"));
                System.out.println("I");
                try {
                    System.out.println("I");
                    while ((temp = (Partida) objeto.readObject()) != null) {
                        partidas.add(temp);
                        System.out.println(temp.toString());
                    }
                    System.out.println("E");
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Partida e : partidas) {
                bw.writeObject(e);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {

            }
        }
    }

}
