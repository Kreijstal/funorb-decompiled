/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ac extends wp {
    static String field_F;
    private pk field_E;

    final boolean a(pk param0, byte param1) {
        if (param1 != 61) {
            return true;
        }
        return ((ac) this).field_E.a(param0, (byte) 61);
    }

    public static void d(boolean param0) {
        if (param0) {
            ac.d(true);
            field_F = null;
            return;
        }
        field_F = null;
    }

    ac(pk param0) {
        ((ac) this).field_E = param0;
    }

    static {
    }
}
