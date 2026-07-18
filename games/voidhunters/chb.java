/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class chb {
    static int field_a;

    final static void a(int param0, int param1, boolean param2) {
        hqb var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        vu var3 = qp.a(param2, 2, param1);
        if (!(var3 == null)) {
            cka.field_o.a(false, 115);
            var4 = cka.field_o;
            var5_ref_String = esa.field_o;
            var4.field_i.a(var5_ref_String, (byte) -53, 5);
            var4 = cka.field_o;
            var5 = oq.field_H;
            var6 = qs.field_a;
            var4.field_i.b(var5, -29060, var6, 0, 0);
        }
        dq.a((byte) 44, param1, param2);
    }

    final static void a(int param0) {
        if (null == bjb.field_p) {
            bjb.field_p = new qsa[32];
            hcb.field_p = 0;
            return;
        }
        hcb.field_p = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 26;
    }
}
