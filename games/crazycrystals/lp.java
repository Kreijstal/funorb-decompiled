/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    static byte[][][] field_a;
    static ko field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            Object var2 = null;
            int discarded$0 = lp.a((CharSequence) null, (byte) 7, 'D');
        }
        field_c = null;
    }

    final static int a(CharSequence param0, byte param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = CrazyCrystals.field_B;
          var3 = 0;
          var4 = param0.length();
          if (param1 < -13) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param0.charAt(var5) == param2) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Aha, some rocks to kill the spider with!";
    }
}
