/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oib {
    static String field_b;
    static llb field_a;
    static int field_c;
    private static String field_z;

    public static void a(int param0) {
        field_a = null;
        if (param0 <= 119) {
            return;
        }
        field_b = null;
    }

    abstract dka a(byte param0);

    abstract void a(ds param0, int param1);

    static {
        field_z = "oib.D(";
        field_b = "Destroy the enemy's base before they destroy yours!";
        field_c = 0;
    }
}
