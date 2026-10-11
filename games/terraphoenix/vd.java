/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends lj {
    static String field_p;
    static String field_o;
    private wl field_q;
    static jj field_l;
    jj field_n;
    vg field_m;

    final lj c() {
        sh var1 = (sh) (this.field_n.d(9272));
        if (var1 == null) {
          return null;
        }
        if (var1.field_k == null) {
          return this.a();
        }
        return (lj) ((Object) var1.field_k);
    }

    final static int b(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        if (param1 == 17603) {
          param0 = param0 | param0 >>> 4;
          param0 = param0 | param0 >>> 8;
          param0 = param0 | param0 >>> 16;
          return param0 + 1;
        }
        return 26;
    }

    public static void c(byte param0) {
        field_o = null;
        field_p = null;
        field_l = null;
        if (param0 == 41) {
          return;
        }
        field_p = (String) null;
    }

    final lj a() {
        sh var1;
        while (true) {
          var1 = (sh) (this.field_n.e((byte) -119));
          if (var1 == null) {
            return null;
          }
          if (var1.field_k != null) {
            return (lj) ((Object) var1.field_k);
          }
        }
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
        sh var6 = null;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        try {
          this.field_m.a(param0, param1, param2);
          var6 = (sh) (this.field_n.d(9272));
          while (var6 != null) {
            stackIn_4_0 = this.field_q.a(var6, 16384);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var4_int = param1;
              var5 = param2;
              while (var6.field_y < var5) {
                this.a(var6, param0, var4_int + var5, var6.field_y, var4_int, (byte) 3);
                var4_int = var4_int + var6.field_y;
                var5 = var5 - var6.field_y;
                if (this.field_q.a((byte) 101, param0, var5, var6, var4_int)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var6, param0, var5 + var4_int, var5, var4_int, (byte) 13);
                var6.field_y = var6.field_y - var5;
              }
            }
            var6 = (sh) (this.field_n.e((byte) -119));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("vd.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2;
        sh var3;
        int var4;
        var4 = Terraphoenix.field_V;
        this.field_m.a(param0);
        var3 = (sh) (this.field_n.d(9272));
        while (var3 != null) {
          if (!this.field_q.a(var3, 16384)) {
            var2 = param0;
            do {
              if (var2 <= var3.field_y) {
                this.a(var2, 10756, var3);
                var3.field_y = var3.field_y - var2;
                break;
              }
              this.a(var3.field_y, 10756, var3);
              var2 = var2 - var3.field_y;
            } while (!this.field_q.a((byte) 77, (int[]) null, var2, var3, 0));
          }
          var3 = (sh) (this.field_n.e((byte) -119));
        }
    }

    final int d() {
        return 0;
    }

    private final void a(sh param0, int[] param1, int param2, int param3, int param4, byte param5) {
        wl stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
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
        lh var11 = null;
        int var12 = 0;
        int var7_intLifetime1;
        var12 = Terraphoenix.field_V;
        try {
          if ((this.field_q.field_q[param0.field_v] & 4) != 0 &&
            param0.field_h < 0) {
            var7_int = this.field_q.field_D[param0.field_v] / nk.field_u;
            while (true) {
              var8 = (1048575 + var7_int - param0.field_A) / var7_int;
              if (var8 > param3) {
                param0.field_A = param0.field_A + param3 * var7_int;
                break;
              }
              param0.field_k.a(param1, param4, var8);
              param3 = param3 - var8;
              param0.field_A = param0.field_A + (var7_int * var8 - 1048576);
              param4 = param4 + var8;
              var9 = nk.field_u / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param0.field_k;
              if (this.field_q.field_S[param0.field_v] != 0) {
                param0.field_k = lh.a(param0.field_F, var11.l(), 0, var11.g());
                stackIn_13_0 = this.field_q;
                stackIn_14_1 = !(param0.field_B.field_p[param0.field_w] >= 0);
                ((wl) (Object) stackIn_13_0).a(stackIn_14_1, param0, 109);
                param0.field_k.e(var9, var11.h());
              } else {
                param0.field_k = lh.a(param0.field_F, var11.l(), var11.h(), var11.g());
              }
              if (0 > param0.field_B.field_p[param0.field_w]) {
                param0.field_k.g(-1);
              }
              var11.c(var9);
              var11.a(param1, param4, param2 - param4);
              if (!var11.k()) {
                continue;
              }
              this.field_m.a(var11);
            }
          }
          var7_intLifetime1 = -8 % ((-49 - param5) / 44);
          param0.field_k.a(param1, param4, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("vd.I(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, sh param2) {
        wl stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param1 != 10756) {
            this.field_q = (wl) null;
          }
          if ((4 & this.field_q.field_q[param2.field_v]) != 0) {
            if (param2.field_h >= 0) {
              param2.field_k.a(param0);
              return;
            }
            var4_int = this.field_q.field_D[param2.field_v] / nk.field_u;
            var5 = (1048575 + (var4_int - param2.field_A)) / var4_int;
            param2.field_A = 1048575 & var4_int * param0 + param2.field_A;
            if (var5 <= param0) {
              if (this.field_q.field_S[param2.field_v] == 0) {
                param2.field_k = lh.a(param2.field_F, param2.field_k.l(), param2.field_k.h(), param2.field_k.g());
              } else {
                param2.field_k = lh.a(param2.field_F, param2.field_k.l(), 0, param2.field_k.g());
                stackIn_9_0 = this.field_q;
                stackIn_10_1 = !(param2.field_B.field_p[param2.field_w] >= 0);
                ((wl) (Object) stackIn_9_0).a(stackIn_10_1, param2, 100);
              }
              if (param2.field_B.field_p[param2.field_w] < 0) {
                param2.field_k.g(-1);
              }
              param0 = param2.field_A / var4_int;
            }
          }
          param2.field_k.a(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("vd.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    vd(wl param0) {
        this.field_n = new jj();
        this.field_m = new vg();
        try {
          this.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "vd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Email is valid";
        field_o = "Please wait...";
        field_l = new jj();
    }
}
