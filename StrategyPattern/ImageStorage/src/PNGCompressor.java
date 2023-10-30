public class PNGCompressor implements ImageCompressor{
    @Override
    public boolean compress(String fileName){
        System.out.println("Image Compressed Using PNG Format!");

        return true;
    }
}
