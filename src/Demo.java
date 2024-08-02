import editor.Editor;
import subscribers.EmailNotificationListener;
import subscribers.LogOpenListener;

public class Demo {
    public static void main(String[] args)
    {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("src/demofile"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@gmail.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
