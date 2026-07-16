/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static int field_b;
    static kc[] field_a;
    static String field_c;

    public static void a(byte param0) {
        Object var2 = null;
        field_c = null;
        if (param0 >= -82) {
          var2 = null;
          boolean discarded$2 = tc.a(51, -63, -35, (qk) null);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, kc[] param1, int param2, int param3) {
        ij.field_f = new vg(param1);
        eg.field_d = param3;
        dh.field_k = param2;
        rl.a(false);
        if (param0 != -17185) {
            tc.a((byte) 82);
        }
    }

    final static boolean a(int param0, int param1, int param2, qk param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        if (param2 == 25479) {
          var5 = param3.a(param0, (byte) -115, param1);
          var4 = var5;
          if (var5 == null) {
            return false;
          } else {
            db.a(true, var5);
            return true;
          }
        } else {
          field_c = null;
          var5 = param3.a(param0, (byte) -115, param1);
          var4 = var5;
          if (var5 == null) {
            return false;
          } else {
            db.a(true, var5);
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Retry";
    }
}
