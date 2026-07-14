/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ri {
    private static Hashtable field_a;
    private static String field_c;
    private static int field_b;
    private static boolean field_d;
    private static String field_e;

    private ri() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1) {
        if (param1 != 1) {
            field_e = null;
            return ri.a(-126, field_c, field_b, param0);
        }
        return ri.a(-126, field_c, field_b, param0);
    }

    public static File a(int param0, String param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param3);
    }

    public static void a(String param0, byte param1, int param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_c = param0;
                    field_b = param2;
                    if (param1 == -94) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_d = true;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        field_e = System.getProperty("user.home");
                        if (null != field_e) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == field_e) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_e = "~/";
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_d = true;
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_e = field_e + "/";
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    if (null == field_e) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_e = "~/";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    field_d = true;
                    return;
                }
                case 12: {
                    var3 = (Exception) (Object) caughtException;
                    if (null == field_e) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    field_e = "~/";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    field_d = true;
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
        field_a = new Hashtable(16);
    }
}
