/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends bh {
    int field_t;
    int field_n;
    int field_r;
    static mm field_o;
    int field_p;
    int field_s;
    int field_q;

    public static void a(int param0) {
        if (param0 > -5) {
            return;
        }
        field_o = null;
    }

    final static void a(boolean param0, int param1) {
        L0: {
          if (null == kb.field_i) {
            break L0;
          } else {
            if (kb.field_i.b(-1, param0)) {
              kb.field_i = null;
              break L0;
            } else {
              if (param1 == 10891) {
                return;
              } else {
                field_o = null;
                return;
              }
            }
          }
        }
        if (param1 != 10891) {
          field_o = null;
          return;
        } else {
          return;
        }
    }

    ff(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ff) this).field_r = param1;
        ((ff) this).field_n = param3;
        ((ff) this).field_s = param4;
        ((ff) this).field_p = param2;
        ((ff) this).field_t = param5;
        ((ff) this).field_q = param0;
    }

    static {
    }
}
