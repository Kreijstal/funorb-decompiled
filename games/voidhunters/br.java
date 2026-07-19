/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends ksa {
    int field_e;
    static lkb field_f;
    int[] field_d;

    private br() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        if (!param0) {
            br.a(true);
            field_f = null;
            return;
        }
        field_f = null;
    }

    static {
        field_f = new lkb();
    }
}
