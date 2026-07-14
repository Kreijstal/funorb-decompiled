/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends hf {
    static int field_db;
    static int field_bb;
    static byte[] field_gb;
    static String field_fb;
    static int field_ab;
    static int field_hb;
    static String field_jb;
    private double field_ib;
    private int field_eb;
    private oi field_kb;
    private hm[] field_cb;

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        ((wm) this).a(-116, cd.field_o[(((wm) this).field_eb & 15) >> -763594655], param1, param3);
        if (param2 >= -5) {
            field_bb = 59;
        }
    }

    final void a(hm param0, boolean param1) {
        int var3 = 0;
        hm var4 = null;
        int var5 = 0;
        L0: {
          var5 = Confined.field_J ? 1 : 0;
          var3 = 0;
          if (param1) {
            break L0;
          } else {
            field_hb = 92;
            break L0;
          }
        }
        L1: while (true) {
          if (((wm) this).field_cb.length <= var3) {
            return;
          } else {
            var4 = ((wm) this).field_cb[var3];
            if (!var4.c((byte) 125)) {
              var4.a(8401151, 0, 50.0, 1.0);
              if (var4.a(((wm) this).field_cb, false, 15.0)) {
                ((wm) this).field_A.field_B.field_Db = ((wm) this).field_A.field_B.field_Db + 2.0;
                var4.field_Q.field_m = 96;
                ((wm) this).field_A.field_F.a((rk) (Object) var4, (byte) 72);
                var3++;
                continue L1;
              } else {
                var3++;
                continue L1;
              }
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    wm(hn param0, dj param1, double[] param2, double param3, boolean param4) {
        super(param0, param1.field_E + param2[9] * param1.field_C, param1.field_t + param2[10] * param1.field_C, param1.field_D + param1.field_C * param2[11], 0.4 * param3, 0.2 * param3, (ee) (Object) param1, param3 * 128.0, 0.01);
        double var7 = 0.0;
        L0: {
          ((wm) this).field_eb = 0;
          ((wm) this).field_kb = new oi((pm) this);
          ((wm) this).field_cb = new hm[]{new hm((pm) this, ki.field_a), new hm((pm) this, ki.field_a), new hm((pm) this, ki.field_a)};
          ((wm) this).field_G = param1.field_G + param2[10] * 0.4;
          ((wm) this).field_K = 0.4 * param2[9] + param1.field_K;
          ((wm) this).field_L = 0.4 * param2[11] + param1.field_L;
          if (!param4) {
            break L0;
          } else {
            L1: {
              var7 = Math.sqrt(((wm) this).field_K * ((wm) this).field_K + ((wm) this).field_G * ((wm) this).field_G + ((wm) this).field_L * ((wm) this).field_L);
              if (0.001 <= var7) {
                break L1;
              } else {
                var7 = 0.001;
                break L1;
              }
            }
            ((wm) this).field_W = param1.a(((wm) this).field_K / var7, ((wm) this).field_G / var7, ((wm) this).field_L / var7, false);
            break L0;
          }
        }
        gd.a((int)(param3 * 96.0), -125, vm.field_cb, (pm) (Object) param1);
        new gk((pm) this, pn.field_k).field_w = 8.0 * param3;
        ((wm) this).field_ib = param3 * 32.0;
    }

    final boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            field_ab = 32;
        }
        return param0.f(param1 ^ -61);
    }

    public static void n(int param0) {
        field_fb = null;
        field_jb = null;
        field_gb = null;
        if (param0 != -30002) {
            wm.n(103);
        }
    }

    final void b(ee param0, int param1) {
        if (param0 == ((wm) this).field_R) {
            if ((((wm) this).field_Q ^ -1) < -1) {
                ((wm) this).field_Q = ((wm) this).field_Q + 1;
                return;
            }
        }
        ((wm) this).field_ib = param0.a(14170, true, ((wm) this).field_ib);
        if (!(0.00001 <= ((wm) this).field_ib)) {
            ((wm) this).a(param0, 0.0, -101);
            ((wm) this).d(10797);
        }
        if (param1 >= -122) {
            Object var4 = null;
            ((wm) this).a((hm) null, true);
        }
    }

    final void g(int param0) {
        mb var2 = new mb((pm) this, 6.0, 0.3, 0.0003, jd.field_a);
        var2.field_M.field_w = ((wm) this).field_C / 0.4 * 4.0;
        ri.a((rk) this, 0, (rk) (Object) var2);
        if (param0 != 26402) {
            ((wm) this).field_cb = null;
        }
        ((wm) this).field_z = true;
    }

    final void a(int param0, int param1) {
        ((wm) this).field_eb = ((wm) this).field_eb + 1;
        super.a(param0, param1);
        if (!(((wm) this).field_D < ((wm) this).field_A.field_x.field_r[-1 + ((wm) this).field_A.field_x.field_a])) {
            ((wm) this).field_z = true;
            ((wm) this).field_s = 2;
        }
    }

    final static nf a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        if (!param1) {
            nf discarded$0 = wm.a(-107, false, -49);
        }
        nf var6 = new nf(param0, param0);
        nf var3 = var6;
        for (var4 = 0; var4 < var3.field_z.length; var4++) {
            var6.field_z[var4] = param2;
        }
        return var3;
    }

    final void a(mn param0, byte param1) {
        int var3 = 111 % ((-2 - param1) / 62);
        ((wm) this).field_kb.field_o = ((wm) this).field_t;
        ((wm) this).field_kb.field_p = ((wm) this).field_D;
        ((wm) this).field_kb.field_t = ((wm) this).field_E;
        ((wm) this).field_kb.field_u = 100.0 * ((wm) this).field_C;
        param0.a((rk) (Object) ((wm) this).field_kb, (byte) -74);
    }

    final static byte[] a(String param0, byte param1) {
        if (param1 <= 27) {
            field_hb = -83;
        }
        return mn.field_e.a(-98, "", param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = new byte[240640];
        field_fb = "<col=FFFFFF>Rapid fire:</col> this radically increases your basic weapon's firing rate. Remember you can't fire continuously without your ready energy meter running out, so time your firing carefully.";
        field_hb = 0;
    }
}
