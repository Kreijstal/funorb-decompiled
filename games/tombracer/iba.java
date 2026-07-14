/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class iba {
    private static boolean field_b;
    private static String field_c;
    private static String field_e;
    private static int field_a;
    private static Hashtable field_d;

    public static File a(String param0, byte param1) {
        if (param1 > -67) {
            return null;
        }
        return iba.a(field_e, param0, 0, field_a);
    }

    public static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_e = param2;
                    field_a = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_c = System.getProperty("user.home");
                        var3_int = -103 % ((51 - param1) / 60);
                        if (field_c == null) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_c = field_c + "/";
                        field_b = true;
                        if (null != field_c) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        field_c = "~/";
                        return;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    field_b = true;
                    if (null == field_c) {
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
                    field_c = "~/";
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(String param0, String param1, int param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param1);
    }

    private iba() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_d = new Hashtable(16);
    }
}
