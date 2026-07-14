/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static String field_b;
    static mi field_e;
    static boolean field_a;
    static gh field_f;
    static int field_c;
    static String field_d;

    final static void a(int param0) {
        hc.a(17, 0);
        if (param0 < 111) {
            tj.a(false);
        }
    }

    final static tc a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        tc var9 = null;
        var9 = new tc(param6, param3, param1, param2, param0, param4, param7);
        ic.field_B.a(param5 ^ 18, (ck) (Object) var9);
        if (param5 != 17) {
          field_d = null;
          vh.a(param8, var9, (byte) 122);
          return var9;
        } else {
          vh.a(param8, var9, (byte) 122);
          return var9;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_d = null;
        field_b = null;
        field_f = null;
        if (!param0) {
          var2 = null;
          tc discarded$2 = tj.a(-41, 14, -14, -105, -92, 72, 120, (int[]) null, -116);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Cancel";
        field_a = false;
        field_c = 0;
        field_d = "HEALTH";
    }
}
