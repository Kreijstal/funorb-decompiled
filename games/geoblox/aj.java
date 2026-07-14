/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class aj {
    private static boolean field_e;
    private static Hashtable field_c;
    private static int field_a;
    private static String field_d;
    private static String field_b;

    private aj() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0, String param1, int param2) {
        Exception var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_d = param1;
                    field_a = param2;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_b = System.getProperty("user.home");
                        if (null == field_b) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_b = field_b + "/";
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param0 == 66) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_e = true;
                        if (null != field_b) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_b = "~/";
                        field_e = true;
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_e = true;
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (null == field_b) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    field_e = true;
                    return;
                }
                case 11: {
                    field_b = "~/";
                    field_e = true;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(String param0, int param1, String param2, int param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param0, param2);
    }

    public static File a(String param0, byte param1) {
        Object var3 = null;
        if (param1 > -67) {
          var3 = null;
          File discarded$2 = aj.a((String) null, (byte) -120);
          return aj.a(field_d, -27533, param0, field_a);
        } else {
          return aj.a(field_d, -27533, param0, field_a);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = new Hashtable(16);
    }
}
