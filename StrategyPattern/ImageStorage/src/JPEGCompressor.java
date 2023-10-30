public class JPEGCompressor implements ImageCompressor{
    @Override
    public boolean compress(String fileName) {
        System.out.println("Image Compressed using JPEG Format!");
        return true;
    }
}
