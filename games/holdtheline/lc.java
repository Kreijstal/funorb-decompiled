/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    private String field_a;
    private boolean field_e;
    private boolean field_b;
    static int field_h;
    static String field_f;
    static int field_g;
    static vi field_d;
    static go field_c;

    final boolean a(byte param0) {
        if (param0 != -34) {
            lc.b(-70);
            return this.field_b;
        }
        return this.field_b;
    }

    final String b(byte param0) {
        if (param0 != 66) {
            this.a(true, 65);
            return this.field_a;
        }
        return this.field_a;
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 >= -19) {
            lc.b(38);
        }
    }

    final boolean a(int param0) {
        if (param0 != 250) {
            field_g = 99;
            return this.field_e;
        }
        return this.field_e;
    }

    lc(String param0) {
        this.field_b = false;
        this.field_e = false;
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 < 74) {
            return;
        }
        this.field_b = param0 ? true : false;
        this.field_e = true;
    }

    static {
        field_f = "Password: ";
        field_h = 250;
    }
}
