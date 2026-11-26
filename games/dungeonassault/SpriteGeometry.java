/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteGeometry extends DualLinkNode {
    int field_w;
    int field_A;
    static int field_C;
    static ai field_x;
    int field_y;
    static int field_D;
    static en[] field_F;
    static RgbSprite field_z;
    int field_E;
    int field_G;
    int field_v;
    private static String field_B;

    public static void clearStaticReferences(boolean param0) {
        field_z = null;
        if (!param0) {
          SpriteGeometry.clearStaticReferences(false);
          field_F = null;
          field_x = null;
          return;
        }
        field_F = null;
        field_x = null;
    }

    SpriteGeometry() {
    }

    static {
        field_B = "rd.VB(";
        field_C = -1;
        field_F = null;
    }
}
