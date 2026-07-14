/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tv extends oha {
    static String field_n;
    static String field_p;
    static sna field_o;
    static String field_m;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_m = null;
        field_p = null;
        field_o = null;
        field_n = null;
    }

    tv(int param0, int param1, int param2, String param3, String param4, int param5, int param6) {
        super(2, param0, param1, param2, param5, param6);
        ((tv) this).field_k = param4;
        ((tv) this).field_f = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "View stats";
        field_p = "You need to play <%0> more rated games to unlock this option.";
        field_m = "Rating";
    }
}
