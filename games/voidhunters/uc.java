/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static String field_a;

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        field_a = null;
    }

    final static boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        boolean[] var5 = qd.field_a;
        boolean[] var1_ref_boolean__ = var5;
        for (var2 = 0; var2 < var5.length; var2++) {
            var3 = var5[var2] ? 1 : 0;
            if (var3 != 0) {
                return true;
            }
        }
        int var1 = 15 / ((param0 - -54) / 33);
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Name is available";
    }
}
