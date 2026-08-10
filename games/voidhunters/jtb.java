/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jtb extends fh {
    boolean field_k;
    volatile boolean field_n;
    boolean field_l;
    static int field_m;

    abstract byte[] a(int param0);

    abstract int e(byte param0);

    jtb() {
        this.field_n = true;
    }

    final static void a(int param0, int param1, long param2, boolean param3, String param4) {
        try {
            kkb.field_p = param1;
            hb.field_b = param2;
            cwa.field_b = param4;
            cha.field_o = true;
            gi.field_a = param0;
            if (param3) {
                String var7 = (String) null;
                jtb.a(50, -52, 121L, false, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jtb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 2560;
    }
}
