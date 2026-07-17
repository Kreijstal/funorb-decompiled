/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends br {
    static String field_i;
    static String field_f;
    static String field_m;
    static ja field_j;
    static String field_l;
    byte[] field_h;
    static int field_g;
    static String field_k;

    public static void a(int param0) {
        field_j = null;
        field_f = null;
        field_l = null;
        field_i = null;
        field_k = null;
        field_m = null;
    }

    final static void a(boolean param0, byte param1) {
        k.a((byte) 122, param0);
        if (param1 < 97) {
            field_l = null;
        }
    }

    kg(byte[] param0) {
        try {
            ((kg) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "kg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Who can join";
        field_l = "Macroing or use of bots";
        field_g = 360;
        field_k = null;
        field_i = "Add name";
        field_m = "You are on <%0>";
    }
}
