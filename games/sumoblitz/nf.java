/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    private static String field_z;

    final static int[] a(int param0, byte param1, int param2, int param3) {
        int var20 = 0;
        int var21 = Sumoblitz.field_L ? 1 : 0;
        int[] var24 = new int[param2];
        int[] var23 = var24;
        int[] var22 = var23;
        int[] var4 = var22;
        int var5 = 255 & param0 >> -48182352;
        int var6 = param0 >> -21889880 & 255;
        int var7 = 255 & param0;
        double var8 = (double)((param3 >> -1883193808 & 255) - var5) / (double)param2;
        double var10 = (double)(((65280 & param3) >> -1992336248) + -var6) / (double)param2;
        var24[0] = param0;
        double var12 = (double)(-var7 + (param3 & 255)) / (double)param2;
        var22[-1 + param2] = param3;
        double var14 = (double)var5;
        double var16 = (double)var6;
        double var18 = (double)var7;
        if (param1 >= -86) {
            nf.a(-111, (byte) -80, -51, -78);
        }
        for (var20 = 1; var20 < param2 + -1; var20++) {
            var16 = var16 + var10;
            var18 = var18 + var12;
            var14 = var14 + var8;
            var22[var20] = ic.a(ic.a(eb.a(1144783103, (int)Math.round(var14)) << -1650062192, eb.a((int)Math.round(var16), 1979711743) << -1121785080), eb.a((int)Math.round(var18), 255));
        }
        return var4;
    }

    static {
        field_z = "nf.A(";
    }
}
