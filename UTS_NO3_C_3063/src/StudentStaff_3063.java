
public class StudentStaff_3063 extends Mahasiswa_3063 {
    int jamKerja_3063;
    String unitKerja_3063;
    
    public double totalPendapatan_3063(){
        return (jamKerja_3063 * 30000);
    }
    public void tampilDataStudentStaff_3063(){
        super.tampilDataMhs_3063();
        System.out.println(" Unit Kerja : " + unitKerja_3063);
        System.out.println(" Jam Kerja : " +jamKerja_3063);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan_3063());
    }
}
