public class ImageStorage {
    public void store(String fileName, ImageCompressor compressor, ImageFilter filter){
        // Compress Image depending on specified compressor [PNG,JPEG,...]
        compressor.compress(fileName);
        // Apply Filter
        filter.applyFilter(fileName);
    }
}
