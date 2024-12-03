package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
	    
	    public static void outPut(Cart anOrder){
	        for (int i=0; i<anOrder.Quatity(); i++){
	            System.out.println(anOrder.getItemsOrdered()[i].toString());
	        }
	    }
	    
	    public static void main(String[] args) {
	        Cart anOrder = new Cart();
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc ("the lion king", "animal", "Roger Aller", 87, 19.95f);
	        anOrder.addDigitalVideoDisc(dvd1);
	        
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc ("Star World", "Science fiction", "G.Lucas", 87, 24.95f);
	        anOrder.addDigitalVideoDisc(dvd2);
	        
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc ("Aladin", "animation", "", 113, 18.8f);
	        anOrder.addDigitalVideoDisc(dvd3);
	        
	        DigitalVideoDisc dvd4 = new DigitalVideoDisc ("Yukiguni", "Story", "Kibutsu", 200, 20.00f);
	        anOrder.addDigitalVideoDisc(dvd4);
	        
	        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science fiction", "Christopher Nolan", 148, 22.50f);
	        anOrder.addDigitalVideoDisc(dvd5);
	         
	        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 25.00f);
	        anOrder.addDigitalVideoDisc(dvd6);
	         
	        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Spirited Away", "Animation", "Hayao Miyazaki", 125, 21.75f);
	        anOrder.addDigitalVideoDisc(dvd7);
	         
	        DigitalVideoDisc dvd8 = new DigitalVideoDisc("The Matrix", "Action", "Wachowski Brothers", 136, 19.95f);
	        anOrder.addDigitalVideoDisc(dvd8);
	         
	        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Interstellar", "Science fiction", "Christopher Nolan", 169, 28.00f);
	        anOrder.addDigitalVideoDisc(dvd9);
	       
	        System.out.println("Total cost is: "+anOrder.totalCost());
	        anOrder.removeDigitalVideoDisc(dvd2);
	        outPut(anOrder);
	    
	    }
	    

	}
