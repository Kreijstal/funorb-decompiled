/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    private String field_f;
    static th field_a;
    static String field_c;
    static ul field_b;
    static boolean field_e;
    static int field_d;

    final static af[] a(int param0, ga param1) {
        int var2 = 0;
        int var3 = 0;
        af[] var4 = null;
        int var5 = 0;
        af var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = param1.h(8, 14862);
        if (0 >= var2) {
          L0: {
            if (param0 == 30816) {
              break L0;
            } else {
              var8 = null;
              bm discarded$158 = bo.a((byte[]) null, 106);
              break L0;
            }
          }
          var3 = param1.h(12, 14862);
          var4 = new af[var3];
          var5 = 0;
          L1: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (!fq.a(68, param1)) {
                var6 = param1.h(dq.b(-1 + var5, param0 + -30800), param0 ^ 17006);
                var4[var5] = var4[var6];
                var5++;
                continue L1;
              } else {
                var6_ref = new af();
                int discarded$159 = param1.h(24, 14862);
                int discarded$160 = param1.h(24, 14862);
                var6_ref.field_f = param1.h(24, 14862);
                int discarded$161 = param1.h(9, param0 ^ 17006);
                int discarded$162 = param1.h(12, 14862);
                int discarded$163 = param1.h(12, 14862);
                int discarded$164 = param1.h(12, 14862);
                var4[var5] = var6_ref;
                var5++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        dc.a(31536000L, param1, "jagex-last-login-method", -120, ((bo) this).field_f);
        if (param0 > -63) {
            field_e = false;
        }
    }

    final static void a(int param0, int param1, int param2, String[] param3, int param4, java.applet.Applet param5) {
        int var7 = 0;
        int var8 = ZombieDawnMulti.field_E ? 1 : 0;
        ql.field_e = param5.getParameter("overxgames");
        if (ql.field_e == null) {
            ql.field_e = "0";
        }
        eo.field_b = param5.getParameter("overxachievements");
        if (!(eo.field_b != null)) {
            eo.field_b = "0";
        }
        String var6 = param5.getParameter("currency");
        if (var6 == null) {
            hj.field_f = 2;
        } else {
            if (!ti.a((byte) -120, (CharSequence) (Object) var6)) {
                hj.field_f = 2;
            } else {
                hj.field_f = md.a((CharSequence) (Object) var6, param2 ^ -9159);
            }
        }
        hk.field_e = param0;
        pf.field_c = param4;
        gg.field_c = param1;
        ao.field_h = new ja[param3.length];
        for (var7 = param2; var7 < param3.length; var7++) {
            ao.field_h[var7] = new ja(317, 34);
        }
        nj.field_a = param3;
    }

    final static void b(int param0) {
        sp.c(param0 + -4);
        fb.a(param0, 65);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 6) {
            bo.a(-72);
        }
        field_c = null;
    }

    final static bm a(byte[] param0, int param1) {
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 != 24) {
            field_a = null;
        }
        int var2 = 0;
        byte[] var10 = new byte[param0.length - -24];
        byte[] var9 = var10;
        byte[] var8 = var9;
        byte[] var7 = var8;
        byte[] var3 = var7;
        for (var2 = 0; -5 < (var2 ^ -1); var2++) {
            br.a(var2, var3, -85, re.a(param0, var2, (byte) 112));
        }
        var2++;
        int var4 = re.a(param0, var2, (byte) 97);
        var2++;
        int var5 = re.a(param0, var2, (byte) 78);
        br.a(4, var10, -116, var4);
        br.a(5, var10, -88, var5);
        br.a(6, var10, -74, var4);
        br.a(7, var10, -79, var5);
        br.a(8, var10, -91, var4);
        br.a(9, var10, param1 ^ -88, var5);
        br.a(10, var10, -111, var4);
        br.a(11, var10, -85, var5);
        for (var2 = 6; param0.length / 4 > var2; var2++) {
            br.a(6 + var2, var3, -111, re.a(param0, var2, (byte) 112));
        }
        return no.a((byte) 104, var10);
    }

    final boolean a(String param0, byte param1) {
        int var3 = 89 % ((param1 - 10) / 32);
        return ((bo) this).field_f.equals((Object) (Object) param0);
    }

    bo(String param0) {
        ((bo) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "RATING";
        field_a = new th();
        field_e = true;
        field_d = 0;
    }
}
