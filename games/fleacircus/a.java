/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static vc field_e;
    static dd field_f;
    static rh field_a;
    static dd[] field_b;
    static String field_d;
    static int[] field_g;
    static String field_h;
    static String field_c;

    final static int a(int param0, int param1, byte param2) {
        int var5 = 27 / ((param2 - 22) / 37);
        int var3 = param1 >> -1864214736;
        int var4 = 65535 & param1;
        int var6 = param0 >> -1361292496;
        int var7 = 65535 & param0;
        return var3 * param0 - -(var6 * var4) - -(var4 * var7 >> -702490448);
    }

    public static void a(byte param0) {
        if (param0 < 118) {
          int discarded$2 = a.a(1, -121, (byte) -67);
          field_d = null;
          field_e = null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_h = null;
          field_a = null;
          field_g = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_b = null;
          field_c = null;
          field_f = null;
          field_h = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new vc();
        field_h = "Type your password again to make sure it's correct";
        field_c = "End Game";
    }
}
