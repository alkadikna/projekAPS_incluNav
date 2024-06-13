public class Navigasi {
    private PencarianLokasi pencarianLokasi;
    private PenentuanRute penentuanRute;

    public Navigasi(GoogleAPI googleAPI) {
        this.pencarianLokasi = new PencarianLokasi(googleAPI);
        this.penentuanRute = new PenentuanRute(googleAPI);
    }

    public Lokasi cariLokasi(String nama) {
        return pencarianLokasi.cari(nama);
    }

    public Rute tentukanRute(Lokasi start, Lokasi end) {
        return penentuanRute.tentukan(start, end);
    }
}
