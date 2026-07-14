/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mua {
    static int field_b;
    static fpa field_a;

    final static la a(dt param0, int param1) {
        Object var3 = null;
        if (param1 < 10) {
          var3 = null;
          la discarded$2 = mua.a((dt) null, -83);
          return new la(param0, 0, (kh) null, 0, false);
        } else {
          return new la(param0, 0, (kh) null, 0, false);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            mua.a(34);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fpa();
    }
}
