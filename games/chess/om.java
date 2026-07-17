/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends o {
    static ao[] field_m;
    static boolean field_j;
    int field_k;
    static boolean field_l;

    final static void a(int param0) {
        if (!(ga.a(true))) {
            return;
        }
        int var1 = -39;
        qh.a(false, false, 4);
    }

    final static rk[] a(um param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        rk[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        rk[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (tj.a(param1, param3, param0, (byte) 83)) {
              L1: {
                if (param2) {
                  break L1;
                } else {
                  km[] discarded$2 = om.a(-88, -113, -21, (byte) -38);
                  break L1;
                }
              }
              stackOut_5_0 = dl.a(-15326);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (rk[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("om.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final static km[] a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var7 = Chess.field_G;
        km[] var8 = new km[9];
        km[] var4 = var8;
        var8[0] = rd.a(param0, param2, 14727);
        int var6 = 119 % ((param3 - 22) / 35);
        for (var5 = 1; var5 < 9; var5++) {
            var8[var5] = var8[0];
        }
        var4[4] = rd.a(64, param1, 14727);
        return var4;
    }

    public static void c(byte param0) {
        if (param0 > -98) {
            om.c((byte) -118);
            field_m = null;
            return;
        }
        field_m = null;
    }

    private om() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_m = new ao[255];
        field_j = false;
        for (var0 = 0; field_m.length > var0; var0++) {
            field_m[var0] = new ao();
        }
        field_l = false;
    }
}
