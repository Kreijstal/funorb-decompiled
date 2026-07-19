/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tv {
    String field_h;
    int field_p;
    String field_l;
    static int field_i;
    int field_j;
    int field_c;
    String field_g;
    static String[] field_a;
    static hd field_e;
    static String field_k;
    long field_d;
    String field_q;
    boolean field_m;
    hd field_s;
    int field_o;
    int[] field_r;
    int field_n;
    static ut[] field_b;
    static int[][] field_f;

    public static void a(int param0) {
        field_a = null;
        field_k = null;
        field_e = null;
        if (param0 != 2) {
            return;
        }
        field_f = (int[][]) null;
        field_b = null;
    }

    final int b(int param0) {
        if (!this.field_m) {
          if (2 == this.field_c) {
            if (this.field_o <= 0) {
              if (param0 == 80) {
                if (this.field_d == dd.field_c) {
                  return 1;
                } else {
                  if (-3 == (ts.field_d ^ -1)) {
                    if (lf.a(this.field_q, param0 + 18)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                this.field_l = (String) null;
                if (this.field_d == dd.field_c) {
                  return 1;
                } else {
                  if (-3 == (ts.field_d ^ -1)) {
                    if (!lf.a(this.field_q, param0 + 18)) {
                      return 0;
                    } else {
                      return 1;
                    }
                  } else {
                    return 0;
                  }
                }
              }
            } else {
              return 2;
            }
          } else {
            if (param0 == 80) {
              if (this.field_d == dd.field_c) {
                return 1;
              } else {
                if (-3 == (ts.field_d ^ -1)) {
                  if (!lf.a(this.field_q, param0 + 18)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              this.field_l = (String) null;
              if (this.field_d == dd.field_c) {
                return 1;
              } else {
                if (-3 == (ts.field_d ^ -1)) {
                  if (!lf.a(this.field_q, param0 + 18)) {
                    return 0;
                  } else {
                    return 1;
                  }
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

    tv(boolean param0) {
        this.field_l = vp.field_e;
        this.field_g = ee.field_a;
        this.field_p = cj.field_G;
        this.field_h = sr.field_d;
        this.field_n = oh.field_f;
        if (!param0) {
            this.field_r = null;
        } else {
            this.field_r = gk.field_b;
        }
        this.field_c = jn.field_ob;
        this.field_j = sc.field_E;
        this.field_m = lo.field_l;
        this.field_d = i.field_z;
        this.field_o = ie.field_F;
        this.field_q = hr.field_f;
    }

    tv(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_r = null;
            this.field_d = 0L;
            this.field_j = 0;
            this.field_o = 0;
            this.field_l = param3;
            this.field_n = param2;
            this.field_h = param1;
            this.field_m = true;
            this.field_c = param0;
            this.field_p = 0;
            this.field_g = param4;
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "tv.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_k = "to return to the normal view.";
        field_f = new int[5][2];
        field_f[0][1] = 220;
        field_f[0][0] = 80;
        field_f[1][0] = 190;
        field_f[1][1] = 220;
        field_f[2][0] = 290;
        field_f[2][1] = 220;
        field_f[3][0] = 120;
        field_f[3][1] = 300;
        field_f[4][0] = 250;
        field_f[4][1] = 300;
        field_i = 0;
    }
}
