/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    static int[] field_i;
    int field_r;
    int field_j;
    int field_q;
    int field_k;
    static Sprite[] field_p;
    int field_n;
    int field_m;
    static Sprite[] field_o;
    static int field_l;
    private static String field_z;

    public static void a(byte param0) {
        field_o = null;
        field_i = null;
        if (param0 != -69) {
          SpriteState.a((byte) 11);
          field_p = null;
          return;
        }
        field_p = null;
    }

    SpriteState() {
    }

    static {
        field_z = "ik.WA(";
        field_l = 10;
    }
}
