package animalsniffer;

import bytecode.Display;

import org.apache.commons.lang3.*;

/**
 * Lance Display puis exécute du code dépendant d'une API du JDK 7.
 */
public class Main extends Display
{

    public static void main( String... args )
        throws Exception
    {
        new Main().run();

        callJava7API( args );
    }

    private static void callJava7API( String... args )
        throws Exception
    {
      System.out.println(StringUtils.appendIfMissing("abc", "xyz", "mno"));
      System.out.println(StringUtils.appendIfMissing("abcxyz", "xyz", "mno"));
      System.out.println(StringUtils.appendIfMissing("abcmno", "xyz", "mno"));
      System.out.println(StringUtils.appendIfMissing("abcXYZ", "xyz", "mno"));
        // String.join is added in J8
        System.out.println( esc( "96" ) + esc( "0" ) );
    }
}
