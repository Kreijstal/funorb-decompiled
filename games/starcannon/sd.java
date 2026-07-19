/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static rk field_d;
    static String field_b;
    static int[] field_e;
    static int field_a;
    static int field_c;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            field_c = -99;
            field_d = null;
            field_b = null;
            return;
        }
        field_d = null;
        field_b = null;
    }

    final static ii a(Throwable param0, String param1) {
        ii var2 = null;
        if (param0 instanceof ii) {
            var2 = (ii) ((Object) param0);
            var2.field_b = var2.field_b + ' ' + param1;
        } else {
            var2 = new ii(param0, param1);
        }
        return var2;
    }

    final static void a(byte param0) {
        ii discarded$0 = null;
        ee.field_a = new rk();
        if (param0 != 38) {
            String var2 = (String) null;
            discarded$0 = sd.a((Throwable) null, (String) null);
        }
    }

    static {
        field_d = new rk();
        field_c = 0;
    }
}
