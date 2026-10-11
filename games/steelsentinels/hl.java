/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends IntrusiveNode {
    static int field_o;
    static ArticulatedPart field_v;
    static java.lang.reflect.Constructor field_u;
    static RgbSprite[] field_p;
    int[] field_s;
    static int field_q;
    static RgbSprite field_r;
    boolean field_t;

    final static String d(int param0) {
        if (cb.field_j == nj.field_ab) {
          return kf.field_o;
        }
        if (!gf.field_a.a((byte) -72)) {
          return gf.field_a.a(true);
        }
        if (nj.field_ab == jn.field_b) {
          return gf.field_a.a(true);
        }
        if (param0 >= 80) {
          return cc.field_Xb;
        }
        hl.d(-61);
        return cc.field_Xb;
    }

    public static void e(int param0) {
        field_r = null;
        if (param0 == 0) {
          field_p = null;
          field_v = null;
          field_u = null;
          return;
        }
        field_o = 50;
        field_p = null;
        field_v = null;
        field_u = null;
    }

    final static SceneWidget a(byte param0) {
        if (fj.field_f > 0) {
          return qa.field_L;
        }
        if (bd.field_c > 0) {
          return qa.field_L;
        }
        if (param0 != -66) {
          hl.a((byte) 61);
          return null;
        }
        return null;
    }

    hl() {
        this.field_t = false;
    }

    static {
        field_o = 5;
        field_p = new RgbSprite[110];
    }
}
