/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ab {
    static int[] field_g;
    static im field_d;
    static int field_i;
    static String field_j;
    static pj field_b;
    static String field_e;
    static String field_c;
    static String field_f;
    static String field_h;
    static int field_k;
    static Calendar field_l;
    static String field_m;
    static fa field_a;

    final static int b(int param0) {
        if (param0 != -27737) {
            return -43;
        }
        return wf.field_q;
    }

    final static String c(int param0) {
        if (param0 != -14700) {
            String discarded$0 = ab.c(23);
            return mk.field_j.e(-1);
        }
        return mk.field_j.e(-1);
    }

    final static void a(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = 23 / ((-57 - param0) / 59);
                    if (null != th.field_g) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var2 = (Object) (Object) th.field_g;
                    // monitorenter th.field_g
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        th.field_g = null;
                        // monitorexit var2
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_m = null;
        field_g = null;
        field_a = null;
        field_j = null;
        if (param0 != 0) {
          return;
        } else {
          field_e = null;
          field_d = null;
          field_c = null;
          field_l = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[4];
        field_e = "Damage: ";
        field_b = null;
        field_j = "Squiddy";
        field_c = "    4th level";
        field_d = new im();
        field_h = "Vigilante";
        field_f = "Centre on unit";
        field_k = 0;
        field_m = "HLC-101";
        field_l = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
