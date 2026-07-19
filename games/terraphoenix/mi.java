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
            field_h = (fa) null;
        }
    }

    final cm c(int param0) {
        if (param0 != 0) {
            field_h = (fa) null;
            return rj.field_a;
        }
        return rj.field_a;
    }

    final static boolean a(byte param0) {
        if (param0 > -71) {
            field_i = (String) null;
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
        param1.b(this.field_k, -89);
        if (param0 != -2) {
            return;
        }
        try {
            param1.a(-97, this.field_j);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "mi.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mi(String param0, String param1) {
        try {
            this.field_j = param1;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "mi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "To server list";
    }
}
