/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qn extends tg {
    static int field_K;
    int field_F;
    int field_N;
    int field_G;
    int field_Q;
    static p field_P;
    int field_O;
    int field_M;
    static eh field_I;
    static java.util.zip.CRC32 field_S;
    static String field_L;
    static km field_J;
    static km field_H;
    static pd field_R;

    public static void c(byte param0) {
        field_I = null;
        field_R = null;
        field_H = null;
        field_L = null;
        field_S = null;
        if (param0 != -124) {
            Object var2 = null;
            wm discarded$0 = qn.a((hg) null, 93);
        }
        field_P = null;
        field_J = null;
    }

    final static wm a(hg param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        wm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        var2 = param0.c((byte) -78, 8);
        if (var2 > 0) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            if (param1 == 13472) {
              break L0;
            } else {
              qn.c((byte) -24);
              break L0;
            }
          }
          L1: {
            var3 = tk.a(1, param0) ? 1 : 0;
            var4 = tk.a(1, param0) ? 1 : 0;
            var5 = new wm();
            var5.field_h = (short)param0.c((byte) -78, 16);
            var5.field_l = c.a(var5.field_l, -27, 16, param0);
            var5.field_b = c.a(var5.field_b, -67, 16, param0);
            var5.field_H = c.a(var5.field_H, -35, 16, param0);
            var5.field_k = (short)param0.c((byte) -78, 16);
            var5.field_J = c.a(var5.field_J, -13, 16, param0);
            var5.field_e = c.a(var5.field_e, -6, 16, param0);
            var5.field_j = c.a(var5.field_j, -78, 16, param0);
            if (var3 != 0) {
              var5.field_i = (short)param0.c((byte) -78, 16);
              var5.field_A = c.a(var5.field_A, -77, 16, param0);
              var5.field_G = c.a(var5.field_G, -51, 16, param0);
              var5.field_D = c.a(var5.field_D, -13, 16, param0);
              var5.field_y = c.a(var5.field_y, -110, 16, param0);
              var5.field_I = c.a(var5.field_I, -41, 16, param0);
              var5.field_K = c.a(var5.field_K, -15, 16, param0);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var4 != 0) {
              int discarded$1 = param0.c((byte) -78, 16);
              var5.field_s = c.a(var5.field_s, -119, 16, param0);
              var5.field_d = c.a(var5.field_d, -108, 16, param0);
              var5.field_t = c.a(var5.field_t, param1 + -13589, 16, param0);
              var5.field_x = c.a(var5.field_x, -120, 16, param0);
              var5.field_O = c.a(var5.field_O, param1 + -13576, 16, param0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!tk.a(1, param0)) {
              break L3;
            } else {
              var5.field_S = c.a(var5.field_S, -27, 16, param0);
              break L3;
            }
          }
          L4: {
            if (!tk.a(1, param0)) {
              break L4;
            } else {
              var5.field_z = ah.a(16, var5.field_z, param0, 8);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_z.length) {
                  if (var6 == 0) {
                    var5.field_z = null;
                    break L4;
                  } else {
                    var5.field_a = (byte)(1 + var6);
                    break L4;
                  }
                } else {
                  if (var6 < (255 & var5.field_z[var7])) {
                    var6 = var5.field_z[var7] & 255;
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return var5;
        }
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        double var10 = 0.0;
        int var12 = Virogrid.field_F ? 1 : 0;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
        }
        int var8 = -((qn) this).field_M + (-((qn) this).field_l + (-param3 + param6));
        int var9 = -((qn) this).field_N - ((qn) this).field_u - (param5 - param4);
        if (((qn) this).field_F * ((qn) this).field_F > var9 * var9 + var8 * var8) {
            var10 = Math.atan2((double)var9, (double)var8) - bk.field_b;
            if (0.0 > var10) {
                var10 = var10 - 3.141592653589793 / (double)((qn) this).field_Q;
            } else {
                if (!(var10 <= 0.0)) {
                    var10 = var10 + 3.141592653589793 / (double)((qn) this).field_Q;
                }
            }
            ((qn) this).field_G = (int)(var10 * (double)((qn) this).field_Q / 6.283185307179586);
            while (((qn) this).field_Q <= ((qn) this).field_G) {
                ((qn) this).field_G = ((qn) this).field_G - ((qn) this).field_Q;
            }
            while (0 > ((qn) this).field_G) {
                ((qn) this).field_G = ((qn) this).field_G + ((qn) this).field_Q;
            }
        }
        return true;
    }

    private qn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = 2;
        field_P = new p();
        field_L = "<%0> has resigned.";
        field_S = new java.util.zip.CRC32();
    }
}
