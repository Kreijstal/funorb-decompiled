/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class kj {
    private static String field_e;
    private static String field_c;
    private static int field_a;
    private static Hashtable field_b;
    private static boolean field_d;

    public static File a(int param0, String param1) {
        if (param0 != 20926) {
            field_e = null;
            return kj.a(field_e, -2, field_a, param1);
        }
        return kj.a(field_e, -2, field_a, param1);
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    public static void a(String param0, int param1, boolean param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_e = param0;
                    field_a = param1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_c = System.getProperty("user.home");
                        if (field_c != null) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (field_c != null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        field_c = "~/";
                        field_d = param2;
                        return;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_d = param2;
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_c = field_c + "/";
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (field_c == null) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_d = param2;
                    return;
                }
                case 8: {
                    field_c = "~/";
                    field_d = param2;
                    return;
                }
                case 10: {
                    var3 = (Exception) (Object) caughtException;
                    if (field_c == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    field_d = param2;
                    return;
                }
                case 12: {
                    field_c = "~/";
                    field_d = param2;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private kj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_b = new Hashtable(16);
    }
}
