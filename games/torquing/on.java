/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends qf {
    static eb field_e;
    static String field_d;
    static String field_b;
    static int field_c;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 160) {
            on.b(104);
            field_e = null;
            return;
        }
        field_e = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, int param1, fn param2, byte param3) {
        try {
            dn.field_h = param0;
            p.field_x = param2;
            wp.field_y = param1;
            if (param3 != -58) {
                field_d = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "on.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != 160) {
            field_e = (eb) null;
            return i.field_R;
        }
        return i.field_R;
    }

    static {
        field_e = new eb(64);
        field_c = 160;
    }
}
