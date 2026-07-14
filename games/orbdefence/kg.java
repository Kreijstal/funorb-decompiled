/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends ca {
    static String field_g;
    static ge field_h;
    static pc field_j;
    static int field_m;
    static int[] field_i;
    int field_k;
    static int field_f;
    static String field_l;

    public static void c(int param0) {
        field_j = null;
        field_l = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0 <= 87) {
            field_m = 122;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int[] param4, int param5, int param6) {
        if (param3 >= -73) {
          field_h = null;
          vh.field_q[param5] = param4;
          im.field_a[param5] = param0;
          vb.field_g[param5] = param1;
          wd.field_o[param5] = param6;
          ek.field_e[param5] = param2;
          return;
        } else {
          vh.field_q[param5] = param4;
          im.field_a[param5] = param0;
          vb.field_g[param5] = param1;
          wd.field_o[param5] = param6;
          ek.field_e[param5] = param2;
          return;
        }
    }

    final static void a(int param0, byte param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = param3.getGraphics();
        if (param1 != -83) {
            return;
        }
        try {
            cb.field_a.a(param2, param0, var4, true);
            var4.dispose();
        } catch (Exception exception) {
            param3.repaint();
        }
    }

    final static int a(String param0, String param1, int param2, int param3, String param4, int param5, boolean param6) {
        ee var7 = null;
        ee var8 = null;
        Object var9 = null;
        var7 = new ee(param0);
        var8 = new ee(param4);
        if (param5 != 200) {
          var9 = null;
          kg.a(-118, (byte) 38, -74, (java.awt.Canvas) null);
          return jk.a(param3, param2, var8, param1, var7, param6, -23739);
        } else {
          return jk.a(param3, param2, var8, param1, var7, param6, -23739);
        }
    }

    kg(int param0) {
        ((kg) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 200;
        field_g = "Connection lost. <%0>";
        field_l = "ELECTROSHOCK";
    }
}
