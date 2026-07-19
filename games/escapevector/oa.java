/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oa extends fl {
    static int field_t;
    static int field_v;
    static String field_q;
    volatile boolean field_u;
    static hh field_w;
    boolean field_r;
    boolean field_s;

    final static void a(int param0, dc param1, int param2) {
        c var3 = null;
        if (param2 != -755) {
            return;
        }
        try {
            var3 = om.field_c;
            var3.a(param0, true);
            var3.f(2, -123);
            var3.f(0, -123);
            var3.f(param1.field_j, -123);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "oa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        if (param0 != 5) {
            oa.f(16);
            field_w = null;
            field_q = null;
            return;
        }
        field_w = null;
        field_q = null;
    }

    abstract int g(int param0);

    abstract byte[] a(boolean param0);

    oa() {
        this.field_u = true;
    }

    static {
        field_q = "End Game";
        field_v = 5;
    }
}
