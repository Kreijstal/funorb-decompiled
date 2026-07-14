/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    String field_g;
    static String field_c;
    boolean field_e;
    String field_b;
    static boolean field_f;
    static hj[] field_h;
    static String field_a;
    static String field_d;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param1 = ua.a((byte) 60, (char)param2, param1, "");
        var3 = hc.a(param0, (byte) -92);
        if (-1 == param1.indexOf(param0)) {
          if (0 != (param1.indexOf(var3) ^ -1)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    final static hj[] a(int param0, int param1, gn param2, int param3) {
        if (param0 == -1) {
          if (!qg.a(param3, param1, (byte) -27, param2)) {
            return null;
          } else {
            return ei.a(61);
          }
        } else {
          jc.a((byte) 44);
          if (!qg.a(param3, param1, (byte) -27, param2)) {
            return null;
          } else {
            return ei.a(61);
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_h = null;
        field_d = null;
        field_a = null;
        if (param0 != 5) {
            Object var2 = null;
            hj[] discarded$0 = jc.a(95, -8, (gn) null, 100);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You have 1 unread message!";
        field_a = "Select Vehicle to Start";
        field_d = "All";
    }
}
