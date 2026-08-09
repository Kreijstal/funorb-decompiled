/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    static ke field_a;
    static int field_b;

    final static void a(int param0, rh param1) {
        if (param1 == null || null == param1.field_g) {
            return;
        }
        try {
            if (param0 != 50) {
                field_b = -46;
            }
            ud.a(param1, -98);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = (ke) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = new ke();
        field_b = 50;
    }
}
