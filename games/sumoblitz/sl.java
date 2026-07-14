/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends ln implements fk {
    static boolean field_d;
    static int[] field_c;
    static String field_e;

    sl(fr param0, int param1, byte[] param2, int param3) {
        super(param0, param2, param3);
    }

    public final int a(int param0) {
        if (param0 != 2721) {
            return -30;
        }
        return 0;
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        if (param0 >= -83) {
            field_e = null;
        }
    }

    final static boolean a(byte param0, int param1) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 90) {
            return false;
        }
        for (var2 = 0; var2 < param1; var2++) {
            if (!up.field_g[var2]) {
                return false;
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{1, 1, 1, 10, 3, 1, 1, 1, 2, 1, 5, 2, 3, 5, 2, 3, 1, 2, 2, 3, 2, 3, 1, 2, 3, 2, 3, 10};
        field_d = false;
        field_e = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
