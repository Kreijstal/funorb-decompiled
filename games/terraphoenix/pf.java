/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String field_d;
    static int[] field_b;
    static ci[] field_a;
    static long field_c;
    static String[] field_e;

    public static void a() {
        field_e = null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static void a(e param0, byte param1, int param2, int param3) {
        try {
            kg.field_r[76].c(param2 - 32, param3 + -64, 64);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "pf.B(" + (param0 != null ? "{...}" : "null") + ',' + 71 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Open minimap";
        field_e = new String[]{"", "", "Battle Armour", "Shielded Armour"};
    }
}
