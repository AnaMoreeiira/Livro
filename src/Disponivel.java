// Ana Carolina Moreira da Silva-RA:2418169


import java.util.Scanner;

public class Disponivel extends Livro{
    String plateleira;
    int quantidade;
    int corredor; 
   
public Disponivel (){
    plateleira = " ";
    quantidade = 0;
    corredor = 0;
}

    public Disponivel(String plateleira, int quantidade, int corredor) {
        this.plateleira = plateleira;
        this.quantidade = quantidade;
        this.corredor = corredor;
    }

    public String getPlateleira() {
        return plateleira;
    }

    public void setPlateleira(String plateleira) {
        this.plateleira = plateleira;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCorredor() {
        return corredor;
    }

    public void setCorredor(int corredor) {
        this.corredor = corredor;
    }
    


    
}
