/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static er field_b;
    static String field_c;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 63) {
            boolean discarded$0 = cd.b(44);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 != -27440) {
            return true;
        }
        if (null == lo.field_k) {
            return false;
        }
        if (!rg.field_d.a((byte) 125)) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You have resigned.";
    }
}
