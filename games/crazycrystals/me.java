/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static int field_e;
    static String field_d;
    static int field_b;
    static int field_c;
    static String field_a;
    static vp field_f;

    final static si a(String param0, int param1, int param2) {
        si var3 = null;
        var3 = new si(false);
        var3.field_h = param0;
        var3.field_g = param2;
        if (param1 != 20) {
          field_a = null;
          return var3;
        } else {
          return var3;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 < 92) {
            field_c = 76;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (param0 != 20) {
            field_f = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Create a free account";
        field_c = 20;
        field_a = "Most Crystals";
    }
}
