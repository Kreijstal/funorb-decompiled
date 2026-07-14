/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static String field_a;
    static int[] field_f;
    static String field_c;
    static int field_d;
    static String field_b;
    static int[][] field_e;

    public static void a(int param0) {
        Object var2 = null;
        field_c = null;
        if (param0 != 20043) {
          var2 = null;
          uh.a(-68, true, (int[]) null, (int[]) null, (String) null, false, 51);
          field_a = null;
          field_b = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static void a(int[] param0, int param1) {
        ro.field_lb = param0;
        int var2 = 102 % ((69 - param1) / 54);
    }

    final static void a(int param0, boolean param1, int[] param2, int[] param3, String param4, boolean param5, int param6) {
        no.field_P.field_y = qn.field_l;
        no.field_P.field_v = qn.field_g;
        no.field_P.field_B = qn.field_d;
        ku.field_J.b();
        qn.b();
        int discarded$20 = dm.a(-1, -1, param2, -1, param5, param3, -1, false, 0, false, 0, param4);
        no.field_P.b();
        ku.field_J.g(param6, param0);
        if (!param1) {
            Object var8 = null;
            uh.a((int[]) null, -31);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_a = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
        field_d = 500;
        field_c = "Score: <%0>";
        field_b = "Medium";
        field_e = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }
}
