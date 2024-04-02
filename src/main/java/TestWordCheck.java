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


        this.tablesMap = new HashMap<>();  // Map init, collet or not?. Need your help or not.

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
        new TestWordCheck("ADMIN");  // Need your help or not.
    }
}
