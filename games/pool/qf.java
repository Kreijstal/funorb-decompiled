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
        int var5 = 0;
        dd[] var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("qf.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -101 % ((param1 - -31) / 38);
            stackIn_1_0 = (-param0[1] + this.field_g[1]) * param0[10] + (param0[9] * (this.field_g[0] + -param0[0]) + (this.field_g[2] - param0[2]) * param0[11]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("qf.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, dd[] param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dd[] var12 = null;
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
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("qf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
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
        int var2_int = 0;
        int var3 = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        this.field_n = null;
        this.field_o = null;
        try {
            this.field_n = param0;
            var2_int = ga.a(8192, true, ea.field_r);
            var3 = 1024;
            dupTemp$0 = -134217728 + ga.a(268435456, true, ea.field_r);
            this.field_q = dupTemp$0;
            dupTemp$1 = af.c((byte) -128, var2_int) * var3;
            this.field_m = dupTemp$1;
            dupTemp$2 = o.a(var2_int, (byte) 77) * var3;
            this.field_a = dupTemp$2;
            this.field_g = new int[]{dupTemp$0 >> -219057171, dupTemp$1 >> -277340819, dupTemp$2 >> 2115785453, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
            this.field_b = -(65536 + ga.a(131072, true, ea.field_r));
            this.field_c = ga.a(9, true, ea.field_r) - 5;
            this.field_h = -5 + ga.a(9, true, ea.field_r);
            this.field_p = new hm(ga.a(32768, true, ea.field_r) - 16384, ga.a(32768, true, ea.field_r) + -16384, ga.a(32768, true, ea.field_r) + -16384, -16384 + ga.a(32768, true, ea.field_r));
            this.field_p.b(true);
            this.field_e = new hm();
            this.field_e.a(60, ga.a(32768, true, ea.field_r) + -16384, -16384 + ga.a(32768, true, ea.field_r), -16384 + ga.a(32768, true, ea.field_r), 1 + ga.a(8, true, ea.field_r));
            this.field_e.b(true);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Enter name of player to add to list";
    }
}
