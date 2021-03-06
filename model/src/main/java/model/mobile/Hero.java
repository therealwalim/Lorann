package model.mobile;

import contract.IElement;
import contract.IHero;
import contract.IView;
import contract.MobileOrder;

import model.Element;

import java.awt.*;



/** Class creating the hero extending the Mobile class and using the IHero interface */
public class Hero extends Mobile implements IHero,Runnable{
   
int nbr = 1 ;
    public Hero(Point pos) {

    
    
        super("lorann_b.png", true, pos);
        Thread chronoAiles  = new Thread(this);
chronoAiles.start();
     

    }

        public void move(MobileOrder order, IElement[][] tileMap, IView view)
    {
        switch (order) {
            
            case Left:
                if(this.direction == MobileOrder.Left &&
                        this.pos.y > 0 &&
                        tileMap[this.pos.x][this.pos.y - 1].getPermeability())
                {
                    this.pos.setLocation(
                            this.pos.getX(),
                            this.pos.getY() - 1);
                   
                    this.image = Element.loadSprite("lorann_l.png");

                } else { if(tileMap[this.pos.x][this.pos.y - 1].getPermeability()) {
                this.pos.setLocation(
                            this.pos.getX(),
                            this.pos.getY() - 1);
                    this.image = Element.loadSprite("lorann_l.png");
                  
                   
                }}
                
                break;
            case Right:
                if(this.direction == MobileOrder.Right &&
                        this.pos.y < view.getWidth() / 32 - 1 &&
                        tileMap[this.pos.x][this.pos.y + 1].getPermeability())
                {
                    this.pos.setLocation(
                            this.pos.getX(),
                            this.pos.getY() + 1);
                } else {if(tileMap[this.pos.x][this.pos.y + 1].getPermeability()){
                    this.pos.setLocation(
                            this.pos.getX(),
                            this.pos.getY() + 1);
                    this.image = Element.loadSprite("lorann_r.png");
                  
                    }
                }
                break;
            case Up:
                if(this.direction == MobileOrder.Up &&
                        this.pos.x > 0 &&
                        tileMap[this.pos.x - 1][this.pos.y].getPermeability()) {
                    this.pos.setLocation(
                            this.pos.getX() - 1,
                            this.pos.getY());
                } else {
                if(tileMap[this.pos.x - 1][this.pos.y].getPermeability()){
                        this.pos.setLocation(
                                this.pos.getX() - 1,
                                this.pos.getY());
                    this.image = Element.loadSprite("lorann_u.png"); 
                
                }}
                break;
            case Down:
                if(this.direction == MobileOrder.Down &&
                        this.pos.x < view.getHeight() / 32 - 1 &&
                        tileMap[this.pos.x + 1][this.pos.y].getPermeability()) {
                    this.pos.setLocation(
                            this.pos.getX() + 1,
                            this.pos.getY());
                } else {
                if(tileMap[this.pos.x + 1][this.pos.y].getPermeability()) {
                    this.image = Element.loadSprite("lorann_b.png");
                
                    this.pos.setLocation(
                            this.pos.getX() + 1,
                            this.pos.getY());
                }
                }
                break;
               
               
        
        }
        
        this.direction = order;
      

        
        
        switch (order) {
        
        case Left:
            if(this.direction == MobileOrder.Left )
            {
                
               
                this.image = Element.loadSprite("lorann_l.png");

            
               
            }
            
            break;
        case Right:
            if(this.direction == MobileOrder.Right)
            {
            this.image = Element.loadSprite("lorann_r.png");
            } 
               
              
            break;
        case Up:
            if(this.direction == MobileOrder.Up ) {
            this.image = Element.loadSprite("lorann_u.png"); 
            } 
               
            
            
            break;
        case Down:
            if(this.direction == MobileOrder.Down ) {
                
            
                this.image = Element.loadSprite("lorann_b.png");
            }
            break;
           
           
    
    }
    
    this.direction = order;
        
    }

        
  


public void run() {
while(true) {
if(nbr==1 ) {
     this.image =    Element.loadSprite("lorann_b.png");
       }
       if(nbr==2) {
       this.image =   Element.loadSprite("lorann_bl.png");
       }
       if(nbr==3) {
       this.image = Element.loadSprite("lorann_l.png");
       }
        if(nbr==4) {
        this.image =  Element.loadSprite("lorann_ul.png");
        }
        if(nbr==5) {
        this.image =      Element.loadSprite("lorann_u.png");
       }
       if(nbr==6) {
       this.image =   
Element.loadSprite("lorann_ur.png");
       }
       if(nbr==7) {
       this.image =  Element.loadSprite("lorann_r.png");
       }
       if(nbr==8) {
       this.image =
Element.loadSprite("lorann_br.png");
       }
      if(nbr==8) {
     nbr = 1;
       }
     nbr++;
     
     try {
Thread.sleep(200);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}

        
    
}
     


