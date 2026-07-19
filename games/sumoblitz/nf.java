/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    private static String field_z;

    final static int[] a(int param0, byte param1, int param2, int param3) {
        int[] discarded$1 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] stackIn_6_0 = null;
        int[] stackIn_8_0 = null;
        int[] stackIn_13_0 = null;
        int[] stackIn_14_0 = null;
        int[] stackOut_12_0 = null;
        int[] stackOut_5_0 = null;
        var21 = Sumoblitz.field_L ? 1 : 0;
        var24 = new int[param2];
        var23 = var24;
        var22 = var23;
        var4 = var22;
        var5 = 255 & param0 >> -48182352;
        var6 = param0 >> -21889880 & 255;
        var7 = 255 & param0;
        var8 = (double)((param3 >> -1883193808 & 255) - var5) / (double)param2;
        var10 = (double)(((65280 & param3) >> -1992336248) + -var6) / (double)param2;
        var24[0] = param0;
        var12 = (double)(-var7 + (param3 & 255)) / (double)param2;
        var22[-1 + param2] = param3;
        var14 = (double)var5;
        var16 = (double)var6;
        var18 = (double)var7;
        if (param1 < -86) {
          var20 = 1;
          L0: while (true) {
            if (var20 < param2 + -1) {
              var16 = var16 + var10;
              var18 = var18 + var12;
              var14 = var14 + var8;
              stackOut_12_0 = (int[]) (var22);
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (var21 == 0) {
                stackIn_14_0[var20] = ic.a(ic.a(eb.a(1144783103, (int)Math.round(var14)) << -1650062192, eb.a((int)Math.round(var16), 1979711743) << -1121785080), eb.a((int)Math.round(var18), 255));
                var20++;
                continue L0;
              } else {
                return stackIn_13_0;
              }
            } else {
              return var22;
            }
          }
        } else {
          discarded$1 = nf.a(-111, (byte) -80, -51, -78);
          var20 = 1;
          L1: while (true) {
            if (var20 < param2 + -1) {
              var16 = var16 + var10;
              var18 = var18 + var12;
              var14 = var14 + var8;
              stackOut_5_0 = (int[]) (var22);
              stackIn_8_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var21 != 0) {
                return stackIn_8_0;
              } else {
                stackIn_6_0[var20] = ic.a(ic.a(eb.a(1144783103, (int)Math.round(var14)) << -1650062192, eb.a((int)Math.round(var16), 1979711743) << -1121785080), eb.a((int)Math.round(var18), 255));
                var20++;
                continue L1;
              }
            } else {
              return var22;
            }
          }
        }
    }

    static {
        field_z = "nf.A(";
    }
}
