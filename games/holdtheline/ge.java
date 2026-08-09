/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static dn[] field_c;
    static String field_d;
    static String field_a;
    static int field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            ge.a(79);
            if (250 >= cf.field_q) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (250 >= cf.field_q) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -31819) {
            field_a = (String) null;
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    static {
        field_c = null;
        field_a = "Loading graphics";
        field_d = "Return to game";
    }
}
