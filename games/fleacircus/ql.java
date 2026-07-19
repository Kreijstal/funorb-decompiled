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

    public static void a(byte param0) {
        field_l = null;
        field_j = null;
        if (param0 != -92) {
            return;
        }
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gb.a(si.field_R);
        int var4 = param3;
        int var5 = param2;
        int var6 = 26 % ((-63 - param1) / 50);
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
        if (param0 == -22471) {
          var5 = al.b(true);
          var2 = var5;
          var3 = 0;
          L0: while (true) {
            if (var3 < var5.length) {
              if (var5[var3].field_d != param1) {
                var3++;
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return var5[var3];
              }
            } else {
              return null;
            }
          }
        } else {
          field_l = (ae) null;
          var5 = al.b(true);
          var2 = var5;
          var3 = 0;
          L1: while (true) {
            if (var3 < var5.length) {
              if (var5[var3].field_d != param1) {
                var3++;
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return var5[var3];
              }
            } else {
              return null;
            }
          }
        }
    }

    ql(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_r = param2;
        this.field_n = param3;
        this.field_i = param0;
        this.field_q = param5;
        this.field_p = param4;
        this.field_m = param1;
    }

    static {
        field_l = new ae();
        field_j = new java.util.zip.CRC32();
    }
}
