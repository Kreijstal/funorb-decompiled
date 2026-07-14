/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jh {
    static vh field_a;
    static cg field_d;
    static String field_g;
    static String field_b;
    static dd field_e;
    static int field_c;
    static String field_f;

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_d = null;
        if (param0 != 21546) {
            return;
        }
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, String param1, String param2, int param3, String param4, boolean param5) {
        pn var6 = null;
        var6 = new pn(param3, param4, param0, param2, param1);
        oa.a(-63, var6);
        if (!param5) {
          field_e = null;
          return;
        } else {
          return;
        }
    }

    final static int[] a(int param0, byte param1, int[] param2) {
        if (param1 != 108) {
            jh.a(92);
            return qg.a(123, 0, param2, param0);
        }
        return qg.a(123, 0, param2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Withdraw invitation to <%0> to join this game";
        field_g = "Name";
        field_f = "Add <%0> to ignore list";
    }
}
