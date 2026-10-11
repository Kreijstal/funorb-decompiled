/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends jc {
    static int field_N;
    static int field_M;
    static int[] field_O;
    static int field_K;
    static String field_J;
    static String field_L;

    private se(int param0, int param1, int param2, int param3, ad param4, rm param5, fe param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_I = param6;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "se.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(int param0) {
        if (param0 == -13673) {
          field_J = null;
          field_O = null;
          field_L = null;
          return;
        }
        se.n(28);
        field_J = null;
        field_O = null;
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        ma var7 = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5 + param5);
          var7 = j.field_d;
          if (var7 != null) {
            if (!this.b(param1, param0, param3, param2, -88)) {
              return;
            }
            if (this.field_y instanceof cd) {
              ((cd) (this.field_y)).a(27055, this, var7);
              j.field_d = null;
              return;
            }
            if (var7.field_y instanceof cd) {
              ((cd) (var7.field_y)).a(param5 + 27055, this, var7);
              j.field_d = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "se.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = MinerDisturbance.field_ab;
        try {
          var5_int = param0 + param3;
          var6 = param4 + param2;
          if (param1 != 2) {
            field_M = 88;
          }
          if (param0 > eh.field_a) {
            stackIn_6_0 = param0;
          } else {
            stackIn_6_0 = eh.field_a;
          }
          var7 = stackIn_6_0;
          if (eh.field_d >= param2) {
            stackIn_9_0 = eh.field_d;
          } else {
            stackIn_9_0 = param2;
          }
          var8 = stackIn_9_0;
          if (var5_int >= eh.field_k) {
            stackIn_12_0 = eh.field_k;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (eh.field_e > var6) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = eh.field_e;
          }
          var10 = stackIn_15_0;
          if (eh.field_a <= param0 &&
            eh.field_k > param0) {
            var11 = param0 + eh.field_g * var8;
            var12 = var10 + (1 - var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              eh.field_f[var11] = 16777215;
              var11 = var11 + eh.field_g * 2;
            }
          }
          if (eh.field_d <= param2 &&
            eh.field_e > var6) {
            var11Lifetime1 = eh.field_g * param2 + var7;
            var12Lifetime1 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              eh.field_f[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= eh.field_a &&
            eh.field_k > var5_int) {
            var11Lifetime2 = var5_int + (var8 + (1 & var5_int - param0)) * eh.field_g;
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              eh.field_f[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * eh.field_g;
            }
          }
          if (eh.field_d <= param2 &&
            eh.field_e > var6) {
            var11Lifetime3 = var6 * eh.field_g + var7 + (1 & var6 - param2);
            var12Lifetime3 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                return;
              }
              eh.field_f[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var5), "se.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_M = 50;
        field_K = -1;
        field_J = "Ranking: Puddle Splasher";
        field_L = "Sell<br>Basic Kit";
    }
}
