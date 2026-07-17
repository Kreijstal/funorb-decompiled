/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static db field_d;
    int field_f;
    int field_j;
    int field_e;
    static wf field_c;
    int field_b;
    static StringBuilder field_h;
    static int field_i;
    static int[] field_g;
    static int field_a;

    final static void a(int param0) {
        if (!cm.field_n) {
          if (lc.field_e == null) {
            L0: {
              lc.field_e = pl.a(4, (byte) -74);
              if (lc.field_e.field_s) {
                hj.field_a = hj.field_a | lc.field_e.field_t;
                lc.field_e = null;
                cm.field_n = true;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (cm.field_n) {
                ni.d((byte) 116);
                hj.b((byte) -119);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (lc.field_e.field_s) {
                hj.field_a = hj.field_a | lc.field_e.field_t;
                lc.field_e = null;
                cm.field_n = true;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (cm.field_n) {
                ni.d((byte) 116);
                hj.b((byte) -119);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_c = null;
        field_d = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new db(11, 0, 1, 2);
        field_h = new StringBuilder(80);
    }
}
