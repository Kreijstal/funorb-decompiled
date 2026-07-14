/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static oj field_d;
    static int field_f;
    static String field_a;
    static int field_b;
    static String field_c;
    static int field_g;
    static volatile int field_e;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -20973) {
            field_g = 51;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        if (0L == (pd.field_i & 1L)) {
          return false;
        } else {
          de.a(-105);
          var1 = 0;
          var2 = -112 / ((-54 - param0) / 32);
          L0: while (true) {
            if (aq.field_a.length > var1) {
              if (!aq.field_a[var1].b(59)) {
                var1++;
                continue L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 4;
        field_d = null;
        field_a = "You have entered another game.";
        field_c = "Return to game";
        field_b = 3;
        field_g = -750;
        field_e = 0;
    }
}
