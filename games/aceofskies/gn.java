/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static vd[] field_b;
    static int field_a;

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, rb param2, rb param3, int param4) {
        try {
            qf.a(param3.field_f, param2, 25215, param0, param3.field_g, param1, 0);
            if (param4 < 34) {
                gn.a((byte) -87);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "gn.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -72) {
            gn.a((byte) 7);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_a = 256;
    }
}
