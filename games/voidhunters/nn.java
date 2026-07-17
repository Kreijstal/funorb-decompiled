/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn implements dja {
    static int field_b;
    static int field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var8 = VoidHunters.field_G;
        try {
            for (var6_int = param2; var6_int <= param5; var6_int++) {
                ww.a(param4, param1, rba.field_b[var6_int], (byte) 75, param0);
            }
            int var7 = 0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "nn.D(" + param0 + 44 + param1 + 44 + param2 + 44 + 112 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, lta param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            var6_int = param5;
            var7 = param0;
            var8 = param5;
            var9 = param0;
            var10 = param3 + -param5;
            var11 = param2 + -param0;
            var12 = var11;
            var13 = -var10;
            var14 = ar.a(var12, (byte) 103, var13);
            var13 = (var13 << 8) / var14;
            var12 = (var12 << 8) / var14;
            var15 = 64;
            var16 = 1;
            L1: while (true) {
              if (var15 + 1 <= var16) {
                break L0;
              } else {
                var17 = fc.a(512 * kdb.field_o - (var16 << 8), (byte) -65) >> 14;
                var18 = fc.a(-(var16 << 8) + kdb.field_o * 500, (byte) 59) >> 14;
                var19 = var12 * var17 + var10 * var16 / var15 + param5;
                var20 = var17 * var13 + var16 * var11 / var15 + param0;
                var21 = param5 - -(var10 * var16 / var15) + -(var18 * var12);
                hha.a(param4.a(var6_int, (byte) 126), (byte) 66, param4.a(var19, (byte) 126), param4.b(true, var7), 11206400, param4.b(true, var20), 200);
                var22 = -(var13 * var18) + (param0 + var11 * var16 / var15);
                var7 = var20;
                hha.a(param4.a(var8, (byte) 113), (byte) 66, param4.a(var21, (byte) 125), param4.b(true, var9), 12320512, param4.b(true, var22), 240);
                var6_int = var19;
                var8 = var21;
                var9 = var22;
                var16++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("nn.C(").append(param0).append(44).append(1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param5 + 41);
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_b = -83;
        }
        return (tv[]) (Object) new bha[param1];
    }

    public final tv a(byte param0) {
        int var2 = -59 % ((param0 - -64) / 50);
        return (tv) (Object) new bha();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 18;
        field_b = 0;
    }
}
