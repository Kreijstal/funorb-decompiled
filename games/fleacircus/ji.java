/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji {
    static int field_a;
    private int[] field_d;
    static String field_b;
    private double[] field_e;
    private double[] field_g;
    private double field_h;
    private int field_c;
    static int field_i;
    static dd[] field_f;
    private double field_j;

    final boolean a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = param0 ? 1 : 0;
        var3 = -1 + this.field_e.length;
        L0: while (true) {
          if (var3 < 0) {
            if (var2 == 0) {
              if ((this.field_c ^ -1) >= -1) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            stackIn_7_0 = var2;

            stackIn_7_1 = (0.0 < this.field_e[var3] ? -1 : (0.0 == this.field_e[var3] ? 0 : 1));

            L1: {
              L2: {

                if (stackIn_7_1 >= 0) {
                  break L2;
                } else {

                  if (this.field_e[var3] >= 640.0) {
                    break L2;
                  } else {

                    if (this.field_g[var3] <= 0.0) {
                      break L2;
                    } else {


                      if (480.0 > this.field_g[var3]) {
                        stackIn_14_0 = stackIn_7_0;
                        stackIn_14_1 = 0;
                        break L1;
                      } else {

                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_14_0 = stackIn_7_0;
              stackIn_14_1 = 1;
              break L1;
            }
            var2 = stackIn_14_0 & stackIn_14_1;
            var3--;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 104 % ((-63 - param0) / 59);
        field_f = null;
    }

    final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        rh var5;
        var4 = fleas.field_A ? 1 : 0;
        if (param0) {
          var2 = this.field_c * 240 / 255;
          gb.a((int)this.field_e[0] << 145185700, (int)this.field_g[0] << -1791974876, 64, this.field_c, this.field_d);
          var3 = 1;
          L0: while (true) {
            if (20 <= var3) {
              return;
            } else {
              var2 = (-var3 + 20) * (this.field_c * 12) / 255;
              gb.a((int)this.field_e[var3] << 1579441988, (int)this.field_g[var3] << -2123610236, 32, var2, this.field_d);
              gb.a((int)(this.field_e[-1 + var3] + this.field_e[var3]) << -1656541085, (int)(this.field_g[var3] + this.field_g[var3 - 1]) << -516268701, 32, var2, this.field_d);
              var3++;
              continue L0;
            }
          }
        } else {
          var5 = (rh) null;
          ji.a((rh) null, 11, 87, -10);
          var2 = this.field_c * 240 / 255;
          gb.a((int)this.field_e[0] << 145185700, (int)this.field_g[0] << -1791974876, 64, this.field_c, this.field_d);
          var3 = 1;
          L1: while (true) {
            if (20 <= var3) {
              return;
            } else {
              var2 = (-var3 + 20) * (this.field_c * 12) / 255;
              gb.a((int)this.field_e[var3] << 1579441988, (int)this.field_g[var3] << -2123610236, 32, var2, this.field_d);
              gb.a((int)(this.field_e[-1 + var3] + this.field_e[var3]) << -1656541085, (int)(this.field_g[var3] + this.field_g[var3 - 1]) << -516268701, 32, var2, this.field_d);
              var3++;
              continue L1;
            }
          }
        }
    }

    final static void a(byte param0) {
        if (param0 >= -57) {
            ji.a(77);
        }
    }

    final void a(int param0, byte param1) {
        int var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        var3 = 19;
        L0: while (true) {
          if (0 >= var3) {
            if (param1 > -37) {
              this.a(false);
              this.field_e[0] = this.field_e[0] + this.field_j;
              this.field_g[0] = this.field_g[0] + this.field_h;
              this.field_h = this.field_h + bc.field_Y;
              this.field_c = this.field_c - param0;
              return;
            } else {
              this.field_e[0] = this.field_e[0] + this.field_j;
              this.field_g[0] = this.field_g[0] + this.field_h;
              this.field_h = this.field_h + bc.field_Y;
              this.field_c = this.field_c - param0;
              return;
            }
          } else {
            this.field_e[var3] = this.field_e[-1 + var3];
            this.field_g[var3] = this.field_g[-1 + var3];
            var3--;
            continue L0;
          }
        }
    }

    final static bi a(rh param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        bi stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        bi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -21460) {
              if (ha.a(param0, param2 ^ 11872, param1, param3)) {
                stackIn_7_0 = kl.a(-88);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (bi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ji.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bi) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    ji(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        double[] var6 = null;
        int var7 = 0;
        double var5_double = 0.0;
        this.field_g = new double[20];
        this.field_e = new double[20];
        this.field_c = 249;
        try {
            this.field_e[0] = (double)param0;
            this.field_g[0] = (double)param1;
            this.field_d = param3;
            for (var5_int = 1; 20 > var5_int; var5_int++) {
                var6 = this.field_e;
                this.field_g[var5_int] = -1000.0;
                var7 = var5_int;
                var6[var7] = -1000.0;
            }
            var5_double = (double)(db.a((byte) -115, na.field_c, 10) + 15) / 10.0;
            this.field_j = ma.a((double)param2 * 3.141592653589793 / 512.0, 70) * var5_double;
            this.field_h = nb.a(3.141592653589793 * (double)param2 / 512.0, -127) * var5_double;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Instructions";
        field_i = 1;
    }
}
