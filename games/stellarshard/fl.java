/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_c;
    static dd field_b;
    static int[] field_d;
    static int field_a;

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        int var4 = stellarshard.field_B;
        int var2 = param0.charAt(0);
        for (var3 = 1; var3 < param0.length(); var3++) {
            if (param0.charAt(var3) != var2) {
                return false;
            }
        }
        if (param1 != 19) {
            return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 99 % ((param0 - -57) / 50);
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading...";
        field_d = new int[8192];
    }
}
