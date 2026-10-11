/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends wh {
    static qj field_n;
    private nb field_p;
    static String field_m;
    ja field_q;
    k field_o;

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ha var6 = null;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          this.field_o.a(param0, param1, param2);
          var6 = (ha) (this.field_q.b(2));
          while (var6 != null) {
            if (!this.field_p.a(-39, var6)) {
              var4_int = param1;
              var5 = param2;
              do {
                if (var6.field_w >= var5) {
                  this.a(param0, var4_int, (byte) 126, var5, var6, var5 + var4_int);
                  var6.field_w = var6.field_w - var5;
                  break;
                }
                this.a(param0, var4_int, (byte) 126, var6.field_w, var6, var4_int + var5);
                var4_int = var4_int + var6.field_w;
                var5 = var5 - var6.field_w;
              } while (!this.field_p.a(var5, param0, var4_int, 1, var6));
            }
            var6 = (ha) (this.field_q.a(10));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ol.HA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(ha param0, int param1, int param2) {
        nb stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        boolean stackIn_8_2 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((4 & this.field_p.field_I[param0.field_D]) != 0 &&
            param0.field_v < 0) {
            var4_int = this.field_p.field_M[param0.field_D] / oa.field_h;
            var5 = (var4_int + (1048575 - param0.field_C)) / var4_int;
            param0.field_C = 1048575 & param0.field_C + param1 * var4_int;
            if (var5 <= param1) {
              if (0 != this.field_p.field_R[param0.field_D]) {
                param0.field_l = bh.a(param0.field_n, param0.field_l.f(), 0, param0.field_l.g());
                stackIn_7_0 = this.field_p;
                stackIn_7_1 = false;
                stackIn_8_2 = !(param0.field_B.field_q[param0.field_i] >= 0);
                ((nb) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_8_2, param0);
              } else {
                param0.field_l = bh.a(param0.field_n, param0.field_l.f(), param0.field_l.e(), param0.field_l.g());
              }
              if (0 > param0.field_B.field_q[param0.field_i]) {
                param0.field_l.f(-1);
              }
              param1 = param0.field_C / var4_int;
            }
          }
          if (param2 > -100) {
            this.field_q = (ja) null;
          }
          param0.field_l.d(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ol.F(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int c() {
        return 0;
    }

    final void d(int param0) {
        int var2;
        ha var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        this.field_o.d(param0);
        var3 = (ha) (this.field_q.b(2));
        while (var3 != null) {
          if (!this.field_p.a(-93, var3)) {
            var2 = param0;
            do {
              if (var3.field_w >= var2) {
                this.a(var3, var2, -118);
                var3.field_w = var3.field_w - var2;
                break;
              }
              this.a(var3, var3.field_w, -107);
              var2 = var2 - var3.field_w;
            } while (!this.field_p.a(var2, (int[]) null, 0, 1, var3));
          }
          var3 = (ha) (this.field_q.a(10));
        }
    }

    final wh b() {
        ha var1 = (ha) (this.field_q.b(2));
        if (var1 == null) {
          return null;
        }
        if (null == var1.field_l) {
          return this.a();
        }
        return (wh) ((Object) var1.field_l);
    }

    private final void a(int[] param0, int param1, byte param2, int param3, ha param4, int param5) {
        nb stackIn_13_0 = null;
        boolean stackIn_13_1 = false;
        boolean stackIn_14_2 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bh var11 = null;
        int var12 = 0;
        var12 = TrackController.field_F ? 1 : 0;
        try {
          if ((this.field_p.field_I[param4.field_D] & 4) != 0 &&
            0 > param4.field_v) {
            var7_int = this.field_p.field_M[param4.field_D] / oa.field_h;
            while (true) {
              var8 = (-param4.field_C + 1048575 + var7_int) / var7_int;
              if (param3 < var8) {
                param4.field_C = param4.field_C + var7_int * param3;
                break;
              }
              param4.field_l.a(param0, param1, var8);
              param3 = param3 - var8;
              param1 = param1 + var8;
              param4.field_C = param4.field_C + (-1048576 + var7_int * var8);
              var9 = oa.field_h / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param4.field_l;
              if (this.field_p.field_R[param4.field_D] != 0) {
                param4.field_l = bh.a(param4.field_n, var11.f(), 0, var11.g());
                stackIn_13_0 = this.field_p;
                stackIn_13_1 = false;
                stackIn_14_2 = !(0 <= param4.field_B.field_q[param4.field_i]);
                ((nb) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_14_2, param4);
                param4.field_l.c(var9, var11.e());
              } else {
                param4.field_l = bh.a(param4.field_n, var11.f(), var11.e(), var11.g());
              }
              if (param4.field_B.field_q[param4.field_i] < 0) {
                param4.field_l.f(-1);
              }
              var11.h(var9);
              var11.a(param0, param1, param5 - param1);
              if (!var11.i()) {
                continue;
              }
              this.field_o.a(var11);
            }
          }
          param4.field_l.a(param0, param1, param3);
          if (param2 == 126) {
            return;
          }
          this.c();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("ol.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(')').toString());
        }
    }

    final wh a() {
        ha var1_ref = null;
        do {
          var1_ref = (ha) (this.field_q.a(10));
          if (var1_ref == null) {
            return null;
          }
        } while (var1_ref.field_l == null);
        return (wh) ((Object) var1_ref.field_l);
    }

    public static void f(int param0) {
        field_m = null;
        if (param0 > -2) {
          return;
        }
        field_n = null;
    }

    final static void e(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 == 256) {
          if (qd.field_d >= 224) {
            da.a(256, (byte) -74);
          } else {
            var1 = qd.field_d % 32;
            da.a(-var1 + (32 + qd.field_d), (byte) -74);
          }
          return;
        }
        ol.f(-80);
        if (qd.field_d >= 224) {
          da.a(256, (byte) -74);
        } else {
          var1Lifetime1 = qd.field_d % 32;
          da.a(-var1Lifetime1 + (32 + qd.field_d), (byte) -74);
        }
    }

    ol(nb param0) {
        this.field_q = new ja();
        this.field_o = new k();
        try {
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ol.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Please enter your age in years";
    }
}
