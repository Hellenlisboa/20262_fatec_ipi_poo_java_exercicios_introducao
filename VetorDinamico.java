package br.com.hellen;
public class VetorDinamico {
    private int [] elementos;
    private int quantidade;
    private int capacidade;
    private final static int PADRAO_CAPACIDADE_INICIAL = 4;
    public VetorDinamico(){
        this(PADRAO_CAPACIDADE_INICIAL);
        
    }
    main(){
        vetor dinamico v = new VetorDinamico()
        vetor dinamico v1 = new VetorDinamico()
    }
    public VetorDinamico(){
        if(capacidadeInicialDesejada  > 0){
        elementos = new int[PADRAO_CAPACIDADE_INICIAL]{}
        quantidade = 0;
        capacidade = PADRAO_CAPACIDADE_INICIAL;
    }
    else {
        elementos = new int [PADRAO_CAPACIDADE_INICIAL];
        capacidade = PADRAO_CAPACIDADE_INICIAL;

    }
    quantidade = 0;
    }
    public VetorDinamico(){
    
    }
  public void adicionar(int e){
    //arrayindexoutofboundsexceptiondisgrassa
    elementos[quantidade++] =  e ;
}

}
