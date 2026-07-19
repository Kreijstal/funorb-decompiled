/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bva extends vmb {
    qma[] field_f;
    static int[] field_b;
    static String field_e;
    static int field_c;
    static String field_g;
    static boolean field_d;

    public static void b(int param0) {
        if (param0 != 23008) {
            return;
        }
        field_b = null;
        field_g = null;
        field_e = null;
    }

    bva(qma[] param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bva.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
        field_g = "You have <%0> unread messages!";
        field_b = new int[8192];
        field_d = false;
        field_e = "Unpacking sound effects";
    }
}
