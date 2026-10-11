/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static int field_c;
    static ag field_a;
    static int field_d;
    static boolean field_b;

    public static void a(int param0) {
        if (param0 != 5565) {
          Object var2 = (Object) null;
          sc.a(true, true, (Object) null);
        }
        field_a = null;
    }

    final static byte[] a(boolean param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ni var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (!param1) {
            field_b = true;
          }
          if (!(param2 instanceof byte[])) {
            if (!(param2 instanceof ni)) {
              throw new IllegalArgumentException();
            }
            var4 = (ni) (param2);
            stackIn_15_0 = var4.a(3006);
            return stackIn_15_0;
          }
          var3 = (byte[]) (param2);
          if (!param0) {
            stackIn_11_0 = var3;
            return stackIn_11_0;
          }
          stackIn_9_0 = kh.a(var3, (byte) -16);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("sc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static ea[] a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        ea[] var10;
        ea[] var11_ref_ea__;
        int var11;
        int var12;
        ea var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = MinerDisturbance.field_ab;
        var9 = param2 + param8 + param5;
        var10 = new ea[]{new ea(var9, var9), new ea(param0, var9), new ea(var9, var9), new ea(var9, param0), new ea(64, 64), new ea(var9, param0), new ea(var9, var9), new ea(param0, var9), new ea(var9, var9)};
        var11_ref_ea__ = var10;
        for (var12 = 0; var12 < var11_ref_ea__.length; var12++) {
          var13 = var11_ref_ea__[var12];
          for (var14 = 0; var13.field_D.length > var14; var14++) {
            var13.field_D[var14] = param1;
          }
        }
        if (param6 != -81) {
          return (ea[]) null;
        }
        for (var11 = 0; param8 > var11; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_D[var12Lifetime1 + var9 * (-1 + (-var11 + var9))] = param7;
            var10[8].field_D[var9 * (-1 - var11 + var9) + var12Lifetime1] = param7;
            var10[2].field_D[var9 * var12Lifetime1 - 1 - (-var9 + var11)] = param7;
            var10[8].field_D[var9 - 1 + (-var11 + var12Lifetime1 * var9)] = param7;
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param8; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10[0].field_D[var12Lifetime2 + var11Lifetime1 * var9] = param4;
            var10[0].field_D[var11Lifetime1 + var12Lifetime2 * var9] = param4;
            if (var12Lifetime2 < var9 - var11Lifetime1) {
              var10[2].field_D[var11Lifetime1 * var9 + var12Lifetime2] = param4;
              var10[6].field_D[var11Lifetime1 + var9 * var12Lifetime2] = param4;
            }
          }
        }
        for (var11Lifetime2 = 0; param0 > var11Lifetime2; var11Lifetime2++) {
          for (var12Lifetime3 = 0; param8 > var12Lifetime3; var12Lifetime3++) {
            var10[7].field_D[param0 * (-var12Lifetime3 + var9 - 1) + var11Lifetime2] = param7;
            var10[5].field_D[-var12Lifetime3 - (1 - var9 - var9 * var11Lifetime2)] = param7;
            var10[1].field_D[param0 * var12Lifetime3 + var11Lifetime2] = param4;
            var10[3].field_D[var11Lifetime2 * var9 + var12Lifetime3] = param4;
          }
        }
        for (var11Lifetime3 = 0; param0 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param2; var12Lifetime4++) {
            var10[1].field_D[param0 * (var9 - var12Lifetime4 - 1) + var11Lifetime3] = param3;
            var10[3].field_D[var9 * var11Lifetime3 - 1 - (-var9 + var12Lifetime4)] = param3;
            var10[7].field_D[param0 * var12Lifetime4 + var11Lifetime3] = param3;
            var10[5].field_D[var11Lifetime3 * var9 + var12Lifetime4] = param3;
          }
        }
        return var10;
    }

    static {
        field_b = true;
        field_a = new ag();
    }
}
