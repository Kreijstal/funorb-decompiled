/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class so extends ae {
    private int field_n;
    private int field_i;
    private int field_m;
    private int field_q;
    private int field_p;
    private int field_u;
    static int field_r;
    static ja field_l;
    static th field_j;
    static ma field_t;
    static k field_k;
    private int field_v;
    static ao field_o;
    static long field_s;

    final void a(byte param0) {
        super.a((byte) -111);
        if (param0 >= -47) {
            String discarded$0 = so.a(true, -39, (CharSequence) null);
        }
        fk.field_n.a((br) this, false);
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
            if (null != ci.field_f) {
              L1: {
                if (param0 <= -69) {
                  break L1;
                } else {
                  field_t = null;
                  break L1;
                }
              }
              L2: {
                if (param1.toLowerCase().indexOf(ci.field_f.toLowerCase()) < 0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("so.K(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    public static void a() {
        field_l = null;
        field_j = null;
        field_t = null;
        field_k = null;
        field_o = null;
        int var1 = 62;
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.addMouseListener((java.awt.event.MouseListener) (Object) on.field_Z);
            int var2_int = 0;
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) on.field_Z);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) on.field_Z);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "so.R(" + (param0 != null ? "{...}" : "null") + ',' + 127 + ')');
        }
    }

    final static void d() {
        if (null == we.field_g) {
          uc.field_b = new String[4];
          uc.field_b[2] = wk.field_K;
          uc.field_b[3] = bb.field_h;
          uc.field_b[0] = nm.field_b;
          we.field_g = new String[51];
          uc.field_b[1] = ji.field_a;
          we.field_g[4] = cd.field_Lb;
          we.field_g[14] = jm.field_p;
          we.field_g[21] = r.field_d;
          we.field_g[1] = ua.field_K;
          we.field_g[12] = cd.field_Fb;
          we.field_g[16] = kj.field_s;
          we.field_g[18] = ci.field_h;
          we.field_g[13] = vk.field_K;
          we.field_g[6] = qo.field_t;
          we.field_g[0] = qk.field_f;
          we.field_g[19] = ah.field_b;
          we.field_g[5] = qo.field_t;
          we.field_g[15] = wf.field_n;
          we.field_g[45] = ZombieDawnMulti.field_F;
          we.field_g[20] = s.field_g;
          we.field_g[3] = fg.field_l;
          we.field_g[17] = aq.field_r;
          we.field_g[11] = ra.field_i;
          we.field_g[7] = qf.field_d;
          we.field_g[2] = r.field_b;
          we.field_g[36] = wl.field_i;
          we.field_g[39] = "Shouldn't See Me";
          we.field_g[35] = lq.field_a;
          we.field_g[49] = vl.field_j[1];
          we.field_g[50] = df.field_L;
          we.field_g[48] = vl.field_j[0];
          we.field_g[40] = eh.field_c;
          we.field_g[46] = lj.field_m;
          we.field_g[41] = ic.field_l;
          we.field_g[38] = cf.field_m;
          we.field_g[42] = u.field_j;
          we.field_g[47] = vn.field_d[0];
          we.field_g[37] = ce.field_g[0];
          gh.field_f = new String[63];
          we.field_g[44] = vg.field_f;
          we.field_g[43] = ec.field_a;
          we.field_g[34] = vi.field_a[0];
          gh.field_f[46] = we.field_i;
          gh.field_f[53] = pb.field_c;
          gh.field_f[54] = ok.field_t;
          gh.field_f[47] = og.field_S;
          gh.field_f[48] = vd.field_b;
          gh.field_f[52] = lc.field_i;
          gh.field_f[0] = ek.field_F;
          wq.field_g = new String[63][2];
          gh.field_f[11] = ed.field_e;
          gh.field_f[45] = db.field_d;
          gh.field_f[3] = lf.field_b;
          gh.field_f[55] = wn.field_s;
          gh.field_f[50] = w.field_n;
          gh.field_f[16] = cp.field_L;
          gh.field_f[15] = i.field_c;
          gh.field_f[12] = wi.field_m;
          gh.field_f[5] = wa.field_j;
          gh.field_f[14] = vm.field_jb;
          gh.field_f[38] = ic.field_b;
          gh.field_f[51] = eb.field_e;
          gh.field_f[34] = ic.field_i;
          gh.field_f[18] = ob.field_u;
          gh.field_f[59] = un.field_o;
          gh.field_f[7] = cd.field_Mb;
          gh.field_f[60] = uc.field_c;
          gh.field_f[49] = dg.field_O;
          gh.field_f[2] = hd.field_t;
          gh.field_f[4] = ul.field_d;
          gh.field_f[9] = wh.field_b;
          gh.field_f[32] = ZombieDawnMulti.field_M;
          gh.field_f[58] = me.field_j;
          gh.field_f[8] = cj.field_B;
          gh.field_f[35] = gj.field_c;
          gh.field_f[56] = rn.field_c;
          gh.field_f[10] = od.field_Eb;
          gh.field_f[61] = qc.field_w;
          gh.field_f[17] = k.field_h;
          gh.field_f[37] = df.field_G;
          gh.field_f[36] = fk.field_l;
          gh.field_f[13] = hf.field_a;
          gh.field_f[44] = kn.field_e;
          gh.field_f[57] = qp.field_r;
          gh.field_f[1] = rp.field_b;
          gh.field_f[6] = hc.field_a;
          gh.field_f[33] = cq.field_b;
          wq.field_g[0][0] = hb.field_a;
          wq.field_g[1][0] = jo.field_a;
          wq.field_g[2][0] = na.field_F;
          wq.field_g[3][0] = lm.field_jb;
          wq.field_g[4][0] = qf.field_e;
          wq.field_g[5][0] = ka.field_c;
          wq.field_g[6][0] = eb.field_i;
          wq.field_g[7][0] = s.field_d;
          wq.field_g[8][0] = sh.field_P;
          wq.field_g[9][0] = me.field_c;
          wq.field_g[10][0] = fn.field_j;
          wq.field_g[11][0] = wp.field_a;
          wq.field_g[12][0] = no.field_Kb;
          wq.field_g[13][0] = e.field_f;
          wq.field_g[14][0] = un.field_n;
          wq.field_g[15][0] = he.field_c;
          wq.field_g[16][0] = ha.field_h;
          wq.field_g[17][0] = bb.field_i;
          wq.field_g[18][0] = ti.field_Z;
          wq.field_g[61][0] = fk.field_o;
          wq.field_g[60][0] = og.field_P;
          wq.field_g[59][0] = hq.field_k;
          wq.field_g[58][0] = po.field_i;
          wq.field_g[57][0] = wi.field_p;
          wq.field_g[56][0] = em.field_V;
          wq.field_g[55][0] = h.field_F;
          wq.field_g[54][0] = df.field_O;
          wq.field_g[53][0] = ia.field_u;
          wq.field_g[52][0] = bb.field_m;
          wq.field_g[51][0] = nk.field_f;
          wq.field_g[50][0] = dl.field_d;
          wq.field_g[49][0] = sn.field_Sb;
          wq.field_g[48][0] = uf.field_d;
          wq.field_g[47][0] = cn.field_u;
          wq.field_g[46][0] = lm.field_ob;
          wq.field_g[45][0] = me.field_m;
          wq.field_g[44][0] = hn.field_b;
          wq.field_g[32][0] = ic.field_j;
          wq.field_g[33][0] = al.field_U;
          wq.field_g[34][0] = fa.field_Ob;
          wq.field_g[35][0] = dd.field_c;
          wq.field_g[36][0] = mn.field_s;
          wq.field_g[37][0] = uf.field_c;
          wq.field_g[38][0] = da.field_g;
          wq.field_g[0][1] = cj.field_db;
          wq.field_g[1][1] = op.field_j;
          wq.field_g[2][1] = cf.field_t;
          wq.field_g[3][1] = hi.field_Nb;
          wq.field_g[4][1] = ha.field_n;
          wq.field_g[5][1] = bl.field_d;
          wq.field_g[6][1] = lo.field_e;
          wq.field_g[7][1] = pa.field_bb;
          wq.field_g[8][1] = c.field_d;
          wq.field_g[9][1] = ge.field_ib;
          wq.field_g[10][1] = eo.field_c;
          wq.field_g[11][1] = nh.field_j;
          wq.field_g[12][1] = uc.field_d;
          wq.field_g[13][1] = rq.field_n;
          wq.field_g[14][1] = cc.field_d;
          wq.field_g[15][1] = pp.field_o;
          wq.field_g[16][1] = pl.field_D;
          wq.field_g[17][1] = fh.field_e;
          wq.field_g[18][1] = vf.field_a;
          wq.field_g[61][1] = lj.field_q;
          wq.field_g[60][1] = ih.field_b;
          wq.field_g[59][1] = vc.field_f;
          wq.field_g[58][1] = ok.field_i;
          wq.field_g[57][1] = tp.field_u;
          wq.field_g[56][1] = lh.field_a;
          wq.field_g[55][1] = ul.field_c;
          wq.field_g[54][1] = ul.field_h;
          wq.field_g[53][1] = cr.field_g;
          wq.field_g[52][1] = wj.field_j;
          wq.field_g[51][1] = qj.field_l;
          wq.field_g[50][1] = dd.field_b;
          wq.field_g[49][1] = fb.field_g;
          wq.field_g[48][1] = oj.field_O;
          wq.field_g[47][1] = ul.field_i;
          wq.field_g[46][1] = fe.field_X;
          wq.field_g[45][1] = ip.field_d;
          wq.field_g[44][1] = ff.field_q;
          wq.field_g[32][1] = cf.field_o;
          wq.field_g[33][1] = wl.field_g;
          wq.field_g[34][1] = vg.field_q;
          wq.field_g[35][1] = wq.field_e;
          wq.field_g[36][1] = va.field_b;
          wq.field_g[37][1] = cb.field_r;
          wq.field_g[38][1] = sk.field_q;
          return;
        } else {
          return;
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3 = no.a(param0, -107, param2);
          if (var3 != null) {
            stackOut_3_0 = (String) var3;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            var4 = 61 / ((param1 - 14) / 63);
            var5 = 0;
            L0: while (true) {
              if (param2.length() > var5) {
                if (!fl.a(-82, param2.charAt(var5))) {
                  stackOut_10_0 = um.field_i;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("so.H(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final static void a(int param0, long param1, int param2) {
        ga var4 = ma.field_a;
        var4.b((byte) -35, param2);
        var4.field_j = var4.field_j + 1;
        int var5 = var4.field_j;
        var4.a(-114, 6);
        var4.a(param1, true);
        var4.e(44, var4.field_j - var5);
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        RuntimeException var5 = null;
        cj var6 = null;
        cj var7 = null;
        cj var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        th var17 = null;
        int var17_int = 0;
        Object var18 = null;
        dm var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        cj var21 = null;
        int[] var22 = null;
        int[] var24 = null;
        cj var25 = null;
        int[] var26 = null;
        String var27 = null;
        String var28 = null;
        int[] var29 = null;
        cj stackIn_17_0 = null;
        cj stackIn_18_0 = null;
        cj stackIn_19_0 = null;
        cj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_36_0 = 0;
        cj stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        cj stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        cj stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        cj stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        cj stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        cj stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        cj stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        cj stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        cj stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        cj stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        cj stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        cj stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        cj stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        cj stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        cj stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int stackIn_165_2 = 0;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_16_0 = null;
        cj stackOut_17_0 = null;
        cj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        cj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        cj stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        cj stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        cj stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        cj stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        cj stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        cj stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        cj stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        cj stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        cj stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_158_2 = 0;
        cj stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_159_2 = 0;
        cj stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        cj stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        cj stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        cj stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        int stackOut_163_2 = 0;
        cj stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        int stackOut_164_2 = 0;
        var18 = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              mf.a(da.field_a, false);
              if (null != mh.field_c) {
                L2: {
                  jp.field_b.field_Z = true;
                  en.field_b.field_z = 0;
                  var21 = en.field_b;
                  var25 = var21;
                  var25.field_zb = 0;
                  var6 = gb.field_a;
                  gb.field_a.field_z = 0;
                  var6.field_zb = 0;
                  eb.field_B.field_z = 0;
                  var7 = eb.field_B;
                  var7.field_zb = 0;
                  if (!hl.b(0)) {
                    var9_ref_String = mh.field_c.field_Nb;
                    gg.field_m.field_wb = vl.a(ae.field_g, new String[1], 2).toUpperCase();
                    eb.field_B.a(40, fc.field_a.field_z + -40, fc.field_a.field_zb, 0, -3344);
                    eb.field_B.field_wb = vl.a(mp.field_a, new String[1], 2);
                    var8 = eb.field_B;
                    break L2;
                  } else {
                    L3: {
                      gg.field_m.field_wb = fn.field_l.toUpperCase();
                      var9 = (2 + fc.field_a.field_zb) / 2;
                      en.field_b.a(40, fc.field_a.field_z + -40, var9 - 2, 0, -3344);
                      if (mh.field_c.field_mc <= mh.field_c.field_cc) {
                        en.field_b.field_wb = ka.field_p.toUpperCase();
                        en.field_b.field_Z = false;
                        break L3;
                      } else {
                        en.field_b.field_wb = p.field_c.toUpperCase();
                        en.field_b.field_Z = true;
                        break L3;
                      }
                    }
                    L4: {
                      en.field_b.field_ab = he.field_i.field_ab;
                      if (cb.field_i > 0) {
                        L5: {
                          if (cb.field_i != 1) {
                            var10_ref_String = vl.a(uk.field_R, new String[1], 2);
                            break L5;
                          } else {
                            var10_ref_String = u.field_k;
                            break L5;
                          }
                        }
                        en.field_b.field_wb = en.field_b.field_wb + "<br>" + var10_ref_String;
                        if ((qj.field_i & 16) != 0) {
                          break L4;
                        } else {
                          if (!io.field_b) {
                            en.field_b.field_ab = he.field_i.field_X;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      L7: {
                        gb.field_a.a(40, -40 + fc.field_a.field_z, fc.field_a.field_zb - var9, var9, -3344);
                        gb.field_a.field_wb = qk.field_f.toUpperCase();
                        var8 = gb.field_a;
                        stackOut_16_0 = gb.field_a;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (!param3) {
                          break L7;
                        } else {
                          stackOut_17_0 = (cj) (Object) stackIn_17_0;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (0L != qi.field_c) {
                            break L7;
                          } else {
                            stackOut_18_0 = (cj) (Object) stackIn_18_0;
                            stackOut_18_1 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            break L6;
                          }
                        }
                      }
                      stackOut_19_0 = (cj) (Object) stackIn_19_0;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L6;
                    }
                    L8: {
                      L9: {
                        L10: {
                          stackIn_20_0.field_Z = stackIn_20_1 != 0;
                          var10 = 2;
                          if (iq.field_b == null) {
                            break L10;
                          } else {
                            L11: {
                              if (null != rl.field_v) {
                                break L11;
                              } else {
                                rl.field_v = new byte[kj.field_h];
                                ll.field_c = new boolean[kj.field_h];
                                break L11;
                              }
                            }
                            var11 = 0;
                            L12: while (true) {
                              if (var11 >= kj.field_h) {
                                var10 = 0;
                                L13: while (true) {
                                  if (var10 >= 2) {
                                    if (kj.field_q < 2) {
                                      break L10;
                                    } else {
                                      if (lc.field_m[12]) {
                                        var10 = 2;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  } else {
                                    var11 = 0;
                                    var12 = 0;
                                    L14: while (true) {
                                      if (iq.field_b.length <= var12) {
                                        if (var11 == 0) {
                                          var10++;
                                          continue L13;
                                        } else {
                                          L15: {
                                            if (kj.field_q < 2) {
                                              break L15;
                                            } else {
                                              if (lc.field_m[12]) {
                                                var10 = 2;
                                                break L15;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          if (var10 >= 2) {
                                            break L8;
                                          } else {
                                            gb.field_a.field_Z = false;
                                            if (gb.field_a.field_pb) {
                                              var11_ref = null;
                                              var12 = 0;
                                              var13 = 0;
                                              L16: while (true) {
                                                if (kj.field_h <= var13) {
                                                  break L9;
                                                } else {
                                                  L17: {
                                                    if (ll.field_c[var13]) {
                                                      var27 = "<col=A00000>" + cf.field_f[var13] + "</col>";
                                                      if (var11_ref == null) {
                                                        var11_ref = (Object) (Object) var27;
                                                        break L17;
                                                      } else {
                                                        var12 = 1;
                                                        var11_ref = (Object) (Object) ((String) var11_ref + ", " + var27);
                                                        break L17;
                                                      }
                                                    } else {
                                                      break L17;
                                                    }
                                                  }
                                                  var13++;
                                                  continue L16;
                                                }
                                              }
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                      } else {
                                        var29 = iq.field_b[var12];
                                        var26 = var29;
                                        var24 = var26;
                                        var22 = var24;
                                        var13_ref_int__ = var22;
                                        var14 = 0;
                                        L18: while (true) {
                                          L19: {
                                            if (var14 >= var29.length) {
                                              var11 = 1;
                                              var14 = -1;
                                              var15 = 0;
                                              L20: while (true) {
                                                if (var29.length <= var15) {
                                                  ll.field_c[var14] = true;
                                                  break L19;
                                                } else {
                                                  L21: {
                                                    var16 = var29[var15];
                                                    if (var16 > var14) {
                                                      var14 = var16;
                                                      break L21;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                  var15 += 2;
                                                  continue L20;
                                                }
                                              }
                                            } else {
                                              L22: {
                                                var15 = var29[var14];
                                                var16 = var13_ref_int__[var14 + 1];
                                                if (var15 != -1) {
                                                  if ((mh.field_c.field_Zb[var15] & 255) == var16) {
                                                    break L22;
                                                  } else {
                                                    break L19;
                                                  }
                                                } else {
                                                  L23: {
                                                    if (var10 == 0) {
                                                      stackOut_35_0 = mh.field_c.field_mc;
                                                      stackIn_36_0 = stackOut_35_0;
                                                      break L23;
                                                    } else {
                                                      stackOut_34_0 = mh.field_c.field_cc;
                                                      stackIn_36_0 = stackOut_34_0;
                                                      break L23;
                                                    }
                                                  }
                                                  var17_int = stackIn_36_0;
                                                  if (var17_int == var16) {
                                                    break L22;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              var14 += 2;
                                              continue L18;
                                            }
                                          }
                                          var12++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                ll.field_c[var11] = false;
                                var11++;
                                continue L12;
                              }
                            }
                          }
                        }
                        if (var10 >= 2) {
                          break L8;
                        } else {
                          gb.field_a.field_Z = false;
                          if (gb.field_a.field_pb) {
                            var11_ref = null;
                            var12 = 0;
                            var13 = 0;
                            L24: while (true) {
                              if (kj.field_h <= var13) {
                                break L9;
                              } else {
                                L25: {
                                  if (ll.field_c[var13]) {
                                    var28 = "<col=A00000>" + cf.field_f[var13] + "</col>";
                                    if (var11_ref == null) {
                                      var11_ref = (Object) (Object) var28;
                                      break L25;
                                    } else {
                                      var12 = 1;
                                      var11_ref = (Object) (Object) ((String) var11_ref + ", " + var28);
                                      break L25;
                                    }
                                  } else {
                                    break L25;
                                  }
                                }
                                var13++;
                                continue L24;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      L26: {
                        if (var10 == 0) {
                          var13_ref_String = ai.field_d;
                          if (var12 == 0) {
                            var14_ref_String = vl.a(wq.field_f, new String[1], 2);
                            break L26;
                          } else {
                            var14_ref_String = aq.field_n + (String) var11_ref;
                            break L26;
                          }
                        } else {
                          var13_ref_String = vb.field_e;
                          if (var12 == 0) {
                            var14_ref_String = vl.a(kn.field_d, new String[1], 2);
                            break L26;
                          } else {
                            var14_ref_String = lj.field_k + (String) var11_ref;
                            break L26;
                          }
                        }
                      }
                      ui.field_j = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                      break L2;
                    }
                    L27: {
                      if (null != ch.field_g) {
                        break L27;
                      } else {
                        if (sd.field_G != null) {
                          break L27;
                        } else {
                          if (r.field_c != null) {
                            break L27;
                          } else {
                            if (na.field_J != null) {
                              break L27;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    L28: while (true) {
                      if (kj.field_h <= var16) {
                        var16 = 0;
                        var17 = bf.field_n.field_Gb.field_Cb;
                        var18_ref = (dm) (Object) var17.c(81);
                        L29: while (true) {
                          L30: {
                            if (var18_ref == null) {
                              break L30;
                            } else {
                              L31: {
                                if (var18_ref.c((byte) 15)) {
                                  break L31;
                                } else {
                                  L32: {
                                    if (var11 == 0) {
                                      break L32;
                                    } else {
                                      if (!var18_ref.field_Nb) {
                                        var16 = 1;
                                        break L30;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  if (var13 <= var18_ref.field_Mb) {
                                    if (var14 > var18_ref.field_Sb) {
                                      var16 = 1;
                                      break L30;
                                    } else {
                                      if (-1 >= (var18_ref.field_Vb & var15)) {
                                        if (var12 == 0) {
                                          break L31;
                                        } else {
                                          var16 = 1;
                                          break L30;
                                        }
                                      } else {
                                        var16 = 1;
                                        break L30;
                                      }
                                    }
                                  } else {
                                    var16 = 1;
                                    break L30;
                                  }
                                }
                              }
                              var18_ref = (dm) (Object) var17.b(6);
                              continue L29;
                            }
                          }
                          L33: {
                            if (kj.field_q < 2) {
                              break L33;
                            } else {
                              if (!lc.field_m[12]) {
                                break L33;
                              } else {
                                var16 = 0;
                                break L33;
                              }
                            }
                          }
                          if (var16 == 0) {
                            break L2;
                          } else {
                            gb.field_a.field_Z = false;
                            if (gb.field_a.field_pb) {
                              if (em.field_U.field_c.field_Kb == 0) {
                                ui.field_j = ka.field_s;
                                break L2;
                              } else {
                                ui.field_j = vl.a(rn.field_b, new String[1], 2);
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      } else {
                        L34: {
                          var17_int = 255 & mh.field_c.field_Zb[var16];
                          if (null == ch.field_g) {
                            break L34;
                          } else {
                            if (ch.field_g[var16] != null) {
                              if (!ch.field_g[var16][var17_int]) {
                                break L34;
                              } else {
                                var11 = 1;
                                break L34;
                              }
                            } else {
                              break L34;
                            }
                          }
                        }
                        L35: {
                          if (null == sd.field_G) {
                            break L35;
                          } else {
                            if (sd.field_G[var16] != null) {
                              L36: {
                                var18_int = sd.field_G[var16][var17_int];
                                if (var18_int <= var13) {
                                  break L36;
                                } else {
                                  var13 = var18_int;
                                  break L36;
                                }
                              }
                              if (var18_int == 0) {
                                break L35;
                              } else {
                                if (!bo.field_e) {
                                  var11 = 1;
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                            } else {
                              break L35;
                            }
                          }
                        }
                        L37: {
                          if (na.field_J == null) {
                            break L37;
                          } else {
                            if (na.field_J[var16] == null) {
                              break L37;
                            } else {
                              var15 = var15 | na.field_J[var16][var17_int];
                              break L37;
                            }
                          }
                        }
                        L38: {
                          if (null == r.field_c) {
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        var16++;
                        continue L28;
                      }
                    }
                  }
                }
                L39: {
                  if (qi.field_c != 0L) {
                    L40: {
                      var9 = (int)(-bl.a((byte) 97) + qi.field_c);
                      var9 = (var9 - -999) / 1000;
                      if (var9 < 1) {
                        var9 = 1;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    var8.field_wb = vl.a(ge.field_pb, new String[1], 2);
                    break L39;
                  } else {
                    break L39;
                  }
                }
                fn.field_h.field_wb = vl.a(pb.field_g, new String[2], 2);
                break L1;
              } else {
                break L1;
              }
            }
            L41: {
              L42: {
                stackOut_150_0 = mh.field_i;
                stackOut_150_1 = -11838;
                stackIn_154_0 = stackOut_150_0;
                stackIn_154_1 = stackOut_150_1;
                stackIn_151_0 = stackOut_150_0;
                stackIn_151_1 = stackOut_150_1;
                if (!param1) {
                  break L42;
                } else {
                  stackOut_151_0 = (cj) (Object) stackIn_151_0;
                  stackOut_151_1 = stackIn_151_1;
                  stackIn_154_0 = stackOut_151_0;
                  stackIn_154_1 = stackOut_151_1;
                  stackIn_152_0 = stackOut_151_0;
                  stackIn_152_1 = stackOut_151_1;
                  if (param2) {
                    break L42;
                  } else {
                    stackOut_152_0 = (cj) (Object) stackIn_152_0;
                    stackOut_152_1 = stackIn_152_1;
                    stackIn_154_0 = stackOut_152_0;
                    stackIn_154_1 = stackOut_152_1;
                    stackIn_153_0 = stackOut_152_0;
                    stackIn_153_1 = stackOut_152_1;
                    if (io.field_b) {
                      break L42;
                    } else {
                      stackOut_153_0 = (cj) (Object) stackIn_153_0;
                      stackOut_153_1 = stackIn_153_1;
                      stackOut_153_2 = 1;
                      stackIn_155_0 = stackOut_153_0;
                      stackIn_155_1 = stackOut_153_1;
                      stackIn_155_2 = stackOut_153_2;
                      break L41;
                    }
                  }
                }
              }
              stackOut_154_0 = (cj) (Object) stackIn_154_0;
              stackOut_154_1 = stackIn_154_1;
              stackOut_154_2 = 0;
              stackIn_155_0 = stackOut_154_0;
              stackIn_155_1 = stackOut_154_1;
              stackIn_155_2 = stackOut_154_2;
              break L41;
            }
            L43: {
              L44: {
                ((cj) (Object) stackIn_155_0).a(stackIn_155_1, stackIn_155_2 != 0);
                stackOut_155_0 = fc.field_a;
                stackOut_155_1 = -11838;
                stackIn_159_0 = stackOut_155_0;
                stackIn_159_1 = stackOut_155_1;
                stackIn_156_0 = stackOut_155_0;
                stackIn_156_1 = stackOut_155_1;
                if (!param1) {
                  break L44;
                } else {
                  stackOut_156_0 = (cj) (Object) stackIn_156_0;
                  stackOut_156_1 = stackIn_156_1;
                  stackIn_159_0 = stackOut_156_0;
                  stackIn_159_1 = stackOut_156_1;
                  stackIn_157_0 = stackOut_156_0;
                  stackIn_157_1 = stackOut_156_1;
                  if (param2) {
                    break L44;
                  } else {
                    stackOut_157_0 = (cj) (Object) stackIn_157_0;
                    stackOut_157_1 = stackIn_157_1;
                    stackIn_159_0 = stackOut_157_0;
                    stackIn_159_1 = stackOut_157_1;
                    stackIn_158_0 = stackOut_157_0;
                    stackIn_158_1 = stackOut_157_1;
                    if (io.field_b) {
                      break L44;
                    } else {
                      stackOut_158_0 = (cj) (Object) stackIn_158_0;
                      stackOut_158_1 = stackIn_158_1;
                      stackOut_158_2 = 1;
                      stackIn_160_0 = stackOut_158_0;
                      stackIn_160_1 = stackOut_158_1;
                      stackIn_160_2 = stackOut_158_2;
                      break L43;
                    }
                  }
                }
              }
              stackOut_159_0 = (cj) (Object) stackIn_159_0;
              stackOut_159_1 = stackIn_159_1;
              stackOut_159_2 = 0;
              stackIn_160_0 = stackOut_159_0;
              stackIn_160_1 = stackOut_159_1;
              stackIn_160_2 = stackOut_159_2;
              break L43;
            }
            L45: {
              L46: {
                ((cj) (Object) stackIn_160_0).a(stackIn_160_1, stackIn_160_2 != 0);
                stackOut_160_0 = qf.field_b;
                stackOut_160_1 = -11838;
                stackIn_164_0 = stackOut_160_0;
                stackIn_164_1 = stackOut_160_1;
                stackIn_161_0 = stackOut_160_0;
                stackIn_161_1 = stackOut_160_1;
                if (!param1) {
                  break L46;
                } else {
                  stackOut_161_0 = (cj) (Object) stackIn_161_0;
                  stackOut_161_1 = stackIn_161_1;
                  stackIn_164_0 = stackOut_161_0;
                  stackIn_164_1 = stackOut_161_1;
                  stackIn_162_0 = stackOut_161_0;
                  stackIn_162_1 = stackOut_161_1;
                  if (param2) {
                    break L46;
                  } else {
                    stackOut_162_0 = (cj) (Object) stackIn_162_0;
                    stackOut_162_1 = stackIn_162_1;
                    stackIn_164_0 = stackOut_162_0;
                    stackIn_164_1 = stackOut_162_1;
                    stackIn_163_0 = stackOut_162_0;
                    stackIn_163_1 = stackOut_162_1;
                    if (!io.field_b) {
                      break L46;
                    } else {
                      stackOut_163_0 = (cj) (Object) stackIn_163_0;
                      stackOut_163_1 = stackIn_163_1;
                      stackOut_163_2 = 1;
                      stackIn_165_0 = stackOut_163_0;
                      stackIn_165_1 = stackOut_163_1;
                      stackIn_165_2 = stackOut_163_2;
                      break L45;
                    }
                  }
                }
              }
              stackOut_164_0 = (cj) (Object) stackIn_164_0;
              stackOut_164_1 = stackIn_164_1;
              stackOut_164_2 = 0;
              stackIn_165_0 = stackOut_164_0;
              stackIn_165_1 = stackOut_164_1;
              stackIn_165_2 = stackOut_164_2;
              break L45;
            }
            L47: {
              ((cj) (Object) stackIn_165_0).a(stackIn_165_1, stackIn_165_2 != 0);
              em.field_U.field_c.h(-40);
              if (null == mh.field_c) {
                break L47;
              } else {
                L48: {
                  if (jp.field_b.field_T != 0) {
                    ml.a(mh.field_c.i(6), 11, -76);
                    break L48;
                  } else {
                    break L48;
                  }
                }
                L49: {
                  if (0 == en.field_b.field_T) {
                    break L49;
                  } else {
                    io.field_b = true;
                    break L49;
                  }
                }
                L50: {
                  if (0 != gb.field_a.field_T) {
                    cf.field_r = true;
                    break L50;
                  } else {
                    break L50;
                  }
                }
                L51: {
                  if (pg.field_a.field_T == 0) {
                    break L51;
                  } else {
                    io.field_b = false;
                    break L51;
                  }
                }
                int discarded$2 = 1;
                int discarded$3 = 11;
                ld.a(mh.field_c, false);
                break L47;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var5, "so.N(" + 50 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + 11 + ')');
        }
    }

    final static boolean c() {
        lp var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        lp var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4 = (lp) (Object) we.field_k.c(74);
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_n) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L2: {
                    if (var4.field_m[var2] != null) {
                      if (0 != var4.field_m[var2].field_f) {
                        break L2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4.field_l[var2] != null) {
                      if (var4.field_l[var2].field_f == 0) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1_ref, "so.P(" + 1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!(((so) this).field_p != 1)) {
            return;
        }
        pb.field_e.c(Integer.toString(((so) this).field_f + -param3), ((so) this).field_q >> -param2 + 16, ((so) this).field_u >> 16 - param0, 4, -1);
        pb.field_e.c(Integer.toString(-param3 + ((so) this).field_f), -param2 + ((so) this).field_i, -param0 + ((so) this).field_m, 0, -1);
        if (!param1) {
            field_k = null;
        }
        oo.d(((so) this).field_q >> 16 + -param2, ((so) this).field_u >> 16 + -param0, ((so) this).field_i - param2, -param0 + ((so) this).field_m, 16711680, 10);
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param3--;
              if (param3 < 0) {
                break L0;
              } else {
                var9 = param0;
                var5 = var9;
                var6 = param2;
                var7 = param4;
                var9[var6] = var7 + tq.b(8355711, var9[var6] >> 1);
                param2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("so.I(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + true + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, qd param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.a(((so) this).field_v, ((so) this).field_q, false, ((so) this).field_m, ((so) this).field_n, ((so) this).field_u, ((so) this).field_p, ((so) this).field_i);
              if (param0 == 0) {
                break L1;
              } else {
                boolean discarded$2 = so.a(-46, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("so.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        if (param7) {
            ((so) this).a((byte) 113);
        }
        super.a(0, param2);
        ((so) this).field_p = param8;
        ((so) this).field_n = param3;
        ((so) this).field_v = param0;
        ((so) this).field_q = param1;
        ((so) this).field_u = param4;
        ((so) this).field_m = param5;
        ((so) this).field_i = param6;
    }

    so() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new th();
        field_t = new ma();
        field_o = new ao(2, 4, 4, 0);
    }
}
