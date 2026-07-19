/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qf {
    static byte[] field_j;
    private int field_m;
    static int field_i;
    static int field_f;
    private int[] field_g;
    private eg field_n;
    private int field_q;
    private hm field_e;
    private nc field_o;
    static String field_l;
    private int field_c;
    private int field_b;
    private int field_a;
    private hm field_p;
    static dd field_k;
    private int field_h;
    static ai field_d;

    final void a(int param0) {
        this.field_a = this.field_a + this.field_h;
        this.field_q = this.field_q + this.field_b;
        this.field_m = this.field_m + this.field_c;
        if ((this.field_q ^ -1) > -167772161) {
          if (-167772160 >= this.field_q) {
            this.field_q = 167772159;
            this.field_g[0] = this.field_q >> -1762639347;
            this.field_g[1] = this.field_m >> 522312589;
            this.field_g[2] = this.field_a >> 906360557;
            if (param0 != 2115785453) {
              return;
            } else {
              this.field_p.a(3, this.field_e);
              this.field_o = null;
              return;
            }
          } else {
            this.field_g[0] = this.field_q >> -1762639347;
            this.field_g[1] = this.field_m >> 522312589;
            this.field_g[2] = this.field_a >> 906360557;
            if (param0 != 2115785453) {
              return;
            } else {
              this.field_p.a(3, this.field_e);
              this.field_o = null;
              return;
            }
          }
        } else {
          this.field_q = -167772159;
          this.field_g[0] = this.field_q >> -1762639347;
          this.field_g[1] = this.field_m >> 522312589;
          this.field_g[2] = this.field_a >> 906360557;
          if (param0 != 2115785453) {
            return;
          } else {
            this.field_p.a(3, this.field_e);
            this.field_o = null;
            return;
          }
        }
    }

    final void a(int[] param0, gh param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        dd[] var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param2 > 79) {
                break L1;
              } else {
                var6 = (dd[]) null;
                qf.a(48, -85, 56, (byte) 112, -17, (dd[]) null);
                break L1;
              }
            }
            L2: {
              if (null != this.field_o) {
                break L2;
              } else {
                L3: {
                  this.field_p.a(this.field_g, -125);
                  if (this.field_q > 134217728) {
                    this.field_n.field_f = hi.field_h[this.field_q + -134217728 >> 1950978612];
                    break L3;
                  } else {
                    if (this.field_q >= -134217728) {
                      this.field_n.field_f = null;
                      break L3;
                    } else {
                      this.field_n.field_f = hi.field_h[-134217728 + -this.field_q >> -768754220];
                      break L3;
                    }
                  }
                }
                this.field_o = (nc) ((Object) this.field_n.a(param1.field_C, param1.field_F, param1.field_q, param1.field_e, param1.field_u, this.field_g));
                break L2;
              }
            }
            this.field_o.b(param0, this.field_g);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("qf.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        if (!param0) {
          field_l = (String) null;
          field_d = null;
          field_j = null;
          field_l = null;
          return;
        } else {
          field_d = null;
          field_j = null;
          field_l = null;
          return;
        }
    }

    final int a(int[] param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -101 % ((param1 - -31) / 38);
            stackOut_0_0 = (-param0[1] + this.field_g[1]) * param0[10] + (param0[9] * (this.field_g[0] + -param0[0]) + (this.field_g[2] - param0[2]) * param0[11]);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("qf.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, dd[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dd[] var12 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (-1 <= (param4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var6_int = param5[0].field_w;
                    var7 = param5[2].field_w;
                    var8 = param5[1].field_w;
                    param5[0].e(param2, param0, param1);
                    param5[2].e(-var7 + (param2 - -param4), param0, param1);
                    qh.a(sq.field_a);
                    qh.d(var6_int + param2, param0, param4 + (param2 + -var7), param0 + param5[1].field_y);
                    var9 = param2 - -var6_int;
                    var10 = param2 + param4 - var7;
                    if (param3 == 18) {
                      break L2;
                    } else {
                      var12 = (dd[]) null;
                      qf.a(-32, 78, -31, (byte) 16, 88, (dd[]) null);
                      break L2;
                    }
                  }
                  param2 = var9;
                  L3: while (true) {
                    if (param2 >= var10) {
                      qh.b(sq.field_a);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param5[1].e(param2, param0, param1);
                      param2 = param2 + var8;
                      continue L3;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("qf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    qf(eg param0) {
        int dupTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        this.field_n = null;
        this.field_o = null;
        try {
          L0: {
            this.field_n = param0;
            var2_int = ga.a(8192, true, ea.field_r);
            var3 = 1024;
            dupTemp$3 = -134217728 + ga.a(268435456, true, ea.field_r);
            this.field_q = dupTemp$3;
            dupTemp$4 = af.c((byte) -128, var2_int) * var3;
            this.field_m = dupTemp$4;
            dupTemp$5 = o.a(var2_int, (byte) 77) * var3;
            this.field_a = dupTemp$5;
            this.field_g = new int[]{dupTemp$3 >> -219057171, dupTemp$4 >> -277340819, dupTemp$5 >> 2115785453, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
            this.field_b = -(65536 + ga.a(131072, true, ea.field_r));
            this.field_c = ga.a(9, true, ea.field_r) - 5;
            this.field_h = -5 + ga.a(9, true, ea.field_r);
            this.field_p = new hm(ga.a(32768, true, ea.field_r) - 16384, ga.a(32768, true, ea.field_r) + -16384, ga.a(32768, true, ea.field_r) + -16384, -16384 + ga.a(32768, true, ea.field_r));
            this.field_p.b(true);
            this.field_e = new hm();
            this.field_e.a(60, ga.a(32768, true, ea.field_r) + -16384, -16384 + ga.a(32768, true, ea.field_r), -16384 + ga.a(32768, true, ea.field_r), 1 + ga.a(8, true, ea.field_r));
            this.field_e.b(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var2);
            stackOut_3_1 = new StringBuilder().append("qf.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_l = "Enter name of player to add to list";
    }
}
