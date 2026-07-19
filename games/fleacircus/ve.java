/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static fa field_d;
    private boolean field_c;
    private String field_b;
    private boolean field_a;

    public static void a(byte param0) {
        if (param0 != 84) {
            ve.a((byte) 97);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 > -16) {
            this.field_b = (String) null;
            return this.field_c;
        }
        return this.field_c;
    }

    final String c(int param0) {
        if (param0 != -16955) {
            return (String) null;
        }
        return this.field_b;
    }

    final void a(boolean param0, int param1) {
        if (param1 != 10518) {
            return;
        }
        this.field_a = param0 ? true : false;
        this.field_c = true;
    }

    final boolean b(int param0) {
        if (param0 != 27937) {
            this.field_b = (String) null;
            return this.field_a;
        }
        return this.field_a;
    }

    ve(String param0) {
        this.field_c = false;
        this.field_a = false;
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
