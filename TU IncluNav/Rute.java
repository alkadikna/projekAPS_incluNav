public class Rute {
    private int id;
    private Lokasi start;
    private Lokasi end;
    private double jarak;
    private double waktu;
    private String directions;
    private String aksesibilitas;

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Lokasi getStart() { return start; }
    public void setStart(Lokasi start) { this.start = start; }
    public Lokasi getEnd() { return end; }
    public void setEnd(Lokasi end) { this.end = end; }
    public double getJarak() { return jarak; }
    public void setJarak(double jarak) { this.jarak = jarak; }
    public double getWaktu() { return waktu; }
    public void setWaktu(double waktu) { this.waktu = waktu; }
    public String getDirections() { return directions; }
    public void setDirections(String directions) { this.directions = directions; }
    public String getAksesibilitas() { return aksesibilitas; }
    public void setAksesibilitas(String aksesibilitas) { this.aksesibilitas = aksesibilitas; }
}
