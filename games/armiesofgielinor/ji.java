/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String field_a;
    static String field_b;
    static int[] field_c;

    final static wd a(int param0, String param1) {
        if (param0 == 0) {
          if (mh.field_b != du.field_d) {
            if (mh.field_b == lm.field_d) {
              if (!param1.equals((Object) (Object) jh.field_j)) {
                jh.field_j = param1;
                mh.field_b = du.field_d;
                vl.field_k = null;
                return null;
              } else {
                mh.field_b = nb.field_i;
                return vl.field_k;
              }
            } else {
              jh.field_j = param1;
              mh.field_b = du.field_d;
              vl.field_k = null;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_c = null;
          if (mh.field_b != du.field_d) {
            if (mh.field_b == lm.field_d) {
              if (!param1.equals((Object) (Object) jh.field_j)) {
                jh.field_j = param1;
                mh.field_b = du.field_d;
                vl.field_k = null;
                return null;
              } else {
                mh.field_b = nb.field_i;
                return vl.field_k;
              }
            } else {
              jh.field_j = param1;
              mh.field_b = du.field_d;
              vl.field_k = null;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final static lk a(boolean param0) {
        if (!param0) {
          L0: {
            lk discarded$8 = ji.a(false);
            if (wi.field_f == null) {
              wi.field_f = new lk(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.field_H, -1, 2147483647, true);
              break L0;
            } else {
              break L0;
            }
          }
          return wi.field_f;
        } else {
          L1: {
            if (wi.field_f == null) {
              wi.field_f = new lk(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.field_H, -1, 2147483647, true);
              break L1;
            } else {
              break L1;
            }
          }
          return wi.field_f;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This item can only be used on your own units.";
        field_b = "Set up new game";
        field_c = new int[8192];
    }
}
