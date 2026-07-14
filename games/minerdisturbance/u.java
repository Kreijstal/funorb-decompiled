/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static String field_b;
    static String field_a;

    final static String a(String param0, bj param1, String param2, int param3, String param4) {
        if (param1.a((byte) 105)) {
          if (param3 != -7157) {
            boolean discarded$2 = u.a(20);
            return param0 + " - " + param1.a(param4, -118) + "%";
          } else {
            return param0 + " - " + param1.a(param4, -118) + "%";
          }
        } else {
          return param2;
        }
    }

    final static int b(int param0) {
        if (param0 != -4440) {
            field_a = null;
            return t.field_c;
        }
        return t.field_c;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 < 1) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0) {
        if (param0 != 27443) {
            return true;
        }
        return g.a((byte) -128);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Cancel";
        field_a = "Create a free Account";
    }
}
