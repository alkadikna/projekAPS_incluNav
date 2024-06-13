public class MainTest {
    public static void main(String[] args) {
        GoogleAPI mockAPI = new MockGoogleAPI();
        Navigasi navigasi = new Navigasi(mockAPI);

        // Test cariLokasi
        Lokasi lokasi = navigasi.cariLokasi("Lokasi A");
        if (lokasi != null && "Lokasi A".equals(lokasi.getNama())) {
            System.out.println("Test cariLokasi PASSED");
        } else {
            System.out.println("Test cariLokasi FAILED");
        }

        // Test tentukanRute
        Lokasi start = new Lokasi();
        start.setNama("Lokasi A");
        Lokasi end = new Lokasi();
        end.setNama("Lokasi B");
        Rute rute = navigasi.tentukanRute(start, end);
        if (rute != null && rute.getStart().getNama().equals("Lokasi A") && rute.getEnd().getNama().equals("Lokasi B")) {
            System.out.println("Test tentukanRute PASSED");
        } else {
            System.out.println("Test tentukanRute FAILED");
        }
    }
}

