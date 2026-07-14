/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nh {
    private static String field_b;
    private static Hashtable field_d;
    private static int field_e;
    private static String field_c;
    private static boolean field_a;

    public static File a(String param0, int param1) {
        if (param1 >= -125) {
            field_c = null;
            return nh.a(param0, field_b, field_e, (byte) 110);
        }
        return nh.a(param0, field_b, field_e, (byte) 110);
    }

    public static void a(int param0, String param1, int param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_e = param0;
                    field_b = param1;
                    if (param2 == 25617) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        field_c = System.getProperty("user.home");
                        if (field_c != null) {
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
                        if (null == field_c) {
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
                        field_c = "~/";
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
                        field_a = true;
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_c = field_c + "/";
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    if (null == field_c) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_c = "~/";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    field_a = true;
                    return;
                }
                case 12: {
                    var3 = (Exception) (Object) caughtException;
                    if (null == field_c) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    field_c = "~/";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    field_a = true;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(String param0, String param1, int param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param0);
    }

    private nh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_d = new Hashtable(16);
    }
}
