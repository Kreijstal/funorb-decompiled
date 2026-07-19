/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static boolean field_d;
    static int field_e;
    static String field_c;
    static sn[] field_a;
    static String field_b;
    static String field_f;

    final static void a(String param0, int param1, String param2) {
        try {
            if (!(null == qc.field_a)) {
                qc.field_a.b(true);
            }
            if (param1 != 640) {
                String var4 = (String) null;
                vi.a((String) null, -8, (String) null);
            }
            np.field_Qb = new df(param0, param2, false, true, true);
            lt.field_g.a(np.field_Qb, (byte) -77);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vi.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var1 = mj.field_c * mj.field_c;
        var2 = -(sj.field_d * sj.field_d) + var1;
        var3 = sh.field_l + var2 * (-sh.field_l + gb.field_y) / var1;
        if (param0 >= -53) {
          return;
        } else {
          ag.field_I.a(120, -20500, 640, var3, va.field_u);
          hm.a(-1, mi.field_l, 0, io.field_n, 5, gb.field_y + -24, 640);
          return;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
            return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final synchronized static long b(int param0) {
        long var1 = System.currentTimeMillis();
        int var3 = -1 / ((-3 - param0) / 38);
        if (!(var1 >= h.field_a)) {
            si.field_c = si.field_c + (-var1 + h.field_a);
        }
        h.field_a = var1;
        return si.field_c + var1;
    }

    static {
        field_f = null;
        field_c = "Lost";
        field_b = "You need a rating of <%1> to play with the current options.";
    }
}
