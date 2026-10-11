/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends di {
    static String field_l;
    im field_k;
    static String[] field_n;
    private lj field_j;
    v field_m;

    final di a() {
        he var1 = (he) (this.field_k.b((byte) -75));
        if (var1 == null) {
          return null;
        }
        if (var1.field_l != null) {
          return (di) ((Object) var1.field_l);
        }
        return this.d();
    }

    private final void a(int param0, he param1, int param2) {
        lj stackIn_9_0 = null;
        he stackIn_9_1 = null;
        boolean stackIn_10_2 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.field_j.field_o[param1.field_F] & 4) != 0 &&
            0 > param1.field_n) {
            var4_int = this.field_j.field_L[param1.field_F] / la.field_c;
            var5 = (var4_int + (1048575 - param1.field_i)) / var4_int;
            param1.field_i = 1048575 & param0 * var4_int + param1.field_i;
            if (var5 <= param0) {
              if (this.field_j.field_D[param1.field_F] != 0) {
                param1.field_l = bb.a(param1.field_D, param1.field_l.g(), 0, param1.field_l.l());
                stackIn_9_0 = this.field_j;
                stackIn_9_1 = (he) (param1);
                stackIn_10_2 = !(param1.field_g.field_m[param1.field_h] >= 0);
                ((lj) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_10_2, param2 + 33816);
              } else {
                param1.field_l = bb.a(param1.field_D, param1.field_l.g(), param1.field_l.j(), param1.field_l.l());
              }
              if (param1.field_g.field_m[param1.field_h] < 0) {
                param1.field_l.d(-1);
              }
              param0 = param1.field_i / var4_int;
            }
          }
          if (param2 != -23887) {
            this.d();
          }
          param1.field_l.c(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("jg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final di d() {
        he var1;
        while (true) {
          var1 = (he) (this.field_k.d(853));
          if (var1 == null) {
            return null;
          }
          if (var1.field_l != null) {
            return (di) ((Object) var1.field_l);
          }
        }
    }

    private final void a(int[] param0, int param1, int param2, boolean param3, he param4, int param5) {
        lj stackIn_13_0 = null;
        he stackIn_13_1 = null;
        boolean stackIn_14_2 = false;
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
        bb var11 = null;
        int var12 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          if (!param3) {
            this.field_j = (lj) null;
          }
          if ((4 & this.field_j.field_o[param4.field_F]) != 0 &&
            param4.field_n < 0) {
            var7_int = this.field_j.field_L[param4.field_F] / la.field_c;
            while (true) {
              var8 = (-param4.field_i + (1048575 + var7_int)) / var7_int;
              if (var8 > param5) {
                param4.field_i = param4.field_i + var7_int * param5;
                break;
              }
              param4.field_l.b(param0, param2, var8);
              param4.field_i = param4.field_i + (-1048576 + var8 * var7_int);
              param2 = param2 + var8;
              param5 = param5 - var8;
              var9 = la.field_c / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param4.field_l;
              if (0 == this.field_j.field_D[param4.field_F]) {
                param4.field_l = bb.a(param4.field_D, var11.g(), var11.j(), var11.l());
              } else {
                param4.field_l = bb.a(param4.field_D, var11.g(), 0, var11.l());
                stackIn_13_0 = this.field_j;
                stackIn_13_1 = (he) (param4);
                stackIn_14_2 = !(param4.field_g.field_m[param4.field_h] >= 0);
                ((lj) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_14_2, 9929);
                param4.field_l.d(var9, var11.j());
              }
              if (param4.field_g.field_m[param4.field_h] < 0) {
                param4.field_l.d(-1);
              }
              var11.f(var9);
              var11.b(param0, param2, param1 - param2);
              if (!var11.e()) {
                continue;
              }
              this.field_m.a(var11);
            }
          }
          param4.field_l.b(param0, param2, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("jg.I(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param5).append(')').toString());
        }
    }

    final int c() {
        return 0;
    }

    final void c(int param0) {
        int var2;
        he var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = OrbDefence.field_D ? 1 : 0;
        this.field_m.c(param0);
        var3 = (he) (this.field_k.b((byte) 117));
        while (var3 != null) {
          stackIn_4_0 = this.field_j.a(var3, (byte) 90);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = param0;
            while (var3.field_w < var2) {
              this.a(var3.field_w, var3, -23887);
              var2 = var2 - var3.field_w;
              if (this.field_j.a(4160, var3, 0, var2, (int[]) null)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(var2, var3, -23887);
              var3.field_w = var3.field_w - var2;
            }
          }
          var3 = (he) (this.field_k.d(853));
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        he var6 = null;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          this.field_m.b(param0, param1, param2);
          var6 = (he) (this.field_k.b((byte) -96));
          while (var6 != null) {
            if (!this.field_j.a(var6, (byte) 98)) {
              var4_int = param1;
              var5 = param2;
              do {
                if (var6.field_w >= var5) {
                  this.a(param0, var4_int + var5, var4_int, true, var6, var5);
                  var6.field_w = var6.field_w - var5;
                  break;
                }
                this.a(param0, var4_int + var5, var4_int, true, var6, var6.field_w);
                var5 = var5 - var6.field_w;
                var4_int = var4_int + var6.field_w;
              } while (!this.field_j.a(4160, var6, var4_int, var5, param0));
            }
            var6 = (he) (this.field_k.d(853));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("jg.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 < 34) {
          jg.d(-51);
          field_n = null;
          return;
        }
        field_n = null;
    }

    jg(lj param0) {
        this.field_k = new im();
        this.field_m = new v();
        try {
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "FAST BLAST";
    }
}
