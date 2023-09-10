// Ana Carolina Moreira da Silva-RA:2418169


public abstract class Livro  {
    private String nomeLivro;
    private String editora;
    private String disciplina; 
    private int idLivro;
    private int volume;
    
public Livro(){
    nomeLivro = " ";
    editora = " ";
    disciplina = " ";
    idLivro = 0;
    volume = 0;    
} 

    public Livro(String nome_livro, String editora, String disciplina, int id_livro, int volume) {
        this.nomeLivro = nome_livro;
        this.editora = editora;
        this.disciplina = disciplina;
        this.idLivro = id_livro;
        this.volume = volume;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void retorno(){
            System.out.println("Nome:"+nomeLivro+"\nEditora:"+editora+"\nDisciplina:"+disciplina+"\nIDentificador:"+idLivro+"\nVolume:"+volume);
    
    }

   
    
}
