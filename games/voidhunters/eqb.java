/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eqb {
    static char[] field_a;

    final static void a(ml param0, int param1) {
        int var2 = 0;
        ml var3 = null;
        ml var4 = null;
        int var5 = VoidHunters.field_G;
        for (var2 = 0; var2 < 4; var2++) {
            var3 = new ml(29);
            var4 = new ml(32);
            var4.a(param1 ^ 14671, 2, new ml(25));
            var4.a(1, 3, new ml(25));
            var4.a(1, 4, new ml(25));
            var3.a(1, 0, var4);
            param0.a(param1 ^ 14671, var2, var3);
        }
        if (param1 != 14670) {
            field_a = null;
        }
    }

    public static void a(int param0) {
        if (param0 != 65) {
            field_a = null;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new char[64];
        for (var0 = 0; -27 < var0; var0++) {
            field_a[var0] = (char)(65 + var0);
        }
        for (var0 = 26; -53 > var0; var0++) {
            field_a[var0] = (char)(var0 + 97 - 26);
        }
        for (var0 = 52; 62 > var0; var0++) {
            field_a[var0] = (char)(-52 + (var0 + 48));
        }
        field_a[63] = (char)45;
        field_a[62] = (char)42;
    }
}
