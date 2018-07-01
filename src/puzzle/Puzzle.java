
package puzzle;

/**
 *
 * @author valeria
 */

public class Puzzle {
    
    private Puzzle pai;
    private int [][] matriz; 
    private int xvazia, yvazia;
    
    public final static int VAZIA=0;  
    public final static int LINHA =3;
    public final static int COLUNA=3;
    

    public Puzzle getPai() {
        return pai;
    }

    public int getXvazia() {
        return xvazia;
    }

    public int getYvazia() {
        return yvazia;
    }
    
     
    public Puzzle( Puzzle pai,Direcao dir){
         this.pai= pai;
         int  i, j;
         
         this.matriz = new int[LINHA][COLUNA];
         for( i=0;i<LINHA;i++){
           for( j=0;j<COLUNA;j++){
               this.matriz[i][j]=pai.matriz[i][j];
                
               }
           } 
        
         switch(dir){
             case DIREITA:
                 this.yvazia=this.pai.yvazia+1;
                 this.xvazia=this.pai.xvazia;
                 break;
             case ESQUERDA:
                 this.yvazia=this.pai.yvazia-1;
                 this.xvazia=this.pai.xvazia;
                 break;
             case CIMA:
                 this.yvazia=this.pai.yvazia;
                 this.xvazia=this.pai.xvazia-1;
                 break;
             case BAIXO:
                 this.yvazia=this.pai.yvazia;
                 this.xvazia=this.pai.xvazia+1;
                 
                 break;
         }
         this.matriz[this.pai.xvazia][this.pai.yvazia] = this.matriz[this.xvazia][this.yvazia];
         this.matriz[this.xvazia][this.yvazia]= VAZIA;        
                 
         
     }
    
    public Puzzle(int [][] estado){
        this.pai = null;
        this.matriz=estado;
        for(int i=0;i<LINHA;i++){
            for(int j=0;j<COLUNA;j++){
               // this.matriz[i][j] = estado[i][j];
                if(estado[i][j]==VAZIA){
                    this.xvazia=i;
                    this.yvazia=j;
                }
            }
        }
       
        
        
    }
  
    @Override
    public boolean equals(Object objeto){
       Puzzle p=(Puzzle)objeto;
     
        for(int i=0;i<LINHA;i++){
           for(int j=0;j<COLUNA;j++){
               if(this.matriz[i][j]!=p.matriz[i][j]){
                   return false;
               }
                
            }
        } 
        return true;
        
    }
    public void imprimirMatriz(){
        
         for(int i=0;i<LINHA;i++){
               System.out.println(" ");
           for(int j=0;j<COLUNA;j++){
               System.out.print(matriz[i][j]);
               System.out.print(" | ");  
                              
            }
        }
           System.out.println(" ");
    }
    
 
    
 }
    
   



