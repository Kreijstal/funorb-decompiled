/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aq {
    static Calendar field_b;
    static ci[] field_a;

    final static String a(int param0, int param1) {
        if (param1 < 79) {
          field_b = null;
          return param0 + 1 + "/" + rb.field_n.length;
        } else {
          return param0 + 1 + "/" + rb.field_n.length;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        if (param0 >= -52) {
            return null;
        }
        return hq.a(0, (byte) -112, param1, param1.length);
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 0) {
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
                    if (wp.field_g != null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var1 = (Object) (Object) wp.field_g;
                    // monitorenter wp.field_g
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        wp.field_g = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        of.field_Ob = -no.field_q.field_w + qh.field_l >> 618839329;
        fm.field_M = -no.field_q.field_A;
        vk.field_H = of.field_Ob - -224;
        ac.b(param0, (byte) -94);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = null;
    }
}
