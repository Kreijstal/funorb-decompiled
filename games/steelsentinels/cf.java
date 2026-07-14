/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends ck {
    static String[] field_t;
    static int field_q;
    static String field_p;
    int field_z;
    static String field_v;
    int field_C;
    int field_E;
    static int field_D;
    static int field_o;
    static int field_x;
    static String field_s;
    int field_r;
    int field_B;
    int field_y;
    static gk[] field_u;
    static gh field_w;
    static String field_A;

    final static wk[] a(String param0, String param1, byte param2, cm param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param3.a(param1, 79);
        if (param2 >= -11) {
          boolean discarded$2 = cf.c((byte) 29);
          var5 = param3.a(var4, -32759, param0);
          return il.a(var5, 20178, var4, param3);
        } else {
          var5 = param3.a(var4, -32759, param0);
          return il.a(var5, 20178, var4, param3);
        }
    }

    final static boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        am.field_b = true;
        if (param0 < 85) {
          return true;
        } else {
          L0: {
            r.field_l = mm.a(-101) + 15000L;
            if ((uj.field_d ^ -1) != -12) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_v = null;
        field_s = null;
        field_A = null;
        field_p = null;
        field_u = null;
        int var1 = 44 % ((param0 - -35) / 34);
        field_t = null;
        field_w = null;
    }

    private cf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_q = -1;
        field_v = "Log in / Create account";
        field_s = "Player names can be up to 12 letters, numbers and underscores";
        field_p = "Status";
        ua.a(-10931, 50);
        field_A = "Ignore";
    }
}
