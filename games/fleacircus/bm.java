/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends gj implements da {
    private bb[] field_F;
    private bd field_L;
    private String field_H;
    static int field_K;
    static String field_N;
    private fa field_G;
    static int field_M;
    private int[] field_I;
    private int field_J;

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (param3 != 248) {
            return;
          }
          for (var6_int = 0; var6_int < this.field_J; var6_int++) {
            if (this.field_F[var6_int] != param4) {
              continue;
            }
            var7 = this.field_I[var6_int];
            if (var7 != -1) {
              cg.a((byte) -105, this.field_I[var6_int]);
            } else {
              this.field_L.n(-22645);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("bm.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        if (this.field_J >= param1) {
          return;
        }
        bb[] var7 = new bb[param1];
        bb[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = param0; this.field_J > var5; var5++) {
          var7[var5] = this.field_F[var5];
          var4[var5] = this.field_I[var5];
        }
        this.field_F = var3;
        this.field_I = var4;
        this.field_J = param1;
    }

    public static void c(boolean param0) {
        if (param0) {
          field_N = (String) null;
        }
        field_N = null;
    }

    final bb a(kd param0, boolean param1, String param2) {
        bb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        bb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new bb(param2, param0);
          var4.field_p = (ch) ((Object) new ri());
          if (!param1) {
            this.field_G = (fa) null;
          }
          var5 = this.field_j - 2;
          this.a(0, this.field_u, 0, this.field_j + 34, 80);
          var4.a(7, this.field_u - 14, var5, 30, 80);
          this.a((qa) (var4), (byte) -32);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("bm.GA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static ll a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = fleas.field_A ? 1 : 0;
        ll var5 = (ll) (jj.field_S.c((byte) 47));
        while (var5 != null) {
          if (var5.field_k == param4) {
            return var5;
          }
          var5 = (ll) (jj.field_S.b((byte) -105));
        }
        var5 = new ll();
        var5.field_k = param4;
        var5.field_t = param2;
        var5.field_q = param3;
        jj.field_S.a(param0, var5);
        ak.a(-14722, var5, param1);
        return var5;
    }

    final static int f(byte param0) {
        if (param0 <= 8) {
          bm.c(true);
        }
        return (int)(1000000000L / na.field_f);
    }

    final static void e(byte param0) {
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var2Lifetime1;
        var9 = fleas.field_A ? 1 : 0;
        try {
          if (param0 != 31) {
            bm.c(false);
          }
          for (var1_int = 0; var1_int < qi.field_f; var1_int++) {
            var3 = rk.field_u[var1_int];
            var4 = kk.field_a[var1_int];
            var2 = -1 + var3;
            var8 = 16 * var4 + 16;
            var7 = 16 * var3 + 20;
            var6 = var4 * 16;
            if (fl.field_c[var3][var4] != 14 &&
              fl.field_c[var3][var4] != 28) {
              me.field_i[var1_int] = 1;
            }
            var5 = var3 * 16;
            while (qg.a(fl.field_c[var2][var4], -48)) {
              var5 -= 16;
              var2--;
            }
            var2Lifetime1 = var3 + 1;
            while (qg.a(fl.field_c[var2Lifetime1][var4], -117)) {
              var2Lifetime1++;
              var7 += 16;
            }
            oa.field_m[var1_int] = var5;
            uh.field_n[var1_int] = var6;
            lc.field_v[var1_int] = var7;
            ca.field_G[var1_int] = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "bm.EA(" + param0 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_J;
          this.a(param1 ^ param1, 1 + var4_int);
          this.field_F[var4_int] = this.a((kd) (this), true, param0);
          this.field_I[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "bm.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    bm(bd param0, fa param1, String param2) {
        super(0, 0, 288, 0, (ch) null);
        int var4_int = 0;
        this.field_J = 0;
        try {
          this.field_G = param1;
          this.field_H = param2;
          this.field_L = param0;
          var4_int = null == this.field_H ? 0 : this.field_G.b(this.field_H, 260, this.field_G.field_H);
          this.a(0, 288, 0, var4_int + 22, 80);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        this.field_G.a(this.field_H, 14 + param1 + this.field_y, param0 + (this.field_z + 10), -28 + this.field_u, this.field_j, 16777215, -1, 0, 0, this.field_G.field_H);
    }

    static {
        field_N = "To server list";
    }
}
