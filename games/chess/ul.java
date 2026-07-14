/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ul {
    private static boolean field_b;
    private static Hashtable field_e;
    private static String field_a;
    private static int field_c;
    private static String field_d;

    private ul() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, String param1, int param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 21747) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_c = -58;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    field_a = param1;
                    field_c = param2;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        field_d = System.getProperty("user.home");
                        if (field_d != null) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == field_d) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_d = "~/";
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_b = true;
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_d = field_d + "/";
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    if (null == field_d) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    field_d = "~/";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_b = true;
                    return;
                }
                case 13: {
                    var3 = (Exception) (Object) caughtException;
                    if (null == field_d) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    field_d = "~/";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    field_b = true;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(byte param0, String param1) {
        if (param0 >= -49) {
            field_e = null;
            return ul.a(field_a, field_c, param1, (byte) 86);
        }
        return ul.a(field_a, field_c, param1, (byte) 86);
    }

    public static File a(String param0, int param1, String param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_e = new Hashtable(16);
    }
}
