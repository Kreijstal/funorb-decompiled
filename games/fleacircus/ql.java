/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ql extends lh {
    int field_r;
    static ae field_l;
    int field_n;
    int field_p;
    int field_m;
    int field_q;
    int field_i;
    static java.util.zip.CRC32 field_j;
    static int field_o;
    static fa field_k;

    public static void a() {
        field_l = null;
        field_j = null;
        field_k = null;
    }

    final static void a(int param0, int param1, int param2) {
        gb.a(si.field_R);
        int var4 = 95;
        int var5 = param2;
        int var6 = 0;
        gb.a(var4, var5, 16 + var4, 16 + var5);
        se.field_a[param0].f(-4, -4, 128);
        gb.b(si.field_R);
    }

    final static fh a(int param0, int param1) {
        fh[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        fh[] var5 = null;
        var4 = fleas.field_A ? 1 : 0;
        int discarded$2 = 1;
        var5 = al.b();
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_d != param1) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    ql(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ql) this).field_r = param2;
        ((ql) this).field_n = param3;
        ((ql) this).field_i = param0;
        ((ql) this).field_q = param5;
        ((ql) this).field_p = param4;
        ((ql) this).field_m = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new ae();
        field_j = new java.util.zip.CRC32();
    }
}
