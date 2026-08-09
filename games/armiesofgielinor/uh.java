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
        String var2;
        field_c = null;
        if (param0 != 20043) {
          var2 = (String) null;
          uh.a(-68, true, (int[]) null, (int[]) null, (String) null, false, 51);
          field_a = null;
          field_b = null;
          field_f = null;
          field_e = (int[][]) null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_f = null;
          field_e = (int[][]) null;
          return;
        }
    }

    final static void a(int[] param0, int param1) {
        try {
            ro.field_lb = param0;
            int var2_int = 102 % ((69 - param1) / 54);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "uh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, int[] param2, int[] param3, String param4, boolean param5, int param6) {
        try {
            no.field_P.field_y = qn.field_l;
            no.field_P.field_v = qn.field_g;
            no.field_P.field_B = qn.field_d;
            ku.field_J.b();
            qn.b();
            dm.a(-1, -1, param2, -1, param5, param3, -1, false, 0, false, 0, param4);
            no.field_P.b();
            ku.field_J.g(param6, param0);
            if (!param1) {
                int[] var8 = (int[]) null;
                uh.a((int[]) null, -31);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "uh.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_f = new int[8192];
        field_a = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
        field_d = 500;
        field_c = "Score: <%0>";
        field_b = "Medium";
        field_e = new int[][]{new int[]{128, 144}, new int[]{80, 224}, new int[]{80, 224}, new int[]{224, 48}, new int[]{160, 80}, new int[]{96, 112}};
    }
}
