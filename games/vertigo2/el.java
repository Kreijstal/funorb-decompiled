/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class el implements Iterable {
    static ll field_d;
    int field_c;
    li[] field_f;
    private li field_g;
    static lb field_e;
    static cr[] field_h;
    static cr field_a;
    static cr field_b;

    final static int b(boolean param0) {
        if (!param0) {
            int discarded$0 = el.b(false);
        }
        return (int)(1000000000L / sl.field_w);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_h = null;
        field_b = null;
        if (param0) {
            field_b = null;
        }
        field_d = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new gf((el) this);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int[] var22 = null;
        L0: {
          var18 = Vertigo2.field_L ? 1 : 0;
          var12 = pk.a((byte) -14, cj.field_D, param6, ua.field_e);
          var13 = pk.a((byte) -14, cj.field_D, param5, ua.field_e);
          var14 = pk.a((byte) -14, ib.field_a, param3, ap.field_e);
          var15 = pk.a((byte) -14, ib.field_a, param4, ap.field_e);
          if (param1 < -122) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        var8 = pk.a((byte) -14, cj.field_D, param0 + param6, ua.field_e);
        var9 = pk.a((byte) -14, cj.field_D, -param0 + param5, ua.field_e);
        var16 = var12;
        L1: while (true) {
          if (var16 >= var8) {
            var16 = var13;
            L2: while (true) {
              if (var9 >= var16) {
                var10 = pk.a((byte) -14, ib.field_a, param0 + param3, ap.field_e);
                var11 = pk.a((byte) -14, ib.field_a, -param0 + param4, ap.field_e);
                var16 = var8;
                L3: while (true) {
                  if (var9 < var16) {
                    return;
                  } else {
                    var22 = vl.field_e[var16];
                    ki.a(-107, var14, var22, var10, param7);
                    ki.a(-81, var10, var22, var11, param2);
                    ki.a(-123, var11, var22, var15, param7);
                    var16++;
                    continue L3;
                  }
                }
              } else {
                ki.a(-75, var14, vl.field_e[var16], var15, param7);
                var16--;
                continue L2;
              }
            }
          } else {
            ki.a(-111, var14, vl.field_e[var16], var15, param7);
            var16++;
            continue L1;
          }
        }
    }

    final li a(long param0, byte param1) {
        li var5 = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        li var4 = ((el) this).field_f[(int)(param0 & (long)(((el) this).field_c - 1))];
        if (param1 < 22) {
            return null;
        }
        ((el) this).field_g = var4.field_c;
        while (((el) this).field_g != var4) {
            if (((el) this).field_g.field_k == param0) {
                var5 = ((el) this).field_g;
                ((el) this).field_g = ((el) this).field_g.field_c;
                return var5;
            }
            ((el) this).field_g = ((el) this).field_g.field_c;
        }
        ((el) this).field_g = null;
        return null;
    }

    final void a(long param0, li param1, int param2) {
        if (!(param1.field_a == null)) {
            param1.c(2);
        }
        li var5 = ((el) this).field_f[(int)((long)(((el) this).field_c + -1) & param0)];
        param1.field_c = var5;
        param1.field_a = var5.field_a;
        param1.field_a.field_c = param1;
        if (param2 <= 74) {
            int discarded$0 = el.b(false);
        }
        param1.field_c.field_a = param1;
        param1.field_k = param0;
    }

    final static int a(byte param0) {
        int var1 = -92 / ((-8 - param0) / 56);
        return -pk.field_o + qp.field_d;
    }

    el(int param0) {
        int var2 = 0;
        li var3 = null;
        ((el) this).field_f = new li[param0];
        ((el) this).field_c = param0;
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new li();
            ((el) this).field_f[var2] = new li();
            var3.field_c = var3;
            var3.field_a = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ll();
    }
}
