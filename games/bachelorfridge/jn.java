/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -22089) {
            field_a = null;
        }
    }

    final static void a(int param0, lda param1, int param2, boolean param3) {
        ge.field_I = param0;
        raa.field_I = param1;
        wo.field_j = param2;
        if (param3) {
            field_a = null;
        }
    }

    final static void b(int param0) {
        cq discarded$0 = ol.a(bi.field_i[param0], true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "The '<%0>' setting needs to be changed.";
    }
}
