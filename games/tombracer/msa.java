/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class msa {
    static int field_a;
    static String field_b;

    final static boolean a(char param0, byte param1) {
        int var2 = 0;
        char[] var12 = null;
        char[] var7 = null;
        char[] var6 = null;
        char[] var2_ref_char__ = null;
        int var3 = 0;
        int var4 = 0;
        char[] var14 = null;
        char[] var9 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param0 > 0) {
            if (param0 < 128) {
                return true;
            }
            if (param0 < 160) {
                if (param0 == 0) {
                    var2 = -69 % ((param1 - 34) / 55);
                    return false;
                }
                var12 = gha.field_a;
                var7 = var12;
                var6 = var7;
                var2_ref_char__ = var6;
                for (var3 = 0; var12.length > var3; var3++) {
                    var4 = var12[var3];
                    if (param0 == var4) {
                        return true;
                    }
                }
                var2 = -69 % ((param1 - 34) / 55);
                return false;
            }
            if (param0 > 255) {
                if (param0 == 0) {
                    var2 = -69 % ((param1 - 34) / 55);
                    return false;
                }
                var14 = gha.field_a;
                var9 = var14;
                var6 = var9;
                var2_ref_char__ = var6;
                for (var3 = 0; var14.length > var3; var3++) {
                    var4 = var14[var3];
                    if (param0 == var4) {
                        return true;
                    }
                }
                var2 = -69 % ((param1 - 34) / 55);
                return false;
            }
            return true;
        }
        if (param0 >= 160) {
            if (param0 <= 255) {
                return true;
            }
        }
        if (param0 == 0) {
            var2 = -69 % ((param1 - 34) / 55);
            return false;
        }
        char[] var16 = gha.field_a;
        char[] var11 = var16;
        var6 = var11;
        var2_ref_char__ = var6;
        for (var3 = 0; var16.length > var3; var3++) {
            var4 = var16[var3];
            if (param0 == var4) {
                return true;
            }
        }
        var2 = -69 % ((param1 - 34) / 55);
        return false;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "Scarlett";
    }
}
