/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uq extends oh {
    static int field_k;
    static qr field_j;
    static String field_n;
    static String field_l;
    static int field_i;
    static rl field_m;
    static String field_h;

    public static void a(int param0) {
        field_n = null;
        field_l = null;
        field_j = null;
        if (param0 < 26) {
          field_i = 77;
          field_h = null;
          field_m = null;
          return;
        } else {
          field_h = null;
          field_m = null;
          return;
        }
    }

    private uq() throws Throwable {
        throw new Error();
    }

    final static boolean a(bc param0, int param1) {
        if (param1 != 0) {
            return false;
        }
        return param0.a(-1);
    }

    final static dc a(int param0, int param1, int param2, String[] param3, vr param4) {
        dc var5 = null;
        if (param2 != -27579) {
          field_n = null;
          var5 = new dc(param1, param4, param0, param3);
          return var5;
        } else {
          var5 = new dc(param1, param4, param0, param3);
          return var5;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (gf.field_k >= param2 + param0 + param3) {
          return param3 + param0;
        } else {
          if (param1 <= -param2 + param3) {
            return -param2 + param3;
          } else {
            return gf.field_k - param2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Status Report";
        field_n = "Close";
        field_h = "Perpetual Motion";
    }
}
