/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class me {
    private static String field_a;
    private static String field_d;
    private static boolean field_e;
    private static int field_c;
    private static Hashtable field_b;

    public static File a(int param0, String param1, boolean param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param1);
    }

    private me() throws Throwable {
        throw new Error();
    }

    public static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_a = param0;
                    field_c = param1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_d = System.getProperty("user.home");
                        var3_int = -102 % ((param2 - 41) / 54);
                        if (field_d == null) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_d = field_d + "/";
                        if (null == field_d) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_d = "~/";
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_e = true;
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (null == field_d) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_d = "~/";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    field_e = true;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(String param0, int param1) {
        Object var3 = null;
        if (param1 <= 10) {
          var3 = null;
          me.a((String) null, 25, 85);
          return me.a(field_c, param0, false, field_a);
        } else {
          return me.a(field_c, param0, false, field_a);
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
