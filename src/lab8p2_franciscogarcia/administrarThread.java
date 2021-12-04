package lab8p2_franciscogarcia;

import javax.swing.JProgressBar;

public class administrarThread extends Thread{
    
    private JProgressBar barra;
    private boolean avanzar, vive;
    private int end, velocidad;
    
    public administrarThread(JProgressBar barra, int end, int velocidad) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        this.end = end;
        this.velocidad = velocidad;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        
        barra.setMaximum(end);
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue() + velocidad);
                if(barra.getValue()>= end){
                    vive = false;
                }
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){                
            }
        }
    }
    
    
}
