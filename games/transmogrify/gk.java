/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gk {
    static tf field_d;
    static int field_f;
    static int field_e;
    static String field_a;
    static ti[] field_c;
    static String field_g;
    static tf field_b;

    final static boolean a(boolean param0, int param1) {
        try {
            int var2 = 0;
            hj var2_ref = null;
            IOException var2_ref_IOException = null;
            int stackIn_10_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != fk.field_F) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        fk.field_F = l.field_b.a(52, ai.field_d, lf.field_c);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-1 == (fk.field_F.field_c ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        td.field_b = lk.a(0);
                        wi.field_q = lk.a(0);
                        if (fk.field_F.field_c == 1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        lj.field_z = ng.field_j;
                        fk.field_F = null;
                        var2 = 100 / ((param1 - 71) / 43);
                        return true;
                    }
                    case 7: {
                        try {
                            nk.field_b = new gj((java.net.Socket) fk.field_F.field_g, l.field_b);
                            ff.field_D.field_h = 0;
                            var2_ref = nf.field_l;
                            var2_ref.field_h = 0;
                            if (param0) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = -1;
                            stackIn_10_0 = stackOut_8_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = -2;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            bd.field_t = stackIn_10_0;
                            nf.field_k = stackIn_10_0;
                            dg.field_a = stackIn_10_0;
                            lj.field_z = jk.field_y;
                            qb.a(124, pi.field_h, (oa) (Object) ff.field_D, dh.field_x, ua.field_c);
                            rb.a(-1, -377);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        fk.field_F = null;
                        var2 = 100 / ((param1 - 71) / 43);
                        return true;
                    }
                    case 12: {
                        var2_ref_IOException = (IOException) (Object) caughtException;
                        lj.field_z = ng.field_j;
                        fk.field_F = null;
                        var2 = 100 / ((param1 - 71) / 43);
                        return true;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_c = null;
        if (param0 != 9) {
            return;
        }
        field_d = null;
    }

    final static ii a(String param0, int param1, ci param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var4 = param2.b(118, param0);
        if (param1 != -2479) {
          var6 = null;
          ii discarded$2 = gk.a((String) null, 10, (ci) null, (String) null);
          var5 = param2.a(-1, param3, var4);
          return ae.a(var4, param2, var5, true);
        } else {
          var5 = param2.a(-1, param3, var4);
          return ae.a(var4, param2, var5, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new tf(9, 0, 4, 1);
        field_a = "Waiting for extra data";
        field_g = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = new tf(7, 0, 1, 1);
    }
}
