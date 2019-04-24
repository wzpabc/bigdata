import java.util.Properties;

public class test {


    private void a() {

        String file = null;
        String conf = (file == null) ? "" : file;

        Properties prop = new Properties();

        this.getClass().getClassLoader().getResourceAsStream("");
        for (Object key : prop.keySet()
        ) {
            System.out.println(key + "=" + prop.get(key));
        }
    }
}
