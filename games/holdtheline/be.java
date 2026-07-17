/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends hl {
    static gn field_i;
    static ra field_l;
    static ah field_j;
    byte[] field_k;

    final static void a(int param0) {
        if (!(null == sb.field_c)) {
            sb.field_c.h((byte) -80);
        }
        vf.field_l = new de();
        sm.field_c.a((n) (Object) vf.field_l, (byte) -104);
    }

    public static void e(int param0) {
        field_i = null;
        field_j = null;
        field_l = null;
    }

    be(byte[] param0) {
        try {
            ((be) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "be.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
