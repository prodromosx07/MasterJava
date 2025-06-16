public class Rectangle {
    int height = 1;
    int width = 1;

    public Rectangle(int h, int w){
        height = h;
        width = w;
    }
    public void setHeight(int h){
        height = h;
    }

    public void setWidth(int w){
        width = w;
    }

    public int multiplyHeightAndWidth(){
        int result = width * height;
        return result;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }
}
