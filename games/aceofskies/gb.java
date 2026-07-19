/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    int field_f;
    int field_e;
    double field_g;
    static int field_k;
    int field_d;
    int field_c;
    int field_a;
    double field_i;
    int field_b;
    double field_h;
    static long field_j;

    final al a(byte param0) {
        int var2 = 0;
        if (gh.field_j != this) {
          if (this == kk.field_N) {
            return lj.field_c[1];
          } else {
            if (sl.field_p == this) {
              return lj.field_c[2];
            } else {
              if (this != gm.field_y) {
                if (qq.field_g == this) {
                  return lj.field_c[4];
                } else {
                  var2 = -41 % ((param0 - -5) / 58);
                  if (id.field_f == this) {
                    return lj.field_c[4];
                  } else {
                    if (ju.field_k == this) {
                      return lj.field_c[5];
                    } else {
                      if (this == ro.field_u) {
                        return lj.field_c[6];
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
              } else {
                return lj.field_c[3];
              }
            }
          }
        } else {
          return lj.field_c[0];
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            return false;
        }
        return lq.a(bm.m(116), 61);
    }

    final pa[] b(int param0) {
        String discarded$3 = null;
        if (!(gh.field_j != this)) {
            return hr.field_d[0];
        }
        if (this == kk.field_N) {
            return hr.field_d[1];
        }
        if (this == sl.field_p) {
            return hr.field_d[2];
        }
        if (param0 != -32275) {
            discarded$3 = this.toString();
            if (gm.field_y == this) {
                return hr.field_d[3];
            }
            if (!(this != qq.field_g)) {
                return hr.field_d[4];
            }
            if (id.field_f == this) {
                return hr.field_d[7];
            }
            if (!(ju.field_k != this)) {
                return hr.field_d[5];
            }
            if (!(this != ro.field_u)) {
                return hr.field_d[6];
            }
            throw new RuntimeException();
        }
        if (gm.field_y == this) {
            return hr.field_d[3];
        }
        if (!(this != qq.field_g)) {
            return hr.field_d[4];
        }
        if (id.field_f == this) {
            return hr.field_d[7];
        }
        if (!(ju.field_k != this)) {
            return hr.field_d[5];
        }
        if (!(this != ro.field_u)) {
            return hr.field_d[6];
        }
        throw new RuntimeException();
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    gb(double param0, int param1, int param2, int param3, int param4, double param5, double param6, int param7, int param8) {
        this.field_a = param7;
        this.field_h = param5 / 2.0;
        this.field_f = param2;
        this.field_i = param6 / 2.0;
        this.field_c = param3;
        this.field_g = param0;
        this.field_b = param8;
        this.field_e = param4;
        this.field_d = param1;
    }

    static {
        field_k = 0;
    }
}
