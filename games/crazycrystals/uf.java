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
        if (!this.field_j) {
          if ((this.field_f ^ -1) != -3) {
            if ((this.field_g ^ -1L) == (gl.field_i ^ -1L)) {
              return 1;
            } else {
              L0: {
                if (mh.field_h != 2) {
                  break L0;
                } else {
                  if (!m.a((byte) -126, this.field_b)) {
                    break L0;
                  } else {
                    return 1;
                  }
                }
              }
              if (param0) {
                return 0;
              } else {
                return 56;
              }
            }
          } else {
            if ((this.field_a ^ -1) >= -1) {
              if ((this.field_g ^ -1L) == (gl.field_i ^ -1L)) {
                return 1;
              } else {
                if (mh.field_h == 2) {
                  if (!m.a((byte) -126, this.field_b)) {
                    if (!param0) {
                      return 56;
                    } else {
                      return 0;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  if (!param0) {
                    return 56;
                  } else {
                    return 0;
                  }
                }
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
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
