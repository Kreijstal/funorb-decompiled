/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends l {
    static mk field_h;
    static ng field_g;
    static int[] field_f;
    static ng field_e;

    final l a(int param0) {
        jj.field_b = jj.field_b + 16;
        if (param0 != -2) {
          this.a(-85);
          if (jj.field_b >= 0) {
            jj.field_b = 0;
            return (l) ((Object) new o(60, !vh.field_a ? new gj() : new sm()));
          }
          return (l) (this);
        }
        if (jj.field_b >= 0) {
          jj.field_b = 0;
          return (l) ((Object) new o(60, !vh.field_a ? new gj() : new sm()));
        }
        return (l) (this);
    }

    ek() {
    }

    final l b(byte param0) {
        if (param0 != -90) {
          this.b((byte) 103);
          return (l) ((Object) new gj());
        }
        return (l) ((Object) new gj());
    }

    public static void b(int param0) {
        field_f = null;
        field_g = null;
        field_e = null;
        field_h = null;
        if (param0 != 16) {
          ek.b(19);
        }
    }

    static {
        field_f = new int[]{65344, 16744640, 4227327};
        field_h = new mk();
    }
}
