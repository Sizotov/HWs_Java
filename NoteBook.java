public class NoteBook {
    int ram;
    int hdd;
    String os;
    String color;

    public NoteBook (int ram, int hdd, String os, String color){
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public int getHDD(){
        return hdd;
    }
    public void setHDD(int hdd){
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
