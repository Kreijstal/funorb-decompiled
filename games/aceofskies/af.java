/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af {
    static String[] field_b;
    static String field_a;
    static vd[] field_c;
    private static String field_z;

    public static void a(int param0) {
        field_a = null;
        int var1 = -94 / ((param0 - -42) / 41);
        field_b = null;
        field_c = null;
    }

    abstract byte[] a(int param0, int param1, int param2);

    abstract byte[] b(int param0);

    abstract void a(byte param0, byte[] param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "af.E(";
        field_a = "Sound: ";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
