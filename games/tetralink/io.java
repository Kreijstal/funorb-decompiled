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
          if (lc.field_e != null) {
            L0: {
              if (lc.field_e.field_s) {
                hj.field_a = hj.field_a | lc.field_e.field_t;
                lc.field_e = null;
                cm.field_n = true;
                break L0;
              } else {
                break L0;
              }
            }
            if (param0 != 4) {
              L1: {
                field_g = (int[]) null;
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
                if (cm.field_n) {
                  ni.d((byte) 116);
                  hj.b((byte) -119);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            L3: {
              lc.field_e = pl.a(4, (byte) -74);
              if (lc.field_e.field_s) {
                hj.field_a = hj.field_a | lc.field_e.field_t;
                lc.field_e = null;
                cm.field_n = true;
                break L3;
              } else {
                break L3;
              }
            }
            if (param0 == 4) {
              L4: {
                if (cm.field_n) {
                  ni.d((byte) 116);
                  hj.b((byte) -119);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                field_g = (int[]) null;
                if (cm.field_n) {
                  ni.d((byte) 116);
                  hj.b((byte) -119);
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_h = null;
        field_c = null;
        field_d = null;
        field_g = null;
    }

    static {
        field_d = new db(11, 0, 1, 2);
        field_h = new StringBuilder(80);
    }
}
