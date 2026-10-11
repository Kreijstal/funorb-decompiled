/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class PlatformSupport005 {
    private static int integerState0550;
    private static String stringState0379;
    private static Hashtable hashtableState0001;
    private static boolean booleanState0125;
    private static String stringState0380;

    private PlatformSupport005() throws Throwable {
        throw new Error();
    }

    public static File computeFile1318(int integerArgument1, String stringArgument2) {
        if (integerArgument1 != 0) {
          stringState0379 = (String) null;
          return PlatformSupport005.computeFile1320(stringState0379, 30869, stringArgument2, integerState0550);
        }
        return PlatformSupport005.computeFile1320(stringState0379, 30869, stringArgument2, integerState0550);
    }

    public static File computeFile1320(String stringArgument1, int integerArgument2, String stringArgument3, int integerArgument4) {
        return net.alterorb.launcher.Hook.cacheRedirect(stringArgument1, stringArgument3);
    }

    public static void performAction1319(int integerArgument1, String stringArgument2, int integerArgument3) {
        Exception exceptionLocal1 = null;
        Throwable caughtExceptionLocal2 = null;
        stringState0379 = stringArgument2;
        integerState0550 = integerArgument1;
        try {
          stringState0380 = System.getProperty("user.home");
          if (null == stringState0380) {
            booleanState0125 = true;
            if (integerArgument3 != 7154) {
              return;
            }
            if (null == stringState0380) {
              stringState0380 = "~/";
            }
            return;
          }
          stringState0380 = stringState0380 + "/";
        } catch (java.lang.Exception caughtParameterLocal3) {
          caughtExceptionLocal2 = caughtParameterLocal3;
          exceptionLocal1 = (Exception) (Object) caughtExceptionLocal2;
          booleanState0125 = true;
          if (integerArgument3 != 7154) {
            return;
          }
          if (null == stringState0380) {
            stringState0380 = "~/";
          }
          return;
        }
        booleanState0125 = true;
        if (integerArgument3 != 7154) {
          return;
        }
        if (null == stringState0380) {
          stringState0380 = "~/";
        }
    }

    static {
        booleanState0125 = false;
        hashtableState0001 = new Hashtable(16);
    }
}
