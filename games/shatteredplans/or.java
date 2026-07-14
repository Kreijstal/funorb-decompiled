/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or {
    static String[] field_d;
    static boolean field_a;
    static int[] field_b;
    static String field_c;

    public static void b(int param0) {
        field_d = null;
        if (param0 <= 124) {
            boolean discarded$0 = or.a(-80);
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static int a(boolean param0, String param1, boolean param2) {
        if (param2) {
          if (param0) {
            return kc.field_g.c(param1);
          } else {
            return lq.field_k.c(param1);
          }
        } else {
          field_d = null;
          if (param0) {
            return kc.field_g.c(param1);
          } else {
            return lq.field_k.c(param1);
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != 250) {
            return false;
        }
        return 250 < js.field_j ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Defensive Net", "Terraforming", "Stellar Bomb", "Tannhäuser Project"};
        field_b = new int[]{2031616, 7936, 31, 2031647, 2039552, 7967, 2035471, 990991, 986911};
        field_c = "<%0> is already on your ignore list.";
    }
}
