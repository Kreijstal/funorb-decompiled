/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rb {
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            field_b = null;
        }
    }

    final static pl a(byte param0, ed param1) {
        if (param0 <= 80) {
          field_b = null;
          return new pl(param1.n(2), param1.n(2), param1.n(2), param1.n(2), param1.m(0), param1.m(0), param1.h(-11));
        } else {
          return new pl(param1.n(2), param1.n(2), param1.n(2), param1.n(2), param1.m(0), param1.m(0), param1.h(-11));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You are offering to draw.";
        field_a = "Achievements";
    }
}
