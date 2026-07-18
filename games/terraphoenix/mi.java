/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends nb {
    private String field_j;
    static fa field_h;
    static String field_i;
    private String field_k;

    final static void d(int param0) {
        if (param0 != -22284) {
            field_h = null;
        }
    }

    final cm c(int param0) {
        if (param0 != 0) {
            field_h = null;
            return rj.field_a;
        }
        return rj.field_a;
    }

    final static boolean a(byte param0) {
        if (param0 > -71) {
            field_i = null;
            return true;
        }
        return true;
    }

    public static void b(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 != -118) {
            mi.b((byte) 116);
        }
    }

    final void a(byte param0, dh param1) {
        param1.b(((mi) this).field_k, -89);
        if (param0 != -2) {
            return;
        }
        try {
            param1.a(-97, ((mi) this).field_j);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "mi.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mi(String param0, String param1) {
        try {
            ((mi) this).field_j = param1;
            ((mi) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "mi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "To server list";
    }
}
