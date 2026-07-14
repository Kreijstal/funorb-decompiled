/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    private boolean field_f;
    static int[] field_a;
    static String[] field_d;
    static String field_c;
    private String field_b;
    private boolean field_e;

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return ((ec) this).field_e;
    }

    final static qj a(String param0, int param1, fa param2, fa param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param1 != 8192) {
          return null;
        } else {
          var5 = param3.c(param1 ^ -8193, param0);
          var6 = param3.a(-94, var5, param4);
          return nl.a(param2, param3, (byte) 90, var6, var5);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 >= -64) {
            ec.a((byte) -113);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final boolean a(int param0) {
        if (param0 > -50) {
            field_d = null;
            return ((ec) this).field_f;
        }
        return ((ec) this).field_f;
    }

    final String b(int param0) {
        if (param0 > -56) {
            return null;
        }
        return ((ec) this).field_b;
    }

    final void a(boolean param0, int param1) {
        ((ec) this).field_f = true;
        int var3 = 47 % ((29 - param1) / 33);
        ((ec) this).field_e = param0 ? true : false;
    }

    ec(String param0) {
        ((ec) this).field_f = false;
        ((ec) this).field_e = false;
        ((ec) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_c = "Change display name";
    }
}
