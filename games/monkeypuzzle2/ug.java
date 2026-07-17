/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ug {
    ug field_d;
    long field_a;
    static String field_b;
    ug field_c;

    public static void b(int param0) {
        field_b = null;
    }

    final boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -3548) {
          ((ug) this).field_d = null;
          if (((ug) this).field_c != null) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (((ug) this).field_c == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void c(int param0) {
        if (null == ((ug) this).field_c) {
          return;
        } else {
          ((ug) this).field_c.field_d = ((ug) this).field_d;
          if (param0 != -19822) {
            ((ug) this).field_a = -48L;
            ((ug) this).field_d.field_c = ((ug) this).field_c;
            ((ug) this).field_d = null;
            ((ug) this).field_c = null;
            return;
          } else {
            ((ug) this).field_d.field_c = ((ug) this).field_c;
            ((ug) this).field_d = null;
            ((ug) this).field_c = null;
            return;
          }
        }
    }

    static {
    }
}
