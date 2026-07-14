/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class s {
    private static boolean field_d;
    private static String field_a;
    private static String field_c;
    private static int field_e;
    private static Hashtable field_b;

    public static void a(int param0, String param1, boolean param2) {
        Exception exception = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_a = param1;
                    field_e = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_c = System.getProperty("user.home");
                        if (field_c == null) {
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
                        field_c = field_c + "/";
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
                    if (param2) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (field_c != null) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_c = "~/";
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

    private s() throws Throwable {
        throw new Error();
    }

    public static File a(boolean param0, String param1) {
        if (!param0) {
            field_e = 92;
            return s.a(param1, field_a, field_e, (byte) -45);
        }
        return s.a(param1, field_a, field_e, (byte) -45);
    }

    public static File a(String param0, String param1, int param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_b = new Hashtable(16);
    }
}
