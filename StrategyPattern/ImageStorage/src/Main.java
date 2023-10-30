public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("file1",new JPEGCompressor(),new BWFilter());
        imageStorage.store("file2",new PNGCompressor(), new BWFilter());
    }
}