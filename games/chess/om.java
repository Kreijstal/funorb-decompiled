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
        rk[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        rk[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (tj.a(param1, param3, param0, (byte) 83)) {
              stackOut_3_0 = dl.a(-15326);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (rk[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("om.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + true + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static km[] a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var7 = Chess.field_G;
        km[] var8 = new km[9];
        km[] var4 = var8;
        var8[0] = rd.a(1, param2, 14727);
        int var6 = 2;
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
