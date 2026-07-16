/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static am field_d;
    static int[] field_a;
    static String field_c;
    static String field_b;
    static ko field_e;
    private static String field_z;

    public static void a(int param0) {
        int var1 = -56 % ((param0 - -40) / 62);
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static ub a(Throwable param0, String param1) {
        ub var2 = null;
        if (!(param0 instanceof ub)) {
            var2 = new ub(param0, param1);
        } else {
            var2 = (ub) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "dn.A(";
        field_b = "Notice that it is safe to stand diagonally down from a rock that wants to roll.";
        field_a = new int[8192];
        field_c = "Quit to website";
    }
}
