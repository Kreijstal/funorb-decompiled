/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up {
    private boolean field_f;
    static int[] field_b;
    static int field_d;
    static String field_h;
    static no field_a;
    static int[] field_e;
    private String field_c;
    private boolean field_g;

    final void a(int param0, boolean param1) {
        int var3 = -77 / ((param0 - 29) / 42);
        this.field_f = true;
        this.field_g = param1 ? true : false;
    }

    public static void b(int param0) {
        field_h = null;
        int var1 = -1 / ((-61 - param0) / 39);
        field_e = null;
        field_b = null;
        field_a = null;
    }

    final boolean a(int param0) {
        if (param0 != 484) {
            this.a(36, true);
            return this.field_g;
        }
        return this.field_g;
    }

    final String a(byte param0) {
        if (param0 >= -93) {
            field_a = (no) null;
            return this.field_c;
        }
        return this.field_c;
    }

    final boolean c(int param0) {
        if (param0 != 484) {
            return false;
        }
        return this.field_f;
    }

    up(String param0) {
        this.field_f = false;
        this.field_g = false;
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "up.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new int[8192];
        field_h = "You have <%0> unread messages!";
        field_e = new int[]{413, 413, 529, 427, 451, 0, 484, 484, 484, 484, 384, 484};
    }
}
