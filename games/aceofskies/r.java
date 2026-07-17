/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends wt {
    static String field_o;
    static int field_n;

    public static void f() {
        field_o = null;
    }

    protected r() {
    }

    final static void e() {
        int var1 = 0;
        if (32 < gn.field_a) {
          L0: {
            var1 = gn.field_a % 32;
            if (var1 == 0) {
              var1 = 32;
              break L0;
            } else {
              break L0;
            }
          }
          rt.b(-var1 + gn.field_a, (byte) -127);
          return;
        } else {
          rt.b(0, (byte) 28);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Suggested names: ";
    }
}
