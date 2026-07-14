/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr extends oh {
    static String field_l;
    int field_j;
    int field_i;
    int field_k;
    static qr field_h;

    final static void a(String param0, int param1, String param2) {
        uq.field_m.a(param2, 27275, param0);
        if (param1 != 1904) {
            Object var4 = null;
            jr.a((String) null, 27, (String) null);
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_h = null;
        if (param0 != 1885) {
            jr.a(97);
        }
    }

    private jr() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
