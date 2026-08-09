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
        int incrementValue$3 = 0;
        int var5;
        nr var6;
        int var7;
        ut var8;
        ut var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        ut var15;
        int var16;
        int var17;
        Random var19;
        this.field_a = param0;
        this.field_c = new ut[4];
        this.field_b = param1;
        var19 = new Random();
        var5 = dq.a((byte) 87, 5, var19);
        var6 = new nr(27, 64, param2, var5);
        var7 = dq.a((byte) 83, 4, var19);
        var8 = j.a(-5275);
        var9 = new ut(54, 85);
        iw.a(114, var9);
        var10 = var8.field_o;
        var11 = var8.field_v;
        var12 = -15 + -ct.a(105, this.field_a + -27, var10);
        var13 = -ct.a(-49, -64 + this.field_b, var11);
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
            this.field_c[var14] = new ut(54, 85);
            var15 = this.field_c[var14];
            iw.a(-114, var15);
            var9.d(0, 0);
            incrementValue$3 = var7;
            var7++;
            var6.a(incrementValue$3 % 4, -2);
            ta.e(123);
            var16 = var9.field_y.length;
            var17 = 0;
            L1: while (true) {
              if (var17 >= var16) {
                var14++;
                continue L0;
              } else {
                if ((var15.field_y[var17] ^ -1) == (var9.field_y[var17] ^ -1)) {
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
        int var3 = b.c(-115, -27 + this.field_a);
        if (!param1) {
            this.a(-41, true);
        }
        int var4 = go.a(this.field_b - 64, (byte) -56);
        ut var5 = this.field_c[param0];
        if (hw.field_i == 256) {
            var5.c(var3, var4);
        } else {
            var6 = hw.field_i * var5.field_o >> 644990088;
            var7 = var5.field_v * hw.field_i >> 1613551528;
            var5.a(var3, var4, var6, var7);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_g = null;
        field_d = null;
        field_e = (String[][]) null;
        field_f = null;
    }

    static {
        field_h = new ut(640, 480);
        field_e = new String[][]{new String[]{"4 Minutes", "8 Minutes", "12 Minutes"}, new String[]{"Off", "On"}, new String[]{"Normal", "Exhibition"}, new String[]{"Off", "On"}};
    }
}
