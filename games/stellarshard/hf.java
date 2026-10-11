/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends sk {
    static oj field_i;
    private String field_d;
    static String field_g;
    private String field_h;
    static String field_j;
    static boolean field_f;
    static sd[] field_e;

    final static void c(int param0) {
        if (ni.field_d == 0 - tc.field_p) {
          ni.field_d = ni.field_d + 1;
          if (param0 == 250) {
            return;
          }
          field_f = true;
          return;
        }
        if (-tc.field_p + 250 != ni.field_d) {
          ni.field_d = ni.field_d + 1;
          if (param0 == 250) {
            return;
          }
          field_f = true;
          return;
        }
        ni.field_d = ni.field_d + 1;
        if (param0 == 250) {
          return;
        }
        field_f = true;
    }

    final static void a(fk param0, int param1, int param2) {
        if (param1 <= 1) {
          return;
        }
        try {
          ib.field_c.b(-45, param0);
          th.a(param2, param0, 1);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, ka param1) {
        try {
          param1.a(102, this.field_h);
          param1.a(false, this.field_d);
          if (param0 != 95) {
            field_j = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.applet.Applet a(byte param0) {
        if (ac.field_c != null) {
          return ac.field_c;
        }
        if (param0 > -2) {
          field_i = (oj) null;
          return (java.applet.Applet) ((Object) bc.field_j);
        }
        return (java.applet.Applet) ((Object) bc.field_j);
    }

    public static void b(int param0) {
        if (param0 == -27159) {
          field_j = null;
          field_e = null;
          field_i = null;
          field_g = null;
          return;
        }
        hf.c(-14);
        field_j = null;
        field_e = null;
        field_i = null;
        field_g = null;
    }

    final ua a(int param0) {
        if (param0 != 160) {
          hf.c(76);
          return hc.field_s;
        }
        return hc.field_s;
    }

    hf(String param0, String param1) {
        try {
          this.field_h = param0;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, boolean param1, int param2, byte param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param1) {
          if (se.field_B[param0] > se.field_B[param2]) {
            return true;
          }
          if (se.field_B[param2] > se.field_B[param0]) {
            return false;
          }
          if (vh.field_h[param0] > vh.field_h[param2]) {
            return true;
          }
          if (vh.field_h[param2] > vh.field_h[param0]) {
            return false;
          }
          var4 = qf.field_g[param2] + wb.field_e[param2] + vc.field_f[param2];
          if (param3 == 41) {
            var5 = vc.field_f[param0] + qf.field_g[param0] + wb.field_e[param0];
            if (var5 > var4) {
              return true;
            }
            if (var5 < var4) {
              return false;
            }
            return !(param0 <= param2);
          }
          hf.b(-31);
          var5Lifetime3 = vc.field_f[param0] + qf.field_g[param0] + wb.field_e[param0];
          if (var5Lifetime3 > var4) {
            return true;
          }
          if (var5Lifetime3 < var4) {
            return false;
          }
          return !(param0 <= param2);
        }
        if (vh.field_h[param0] > vh.field_h[param2]) {
          return true;
        }
        if (vh.field_h[param0] < vh.field_h[param2]) {
          return false;
        }
        if (se.field_B[param0] > se.field_B[param2]) {
          return true;
        }
        if (se.field_B[param2] > se.field_B[param0]) {
          return false;
        }
        var4Lifetime1 = qf.field_g[param2] + wb.field_e[param2] + vc.field_f[param2];
        if (param3 == 41) {
          var5Lifetime1 = vc.field_f[param0] + qf.field_g[param0] + wb.field_e[param0];
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(param0 <= param2);
        }
        hf.b(-31);
        var5Lifetime2 = vc.field_f[param0] + qf.field_g[param0] + wb.field_e[param0];
        if (var5Lifetime2 > var4Lifetime1) {
          return true;
        }
        if (var5Lifetime2 < var4Lifetime1) {
          return false;
        }
        if (param0 <= param2) {
          return false;
        }
        return true;
    }

    static {
        field_g = "Game ending in ";
        field_j = null;
        field_i = new oj();
        field_e = new sd[1000];
    }
}
