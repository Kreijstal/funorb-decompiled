/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static db field_d;
    static ck field_b;
    static String field_a;
    static int[] field_c;
    static String field_e;

    final static int[] b(int param0) {
        if (param0 != 3922) {
            return null;
        }
        return new int[8];
    }

    final static void a(int param0, int param1) {
        c.field_i = th.field_c[param0];
        si.field_hb = jc.field_C[param0];
        qb.field_e = dk.field_h[param0];
        int var2 = 48 % ((-54 - param1) / 46);
    }

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param3 <= 32) {
            return -113;
        }
        return m.a(1);
    }

    final static boolean a(String param0, int param1, String param2) {
        int var3 = 0;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = 81 / ((param1 - 57) / 41);
        param2 = je.a(125, "", param2, '_');
        var4 = wa.a((byte) -117, param0);
        if (param2.indexOf(param0) == -1) {
          if (0 != (param2.indexOf(var4) ^ -1)) {
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

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 <= 8) {
          field_c = null;
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new db();
        field_a = "Passwords can only contain letters and numbers";
        field_e = "Instructions";
    }
}
