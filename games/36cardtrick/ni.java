/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static String field_b;
    static String field_e;
    static String field_a;
    static int field_d;
    static Boolean field_f;
    static tk field_c;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        if (param0 != -35) {
          field_f = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static rj a(byte param0, int param1, qk param2, int param3, da param4) {
        byte[] var5 = null;
        byte[] var6 = null;
        var6 = param2.a(param3, (byte) -115, param1);
        var5 = var6;
        if (param0 == 65) {
          if (var6 == null) {
            return null;
          } else {
            return new rj(new pb(var6), param4);
          }
        } else {
          ni.a((byte) -2);
          if (var6 == null) {
            return null;
          } else {
            return new rj(new pb(var6), param4);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Open in popup window";
        field_e = "Connection lost - attempting to reconnect";
        field_d = -1;
    }
}
