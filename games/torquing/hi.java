/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    String field_a;
    int field_b;
    static sm[] field_h;
    int[] field_c;
    private long field_g;
    private int field_d;
    int field_k;
    private String field_e;
    int field_f;
    static hi[] field_j;
    private boolean field_i;

    final int a(byte param0) {
        if (param0 == -72) {
          if (((hi) this).field_i) {
            return 2;
          } else {
            if (2 == ((hi) this).field_f) {
              if (((hi) this).field_d > 0) {
                return 2;
              } else {
                if (~((hi) this).field_g == ~ke.field_b) {
                  return 1;
                } else {
                  if (cn.field_b != 2) {
                    return 0;
                  } else {
                    if (bi.a((byte) 83, ((hi) this).field_e)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  }
                }
              }
            } else {
              if (~((hi) this).field_g == ~ke.field_b) {
                return 1;
              } else {
                if (cn.field_b != 2) {
                  return 0;
                } else {
                  if (bi.a((byte) 83, ((hi) this).field_e)) {
                    return 1;
                  } else {
                    return 0;
                  }
                }
              }
            }
          }
        } else {
          ((hi) this).field_g = 0L;
          if (!((hi) this).field_i) {
            if (2 == ((hi) this).field_f) {
              if (((hi) this).field_d <= 0) {
                if (~((hi) this).field_g == ~ke.field_b) {
                  return 1;
                } else {
                  if (cn.field_b != 2) {
                    return 0;
                  } else {
                    if (bi.a((byte) 83, ((hi) this).field_e)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  }
                }
              } else {
                return 2;
              }
            } else {
              if (~((hi) this).field_g == ~ke.field_b) {
                return 1;
              } else {
                if (cn.field_b != 2) {
                  return 0;
                } else {
                  if (bi.a((byte) 83, ((hi) this).field_e)) {
                    return 1;
                  } else {
                    return 0;
                  }
                }
              }
            }
          } else {
            return 2;
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_h = null;
    }

    hi(boolean param0) {
        ((hi) this).field_b = bg.field_n;
        ((hi) this).field_k = oh.field_b;
        ((hi) this).field_e = dg.field_m;
        ((hi) this).field_f = n.field_u;
        ((hi) this).field_d = hh.field_a;
        ((hi) this).field_i = fd.field_a;
        if (param0) {
            ((hi) this).field_c = md.field_a;
        } else {
            ((hi) this).field_c = null;
        }
        ((hi) this).field_g = pm.field_r;
        ((hi) this).field_a = np.field_m;
    }

    static {
    }
}
