/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class ui {
    private static int field_b;
    private static String field_e;
    private static boolean field_a;
    private static String field_d;
    private static Hashtable field_c;

    public static File a(byte param0, String param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param1, param2);
    }

    private ui() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0, int param1, String param2) {
        int var3 = 0;
        Exception var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_b = param1;
                    field_d = param2;
                    var3 = 67 / ((param0 - 81) / 34);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_e = System.getProperty("user.home");
                        if (null != field_e) {
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
                        if (field_e == null) {
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
                        field_e = "~/";
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
                        field_a = true;
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_e = field_e + "/";
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    if (field_e == null) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    field_e = "~/";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    field_a = true;
                    return;
                }
                case 11: {
                    var4 = (Exception) (Object) caughtException;
                    if (field_e == null) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    field_e = "~/";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    field_a = true;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(String param0, byte param1) {
        Object var3 = null;
        if (param1 != -83) {
          var3 = null;
          ui.a((byte) -20, -119, (String) null);
          return ui.a((byte) -47, field_d, param0, field_b);
        } else {
          return ui.a((byte) -47, field_d, param0, field_b);
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
