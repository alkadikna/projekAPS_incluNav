public class PenentuanRute {
    private GoogleAPI googleAPI;

    public PenentuanRute(GoogleAPI googleAPI) {
        this.googleAPI = googleAPI;
    }

    public Rute tentukan(Lokasi start, Lokasi end) {
        return googleAPI.getRute(start, end);
    }
}
