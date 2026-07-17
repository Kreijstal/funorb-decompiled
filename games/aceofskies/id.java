/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int field_d;
    private boolean field_a;
    private String field_b;
    static gb field_f;
    static String field_e;
    private boolean field_c;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
    }

    final boolean a(int param0) {
        if (param0 != -1915) {
            ((id) this).field_c = false;
            return ((id) this).field_a;
        }
        return ((id) this).field_a;
    }

    final void a(boolean param0, boolean param1) {
        ((id) this).field_c = true;
        ((id) this).field_a = param1 ? true : false;
        if (param0) {
            ((id) this).field_a = true;
        }
    }

    final String b(int param0) {
        if (param0 != 2) {
            field_f = null;
            return ((id) this).field_b;
        }
        return ((id) this).field_b;
    }

    final boolean a(boolean param0) {
        if (param0) {
            ((id) this).field_c = true;
            return ((id) this).field_c;
        }
        return ((id) this).field_c;
    }

    id(String param0) {
        ((id) this).field_a = false;
        ((id) this).field_c = false;
        try {
            ((id) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "id.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new gb(1.2, 2, 2, 300, 3, 7.0, 10.0, 16, 0);
        field_e = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
