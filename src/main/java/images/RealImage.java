package images;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displayed");
    }

    public void loadFromDisk() {
        System.out.println("file " + filename + " has been loaded from disk");
    }
}
