/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wl {
    static String field_f;
    static volatile boolean field_i;
    private double[] field_e;
    private double field_c;
    private int field_a;
    private double[] field_h;
    private double field_d;
    static boolean field_b;
    private int[] field_g;

    final void b(byte param0) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        int var2 = ((wl) this).field_a * 240 / 255;
        t.a((int)((wl) this).field_h[0] << 52088420, (int)((wl) this).field_e[0] << -1312132796, 64, ((wl) this).field_a, ((wl) this).field_g);
        if (param0 >= -91) {
            field_f = null;
        }
        for (var3 = 1; (var3 ^ -1) > -21; var3++) {
            var2 = ((wl) this).field_a * (-var3 + 20) * 12 / 255;
            t.a((int)((wl) this).field_h[var3] << -1364007868, (int)((wl) this).field_e[var3] << 1565739332, 32, var2, ((wl) this).field_g);
            t.a((int)(((wl) this).field_h[var3] + ((wl) this).field_h[-1 + var3]) << 995623267, (int)(((wl) this).field_e[var3 + -1] + ((wl) this).field_e[var3]) << 323580483, 32, var2, ((wl) this).field_g);
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param0 < -7) {
            break L0;
          } else {
            int discarded$2 = wl.a(102);
            break L0;
          }
        }
        var2 = 1;
        var3 = -1 + ((wl) this).field_h.length;
        L1: while (true) {
          if (-1 < (var3 ^ -1)) {
            L2: {
              L3: {
                if (var2 != 0) {
                  break L3;
                } else {
                  if ((((wl) this).field_a ^ -1) < -1) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_16_0 = stackOut_14_0;
              break L2;
            }
            return stackIn_16_0 != 0;
          } else {
            L4: {
              L5: {
                stackOut_4_0 = var2;
                stackIn_9_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (0.0 >= ((wl) this).field_h[var3]) {
                  break L5;
                } else {
                  stackOut_5_0 = stackIn_5_0;
                  stackIn_9_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (640.0 <= ((wl) this).field_h[var3]) {
                    break L5;
                  } else {
                    stackOut_6_0 = stackIn_6_0;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (((wl) this).field_e[var3] <= 0.0) {
                      break L5;
                    } else {
                      stackOut_7_0 = stackIn_7_0;
                      stackIn_10_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (((wl) this).field_e[var3] < 480.0) {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L4;
                      } else {
                        stackOut_8_0 = stackIn_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        break L5;
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L4;
            }
            var2 = stackIn_11_0 & stackIn_11_1;
            var3--;
            continue L1;
          }
        }
    }

    final static int a(int param0) {
        if (param0 != 23062) {
            field_i = true;
            return 1;
        }
        return 1;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            wl.a(false);
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        for (var3 = 19; 0 < var3; var3--) {
            ((wl) this).field_h[var3] = ((wl) this).field_h[-1 + var3];
            ((wl) this).field_e[var3] = ((wl) this).field_e[var3 + -1];
        }
        ((wl) this).field_h[0] = ((wl) this).field_h[0] + ((wl) this).field_d;
        ((wl) this).field_e[param0] = ((wl) this).field_e[param0] + ((wl) this).field_c;
        ((wl) this).field_a = ((wl) this).field_a - param1;
        ((wl) this).field_c = ((wl) this).field_c + ng.field_s;
    }

    wl(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        double[] var6 = null;
        int var7 = 0;
        ((wl) this).field_e = new double[20];
        ((wl) this).field_h = new double[20];
        ((wl) this).field_a = 249;
        ((wl) this).field_h[0] = (double)param0;
        ((wl) this).field_g = param3;
        ((wl) this).field_e[0] = (double)param1;
        for (var5_int = 1; (var5_int ^ -1) > -21; var5_int++) {
            var6 = ((wl) this).field_h;
            var7 = var5_int;
            ((wl) this).field_e[var5_int] = -1000.0;
            var6[var7] = -1000.0;
        }
        double var5 = (double)(ok.a(ea.field_b, -124, 10) + 15) / 10.0;
        ((wl) this).field_d = var5 * si.a(3.141592653589793 * (double)param2 / 512.0, false);
        ((wl) this).field_c = var5 * jn.a((double)param2 * 3.141592653589793 / 512.0, 6802);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = ",";
        field_i = false;
    }
}
