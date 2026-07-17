/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static fa field_b;
    static bd field_c;
    static int[][] field_a;

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        ka.field_q = param3;
        sd.field_s = param2;
        eh.field_d = param1;
        kb.field_d = param0;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          if ((Object) (Object) ej.field_q != this) {
            if (this != (Object) (Object) wj.field_N) {
              if (this == (Object) (Object) ci.field_d) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_a = null;
          if ((Object) (Object) ej.field_q != this) {
            if (this == (Object) (Object) wj.field_N) {
              return true;
            } else {
              L0: {
                if (this != (Object) (Object) ci.field_d) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fa("email");
        field_a = new int[][]{new int[10], new int[10]};
    }
}
