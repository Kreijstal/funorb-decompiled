/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;
    private static String field_z;

    final static int a(int param0, int param1, byte param2) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var4 = -64 % ((param2 - -8) / 50);
        int var3 = 0;
        while ((param1 ^ -1) < -1) {
            var3 = 1 & param0 | var3 << -191611743;
            param1--;
            param0 = param0 >>> 1;
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "bc.A(";
        field_a = 0;
    }
}
