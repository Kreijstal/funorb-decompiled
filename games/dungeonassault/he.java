/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class he extends ip {
    static String field_r;
    static int[] field_o;
    static boolean field_s;
    static int field_p;
    static String field_q;
    static String field_n;
    static String field_m;

    final static void e(int param0) {
        String[][] var1 = null;
        String[][] var2 = null;
        String var3_ref_String = null;
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        h[] var9 = null;
        h var10 = null;
        var8 = DungeonAssault.field_K;
        if (ll.field_m != null) {
          return;
        } else {
          ll.field_m = new String[29];
          ll.field_m[0] = o.field_q.toUpperCase();
          ll.field_m[1] = t.field_b.toUpperCase();
          ll.field_m[2] = me.field_c.toUpperCase();
          ll.field_m[3] = t.field_b.toUpperCase();
          ll.field_m[4] = sj.field_W.toUpperCase();
          ll.field_m[5] = uc.field_C.toUpperCase();
          ll.field_m[6] = rl.field_a.toUpperCase();
          ll.field_m[7] = ue.field_m.toUpperCase();
          ll.field_m[8] = kd.field_a.toUpperCase();
          ll.field_m[9] = wo.field_d.toUpperCase();
          ll.field_m[10] = null;
          ll.field_m[11] = vd.field_d.toUpperCase();
          ll.field_m[12] = cd.field_h.toUpperCase();
          ll.field_m[13] = pd.field_B.toUpperCase();
          ll.field_m[14] = ja.field_a.toUpperCase();
          ll.field_m[15] = ef.field_g.toUpperCase();
          ll.field_m[16] = uo.field_e.toUpperCase();
          ll.field_m[17] = jg.field_e.toUpperCase();
          ll.field_m[18] = lb.field_E.toUpperCase();
          ll.field_m[19] = bl.field_a.toUpperCase();
          ll.field_m[20] = ub.field_k.toUpperCase();
          ll.field_m[21] = vf.field_y.toUpperCase();
          ll.field_m[22] = ag.field_b.toUpperCase();
          ll.field_m[23] = uj.field_e.toUpperCase();
          ll.field_m[24] = id.field_k.toUpperCase();
          ll.field_m[26] = og.field_d.toUpperCase();
          ll.field_m[25] = an.field_y.toUpperCase();
          ll.field_m[27] = hk.field_a.toUpperCase();
          var1 = new String[ob.field_ac][];
          var1[ob.field_fc] = bo.field_Gb;
          var1[ob.field_hc] = ao.field_i;
          var1[ob.field_Mb] = hh.field_h;
          var1[ob.field_Wb] = up.field_c;
          var1[ob.field_Nb] = jm.field_a;
          var1[ob.field_jc] = ll.field_t;
          var1[ob.field_Hb] = qj.field_f;
          var1[ob.field_Ob] = an.field_F;
          var1[ob.field_Qb] = ob.field_oc;
          var1[ob.field_Lb] = sp.field_g;
          var1[ob.field_mc] = np.field_z;
          var1[ob.field_dc] = li.field_f;
          var1[ob.field_Vb] = vb.field_b;
          var1[ob.field_Zb] = ob.field_Rb;
          var1[ob.field_Jb] = oa.field_g;
          var1[ob.field_Sb] = vc.field_d;
          var1[ob.field_Ib] = lg.field_d;
          var1[ob.field_Gb] = ja.field_d;
          var1[ob.field_pc] = hj.field_P;
          var1[ob.field_gc] = rf.field_N;
          var1[ob.field_bc] = qp.field_f;
          var1[ob.field_ec] = pm.field_k;
          var1[ob.field_Ub] = j.field_S;
          var2 = new String[ob.field_ac][];
          var2[ob.field_fc] = ha.field_l;
          var2[ob.field_hc] = ne.field_f;
          var2[ob.field_Mb] = rp.field_f;
          var2[ob.field_Wb] = bj.field_H;
          var2[ob.field_Nb] = hk.field_d;
          var2[ob.field_jc] = mi.field_a;
          var2[ob.field_Hb] = al.field_i;
          var2[ob.field_Ob] = dm.field_e;
          var2[ob.field_Qb] = to.field_b;
          var2[ob.field_Lb] = fe.field_n;
          var2[ob.field_mc] = rj.field_j;
          var2[ob.field_dc] = gi.field_K;
          var2[ob.field_Vb] = jf.field_e;
          var2[ob.field_Zb] = bh.field_N;
          var2[ob.field_Jb] = rp.field_b;
          var2[ob.field_Sb] = rk.field_f;
          var2[ob.field_Ib] = bb.field_l;
          var2[ob.field_Gb] = um.field_b;
          var2[ob.field_pc] = gl.field_Kb;
          var2[ob.field_gc] = uf.field_d;
          var2[ob.field_bc] = dn.field_N;
          var2[ob.field_ec] = ua.field_c;
          var2[ob.field_Ub] = wf.field_z;
          var9 = hp.field_b;
          var4_int = 0;
          L0: while (true) {
            if (var9.length <= var4_int) {
              L1: {
                var3_ref_String = d.field_a;
                var4 = nm.field_lb;
                if (null != hp.field_b[1]) {
                  hp.field_b[1].field_F = var3_ref_String;
                  hp.field_b[1].field_G = var4;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var3_ref_String = ng.field_J;
                var4 = a.field_p;
                if (null == hp.field_b[2]) {
                  break L2;
                } else {
                  hp.field_b[2].field_G = var4;
                  hp.field_b[2].field_F = var3_ref_String;
                  break L2;
                }
              }
              L3: {
                var3_ref_String = ub.field_l;
                var4 = mm.field_m;
                if (hp.field_b[3] != null) {
                  hp.field_b[3].field_F = var3_ref_String;
                  hp.field_b[3].field_G = var4;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var3_ref_String = gj.field_a;
                var4 = fm.field_d;
                if (null != hp.field_b[4]) {
                  hp.field_b[4].field_G = var4;
                  hp.field_b[4].field_F = var3_ref_String;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var3_ref_String = ml.field_c;
                var4 = fj.field_c;
                if (null == hp.field_b[5]) {
                  break L5;
                } else {
                  hp.field_b[5].field_F = var3_ref_String;
                  hp.field_b[5].field_G = var4;
                  break L5;
                }
              }
              L6: {
                var3_ref_String = DungeonAssault.field_J;
                var4 = gh.field_j;
                if (hp.field_b[6] != null) {
                  hp.field_b[6].field_G = var4;
                  hp.field_b[6].field_F = var3_ref_String;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var3_ref_String = fb.field_b;
                var4 = in.field_t;
                if (null != hp.field_b[7]) {
                  hp.field_b[7].field_F = var3_ref_String;
                  hp.field_b[7].field_G = var4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                var3_ref_String = jl.field_b;
                var4 = hj.field_ab;
                if (null == hp.field_b[8]) {
                  break L8;
                } else {
                  hp.field_b[8].field_G = var4;
                  hp.field_b[8].field_F = var3_ref_String;
                  break L8;
                }
              }
              L9: {
                var3_ref_String = jk.field_Cb;
                var4 = fc.field_h;
                if (hp.field_b[9] == null) {
                  break L9;
                } else {
                  hp.field_b[9].field_G = var4;
                  hp.field_b[9].field_F = var3_ref_String;
                  break L9;
                }
              }
              L10: {
                var3_ref_String = dc.field_H;
                var4 = tb.field_h;
                if (hp.field_b[10] == null) {
                  break L10;
                } else {
                  hp.field_b[10].field_F = var3_ref_String;
                  hp.field_b[10].field_G = var4;
                  break L10;
                }
              }
              L11: {
                var3_ref_String = dn.field_W;
                var4 = uc.field_Q;
                if (hp.field_b[11] == null) {
                  break L11;
                } else {
                  hp.field_b[11].field_G = var4;
                  hp.field_b[11].field_F = var3_ref_String;
                  break L11;
                }
              }
              L12: {
                var3_ref_String = df.field_g;
                var4 = lg.field_r;
                if (hp.field_b[12] == null) {
                  break L12;
                } else {
                  hp.field_b[12].field_G = var4;
                  hp.field_b[12].field_F = var3_ref_String;
                  break L12;
                }
              }
              L13: {
                var3_ref_String = lf.field_v;
                var4 = ba.field_a;
                if (null == hp.field_b[13]) {
                  break L13;
                } else {
                  hp.field_b[13].field_F = var3_ref_String;
                  hp.field_b[13].field_G = var4;
                  break L13;
                }
              }
              L14: {
                var3_ref_String = ok.field_jb;
                var4 = a.field_l;
                if (hp.field_b[14] == null) {
                  break L14;
                } else {
                  hp.field_b[14].field_G = var4;
                  hp.field_b[14].field_F = var3_ref_String;
                  break L14;
                }
              }
              L15: {
                var3_ref_String = sd.field_I;
                var4 = df.field_f;
                if (null != hp.field_b[15]) {
                  hp.field_b[15].field_F = var3_ref_String;
                  hp.field_b[15].field_G = var4;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                var3_ref_String = ik.field_d;
                var4 = ik.field_c;
                if (hp.field_b[16] == null) {
                  break L16;
                } else {
                  hp.field_b[16].field_G = var4;
                  hp.field_b[16].field_F = var3_ref_String;
                  break L16;
                }
              }
              L17: {
                var3_ref_String = ua.field_d;
                var4 = h.field_n;
                if (null == hp.field_b[17]) {
                  break L17;
                } else {
                  hp.field_b[17].field_F = var3_ref_String;
                  hp.field_b[17].field_G = var4;
                  break L17;
                }
              }
              L18: {
                var3_ref_String = oa.field_i;
                var4 = oe.field_p;
                if (hp.field_b[18] == null) {
                  break L18;
                } else {
                  hp.field_b[18].field_G = var4;
                  hp.field_b[18].field_F = var3_ref_String;
                  break L18;
                }
              }
              L19: {
                var3_ref_String = ae.field_c;
                var4 = ta.field_h;
                if (null != hp.field_b[19]) {
                  hp.field_b[19].field_F = var3_ref_String;
                  hp.field_b[19].field_G = var4;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                var3_ref_String = o.field_l;
                var4 = ai.field_k;
                if (null != hp.field_b[20]) {
                  hp.field_b[20].field_F = var3_ref_String;
                  hp.field_b[20].field_G = var4;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                var3_ref_String = bo.field_Mb;
                var4 = pk.field_q;
                if (hp.field_b[21] != null) {
                  hp.field_b[21].field_F = var3_ref_String;
                  hp.field_b[21].field_G = var4;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                var3_ref_String = op.field_b;
                var4 = field_r;
                if (hp.field_b[22] != null) {
                  hp.field_b[22].field_F = var3_ref_String;
                  hp.field_b[22].field_G = var4;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                var3_ref_String = lf.field_p;
                var4 = gh.field_b;
                if (null == hp.field_b[23]) {
                  break L23;
                } else {
                  hp.field_b[23].field_G = var4;
                  hp.field_b[23].field_F = var3_ref_String;
                  break L23;
                }
              }
              L24: {
                var3_ref_String = sp.field_f;
                var4 = dk.field_a;
                if (null != hp.field_b[24]) {
                  hp.field_b[24].field_G = var4;
                  hp.field_b[24].field_F = var3_ref_String;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                var3_ref_String = hp.field_d;
                var4 = hc.field_g;
                if (hp.field_b[25] != null) {
                  hp.field_b[25].field_G = var4;
                  hp.field_b[25].field_F = var3_ref_String;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                var3_ref_String = mp.field_g;
                var4 = eb.field_M;
                if (hp.field_b[26] == null) {
                  break L26;
                } else {
                  hp.field_b[26].field_F = var3_ref_String;
                  hp.field_b[26].field_G = var4;
                  break L26;
                }
              }
              L27: {
                var3_ref_String = ro.field_m;
                var4 = ql.field_l;
                if (hp.field_b[27] != null) {
                  hp.field_b[27].field_G = var4;
                  hp.field_b[27].field_F = var3_ref_String;
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                var3_ref_String = uf.field_c;
                var4 = jm.field_g;
                if (null == hp.field_b[28]) {
                  break L28;
                } else {
                  hp.field_b[28].field_F = var3_ref_String;
                  hp.field_b[28].field_G = var4;
                  break L28;
                }
              }
              L29: {
                var3_ref_String = kf.field_i;
                var4 = qi.field_c;
                if (hp.field_b[29] != null) {
                  hp.field_b[29].field_G = var4;
                  hp.field_b[29].field_F = var3_ref_String;
                  break L29;
                } else {
                  break L29;
                }
              }
              L30: {
                var3_ref_String = e.field_k;
                var4 = kj.field_i;
                if (hp.field_b[30] != null) {
                  hp.field_b[30].field_G = var4;
                  hp.field_b[30].field_F = var3_ref_String;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                var3_ref_String = ih.field_v;
                var4 = no.field_b;
                if (null == hp.field_b[31]) {
                  break L31;
                } else {
                  hp.field_b[31].field_F = var3_ref_String;
                  hp.field_b[31].field_G = var4;
                  break L31;
                }
              }
              L32: {
                var3_ref_String = gh.field_e;
                var4 = oo.field_e;
                if (null != hp.field_b[32]) {
                  hp.field_b[32].field_G = var4;
                  hp.field_b[32].field_F = var3_ref_String;
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                var3_ref_String = sg.field_f;
                var4 = vk.field_b;
                if (null == hp.field_b[33]) {
                  break L33;
                } else {
                  hp.field_b[33].field_G = var4;
                  hp.field_b[33].field_F = var3_ref_String;
                  break L33;
                }
              }
              L34: {
                var3_ref_String = lm.field_r;
                var4 = jd.field_n;
                if (hp.field_b[34] != null) {
                  hp.field_b[34].field_F = var3_ref_String;
                  hp.field_b[34].field_G = var4;
                  break L34;
                } else {
                  break L34;
                }
              }
              L35: {
                var3_ref_String = ic.field_A;
                var4 = nh.field_a;
                var5 = null;
                if (gh.field_i[0] != null) {
                  gh.field_i[0].field_o = var5;
                  gh.field_i[0].field_z = var3_ref_String;
                  gh.field_i[0].field_t = var4;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                var3_ref_String = ie.field_n;
                var4 = s.field_c;
                var5 = null;
                if (null != gh.field_i[1]) {
                  gh.field_i[1].field_z = var3_ref_String;
                  gh.field_i[1].field_t = var4;
                  gh.field_i[1].field_o = var5;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                var3_ref_String = cm.field_S;
                var4 = null;
                var5 = null;
                if (null != gh.field_i[2]) {
                  gh.field_i[2].field_o = var5;
                  gh.field_i[2].field_z = var3_ref_String;
                  gh.field_i[2].field_t = var4;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                var3_ref_String = wi.field_mb;
                var4 = null;
                var5 = null;
                if (null == gh.field_i[3]) {
                  break L38;
                } else {
                  gh.field_i[3].field_o = var5;
                  gh.field_i[3].field_t = var4;
                  gh.field_i[3].field_z = var3_ref_String;
                  break L38;
                }
              }
              L39: {
                var3_ref_String = go.field_F;
                var4 = um.field_e;
                var5 = null;
                if (gh.field_i[4] != null) {
                  gh.field_i[4].field_o = var5;
                  gh.field_i[4].field_z = var3_ref_String;
                  gh.field_i[4].field_t = var4;
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                var3_ref_String = ce.field_m;
                var4 = fj.field_b;
                var5 = null;
                if (null != gh.field_i[5]) {
                  gh.field_i[5].field_z = var3_ref_String;
                  gh.field_i[5].field_o = var5;
                  gh.field_i[5].field_t = var4;
                  break L40;
                } else {
                  break L40;
                }
              }
              L41: {
                var3_ref_String = i.field_w;
                var4 = fn.field_j;
                var5 = gm.field_e;
                if (gh.field_i[6] != null) {
                  gh.field_i[6].field_t = var4;
                  gh.field_i[6].field_z = var3_ref_String;
                  gh.field_i[6].field_o = var5;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                var3_ref_String = oh.field_q;
                var4 = bh.field_L;
                var5 = null;
                if (null != gh.field_i[7]) {
                  gh.field_i[7].field_t = var4;
                  gh.field_i[7].field_z = var3_ref_String;
                  gh.field_i[7].field_o = var5;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                var3_ref_String = ld.field_h;
                var4 = to.field_f;
                var5 = ek.field_a;
                if (null == gh.field_i[8]) {
                  break L43;
                } else {
                  gh.field_i[8].field_t = var4;
                  gh.field_i[8].field_o = var5;
                  gh.field_i[8].field_z = var3_ref_String;
                  break L43;
                }
              }
              var3_ref_String = nm.field_mb;
              L44: {
                var4 = hl.field_j;
                var5 = dl.field_c;
                if (gh.field_i[9] == null) {
                  break L44;
                } else {
                  gh.field_i[9].field_t = var4;
                  gh.field_i[9].field_z = var3_ref_String;
                  gh.field_i[9].field_o = var5;
                  break L44;
                }
              }
              L45: {
                var3_ref_String = dd.field_z;
                var4 = fa.field_k;
                var5 = nf.field_w;
                if (gh.field_i[10] == null) {
                  break L45;
                } else {
                  gh.field_i[10].field_z = var3_ref_String;
                  gh.field_i[10].field_t = var4;
                  gh.field_i[10].field_o = var5;
                  break L45;
                }
              }
              L46: {
                var3_ref_String = ll.field_u;
                var4 = dm.field_b;
                var5 = null;
                if (gh.field_i[11] != null) {
                  gh.field_i[11].field_z = var3_ref_String;
                  gh.field_i[11].field_o = var5;
                  gh.field_i[11].field_t = var4;
                  break L46;
                } else {
                  break L46;
                }
              }
              L47: {
                var3_ref_String = sm.field_a;
                var4 = e.field_i;
                var5 = fb.field_e;
                if (null != gh.field_i[12]) {
                  gh.field_i[12].field_z = var3_ref_String;
                  gh.field_i[12].field_t = var4;
                  gh.field_i[12].field_o = var5;
                  break L47;
                } else {
                  break L47;
                }
              }
              L48: {
                var3_ref_String = fg.field_o;
                var4 = nb.field_c;
                var5 = ho.field_e;
                if (null != gh.field_i[13]) {
                  gh.field_i[13].field_o = var5;
                  gh.field_i[13].field_z = var3_ref_String;
                  gh.field_i[13].field_t = var4;
                  break L48;
                } else {
                  break L48;
                }
              }
              L49: {
                var3_ref_String = ea.field_b;
                var4 = cp.field_P;
                var5 = null;
                if (null == gh.field_i[14]) {
                  break L49;
                } else {
                  gh.field_i[14].field_o = var5;
                  gh.field_i[14].field_t = var4;
                  gh.field_i[14].field_z = var3_ref_String;
                  break L49;
                }
              }
              L50: {
                var3_ref_String = cp.field_O;
                var4 = il.field_b;
                var5 = null;
                if (null != gh.field_i[15]) {
                  gh.field_i[15].field_z = var3_ref_String;
                  gh.field_i[15].field_t = var4;
                  gh.field_i[15].field_o = var5;
                  break L50;
                } else {
                  break L50;
                }
              }
              L51: {
                var3_ref_String = cb.field_c;
                var4 = ul.field_a;
                var5 = vc.field_a;
                if (gh.field_i[16] == null) {
                  break L51;
                } else {
                  gh.field_i[16].field_o = var5;
                  gh.field_i[16].field_z = var3_ref_String;
                  gh.field_i[16].field_t = var4;
                  break L51;
                }
              }
              L52: {
                var3_ref_String = jb.field_Ub;
                var4 = rn.field_f;
                var5 = null;
                if (null == gh.field_i[17]) {
                  break L52;
                } else {
                  gh.field_i[17].field_t = var4;
                  gh.field_i[17].field_z = var3_ref_String;
                  gh.field_i[17].field_o = var5;
                  break L52;
                }
              }
              L53: {
                var3_ref_String = wi.field_rb;
                var4 = ke.field_a;
                var5 = null;
                if (gh.field_i[18] == null) {
                  break L53;
                } else {
                  gh.field_i[18].field_t = var4;
                  gh.field_i[18].field_z = var3_ref_String;
                  gh.field_i[18].field_o = var5;
                  break L53;
                }
              }
              L54: {
                var3_ref_String = pd.field_G;
                var4 = li.field_d;
                var5 = null;
                if (gh.field_i[19] != null) {
                  gh.field_i[19].field_z = var3_ref_String;
                  gh.field_i[19].field_o = var5;
                  gh.field_i[19].field_t = var4;
                  break L54;
                } else {
                  break L54;
                }
              }
              L55: {
                var3_ref_String = hg.field_p;
                var4 = tn.field_Y;
                var5 = lb.field_x;
                if (null != gh.field_i[20]) {
                  gh.field_i[20].field_t = var4;
                  gh.field_i[20].field_z = var3_ref_String;
                  gh.field_i[20].field_o = var5;
                  break L55;
                } else {
                  break L55;
                }
              }
              L56: {
                var3_ref_String = gi.field_P;
                var4 = bc.field_c;
                var5 = fm.field_l;
                if (null != gh.field_i[21]) {
                  gh.field_i[21].field_z = var3_ref_String;
                  gh.field_i[21].field_t = var4;
                  gh.field_i[21].field_o = var5;
                  break L56;
                } else {
                  break L56;
                }
              }
              L57: {
                var3_ref_String = jj.field_a;
                var4 = qh.field_D;
                var5 = ub.field_m;
                if (null != gh.field_i[22]) {
                  gh.field_i[22].field_z = var3_ref_String;
                  gh.field_i[22].field_o = var5;
                  gh.field_i[22].field_t = var4;
                  break L57;
                } else {
                  break L57;
                }
              }
              L58: {
                var3_ref_String = g.field_Kb;
                var4 = f.field_e;
                var5 = lg.field_e;
                if (null != gh.field_i[23]) {
                  gh.field_i[23].field_t = var4;
                  gh.field_i[23].field_z = var3_ref_String;
                  gh.field_i[23].field_o = var5;
                  break L58;
                } else {
                  break L58;
                }
              }
              L59: {
                var3_ref_String = sf.field_i;
                var4 = ed.field_R;
                var5 = df.field_b;
                if (gh.field_i[24] != null) {
                  gh.field_i[24].field_o = var5;
                  gh.field_i[24].field_z = var3_ref_String;
                  gh.field_i[24].field_t = var4;
                  break L59;
                } else {
                  break L59;
                }
              }
              L60: {
                var3_ref_String = jb.field_Vb;
                var4 = ti.field_n;
                var5 = null;
                if (null == gh.field_i[25]) {
                  break L60;
                } else {
                  gh.field_i[25].field_z = var3_ref_String;
                  gh.field_i[25].field_o = var5;
                  gh.field_i[25].field_t = var4;
                  break L60;
                }
              }
              L61: {
                var3_ref_String = wf.field_v;
                var4 = wi.field_lb;
                var5 = ko.field_w;
                if (gh.field_i[26] == null) {
                  break L61;
                } else {
                  gh.field_i[26].field_z = var3_ref_String;
                  gh.field_i[26].field_t = var4;
                  gh.field_i[26].field_o = var5;
                  break L61;
                }
              }
              L62: {
                var3_ref_String = ih.field_s;
                var4 = om.field_e;
                var5 = qm.field_p;
                if (gh.field_i[27] != null) {
                  gh.field_i[27].field_o = var5;
                  gh.field_i[27].field_z = var3_ref_String;
                  gh.field_i[27].field_t = var4;
                  break L62;
                } else {
                  break L62;
                }
              }
              L63: {
                var3_ref_String = cc.field_a;
                var4 = mj.field_c;
                var5 = eb.field_L;
                if (gh.field_i[28] != null) {
                  gh.field_i[28].field_t = var4;
                  gh.field_i[28].field_z = var3_ref_String;
                  gh.field_i[28].field_o = var5;
                  break L63;
                } else {
                  break L63;
                }
              }
              L64: {
                var3_ref_String = hb.field_h;
                var4 = pe.field_k;
                var5 = null;
                if (gh.field_i[29] == null) {
                  break L64;
                } else {
                  gh.field_i[29].field_o = var5;
                  gh.field_i[29].field_z = var3_ref_String;
                  gh.field_i[29].field_t = var4;
                  break L64;
                }
              }
              L65: {
                var3_ref_String = ec.field_q;
                var4 = jm.field_d;
                var5 = null;
                if (gh.field_i[30] != null) {
                  gh.field_i[30].field_t = var4;
                  gh.field_i[30].field_z = var3_ref_String;
                  gh.field_i[30].field_o = var5;
                  break L65;
                } else {
                  break L65;
                }
              }
              L66: {
                var3_ref_String = kk.field_i;
                var4 = sj.field_eb;
                var5 = null;
                if (gh.field_i[31] == null) {
                  break L66;
                } else {
                  gh.field_i[31].field_o = var5;
                  gh.field_i[31].field_z = var3_ref_String;
                  gh.field_i[31].field_t = var4;
                  break L66;
                }
              }
              L67: {
                var3_ref_String = ea.field_a;
                var4 = an.field_x;
                var5 = ai.field_b;
                if (null == gh.field_i[32]) {
                  break L67;
                } else {
                  gh.field_i[32].field_t = var4;
                  gh.field_i[32].field_o = var5;
                  gh.field_i[32].field_z = var3_ref_String;
                  break L67;
                }
              }
              L68: {
                var3_ref_String = kf.field_q;
                var4 = sm.field_b;
                var5 = null;
                if (null != gh.field_i[33]) {
                  gh.field_i[33].field_t = var4;
                  gh.field_i[33].field_o = var5;
                  gh.field_i[33].field_z = var3_ref_String;
                  break L68;
                } else {
                  break L68;
                }
              }
              L69: {
                var3_ref_String = gj.field_b;
                var4 = fg.field_f;
                var5 = tk.field_b;
                if (null == gh.field_i[34]) {
                  break L69;
                } else {
                  gh.field_i[34].field_o = var5;
                  gh.field_i[34].field_z = var3_ref_String;
                  gh.field_i[34].field_t = var4;
                  break L69;
                }
              }
              L70: {
                var3_ref_String = mi.field_b;
                var4 = jb.field_Nb;
                var5 = hl.field_d;
                if (null != gh.field_i[35]) {
                  gh.field_i[35].field_t = var4;
                  gh.field_i[35].field_o = var5;
                  gh.field_i[35].field_z = var3_ref_String;
                  break L70;
                } else {
                  break L70;
                }
              }
              L71: {
                var3_ref_String = nj.field_d;
                var4 = tg.field_a;
                var5 = eg.field_g;
                if (gh.field_i[36] == null) {
                  break L71;
                } else {
                  gh.field_i[36].field_o = var5;
                  gh.field_i[36].field_z = var3_ref_String;
                  gh.field_i[36].field_t = var4;
                  break L71;
                }
              }
              L72: {
                var3_ref_String = ll.field_s;
                var4 = ic.field_z;
                var5 = ii.field_J;
                if (null != gh.field_i[37]) {
                  gh.field_i[37].field_z = var3_ref_String;
                  gh.field_i[37].field_t = var4;
                  gh.field_i[37].field_o = var5;
                  break L72;
                } else {
                  break L72;
                }
              }
              li.field_b[3] = tg.field_n;
              li.field_b[0] = ek.field_d;
              li.field_b[2] = df.field_d;
              li.field_b[1] = tp.field_z;
              un.field_a[1] = lj.field_j;
              un.field_a[0] = da.field_E;
              un.field_a[3] = bj.field_J;
              un.field_a[2] = an.field_C;
              cc.field_e = new String[254];
              var3 = 0;
              L73: while (true) {
                if (var3 >= dc.field_p.length) {
                  var3 = 0;
                  L74: while (true) {
                    if (hb.field_m.length <= var3) {
                      var3 = 0;
                      L75: while (true) {
                        if (var3 >= ci.field_s.length) {
                          var3 = 0;
                          L76: while (true) {
                            if (var3 >= bl.field_n.length) {
                              var3 = 0;
                              L77: while (true) {
                                if (var3 >= id.field_j.length) {
                                  ck.field_H = new fm();
                                  ck.field_H.a("<col=FF0000>" + qk.field_d + "</col>", -111, "attack");
                                  ck.field_H.a("<col=0A7500>" + dj.field_c + "</col>", 103, "defence");
                                  ck.field_H.a("<col=21634A>" + pm.field_n + "</col>", -114, "dodge");
                                  ck.field_H.a("<col=00A7D2>" + nf.field_x + "</col>", 59, "sneak");
                                  ck.field_H.a("<col=9F70CF>" + rk.field_a + "</col>", 93, "snare");
                                  ck.field_H.a("<col=7B633A>" + eg.field_f + "</col>", 116, "detect");
                                  ck.field_H.a(lh.field_b, -114, "charge");
                                  ck.field_H.a(dn.field_L, -96, "advance");
                                  ck.field_H.a(qa.field_d, 66, "flee");
                                  ck.field_H.a(vo.field_m, 69, "useskill");
                                  ck.field_H.a("<img=1>", 104, "command");
                                  ck.field_H.a("<col=FF0000>", -117, "highlight");
                                  int discarded$8 = -1;
                                  ck.field_H.a(b.a(gg.field_e), -121, "raider");
                                  int discarded$9 = -1;
                                  ck.field_H.a(b.a(af.field_a), -107, "monster");
                                  int discarded$10 = -1;
                                  ck.field_H.a(b.a(DungeonAssault.field_H), 74, "trap");
                                  int discarded$11 = -1;
                                  ck.field_H.a(b.a(ki.field_e), -106, "guardian");
                                  int discarded$12 = -1;
                                  ck.field_H.a(b.a(ak.field_m), 73, "raiders");
                                  int discarded$13 = -1;
                                  ck.field_H.a(b.a(wo.field_f), 102, "monsters");
                                  int discarded$14 = -1;
                                  ck.field_H.a(b.a(dh.field_e), 98, "traps");
                                  int discarded$15 = -1;
                                  ck.field_H.a(b.a(wm.field_j), -115, "guardians");
                                  ck.field_H.a("<col=8B1717>", -103, "col_charge");
                                  ck.field_H.a("<col=2E5D17>", -106, "col_advance");
                                  ck.field_H.a("<col=8B8B2E>", -101, "col_flee");
                                  ck.field_H.a("<col=178B8B>", -113, "col_useskill");
                                  ck.field_H.a("<col=FF0000>", 93, "col_attack");
                                  ck.field_H.a("<col=0A7500>", 87, "col_defence");
                                  ck.field_H.a("<col=21634A>", -126, "col_dodge");
                                  ck.field_H.a("<col=00A7D2>", -117, "col_sneak");
                                  ck.field_H.a("<col=9F70CF>", 72, "col_snare");
                                  ck.field_H.a("<col=7B633A>", -122, "col_detect");
                                  return;
                                } else {
                                  cc.field_e[cp.field_R + var3] = wm.field_i[var3];
                                  cc.field_e[var3 + (rj.field_l + cp.field_R)] = wm.field_d[var3];
                                  var3++;
                                  continue L77;
                                }
                              }
                            } else {
                              cc.field_e[var3 + ok.field_z] = nj.field_c[var3];
                              cc.field_e[ok.field_z + (rj.field_l + var3)] = lh.field_n[var3];
                              var3++;
                              continue L76;
                            }
                          }
                        } else {
                          cc.field_e[gn.field_d - -var3] = hd.field_m[var3];
                          cc.field_e[var3 + (gn.field_d + rj.field_l)] = ki.field_h[var3];
                          var3++;
                          continue L75;
                        }
                      }
                    } else {
                      cc.field_e[var3 + uf.field_a] = j.field_O[var3];
                      cc.field_e[rj.field_l + uf.field_a + var3] = ff.field_f[var3];
                      var3++;
                      continue L74;
                    }
                  }
                } else {
                  cc.field_e[var3 + wm.field_a] = od.field_b[var3];
                  cc.field_e[var3 + (rj.field_l + wm.field_a)] = ek.field_h[var3];
                  var3++;
                  continue L73;
                }
              }
            } else {
              L78: {
                var10 = var9[var4_int];
                if (var10 != null) {
                  L79: {
                    if (var10.field_s != -1) {
                      var10.field_d = var1[var10.field_s];
                      var10.field_C = var2[var10.field_s];
                      break L79;
                    } else {
                      break L79;
                    }
                  }
                  var6 = var10.field_A.length;
                  var10.field_k = new String[var6][];
                  var10.field_D = new String[var6][];
                  var7 = 0;
                  L80: while (true) {
                    if (var6 <= var7) {
                      break L78;
                    } else {
                      var10.field_D[var7] = var1[var10.field_A[var7]];
                      var10.field_k[var7] = var2[var10.field_A[var7]];
                      var7++;
                      continue L80;
                    }
                  }
                } else {
                  break L78;
                }
              }
              var4_int++;
              continue L0;
            }
          }
        }
    }

    public static void d() {
        field_n = null;
        field_q = null;
        field_r = null;
        field_m = null;
        field_o = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, cn[] param7, int param8, int param9, cn[] param10, se param11, se param12, int param13, boolean param14) {
        try {
            Object var16 = null;
            lp.a(8, param8, 240, 87, param4, param10, om.field_a, param11, 0, field_p, 0, 8, (cn[]) null, param13, param6, 2, param7, 480, param12, sm.field_c, 320);
            int discarded$0 = -31425;
            ic.a(param14);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "he.F(" + 240 + 44 + 0 + 44 + 8 + 44 + 2 + 44 + param4 + 44 + 8 + 44 + param6 + 44 + (param7 != null ? "{...}" : "null") + 44 + param8 + 44 + 320 + 44 + (param10 != null ? "{...}" : "null") + 44 + (param11 != null ? "{...}" : "null") + 44 + (param12 != null ? "{...}" : "null") + 44 + param13 + 44 + param14 + 41);
        }
    }

    final od a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        od stackIn_3_0 = null;
        od stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_2_0 = null;
        od stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3_int = -39 / ((param1 - 5) / 44);
            var5 = (CharSequence) (Object) param0;
            int discarded$9 = 10;
            if (!sj.a(var5)) {
              stackOut_2_0 = pd.field_J;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var6 = (CharSequence) (Object) param0;
                var4 = ri.a((byte) 47, var6);
                if (var4 <= 0) {
                  break L1;
                } else {
                  if (var4 > 130) {
                    break L1;
                  } else {
                    return c.field_d;
                  }
                }
              }
              stackOut_7_0 = pd.field_J;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("he.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    he(rm param0) {
        super(param0);
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 44) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            if (((he) this).a(param1, 86) == pd.field_J) {
              stackOut_4_0 = sm.field_f;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("he.D(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_5_0;
    }

    final static void e() {
        int var1_int = 0;
        int var2 = 0;
        cn var2_ref_cn = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        cn var9 = null;
        int var10 = 0;
        cn var11 = null;
        cn var12 = null;
        String var14 = null;
        cn var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_66_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        L0: {
          var10 = DungeonAssault.field_K;
          if (null == jb.field_Qb) {
            break L0;
          } else {
            if (!jb.field_Qb.a(-14354)) {
              break L0;
            } else {
              if (!jb.field_Qb.a(false, "benefits")) {
                break L0;
              } else {
                if (null == hf.field_pb) {
                  break L0;
                } else {
                  if (!hf.field_pb.a(-14354)) {
                    break L0;
                  } else {
                    if (hf.field_pb.a(false, "benefits")) {
                      ia.field_Q = oh.a(jb.field_Qb, "benefits", 11091, "headline");
                      gn.field_c = oh.a(jb.field_Qb, "benefits", 11091, "blurbpane");
                      tl.field_i = oh.a(jb.field_Qb, "benefits", 11091, "button");
                      ep.field_g = oh.a(jb.field_Qb, "benefits", 11091, "signup_text");
                      lg.field_u = oh.a(jb.field_Qb, "benefits", 11091, "menu_text");
                      nl.field_g = oh.a(jb.field_Qb, "benefits", 11091, "button_frame");
                      ql.field_c = oh.a(jb.field_Qb, "benefits", 11091, "arrow");
                      dc.field_e = (se) (Object) ah.a(hf.field_pb, 200, "large_font", "benefits", jb.field_Qb);
                      tg.field_l = (se) (Object) ah.a(hf.field_pb, 200, "small_font", "benefits", jb.field_Qb);
                      var27 = gf.field_b;
                      var2 = gf.field_i;
                      var3 = gf.field_c;
                      gf.a(rp.field_e);
                      var11 = new cn(4 + ql.field_c.field_y, ql.field_c.field_v - -4);
                      var11.e();
                      ql.field_c.c(2, 2, uj.field_d);
                      int discarded$17 = 0;
                      uc.a(1, 2, var11.field_y, var11, 0, var11.field_v, 0);
                      ql.field_c = var11;
                      al.field_j = ql.field_c.b();
                      var12 = new cn(195, 221);
                      var6 = var12.field_y / 2;
                      var12.e();
                      int discarded$18 = 30496;
                      dc.field_e.c(jk.a(new String[1], md.field_a), var6, 40, 16777215, -1);
                      int discarded$19 = 30496;
                      tg.field_l.c(jk.a(new String[1], hm.field_t), var6, 60, 16777215, -1);
                      int discarded$20 = 30496;
                      dc.field_e.c(jk.a(new String[1], bh.field_K), var6, 110, 16777215, -1);
                      int discarded$21 = 30496;
                      tg.field_l.c(jk.a(new String[1], jm.field_b), var6, 130, 16777215, -1);
                      dc.field_e.c(je.field_l, var6, 180, 16777215, -1);
                      tg.field_l.c(cg.field_c, var6, 200, 16777215, -1);
                      int discarded$22 = 0;
                      uc.a(1, 3, var12.field_y, var12, 0, var12.field_v, 0);
                      gn.field_c.e();
                      var12.h(18 - gn.field_c.field_w, -gn.field_c.field_A + 241);
                      var7 = 0;
                      L1: while (true) {
                        if (var7 >= ec.field_l.length) {
                          ec.field_l = null;
                          ne.field_d = ep.field_g.d();
                          ne.field_d.e();
                          jj.a(64, -971598481, 0, 0, 2 * gf.field_c / 3, gf.field_i);
                          gf.a(var27, var2, var3);
                          gf.b(rp.field_e);
                          jb.field_Qb = null;
                          mi.field_f = 390 - -((tl.field_i.field_v + -nl.field_g.field_v) / 2);
                          rm.field_T = 434 + (tl.field_i.field_y + -nl.field_g.field_y) / 2;
                          fo.field_b = (tl.field_i.field_v + -nl.field_g.field_v) / 2 + 390;
                          wk.field_h = (tl.field_i.field_y - nl.field_g.field_y) / 2 + 231;
                          break L0;
                        } else {
                          en.field_b[var7].e();
                          int discarded$23 = tg.field_l.a(ec.field_l[var7], 3, 3, en.field_b[var7].field_y + -6, -6 + en.field_b[var7].field_v, uj.field_d, -1, 1, 1, tg.field_l.field_H - -tg.field_l.field_E);
                          int discarded$24 = 0;
                          uc.a(1, 3, en.field_b[var7].field_y, en.field_b[var7], 0, en.field_b[var7].field_v, 0);
                          var7++;
                          continue L1;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        if (rf.field_Q != null) {
          L2: {
            if (qc.field_z == null) {
              break L2;
            } else {
              if (dc.field_e == null) {
                break L2;
              } else {
                L3: {
                  var28 = gf.field_b;
                  var2 = gf.field_i;
                  var3 = gf.field_c;
                  gf.a(rp.field_e);
                  int discarded$25 = 30496;
                  var14 = jk.a(new String[1], rn.field_e);
                  var5 = dc.field_e.b(var14, wm.field_b);
                  var6 = dc.field_e.a(var14, wm.field_b, dc.field_e.field_E + dc.field_e.field_H);
                  var7 = (-var5 + wm.field_b) / 2 + lj.field_m;
                  var8 = (-var6 + e.field_d) / 2 + cb.field_b;
                  var5 += 6;
                  var7 -= 3;
                  var6 += 6;
                  if (0 > var7) {
                    var9_int = -var7;
                    var5 = var5 + 2 * var9_int;
                    qc.field_z.field_E = qc.field_z.field_E + 2 * var9_int;
                    lj.field_m = lj.field_m + var9_int;
                    qc.field_z.field_w = qc.field_z.field_w + var9_int;
                    var7 = var7 + var9_int;
                    je.field_b = je.field_b - var9_int;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var8 -= 3;
                  if (qc.field_z.field_E < var7 + var5) {
                    var9_int = var5 + (var7 + -qc.field_z.field_E);
                    je.field_b = je.field_b - var9_int;
                    var5 = var5 + var9_int * 2;
                    qc.field_z.field_w = qc.field_z.field_w + var9_int;
                    lj.field_m = lj.field_m + var9_int;
                    qc.field_z.field_E = qc.field_z.field_E + var9_int * 2;
                    var7 = var7 + var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var8 < 0) {
                    var9_int = -var8;
                    var6 = var6 + 2 * var9_int;
                    qc.field_z.field_G = qc.field_z.field_G + var9_int * 2;
                    ig.field_a = ig.field_a - var9_int;
                    qc.field_z.field_A = qc.field_z.field_A + var9_int;
                    var8 = var8 + var9_int;
                    cb.field_b = cb.field_b + var9_int;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var8 + var6 > qc.field_z.field_G) {
                    var9_int = var8 + (var6 + -qc.field_z.field_G);
                    var6 = var6 + var9_int * 2;
                    ig.field_a = ig.field_a - var9_int;
                    qc.field_z.field_G = qc.field_z.field_G + 2 * var9_int;
                    var8 = var8 + var9_int;
                    qc.field_z.field_A = qc.field_z.field_A + var9_int;
                    cb.field_b = cb.field_b + var9_int;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                qc.field_z.a();
                var9 = new cn(qc.field_z.field_E, qc.field_z.field_G);
                var9.e();
                int discarded$26 = dc.field_e.a(var14, lj.field_m, cb.field_b, wm.field_b, e.field_d, 16777215, -1, 1, 1, dc.field_e.field_H - -dc.field_e.field_E);
                int discarded$27 = 0;
                uc.a(1, 3, var9.field_E, var9, 0, var9.field_G, 0);
                qc.field_z.e();
                var9.h(0, 0);
                ud.field_r = new cn(640, 480);
                ud.field_r.e();
                qc.field_z.e((qc.field_z.field_E >> 1) + je.field_b, (qc.field_z.field_G >> 1) + ig.field_a, md.field_f, 4096);
                qc.field_z = null;
                ud.field_r.c();
                gf.a(var28, var2, var3);
                gf.b(rp.field_e);
                break L2;
              }
            }
          }
          L7: {
            if (lg.field_m == null) {
              break L7;
            } else {
              if (null != tg.field_l) {
                var29 = gf.field_b;
                var2 = gf.field_i;
                var3 = gf.field_c;
                gf.a(rp.field_e);
                var16 = new cn(412, 43);
                int discarded$28 = 30496;
                var5_ref_String = jk.a(new String[1], je.field_a);
                lg.field_m = null;
                var16.e();
                int discarded$29 = tg.field_l.a(var5_ref_String, 3, 3, var16.field_y - 6, var16.field_v + -6, 16777215, -1, 0, 1, tg.field_l.field_H - -tg.field_l.field_E);
                int discarded$30 = 0;
                uc.a(1, 3, var16.field_y, var16, 0, var16.field_v, 0);
                rf.field_Q.e();
                var16.h(199 - rf.field_Q.field_w, 83 + -rf.field_Q.field_A);
                gf.a(var29, var2, var3);
                gf.b(rp.field_e);
                break L7;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (ol.field_b == null) {
              break L8;
            } else {
              if (tg.field_l == null) {
                break L8;
              } else {
                var30 = gf.field_b;
                var2 = gf.field_i;
                var3 = gf.field_c;
                gf.a(rp.field_e);
                var4 = 6 + tg.field_l.b(rp.field_h, 640);
                var5 = 20 + ol.field_b.field_E + var4;
                var6 = -(var5 / 2) + 427;
                var7 = ol.field_b.field_E + (var6 - -20);
                rf.field_Q.e();
                tg.field_l.b(rp.field_h, var7 + -rf.field_Q.field_w, tg.field_l.field_H + 155 - (rf.field_Q.field_A + -tg.field_l.field_E), 16777215, -1);
                int discarded$31 = 0;
                uc.a(1, 3, var4, rf.field_Q, -rf.field_Q.field_w + (var7 + -4), 50, -rf.field_Q.field_A + 155);
                var8 = -((-tg.field_l.field_E + -tg.field_l.field_H + (-3 + ol.field_b.field_G)) / 2) + (155 + -rf.field_Q.field_A);
                ol.field_b.h(-rf.field_Q.field_w + var6, var8);
                gf.a(var30, var2, var3);
                gf.b(rp.field_e);
                ol.field_b = null;
                break L8;
              }
            }
          }
          L9: {
            gf.a(rp.field_e);
            var1_int = -26;
            gf.a(16, 16, 608, 112, 15, ld.field_c, lj.field_u);
            gf.a(231, 144, 393, 232, 15, ld.field_c, lj.field_u);
            if (null != ia.field_Q) {
              ia.field_Q.h(0, 0);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (gn.field_c != null) {
              gn.field_c.h(0, 0);
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            rf.field_Q.h(0, 0);
            if (ud.field_r == null) {
              break L11;
            } else {
              ud.field_r.h(0, 0);
              break L11;
            }
          }
          L12: {
            if (tl.field_i == null) {
              break L12;
            } else {
              if (nl.field_g == null) {
                break L12;
              } else {
                L13: {
                  tl.field_i.h(231, 390);
                  var2_ref_cn = ep.field_g;
                  if (o.field_i.field_b != 0) {
                    break L13;
                  } else {
                    var2_ref_cn = ne.field_d;
                    break L13;
                  }
                }
                L14: {
                  var2_ref_cn.h(0, 0);
                  stackOut_47_0 = jc.field_e;
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_48_0 = stackOut_47_0;
                  if (o.field_i.field_b == 0) {
                    stackOut_49_0 = stackIn_49_0;
                    stackOut_49_1 = 4;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    break L14;
                  } else {
                    stackOut_48_0 = stackIn_48_0;
                    stackOut_48_1 = 3;
                    stackIn_50_0 = stackOut_48_0;
                    stackIn_50_1 = stackOut_48_1;
                    break L14;
                  }
                }
                L15: {
                  var3 = (la.a(stackIn_50_0 << stackIn_50_1, (byte) 86) * 40 >> 16) + 40;
                  if (var3 > 0) {
                    tl.field_i.b(230, 389, var3);
                    tl.field_i.b(232, 389, var3);
                    tl.field_i.b(232, 391, var3);
                    tl.field_i.b(230, 391, var3);
                    var2_ref_cn.b(1, 1, var3);
                    var2_ref_cn.b(-1, 1, var3);
                    var2_ref_cn.b(1, -1, var3);
                    var2_ref_cn.b(-1, -1, var3);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (o.field_i.field_b != 0) {
                    stackOut_55_0 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    break L16;
                  } else {
                    stackOut_54_0 = 1;
                    stackIn_56_0 = stackOut_54_0;
                    break L16;
                  }
                }
                cf.a(stackIn_56_0 != 0, wk.field_h, 127, fo.field_b);
                break L12;
              }
            }
          }
          L17: {
            if (tl.field_i == null) {
              break L17;
            } else {
              if (null != nl.field_g) {
                L18: {
                  tl.field_i.h(434, 390);
                  lg.field_u.h(0, 0);
                  if (1 == o.field_i.field_b) {
                    jj.a(64, -971598481, 436, 392, 7 * tl.field_i.field_v / 12, -4 + tl.field_i.field_y);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (1 != o.field_i.field_b) {
                    stackOut_65_0 = 0;
                    stackIn_66_0 = stackOut_65_0;
                    break L19;
                  } else {
                    stackOut_64_0 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    break L19;
                  }
                }
                cf.a(stackIn_66_0 != 0, rm.field_T, 126, mi.field_f);
                break L17;
              } else {
                break L17;
              }
            }
          }
          L20: {
            L21: {
              if (ql.field_c == null) {
                break L21;
              } else {
                var2 = -(ql.field_c.field_G / 2) + 357;
                ql.field_c.h(-ql.field_c.field_E + 269, var2);
                al.field_j.h(586, var2);
                if (var2 >= eh.field_h) {
                  break L21;
                } else {
                  if (var2 + ql.field_c.field_v <= eh.field_h) {
                    break L21;
                  } else {
                    var3 = 40 + (la.a(jc.field_e << 4, (byte) 86) * 40 >> 16);
                    if (var3 > 0) {
                      L22: {
                        if (hj.field_S <= -ql.field_c.field_y + 269) {
                          break L22;
                        } else {
                          if (hj.field_S >= 269) {
                            break L22;
                          } else {
                            ql.field_c.b(269 - ql.field_c.field_E + -1, var2 + -1, var3);
                            ql.field_c.b(-ql.field_c.field_E + 270, -1 + var2, var3);
                            ql.field_c.b(-ql.field_c.field_E + 268, 1 + var2, var3);
                            ql.field_c.b(269 + -ql.field_c.field_E - -1, 1 + var2, var3);
                            break L21;
                          }
                        }
                      }
                      if (hj.field_S <= 586) {
                        break L21;
                      } else {
                        if (ql.field_c.field_y + 586 > hj.field_S) {
                          al.field_j.b(585, -1 + var2, var3);
                          al.field_j.b(587, var2 + -1, var3);
                          al.field_j.b(585, 1 + var2, var3);
                          al.field_j.b(587, var2 - -1, var3);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    } else {
                      int discarded$32 = 245;
                      qh.a();
                      en.field_b[me.field_f].h(269, 340);
                      break L20;
                    }
                  }
                }
              }
            }
            int discarded$33 = 245;
            qh.a();
            en.field_b[me.field_f].h(269, 340);
            break L20;
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int[] param14) {
        RuntimeException var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var17 = DungeonAssault.field_K;
        try {
          L0: {
            var15_int = param5 & 16711935;
            var16 = param5 & 65280;
            param1 = -param3;
            L1: while (true) {
              if (param1 >= 0) {
                break L0;
              } else {
                param13 = -param4;
                L2: while (true) {
                  if (param13 >= 0) {
                    param8 = param8 + param7;
                    param9 = param9 + param10;
                    param1++;
                    continue L1;
                  } else {
                    L3: {
                      int incrementValue$2 = param9;
                      param9++;
                      param12 = param14[incrementValue$2];
                      if (param12 != 0) {
                        param12 = param12 >> 16;
                        param6 = param0[param8];
                        param12 = (var16 * param12 & 16711680 | -16711936 & param12 * var15_int) >>> 8;
                        param11 = param6 + param12;
                        param12 = (16711935 & param6) + (16711935 & param12);
                        param6 = (param12 & 16777472) - -(65536 & -param12 + param11);
                        int incrementValue$3 = param8;
                        param8++;
                        param0[incrementValue$3] = mp.a(-(param6 >>> 8) + param6, -param6 + param11);
                        break L3;
                      } else {
                        param8++;
                        break L3;
                      }
                    }
                    param13++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var15 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var15;
            stackOut_13_1 = new StringBuilder().append("he.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44).append(0).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44).append(param12).append(44).append(param13).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param14 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "The mysterious and sultry dark elf assassin knows that the quickest way to someone's heart is through their chest cavity. She has honed the art of assassination to perfection.";
        field_o = new int[]{74, 70, 73, 70, 0};
        field_n = "Unpacking animations";
        field_q = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
