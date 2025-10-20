import java.io.File;

public class Repo {

    // initializes repo, .gitlet folder created
    public static void init() {
        File file = new File("./.gitlet");
        file.mkdirs();
    }

    // reset folder to normal for testing
    public static void reset() {
        File file = new File("./.gitlet");
        file.delete();
    }
}