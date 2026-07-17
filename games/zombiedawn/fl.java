/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[] field_c;
    static int field_e;
    static String field_b;
    static int[] field_d;
    static int field_a;

    final static eo a(int param0, boolean param1) {
        if (param0 != 5) {
            return null;
        }
        eo var2 = new eo(true);
        var2.field_d = false;
        return var2;
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_c = new int[]{170, 150, 140, 160};
        field_e = 5;
    }
}
