/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hna {
    static fia field_a;
    short field_h;
    short field_i;
    short field_b;
    int field_f;
    byte field_g;
    boolean field_d;
    byte field_c;
    int field_j;
    static Object field_e;

    public static void a(int param0) {
        if (param0 <= 115) {
            hna.a(-38);
            field_a = null;
            field_e = null;
            return;
        }
        field_a = null;
        field_e = null;
    }

    hna(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, boolean param9, int param10) {
        ((hna) this).field_d = param9 ? true : false;
        ((hna) this).field_b = (short)param5;
        ((hna) this).field_c = (byte)param7;
        ((hna) this).field_i = (short)param4;
        ((hna) this).field_g = (byte)param8;
        ((hna) this).field_f = param10;
        ((hna) this).field_j = param0;
        ((hna) this).field_h = (short)param6;
    }

    static {
    }
}
