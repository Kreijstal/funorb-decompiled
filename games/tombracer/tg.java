/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_a;
    static int[] field_b;
    static jea field_c;

    final static short a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -101) {
          L0: {
            short discarded$1 = tg.a((byte) 57, -105);
            var2 = (param1 & 65427) >> -661641430;
            var3 = 112 & param1 >> 544040515;
            var4 = 127 & param1;
            if (-65 <= (var4 ^ -1)) {
              stackOut_10_0 = var3 * var4 >> 1831731847;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = (127 - var4) * var3 >> 351895655;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_11_0;
            var5 = var4 + var3;
            if (0 != var5) {
              var6 = (var3 << -11469624) / var5;
              break L1;
            } else {
              var6 = var3 << -1968037311;
              break L1;
            }
          }
          var7 = var5;
          return (short)(var7 | (var2 << 1364890954 | var6 >> -1804241148 << -446385465));
        } else {
          L2: {
            var2 = (param1 & 65427) >> -661641430;
            var3 = 112 & param1 >> 544040515;
            var4 = 127 & param1;
            if (-65 <= (var4 ^ -1)) {
              stackOut_3_0 = var3 * var4 >> 1831731847;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = (127 - var4) * var3 >> 351895655;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var3 = stackIn_4_0;
            var5 = var4 + var3;
            if (0 != var5) {
              var6 = (var3 << -11469624) / var5;
              break L3;
            } else {
              var6 = var3 << -1968037311;
              break L3;
            }
          }
          var7 = var5;
          return (short)(var7 | (var2 << 1364890954 | var6 >> -1804241148 << -446385465));
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -53 % ((param0 - -67) / 34);
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[16];
        field_a = "Play the game without logging in just yet";
    }
}
