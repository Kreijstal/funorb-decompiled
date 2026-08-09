/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hv {
    static String field_a;
    static hr field_b;
    static String field_e;
    static boolean field_c;
    static hr[] field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        if (param0 != -20011) {
          return false;
        } else {
          L0: {
            if (pd.field_m != this) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          L1: {


            if (mo.field_w != this) {

              stackIn_7_1 = 0;
              break L1;
            } else {

              stackIn_7_1 = 1;
              break L1;
            }
          }
          return (stackIn_4_0 | stackIn_7_1) != 0;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 != -7520) {
            hv.b(-61);
        }
    }

    static {
        field_e = "Unpacking sound effects";
        field_a = "reassign";
        field_c = false;
    }
}
