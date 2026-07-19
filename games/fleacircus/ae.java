/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static fh field_d;
    static wk field_b;
    static int field_c;
    static int field_e;
    static ih field_a;

    final static void a(int param0, String param1) {
        if (param0 < 107) {
            return;
        }
        try {
            wc.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ae.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 < 86) {
            field_a = (ih) null;
            wa.a(param0, false, -96);
            return;
        }
        wa.a(param0, false, -96);
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        int var1 = 12 / ((19 - param0) / 58);
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_d = new fh(2, 4, 4, 0);
    }
}
