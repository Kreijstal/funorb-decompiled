/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends wf {
    static String field_k;
    private pk field_p;
    static mj field_o;
    static int field_n;
    bc field_m;
    rb field_l;

    final wf d() {
        kl var1 = (kl) (this.field_m.a((byte) -52));
        if (var1 == null) {
          return null;
        }
        if (null == var1.field_i) {
          return this.c();
        }
        return (wf) ((Object) var1.field_i);
    }

    private final void a(int[] param0, int param1, int param2, kl param3, byte param4, int param5) {
        pk stackIn_13_0 = null;
        kl stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        boolean stackIn_14_3;
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
        pi var11 = null;
        int var12 = 0;
        var12 = Bounce.field_N;
        try {
          if ((this.field_p.field_l[param3.field_E] & 4) != 0 &&
            param3.field_C < 0) {
            var7_int = this.field_p.field_K[param3.field_E] / e.field_r;
            while (true) {
              var8 = (var7_int + 1048575 - param3.field_u) / var7_int;
              if (var8 > param2) {
                param3.field_u = param3.field_u + param2 * var7_int;
                break;
              }
              param3.field_i.a(param0, param5, var8);
              param2 = param2 - var8;
              param3.field_u = param3.field_u + (var8 * var7_int - 1048576);
              param5 = param5 + var8;
              var9 = e.field_r / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param3.field_i;
              if (this.field_p.field_s[param3.field_E] != 0) {
                param3.field_i = pi.a(param3.field_w, var11.j(), 0, var11.h());
                stackIn_13_0 = this.field_p;
                stackIn_13_1 = (kl) (param3);
                stackIn_13_2 = -115;
                stackIn_14_3 = !(param3.field_D.field_n[param3.field_r] >= 0);
                ((pk) (Object) stackIn_13_0).a(stackIn_13_1, (byte) stackIn_13_2, stackIn_14_3);
                param3.field_i.d(var9, var11.g());
              } else {
                param3.field_i = pi.a(param3.field_w, var11.j(), var11.g(), var11.h());
              }
              if (param3.field_D.field_n[param3.field_r] < 0) {
                param3.field_i.f(-1);
              }
              var11.i(var9);
              var11.a(param0, param5, param1 - param5);
              if (!var11.k()) {
                continue;
              }
              this.field_l.a(var11);
            }
          }
          param3.field_i.a(param0, param5, param2);
          if (param4 < -54) {
            return;
          }
          this.a(-79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("ka.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(kl param0, int param1, int param2) {
        pk stackIn_8_0 = null;
        kl stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        boolean stackIn_9_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.field_p.field_l[param0.field_E] & 4) != 0 &&
            param0.field_C < 0) {
            var4_int = this.field_p.field_K[param0.field_E] / e.field_r;
            var5 = (-param0.field_u + (1048575 + var4_int)) / var4_int;
            param0.field_u = param0.field_u + var4_int * param1 & 1048575;
            if (var5 <= param1) {
              if (this.field_p.field_s[param0.field_E] != 0) {
                param0.field_i = pi.a(param0.field_w, param0.field_i.j(), 0, param0.field_i.h());
                stackIn_8_0 = this.field_p;
                stackIn_8_1 = (kl) (param0);
                stackIn_8_2 = -128;
                stackIn_9_3 = !(param0.field_D.field_n[param0.field_r] >= 0);
                ((pk) (Object) stackIn_8_0).a(stackIn_8_1, (byte) stackIn_8_2, stackIn_9_3);
              } else {
                param0.field_i = pi.a(param0.field_w, param0.field_i.j(), param0.field_i.g(), param0.field_i.h());
              }
              if (0 > param0.field_D.field_n[param0.field_r]) {
                param0.field_i.f(-1);
              }
              param1 = param0.field_u / var4_int;
            }
          }
          if (param2 >= -58) {
            field_k = (String) null;
          }
          param0.field_i.a(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ka.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_k = null;
        if (param0 == 0) {
          return;
        }
        field_n = 46;
    }

    final void a(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kl var6 = null;
        int var7 = 0;
        var7 = Bounce.field_N;
        try {
          this.field_l.a(param0, param1, param2);
          var6 = (kl) (this.field_m.a((byte) -49));
          while (var6 != null) {
            stackIn_4_0 = this.field_p.a(var6, 8335400);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.field_j) {
                this.a(param0, var4_int + var5, var6.field_j, var6, (byte) -109, var4_int);
                var4_int = var4_int + var6.field_j;
                var5 = var5 - var6.field_j;
                if (this.field_p.a(param0, var5, var4_int, var6, (byte) 106)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(param0, var4_int + var5, var5, var6, (byte) -70, var4_int);
                var6.field_j = var6.field_j - var5;
              }
            }
            var6 = (kl) (this.field_m.d((byte) 127));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ka.P(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.removeMouseListener(nj.field_o);
          if (param1 > -72) {
            field_k = (String) null;
          }
          param0.removeMouseMotionListener(nj.field_o);
          param0.removeFocusListener(nj.field_o);
          c.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ka.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b() {
        return 0;
    }

    final wf c() {
        kl var1;
        while (true) {
          var1 = (kl) (this.field_m.d((byte) -94));
          if (var1 == null) {
            return null;
          }
          if (null != var1.field_i) {
            return (wf) ((Object) var1.field_i);
          }
        }
    }

    final void a(int param0) {
        int var2;
        kl var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = Bounce.field_N;
        this.field_l.a(param0);
        var3 = (kl) (this.field_m.a((byte) -91));
        while (var3 != null) {
          stackIn_4_0 = this.field_p.a(var3, 8335400);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = param0;
            while (var2 > var3.field_j) {
              this.a(var3, var3.field_j, -124);
              var2 = var2 - var3.field_j;
              if (this.field_p.a((int[]) null, var2, 0, var3, (byte) 112)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(var3, var2, -96);
              var3.field_j = var3.field_j - var2;
            }
          }
          var3 = (kl) (this.field_m.d((byte) -101));
        }
    }

    ka(pk param0) {
        this.field_m = new bc();
        this.field_l = new rb();
        try {
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Keys";
    }
}
