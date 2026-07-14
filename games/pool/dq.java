/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String[] field_j;
    static int[] field_i;
    static dd[] field_e;
    static String field_c;
    static tm field_a;
    static long[] field_d;
    static lr field_f;
    static dd field_k;
    static String field_b;
    static String field_g;
    static vb field_h;

    public static void a(byte param0) {
        Object var2 = null;
        field_k = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_h = null;
        if (param0 != 80) {
          var2 = null;
          int[] discarded$2 = dq.a((byte) 23, (int[]) null);
          field_d = null;
          field_c = null;
          field_j = null;
          field_a = null;
          field_i = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_j = null;
          field_a = null;
          field_i = null;
          field_e = null;
          return;
        }
    }

    final static int[] a(byte param0, int[] param1) {
        param1[10] = -param1[10];
        param1[1] = -param1[1];
        param1[9] = -param1[9];
        param1[4] = -param1[4];
        param1[0] = -param1[0];
        param1[7] = -param1[7];
        param1[6] = -param1[6];
        int var2 = 24 % ((param0 - -61) / 54);
        param1[3] = -param1[3];
        return param1;
    }

    final static dd a(int param0, int param1, String param2) {
        dd var3 = new dd(4 + mc.field_e.b(param2), mc.field_e.field_C - (-mc.field_e.field_w + -4));
        int[] var4 = new int[4];
        int[] var5 = qh.field_d;
        int var6 = qh.field_l;
        int var7 = qh.field_f;
        qh.a(var4);
        var3.e();
        mc.field_e.d(param2, 2, mc.field_e.field_C - -2, param0, -1);
        var3.e(4144959);
        var3.e(65793);
        qh.a(var5, var6, var7);
        qh.b(var4);
        var3.field_y = var3.field_A;
        var3.field_w = var3.field_z;
        dd var8 = var3;
        var3.field_B = 0;
        var8.field_G = param1;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new long[1000];
        field_b = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_c = "<%0> is not a member, and cannot play with the current options.";
        field_g = "Stripes";
    }
}
