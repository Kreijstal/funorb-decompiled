/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static fa field_b;
    static bd field_c;
    static int[][] field_a;

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        ka.field_q = param3;
        if (param4 != -127) {
          field_a = (int[][]) null;
          sd.field_s = param2;
          eh.field_d = param1;
          kb.field_d = param0;
          return;
        } else {
          sd.field_s = param2;
          eh.field_d = param1;
          kb.field_d = param0;
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 90) {
          field_b = (fa) null;
          field_b = null;
          field_c = null;
          field_a = (int[][]) null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_a = (int[][]) null;
          return;
        }
    }

    final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        if (param0) {
          if (ej.field_q != this) {
            if (this != wj.field_N) {
              if (this == ci.field_d) {
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
          field_a = (int[][]) null;
          if (ej.field_q != this) {
            if (this == wj.field_N) {
              return true;
            } else {
              L0: {
                if (this != ci.field_d) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
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
        field_b = new fa("email");
        field_a = new int[][]{new int[]{25, 40, 45, 45, 95, 70, 35, 90, 90, 60}, new int[]{60, 120, 90, 100, 90, 205, 150, 150, 130, 180}};
    }
}
