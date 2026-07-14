/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class s extends da {
    static boolean field_m;
    static int[] field_k;
    static String[] field_j;
    static int[] field_l;
    static String field_p;
    static int[] field_q;
    byte[] field_o;
    static int[] field_i;
    static ka[] field_n;

    final static ka[] a(lj param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != 0) {
          field_j = null;
          var4 = param0.a(param1, 73);
          var5 = param0.a(var4, param3, (byte) 116);
          return bl.a(var5, var4, param0, param2 ^ 2147483647);
        } else {
          var4 = param0.a(param1, 73);
          var5 = param0.a(var4, param3, (byte) 116);
          return bl.a(var5, var4, param0, param2 ^ 2147483647);
        }
    }

    final static boolean a(boolean param0, boolean param1) {
        try {
            IOException var2 = null;
            pa var4 = null;
            pa var5 = null;
            int stackIn_11_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != gf.field_o) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        gf.field_o = vl.field_a.a(ae.field_x, ll.field_f, 431890200);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-1 == (gf.field_o.field_d ^ -1)) {
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
                        if (!param0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        field_k = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        i.field_q = ol.a(256);
                        ac.field_e = ol.a(256);
                        if (gf.field_o.field_d != 1) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            qf.field_a = new wb((java.net.Socket) gf.field_o.field_g, vl.field_a);
                            dk.field_s.field_q = 0;
                            var4 = id.field_b;
                            var5 = var4;
                            aj.field_c = ng.field_A;
                            var5.field_q = 0;
                            if (param1) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = -1;
                            stackIn_11_0 = stackOut_9_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = -2;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ul.field_j = stackIn_11_0;
                            uc.field_X = stackIn_11_0;
                            md.field_i = stackIn_11_0;
                            hl.a((uf) (Object) dk.field_s, 12, ph.field_e, db.field_y, mh.field_a);
                            nb.a(-1, -1);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        gf.field_o = null;
                        return true;
                    }
                    case 13: {
                        var2 = (IOException) (Object) caughtException;
                        aj.field_c = pf.field_b;
                        gf.field_o = null;
                        return true;
                    }
                    case 14: {
                        aj.field_c = pf.field_b;
                        gf.field_o = null;
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
        field_n = null;
        field_q = null;
        field_j = null;
        field_k = null;
        field_l = null;
        field_i = null;
        field_p = null;
        if (param0 != 2) {
            field_p = null;
        }
    }

    s(byte[] param0) {
        ((s) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[]{-20, -20, -20, -20, -20, -20, 1, 1, 1};
        field_j = new String[]{"All scores", "My scores", "Best each"};
        field_q = new int[]{3, 2, 1, 3};
        field_p = "Log in";
        field_l = new int[]{1, 1, 1, 2, 1};
        field_i = new int[]{2, 3, 3};
    }
}
