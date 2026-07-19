/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static String field_a;

    final static void a(byte param0) {
        int var1 = 38 % ((param0 - -66) / 55);
        mm.field_u.e(new qb(), -27667);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        ve.field_b = param2;
        lk.field_wb = param1;
        mc.field_b = param3;
        if (param0 <= 68) {
            gj.a((byte) -35);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -12359) {
            field_a = (String) null;
        }
    }

    final static void a(ve param0, int param1, int param2, int param3) {
        try {
            ng.field_D = param1;
            nm.field_o = param0;
            if (param3 != -20140) {
                field_a = (String) null;
            }
            fl.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "gj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Password: ";
    }
}
