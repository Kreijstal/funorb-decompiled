/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    int field_d;
    static String field_c;
    static String field_b;
    static vi field_f;
    static String[] field_e;
    static ec field_a;
    static int field_h;
    static int[] field_g;

    final static void a(java.awt.Canvas param0, byte param1) {
        qj.a(-53, (java.awt.Component) (Object) param0);
        if (param1 < 50) {
          return;
        } else {
          L0: {
            dg.a((byte) 50, (java.awt.Component) (Object) param0);
            if (null != sc.field_e) {
              sc.field_e.a((byte) -91, (java.awt.Component) (Object) param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 12018) {
            return;
        }
        field_c = null;
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Go Back";
        field_b = "Members' Benefits";
        field_f = new vi();
        field_e = new String[]{"Loads more enemies", "Six more levels", "Two new environments", "Three more bosses", "Extra Achievements", "Fullscreen mode", "No adverts", "And more besides!"};
        field_g = new int[]{11, -1, 14, -1, 19, 24, -1, -1, -1, -1, 35, 14, 41, 44, 48, 52, 57, 63, 65, 1, 2, 3, 4, 6, 1, 1, 27, -1, 73, -1};
    }
}
