/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_a;
    static int field_b;
    static uf field_c;

    final static void a(boolean param0) {
        if (param0) {
            field_c = null;
        }
    }

    final static void a(wb param0, int param1) {
        fe.a(true, param0, param1 ^ 15171);
        if (param1 != 14915) {
            Object var3 = null;
            rg.a((wb) null, 121);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 17883) {
            field_a = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Player names can be up to 12 letters, numbers and underscores";
    }
}
