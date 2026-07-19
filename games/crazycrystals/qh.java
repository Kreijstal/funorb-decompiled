/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qh extends hk {
    private int field_m;
    static hj field_h;
    static boolean field_f;
    static String field_g;
    private int field_l;
    static Vector field_o;
    private int field_n;
    private int field_j;
    private int field_p;
    static int field_k;
    static int field_i;

    final pb b(byte param0) {
        if (param0 <= -127) {
            return null;
        }
        return (pb) null;
    }

    final static boolean a(int param0, int param1, int param2, db param3) {
        dl[] array$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (-1 == (param2 ^ -1)) {
                if (null != vj.field_a) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  vj.field_a = new dl[23][];
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var4_int = 23 * param2 >> -693818206;
            if (vj.field_a[var4_int] == null) {
              td.a((float)param1, oi.field_b, false);
              fe.field_g.a(param0 + -9384);
              L2: while (true) {
                if (var4_int >= 23 * (1 + param2) >> -1700909022) {
                  L3: {
                    if (param0 == 9260) {
                      break L3;
                    } else {
                      qh.c((byte) 33);
                      break L3;
                    }
                  }
                  stackOut_28_0 = 1;
                  stackIn_29_0 = stackOut_28_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    array$1 = new dl[bp.field_c[var4_int]];
                    vj.field_a[var4_int] = array$1;
                    if (wk.field_c[var4_int] != null) {
                      L5: {
                        if (wk.field_c[var4_int] != "") {
                          sd.field_R = bf.a(-1, "sprites_player_" + wk.field_c[var4_int], "", param3);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var5 = 0;
                      L6: while (true) {
                        if (var5 >= fg.field_j[var4_int]) {
                          L7: while (true) {
                            if (bp.field_c[var4_int] <= var5) {
                              break L4;
                            } else {
                              vj.field_a[var4_int][var5] = sd.field_R[var5 + (vf.field_a[var4_int] + oe.field_c[var4_int])];
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          vj.field_a[var4_int][var5] = sd.field_R[vf.field_a[var4_int] + var5];
                          var5++;
                          continue L6;
                        }
                      }
                    } else {
                      var5 = 0;
                      L8: while (true) {
                        if (var5 >= bp.field_c[var4_int]) {
                          break L4;
                        } else {
                          vj.field_a[var4_int][var5] = vj.field_a[var4_int + -1][var5].c();
                          var5++;
                          continue L8;
                        }
                      }
                    }
                  }
                  var4_int++;
                  continue L2;
                }
              }
            } else {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("qh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_29_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, ta param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ta var8 = null;
        ln var9 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var9 = (ln) (vm.field_j[param0].elementAt(ib.field_l[param0]));
              var5 = (18 + (16384 * m.field_l[param0] - -73728)) / 37;
              if ((var9.field_e ^ -1) > -1) {
                this.field_l = this.field_l + 1;
                this.field_j = this.field_j + var5;
                break L1;
              } else {
                this.field_m = this.field_m + var5;
                this.field_n = this.field_n + 1;
                break L1;
              }
            }
            L2: {
              if (-1 == (var9.field_e ^ -1)) {
                stackOut_5_0 = pd.field_g[param0];
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = var9.field_e;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var6 = stackIn_6_0;
              if (param1 == 23041505) {
                break L3;
              } else {
                var8 = (ta) null;
                this.a(32, -26, (ta) null);
                break L3;
              }
            }
            var7 = var6;
            mb.field_g = mb.field_g - var7;
            pd.field_g[param0] = pd.field_g[param0] + var6;
            ib.field_l[param0] = ib.field_l[param0] + 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("qh.M(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void a(byte param0) {
        if ((this.field_n ^ -1) < -1) {
            tb.field_d.a(oj.field_L[this.field_p], 100, gi.field_m * 128, this.field_m / this.field_n);
            this.field_m = 0;
            this.field_n = 0;
            this.field_p = this.field_p + 1;
        }
        if (!((this.field_l ^ -1) >= -1)) {
            tb.field_d.a(bp.field_a, 100, gi.field_m * 128, this.field_j / this.field_l);
            this.field_l = 0;
            this.field_j = 0;
        }
        int var2 = -9 / ((param0 - 29) / 42);
    }

    public static void c(byte param0) {
        if (param0 <= 6) {
            return;
        }
        field_o = null;
        field_g = null;
        field_h = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        for (var5 = 0; param2 > var5; var5++) {
            this.a(param1, 23041505, (ta) null);
        }
        if (!param0) {
            this.a(true, -42, 29, 122);
        }
    }

    qh() {
        this.field_n = 0;
        this.field_m = 0;
        this.field_j = 0;
        this.field_l = 0;
        this.field_p = 0;
    }

    static {
        field_g = "Safe";
        field_i = 0;
    }
}
