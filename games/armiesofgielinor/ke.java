/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static boolean field_a;
    static String field_f;
    static boolean[][] field_b;
    static je field_c;
    static String field_d;
    static je field_e;

    final static void a(byte param0, p param1) {
        int var3 = 0;
        String var4 = null;
        sn var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 90) {
            field_c = null;
        }
        vi.field_a = new sn[km.field_j.length];
        String var7 = "";
        String var2 = var7;
        for (var3 = 0; var3 < km.field_j.length; var3++) {
            var4 = km.field_j[var3];
            var5 = param1.a(var4, (byte) -97, var7);
            vi.field_a[var3] = var5;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        int var1 = 77 % ((5 - param0) / 39);
        field_c = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Options";
        field_d = "The invitation has been withdrawn.";
    }
}
