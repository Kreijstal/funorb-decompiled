/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static t field_a;
    static int[] field_c;
    static kn field_b;

    final static boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0 == 38) {
          if (10 <= op.field_i) {
            if (kb.field_h) {
              return false;
            } else {
              L0: {
                if (oo.a(16158)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          mk.a(true);
          if (10 <= op.field_i) {
            if (kb.field_h) {
              return false;
            } else {
              L1: {
                if (oo.a(16158)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(boolean param0) {
        v.field_j = dd.field_b + cl.field_b + ti.field_f + cl.field_b + mb.field_a;
        if (!param0) {
            field_b = (kn) null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 < 73) {
            mk.a((byte) -45);
        }
    }

    static {
    }
}
