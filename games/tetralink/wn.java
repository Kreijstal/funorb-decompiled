/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends eb {
    private g field_r;
    je field_u;
    static String field_v;
    static uh field_t;
    fg field_s;

    final eb c() {
        oc var1_ref = null;
        int var2 = TetraLink.field_J;
        do {
          var1_ref = (oc) (this.field_u.a((byte) -70));
          if (var1_ref == null) {
            return null;
          }
        } while (var1_ref.field_I == null);
        return (eb) ((Object) var1_ref.field_I);
    }

    final eb b() {
        oc var1 = (oc) (this.field_u.c(false));
        if (var1 == null) {
          return null;
        }
        if (var1.field_I == null) {
          return this.c();
        }
        return (eb) ((Object) var1.field_I);
    }

    private final void a(boolean param0, int param1, oc param2) {
        g stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        oc stackIn_9_2 = null;
        boolean stackIn_10_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param0) {
            return;
          }
          if ((this.field_r.field_I[param2.field_n] & 4) != 0 &&
            0 > param2.field_v) {
            var4_int = this.field_r.field_T[param2.field_n] / nk.field_k;
            var5 = (1048575 + var4_int - param2.field_F) / var4_int;
            param2.field_F = param2.field_F + var4_int * param1 & 1048575;
            if (var5 <= param1) {
              if (this.field_r.field_G[param2.field_n] == 0) {
                param2.field_I = ee.a(param2.field_y, param2.field_I.i(), param2.field_I.k(), param2.field_I.j());
              } else {
                param2.field_I = ee.a(param2.field_y, param2.field_I.i(), 0, param2.field_I.j());
                stackIn_9_0 = this.field_r;
                stackIn_9_1 = false;
                stackIn_9_2 = (oc) (param2);
                stackIn_10_3 = !(param2.field_B.field_o[param2.field_E] >= 0);
                ((g) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_10_3);
              }
              if (0 > param2.field_B.field_o[param2.field_E]) {
                param2.field_I.c(-1);
              }
              param1 = param2.field_F / var4_int;
            }
          }
          param2.field_I.a(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("wn.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 != 20406) {
          field_t = (uh) null;
          field_t = null;
          return;
        }
        field_t = null;
    }

    final static qa a(boolean param0) {
        int var1_int = 0;
        qa var2 = null;
        qa stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        try {
          if (param0) {
            field_t = (uh) null;
          }
          var1_int = 0;
          while (true) {
            var2 = n.field_U.a(var1_int, true);
            if (var2.field_w) {
              stackIn_6_0 = var2;
              return stackIn_6_0;
            }
            var1_int++;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    private final void a(oc param0, int[] param1, int param2, int param3, boolean param4, int param5) {
        g stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        oc stackIn_11_2 = null;
        boolean stackIn_12_3;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ee var11 = null;
        int var12 = 0;
        var12 = TetraLink.field_J;
        try {
          if ((this.field_r.field_I[param0.field_n] & 4) != 0 &&
            param0.field_v < 0) {
            var7_int = this.field_r.field_T[param0.field_n] / nk.field_k;
            while (true) {
              var8 = (-param0.field_F + (var7_int + 1048575)) / var7_int;
              if (param3 < var8) {
                param0.field_F = param0.field_F + var7_int * param3;
                break;
              }
              param0.field_I.b(param1, param2, var8);
              param2 = param2 + var8;
              param0.field_F = param0.field_F + (var8 * var7_int - 1048576);
              param3 = param3 - var8;
              var9 = nk.field_k / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param0.field_I;
              if (this.field_r.field_G[param0.field_n] != 0) {
                param0.field_I = ee.a(param0.field_y, var11.i(), 0, var11.j());
                stackIn_11_0 = this.field_r;
                stackIn_11_1 = false;
                stackIn_11_2 = (oc) (param0);
                stackIn_12_3 = !(param0.field_B.field_o[param0.field_E] >= 0);
                ((g) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, stackIn_12_3);
                param0.field_I.b(var9, var11.k());
              } else {
                param0.field_I = ee.a(param0.field_y, var11.i(), var11.k(), var11.j());
              }
              if (0 > param0.field_B.field_o[param0.field_E]) {
                param0.field_I.c(-1);
              }
              var11.g(var9);
              var11.b(param1, param2, param5 - param2);
              if (!var11.g()) {
                continue;
              }
              this.field_s.a(var11);
            }
          }
          if (param4) {
            return;
          }
          param0.field_I.b(param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("wn.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int a() {
        return 0;
    }

    final void a(int param0) {
        int var2;
        oc var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = TetraLink.field_J;
        this.field_s.a(param0);
        var3 = (oc) (this.field_u.c(false));
        while (var3 != null) {
          stackIn_4_0 = this.field_r.b((byte) 108, var3);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = param0;
            while (var2 > var3.field_s) {
              this.a(false, var3.field_s, var3);
              var2 = var2 - var3.field_s;
              if (this.field_r.a(0, (int[]) null, var2, var3, 21107)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(false, var2, var3);
              var3.field_s = var3.field_s - var2;
            }
          }
          var3 = (oc) (this.field_u.a((byte) -70));
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
        oc var6 = null;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          this.field_s.b(param0, param1, param2);
          var6 = (oc) (this.field_u.c(false));
          while (var6 != null) {
            stackIn_4_0 = this.field_r.b((byte) 127, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var6.field_s < var5) {
                this.a(var6, param0, var4_int, var6.field_s, false, var4_int + var5);
                var5 = var5 - var6.field_s;
                var4_int = var4_int + var6.field_s;
                if (this.field_r.a(var4_int, param0, var5, var6, 21107)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var6, param0, var4_int, var5, false, var5 + var4_int);
                var6.field_s = var6.field_s - var5;
              }
            }
            var6 = (oc) (this.field_u.a((byte) -70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("wn.BA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    wn(g param0) {
        this.field_u = new je();
        this.field_s = new fg();
        try {
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
