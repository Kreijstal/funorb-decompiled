/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class hu {
    private static int field_a;
    private static String field_b;
    private static boolean field_d;
    private static Hashtable field_c;
    private static String field_e;

    public static File a(String param0, int param1) {
        Object var3 = null;
        if (param1 != 0) {
          var3 = null;
          File discarded$2 = hu.a((String) null, -116);
          return hu.a(field_a, param0, field_e, 1);
        } else {
          return hu.a(field_a, param0, field_e, 1);
        }
    }

    public static File a(int param0, String param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param1);
    }

    private hu() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, int param1, String param2) {
        Exception exception = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_e = param2;
                    if (param0 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_b = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    field_a = param1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        field_b = System.getProperty("user.home");
                        if (field_b == null) {
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
                        field_b = field_b + "/";
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
                    field_d = true;
                    if (null == field_b) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    field_b = "~/";
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_c = new Hashtable(16);
    }
}
