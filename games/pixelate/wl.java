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
        int var2 = this.field_a * 240 / 255;
        t.a((int)this.field_h[0] << 52088420, (int)this.field_e[0] << -1312132796, 64, this.field_a, this.field_g);
        if (param0 >= -91) {
            field_f = (String) null;
        }
        for (var3 = 1; (var3 ^ -1) > -21; var3++) {
            var2 = this.field_a * (-var3 + 20) * 12 / 255;
            t.a((int)this.field_h[var3] << -1364007868, (int)this.field_e[var3] << 1565739332, 32, var2, this.field_g);
            t.a((int)(this.field_h[var3] + this.field_h[-1 + var3]) << 995623267, (int)(this.field_e[var3 + -1] + this.field_e[var3]) << 323580483, 32, var2, this.field_g);
        }
    }

    final boolean a(byte param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_19_0 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          if (param0 < -7) {
            break L0;
          } else {
            wl.a(102);
            break L0;
          }
        }
        var2 = 1;
        var3 = -1 + this.field_h.length;
        L1: while (true) {
          L2: {
            L3: {
              L4: {
                if (-1 < (var3 ^ -1)) {
                  if (var2 != 0) {
                    break L3;
                  } else {
                    if ((this.field_a ^ -1) < -1) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  stackIn_7_0 = var2;

                  stackIn_7_1 = (0.0 < this.field_h[var3] ? -1 : (0.0 == this.field_h[var3] ? 0 : 1));

                  L5: {
                    L6: {

                      if (stackIn_7_1 >= 0) {
                        break L6;
                      } else {

                        if (640.0 <= this.field_h[var3]) {
                          break L6;
                        } else {

                          if (this.field_e[var3] <= 0.0) {
                            break L6;
                          } else {


                            if (this.field_e[var3] < 480.0) {
                              stackIn_14_0 = stackIn_7_0;
                              stackIn_14_1 = 0;
                              break L5;
                            } else {

                              break L6;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = stackIn_7_0;
                    stackIn_14_1 = 1;
                    break L5;
                  }
                  var2 = stackIn_14_0 & stackIn_14_1;
                  var3--;
                  continue L1;
                }
              }
              stackIn_19_0 = 0;
              break L2;
            }
            stackIn_19_0 = 1;
            break L2;
          }
          return stackIn_19_0 != 0;
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
            this.field_h[var3] = this.field_h[-1 + var3];
            this.field_e[var3] = this.field_e[var3 + -1];
        }
        this.field_h[0] = this.field_h[0] + this.field_d;
        this.field_e[param0] = this.field_e[param0] + this.field_c;
        this.field_a = this.field_a - param1;
        this.field_c = this.field_c + ng.field_s;
    }

    wl(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        double[] var6 = null;
        int var7 = 0;
        double var5_double = 0.0;
        this.field_e = new double[20];
        this.field_h = new double[20];
        this.field_a = 249;
        try {
            this.field_h[0] = (double)param0;
            this.field_g = param3;
            this.field_e[0] = (double)param1;
            for (var5_int = 1; (var5_int ^ -1) > -21; var5_int++) {
                var6 = this.field_h;
                var7 = var5_int;
                this.field_e[var5_int] = -1000.0;
                var6[var7] = -1000.0;
            }
            var5_double = (double)(ok.a(ea.field_b, -124, 10) + 15) / 10.0;
            this.field_d = var5_double * si.a(3.141592653589793 * (double)param2 / 512.0, false);
            this.field_c = var5_double * jn.a((double)param2 * 3.141592653589793 / 512.0, 6802);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "wl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = ",";
        field_i = false;
    }
}
