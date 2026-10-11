/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends sk {
    static long field_y;
    byte[] field_u;
    int field_w;
    static int[] field_t;
    static od[] field_s;
    static String field_v;
    bi field_x;

    final static boolean a(byte param0, dl param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -124) {
            stackIn_4_0 = param1.b((byte) -117);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("md.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final byte[] f(int param0) {
        if (this.field_m) {
          throw new RuntimeException();
        }
        if (param0 != 0) {
          field_v = (String) null;
        }
        return this.field_u;
    }

    public static void i(int param0) {
        field_s = null;
        field_v = null;
        int var1 = 60 / ((-82 - param0) / 32);
        field_t = null;
    }

    final static o[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        o[] var10;
        o[] var11_ref_o__;
        int var11;
        int var12;
        o var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = SolKnight.field_L ? 1 : 0;
        var9 = param4 + (param6 + param8);
        var10 = new o[]{new o(var9, var9), new o(param7, var9), new o(var9, var9), new o(var9, param7), new o(64, 64), new o(var9, param7), new o(var9, var9), new o(param7, var9), new o(var9, var9)};
        var11_ref_o__ = var10;
        for (var12 = 0; var11_ref_o__.length > var12; var12++) {
          var13 = var11_ref_o__[var12];
          for (var14 = 0; var13.field_v.length > var14; var14++) {
            var13.field_v[var14] = param3;
          }
        }
        var11 = 0;
        if (param5 != -1) {
          return (o[]) null;
        }
        while (var11 < param8) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_v[var12Lifetime1 + var9 * (-1 + (-var11 + var9))] = param2;
            var10[8].field_v[var12Lifetime1 + (-var11 + (var9 - 1)) * var9] = param2;
            var10[2].field_v[var9 * var12Lifetime1 - var11 - (1 - var9)] = param2;
            var10[8].field_v[var9 * var12Lifetime1 - (var11 + 1) + var9] = param2;
          }
          var11++;
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param8; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_v[var11Lifetime1 * var9 + var12Lifetime2] = param1;
            var10[0].field_v[var9 * var12Lifetime2 + var11Lifetime1] = param1;
            if ((var9 - var11Lifetime1) > var12Lifetime2) {
              var10[2].field_v[var9 * var11Lifetime1 + var12Lifetime2] = param1;
              var10[6].field_v[var9 * var12Lifetime2 + var11Lifetime1] = param1;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param7; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param8; var12Lifetime3++) {
            var10[7].field_v[(-1 + (-var12Lifetime3 + var9)) * param7 + var11Lifetime2] = param2;
            var10[5].field_v[-var12Lifetime3 + var9 + (-1 + var9 * var11Lifetime2)] = param2;
            var10[1].field_v[var12Lifetime3 * param7 + var11Lifetime2] = param1;
            var10[3].field_v[var12Lifetime3 + var9 * var11Lifetime2] = param1;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param7 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param4; var12Lifetime4++) {
            var10[1].field_v[(-1 + (var9 - var12Lifetime4)) * param7 + var11Lifetime3] = param0;
            var10[3].field_v[var9 * var11Lifetime3 - 1 - (-var9 + var12Lifetime4)] = param0;
            var10[7].field_v[var11Lifetime3 + var12Lifetime4 * param7] = param0;
            var10[5].field_v[var12Lifetime4 + var11Lifetime3 * var9] = param0;
          }
        }
        return var10;
    }

    final int a(byte param0) {
        if (this.field_m) {
          return 0;
        }
        if (param0 != -126) {
          this.a((byte) 102);
        }
        return 100;
    }

    md() {
    }

    static {
        field_t = new int[128];
    }
}
