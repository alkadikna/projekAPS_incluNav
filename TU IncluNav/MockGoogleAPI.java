public class MockGoogleAPI implements GoogleAPI {
    @Override
    public Rute getRute(Lokasi start, Lokasi end) {
        Rute rute = new Rute();
        rute.setStart(start);
        rute.setEnd(end);
        rute.setJarak(10.0);
        rute.setWaktu(15.0);
        rute.setDirections("Mock directions from " + start.getNama() + " to " + end.getNama());
        rute.setAksesibilitas("Mock aksesibilitas");
        return rute;
    }

    @Override
    public Lokasi getLokasi(String nama) {
        Lokasi lokasi = new Lokasi();
        lokasi.setNama(nama);
        lokasi.setLatitude(-6.200000);
        lokasi.setLongitude(106.816666);
        lokasi.setAksesibilitas("Mock aksesibilitas");
        return lokasi;
    }
}
