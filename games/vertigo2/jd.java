/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_a;
    static String field_b;
    static String field_c;
    static int field_d;

    final static qj a(boolean param0) {
        String var1 = hr.h(-101);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        int discarded$0 = -119;
        return new qj(hr.h(-104), wa.b());
    }

    public static void a() {
        field_a = null;
        field_c = null;
        int var1 = -1;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Suggested names: ";
        field_b = "Quit to website";
        field_c = "Respawning in <%0>";
    }
}
