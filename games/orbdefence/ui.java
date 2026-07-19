/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends RuntimeException {
    String field_d;
    static int[][] field_a;
    static pf field_b;
    Throwable field_c;
    static String field_e;
    private static String field_z;

    public static void a(int param0) {
        if (param0 != -10013) {
          field_b = (pf) null;
          field_a = (int[][]) null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = (int[][]) null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    ui(Throwable param0, String param1) {
        this.field_d = param1;
        this.field_c = param0;
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            field_b = (pf) null;
            if (mg.field_m != tg.field_c) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (mg.field_m != tg.field_c) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_z = "ui.B(";
        field_a = new int[][]{new int[]{10, 10, 15, 15, 30}, new int[]{15, 20, 25, 30, 40}, new int[]{30, 45, 60, 90, 120}, new int[]{40, 75, 100, 150, 200}, new int[]{120, 120, 120, 120, 120}, new int[]{40, 75, 100, 150, 200}, new int[]{10, 10, 10, 10, 10}};
        field_e = "Orb Defence";
    }
}
