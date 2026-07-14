/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class c {
    private static int field_e;
    private static boolean field_c;
    private static String field_d;
    private static String field_b;
    private static Hashtable field_a;

    public static void a(int param0, int param1, String param2) {
        Exception exception = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_e = param0;
                    field_d = param2;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_b = System.getProperty("user.home");
                        if (field_b == null) {
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
                        field_b = field_b + "/";
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
                    field_c = true;
                    if (param1 <= 43) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (field_b != null) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_b = "~/";
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

    public static File a(String param0, int param1, String param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    public static File a(String param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return c.a(param0, field_e, field_d, (byte) -6);
    }

    private c() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_a = new Hashtable(16);
    }
}
