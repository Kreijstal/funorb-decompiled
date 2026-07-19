/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static n field_e;
    static jp field_f;
    static int field_d;
    static String field_b;
    static int field_c;
    static String field_a;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_e = null;
        if (param0 > -46) {
            mc.a((byte) -35);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        ce.a(224);
        int var1 = -38 % ((46 - param0) / 52);
    }

    static {
        field_e = new n();
        field_c = 0;
        field_a = "On";
        field_b = "Accept <%0> into this game";
    }
}
