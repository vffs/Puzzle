
package puzzle;

import java.util.ArrayList;

/**
 *
 * @author valeria
 */
public class BuscaPuzzle { 
    private static ArrayList<Puzzle> gerarFilhos(ArrayList<Puzzle> nos,Puzzle no){
         
        //checando se é para ir direita
        if(no.getYvazia()+1 < Puzzle.COLUNA){
            
            nos.add(new Puzzle(no, Direcao.DIREITA));
        }
         //checando se é para ir esquerda
        if(no.getYvazia()-1 >=Puzzle.VAZIA){
            nos.add(new Puzzle(no, Direcao.ESQUERDA));     
        }
         //checando se é para ir para cima
        if(no.getXvazia()-1 >= Puzzle.VAZIA){
            nos.add(new Puzzle(no, Direcao.CIMA));
        
        }
        //checando se é para ir para baixo
        if(no.getXvazia()+1 < Puzzle.LINHA){
            nos.add(new Puzzle(no, Direcao.BAIXO));
        }
        return nos;
    }
    
    public static void main(String[]args){
        int [][] obj= {{0 ,1 ,2},{3, 4 ,5}, {6, 7, 8 }}; 
        Puzzle objetivo = new Puzzle (obj);
       int [][] ini= {{0 ,1 ,2},{3, 4 ,5}, {6, 7, 8 }}; //Opção 1
       //int [][] ini = {{6 ,4 ,2},{8, 1 ,3}, {7, 5, 0 }}; //Opção 3
       //int [][] ini = {{4 ,6 ,2},{8, 1 ,3}, {7, 5, 0 }}; // sem solução
       // int [][] ini = {{3 ,1 ,2},{4, 7 ,5}, {6, 8, 0 }}; //Opção 2 
       // int [][] ini = {{3 ,8 ,1},{7, 5, 2}, {4, 0, 6 }};//Opção 4
        Puzzle inicial = new Puzzle (ini);
        Puzzle no;
        ArrayList<Puzzle> nos = new ArrayList();
        ArrayList<Puzzle>visitados = new ArrayList();
        boolean ehObjetivo = false;
        nos.add(inicial);
        
        do{
               
                no=nos.remove(0);
                ehObjetivo = no.equals(objetivo);
                    if(!ehObjetivo && !visitados.contains(no)){
                        visitados.add(no);
                        nos = gerarFilhos(nos,no);
                    } 

        }  while(!nos.isEmpty()&& !ehObjetivo);
        
        if(ehObjetivo){
            System.out.println("Parabéns você chegou no objetivo! ");
            System.out.println("Foram necessários "+nos.size()+" nó(s) para encontrar a solução");
            System.out.println("Foram necessários "+visitados.size()+" nó(s) para encontrar a solução");             
                
              int op=1;
              /*
              se op 1 ==  int[][] ini={{0 ,1 ,2},{3, 4 ,5}, {6, 7, 8 }};
              Se op 2 ==  int[][] ini={{3 ,1 ,2},{4, 7 ,5}, {6, 8, 0 }};
              se op 3 ==  int[][] ini={{6 ,4 ,2},{8, 1 ,3}, {7, 5, 0 }};
              Se op 4 ==  int[][] ini = {{3 ,8 ,1},{7, 5, 2}, {4, 0, 6 }};  
              */
              
              
              switch(op){
                  case 1:
                       no.imprimirMatriz();
                      break;
                  case 2:
                      no.imprimirMatriz();
                      no.getPai().imprimirMatriz();
                      no.getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().imprimirMatriz();
                      break;
                  case 3:
                      
                      no.imprimirMatriz();
                      no.getPai().imprimirMatriz();
                      no.getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      break;
              case 4:
                      no.imprimirMatriz();
                      no.getPai().imprimirMatriz();
                      no.getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      no.getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().getPai().imprimirMatriz();
                      
                  break;
                              
                              
              }
              
               
         
        }
        else{
            System.out.println("Não foi possivel encontrar uma solução!");
             System.out.println(":( ");
        }

    }
}
