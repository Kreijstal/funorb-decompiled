/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String field_d;
    static int[] field_b;
    static ci[] field_a;
    static long field_c;
    static String[] field_e;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0 != 6650) {
            field_d = (String) null;
        }
    }

    final static void a(e param0, byte param1, int param2, int param3) {
        try {
            if (param1 != 71) {
                pf.a(-67);
            }
            kg.field_r[76].c(param2 - 32, param3 + -64, 64);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "pf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_d = "Open minimap";
        field_e = new String[]{"", "", "Battle Armour", "Shielded Armour"};
    }
}
