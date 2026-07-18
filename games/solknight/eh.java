/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static o[] field_b;
    static int[] field_a;

    final static void a(byte param0, gb param1) {
        dk.field_i = param1.i(31) << 5;
        int var2_int = param1.j(255);
        dk.field_i = dk.field_i + (var2_int >> 3);
        nf.field_S = (7 & var2_int) << 18;
        nf.field_S = nf.field_S + (param1.i(-105) << 2);
        var2_int = param1.j(255);
        nf.field_S = nf.field_S + (var2_int >> 6);
        vg.field_P = var2_int << 15 & 2064384;
        vg.field_P = vg.field_P + (param1.j(255) << 7);
        var2_int = param1.j(255);
        try {
            fh.field_a = var2_int << 16 & 65536;
            vg.field_P = vg.field_P + (var2_int >> 1);
            fh.field_a = fh.field_a + param1.i(40);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "eh.B(" + 68 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    static {
    }
}
