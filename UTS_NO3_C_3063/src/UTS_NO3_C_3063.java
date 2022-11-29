
public class UTS_NO3_C_3063 {

    public static void main(String[] args) {
        //Membuat object menggunakan array
        AsistenPraktikum_3063[] AsPrak_3063 = new AsistenPraktikum_3063[1];
        StudentStaff_3063[] StuStaff_3063 = new StudentStaff_3063[1];
        
        AsPrak_3063[0] = new AsistenPraktikum_3063();
        StuStaff_3063[0] = new StudentStaff_3063();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data nelayan
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                AsPrak_3063[i].nim_3063 = br.readLine();
                System.out.print("Nama             : ");
                AsPrak_3063[i].nama_3063 = br.readLine();
                System.out.print("Jurusan          : ");
                AsPrak_3063[i].jurusan_3063 =br.readLine();
                System.out.print("IPK              : ");
                AsPrak_3063[i].ipk_3063 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                AsPrak_3063[i].mkAsisten_3063 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                AsPrak_3063[i].jmlPertemuan_3063 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data nelayan
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3063 AP : AsPrak_3063){
                AP.tampilDataAsistenPraktikum_3063();
                System.out.println("");
            }

            //mengisi data ke array pada data dokter
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                StuStaff_3063[i].nim_3063 = br.readLine();
                System.out.print("Nama        : ");
                StuStaff_3063[i].nama_3063 = br.readLine();
                System.out.print("Jurusan     : ");
                StuStaff_3063[i].jurusan_3063 =br.readLine();
                System.out.print("IPK         : ");
                StuStaff_3063[i].ipk_3063 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                StuStaff_3063[i].unitKerja_3063 = br.readLine();
                System.out.print("Jam Kerja   : ");
                StuStaff_3063[i].jamKerja_3063 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data dokter
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3063 SS : StuStaff_3063){
                SS.tampilDataStudentStaff_3063();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    }
}
