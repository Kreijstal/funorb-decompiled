/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    private boolean field_d;
    private String field_e;
    static String field_a;
    static java.awt.Font field_f;
    private boolean field_g;
    static e field_c;
    static boolean field_b;

    final boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return ((ce) this).field_d;
    }

    public static void b(boolean param0) {
        field_a = null;
        field_c = null;
        field_f = null;
    }

    final boolean a(int param0) {
        if (param0 != -15004) {
            ((ce) this).field_e = null;
            return ((ce) this).field_g;
        }
        return ((ce) this).field_g;
    }

    final String b(int param0) {
        if (param0 != 28903) {
            return null;
        }
        return ((ce) this).field_e;
    }

    ce(String param0) {
        ((ce) this).field_g = false;
        ((ce) this).field_d = false;
        try {
            ((ce) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ce.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, byte param1) {
        ((ce) this).field_d = true;
        ((ce) this).field_g = param0 ? true : false;
        if (param1 != -75) {
            ce.b(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately you are not eligible to create an account.";
        field_b = false;
    }
}
