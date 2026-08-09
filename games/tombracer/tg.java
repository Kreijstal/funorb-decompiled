/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_a;
    static int[] field_b;
    static jea field_c;

    final static short a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 > -101) {
          L0: {
            tg.a((byte) 57, -105);
            var2 = (param1 & 65427) >> -661641430;
            var3 = 112 & param1 >> 544040515;
            var4 = 127 & param1;
            if (-65 <= (var4 ^ -1)) {
              stackIn_11_0 = var3 * var4 >> 1831731847;
              break L0;
            } else {
              stackIn_11_0 = (127 - var4) * var3 >> 351895655;
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
              stackIn_4_0 = var3 * var4 >> 1831731847;
              break L2;
            } else {
              stackIn_4_0 = (127 - var4) * var3 >> 351895655;
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
        field_b = new int[16];
        field_a = "Play the game without logging in just yet";
    }
}
