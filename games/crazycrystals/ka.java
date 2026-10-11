/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends od {
    static boolean field_j;
    static int field_n;
    static db field_m;
    wb field_k;
    private wg field_o;
    tj field_l;

    final od a() {
        pl var1;
        int var2;
        var2 = CrazyCrystals.field_B;
        while (true) {
          var1 = (pl) (this.field_k.a(false));
          if (var1 == null) {
            return null;
          }
          if (null != var1.field_v) {
            return (od) ((Object) var1.field_v);
          }
        }
    }

    private final void a(pl param0, int param1, byte param2) {
        wg stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pl stackIn_8_2 = null;
        boolean stackIn_9_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param2 >= -79) {
            return;
          }
          if ((this.field_o.field_E[param0.field_i] & 4) != 0 &&
            param0.field_l < 0) {
            var4_int = this.field_o.field_G[param0.field_i] / id.field_m;
            var5 = (var4_int + 1048575 - param0.field_j) / var4_int;
            param0.field_j = var4_int * param1 + param0.field_j & 1048575;
            if (var5 <= param1) {
              if (this.field_o.field_v[param0.field_i] == 0) {
                param0.field_v = kg.b(param0.field_t, param0.field_v.f(), param0.field_v.j(), param0.field_v.k());
              } else {
                param0.field_v = kg.b(param0.field_t, param0.field_v.f(), 0, param0.field_v.k());
                stackIn_8_0 = this.field_o;
                stackIn_8_1 = 2;
                stackIn_8_2 = (pl) (param0);
                stackIn_9_3 = !(param0.field_A.field_n[param0.field_y] >= 0);
                ((wg) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2, stackIn_9_3);
              }
              if (0 > param0.field_A.field_n[param0.field_y]) {
                param0.field_v.f(-1);
              }
              param1 = param0.field_j / var4_int;
            }
          }
          param0.field_v.a(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ka.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int c() {
        return 0;
    }

    final od d() {
        pl var1 = (pl) (this.field_k.g(32073));
        if (var1 == null) {
          return null;
        }
        if (var1.field_v == null) {
          return this.a();
        }
        return (od) ((Object) var1.field_v);
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pl var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          this.field_l.a(param0, param1, param2);
          var6 = (pl) (this.field_k.g(32073));
          L0: while (true) {
            if (var6 == null) {
              return;
            }
            if (this.field_o.a(var6, (byte) 100)) {
              var6 = (pl) (this.field_k.a(false));
              continue;
            }
            var4_int = param1;
            var5 = param2;
            do {
              if (var5 <= var6.field_k) {
                this.a(param0, var6, var4_int, -1048576, var5, var5 + var4_int);
                var6.field_k = var6.field_k - var5;
                var6 = (pl) (this.field_k.a(false));
                continue L0;
              }
              this.a(param0, var6, var4_int, -1048576, var6.field_k, var5 + var4_int);
              var5 = var5 - var6.field_k;
              var4_int = var4_int + var6.field_k;
            } while (!this.field_o.a(var5, var4_int, param0, var6, (byte) 98));
            var6 = (pl) (this.field_k.a(false));
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ka.N(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = -91 % ((47 - param0) / 56);
        field_m = null;
    }

    private final void a(int[] param0, pl param1, int param2, int param3, int param4, int param5) {
        wg stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pl stackIn_14_2 = null;
        boolean stackIn_15_3;
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
        kg var11 = null;
        int var12 = 0;
        var12 = CrazyCrystals.field_B;
        try {
          if (param3 != -1048576) {
            this.a();
          }
          if (0 != (4 & this.field_o.field_E[param1.field_i]) &&
            param1.field_l < 0) {
            var7_int = this.field_o.field_G[param1.field_i] / id.field_m;
            while (true) {
              var8 = (-param1.field_j + var7_int + 1048575) / var7_int;
              if (var8 > param4) {
                param1.field_j = param1.field_j + var7_int * param4;
                break;
              }
              param1.field_v.a(param0, param2, var8);
              param4 = param4 - var8;
              param2 = param2 + var8;
              param1.field_j = param1.field_j + (-1048576 + var7_int * var8);
              var9 = id.field_m / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param1.field_v;
              if (this.field_o.field_v[param1.field_i] != 0) {
                param1.field_v = kg.b(param1.field_t, var11.f(), 0, var11.k());
                stackIn_14_0 = this.field_o;
                stackIn_14_1 = 2;
                stackIn_14_2 = (pl) (param1);
                stackIn_15_3 = !(param1.field_A.field_n[param1.field_y] >= 0);
                ((wg) (Object) stackIn_14_0).a((byte) stackIn_14_1, stackIn_14_2, stackIn_15_3);
                param1.field_v.b(var9, var11.j());
              } else {
                param1.field_v = kg.b(param1.field_t, var11.f(), var11.j(), var11.k());
              }
              if (param1.field_A.field_n[param1.field_y] < 0) {
                param1.field_v.f(-1);
              }
              var11.d(var9);
              var11.a(param0, param2, param5 - param2);
              if (!var11.e()) {
                continue;
              }
              this.field_l.b(var11);
            }
          }
          param1.field_v.a(param0, param2, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("ka.C(");
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
          throw dn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0) {
        pl var3;
        int var4;
        int var2;
        var4 = CrazyCrystals.field_B;
        this.field_l.a(param0);
        var3 = (pl) (this.field_k.g(32073));
        L0: while (true) {
          if (var3 == null) {
            return;
          }
          if (this.field_o.a(var3, (byte) 113)) {
            var3 = (pl) (this.field_k.a(false));
            continue;
          }
          var2 = param0;
          do {
            if (var3.field_k >= var2) {
              this.a(var3, var2, (byte) -101);
              var3.field_k = var3.field_k - var2;
              var3 = (pl) (this.field_k.a(false));
              continue L0;
            }
            this.a(var3, var3.field_k, (byte) -116);
            var2 = var2 - var3.field_k;
          } while (!this.field_o.a(var2, 0, (int[]) null, var3, (byte) 94));
          var3 = (pl) (this.field_k.a(false));
        }
    }

    ka(wg param0) {
        this.field_k = new wb();
        this.field_l = new tj();
        try {
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = 128;
    }
}
