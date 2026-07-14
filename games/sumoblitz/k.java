/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_a;

    final static boolean a(ki param0, int param1, int param2, int param3) {
        byte[] var5 = param0.a((byte) 126, param1, param2);
        byte[] var4 = var5;
        if (param3 != -23046) {
            field_a = null;
            if (!(var5 != null)) {
                return false;
            }
            eg.a(param3 ^ -23291, var5);
            return true;
        }
        if (!(var5 != null)) {
            return false;
        }
        eg.a(param3 ^ -23291, var5);
        return true;
    }

    final static void a(pd param0, int param1, byte param2) {
        pl var3 = null;
        if (param2 < 93) {
          field_a = null;
          var3 = as.field_v;
          var3.g(param1, 8);
          var3.b((byte) 111, param0.field_k);
          var3.b(-10, param0.field_o);
          return;
        } else {
          var3 = as.field_v;
          var3.g(param1, 8);
          var3.b((byte) 111, param0.field_k);
          var3.b(-10, param0.field_o);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 28322) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "start game";
    }
}
