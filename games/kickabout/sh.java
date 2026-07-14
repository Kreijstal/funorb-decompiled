/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static int field_d;
    static String field_b;
    static ot field_g;
    static nu field_a;
    static int[] field_f;
    static String field_e;
    static int field_c;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 != 320) {
          field_b = null;
          field_f = null;
          field_b = null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_g = null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != 70) {
            return -7;
        }
        return 320 - -(70 * param1) << 1839569968;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Create a free account to start using this feature";
        field_e = "The grid on the left is a <col=ffff00>team grid</col>, listing all the players in a squad. Hover over them<nbsp>with your mouse to see their stats, EXP and trinkets.";
    }
}
