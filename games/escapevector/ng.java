/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends fj {
    static int field_ob;
    static int field_pb;
    static hh field_mb;
    static String field_lb;
    static int field_nb;

    ng(tb param0, hm param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void a(hm param0, int param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ng.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void j(byte param0) {
        field_mb = null;
        field_lb = null;
        if (param0 != 124) {
            ng.j((byte) -12);
        }
    }

    static {
        field_ob = 0;
        field_lb = "Normal";
    }
}
