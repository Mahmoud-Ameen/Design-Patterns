public class BWFilter implements ImageFilter{
    @Override
    public boolean applyFilter(String fileName){
        System.out.println("Black & White Filter Applied Successfully");
        return true;
    }
}