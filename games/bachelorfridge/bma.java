/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bma extends cia {
    static int field_u;
    int field_r;
    static String field_t;
    int field_v;
    int field_s;

    bma(int param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2);
        ((bma) this).field_m = 0;
        ((bma) this).field_l = 0;
        ((bma) this).field_s = param4;
        ((bma) this).field_r = 1000;
        ((bma) this).field_v = param3;
    }

    public static void d(byte param0) {
        field_t = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
