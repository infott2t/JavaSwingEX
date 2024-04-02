import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//How about this~. Let's make~. Yours~. Funny day~. Thank you.
// https://github.com/infott2t/JavaSwingEX/wiki  wiki quiz~.
public class TestWordCheck {

    String[] KeysInputStrs;
    String[] TablesAllStrs;

    Map<String, String[]> tablesMap;
    String[] resultUsingTables;


    TestWordCheck(String key){
        this.KeysInputStrs = new String[]{"ADMIN", "SHOPPER", "USER"}; // input words. Key.
        this.TablesAllStrs = new String[]{"user_info", "user", "shop_info", "service1Name", "service2Name", "service3Name"}; // input words. Table.


        this.tablesMap = new Map<String, String[]>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public String[] get(Object key) {
                return new String[0];
            }

            @Override
            public String[] put(String key, String[] value) {
                return new String[0];
            }

            @Override
            public String[] remove(Object key) {
                return new String[0];
            }

            @Override
            public void putAll(Map<? extends String, ? extends String[]> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<String[]> values() {
                return null;
            }

            @Override
            public Set<Entry<String, String[]>> entrySet() {
                return null;
            }
        };   // Map init, collet or not?. Need your help or not.

        tablesMap.put("ADMIN", new String[]{"user_info", "user"});
        tablesMap.put("SHOPPER", new String[]{"shop_info"});
        tablesMap.put("USER", new String[]{"service1Name", "service2Name", "service3Name"});

        if("ADMIN".equals(key)) {
            resultUsingTables = tablesMap.get("ADMIN");
            for(int i=0 ; i< resultUsingTables.length ; i++) {
                System.out.println(resultUsingTables[i]);
            }

        } else if("SHOPPER".equals(key)) {


        } else if("USER".equals(key)) {

        }

    }
    public static void main(String[] args) {

        /*
        1. Check the input words. Key. "ADMIN", "SHOPPER", "USER".
        2. Check the input words. Table. Like way. "user_info", "user", "shop_info", "service1Name", "service2Name", "service3Name".
        3. How to run, example new TestWordCheck("ADMIN");, new TestWordCheck("SHOPPER");, new TestWordCheck("USER");.

         */
        //new TestWordCheck("ADMIN");  // Need your help or not.
    }
}
