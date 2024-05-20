package carrera.hilos;

import javax.swing.JLabel;

/**
 *
 * @author Laurix
 */
public class Carro1 implements Runnable{
    Thread t;
    String nombre;
    JLabel carro;
    JLabel labelFinal;
    
    public static int lugar;
    
    public Carro1 ( String nombre, JLabel carro, JLabel labelFinal){
        this.nombre = nombre;
        this.carro = carro;
        this.labelFinal = labelFinal;
        t = new Thread(this.nombre); //crear hilo
        t.start(); // correr hilo
    }
    
    @Override
    public void  run(){
        int retardo;
        
        try{
            lugar = 1;
            retardo = (int) (Math.random()* 15) +1; //numeros aleatorios entre 1 y 15
            labelFinal.setVisible(false); // no se vean las letras de los carros
            carro.setVisible(true);
            
            for(int i=50; i<= 500; i++){
                carro.setLocation(i,carro.getY());
                Thread.sleep(retardo);
            }
            carro.setVisible(false);
            labelFinal.setVisible(true);
            labelFinal.setText(nombre+"Ha llegado en posición: "+ lugar);
            lugar ++;
            
        }catch(Exception e){
             System.out.println(e.getMessage());
        }
    }
}
