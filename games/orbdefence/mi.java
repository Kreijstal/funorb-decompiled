/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    private boolean field_a;
    private String field_c;
    private boolean field_b;
    static String field_d;
    static String field_e;

    final void a(boolean param0, byte param1) {
        this.field_a = param0 ? true : false;
        int var3 = 15 % ((param1 - -23) / 61);
        this.field_b = true;
    }

    final boolean b(byte param0) {
        if (param0 != 67) {
            this.field_a = true;
            return this.field_a;
        }
        return this.field_a;
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 != -67) {
            field_d = (String) null;
        }
    }

    final String a(int param0) {
        boolean discarded$0 = false;
        if (param0 >= -51) {
            discarded$0 = this.b((byte) -51);
            return this.field_c;
        }
        return this.field_c;
    }

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return this.field_b;
    }

    mi(String param0) {
        this.field_a = false;
        this.field_b = false;
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "mi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Previous";
    }
}
