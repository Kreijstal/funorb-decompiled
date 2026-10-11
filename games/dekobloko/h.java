/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static String field_e;
    static String field_a;
    static String field_c;
    static String field_g;
    static vj field_b;
    static String field_f;
    static ke field_d;

    final static void a(int param0) {
        int var1 = -63 % ((param0 + 6) / 38);
        kk.field_n = kk.field_n + 1;
        if (kk.field_n >= 140) {
          kk.field_n = 0;
          cb.b((byte) 71);
          if (0 == kk.field_n % 20) {
            cg.a(true);
            return;
          }
          return;
        }
        cb.b((byte) 71);
        if (0 != kk.field_n % 20) {
          return;
        }
        cg.a(true);
    }

    final static void a(byte param0) {
        if (param0 != 11) {
          return;
        }
        wg.field_i = ik.a(4);
        af.field_d = 0;
    }

    final static void a(int param0, boolean param1) {
        fl.a(130, 256, 16694016, bj.field_c, param0 + 82, w.field_kb);
        int var2 = 1 == kd.field_p ? 140 : 145;
        fb.field_c[0][1].c(82 + param0, var2, 18, 18);
        var2 = var2 + ((kd.field_p != 1 ? 16 : 8) + 16 * ga.a(198, 0, var2, rf.field_i, 16, 64, 16777215, se.field_S, (byte) -125, 0, 110 + param0));
        fb.field_c[0][2].c(param0 + 108, var2, 18, 18);
        fb.field_c[0][2].c(param0 + 108, var2 + 18, 18, 18);
        fb.field_c[0][2].c(108 + param0, var2 + 36, 18, 18);
        fb.field_c[0][2].c(param0 + 126, 36 + var2, 18, 18);
        ma.field_K.c(156 + param0, 10 + var2);
        cg.a(0, 2, 6, 230 + param0, 36 + var2, 3, -2);
        cg.a(0, 2, 12, param0 + 230, var2 + 18, 3, -1);
        cg.a(0, 2, 8, param0 + 230, var2, 3, -1);
        cg.a(0, 2, 1, param0 + 248, var2 + 36, 2, -2);
        var2 = var2 + (54 + (kd.field_p == 1 ? 8 : 16));
        fb.field_c[3][1].c(82 + param0, var2, 18, 18);
        var2 = var2 + ga.a(140, 0, var2, rk.field_N, 16, 64, 16777215, se.field_S, (byte) -127, 0, 110 + param0) * 16;
        wa.a(gi.field_c, nf.field_e, var2 - (90 + (kd.field_p != 1 ? 0 : 16)), param0 + 242, -1, 0, kk.field_n);
        hk.g(309 + param0, 117, 242, 263172);
        hk.g(param0 + 310, 117, 242, 6316128);
        fl.a(130, 256, 16694016, kc.field_q, 322 + param0, w.field_kb);
        ga.a(120, 0, 145, di.field_D, 16, 64, 16777215, se.field_S, (byte) -127, 0, param0 + 320);
        aj.field_c.c(455 + param0, 123);
        if (!param1) {
          fl.a(240, 256, 16694016, fm.field_c, 322 + param0, w.field_kb);
          ga.a(120, 0, 255, ah.field_g, 16, 64, 16777215, se.field_S, (byte) -127, 0, 320 + param0);
          li.field_i.c(465 + param0, 235);
          return;
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != -122) {
          field_f = (String) null;
          return qg.field_f[param0 & 2047];
        }
        return qg.field_f[param0 & 2047];
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        field_g = null;
        field_c = null;
        field_f = null;
        if (param0 <= -127) {
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(boolean param0) {
        boolean stackIn_7_0 = false;
        if (param0) {
          return true;
        }
        if (ph.n(-30146)) {
          stackIn_7_0 = true;
        } else {
          if (eh.field_a <= 0) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    final static void a(ke param0, byte param1) {
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ab.e(-28199) != 0) {
            param0 = null;
          }
          if (kf.field_G != param0 &&
            kf.field_G.field_o > 0) {
            kf.field_G.field_o = kf.field_G.field_o - 1;
          }
          if (pd.field_d != null &&
            param0 != pd.field_d &&
            0 < pd.field_d.field_o) {
            pd.field_d.field_o = pd.field_d.field_o - 1;
          }
          if (field_d != null &&
            field_d != param0 &&
            0 < field_d.field_o) {
            field_d.field_o = field_d.field_o - 1;
          }
          if (null != cl.field_B &&
            cl.field_B != param0 &&
            cl.field_B.field_o > 0) {
            cl.field_B.field_o = cl.field_B.field_o - 1;
          }
          if (null != am.field_a &&
            param0 != am.field_a &&
            am.field_a.field_o > 0) {
            am.field_a.field_o = am.field_a.field_o - 1;
          }
          if (ca.field_wb != null &&
            param0 != ca.field_wb &&
            ca.field_wb.field_o > 0) {
            ca.field_wb.field_o = ca.field_wb.field_o - 1;
          }
          if (null != f.field_s &&
            param0 != f.field_s &&
            f.field_s.field_o > 0) {
            f.field_s.field_o = f.field_s.field_o - 1;
          }
          if (hh.field_a == ue.field_b &&
            param0 != null &&
            20 > param0.field_o) {
            param0.field_c = param0.field_c + 16;
            param0.field_o = param0.field_o + 1;
          }
          if (null != pd.field_d &&
            !ba.field_c &&
            pd.field_d.field_o == 0) {
            pd.field_d = null;
          }
          if (am.field_a != null &&
            !fm.field_e &&
            am.field_a.field_o == 0) {
            am.field_a = null;
          }
          if (null != cl.field_B &&
            !mg.field_Zb &&
            cl.field_B.field_o == 0) {
            cl.field_B = null;
          }
          if (null != field_d &&
            !lk.field_F &&
            field_d.field_o == 0) {
            field_d = null;
          }
          if (null != ca.field_wb &&
            !ve.field_Hc &&
            ca.field_wb.field_o == 0) {
            ca.field_wb = null;
          }
          if (f.field_s != null &&
            !nk.field_k &&
            f.field_s.field_o == 0) {
            f.field_s = null;
          }
          if (null != kf.field_G) {
            kf.field_G.k((byte) 111);
          }
          if (pd.field_d != null) {
            pd.field_d.k((byte) 118);
          }
          if (param1 != 95) {
            return;
          }
          if (null != field_d) {
            field_d.k((byte) 122);
          }
          if (cl.field_B != null) {
            cl.field_B.k((byte) 127);
          }
          if (null != am.field_a) {
            am.field_a.k((byte) 122);
          }
          if (null != ca.field_wb) {
            ca.field_wb.k((byte) 108);
          }
          if (f.field_s == null) {
            return;
          }
          f.field_s.k((byte) 122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_85_0 = var2;
          stackIn_85_1 = new StringBuilder().append("h.H(");
          if (param0 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_85_0), ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 77 / ((param1 + 6) / 41);
        param0 = ((param0 & -1431655766) >>> 1) + (param0 & 1431655765);
        param0 = (param0 & 858993459) + ((-858993460 & param0) >>> 2);
        param0 = 252645135 & param0 + (param0 >>> 4);
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return param0 & 255;
    }

    static {
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
        field_g = "Enter name of friend to add to list";
        field_e = "Waiting for <%0> to start the game...";
        field_f = "Yes";
    }
}
