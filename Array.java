package array;

public class Array {
    String NIK,Nama,TTL,jenis_kelamin;
    int gol_darah;
    public void setNIK(String NIK){
        this.NIK = NIK;
    }
    public String getNIK(){
        return NIK;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return Nama;
    }
    public void setTTL(String TTL){
        this.TTL = TTL;
    }
    public String getTTL(){
        return TTL;
    }
    public void setjenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin = jenis_kelamin;
    }
    public String getjenis_kelamin(){
        return jenis_kelamin;
    }
    public void setgol_darah(int gol_darah){
        this.gol_darah = gol_darah;
    }
    public int getgol_darah(){
        return gol_darah;
    }
}
