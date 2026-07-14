/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static wb field_c;
    static int[] field_b;
    static mk field_a;
    static int[] field_g;
    static ko field_f;
    static String field_h;
    static java.awt.Color field_e;
    static ko field_d;

    final static sj a(int param0, int param1) {
        sj[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        sj[] var5 = null;
        var4 = CrazyCrystals.field_B;
        var5 = rp.a(58);
        var2 = var5;
        if (param1 > 117) {
          var3 = 0;
          L0: while (true) {
            if (var5.length > var3) {
              if (param0 == var5[var3].field_e) {
                return var5[var3];
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            sj discarded$0 = cf.a(-12, -56);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new wb();
        field_b = new int[8192];
        field_g = new int[8192];
        field_a = new mk();
        field_h = "Back";
        field_e = new java.awt.Color(10040319);
    }
}
