/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static int[] field_d;
    static String field_b;
    static int field_a;
    static boolean field_c;

    final static void a(byte param0, ad param1) {
        try {
            wc.field_d = param1;
            rb.a(dc.field_c, (byte) -58);
            if (param0 != -121) {
                field_c = false;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "v.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, md param3, java.awt.Component param4) {
        try {
            va.a(param0, param1, 10);
            vh.field_B = va.a(param3, param4, 1, param2);
            fc.field_k = va.a(param3, param4, 0, 22050);
            qb.field_c = new mj();
            vh.field_B.b(qb.field_c);
            i.field_p = new mj();
            fc.field_k.b(i.field_p);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "v.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        if (param0) {
            field_d = (int[]) null;
        }
    }

    static {
        field_d = new int[8192];
    }
}
