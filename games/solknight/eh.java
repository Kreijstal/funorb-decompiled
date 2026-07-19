/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static o[] field_b;
    static int[] field_a;

    final static void a(byte param0, gb param1) {
        dk.field_i = param1.i(31) << 341926053;
        int var2_int = param1.j(255);
        dk.field_i = dk.field_i + (var2_int >> 390617667);
        nf.field_S = (7 & var2_int) << 683485618;
        nf.field_S = nf.field_S + (param1.i(-105) << 931025442);
        var2_int = param1.j(255);
        nf.field_S = nf.field_S + (var2_int >> 555621286);
        vg.field_P = var2_int << 1348491951 & 2064384;
        vg.field_P = vg.field_P + (param1.j(255) << -881752089);
        var2_int = param1.j(255);
        if (param0 <= 51) {
            return;
        }
        try {
            fh.field_a = var2_int << 1595052432 & 65536;
            vg.field_P = vg.field_P + (var2_int >> 862051297);
            fh.field_a = fh.field_a + param1.i(40);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "eh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 58) {
            field_a = (int[]) null;
        }
    }

    static {
    }
}
