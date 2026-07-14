/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static int field_a;
    static rh field_c;
    static int field_b;

    public static void b(int param0) {
        field_c = null;
        if (param0 < 121) {
            field_b = 78;
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        ja var3 = null;
        var2 = Geoblox.field_C;
        var3 = (ja) (Object) a.field_d.g(0);
        L0: while (true) {
          if (var3 == null) {
            if (param0 != 7838) {
              dc.b(-80);
              return;
            } else {
              return;
            }
          } else {
            var3.e(1643839728);
            var3 = (ja) (Object) a.field_d.d(1);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
