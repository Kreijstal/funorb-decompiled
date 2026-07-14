/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tl {
    int field_h;
    int field_k;
    int field_c;
    static boolean field_g;
    int field_j;
    static int[] field_d;
    static bi field_b;
    static int[] field_i;
    static e field_e;
    static int field_f;
    static double[][] field_a;

    final static void a(int param0, String param1, int param2, int param3, int param4, boolean param5, df param6, int param7, boolean param8, long param9, int param10, int param11, int param12, int param13) {
        try {
            if (param4 != 9737) {
                return;
            }
            e.field_c = new hb(param2);
            vh.field_a = new hb(param13);
            kk.field_b = param7;
            na.field_W = param8 ? true : false;
            d.field_d = param5 ? true : false;
            ld.field_k = param6;
            rg.field_M = param12;
            ac.field_b = param11;
            mc.field_a = param9;
            wm.field_db = param0;
            af.field_ab = param1;
            nd.field_s = param10;
            qa.field_c = param3;
            if (null != ld.field_k.field_n) {
                try {
                    bg.field_b = new pf(ld.field_k.field_n, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static kc a(int param0) {
        if (ci.field_b == null) {
            ci.field_b = new kc();
            ci.field_b.a(false, gm.field_cb);
            ci.field_b.field_e = 0;
            ci.field_b.field_c = 14;
            ci.field_b.field_l = 4;
            ci.field_b.field_i = fa.field_Q;
            ci.field_b.field_v = 6;
            ci.field_b.field_p = 2763306;
            ci.field_b.field_s = 5;
            ci.field_b.field_g = 7697781;
        }
        if (param0 != 4314) {
            field_i = null;
        }
        return ci.field_b;
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 < 102) {
            field_e = null;
        }
        field_b = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = new int[256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_i = new int[16384];
            field_e = new e(2, 4, 4, 0);
            field_a = new double[][]{null, null, null, null, new double[6], new double[3], new double[6], new double[6], null, new double[3], new double[3], new double[3], new double[3]};
          } else {
            field_d[var0] = 65793 * var0;
            var0++;
            continue L0;
          }
        }
    }
}
