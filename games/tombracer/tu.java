/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class tu extends eha {
    static String field_e;
    static volatile int field_h;
    private vna field_c;
    static float field_g;
    ff field_f;
    static String field_d;

    private final boolean a(la param0, byte param1, int param2) {
        RuntimeException var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 47) {
            this.field_c = (vna) null;
          }
          stackIn_6_0 = (!this.field_f.b(param2, 0)) && (kq.a(-44, param0.q((byte) -82)).field_d);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("tu.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void a(int param0, hca param1, int param2, la param3, int param4, int param5) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        qw var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        Object var9 = null;
        String var9_ref = null;
        jha var10 = null;
        la var11 = null;
        try {
          if (ab.field_n != null) {
            ab.field_n.field_y.a((byte) -105, 77, -1);
          }
          var7 = new qw(param1, param3, param2, param5, param4);
          this.field_c.b((byte) -88, var7);
          var9 = null;
          if (1 != param5) {
            var8 = -10;
            var9_ref = gl.$cfr$intArgs$a$53ce4ab4c593(104, uta.field_n, new String[]{String.valueOf(var8)});
          } else {
            var8 = -5;
            var9_ref = gl.$cfr$intArgs$a$53ce4ab4c593(107, rf.field_a, new String[]{String.valueOf(var8)});
          }
          param1.h(param0 - 15, var8);
          this.field_f.field_D.a(param5, param1.A(0), param0 - 19);
          if (this.field_f.j(-1878) &&
            !this.field_f.d(-67) &&
            var9_ref != null) {
            var10 = ab.a(-48, var9_ref);
            iqa.field_c.a(3, param0 - 15, var10);
          }
          if (param0 != 15) {
            var11 = (la) null;
            this.a(77, (hca) null, 88, (la) null, -63, 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("tu.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, hca param2, fsa param3) {
        int var5_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        hr var6 = null;
        hr var7 = null;
        try {
          if (param0 == -1) {
            return;
          }
          var5_int = param0;
          if (var5_int == 0) {
            var6 = param2.f((byte) 121).a(param2.d(3), param2.e(9648), (byte) 100, 3145728 + param2.g((byte) 115));
            var6.a(false, 128, 15, 128, 50);
            var6.a(131072, 0, -107, 0);
          } else {
            if (1 != var5_int) {
              if (2 == var5_int) {
              }
            } else {
              var7 = param2.f((byte) -109).a(param2.d(3), param2.e(9648), (byte) 100, param2.g((byte) 115) + 3145728);
              var7.a(false, 128, 16, 128, 50);
              var7.a(131072, 0, -89, 0);
            }
          }
          if (param1 != 15818) {
            field_e = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("tu.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
          field_d = (String) null;
        }
        field_e = null;
        field_d = null;
    }

    final void a(int param0, la param1) {
        if (param0 <= 12) {
          la var4 = (la) null;
          this.a((hca) null, (la) null, false);
        }
        if (null != ab.field_n) {
          ab.field_n.field_y.a((byte) -105, 256, -1);
        }
        if (null == this.field_f) {
          return;
        }
        try {
          this.field_f.a(true, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tu.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(fsa param0, int param1) {
        int var3_int = 0;
        hca var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param0.w(17825792);
          if (var3_int == -1) {
            return;
          }
          var4 = param0.f((byte) -65).u(-90);
          if (param1 != 1) {
            return;
          }
          var5 = var3_int;
          if (var5 == 0) {
            this.field_f.field_D.d(1, 72, var4.A(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("tu.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, hca param1, la param2) {
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        fsa[] var5 = null;
        fsa[] var6 = null;
        fsa var8 = null;
        int var9 = 0;
        la var10 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.field_f.k(-25319) &&
            param2 != null &&
            param2.field_u != null) {
            var4_int = param2.u(-2).A(param0 + 2);
            if (param2.j(0) &&
              !this.field_f.j(param0 - 1876)) {
              qb.a(var4_int, 5);
            } else {
              li.b(var4_int, (byte) 116);
            }
            ff.d(param0 ^ -2, var4_int);
            var5 = param2.n(16);
            var6 = var5;
            for (var7 = 0; var7 < var6.length; var7++) {
              var8 = var6[var7];
              if (var8.E((byte) 3) == 1) {
                qw.a((byte) -32, var4_int);
              }
              if (2 == var8.E((byte) 3)) {
                mka.a(13, var4_int);
              }
            }
          }
          if (param0 != -2) {
            var10 = (la) null;
            this.a(84, (hca) null, 71, (la) null, -32, -21);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("tu.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final qw b(byte param0) {
        int var2 = -114 / ((59 - param0) / 50);
        if (this.field_c.d((byte) 14)) {
          return null;
        }
        return (qw) (this.field_c.c(73));
    }

    void a(hca param0, la param1, boolean param2) {
        jha dupTemp$0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jha var9_ref_jha = null;
        int var10 = 0;
        int var11 = 0;
        jha var12 = null;
        int var13 = 0;
        jha var9_ref_jhaLifetime1;
        int var9Lifetime1;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = kq.a(105, param1.q((byte) -82)).field_h;
          var4_int = var4_int * 2;
          var5 = param1.p((byte) 83);
          if (param2) {
            this.field_f = (ff) null;
          }
          var6 = 50;
          var7 = 0;
          if (var4_int > var5) {
            var7 = (-var5 + var4_int) * 5 / 50;
          }
          param0.h(0, param0.F(-7991) + (var7 + var6));
          var8 = param0.A(0);
          this.field_f.field_F[var8] = (long)var5;
          this.field_f.field_g[var8] = param1.q((byte) -82);
          if (!this.field_f.k(-25319) &&
            !this.field_f.j(-1878) &&
            this.field_f.field_x != null &&
            !this.a(param1, (byte) 74, var8)) {
            var9 = ll.a(param1.q((byte) -82), 0);
            if (var9 >= 0) {
              this.field_f.field_x[var8].set(var9);
            }
          }
          if (this.field_f.j(-1878) &&
            !this.field_f.d(-127)) {
            if (0 != var7) {
              var9_ref_jha = ab.a(-89, gl.$cfr$intArgs$a$53ce4ab4c593(112, wpa.field_J, new String[]{String.valueOf(var6), String.valueOf(var7)}));
            } else {
              var9_ref_jha = ab.a(-66, gl.$cfr$intArgs$a$53ce4ab4c593(92, gla.field_q, new String[]{String.valueOf(var6)}));
            }
            iqa.field_c.a(0, var9_ref_jha);
            var10 = param0.F(-7991);
            if (var10 > 0) {
              dupTemp$0 = ab.a(-96, gl.$cfr$intArgs$a$53ce4ab4c593(82, bca.field_c, new String[]{String.valueOf(var10)}));
              var12 = dupTemp$0;
              var9_ref_jhaLifetime1 = dupTemp$0;
              iqa.field_c.a(3, 0, var12);
            }
            this.field_f.field_I[var8] = true;
          }
          if (!this.field_f.j(-1878)) {
            var13 = 0;
            var9Lifetime1 = var13;
            while (var13 < 3) {
              this.field_f.field_D.b(param0.A(0), 65408, gp.field_i[var13] * param0.a(393216, var13));
              var13++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("tu.H(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    tu(ff param0) {
        try {
          this.field_f = param0;
          this.field_c = new vna();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "<%0> has entered a game.";
        field_d = "White light beams";
        field_h = 0;
    }
}
