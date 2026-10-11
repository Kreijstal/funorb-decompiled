/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static fa field_b;
    static bd field_c;
    static int[][] field_a;

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        ka.field_q = param3;
        if (param4 == -127) {
          sd.field_s = param2;
          eh.field_d = param1;
          kb.field_d = param0;
          return;
        }
        field_a = (int[][]) null;
        sd.field_s = param2;
        eh.field_d = param1;
        kb.field_d = param0;
    }

    public static void a(int param0) {
        if (param0 == 90) {
          field_b = null;
          field_c = null;
          field_a = (int[][]) null;
          return;
        }
        field_b = (fa) null;
        field_b = null;
        field_c = null;
        field_a = (int[][]) null;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          field_a = (int[][]) null;
          if (ej.field_q == this) {
            return true;
          }
          if (this != wj.field_N) {
            return this == ci.field_d ? true : false;
          }
          return true;
        }
        if (ej.field_q == this) {
          return true;
        }
        if (this == wj.field_N) {
          return true;
        }
        if (this != ci.field_d) {
          return false;
        }
        return true;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = new fa("email");
        field_a = new int[][]{new int[]{25, 40, 45, 45, 95, 70, 35, 90, 90, 60}, new int[]{60, 120, 90, 100, 90, 205, 150, 150, 130, 180}};
    }
}
