/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends ic {
    static ka[][][] field_I;
    static int field_J;
    static int[] field_L;
    static String field_M;
    static int[] field_H;
    private sl field_G;
    static ka field_F;
    static int[] field_K;

    final void g(byte param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param0 != -37) {
          field_L = (int[]) null;
        }
        nj var2 = new nj(this.field_G);
        b var3 = (b) (var2.c(0));
        while (var3 != null) {
          if (var3.h(124)) {
            var3.a(true);
          }
          var3 = (b) (var2.a(false));
        }
    }

    final static void e(byte param0) {
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ka var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var1_intLifetime1;
        int var3Lifetime1;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != 125) {
            field_K = (int[]) null;
          }
          var1_int = ba.field_b[1].field_q + ba.field_b[0].field_q + ba.field_b[2].field_q;
          var2 = 3;
          var3 = lg.field_d[var2][8];
          var4 = ef.field_j[0];
          var5 = ef.field_j[1];
          var6 = var4 - var1_int >> 1;
          var7 = var4 - (var1_int + (var6 << 1) - var6);
          var8 = var5 - var3 >> 1;
          var9 = var8 - (var8 << 1) + var5 - var3;
          rj.a(2, var2, var3, ba.field_b, var1_int);
          ji.field_p = new ka[9];
          var12 = de.field_a;
          for (var15 = 0; var15 < 9; var15++) {
            var16 = var15;
            if (var16 != 0 &&
              var16 != 2 &&
              var16 != 6 &&
              var16 != 8) {
              if (var16 != 1 &&
                var16 != 7) {
                if (var16 != 3 &&
                  5 != var16) {
                  if (var16 == 4) {
                    var13 = var12.field_q;
                    var14 = var12.field_v;
                    var1_intLifetime1 = -var7 + (var13 - var6) - ba.field_b[var15].field_q * 2;
                    var3Lifetime1 = -(ba.field_b[var15].field_v * 2) + (-var8 + var14 - var9);
                    ji.field_p[var15] = new ka(var1_intLifetime1, var3Lifetime1);
                    ji.field_p[var15].d();
                    var3Lifetime1 = ba.field_b[var15].field_v;
                    var1_intLifetime1 = ba.field_b[var15].field_q;
                    var10 = -var6 - var1_intLifetime1;
                    var11 = -var3Lifetime1 - var8;
                    var12.g(var10, var11);
                  }
                } else {
                  var14 = var12.field_v;
                  var1_intLifetime1 = ba.field_b[var15].field_q;
                  var13 = var12.field_q;
                  var3Lifetime1 = -var9 + (var14 - var8 - 2 * ba.field_b[var15].field_v);
                  ji.field_p[var15] = new ka(var1_intLifetime1, var3Lifetime1);
                  ji.field_p[var15].d();
                  var3Lifetime1 = ba.field_b[var15].field_v;
                  if (3 == var15) {
                    var10 = -var6;
                  } else {
                    var10 = var7 + (-var13 + var1_intLifetime1);
                  }
                  var11 = -var3Lifetime1 - var8;
                  var12.g(var10, var11);
                }
              } else {
                var14 = var12.field_v;
                var13 = var12.field_q;
                var3Lifetime1 = ba.field_b[var15].field_v;
                var1_intLifetime1 = -(ba.field_b[var15].field_q * 2) + (-var7 - var6) + var13;
                ji.field_p[var15] = new ka(var1_intLifetime1, var3Lifetime1);
                ji.field_p[var15].d();
                var1_intLifetime1 = ba.field_b[var15].field_q;
                var10 = -var6 - var1_intLifetime1;
                if (1 == var15) {
                  var11 = -var8;
                } else {
                  var11 = var9 + (-var14 + var3Lifetime1);
                }
                var12.g(var10, var11);
              }
            } else {
              var14 = var12.field_v;
              var13 = var12.field_q;
              var1_intLifetime1 = ba.field_b[var15].field_q;
              var3Lifetime1 = ba.field_b[var15].field_v;
              ji.field_p[var15] = new ka(var1_intLifetime1, var3Lifetime1);
              if (0 != var15 &&
                var15 != 2) {
                var11 = var9 - var14 + var3Lifetime1;
              } else {
                var11 = -var8;
              }
              if (var15 != 0 &&
                var15 != 6) {
                var10 = var1_intLifetime1 - var13 + var7;
              } else {
                var10 = -var6;
              }
              ji.field_p[var15].d();
              var12.g(var10, var11);
            }
          }
          la.field_f.a(param0 - 188);
          ll.field_b = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "si.F(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (null != this.field_q) {
          this.field_q.a((ee) (this), param0, param1, (byte) 97, true);
        }
        nj var5 = new nj(this.field_G);
        ee var6 = (ee) (var5.a(-107));
        if (param2) {
          return;
        }
        while (var6 != null) {
          var6.a(this.field_i + param0, this.field_m + param1, false, param3);
          var6 = (ee) (var5.c((byte) -13));
        }
    }

    final static String h(int param0) {
        if (qc.field_i == gj.field_a) {
          return vb.field_m;
        }
        if (eh.field_p == qc.field_i) {
          return ta.field_zb;
        }
        if (!ji.field_k.b(0)) {
          return ta.field_zb;
        }
        int var1 = -6 % ((78 - param0) / 36);
        return lg.field_b;
    }

    final static vh a(String param0, int param1) {
        RuntimeException var2 = null;
        ka[] var3 = null;
        vh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 22) {
            var3 = (ka[]) null;
            si.a(true, (ka[]) null, -120, -97);
          }
          if (ji.field_k.b(0) &&
            !param0.equals(ji.field_k.a(0))) {
            ji.field_k = og.a(param0, true);
          }
          stackIn_7_0 = ji.field_k;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("si.S(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, ka[] param1, int param2, int param3) {
        try {
          gb.field_f = new h(param1);
          if (!param0) {
            si.a(-13, (int[][]) null, 101, (int[][][]) null, -87, 90);
          }
          i.field_m = param3;
          mg.field_d = param2;
          rf.m(62);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "si.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ee c(byte param0) {
        nj var2;
        b var3;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        var2 = new nj(this.field_G);
        if (param0 > -24) {
          field_L = (int[]) null;
        }
        var3 = (b) (var2.c(0));
        while (var3 != null) {
          if (var3.field_K) {
            return var3.d((byte) 107);
          }
          var3 = (b) (var2.a(false));
        }
        return null;
    }

    final static void a(int param0, int[][] param1, int param2, int[][][] param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          var7 = 64;
          for (var9 = 0; 2 > var9; var9++) {
            for (var10 = 0; var10 <= 1; var10++) {
              sf.field_d[var9][param2][var10].d();
              qg.a(ae.field_y);
              var6_int = param3[param2][var10][1] - param3[param2][var10][0];
              if (var6_int > 0) {
                qg.a(0, 0, var6_int, var7);
                var8 = param1[var10][param2];
                od.a(nj.field_e[var9][var6_int - 1], var8);
                qg.b(ae.field_y);
                la.field_f.a(-38);
              }
            }
          }
          la.field_f.a(param5 + 104);
          if (param5 != 1) {
            field_L = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("si.DA(").append(param0).append(',');
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
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void j(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        nj var2 = new nj(this.field_G);
        b var3 = (b) (var2.c(0));
        while (var3 != null) {
          if (var3.j(1)) {
            var3.a(true);
          }
          var3 = (b) (var2.a(false));
        }
        if (param0 > -38) {
          this.field_G = (sl) null;
        }
        this.field_A = (ee) ((Object) this.f((byte) 123));
    }

    final b f(byte param0) {
        nj var2;
        b var3;
        int var4;
        ee var5;
        var4 = TorChallenge.field_F ? 1 : 0;
        var2 = new nj(this.field_G);
        if (param0 != 123) {
          var5 = (ee) null;
          this.a((byte) -70, (ee) null);
        }
        var3 = (b) (var2.c(0));
        while (var3 != null) {
          if (var3.field_K) {
            return var3;
          }
          var3 = (b) (var2.a(false));
        }
        return null;
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param3) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param0) {
          var4++;
        }
        if (param1 != 8586514) {
          si.a(false, 58, false, false);
        }
        return ii.field_g[var4];
    }

    public static void d(byte param0) {
        field_K = null;
        int var1 = 74 % ((param0 - 15) / 51);
        field_H = null;
        field_I = (ka[][][]) null;
        field_F = null;
        field_M = null;
        field_L = null;
    }

    final void i(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        nj var2 = new nj(this.field_G);
        b var3 = (b) (var2.c(0));
        while (var3 != null) {
          var3.field_K = false;
          var3 = (b) (var2.a(false));
        }
        this.field_A = null;
        if (param0 != 8389905) {
          si.e((byte) 49);
        }
    }

    final void a(byte param0, ee param1) {
        b var3 = null;
        if (param0 < 52) {
          return;
        }
        try {
          if (!(param1 instanceof b)) {
            throw new IllegalArgumentException();
          }
          var3 = (b) (param1);
          this.field_G.a((byte) 119, var3);
          var3.field_K = true;
          var3.a((ee) (this), 0);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "si.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public si() {
        super(0, 0, TorChallenge.field_G, md.field_h, (j) null, (gg) null);
        this.field_G = new sl();
    }

    static {
        field_H = new int[]{6882317, 8389905, 8586514, 6882317};
        field_L = new int[2];
        field_M = "Start Game";
        field_K = new int[8192];
    }
}
