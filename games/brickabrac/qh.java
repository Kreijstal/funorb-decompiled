/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static int field_a;
    static mh field_j;
    static nc field_b;
    static int field_d;
    static byte[] field_h;
    static int field_f;
    static jp field_e;
    static String[] field_i;
    static jp field_c;
    static String field_g;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_c = null;
        field_i = null;
        field_g = null;
        if (param0 < 91) {
          field_c = null;
          field_h = null;
          field_b = null;
          return;
        } else {
          field_h = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0, int param1, jp param2, int param3, jp param4, int param5, int param6, int param7, jp param8, int param9) {
        param8.d((param3 * 5 >> 351781360) + ((-param8.field_x + param6) / 2 + param7), param9);
        param2.c(param7 - (-((param6 - param2.field_x) / 2) - (10 * param3 >> -2097931728)), -param2.field_z + param1 + param9 + 480);
        if (param5 < 2) {
          return;
        } else {
          param4.c((20 * param3 >> -2081740400) + param7 - -((param6 + -param4.field_x) / 2), param9 - (-param1 - 480) + -param4.field_z);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 64;
        field_h = new byte[]{(byte)4};
        field_f = 0;
        field_g = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
