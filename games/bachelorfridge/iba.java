/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iba extends bca {
    int field_r;
    int field_q;
    static int field_s;

    iba(int param0, nq param1) {
        super(param0, param1);
    }

    final int[][] d(byte param0) {
        if (param0 != 2) {
            iba.d(-82);
            return null;
        }
        return null;
    }

    final static void d(int param0) {
        Object var2 = null;
        L0: {
          ho.field_j = null;
          hna.field_h = null;
          mla.field_b = null;
          rla.field_k = null;
          ls.field_a = null;
          du.field_b = null;
          sj.field_k = null;
          ge.field_K = null;
          iga.field_a = null;
          pw.field_y = null;
          bla.field_p = null;
          uu.field_vb = null;
          iw.field_b = null;
          kka.field_f = null;
          co.field_b = null;
          hh.field_b = null;
          bt.field_r = null;
          il.field_a = null;
          hl.field_D = null;
          lf.field_b = null;
          gha.field_h = null;
          od.field_C = null;
          ik.field_h = null;
          nia.field_l = null;
          lu.field_f = null;
          op.field_I = null;
          rw.field_a = null;
          if (null != dj.field_c) {
            dj.field_c.field_s.field_k = null;
            break L0;
          } else {
            break L0;
          }
        }
        vj.field_m = null;
        lw.field_b = null;
        hb.field_k = null;
        nna.field_v = null;
        fe.field_j = null;
        am.field_M = null;
        ve.field_m = null;
        bfa.field_b = null;
        tp.field_x = null;
        wd.field_w = null;
        pm.field_v = null;
        un.field_m = null;
        lp.field_q = null;
        aea.field_k = null;
        lga.field_k = null;
        hp.field_b = null;
        nha.field_a = null;
        de.field_F = null;
        sia.field_g = null;
        nv.field_wb = null;
        en.field_a = null;
        pk.field_b = null;
        qna.field_l = null;
        pfa.field_g = null;
        cba.field_c = null;
        ff.field_u = null;
        eka.field_g = null;
        ela.field_j = null;
        qq.field_i = null;
        it.field_i = null;
        vi.field_f = null;
        as.field_a = null;
        aw.field_v = null;
        ed.field_f = null;
        ula.field_h = null;
        ou.field_d = null;
        hha.field_y = null;
        ip.field_f = null;
        nca.field_a = null;
        if (param0 != 34) {
          var2 = null;
          pp discarded$1 = iba.b((byte) 59, (lu) null);
          hr.field_c = null;
          ena.field_l = null;
          kn.field_g = null;
          ld.field_l = null;
          fw.field_f = null;
          sv.field_c = null;
          il.field_b = null;
          Runtime.getRuntime().gc();
          return;
        } else {
          hr.field_c = null;
          ena.field_l = null;
          kn.field_g = null;
          ld.field_l = null;
          fw.field_f = null;
          sv.field_c = null;
          il.field_b = null;
          Runtime.getRuntime().gc();
          return;
        }
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((iba) this).a((op) null, 123);
          return (at) (Object) new ki(param1, (iba) this);
        } else {
          return (at) (Object) new ki(param1, (iba) this);
        }
    }

    final static pp b(byte param0, lu param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 > -101) {
          iba.d(107);
          var2 = param1.b(16711935);
          var3 = param1.b(16711935);
          return (pp) (Object) new ro(var2, var3);
        } else {
          var2 = param1.b(16711935);
          var3 = param1.b(16711935);
          return (pp) (Object) new ro(var2, var3);
        }
    }

    iba(lu param0) {
        super(param0);
        ((iba) this).field_k = param0.e((byte) 103);
        ((iba) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((iba) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((iba) this).field_q = param0.b(16711935);
        ((iba) this).field_r = param0.b(16711935);
    }

    final void a(op param0, int param1) {
        aga discarded$0 = ((iba) this).field_l.a(91, param0);
        param0.b((byte) -85, 34, ((iba) this).field_q, ((iba) this).field_r);
        int var3 = -88 % ((param1 - 12) / 35);
    }

    final void a(byte param0, lu param1) {
        this.a((byte) -62, param1);
        param1.d(((iba) this).field_q, 0);
        if (param0 >= -12) {
          return;
        } else {
          param1.d(((iba) this).field_r, 0);
          return;
        }
    }

    static {
    }
}
