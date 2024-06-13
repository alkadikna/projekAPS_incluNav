public class PencarianLokasi {
    private GoogleAPI googleAPI;

    public PencarianLokasi(GoogleAPI googleAPI) {
        this.googleAPI = googleAPI;
    }

    public Lokasi cari(String nama) {
        return googleAPI.getLokasi(nama);
    }
}
