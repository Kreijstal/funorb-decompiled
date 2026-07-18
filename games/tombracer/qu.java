/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qu {
    static int[] field_b;
    static int[] field_d;
    static wm field_e;
    static tr field_a;
    static String field_c;

    abstract byte[] a(byte param0, int param1, int param2);

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        int var1 = -73;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static String a(int param0, int param1) {
        return " (" + (param0 <= 0 ? "+" : "-") + Math.abs(param0) + ")";
    }

    abstract void a(boolean param0, byte[] param1);

    abstract byte[] a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_d = new int[16384];
        field_b = new int[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
            field_b[var2] = (int)(Math.sin(var0 * (double)var2) * 16384.0);
            field_d[var2] = (int)(16384.0 * Math.cos((double)var2 * var0));
        }
        field_e = new wm();
        field_c = "You have unlocked some worlds that are for Members Only. To play these, become a member at FunOrb.com.";
    }
}
