/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class la {
    private static int field_d;
    private static String field_a;
    private static String field_b;
    private static boolean field_c;
    private static Hashtable field_e;

    public static void a(byte param0, int param1, String param2) {
        Exception exception = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_d = param1;
                    field_a = param2;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_b = System.getProperty("user.home");
                        if (null == field_b) {
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
                    var3 = 9 % ((param0 - 7) / 47);
                    field_c = true;
                    if (null == field_b) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    field_b = "~/";
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(String param0, int param1) {
        int var2 = 124 / ((param1 - 66) / 59);
        return la.a(param0, field_a, false, field_d);
    }

    private la() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, String param1, boolean param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_e = new Hashtable(16);
    }
}
