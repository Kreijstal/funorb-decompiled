/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends kd {
    ko field_t;
    static bp field_s;
    static boolean field_v;
    static int field_r;
    private vk field_w;
    static di field_u;
    static String[] field_q;
    ai field_p;

    final kd b() {
        pr var1;
        while (true) {
          var1 = (pr) (this.field_t.f((byte) -5));
          if (var1 == null) {
            return null;
          }
          if (null != var1.field_o) {
            return (kd) ((Object) var1.field_o);
          }
        }
    }

    final static void c(int param0) {
        if (param0 > -21) {
          field_s = (bp) null;
          lf.a(17, (byte) 77);
          return;
        }
        lf.a(17, (byte) 77);
    }

    private final void a(int param0, pr param1, int param2) {
        vk stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pr stackIn_9_2 = null;
        boolean stackIn_10_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param2 != 1048575) {
            return;
          }
          if ((this.field_w.field_F[param1.field_t] & 4) != 0) {
            if (param1.field_G >= 0) {
              param1.field_o.a(param0);
              return;
            }
            var4_int = this.field_w.field_L[param1.field_t] / bp.field_h;
            var5 = (-param1.field_y + (var4_int + 1048575)) / var4_int;
            param1.field_y = param1.field_y + var4_int * param0 & 1048575;
            if (var5 <= param0) {
              if (this.field_w.field_U[param1.field_t] == 0) {
                param1.field_o = nb.b(param1.field_C, param1.field_o.m(), param1.field_o.j(), param1.field_o.f());
              } else {
                param1.field_o = nb.b(param1.field_C, param1.field_o.m(), 0, param1.field_o.f());
                stackIn_9_0 = this.field_w;
                stackIn_9_1 = param2 - 1048698;
                stackIn_9_2 = (pr) (param1);
                stackIn_10_3 = !(param1.field_u.field_s[param1.field_A] >= 0);
                ((vk) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_10_3);
              }
              if (param1.field_u.field_s[param1.field_A] < 0) {
                param1.field_o.e(-1);
              }
              param0 = param1.field_y / var4_int;
            }
          }
          param1.field_o.a(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ib.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, pr param2, int param3, int param4, int[] param5) {
        vk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pr stackIn_14_2 = null;
        boolean stackIn_15_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nb var11 = null;
        int var12 = 0;
        var12 = Pool.field_O;
        try {
          if ((4 & this.field_w.field_F[param2.field_t]) != 0 &&
            param2.field_G < 0) {
            var7_int = this.field_w.field_L[param2.field_t] / bp.field_h;
            while (true) {
              var8 = (1048575 + var7_int - param2.field_y) / var7_int;
              if (param4 < var8) {
                param2.field_y = param2.field_y + param4 * var7_int;
                break;
              }
              param2.field_o.a(param5, param0, var8);
              param4 = param4 - var8;
              param2.field_y = param2.field_y + (-1048576 + var8 * var7_int);
              param0 = param0 + var8;
              var9 = bp.field_h / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param2.field_o;
              if (this.field_w.field_U[param2.field_t] != 0) {
                param2.field_o = nb.b(param2.field_C, var11.m(), 0, var11.f());
                stackIn_14_0 = this.field_w;
                stackIn_14_1 = -125;
                stackIn_14_2 = (pr) (param2);
                stackIn_15_3 = !(param2.field_u.field_s[param2.field_A] >= 0);
                ((vk) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_15_3);
                param2.field_o.c(var9, var11.j());
              } else {
                param2.field_o = nb.b(param2.field_C, var11.m(), var11.j(), var11.f());
              }
              if (param2.field_u.field_s[param2.field_A] < 0) {
                param2.field_o.e(-1);
              }
              var11.c(var9);
              var11.a(param5, param0, param1 - param0);
              if (!var11.g()) {
                continue;
              }
              this.field_p.b(var11);
            }
          }
          if (param3 != 1048575) {
            ib.c(-60);
          }
          param2.field_o.a(param5, param0, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final int d() {
        return 0;
    }

    final kd a() {
        pr var1 = (pr) (this.field_t.c((byte) 76));
        if (var1 == null) {
          return null;
        }
        if (null == var1.field_o) {
          return this.b();
        }
        return (kd) ((Object) var1.field_o);
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pr var6 = null;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          this.field_p.a(param0, param1, param2);
          var6 = (pr) (this.field_t.c((byte) -67));
          while (var6 != null) {
            if (!this.field_w.a(-16257, var6)) {
              var5 = param2;
              var4_int = param1;
              do {
                if (var6.field_D >= var5) {
                  this.a(var4_int, var4_int + var5, var6, 1048575, var5, param0);
                  var6.field_D = var6.field_D - var5;
                  break;
                }
                this.a(var4_int, var4_int + var5, var6, 1048575, var6.field_D, param0);
                var5 = var5 - var6.field_D;
                var4_int = var4_int + var6.field_D;
              } while (!this.field_w.a(var5, param0, var4_int, 1, var6));
            }
            var6 = (pr) (this.field_t.f((byte) -5));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ib.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 != -1) {
          field_q = (String[]) null;
          field_u = null;
          field_q = null;
          return;
        }
        field_u = null;
        field_q = null;
    }

    final static int[] a(double[] param0, int param1) {
        RuntimeException var2 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -30100) {
            ib.d(-75);
          }
          stackIn_3_0 = tq.a(3, -20607, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ib.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2;
        pr var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = Pool.field_O;
        this.field_p.a(param0);
        var3 = (pr) (this.field_t.c((byte) -20));
        while (var3 != null) {
          stackIn_4_0 = this.field_w.a(-16257, var3);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = param0;
            while (var2 > var3.field_D) {
              this.a(var3.field_D, var3, 1048575);
              var2 = var2 - var3.field_D;
              if (this.field_w.a(var2, (int[]) null, 0, 1, var3)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(var2, var3, 1048575);
              var3.field_D = var3.field_D - var2;
            }
          }
          var3 = (pr) (this.field_t.f((byte) -5));
        }
    }

    ib(vk param0) {
        this.field_t = new ko();
        this.field_p = new ai();
        try {
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ib.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
