/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oe {
    static int[] field_a;
    static eg field_g;
    static ka[] field_d;
    static int[] field_b;
    int field_h;
    int field_i;
    static String[] field_j;
    static int field_f;
    int[] field_c;
    java.awt.Image field_e;

    public static void b(int param0) {
        field_g = null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_j = null;
        if (param0 != -15721) {
            oe.b(-127);
        }
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    final void a(int param0) {
        int var2 = 109 / ((37 - param0) / 63);
        qg.a(this.field_c, this.field_i, this.field_h);
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    static {
        field_a = new int[]{0, 0, 0};
        field_b = new int[]{31, 992, 31744};
        field_j = new String[]{"Welcome to Tor Challenge!", "Characters", "Basic controls", "Special attacks", "Combo attack", "Interface", "Coins", "Bonus crystals", "Health", "Help"};
        field_f = -1;
    }
}
