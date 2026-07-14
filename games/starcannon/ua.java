/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static o field_d;
    static int field_c;
    static ge field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 128) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    final static boolean a(char param0, int param1) {
        char[] var12 = null;
        char[] var7 = null;
        char[] var6 = null;
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        char[] var14 = null;
        char[] var9 = null;
        int var5 = StarCannon.field_A;
        if (param1 < param0) {
            if (128 > param0) {
                return true;
            }
            if (160 > param0) {
                if (0 == param0) {
                    return false;
                }
                var12 = ee.field_c;
                var7 = var12;
                var6 = var7;
                var2 = var6;
                for (var3 = 0; var12.length > var3; var3++) {
                    var4 = var12[var3];
                    if (var4 == param0) {
                        return true;
                    }
                }
                return false;
            }
            if (255 < param0) {
                if (0 == param0) {
                    return false;
                }
                var14 = ee.field_c;
                var9 = var14;
                var6 = var9;
                var2 = var6;
                for (var3 = 0; var14.length > var3; var3++) {
                    var4 = var14[var3];
                    if (var4 == param0) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (160 <= param0) {
            if (255 >= param0) {
                return true;
            }
        }
        if (0 == param0) {
            return false;
        }
        char[] var16 = ee.field_c;
        char[] var11 = var16;
        var6 = var11;
        var2 = var6;
        for (var3 = 0; var16.length > var3; var3++) {
            var4 = var16[var3];
            if (var4 == param0) {
                return true;
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new o(9, 0, 4, 1);
        field_b = new ge();
        field_a = -1;
    }
}
