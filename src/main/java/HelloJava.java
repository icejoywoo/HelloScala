import java.io.UnsupportedEncodingException;

/**
 * Created by icejoywoo on 14-7-5.
 */
public class HelloJava {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Hello, World!");
        System.out.println("단국대 홍보팀");
        String a = "\202\071\204\063\202\067\202\071\206\067 \203\066\234\064\203\061\211\065\203\065";
        String b = "단국대 홍보팀";
        System.out.println(new String(a.getBytes(), "gb18030"));
        System.out.println(new String(b.getBytes(), "gb18030").getBytes());
    }
}
