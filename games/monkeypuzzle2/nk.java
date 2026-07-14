/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nk {
    private static boolean field_b;
    private static Hashtable field_a;
    private static String field_e;
    private static int field_c;
    private static String field_d;

    public static File a(int param0, String param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param1);
    }

    public static File a(String param0, int param1) {
        if (param1 != -2) {
            return null;
        }
        return nk.a(-1, param0, field_d, field_c);
    }

    private nk() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, int param1, String param2) {
        Exception var3 = null;
        Object var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_d = param2;
                    field_c = param0;
                    if (param1 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = null;
                    File discarded$2 = nk.a(25, (String) null, (String) null, -32);
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
                        field_b = true;
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
                    field_b = true;
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
                    field_b = true;
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
        field_b = false;
        field_a = new Hashtable(16);
    }
}
