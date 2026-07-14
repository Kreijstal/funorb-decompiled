/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class wm {
    private static String field_e;
    private static String field_a;
    private static boolean field_c;
    private static Hashtable field_b;
    private static int field_d;

    public static File a(String param0, int param1, byte param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    public static void a(String param0, boolean param1, int param2) {
        Exception exception = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_a = param0;
                    field_d = param2;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_e = System.getProperty("user.home");
                        if (null == field_e) {
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
                    if (field_e == null) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    field_c = param1;
                    return;
                }
                case 7: {
                    field_e = "~/";
                    field_c = param1;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(int param0, String param1) {
        if (param0 != 8244) {
            field_b = null;
            return wm.a(field_a, field_d, (byte) 26, param1);
        }
        return wm.a(field_a, field_d, (byte) 26, param1);
    }

    private wm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_b = new Hashtable(16);
    }
}
