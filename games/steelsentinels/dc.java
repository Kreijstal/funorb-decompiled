/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static String field_d;
    static int field_g;
    static wk[][] field_b;
    String[] field_e;
    static int field_h;
    static String field_f;
    static int field_c;
    static String field_a;

    final static String a(int param0, int param1) {
        int[] var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        var5 = SteelSentinels.field_G;
        var6 = new int[]{16, param1, 64, 128, 256, 512};
        var2 = var6;
        var3 = new StringBuilder();
        var4 = 0;
        L0: while (true) {
          if (var4 >= var6.length) {
            return var3.toString();
          } else {
            if ((var6[var4] & param0) != -1) {
              L1: {
                if (-1 >= var3.length()) {
                  break L1;
                } else {
                  StringBuilder discarded$2 = var3.append(47);
                  break L1;
                }
              }
              StringBuilder discarded$3 = var3.append(kk.field_h[var4]);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_f = null;
        int var1 = -60 % ((42 - param0) / 59);
        field_a = null;
    }

    private dc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = -1;
        field_d = "F1";
        field_f = "Mission <%0>";
        field_a = "BA'AL LORD OF ILOLIA";
    }
}
