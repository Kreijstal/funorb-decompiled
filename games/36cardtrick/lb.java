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
        this.field_d = true;
        this.field_c = param1 ? true : false;
        if (param0 != 16511) {
            this.field_b = (String) null;
        }
    }

    final String d(int param0) {
        if (param0 != 640) {
            return (String) null;
        }
        return this.field_b;
    }

    final boolean a(int param0) {
        if (param0 != 640) {
            return true;
        }
        return this.field_d;
    }

    final boolean b(int param0) {
        if (param0 != 640) {
            return false;
        }
        return this.field_c;
    }

    lb(String param0) {
        this.field_d = false;
        this.field_c = false;
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Use this alternative as your account name";
        field_g = 640;
        field_f = "Unpacking graphics";
    }
}
