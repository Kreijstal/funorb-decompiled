/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ug {
    private static int field_e;
    private static String field_b;
    private static Hashtable field_a;
    private static boolean field_d;
    private static String field_c;

    public static void a(int param0, String param1, byte param2) {
        Exception exception = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_e = param0;
                    var3 = 82 / ((-5 - param2) / 57);
                    field_c = param1;
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
                    field_d = true;
                    if (field_b == null) {
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

    private ug() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param0);
    }

    public static File a(String param0, boolean param1) {
        if (param1) {
            return null;
        }
        return ug.a(param0, field_e, -18261, field_c);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_a = new Hashtable(16);
    }
}
