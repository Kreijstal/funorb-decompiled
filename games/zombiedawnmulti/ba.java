/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends gq {
    private gd field_n;
    static String field_j;
    th field_k;
    static String field_p;
    static int field_q;
    static String field_l;
    static int field_m;
    vp field_o;

    final void b(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        mb var6 = null;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_o.b(param0, param1, param2);
          var6 = (mb) (this.field_k.c(76));
          while (var6 != null) {
            stackIn_4_0 = this.field_n.a(-1, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var4_int = param1;
              var5 = param2;
              while (var5 > var6.field_D) {
                this.a(var4_int, 14531, var6.field_D, var6, param0, var5 + var4_int);
                var5 = var5 - var6.field_D;
                var4_int = var4_int + var6.field_D;
                if (this.field_n.a(var6, var5, var4_int, param0, -115)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var4_int, 14531, var5, var6, param0, var4_int + var5);
                var6.field_D = var6.field_D - var5;
              }
            }
            var6 = (mb) (this.field_k.b(6));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ba.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, mb param3, int[] param4, int param5) {
        gd stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uj var11 = null;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != 14531) {
            return;
          }
          if ((4 & this.field_n.field_H[param3.field_o]) != 0 &&
            param3.field_l < 0) {
            var7_int = this.field_n.field_n[param3.field_o] / gp.field_p;
            while (true) {
              var8 = (var7_int + 1048575 - param3.field_w) / var7_int;
              if (param2 < var8) {
                param3.field_w = param3.field_w + var7_int * param2;
                break;
              }
              param3.field_C.b(param4, param0, var8);
              param3.field_w = param3.field_w + (-1048576 + var7_int * var8);
              param0 = param0 + var8;
              param2 = param2 - var8;
              var9 = gp.field_p / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param3.field_C;
              if (this.field_n.field_y[param3.field_o] == 0) {
                param3.field_C = uj.a(param3.field_f, var11.l(), var11.h(), var11.g());
              } else {
                param3.field_C = uj.a(param3.field_f, var11.l(), 0, var11.g());
                stackIn_13_0 = this.field_n;
                stackIn_14_1 = !(param3.field_x.field_g[param3.field_p] >= 0);
                ((gd) (Object) stackIn_13_0).a(stackIn_14_1, (byte) -76, param3);
                param3.field_C.a(var9, var11.h());
              }
              if (param3.field_x.field_g[param3.field_p] < 0) {
                param3.field_C.g(-1);
              }
              var11.e(var9);
              var11.b(param4, param0, param5 - param0);
              if (!var11.j()) {
                continue;
              }
              this.field_o.b(var11);
            }
          }
          param3.field_C.b(param4, param0, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("ba.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param5).append(')').toString());
        }
    }

    final gq b() {
        mb var1 = (mb) (this.field_k.c(76));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_C) {
          return (gq) ((Object) var1.field_C);
        }
        return this.d();
    }

    private final void a(mb param0, int param1, boolean param2) {
        gd stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((4 & this.field_n.field_H[param0.field_o]) != 0 &&
            param0.field_l < 0) {
            var4_int = this.field_n.field_n[param0.field_o] / gp.field_p;
            var5 = (-param0.field_w + (1048575 + var4_int)) / var4_int;
            param0.field_w = param0.field_w + var4_int * param1 & 1048575;
            if (param1 >= var5) {
              if (0 != this.field_n.field_y[param0.field_o]) {
                param0.field_C = uj.a(param0.field_f, param0.field_C.l(), 0, param0.field_C.g());
                stackIn_7_0 = this.field_n;
                stackIn_8_1 = !(0 <= param0.field_x.field_g[param0.field_p]);
                ((gd) (Object) stackIn_7_0).a(stackIn_8_1, (byte) -80, param0);
              } else {
                param0.field_C = uj.a(param0.field_f, param0.field_C.l(), param0.field_C.h(), param0.field_C.g());
              }
              if (param0.field_x.field_g[param0.field_p] < 0) {
                param0.field_C.g(-1);
              }
              param1 = param0.field_w / var4_int;
            }
          }
          param0.field_C.a(param1);
          if (!param2) {
            return;
          }
          field_m = -56;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ba.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_p = null;
        if (param0 != 16652) {
          ba.c(-110);
          field_l = null;
          return;
        }
        field_l = null;
    }

    final void a(int param0) {
        int var2;
        mb var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_o.a(param0);
        var3 = (mb) (this.field_k.c(91));
        while (var3 != null) {
          if (!this.field_n.a(-1, var3)) {
            var2 = param0;
            do {
              if (var3.field_D >= var2) {
                this.a(var3, var2, false);
                var3.field_D = var3.field_D - var2;
                break;
              }
              this.a(var3, var3.field_D, false);
              var2 = var2 - var3.field_D;
            } while (!this.field_n.a(var3, var2, 0, (int[]) null, 22));
          }
          var3 = (mb) (this.field_k.b(6));
        }
    }

    final int a() {
        return 0;
    }

    final gq d() {
        mb var1;
        while (true) {
          var1 = (mb) (this.field_k.b(6));
          if (var1 == null) {
            return null;
          }
          if (var1.field_C != null) {
            return (gq) ((Object) var1.field_C);
          }
        }
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = um.field_c;
        synchronized (var1_ref) {
          if (lp.field_j == kj.field_j) {
            return false;
          }
          sj.field_p = td.field_a[lp.field_j];
          pn.field_d = ta.field_pb[lp.field_j];
          if (param0 != -1) {
            field_m = -21;
          }
          lp.field_j = lp.field_j + 1 & 127;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    ba(gd param0) {
        this.field_k = new th();
        this.field_o = new vp();
        try {
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = 2;
        field_l = "If you do nothing the game will revert to normal view in <%0> second.";
        field_j = "Name is available";
        field_p = "Unfortunately you are not eligible to create an account.";
    }
}
