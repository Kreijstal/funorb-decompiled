/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static llb[] field_b;
    static int field_a;

    final static phb[] a(int param0, int param1, int param2, int param3, boolean param4) {
        phb[] var6 = new phb[9];
        phb[] var5 = var6;
        var6[6] = mra.a(param0, (byte) -119, param2);
        var5[3] = mra.a(param0, (byte) -119, param2);
        var5[2] = mra.a(param0, (byte) -119, param2);
        var5[1] = mra.a(param0, (byte) -119, param2);
        var5[0] = mra.a(param0, (byte) -119, param2);
        var6[8] = mra.a(param3, (byte) -125, param2);
        var5[7] = mra.a(param3, (byte) -125, param2);
        var5[5] = mra.a(param3, (byte) -125, param2);
        if (!param4) {
            field_b = null;
        }
        if (param1 != 0) {
            var6[4] = mra.a(param1, (byte) -116, 64);
        }
        return var5;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var12 = 0;
        int[] var16 = null;
        int var14 = VoidHunters.field_G;
        int var9 = param3 + -param7;
        int var8 = param7 + param0;
        if (param6 != 7) {
            return;
        }
        for (var12 = param0; var12 < var8; var12++) {
            ww.a(param4, param5, rba.field_b[var12], (byte) 75, param1);
        }
        for (var12 = param3; var9 < var12; var12--) {
            ww.a(param4, param5, rba.field_b[var12], (byte) 75, param1);
        }
        int var11 = -param7 + param5;
        int var10 = param7 + param1;
        for (var12 = var8; var9 >= var12; var12++) {
            var16 = rba.field_b[var12];
            ww.a(param4, var10, var16, (byte) 75, param1);
            ww.a(param2, var11, var16, (byte) 75, var10);
            ww.a(param4, param5, var16, (byte) 75, var11);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -23460) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
