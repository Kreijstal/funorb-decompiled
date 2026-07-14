/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class fk {
    private static String field_d;
    private static boolean field_a;
    private static Hashtable field_c;
    private static int field_b;
    private static String field_e;

    private fk() throws Throwable {
        throw new Error();
    }

    public static File a(int param0, String param1) {
        Object var3 = null;
        if (param0 != 0) {
          var3 = null;
          File discarded$2 = fk.a(-100, (String) null);
          return fk.a(field_e, param1, false, field_b);
        } else {
          return fk.a(field_e, param1, false, field_b);
        }
    }

    public static File a(String param0, String param1, boolean param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param1);
    }

    public static void a(boolean param0, String param1, int param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_b = param2;
                    field_e = param1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_d = System.getProperty("user.home");
                        if (null != field_d) {
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
                        field_a = param0;
                        if (null != field_d) {
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
                        field_d = "~/";
                        return;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_d = field_d + "/";
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    field_a = param0;
                    if (null == field_d) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    field_d = "~/";
                    return;
                }
                case 10: {
                    var3 = (Exception) (Object) caughtException;
                    field_a = param0;
                    if (null == field_d) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    field_d = "~/";
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
        field_a = false;
        field_c = new Hashtable(16);
    }
}
