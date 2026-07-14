/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class nd {
    private static int field_d;
    private static Hashtable field_c;
    private static String field_a;
    private static boolean field_b;
    private static String field_e;

    public static File a(String param0, String param1, int param2, byte param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param1);
    }

    public static File a(String param0, int param1) {
        if (param1 != -19154) {
            return null;
        }
        return nd.a(field_a, param0, field_d, (byte) -75);
    }

    private nd() throws Throwable {
        throw new Error();
    }

    public static void a(String param0, int param1, byte param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_d = param1;
                    field_a = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_e = System.getProperty("user.home");
                        if (field_e != null) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == field_e) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_e = "~/";
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2 <= -52) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_b = false;
                        field_b = true;
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_b = true;
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
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
                        statePc = 16;
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
                    if (param2 > -52) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    field_b = true;
                    return;
                }
                case 14: {
                    field_b = false;
                    field_b = true;
                    return;
                }
                case 16: {
                    var3 = (Exception) (Object) caughtException;
                    if (null == field_e) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    field_e = "~/";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (param2 > -52) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    field_b = true;
                    return;
                }
                case 21: {
                    field_b = false;
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
        field_c = new Hashtable(16);
    }
}
