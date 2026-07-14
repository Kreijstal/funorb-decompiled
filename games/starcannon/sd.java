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
        ii var2_ref = null;
        ii var2 = null;
        if (param0 instanceof ii) {
            var2 = (ii) (Object) param0;
            var2.field_b = var2.field_b + 32 + param1;
        } else {
            var2_ref = new ii(param0, param1);
        }
        return var2_ref;
    }

    final static void a(byte param0) {
        ee.field_a = new rk();
        if (param0 != 38) {
            Object var2 = null;
            ii discarded$0 = sd.a((Throwable) null, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new rk();
        field_c = 0;
    }
}
