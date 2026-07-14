/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static gd field_a;
    static fb field_b;
    static pd field_c;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 > -81) {
            field_c = null;
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        lk var3 = null;
        var2 = DungeonAssault.field_K;
        if (null != og.field_e) {
          if (og.field_e.field_J != null) {
            var3 = (lk) (Object) og.field_e.field_J.e(-24172);
            L0: while (true) {
              if (var3 == null) {
                if (param0 != 1) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              } else {
                var3.g(255);
                var3 = (lk) (Object) og.field_e.field_J.a(param0 + 3);
                continue L0;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fb();
    }
}
