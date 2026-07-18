/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu implements dja {
    static String field_c;
    static java.awt.Canvas field_b;
    static int field_a;

    public static void a() {
        field_c = null;
        field_b = null;
    }

    public final tv a(byte param0) {
        int var2 = 36 % ((param0 - -64) / 50);
        return (tv) (Object) new mo();
    }

    final static void a(byte param0, int[] param1, ms param2) {
        param2.a(false, true, true, false, -4590, true, true);
        param1[66] = 1;
        param1[72] = -2;
        param1[58] = -2;
        param1[62] = 1;
        param1[73] = -1;
        try {
            param1[63] = 1;
            param1[69] = -1;
            param1[71] = -1;
            param1[70] = 4;
            param1[57] = -2;
            param1[9] = -1;
            param1[10] = -1;
            param1[74] = -1;
            param1[65] = 1;
            param1[68] = -1;
            param1[64] = 1;
            param1[5] = -1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "uu.D(" + 90 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_c = null;
            return (tv[]) (Object) new mo[param1];
        }
        return (tv[]) (Object) new mo[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> destroyed <%1>";
        field_a = 1;
    }
}
