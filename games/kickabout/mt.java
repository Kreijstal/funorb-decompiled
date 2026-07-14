/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mt {
    static int field_a;
    static String field_c;
    static String field_e;
    static ut field_d;
    static int[] field_f;
    static String field_b;

    final static boolean a(byte param0) {
        if (null == kc.field_g[1]) {
          if (param0 == -43) {
            if (bo.field_Cb.a("scenery", "goal_top", (byte) -10)) {
              if (!bo.field_Cb.a("scenery", "goal_bottom", (byte) -10)) {
                return false;
              } else {
                kc.field_g[1] = bg.a("scenery", bo.field_Cb, (byte) 93, "goal_top");
                kc.field_g[0] = bg.a("scenery", bo.field_Cb, (byte) 127, "goal_bottom");
                return true;
              }
            } else {
              return false;
            }
          } else {
            boolean discarded$1 = mt.a((byte) 61);
            if (bo.field_Cb.a("scenery", "goal_top", (byte) -10)) {
              if (!bo.field_Cb.a("scenery", "goal_bottom", (byte) -10)) {
                return false;
              } else {
                kc.field_g[1] = bg.a("scenery", bo.field_Cb, (byte) 93, "goal_top");
                kc.field_g[0] = bg.a("scenery", bo.field_Cb, (byte) 127, "goal_bottom");
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 1) {
          boolean discarded$2 = mt.a((byte) -66);
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The Semi Finals start in <%0> seconds...";
        field_e = "Won";
        field_b = "Rating";
        field_f = new int[7];
    }
}
