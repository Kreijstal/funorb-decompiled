/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ga extends sl implements sc {
    private ip field_ab;
    private int field_bb;

    final void i(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          super.i(-74);
          var2_int = 101 % ((28 - param0) / 49);
          if (null != this.field_ab) {
            this.field_ab.b(11755);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "ga.N(" + param0 + ')');
        }
    }

    final void a(byte param0, ip param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_ab = param1;
          if (param0 != -111) {
            ga.n(-52);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ga.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String e(int param0) {
        RuntimeException var2 = null;
        Object stackIn_5_0 = null;
        String stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_s &&
            null != this.field_p) {
            if (param0 > -10) {
              this.e(39);
            }
            te.a((byte) -39, gg.field_f, wn.field_i - this.field_bb + this.field_l);
            stackIn_10_0 = this.field_p;
            return stackIn_10_0;
          }
          stackIn_5_0 = null;
          return (String) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "ga.L(" + param0 + ')');
        }
    }

    final static void b(boolean param0) {
        try {
          be.f(-1);
          wo.field_c = true;
          ro.field_e = true;
          wd.field_Ub.k(-22216);
          wf.a(param0, na.field_d, -127);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ga.LA(" + param0 + ')');
        }
    }

    final static void n(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        oq var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        eo var6 = null;
        String var7 = null;
        eo var7_ref = null;
        String var8 = null;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        eo var6Lifetime1;
        try {
          var1 = kn.field_e;
          var2 = var1.g(-125);
          if (var2 == 0) {
            if (gd.field_c == null) {
              gd.field_c = new tk(128);
              gi.field_t = 0;
            }
            stackIn_10_0 = (1 != var1.g(-91)) ? 0 : 1;
            var3_int = stackIn_10_0;
            var4_ref_String = var1.j(param0 - 29836);
            if (var3_int != 0) {
              var5 = var1.j(-70);
            } else {
              var5 = var4_ref_String;
            }
            var6 = hl.a(var4_ref_String, 1);
            var7 = var1.j(-17);
            var8 = hq.a(117, (CharSequence) ((Object) var4_ref_String));
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = hl.a(var7, 1);
              if (var6 != null) {
                gd.field_c.a(-6946, (long)var8.hashCode(), var6);
              }
            }
            if (null == var6) {
              var6 = new eo();
              gd.field_c.a(param0 ^ -28521, (long)var8.hashCode(), var6);
              fieldTemp$0 = gi.field_t;
              gi.field_t = gi.field_t + 1;
              var6.field_Mb = fieldTemp$0;
              jq.field_c.b((byte) -31, var6);
            }
            var6.field_Yb = var5;
            var6.field_Sb = var7;
            var6.field_Zb = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (th.field_a == 1) {
                th.field_a = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (th.field_a == 2) {
                th.field_a = 1;
              }
              return;
            }
            if (param0 != 29769) {
              ga.a((int[]) null, (int[]) null, true);
            }
            if (var2 != 4) {
              tc.a((Throwable) null, "F1: " + t.a(93), param0 ^ -21796);
              dn.c(99);
              return;
            }
            th.field_a = 1;
            var3 = var1.j(-118);
            cm.field_J = ((String) (var3)).intern();
            var4 = var1.g(-84);
            vd.a((byte) 78, var4);
            return;
          }
          if (df.field_b == null) {
            df.field_b = new tk(128);
            nr.field_S = 0;
          }
          var3Lifetime1 = var1.j(-101);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.j(-70);
          var5Lifetime1 = var1.j(-54);
          var6Lifetime1 = gf.a(param0 - 29667, var4_ref_StringLifetime1);
          if (var6Lifetime1 == null) {
            var6Lifetime1 = gf.a(92, var5Lifetime1);
            if (null != var6Lifetime1) {
              df.field_b.a(-6946, (long)hq.a(123, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6Lifetime1);
            }
          }
          if (null == var6Lifetime1) {
            var6Lifetime1 = new eo();
            df.field_b.a(-6946, (long)hq.a(param0 ^ 29715, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6Lifetime1);
            fieldTemp$1 = nr.field_S;
            nr.field_S = nr.field_S + 1;
            var6Lifetime1.field_Mb = fieldTemp$1;
            cf.field_k.b((byte) -24, var6Lifetime1);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Wb = (String) (var3Lifetime1);
          var6Lifetime1.field_Zb = var4_ref_StringLifetime1;
          var6Lifetime1.field_Sb = var5Lifetime1;
          var6Lifetime1.a((byte) -117);
          var7_ref = (eo) (cf.field_k.c((byte) -125));
          while (var7_ref != null) {
            if (wk.a(var6Lifetime1, var7_ref, 83)) {
              var7_ref = (eo) (cf.field_k.f((byte) -5));
              continue;
            }
            break;
          }
          if (var7_ref == null) {
            cf.field_k.b((byte) 85, var6Lifetime1);
          } else {
            vj.a(var6Lifetime1, (byte) -119, var7_ref);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "ga.RA(" + param0 + ')');
        }
    }

    final static int a(int param0, boolean param1, Random param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param1) {
            stackIn_2_0 = -110;
            return stackIn_2_0;
          }
          if (param0 <= 0) {
            throw new IllegalArgumentException();
          }
          if (ql.a(param0, -90)) {
            stackIn_10_0 = (int)(((long)param2.nextInt() & 4294967295L) * (long)param0 >> 32);
            return stackIn_10_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)param0);
          do {
            var4 = param2.nextInt();
          } while (var4 >= var3_int);
          stackIn_16_0 = aj.a(true, param0, var4);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ga.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public final ip a(int param0) {
        ip stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -80 / ((param0 - 33) / 34);
          stackIn_1_0 = this.field_ab;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "ga.KA(" + param0 + ')');
        }
    }

    ga(String param0, cc param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(int[] param0, int[] param1, boolean param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          param1[1] = param1[1] - param0[1];
          param1[0] = param1[0] - param0[0];
          param1[2] = param1[2] - param0[2];
          var3_int = param1[1] * param0[4] + param0[3] * param1[0] + param1[2] * param0[5] >> 7;
          var4 = param0[7] * param1[1] + (param1[0] * param0[6] + param1[2] * param0[8]) >> 7;
          param1[2] = param0[10] * param1[1] + (param0[9] * param1[0] + param0[11] * param1[2]) >> 16;
          if (param1[2] == 0) {
            param1[2] = -1;
          }
          param1[0] = fb.field_q + var3_int / param1[2];
          param1[1] = var4 / param1[2] + fb.field_d;
          if (param2) {
            ga.m(-17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ga.NA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1 + 0, param2, param3);
          if (param1 != 958) {
            return;
          }
          this.field_bb = wn.field_i - (this.field_C + param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ga.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void m(int param0) {
        jc.field_e = new hm(ga.a(262144, true, ea.field_r) - 131072, -131072 + ga.a(262144, true, ea.field_r), -131072 + ga.a(262144, true, ea.field_r), -131072 + ga.a(262144, true, ea.field_r));
        jc.field_e.b(true);
        tf.field_a = dq.field_a;
        if (tf.field_a == null) {
          tf.field_a = al.field_B[0];
        }
        vn.field_e = ga.a(tf.field_a.b(param0 + 23883), true, ea.field_r);
        tp.field_h[1] = 0;
        tp.field_h[0] = -140;
        bf.field_i = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        if (param0 != -23499) {
          return;
        }
        try {
          tp.field_h[2] = 128;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ga.PA(" + param0 + ')');
        }
    }

    static {
    }
}
