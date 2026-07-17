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
        if (!((uf) this).field_j) {
          if (((uf) this).field_f != 2) {
            if (~((uf) this).field_g == ~gl.field_i) {
              return 1;
            } else {
              L0: {
                if (mh.field_h != 2) {
                  break L0;
                } else {
                  if (!m.a((byte) -126, ((uf) this).field_b)) {
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
            if (((uf) this).field_a <= 0) {
              if (~((uf) this).field_g == ~gl.field_i) {
                return 1;
              } else {
                if (mh.field_h == 2) {
                  if (!m.a((byte) -126, ((uf) this).field_b)) {
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
        ((uf) this).field_a = dd.field_b;
        ((uf) this).field_l = ca.field_m;
        if (!param0) {
            ((uf) this).field_k = null;
        } else {
            ((uf) this).field_k = so.field_f;
        }
        ((uf) this).field_j = om.field_u;
        ((uf) this).field_h = fb.field_b;
        ((uf) this).field_d = na.field_kb;
        ((uf) this).field_f = lj.field_b;
        ((uf) this).field_b = md.field_s;
        ((uf) this).field_g = vf.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new boolean[64];
        field_c = new vf();
    }
}
