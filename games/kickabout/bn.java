/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn extends qt {
    static String field_C;
    static ut[] field_E;
    private int field_D;
    static ut[] field_B;
    static int field_A;
    static ut field_G;
    static String[] field_F;

    final int b(int param0, int param1) {
        if (la.a(100)) {
          if (param0 == 0) {
            return 25 + (this.field_i[0].field_d >> 1);
          }
          if (param0 == 1) {
            return -(this.field_i[1].field_d >> 1) + 340;
          }
        }
        if (param1 != -22667) {
          return -84;
        }
        return super.b(param0, -22667);
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        mf.field_Gb = -1;
        je.field_k = tu.field_E.field_t;
        uv.field_f = false;
        bf.field_y.b(72);
        nq.b(je.field_k, 500);
    }

    final static String a(char param0, byte param1) {
        if (param1 != -83) {
          bn.e(77);
        }
        return String.valueOf(param0);
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        try {
          super.a(param0, param1, -116, param3);
          if (param2 >= -28) {
            field_F = (String[]) null;
          }
          io.field_e.a(true, 640, this.field_j, 0, 480);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "bn.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_1 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_1 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_42_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Kickabout.field_G;
        super.a((byte) -71, param1);
        stackIn_2_0 = param1;
        stackIn_3_1 = (la.a(100)) ? false : true;
        param1 = stackIn_2_0 & stackIn_3_1;
        stackIn_5_0 = param1;
        stackIn_6_1 = (rr.field_f) ? false : true;
        param1 = stackIn_5_0 & stackIn_6_1;
        if (this.field_D > 0) {
          this.field_D = this.field_D - 1;
        }
        var3 = jh.field_Hb.field_Db.field_J;
        io.field_e.b(0, param1);
        w.field_b.b(11570);
        var4 = -32 % ((38 - param0) / 60);
        if (wh.field_w > 0) {
          wh.field_w = wh.field_w - 1;
        }
        var5 = je.field_k;
        if (sd.field_b + un.field_d.a(gu.field_Jb) >= 20) {
          sd.field_b = sd.field_b - 1;
        } else {
          sd.field_b = 370;
        }
        var6 = 0;
        for (var7 = 0; var7 < ha.field_H.length; var7++) {
          if (ha.field_H[var7].field_sb == 1) {
            nq.b(var7, 500);
            je.field_k = var7;
            mf.field_Gb = 0;
            var5 = var7;
            jh.field_Hb.field_Db.field_J = 0;
            kj.a((byte) 80);
            var6 = 1;
          }
        }
        if (1 == np.field_Cb.field_sb &&
          w.field_b.j((byte) -16).length() > 0) {
          sp.a(w.field_b.j((byte) -16), (byte) 74);
          w.field_b.b("", -23174);
          kj.a((byte) -105);
        }
        boolean decompiledFrameRemainder0 = true;
        if (uv.field_f) {
          fieldTemp$0 = ri.field_t - 1;
          ri.field_t = ri.field_t - 1;
          if (fieldTemp$0 > 0) {
            stackIn_29_0 = true;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_29_0 = false;
        }
        uv.field_f = stackIn_29_0;
        jh.field_Hb.b(0, param1);
        jh.field_Hb.a(32 * id.field_v, false, (byte) -111, 32);
        if (var6 == 0) {
          var7 = vc.a(18, -(jh.field_Hb.field_Db.field_J + 5), (byte) -72);
          bf.field_y.a(30 + var7, -20 + var7, -108);
          re.a((byte) 125, -10 + var7, var7 + 20, var5);
          if (mf.field_Gb != var7 ||
            je.field_k != var5) {
            je.field_k = var5;
            mf.field_Gb = var7;
            qh.a(89);
          }
        }
        if (w.field_b.field_gb) {
          qd.$cfr$intArgs$a$b6210757cdab(-67, ht.field_a);
        }
        var7 = 0;
        while (var7 < ha.field_H.length) {
          stackIn_42_0 = ha.field_H[var7].field_gb;
          if (stackIn_42_0) {
            qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, fu.field_f, new String[]{q.field_h[var7]}));
          }
          var7++;
        }
        if (jh.field_Hb.field_Db.field_J > var3 &&
          this.field_D == 0) {
          sp.c(59, 76);
          this.field_D = 5;
        }
        if (jh.field_Hb.field_Db.field_J < var3 &&
          0 == this.field_D) {
          sp.c(60, -118);
          this.field_D = 5;
        }
        return;
    }

    final void b(int param0) {
        int var6 = 0;
        int var7 = Kickabout.field_G;
        if (gu.field_Jb == null) {
          gu.field_Jb = om.field_zb;
          if (la.a(100)) {
            gu.field_Jb = qh.field_g;
          }
        }
        io.field_e = new hd();
        io.field_e.a(true, 640, 0, 0, 480);
        hd var8 = new hd();
        var8.field_A = 1;
        var8.field_p = 1;
        var8.field_y = 16777215;
        var8.field_X = (hu) ((Object) q.field_d);
        hd var3 = new hd();
        var3.a(true, 317, 5, 5, 18);
        jh.field_Hb = new tk(0L, var3, var8, rr.field_b);
        jh.field_Hb.a(15, 20, 2, (byte) 37, 230, 344, 175);
        jh.field_Hb.field_A = 1;
        jh.field_Hb.field_y = 16777215;
        jh.field_Hb.field_p = 1;
        jh.field_Hb.field_X = (hu) ((Object) q.field_d);
        hd var4 = ag.a(16006912, param0 ^ param0);
        hd var5 = new hd();
        var5.field_y = 16777215;
        var5.field_B = 2;
        var5.field_X = (hu) ((Object) q.field_d);
        var5.field_D = 5;
        w.field_b = new vg(0L, var8, var4, var5, 20);
        w.field_b.a(param0 - 592, 145, 64, 4 + (q.field_d.field_G + q.field_d.field_p), 160);
        var8.field_X = (hu) ((Object) q.field_d);
        w.field_b.field_R = null;
        np.field_Cb = eo.a(ic.field_j, 7126504);
        np.field_Cb.a(true, np.field_Cb.field_q, 310, 61, np.field_Cb.field_mb);
        ha.field_H = new hd[7];
        for (var6 = 6; var6 >= 0; var6--) {
          ha.field_H[var6] = new hd();
          ha.field_H[var6].a(true, 48, 20 + 50 * var6, 96, 48);
          io.field_e.a((byte) -127, ha.field_H[var6]);
        }
        io.field_e.a((byte) -126, (hd) (jh.field_Hb));
        io.field_e.a((byte) -106, (hd) (w.field_b));
        io.field_e.a((byte) -112, np.field_Cb);
        if (!la.a(100)) {
          sp.a(ow.field_e, (byte) 74);
        }
    }

    public static void e(int param0) {
        field_E = null;
        field_G = null;
        if (param0 > -31) {
          field_B = (ut[]) null;
        }
        field_B = null;
        field_C = null;
        field_F = null;
    }

    final boolean a(int param0, int param1, char param2) {
        String var4 = null;
        if (param1 > -5) {
          bn.a('c', (byte) -84);
        }
        boolean discarded$3 = super.a(param0, -11, param2);
        if (!la.a(100) &&
          w.field_b.a(param0, param2, 875)) {
          return true;
        }
        if (!la.a(100) &&
          param0 == 84) {
          var4 = w.field_b.j((byte) -16);
          if (var4.length() > 0) {
            sp.a(w.field_b.j((byte) -16), (byte) 74);
            w.field_b.b("", -23174);
            kj.a((byte) -115);
          }
        }
        return true;
    }

    final void a(int param0, boolean param1) {
        int var3_int = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        hd stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        boolean stackIn_27_2 = false;
        ji var3;
        String var3_ref;
        int var4;
        int var5;
        int var6;
        cf var7;
        int var4Lifetime1;
        var6 = Kickabout.field_G;
        on.a(jh.field_Hb.field_F + this.field_j, -4 + jh.field_Hb.field_T, jh.field_Hb.field_q + 4, jh.field_Hb.field_mb + 6, 0, 128);
        on.a(this.field_j + 20, 60, 134 + w.field_b.field_q + np.field_Cb.field_q, 29, 10, 0, 128);
        q.field_d.c(bi.field_e.toUpperCase(), w.field_b.field_F, w.field_b.field_T + 15, 16777215, -1);
        on.a(w.field_b.field_F, w.field_b.field_T + 4, w.field_b.field_q, w.field_b.field_mb - 5, 7829367, 128);
        if (jh.field_Hb.field_Eb.e((byte) -113)) {
          var3 = jh.field_Hb.field_Eb;
          on.g(3 + (((hd) ((Object) var3)).field_F + this.field_j), ((hd) ((Object) var3)).field_T, ((hd) ((Object) var3)).field_q - 6, ((hd) ((Object) var3)).field_mb);
        }
        pt.a(640, -22914, 0, 135, 60);
        for (var3_int = 0; ha.field_H.length > var3_int; var3_int++) {
          stackIn_7_0 = (~je.field_k != ~var3_int) ? 0 : 1;
          var4 = stackIn_7_0;
          stackIn_10_0 = (var4 != 0) ? 256 : 128;
          var5 = stackIn_10_0;
          on.a(ha.field_H[var3_int].field_F, ha.field_H[var3_int].field_T, ha.field_H[var3_int].field_q, ha.field_H[var3_int].field_mb, 10, 0, var5);
          if (var4 == 0) {
            jm.field_i[var3_int].b(ha.field_H[var3_int].field_F + 4, ha.field_H[var3_int].field_T - 2, 48);
          } else {
            kb.field_E[var3_int].c(ha.field_H[var3_int].field_F + 4, ha.field_H[var3_int].field_T - 2);
          }
        }
        ta.e(param0 ^ -122);
        on.a(20 + je.field_k * 50 + this.field_j, 135, 48, 2, 0);
        on.a(20 + this.field_j, 137, 348, 26, 0);
        var3_ref = lh.field_C;
        if (je.field_k > 0 &&
          je.field_k < q.field_h.length) {
          var3_ref = q.field_h[je.field_k];
        }
        un.field_d.d(var3_ref.toLowerCase(), this.field_j + 194, 156, 16679959, -1);
        var4Lifetime1 = un.field_d.a(var3_ref.toLowerCase());
        if (eo.field_f != null) {
          eo.field_f[je.field_k].a(194 + this.field_j - (var4Lifetime1 >> 1) - 28, 146);
          eo.field_f[je.field_k].a(14 + ((var4Lifetime1 >> 1) + this.field_j) + 194, 146);
        }
        stackIn_26_0 = io.field_e;
        stackIn_26_1 = 85;
        stackIn_27_2 = (pn.g(2368)) && (nj.a(127) % 500L < 250L);
        ((hd) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_27_2);
        if (jh.field_Hb.field_Db.field_jb != null) {
          pt.a(-2 + jh.field_Hb.field_q + (jh.field_Hb.field_F - 15), -22914, jh.field_Hb.field_F, 12 + (jh.field_Hb.field_T - (-jh.field_Hb.field_mb + 15)), jh.field_Hb.field_T);
          var7 = (cf) (jh.field_Hb.field_Db.field_jb.g(24009));
          while (var7 != null) {
            var7.b(-104);
            var7 = (cf) (jh.field_Hb.field_Db.field_jb.c(param0 ^ -38));
          }
          ta.e(118);
        }
        if (jh.field_Hb.field_Db.field_jb == null ||
          jh.field_Hb.field_Db.field_jb.a(false) == 0) {
          if (!la.a(100)) {
            if (!uv.field_f) {
              un.field_d.d(lo.field_k.toLowerCase(), 194 + this.field_j, 290, 16777215, -1);
            } else {
              jr.a(this.field_j + 194, -65, 290);
            }
          } else {
            pb.field_C.d(sh.field_b, this.field_j + 194, 290, 16777215, -1);
          }
        }
        on.a(jh.field_Hb.field_F, 4 + (jh.field_Hb.field_mb + jh.field_Hb.field_T), 4 + jh.field_Hb.field_q, 24, 0, 196);
        pt.a(jh.field_Hb.field_F + (jh.field_Hb.field_q + 2), -22914, 1 + jh.field_Hb.field_F, jh.field_Hb.field_T + (jh.field_Hb.field_mb + 4) + 24, 4 + (jh.field_Hb.field_mb + jh.field_Hb.field_T));
        if (wh.field_w > 0) {
          un.field_d.d(qh.field_e.toLowerCase(), (jh.field_Hb.field_q >> 1) + jh.field_Hb.field_F, 423, 16679959, -1);
        } else {
          un.field_d.a(gu.field_Jb.toLowerCase(), sd.field_b + this.field_j, 423, 16679959, -1);
        }
        ta.e(param0 + 128);
        if (la.a(100) ||
          rr.field_f) {
          on.g(this.field_j, 48, 450, 382);
          if (rr.field_f) {
            pb.field_C.a(pi.field_d, this.field_j, 48, 450, 382, 16777215, -1, 1, 1, 0);
          }
        }
        super.a(param0, param1);
    }

    final void a(boolean param0, int param1) {
        super.a(param0, 121);
        if (param1 < 99) {
          field_E = (ut[]) null;
        }
    }

    bn() {
        this.field_D = 0;
    }

    final int a(int param0, int param1) {
        int var3 = 33 / ((-49 - param0) / 52);
        return super.a(-111, param1);
    }

    static {
        field_C = "buyout at min";
        field_A = 3;
        field_G = null;
        field_F = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
