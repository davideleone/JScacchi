/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Alfiere extends Pedina{
    public Alfiere(Colore sfondo,int x,int y, Pezzi pezzo,Colore col_pezzo){
        //super(sfondo,x,y,pezzo,col_pezzo);
        super(sfondo,x,y,col_pezzo);
    }
    public int getMovimentotX(){
        return getRiga();
    }
    public int getMovimentoY(){
        return getColonna();
    }
}
