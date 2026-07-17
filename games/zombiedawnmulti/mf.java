/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mf {
    static th field_b;
    static ip field_c;
    static String field_a;

    abstract int b(int param0);

    abstract void a(byte param0, java.awt.Component param1);

    final static void a(int param0, boolean param1) {
        int var2 = (-640 + kp.field_l) / 2;
        int var3 = b.field_d * b.field_d;
        int var4 = var3 - param0 * param0;
        mh.field_i.a(-90 + (-120 + oo.field_l) - 4, 90, 199, -(var4 * 199 / var3) + var2, -3344);
        fc.field_a.a(-120 + (oo.field_l - 4), 0, 438, var2 + (202 + 438 * var4 / var3), -3344);
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    abstract void a(java.awt.Component param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new th();
        field_c = new ip();
        field_a = "<%0> is not on your ignore list.";
    }
}
