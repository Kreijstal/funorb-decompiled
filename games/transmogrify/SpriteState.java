/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    int field_m;
    static String field_o;
    int field_n;
    int field_u;
    static int field_v;
    int field_r;
    static int[] field_p;
    static Sprite field_t;
    static String field_q;
    int field_l;
    int field_s;
    private static String field_z;

    public static void c(byte param0) {
        field_t = null;
        field_o = null;
        field_p = null;
        field_q = null;
        int var1 = 57 / ((38 - param0) / 45);
    }

    SpriteState() {
    }

    static {
        field_z = "se.P(";
        field_o = "Names should contain a maximum of 12 characters";
        field_v = 4;
        field_p = new int[128];
        field_q = "Mine";
    }
}
