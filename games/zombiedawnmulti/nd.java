/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nd {
    private static boolean field_c;
    private static String field_a;
    private static Hashtable field_d;
    private static String field_b;
    private static int field_e;

    private nd() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    public static void a(String param0, int param1, int param2) {
        Exception exception = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param2 == -7682) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    field_e = param1;
                    field_b = param0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        field_a = System.getProperty("user.home");
                        if (field_a == null) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_a = field_a + "/";
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    exception = (Exception) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (null == field_a) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    field_c = true;
                    return;
                }
                case 9: {
                    field_a = "~/";
                    field_c = true;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(String param0, int param1) {
        Object var3 = null;
        if (param1 != 0) {
          var3 = null;
          File discarded$2 = nd.a((String) null, -93);
          return nd.a(param0, -25157, field_b, field_e);
        } else {
          return nd.a(param0, -25157, field_b, field_e);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_d = new Hashtable(16);
    }
}
