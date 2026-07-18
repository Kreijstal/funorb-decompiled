/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    private boolean field_c;
    private boolean field_d;
    static int field_g;
    static qk field_a;
    static String field_f;
    private String field_b;
    static String field_e;

    public static void c(int param0) {
        field_e = null;
        field_f = null;
        field_a = null;
        if (param0 != 640) {
            lb.c(76);
        }
    }

    final void a(int param0, boolean param1) {
        ((lb) this).field_d = true;
        ((lb) this).field_c = param1 ? true : false;
        if (param0 != 16511) {
            ((lb) this).field_b = null;
        }
    }

    final String d(int param0) {
        if (param0 != 640) {
            return null;
        }
        return ((lb) this).field_b;
    }

    final boolean a(int param0) {
        if (param0 != 640) {
            return true;
        }
        return ((lb) this).field_d;
    }

    final boolean b(int param0) {
        if (param0 != 640) {
            return false;
        }
        return ((lb) this).field_c;
    }

    lb(String param0) {
        ((lb) this).field_d = false;
        ((lb) this).field_c = false;
        try {
            ((lb) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "lb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Use this alternative as your account name";
        field_g = 640;
        field_f = "Unpacking graphics";
    }
}
