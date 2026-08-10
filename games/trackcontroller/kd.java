/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kd {
    static ja field_b;
    static ja field_a;

    final static void a(String param0, byte param1) {
        try {
            if (param1 <= 30) {
                field_a = (ja) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "kd.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void a(byte param0, be param1);

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 < 23) {
            field_b = (ja) null;
        }
    }

    abstract nh a(boolean param0);

    static {
        field_b = new ja();
        field_a = new ja();
    }
}
