/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nc {
    private static String field_c;
    private static boolean field_b;
    private static int field_d;
    private static String field_e;
    private static Hashtable field_a;

    public static void a(int param0, int param1, String param2) {
        int var3 = 0;
        Exception var3_ref_Exception = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_e = param2;
                    field_d = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_c = System.getProperty("user.home");
                        if (null != field_c) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == field_c) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_c = "~/";
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = 97 / ((param1 - 69) / 46);
                        field_b = true;
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_c = field_c + "/";
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    if (null == field_c) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    field_c = "~/";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var3 = 97 / ((param1 - 69) / 46);
                    field_b = true;
                    return;
                }
                case 11: {
                    var3_ref_Exception = (Exception) (Object) caughtException;
                    if (null == field_c) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    field_c = "~/";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var3 = 97 / ((param1 - 69) / 46);
                    field_b = true;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param0);
    }

    public static File a(int param0, String param1) {
        if (param0 != 0) {
            return null;
        }
        return nc.a(param1, field_d, field_e, -6665);
    }

    private nc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = new Hashtable(16);
    }
}
