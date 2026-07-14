/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static int[] field_c;
    int field_b;
    static String[] field_a;

    public static void a(int param0) {
        if (param0 >= -54) {
            field_a = null;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static int a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0.length();
        var3 = 0;
        var4 = 0;
        if (param1 < -18) {
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = -var3 + ((var3 << 408044421) - -uo.a(true, param0.charAt(var4)));
              var4++;
              continue L0;
            }
          }
        } else {
          return -6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"None", "Armoured", "Spiked", "Bomb", "Small", "Big", "Boss"};
    }
}
