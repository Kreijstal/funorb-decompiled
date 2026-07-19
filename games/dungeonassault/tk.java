/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tk {
    int[] field_n;
    private cn[] field_p;
    int[] field_z;
    int[] field_m;
    int[] field_s;
    boolean[] field_i;
    int[] field_x;
    int[] field_e;
    int[] field_h;
    int[] field_c;
    int field_g;
    private se field_o;
    static pp field_k;
    static String field_b;
    int[] field_y;
    int[] field_a;
    int[] field_u;
    int[] field_A;
    boolean[] field_B;
    private cn[] field_l;
    int[] field_j;
    int[] field_f;
    private String[] field_t;
    int[] field_q;
    int[] field_d;
    int field_w;
    int field_r;
    static String field_v;

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        this.field_w = this.field_w + 1;
    }

    final static void a(byte param0) {
        tn.a(-1);
        if (param0 > -64) {
            field_v = (String) null;
        }
        he.field_s = true;
        qc.field_t = true;
        lg.field_w.h(1);
        gh.a(23321, ha.field_o, false);
    }

    private final int a(cn[] param0, cn[] param1, int[] param2, se param3, int param4, String[] param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        Random var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        boolean[] var16 = null;
        int var17 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] var24 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var20 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var8_int = param1.length;
              this.field_z = new int[var8_int];
              this.field_d = new int[var8_int];
              this.field_i = new boolean[var8_int];
              this.field_q = new int[var8_int];
              this.field_y = new int[var8_int];
              this.field_p = param0;
              this.field_w = 0;
              this.field_B = new boolean[var8_int];
              this.field_m = new int[var8_int];
              this.field_j = new int[var8_int];
              this.field_o = param3;
              this.field_a = new int[var8_int];
              this.field_A = new int[var8_int];
              this.field_u = new int[var8_int];
              this.field_t = param5;
              this.field_l = param1;
              this.field_e = new int[var8_int];
              this.field_n = new int[var8_int];
              this.field_f = new int[var8_int];
              if (param6 == 2048) {
                break L1;
              } else {
                tk.b((byte) -101);
                break L1;
              }
            }
            this.field_x = new int[var8_int];
            this.field_c = new int[var8_int];
            this.field_s = new int[var8_int];
            this.field_h = new int[var8_int];
            var9 = new Random(416516L);
            var10 = 0;
            var11 = 0;
            L2: while (true) {
              if (var11 >= var8_int) {
                stackOut_6_0 = this.field_d[-1 + var8_int];
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var12 = param1[var11].field_y << -152367260;
                var13 = param1[var11].field_v << 918994852;
                var14 = var12 / 2;
                var15 = var13 / 2;
                this.field_c[var11] = -1024 - -uj.a(var9, 37, 2048);
                this.field_n[var11] = 6000 - -uj.a(var9, md.b(param6, 2085), 2048);
                this.field_A[var11] = -var14 / 2;
                this.field_y[var11] = -var15 / 2;
                this.field_j[var11] = -(var14 * this.field_n[var11]) >> -1285621844;
                this.field_q[var11] = -(var15 * this.field_n[var11]) >> 503088332;
                this.field_h[var11] = -1024 - -uj.a(var9, 37, 2048);
                this.field_s[var11] = uj.a(var9, 37, 2048) + 6000;
                this.field_e[var11] = -var14 / 4;
                this.field_m[var11] = -var15 / 4;
                this.field_f[var11] = -(var14 * this.field_n[var11]) >> 41697836;
                this.field_x[var11] = -(this.field_n[var11] * var15 >> -1422977684) + 2000;
                this.field_z[var11] = var10;
                var10 = var10 + param2[var11];
                this.field_d[var11] = var10 + param4;
                var16 = this.field_i;
                this.field_B[var11] = false;
                var17 = var11;
                var16[var17] = false;
                var24 = this.field_u;
                var19 = var11;
                this.field_a[var11] = 0;
                var24[var19] = 0;
                var11++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var8);
            stackOut_8_1 = new StringBuilder().append("tk.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param4).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param6 + ')');
        }
        return stackIn_7_0;
    }

    public static void b(byte param0) {
        field_v = null;
        field_k = null;
        if (param0 != 10) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        sm.field_c = param2;
        om.field_a = param0;
        he.field_p = param3;
        if (param1 > -35) {
            field_v = (String) null;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var10 = 0;
        L0: {
          var10 = DungeonAssault.field_K;
          var2 = 0;
          if (param0 <= -1) {
            break L0;
          } else {
            this.field_w = -24;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= this.field_l.length) {
            return;
          } else {
            if (this.field_w >= this.field_z[var2]) {
              if (this.field_d[var2] >= this.field_w) {
                L2: {
                  var3 = this.field_w - this.field_z[var2];
                  var4 = this.field_d[var2] + -this.field_z[var2];
                  var5 = (double)var3 / (double)var4;
                  if (12 <= bc.field_a) {
                    this.field_l[var2].b((int)to.a(this.field_A[var2], this.field_e[var2], var5, -94), (int)to.a(this.field_y[var2], this.field_m[var2], var5, -92), (int)to.a(this.field_j[var2], this.field_f[var2], var5, 122), (int)to.a(this.field_q[var2], this.field_x[var2], var5, -104), (int)to.a(this.field_c[var2], this.field_h[var2], var5, -82), (int)to.a(this.field_n[var2], this.field_s[var2], var5, -95));
                    break L2;
                  } else {
                    this.field_l[var2].a((int)to.a(this.field_A[var2], this.field_e[var2], var5, 127), (int)to.a(this.field_y[var2], this.field_m[var2], var5, -109), (int)to.a(this.field_j[var2], this.field_f[var2], var5, 76), (int)to.a(this.field_q[var2], this.field_x[var2], var5, -110), (int)to.a(this.field_c[var2], this.field_h[var2], var5, -45), (int)to.a(this.field_n[var2], this.field_s[var2], var5, 77));
                    break L2;
                  }
                }
                L3: {
                  gf.b(0, 0, gf.field_i, this.field_r, 0);
                  gf.b(0, gf.field_c + -this.field_r, gf.field_i, this.field_r, 0);
                  if (this.field_o == null) {
                    if (-26 >= (var3 ^ -1)) {
                      break L3;
                    } else {
                      if (!this.field_B[var2]) {
                        break L3;
                      } else {
                        gf.b(0, 0, gf.field_i, gf.field_c, this.field_a[var2], 256 + -(var3 * 10));
                        break L3;
                      }
                    }
                  } else {
                    if (-26 >= (var3 ^ -1)) {
                      break L3;
                    } else {
                      if (!this.field_B[var2]) {
                        break L3;
                      } else {
                        gf.b(0, 0, gf.field_i, gf.field_c, this.field_a[var2], 256 + -(var3 * 10));
                        break L3;
                      }
                    }
                  }
                }
                var3 = -var3 + var4;
                if (25 > var3) {
                  if (this.field_i[var2]) {
                    gf.b(0, 0, gf.field_i, gf.field_c, this.field_u[var2], 256 + -(10 * var3));
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    tk(cn[] param0, int[] param1, int param2, se param3, String[] param4, cn[] param5) {
        try {
            this.field_g = this.a(param5, param0, param1, param3, param2, param4, 2048);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "<col=FF0000>Lethal</col>. Can cause party to flee in terror.";
    }
}
