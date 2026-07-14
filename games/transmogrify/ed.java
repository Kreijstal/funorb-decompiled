/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ed {
    private static boolean field_a;
    private static String field_e;
    private static Hashtable field_d;
    private static String field_c;
    private static int field_b;

    public static File a(String param0, int param1) {
        if (param1 != 32718) {
            return null;
        }
        return ed.a(51, field_b, param0, field_c);
    }

    public static void a(byte param0, String param1, int param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_b = param2;
                    field_c = param1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_e = System.getProperty("user.home");
                        if (param0 == -4) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (field_e != null) {
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
                        if (null == field_e) {
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
                        field_e = "~/";
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
                        field_a = true;
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_e = field_e + "/";
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    if (null == field_e) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    field_e = "~/";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_a = true;
                    return;
                }
                case 13: {
                    var3 = (Exception) (Object) caughtException;
                    if (null == field_e) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    field_e = "~/";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    field_a = true;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private ed() throws Throwable {
        throw new Error();
    }

    public static File a(int param0, int param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_d = new Hashtable(16);
    }
}
