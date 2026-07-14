/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kmb {
    static String field_b;
    static String field_e;
    static boolean field_c;
    static int field_a;
    static int field_f;
    static String field_d;

    final static void a(String param0, int param1) {
        if (param1 == 18700) {
          if (di.field_l != null) {
            di.field_l.a(dpa.field_p, param1 ^ -17690, param0);
            return;
          } else {
            return;
          }
        } else {
          kmb.a(9);
          if (di.field_l == null) {
            return;
          } else {
            di.field_l.a(dpa.field_p, param1 ^ -17690, param0);
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 32768) {
          field_f = 35;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Toggle debug mode";
        field_c = false;
        field_b = "Mosquito chassis";
        field_d = "Waiting for players...";
        field_f = 32768;
    }
}
