/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends sj {
    static tf field_p;
    static String field_q;
    static String field_t;
    bb field_r;
    private ti field_s;
    vj field_o;

    final static sc e(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (param0 == 100) {
          var1 = eg.f(8192);
          if (var1 != null &&
            var1.indexOf('@') >= 0) {
            var1 = "";
          }
          return new sc(eg.f(8192), op.g(120));
        }
        field_p = (tf) null;
        var1Lifetime1 = eg.f(8192);
        if (var1Lifetime1 != null &&
          var1Lifetime1.indexOf('@') >= 0) {
          var1Lifetime1 = "";
        }
        return new sc(eg.f(8192), op.g(120));
    }

    final sj d() {
        in var1_ref = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        do {
          var1_ref = (in) (this.field_r.f(1504642273));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.field_G);
        return (sj) ((Object) var1_ref.field_G);
    }

    final sj b() {
        in var1 = (in) (this.field_r.c(1504642273));
        if (var1 == null) {
          return null;
        }
        if (null == var1.field_G) {
          return this.d();
        }
        return (sj) ((Object) var1.field_G);
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        wa.field_i = param0;
        if (oh.field_b != qh.field_c) {
          var2 = qh.field_c * qh.field_c;
          var3 = -(oh.field_b * oh.field_b) + var2;
          param0 = param0 + var3 * (qo.field_o - param0) / var2;
        }
        ui.field_i.a(param0, 120, ho.field_c, 256, 640);
        jp.a(qo.field_o - 24, (byte) 123, 640, hd.field_q, 5, 0, v.field_c);
        if (param1 != 112) {
          km.e(92);
          return;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        in var6 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_o.b(param0, param1, param2);
          var6 = (in) (this.field_r.c(1504642273));
          while (var6 != null) {
            stackIn_4_0 = this.field_s.c(var6, (byte) 75);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var6.field_E < var5) {
                this.a(var6, var5 + var4_int, var4_int, param0, -1, var6.field_E);
                var5 = var5 - var6.field_E;
                var4_int = var4_int + var6.field_E;
                if (this.field_s.a(var5, var6, var4_int, false, param0)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var6, var4_int + var5, var4_int, param0, -1, var5);
                var6.field_E = var6.field_E - var5;
              }
            }
            var6 = (in) (this.field_r.f(1504642273));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("km.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2;
        in var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        this.field_o.a(param0);
        var3 = (in) (this.field_r.c(1504642273));
        while (var3 != null) {
          if (!this.field_s.c(var3, (byte) 75)) {
            var2 = param0;
            do {
              if (var3.field_E >= var2) {
                this.a(var2, 9380, var3);
                var3.field_E = var3.field_E - var2;
                break;
              }
              this.a(var3.field_E, 9380, var3);
              var2 = var2 - var3.field_E;
            } while (!this.field_s.a(var2, var3, 0, false, (int[]) null));
          }
          var3 = (in) (this.field_r.f(1504642273));
        }
    }

    private final void a(in param0, int param1, int param2, int[] param3, int param4, int param5) {
        ti stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pp var11 = null;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          if (param4 != ~(4 & this.field_s.field_x[param0.field_I]) &&
            0 > param0.field_v) {
            var7_int = this.field_s.field_I[param0.field_I] / mm.field_h;
            while (true) {
              var8 = (1048575 - (-var7_int + param0.field_n)) / var7_int;
              if (var8 > param5) {
                param0.field_n = param0.field_n + param5 * var7_int;
                break;
              }
              param0.field_G.b(param3, param2, var8);
              param2 = param2 + var8;
              param0.field_n = param0.field_n + (var8 * var7_int - 1048576);
              param5 = param5 - var8;
              var9 = mm.field_h / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param0.field_G;
              if (this.field_s.field_o[param0.field_I] == 0) {
                param0.field_G = pp.a(param0.field_F, var11.i(), var11.e(), var11.f());
              } else {
                param0.field_G = pp.a(param0.field_F, var11.i(), 0, var11.f());
                stackIn_11_0 = this.field_s;
                stackIn_12_1 = !(param0.field_x.field_u[param0.field_A] >= 0);
                ((ti) (Object) stackIn_11_0).a(stackIn_12_1, (byte) 118, param0);
                param0.field_G.b(var9, var11.e());
              }
              if (0 > param0.field_x.field_u[param0.field_A]) {
                param0.field_G.g(-1);
              }
              var11.e(var9);
              var11.b(param3, param2, -param2 + param1);
              if (!var11.k()) {
                continue;
              }
              this.field_o.a(var11);
            }
          }
          param0.field_G.b(param3, param2, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("km.G(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int a() {
        return 0;
    }

    public static void a(byte param0) {
        field_p = null;
        field_t = null;
        field_q = null;
        if (param0 >= 101) {
          return;
        }
        km.e(-33);
    }

    private final void a(int param0, int param1, in param2) {
        ti stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.field_s.field_x[param2.field_I] & 4) != 0 &&
            param2.field_v < 0) {
            var4_int = this.field_s.field_I[param2.field_I] / mm.field_h;
            var5 = (1048575 + var4_int - param2.field_n) / var4_int;
            param2.field_n = param2.field_n + param0 * var4_int & 1048575;
            if (var5 <= param0) {
              if (this.field_s.field_o[param2.field_I] != 0) {
                param2.field_G = pp.a(param2.field_F, param2.field_G.i(), 0, param2.field_G.f());
                stackIn_8_0 = this.field_s;
                stackIn_9_1 = !(param2.field_x.field_u[param2.field_A] >= 0);
                ((ti) (Object) stackIn_8_0).a(stackIn_9_1, (byte) 118, param2);
              } else {
                param2.field_G = pp.a(param2.field_F, param2.field_G.i(), param2.field_G.e(), param2.field_G.f());
              }
              if (param2.field_x.field_u[param2.field_A] < 0) {
                param2.field_G.g(-1);
              }
              param0 = param2.field_n / var4_int;
            }
          }
          param2.field_G.a(param0);
          if (param1 == 9380) {
            return;
          }
          this.field_s = (ti) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("km.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    km(ti param0) {
        this.field_r = new bb();
        this.field_o = new vj();
        try {
          this.field_s = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "Average rating";
        field_t = "Respect";
    }
}
