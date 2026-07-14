/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static String field_b;
    static int field_c;
    static int[] field_a;
    static String field_d;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 != -13) {
            field_c = 58;
        }
    }

    final static km a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, e param8, int param9, int param10, int param11, int param12) {
        km var13 = null;
        var13 = new km(0L, (km) null);
        var13.field_vb = wa.a((byte) 60, param11, param3);
        var13.field_x = wa.a((byte) -111, param6, param4);
        var13.field_T = wa.a((byte) 37, param7, param2);
        if (param1 != -4841) {
          return null;
        } else {
          var13.field_cb = wa.a((byte) -89, param0, param12);
          var13.field_L = wa.a((byte) -86, param9, param10);
          var13.field_E = param5;
          var13.field_C = param8;
          return var13;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Accept <%0> into this game";
        field_d = "Toggle fullscreen mode";
    }
}
