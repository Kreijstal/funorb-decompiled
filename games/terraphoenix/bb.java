/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    String field_c;
    fa field_a;
    String field_b;
    int field_e;
    static long[] field_f;
    static String field_h;
    String field_g;
    static int field_d;

    final static int a(byte param0, boolean param1, String param2) {
        if (param0 != 87) {
            return 48;
        }
        if (!param1) {
            return da.field_h.b(param2);
        }
        return qk.field_a.b(param2);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        var3 = 0;
        var4 = jh.field_m;
        L0: while (true) {
          if (var3 >= rb.field_d.length) {
            L1: {
              if (param0 <= -24) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            return -1;
          } else {
            var5 = f.field_a[var3];
            if (var5 < 0) {
              var4 = var4 + jm.field_b;
              var3++;
              continue L0;
            } else {
              var6 = bb.a((byte) 87, true, rb.field_d[var3]);
              var7 = -(var6 >> -145841279) + nd.field_r;
              var4 = var4 + hi.field_ab;
              if (gb.a(var7 - se.field_j, var4, param2, (byte) 76, param1, var6 + (se.field_j << -1000359743), (dc.field_b << -205399423) + lm.field_d)) {
                return var5;
              } else {
                var4 = var4 + (hi.field_ab + ((dc.field_b << -1679922975) - -lm.field_d));
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        if (param0 != -1) {
            int discarded$0 = bb.a(97, 79, 46);
        }
    }

    final static void a(fa param0, int param1, int param2, vg param3) {
        uf.field_e = uc.j((byte) -127) * param2 / 1000;
        ee.a((byte) 51, param0);
        qe.a(-28664, param0);
        if (param1 >= -60) {
            bb.a(2);
        }
        ik.a(param0, (byte) 100);
        cg.f((byte) -75);
        vc.a(true);
        kf.field_f = 0 + -uf.field_e;
    }

    final static void b(int param0) {
        jg.field_kb.field_i = 0;
        if (param0 != 3287) {
            Object var2 = null;
            bb.a((fa) null, 113, -67, (vg) null);
        }
        jg.field_kb.field_l = 0;
    }

    final static java.net.URL a(byte param0, java.net.URL param1, java.applet.Applet param2) {
        String var3 = null;
        String var4 = null;
        if (param0 < 105) {
            bb.b(96);
        }
        if (null != va.field_g) {
            if (!va.field_g.equals((Object) (Object) param2.getParameter("settings"))) {
                var3 = va.field_g;
                var4 = var3;
                var4 = var3;
            }
        }
        if (null != hb.field_o) {
            if (!(hb.field_o.equals((Object) (Object) param2.getParameter("session")))) {
                var4 = hb.field_o;
            }
        }
        return wl.a(param1, var4, var3, false, -1);
    }

    private bb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "MHX-3";
        field_f = new long[32];
    }
}
