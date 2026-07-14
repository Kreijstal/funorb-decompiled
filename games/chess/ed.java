/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_a;
    static int field_b;
    static int field_c;

    final static void a(int param0, int param1, byte param2) {
        if (param2 >= -7) {
            ed.a(22, 55, (byte) 8);
        }
        pd.field_Fb = param0;
        of.field_k = param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, int param1) {
        int var3 = Chess.field_G;
        if (!(qm.a(true, param0, (byte) 94))) {
            return false;
        }
        int var2 = 0;
        if (param1 != 21257) {
            field_b = 26;
        }
        while (var2 < param0.length()) {
            if (!(gm.a(param0.charAt(var2), (byte) -68))) {
                return false;
            }
            var2++;
        }
        return true;
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -127 % ((param0 - 47) / 59);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You cannot add yourself!";
    }
}
