import java.util.ArrayList;

public class RekomendasiPenghematan {
    public void tampilkanRekomendasi(ArrayList<Perangkat> perangkat) {
        for (Perangkat p : perangkat) {
            if (!p.isStatus()) {
                System.out.println("Matikan perangkat: " + p.getNama() + " jika tidak digunakan.");
            }
        }
    }
}