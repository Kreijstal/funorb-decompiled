/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class e {
    private static int field_c;
    private static Hashtable field_a;
    private static boolean field_b;
    private static String field_e;
    private static String field_d;

    public static File a(int param0, String param1) {
        if (param0 != 0) {
            return null;
        }
        return e.a(param1, field_d, -8204, field_c);
    }

    public static void a(int param0, String param1, int param2) {
        Exception exception = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_d = param1;
                    field_c = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_e = System.getProperty("user.home");
                        if (field_e == null) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_e = field_e + "/";
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    exception = (Exception) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    field_b = true;
                    if (param2 != -19960) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (null != field_e) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_e = "~/";
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private e() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, String param1, int param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = new Hashtable(16);
    }
}
