/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends fc {
    int field_m;
    static String field_i;
    static String field_n;
    int[] field_k;
    static int field_l;
    boolean field_j;

    final static void d() {
        pf.field_U = 0;
    }

    final static kh f() {
        int discarded$0 = 0;
        String var1 = l.h();
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        int discarded$1 = 0;
        int discarded$2 = 41;
        return new kh(l.h(), cf.a());
    }

    th() {
        ((th) this).field_j = false;
    }

    public static void e() {
        field_n = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "(Backspace)";
    }
}
