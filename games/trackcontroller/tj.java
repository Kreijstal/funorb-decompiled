/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

public class tj {
    private static String field_e;
    private static boolean field_c;
    private static Hashtable field_d;
    private static String field_a;
    private static int field_b;

    private tj() throws Throwable {
        throw new Error();
    }

    public static void a(int param0, String param1, byte param2) {
        Exception var3 = null;
        Object var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    field_a = param1;
                    field_b = param0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_e = System.getProperty("user.home");
                        if (field_e != null) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_c = true;
                        if (field_e != null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        field_e = "~/";
                        if (param2 != -119) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = null;
                        File discarded$6 = tj.a((byte) 98, (String) null);
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param2 == -119) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = null;
                        File discarded$7 = tj.a((byte) 98, (String) null);
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_e = field_e + "/";
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    field_c = true;
                    if (field_e != null) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    field_e = "~/";
                    if (param2 == -119) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4 = null;
                    File discarded$8 = tj.a((byte) 98, (String) null);
                    return;
                }
                case 13: {
                    return;
                }
                case 15: {
                    if (param2 != -119) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    var4 = null;
                    File discarded$9 = tj.a((byte) 98, (String) null);
                    return;
                }
                case 19: {
                    var3 = (Exception) (Object) caughtException;
                    field_c = true;
                    if (field_e != null) {
                        statePc = 24;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    field_e = "~/";
                    if (param2 == -119) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var4 = null;
                    File discarded$10 = tj.a((byte) 98, (String) null);
                    return;
                }
                case 22: {
                    return;
                }
                case 24: {
                    if (param2 != -119) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                case 26: {
                    var4 = null;
                    File discarded$11 = tj.a((byte) 98, (String) null);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static File a(byte param0, String param1) {
        Object var3 = null;
        if (param0 != -61) {
          var3 = null;
          File discarded$2 = tj.a((byte) 5, (String) null);
          return tj.a(field_b, (byte) 83, field_a, param1);
        } else {
          return tj.a(field_b, (byte) 83, field_a, param1);
        }
    }

    public static File a(int param0, byte param1, String param2, String param3) {
        return net.alterorb.launcher.Hook.cacheRedirect(param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_d = new Hashtable(16);
    }
}
