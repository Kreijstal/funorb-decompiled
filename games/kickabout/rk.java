/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rk {
    private int field_b;
    private int field_a;
    private ut[] field_c;
    static ut field_h;
    static ut field_g;
    static u field_d;
    static String[][] field_e;
    static wv field_f;

    rk(int param0, int param1, int param2) {
        int var5 = 0;
        nr var6 = null;
        int var7 = 0;
        ut var8 = null;
        ut var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ut var15 = null;
        int var16 = 0;
        int var17 = 0;
        Random var19 = null;
        ((rk) this).field_a = param0;
        ((rk) this).field_c = new ut[4];
        ((rk) this).field_b = param1;
        var19 = new Random();
        var5 = dq.a((byte) 87, 5, var19);
        var6 = new nr(27, 64, param2, var5);
        var7 = dq.a((byte) 83, 4, var19);
        var8 = j.a(-5275);
        var9 = new ut(54, 85);
        iw.a(114, var9);
        var10 = var8.field_o;
        var11 = var8.field_v;
        var12 = -15 + -ct.a(105, ((rk) this).field_a + -27, var10);
        var13 = -ct.a(-49, -64 + ((rk) this).field_b, var11);
        var8.d(var12, var13);
        var8.d(var12 + var10, var13);
        var8.d(var12, var11 + var13);
        var8.d(var12 + var10, var11 + var13);
        ta.e(120);
        var14 = 0;
        L0: while (true) {
          if (var14 >= 4) {
            return;
          } else {
            ((rk) this).field_c[var14] = new ut(54, 85);
            var15 = ((rk) this).field_c[var14];
            iw.a(-114, var15);
            var9.d(0, 0);
            int incrementValue$6 = var7;
            var7++;
            var6.a(incrementValue$6 % 4, -2);
            ta.e(123);
            var16 = var9.field_y.length;
            var17 = 0;
            L1: while (true) {
              if (var17 >= var16) {
                var14++;
                continue L0;
              } else {
                if (var15.field_y[var17] == var9.field_y[var17]) {
                  var15.field_y[var17] = 0;
                  var17++;
                  continue L1;
                } else {
                  var17++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var6 = 0;
        int var7 = 0;
        int var3 = b.c(-115, -27 + ((rk) this).field_a);
        if (!param1) {
            ((rk) this).a(-41, true);
        }
        int var4 = go.a(((rk) this).field_b - 64, (byte) -56);
        ut var5 = ((rk) this).field_c[param0];
        if (hw.field_i == 256) {
            var5.c(var3, var4);
        } else {
            var6 = hw.field_i * var5.field_o >> 8;
            var7 = var5.field_v * hw.field_i >> 8;
            var5.a(var3, var4, var6, var7);
        }
    }

    public static void a() {
        field_h = null;
        field_g = null;
        field_d = null;
        field_e = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ut(640, 480);
        field_e = new String[][]{new String[3], new String[2], new String[2], new String[2]};
    }
}
