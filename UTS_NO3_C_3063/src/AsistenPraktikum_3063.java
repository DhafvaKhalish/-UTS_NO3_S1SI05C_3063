
public class AsistenPraktikum_3063 extends Mahasiswa_3063 {
    String mkAsisten_3063;
    int jmlPertemuan_3063;
    
    public double totalPendapatan_3063(){
        return(jmlPertemuan_3063 * 50000);
    }
    public void tampilDataAsistenPraktikum_3063() {
        super.tampilDataMhs_3063();
        System.out.println(" Mata Kuliah    : " + mkAsisten_3063);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan_3063);
        System.out.println(" Total Pendapatan : " + totalPendapatan_3063());
        
        
    }
}
