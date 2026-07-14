/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mf {
    private nj[] field_f;
    static int field_c;
    static dd field_g;
    int[] field_d;
    static mf field_e;
    static dd field_b;
    static fi[] field_a;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        var6 = -1 + ((mf) this).field_f.length;
        L0: while (true) {
          if (-1 < (var6 ^ -1)) {
            if (param3 == -4575) {
              return;
            } else {
              ((mf) this).a(-12, -98, -85, -78, -93);
              return;
            }
          } else {
            if (null == ((mf) this).field_f[var6]) {
              ((mf) this).field_f[var6] = new nj(param2, param0, param1, param4, ((mf) this).field_d);
              var6--;
              continue L0;
            } else {
              if (!((mf) this).field_f[var6].b(param3 + 4522)) {
                var6--;
                var6--;
                continue L0;
              } else {
                ((mf) this).field_f[var6] = new nj(param2, param0, param1, param4, ((mf) this).field_d);
                var6--;
                continue L0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -9) {
            return;
        }
        field_a = null;
        field_g = null;
        field_e = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        var2 = ((mf) this).field_f.length - param0;
        L0: while (true) {
          if ((var2 ^ -1) > -1) {
            return;
          } else {
            if (null != ((mf) this).field_f[var2]) {
              ((mf) this).field_f[var2].c(-55);
              var2--;
              continue L0;
            } else {
              var2--;
              continue L0;
            }
          }
        }
    }

    final static Boolean a(boolean param0) {
        Boolean var1 = null;
        if (!param0) {
            field_b = null;
            var1 = bb.field_A;
            bb.field_A = null;
            return var1;
        }
        var1 = bb.field_A;
        bb.field_A = null;
        return var1;
    }

    mf(int param0, int param1) {
        int var3 = 0;
        na.field_c = new Random((long)param1);
        ((mf) this).field_f = new nj[param0];
        ((mf) this).field_d = new int[255];
        for (var3 = 0; var3 < 255; var3++) {
            ((mf) this).field_d[var3] = var3 * 65793;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fi[2];
    }
}
