/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static boolean field_a;
    static volatile int field_e;
    static bh field_d;
    static int[] field_c;
    static String field_b;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (!param0) {
            field_e = -85;
        }
    }

    final static String a(String param0, String param1, pf param2, byte param3, String param4) {
        if (!param2.a((byte) -36)) {
          return param1;
        } else {
          if (param3 != 51) {
            return null;
          } else {
            return param4 + " - " + param2.b(0, param0) + "%";
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_a = false;
        field_d = new bh("usename");
        field_b = "Connection lost - attempting to reconnect";
    }
}
