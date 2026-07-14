/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class od {
    private static int field_d;
    private static String field_c;
    private static Hashtable field_b;
    private static boolean field_e;
    private static String field_a;

    private od() throws Throwable {
        throw new Error();
    }

    public static File a(int param0, String param1) {
        if (param0 != 0) {
            field_c = null;
            return od.a(field_c, 30869, param1, field_d);
        }
        return od.a(field_c, 30869, param1, field_d);
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param2);
    }

    public static void a(int param0, String param1, int param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_c = param1;
                    field_d = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_a = System.getProperty("user.home");
                        if (null != field_a) {
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
                        field_e = true;
                        if (param2 == 7154) {
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
                        return;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == field_a) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_a = "~/";
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_a = field_a + "/";
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    field_e = true;
                    if (param2 != 7154) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (null == field_a) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    field_a = "~/";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    return;
                }
                case 16: {
                    var3 = (Exception) (Object) caughtException;
                    field_e = true;
                    if (param2 != 7154) {
                        statePc = 21;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (null == field_a) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    field_a = "~/";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
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
        field_e = false;
        field_b = new Hashtable(16);
    }
}
