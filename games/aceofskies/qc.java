/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class qc {
    private static String field_d;
    private static String field_c;
    private static int field_a;
    private static Hashtable field_b;
    private static boolean field_e;

    public static File a(boolean param0, String param1) {
        String var3 = null;
        if (!param0) {
          var3 = (String) null;
          File discarded$2 = qc.a(false, (String) null);
          return qc.a(param1, 1, field_a, field_d);
        } else {
          return qc.a(param1, 1, field_a, field_d);
        }
    }

    private qc() throws Throwable {
        throw new Error();
    }

    public static File a(String param0, int param1, int param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param3, param0);
    }

    public static void a(String param0, int param1, int param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_a = param1;
                    if (param2 >= 19) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_e = true;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    field_d = param0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        field_c = System.getProperty("user.home");
                        if (field_c != null) {
                            statePc = 7;
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
                        field_e = true;
                        if (null != field_c) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
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
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
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
                    field_e = true;
                    if (null == field_c) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    field_c = "~/";
                    return;
                }
                case 12: {
                    var3 = (Exception) (Object) caughtException;
                    field_e = true;
                    if (null == field_c) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    field_c = "~/";
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
