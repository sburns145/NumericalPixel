import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws IOException, AWTException {
    //Robot robot = new Robot();
    File inFile = new File("testDigit0.png");
    BufferedImage image = ImageIO.read(inFile);
    int w = image.getWidth();
    int h = image.getHeight();
    System.out.println(w);
    int[][] rgbArray = new int[8][8];
    for(int i = 0; i < w; i++) {
      for(int j = 0; j < h; j++) {
        Color c = new Color(image.getRGB(i, j));
       
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        System.out.print("(" + i + "," + j + "): ");
        System.out.println( r + " " + g + " " + b);
        rgbArray[i][j] = (int)(15*(1.0-(1.0*r + g + b)/(255*3)));
      }
    }
    for(int i = 0; i < w; i++) {
      System.out.println();
      for(int j = 0; j < h; j++) {
        System.out.print(rgbArray[i][j] + ", ");
      }
    }

  }
}