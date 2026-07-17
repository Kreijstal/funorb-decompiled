/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static vn[] field_a;

    final static void a(byte param0) {
        if (!df.field_h) {
            df.field_h = true;
            return;
        }
        nm.field_b = false;
        df.field_h = false;
        vj.field_o = 0;
    }

    public static void a(int param0) {
        field_a = null;
    }

    final static fn a(byte param0, int param1) {
        tm var2 = null;
        if (se.field_m.d(-117) < 4) {
          if (param0 != 18) {
            field_a = null;
            var2 = new tm(param1);
            se.field_m.a(param0 ^ 18, (le) (Object) var2);
            return var2.field_j;
          } else {
            var2 = new tm(param1);
            se.field_m.a(param0 ^ 18, (le) (Object) var2);
            return var2.field_j;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new vn[2];
    }
}
