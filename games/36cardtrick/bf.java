/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static qa field_c;
    static int field_a;
    static String field_b;
    static String[] field_d;

    public static void a(byte param0) {
        int var1 = -106 % ((-34 - param0) / 60);
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0, byte param1) {
        ej.a(true, (byte) 55, param0);
        if (param1 != -8) {
            byte[] var3 = (byte[]) null;
            byte[] discarded$0 = bf.a(116, (byte[]) null);
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        og.a(param1, 0, var3, param0, var2);
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = new qa("");
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
