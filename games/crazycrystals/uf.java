/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    int field_d;
    private boolean field_j;
    static boolean[] field_i;
    int[] field_k;
    private String field_b;
    private int field_a;
    String field_h;
    int field_l;
    static db field_e;
    int field_f;
    private long field_g;
    static vf field_c;

    final int a(boolean param0) {
        if (this.field_j) {
          return 2;
        }
        if (this.field_f != 2) {
          if (~this.field_g == ~gl.field_i) {
            return 1;
          }
          if (mh.field_h == 2 &&
            m.a((byte) -126, this.field_b)) {
            return 1;
          }
          if (param0) {
            return 0;
          }
          return 56;
        }
        if (this.field_a > 0) {
          return 2;
        }
        if (~this.field_g == ~gl.field_i) {
          return 1;
        }
        if (mh.field_h == 2 &&
          m.a((byte) -126, this.field_b)) {
          return 1;
        }
        if (!param0) {
          return 56;
        }
        return 0;
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_e = null;
        if (param0 != 0) {
          uf.a(-25);
        }
    }

    uf(boolean param0) {
        this.field_a = dd.field_b;
        this.field_l = ca.field_m;
        if (!param0) {
          this.field_k = null;
        } else {
          this.field_k = so.field_f;
        }
        this.field_j = om.field_u;
        this.field_h = fb.field_b;
        this.field_d = na.field_kb;
        this.field_f = lj.field_b;
        this.field_b = md.field_s;
        this.field_g = vf.field_d;
    }

    static {
        field_i = new boolean[64];
        field_c = new vf();
    }
}
