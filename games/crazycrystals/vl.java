/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static int field_a;
    static vp field_d;
    static String field_b;
    static String field_e;
    static am field_f;
    static String field_c;

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != -85) {
          field_b = null;
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static String a(String param0, int param1, int param2, String param3, db param4) {
        if (param2 == 4164) {
          if (!param4.a((byte) 102)) {
            return param0;
          } else {
            return param3 + " - " + param4.b(25030, param1) + "%";
          }
        } else {
          field_c = null;
          if (!param4.a((byte) 102)) {
            return param0;
          } else {
            return param3 + " - " + param4.b(25030, param1) + "%";
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading...";
        field_e = "Fullscreen";
        field_c = "If you are a member, log in to start at any level you've reached.";
    }
}
