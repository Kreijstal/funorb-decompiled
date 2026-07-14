/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_f;
    static int field_a;
    static int[] field_c;
    static int[] field_b;
    static qh field_d;
    static String field_e;

    final static void a(byte param0) {
        int var2 = 0;
        nj var4 = null;
        nj var4_ref = null;
        var2 = 78 % ((-69 - param0) / 46);
        var4 = (nj) (Object) pb.field_t.g(0);
        var4_ref = var4;
        if (var4_ref != null) {
          eh.field_c = 480;
          kj.field_J = 0;
          jf.field_c = 72 + dd.field_G.c(pg.field_a[var4_ref.field_h], 100);
          tl.field_h = 30 * dd.field_G.b(pg.field_a[var4_ref.field_h], 100) + 30;
          if (62 <= tl.field_h) {
            return;
          } else {
            tl.field_h = 62;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_d = null;
        field_b = null;
        if (!param0) {
          var2 = null;
          String discarded$2 = gf.a((String) null, (rh) null, (String) null, (String) null, true);
          field_c = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static void a(ja param0, int param1, float param2) {
        float var3 = 0.0f;
        float var4 = 0.0f;
        Object var5 = null;
        var3 = -320.0f + param0.field_o;
        var4 = param0.field_v - 240.0f;
        ng.field_G = (int)(0.5 + (Math.cos((double)param2) * (double)var3 - Math.sin((double)param2) * (double)var4 + 320.0));
        if (param1 != -1232328029) {
          var5 = null;
          gf.a((java.applet.Applet) null, 60);
          td.field_E = (int)(240.0 + (Math.sin((double)param2) * (double)var3 + (double)var4 * Math.cos((double)param2)) + 0.5);
          vf.field_L.e();
          vb.c();
          param0.field_J.b(param0.field_J.field_s << 1517196419, param0.field_J.field_o << -1232328029, vf.field_L.field_s << -377933565, vf.field_L.field_o << -799156413, (int)(65535.0 * ((double)(-param2 + param0.field_u) / 6.283185307179586)), 4096);
          sh.field_y.a(255);
          return;
        } else {
          td.field_E = (int)(240.0 + (Math.sin((double)param2) * (double)var3 + (double)var4 * Math.cos((double)param2)) + 0.5);
          vf.field_L.e();
          vb.c();
          param0.field_J.b(param0.field_J.field_s << 1517196419, param0.field_J.field_o << -1232328029, vf.field_L.field_s << -377933565, vf.field_L.field_o << -799156413, (int)(65535.0 * ((double)(-param2 + param0.field_u) / 6.283185307179586)), 4096);
          sh.field_y.a(255);
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 62) {
                field_f = 11;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(wf.a(var2, 102, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        pk var2 = null;
        if (param1 < 28) {
          field_e = null;
          var2 = fj.field_q;
          var2.a(param0, (byte) -103);
          var2.d((byte) 127, 1);
          var2.d((byte) -20, 0);
          return;
        } else {
          var2 = fj.field_q;
          var2.a(param0, (byte) -103);
          var2.d((byte) 127, 1);
          var2.d((byte) -20, 0);
          return;
        }
    }

    final static String a(String param0, rh param1, String param2, String param3, boolean param4) {
        if (!param4) {
            field_b = null;
            if (!(param1.a(0))) {
                return param0;
            }
            return param3 + " - " + param1.a(0, param2) + "%";
        }
        if (!(param1.a(0))) {
            return param0;
        }
        return param3 + " - " + param1.a(0, param2) + "%";
    }

    final static String a(int param0) {
        if (param0 != 240) {
            field_b = null;
            return v.field_e;
        }
        return v.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_c = new int[128];
        field_a = 0;
        field_b = new int[8192];
        field_e = "This password contains your Player Name, and would be easy to guess";
    }
}
