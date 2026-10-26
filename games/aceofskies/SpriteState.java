/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    int fullWidth;
    static int field_t;
    int trimX;
    int fullHeight;
    static int field_w;
    int height;
    int trimY;
    static boolean field_s;
    int width;
    static int field_o;
    private static String field_z;

    SpriteState() {
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3) {
        int var4 = -46 / ((53 - param0) / 49);
        return or.a((byte) -101, 1, param1, param3, param2);
    }

    static {
        field_z = "nl.K(";
        field_w = 0;
        field_o = -1;
    }
}
