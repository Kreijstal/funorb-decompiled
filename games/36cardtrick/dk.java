/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class dk {
    private static boolean field_b;
    private static Hashtable field_a;
    private static String field_e;
    private static int field_c;
    private static String field_d;

    public static File a(String param0, int param1, byte param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param3);
    }

    private dk() throws Throwable {
        throw new Error();
    }

    public static File a(boolean param0, String param1) {
        String var3 = null;
        if (param0) {
          var3 = (String) null;
          dk.a((String) null, -87, (byte) -32);
          return dk.a(field_d, field_c, (byte) 117, param1);
        } else {
          return dk.a(field_d, field_c, (byte) 117, param1);
        }
    }

    public static void a(String param0, int param1, byte param2) {
        Exception var3 = null;
        String var4 = null;
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
                        if (param2 >= 28) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4 = (String) null;
                        dk.a((String) null, -40, (byte) 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        field_e = System.getProperty("user.home");
                        if (field_e != null) {
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
                        if (field_e != null) {
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
                        field_e = "~/";
                        field_b = true;
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_b = true;
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_e = field_e + "/";
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    if (field_e == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    field_b = true;
                    return;
                }
                case 10: {
                    field_e = "~/";
                    field_b = true;
                    return;
                }
                case 12: {
                    var3 = (Exception) (Object) caughtException;
                    if (field_e == null) {
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
                    field_e = "~/";
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
        field_a = new Hashtable(16);
    }
}
