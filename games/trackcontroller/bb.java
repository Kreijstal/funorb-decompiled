/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static String field_a;
    static qj[] field_b;
    private static String field_z;

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        var4 = param0.indexOf(param3);
        if (param1 == -82) {
          L0: while (true) {
            if (-1 == var4) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param3.length());
              var4 = param0.indexOf(param3, var4 + param2.length());
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "bb.B(";
        field_a = "Open in popup window";
    }
}
