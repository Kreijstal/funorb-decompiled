/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class qd {
    private static int field_a;
    private static boolean field_b;
    private static String field_d;
    private static Hashtable field_c;
    private static String field_e;

    public static void a(int param0, int param1, String param2) {
        Exception exception = null;
        Object var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == -1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = null;
                    qd.a(107, 107, (String) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    field_e = param2;
                    field_a = param1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        field_d = System.getProperty("user.home");
                        if (null == field_d) {
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
                        field_d = field_d + "/";
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
                    field_b = true;
                    if (null == field_d) {
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
                    field_d = "~/";
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(int param0, String param1, String param2, boolean param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param2);
    }

    private qd() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1) {
        Object var3 = null;
        if (param1 != -19005) {
          var3 = null;
          qd.a(107, -10, (String) null);
          return qd.a(field_a, field_e, param0, true);
        } else {
          return qd.a(field_a, field_e, param0, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_c = new Hashtable(16);
    }
}
