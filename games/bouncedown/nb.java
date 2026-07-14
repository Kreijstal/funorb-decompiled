/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static lg field_c;
    static int field_d;
    static int field_f;
    static String[] field_h;
    static int field_g;
    static int field_a;
    static int field_e;
    static java.awt.Image field_b;

    final static int a(byte[] param0, int param1, byte param2) {
        int var3 = -15 % ((param2 - -31) / 40);
        return ib.a(param1, param0, 0, (byte) -33);
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = -8 / ((20 - param0) / 59);
        field_h = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new lg();
        field_h = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_e = 0;
        field_g = 55;
    }
}
