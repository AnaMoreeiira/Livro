/**
 * Ana Carolina Moreira da silva -ra:2418169
 */
import java.util.ArrayList;
import java.util.List;

public class BdLivro {
  private static  List<Disponivel> bdlivro = new ArrayList<Disponivel>();
  private Disponivel livro = new Disponivel();
  
  public List<Disponivel>getbdlivro(){
   return bdlivro;   
  }
public void setbdlivro(List<Disponivel>bdlivro){
    this.bdlivro = bdlivro;
}
public BdLivro(){
}
public Disponivel getDisponivel(){
    return livro;
}
public void setDisponivel(Disponivel livro){
    this.livro = livro;
}
//____________________Cadastra________________
public Disponivel cadLivro(Disponivel disponivel){
    return disponivel; 
}
//______________________Consulta_________________
public Disponivel consLivro(String nomeLivro){
     for(int i=0; i < bdlivro.size();i++){
         if(bdlivro.get(i).getNomeLivro().equals(nomeLivro)){
             return bdlivro.get(i);
         }
     }
     return null;
}
//_____________________________alterar___________________________________
public Disponivel alterarLivro(String altlivro){
    for(int i=0; i < bdlivro.size();i++){
        if(bdlivro.get(i).getNomeLivro().equals(livro.getNomeLivro())){
            livro=(Disponivel) cadLivro(livro);
            bdlivro.set(i, livro);
            return bdlivro.get(i);
        }
    }
 return null;

}
//_____________________________Excluir_________________________________________
public Disponivel excluirlivro(String nomeLivro ){
    livro = consLivro(livro.getNomeLivro());
    if(bdlivro.remove(livro)){
        return livro;
    }
    return null;
}

}