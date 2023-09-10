// Ana  Moreira 
public class Encomendar extends Livro{
    int vol;
    String dis;
    String dataPed;
    String nome;
    
public  Encomendar (){
    dis  = " ";
    dataPed= " ";
    nome =" ";
    vol = 0; 
 }

    public Encomendar(int vol, String dis, String data_ped, String nome) {
        this.vol = vol;
        this.dis = dis;
        this.dataPed = dataPed;
        this.nome = nome;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getDataPed() {
        return dataPed;
    }

    public void setDataPed(String dataPed) {
        this.dataPed = dataPed;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
