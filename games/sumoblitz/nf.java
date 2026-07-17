/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    private static String field_z;

    final static int[] a(int param0, byte param1, int param2, int param3) {
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
        int[] var25 = null;
        int[] var26 = null;
        L0: {
          var21 = Sumoblitz.field_L ? 1 : 0;
          var26 = new int[param2];
          var25 = var26;
          var24 = var25;
          var23 = var24;
          var22 = var23;
          var4 = var22;
          var5 = 255 & param0 >> 16;
          var6 = param0 >> 8 & 255;
          var7 = 255 & param0;
          var8 = (double)((param3 >> 16 & 255) - var5) / (double)param2;
          var10 = (double)(((65280 & param3) >> 8) + -var6) / (double)param2;
          var26[0] = param0;
          var12 = (double)(-var7 + (param3 & 255)) / (double)param2;
          var22[-1 + param2] = param3;
          var14 = (double)var5;
          var16 = (double)var6;
          var18 = (double)var7;
          if (param1 < -86) {
            break L0;
          } else {
            int[] discarded$1 = nf.a(-111, (byte) -80, -51, -78);
            break L0;
          }
        }
        var20 = 1;
        L1: while (true) {
          if (var20 >= param2 + -1) {
            return var4;
          } else {
            var16 = var16 + var10;
            var18 = var18 + var12;
            var14 = var14 + var8;
            var22[var20] = ic.a(ic.a(eb.a(1144783103, (int)Math.round(var14)) << 16, eb.a((int)Math.round(var16), 1979711743) << 8), eb.a((int)Math.round(var18), 255));
            var20++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "nf.A(";
    }
}
