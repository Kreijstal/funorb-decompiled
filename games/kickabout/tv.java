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
        field_f = null;
        field_b = null;
    }

    final int b(int param0) {
        if (!((tv) this).field_m) {
          if (2 == ((tv) this).field_c) {
            if (((tv) this).field_o <= 0) {
              if (param0 == 80) {
                if (((tv) this).field_d == dd.field_c) {
                  return 1;
                } else {
                  if (-3 == (ts.field_d ^ -1)) {
                    if (lf.a(((tv) this).field_q, param0 + 18)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                ((tv) this).field_l = null;
                if (((tv) this).field_d == dd.field_c) {
                  return 1;
                } else {
                  if (-3 == (ts.field_d ^ -1)) {
                    if (!lf.a(((tv) this).field_q, param0 + 18)) {
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
              if (((tv) this).field_d == dd.field_c) {
                return 1;
              } else {
                if (-3 == (ts.field_d ^ -1)) {
                  if (!lf.a(((tv) this).field_q, param0 + 18)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              ((tv) this).field_l = null;
              if (((tv) this).field_d == dd.field_c) {
                return 1;
              } else {
                if (-3 == (ts.field_d ^ -1)) {
                  if (!lf.a(((tv) this).field_q, param0 + 18)) {
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
        ((tv) this).field_l = vp.field_e;
        ((tv) this).field_g = ee.field_a;
        ((tv) this).field_p = cj.field_G;
        ((tv) this).field_h = sr.field_d;
        ((tv) this).field_n = oh.field_f;
        if (!param0) {
            ((tv) this).field_r = null;
        } else {
            ((tv) this).field_r = gk.field_b;
        }
        ((tv) this).field_c = jn.field_ob;
        ((tv) this).field_j = sc.field_E;
        ((tv) this).field_m = lo.field_l;
        ((tv) this).field_d = i.field_z;
        ((tv) this).field_o = ie.field_F;
        ((tv) this).field_q = hr.field_f;
    }

    tv(int param0, String param1, int param2, String param3, String param4) {
        ((tv) this).field_r = null;
        ((tv) this).field_d = 0L;
        ((tv) this).field_j = 0;
        ((tv) this).field_o = 0;
        ((tv) this).field_l = param3;
        ((tv) this).field_n = param2;
        ((tv) this).field_h = param1;
        ((tv) this).field_m = true;
        ((tv) this).field_c = param0;
        ((tv) this).field_p = 0;
        ((tv) this).field_g = param4;
        ((tv) this).field_q = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
