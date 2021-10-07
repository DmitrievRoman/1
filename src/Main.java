
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Date.*;
import java.time.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)  {
        int a = 15272737;
        int b = 73639;
        System.out.println((a/10)%1000);
        System.out.println((b/10)%1000);
    }



    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        String key;
        long value;
        while (scanner.hasNext()){
            key = scanner.next();
            if (key.equals("exit"))
                break;
            value = Long.parseLong(scanner.next());
            if(map.containsKey(key)){
                map.merge(key,value, Long::sum);
            }else{
                map.put(key,value);
            }
        }
        return map;
    }

    public static<T> T a(List<?> list, T t) {
        return t;
    }
}
