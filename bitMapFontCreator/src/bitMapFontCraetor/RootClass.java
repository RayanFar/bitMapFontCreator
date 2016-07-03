package bitMapFontCraetor;

import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author yn
 */
public class RootClass {

    static String fontName = "B yekan";
    static int fontSize = 128;
    static int imageSize = 2560;
    static int paddingX = 20;
    static int paddingY = 50;
    static int letterSpacing = 0;
    static String fileName = "image";
    static int style = Font.PLAIN;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        show_info();

        System.out.print(">>>   font name (B font family):");
        fontName = sc.nextLine();
        System.out.print(">>>   font size (btwin 2-128):");
        fontSize = sc.nextInt();
        System.out.print(">>>   outPut file name (anything):");
        fileName = sc.next();
        System.out.print(">>>   style (plain=0 bold=1 italic=2 ):");
        style = sc.nextInt();

        try {
            AngelFont ang = FontCreator.buildFont(fontName, fileName, imageSize, fontSize, style, paddingX, paddingY, letterSpacing, false);

            System.out.println(">>>   trying to write Image file ...");
            File f = new File(BaseDir(new RootClass()) + fileName + ".png");
            ImageIO.write(ang.getImage(), "png", f);

            System.out.println(">>>   trying to write .fnt file ...");
            String fntFile = new String(BaseDir(new RootClass()) + fileName + ".fnt");
            writeToFile(ang.getDescription(), fntFile);

            System.out.println(">>>   font created successfully !");

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public static void writeToFile(String text, String targetFilePath) throws IOException {
        Path targetPath = Paths.get(targetFilePath);
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        Files.write(targetPath, bytes, StandardOpenOption.CREATE);
    }

    public static String BaseDir(Object c) {
        try {
            return new File(c.getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParentFile().getAbsolutePath() + File.separator;
        } catch (URISyntaxException ex) {
            return "not find";
        }
    }

    public static void show_info() {
        System.out.println("");
        System.out.println(">>>   bitMap Font Creator for JME 3.0+");
        System.out.println(">>>   by yn97 - version 1.0 - 2016 unlicense");
        System.out.println(">>>   export directory " + BaseDir(new RootClass()));

    }
}
