/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_b;
    static String field_a;
    static String field_c;
    static boolean field_d;

    final static void a(long param0, byte param1) {
        int var3 = 0;
        if (param0 <= 0L) {
          return;
        } else {
          var3 = 19 % ((-39 - param1) / 53);
          if (param0 % 10L == 0L) {
            fe.a(-1L + param0, -95);
            fe.a(1L, -120);
            return;
          } else {
            fe.a(param0, -74);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 80;
        field_a = "Full";
        field_c = "Send private message to <%0>";
    }
}
