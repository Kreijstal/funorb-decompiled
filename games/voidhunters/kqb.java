/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kqb {
    final static void a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            bv.field_d = true;
            nbb.field_y.field_R = param0;
            var2_int = jl.field_q.field_d;
            var3 = jl.field_q.field_b;
            var4 = nbb.field_y.field_eb.b(param0, 272, nbb.field_y.field_D);
            var5 = -(var4 / 2) + 7 + -110 + var3 / 2;
            dd.field_o.a((-320 + var2_int) / 2, 125, 320, var5, -(var5 * 2) + var3 + -120);
            dd.field_o.field_gb = uwa.a(11579568, dd.field_o.field_G, 2105376, 8421504, param1 ^ 77, 3);
            nbb.field_y.a(24, -54, -24 + (dd.field_o.field_hb - 24), param1, -24 + (-20 + dd.field_o.field_G));
            ss.field_o.a(120, -72, 80, -24 + (-20 + dd.field_o.field_G), 24);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kqb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
