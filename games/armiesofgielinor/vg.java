/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends IntrusiveNode {
    static int field_p;
    static RgbSprite[] field_q;
    byte[] field_s;
    static String field_t;
    static String field_k;
    static int[] field_r;
    static String field_o;
    static boolean field_m;
    static String field_l;
    boolean field_n;

    final static boolean a(int param0) {
        if (param0 != 10) {
          vg.a((byte) 89);
          if (Spell.field_d == null) {
            return iu.field_h ? true : false;
          }
          return true;
        }
        if (Spell.field_d != null) {
          return true;
        }
        if (!iu.field_h) {
          return false;
        }
        return true;
    }

    public static void a(byte param0) {
        if (param0 < 31) {
          return;
        }
        field_t = null;
        field_o = null;
        field_k = null;
        field_l = null;
        field_r = null;
        field_q = null;
    }

    vg() {
    }

    static {
        field_k = "Objective";
        field_o = "This unit has already moved.";
        field_r = new int[]{14, 15, 16, 13, 10, 12, 11, 14, 14, 14, 15, 14, 16, 14, 14, 16};
        field_l = "Armies Expansion";
        field_t = "This ground is producing <%0> Mana per turn";
        field_m = false;
    }
}
