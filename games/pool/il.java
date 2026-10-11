/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static ge field_b;
    static String field_d;
    static String field_h;
    static dd field_a;
    static jg[] field_c;
    static String field_e;
    static vh[] field_g;
    static dd field_f;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_h = null;
        field_f = null;
        int var1 = -94 % ((param0 - 54) / 32);
        field_g = null;
        field_e = null;
        field_b = null;
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        dd[] var10;
        dd[] var11_ref_dd__;
        int var11;
        int var12;
        dd var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        dd[] var10Lifetime1;
        var15 = Pool.field_O;
        var9 = param1 + param0 + param5;
        var10 = new dd[]{new dd(var9, var9), new dd(param3, var9), new dd(var9, var9), new dd(var9, param3), new dd(64, 64), new dd(var9, param3), new dd(var9, var9), new dd(param3, var9), new dd(var9, var9)};
        var11_ref_dd__ = var10;
        for (var12 = 0; var11_ref_dd__.length > var12; var12++) {
          var13 = var11_ref_dd__[var12];
          for (var14 = 0; var13.field_D.length > var14; var14++) {
            var13.field_D[var14] = param6;
          }
        }
        var10Lifetime1 = var11_ref_dd__;
        for (var11 = 0; var11 < param5; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10Lifetime1[6].field_D[(-1 + var9 - var11) * var9 + var12Lifetime1] = param8;
            var10Lifetime1[8].field_D[var9 * (-1 - var11 + var9) + var12Lifetime1] = param8;
            var10Lifetime1[2].field_D[-1 + var9 + (-var11 + var12Lifetime1 * var9)] = param8;
            var10Lifetime1[8].field_D[var9 * var12Lifetime1 - var11 - (-var9 + 1)] = param8;
          }
        }
        var11Lifetime1 = 0;
        if (param4 != 4) {
          field_f = (dd) null;
        }
        while (var11Lifetime1 < param5) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10Lifetime1[0].field_D[var9 * var11Lifetime1 + var12Lifetime2] = param2;
            var10Lifetime1[0].field_D[var12Lifetime2 * var9 + var11Lifetime1] = param2;
            if (var12Lifetime2 < var9 - var11Lifetime1) {
              var10Lifetime1[2].field_D[var9 * var11Lifetime1 + var12Lifetime2] = param2;
              var10Lifetime1[6].field_D[var12Lifetime2 * var9 + var11Lifetime1] = param2;
            }
          }
          var11Lifetime1++;
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param3; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param5 > var12Lifetime3; var12Lifetime3++) {
            var10Lifetime1[7].field_D[var11Lifetime2 + (-1 + (-var12Lifetime3 + var9)) * param3] = param8;
            var10Lifetime1[5].field_D[var9 * var11Lifetime2 + var9 - 1 - var12Lifetime3] = param8;
            var10Lifetime1[1].field_D[param3 * var12Lifetime3 + var11Lifetime2] = param2;
            var10Lifetime1[3].field_D[var9 * var11Lifetime2 + var12Lifetime3] = param2;
          }
        }
        for (var11Lifetime3 = 0; param3 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param1 > var12Lifetime4; var12Lifetime4++) {
            var10Lifetime1[1].field_D[var11Lifetime3 + (var9 - (var12Lifetime4 + 1)) * param3] = param7;
            var10Lifetime1[3].field_D[var11Lifetime3 * var9 - 1 - (-var9 + var12Lifetime4)] = param7;
            var10Lifetime1[7].field_D[var11Lifetime3 + var12Lifetime4 * param3] = param7;
            var10Lifetime1[5].field_D[var9 * var11Lifetime3 + var12Lifetime4] = param7;
          }
        }
        return var10Lifetime1;
    }

    final static int[] a(byte param0, int[] param1) {
        int[] stackIn_7_0 = null;
        int[] stackIn_15_0 = null;
        int[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = Pool.field_O;
        try {
          if (param0 < 72) {
            il.a(-2);
          }
          if (param1 != null &&
            param1.length != 0) {
            if (param1.length >= 12) {
              stackIn_17_0 = (int[]) (param1);
              return stackIn_17_0;
            }
            var5 = new int[12];
            var2 = var5;
            for (var3 = 0; param1.length > var3; var3++) {
              var5[var3] = param1[var3];
            }
            while (ln.field_m.length > var3) {
              var2[var3] = ln.field_m[var3];
              var3++;
            }
            stackIn_15_0 = var2;
            return stackIn_15_0;
          }
          stackIn_7_0 = new int[]{ln.field_m[0], ln.field_m[1], ln.field_m[2], ln.field_m[3], ln.field_m[4], ln.field_m[5], ln.field_m[6], ln.field_m[7], ln.field_m[8], ln.field_m[9], ln.field_m[10], ln.field_m[11]};
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("il.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_c = new jg[4];
        field_h = "You have won!";
        field_e = "OFF";
        field_d = "Breaking real-world laws";
    }
}
