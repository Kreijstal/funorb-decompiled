/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends fa {
    int field_p;
    boolean field_u;
    static boolean[] field_t;
    int field_s;
    int[][] field_r;
    int field_v;
    int field_m;
    static ak field_q;
    int field_n;
    int field_k;
    String[][] field_o;
    static String[][] field_l;

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != 90) {
          var2 = null;
          int discarded$2 = lc.a((aa) null, false);
          field_t = null;
          field_l = null;
          field_q = null;
          return;
        } else {
          field_t = null;
          field_l = null;
          field_q = null;
          return;
        }
    }

    final static int a(aa param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = vp.field_Ib;
        if (2 == param0.field_j) {
          if (!param0.field_a) {
            if (0 == param0.field_d) {
              if (0 == param0.field_e) {
                var2 = ib.field_i[param0.field_j];
                if (param1) {
                  field_l = null;
                  return var2;
                } else {
                  return var2;
                }
              } else {
                var2 = qp.field_P[param0.field_j];
                if (param1) {
                  field_l = null;
                  return var2;
                } else {
                  return var2;
                }
              }
            } else {
              var2 = qp.field_P[param0.field_j];
              if (param1) {
                field_l = null;
                return var2;
              } else {
                return var2;
              }
            }
          } else {
            var2 = vp.field_Ib;
            if (param1) {
              field_l = null;
              return var2;
            } else {
              return var2;
            }
          }
        } else {
          if ((param0.field_j ^ -1) == -5) {
            var2 = qp.field_P[param0.field_j];
            if (param1) {
              field_l = null;
              return var2;
            } else {
              return var2;
            }
          } else {
            if ((param0.field_k ^ -1L) == (hn.field_f ^ -1L)) {
              var2 = ib.field_i[param0.field_j];
              if (!param1) {
                return var2;
              } else {
                field_l = null;
                return var2;
              }
            } else {
              var2 = qp.field_P[param0.field_j];
              if (!param1) {
                return var2;
              } else {
                field_l = null;
                return var2;
              }
            }
          }
        }
    }

    lc() {
    }

    static {
    }
}
