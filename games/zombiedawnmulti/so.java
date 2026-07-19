/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        String discarded$0 = null;
        super.a((byte) -111);
        if (param0 >= -47) {
            discarded$0 = so.a(true, -39, (CharSequence) null);
        }
        fk.field_n.a((br) (this), false);
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
        int decompiledRegionSelector0 = 0;
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
                  field_t = (ma) null;
                  break L1;
                }
              }
              L2: {
                if ((param1.toLowerCase().indexOf(ci.field_f.toLowerCase()) ^ -1) > -1) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("so.K(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_t = null;
        field_k = null;
        field_o = null;
        int var1 = -125 / ((param0 - -13) / 41);
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.addMouseListener(on.field_Z);
            int var2_int = 51 % ((param1 - 75) / 47);
            param0.addMouseMotionListener(on.field_Z);
            param0.addFocusListener(on.field_Z);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "so.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void d(int param0) {
        if (null == we.field_g) {
          L0: {
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
            if (param0 == -6445) {
              break L0;
            } else {
              so.a(-95);
              break L0;
            }
          }
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
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = no.a(param0, -107, param2);
            if (var3 != null) {
              stackOut_3_0 = (String) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 61 / ((param1 - 14) / 63);
              var5 = 0;
              L1: while (true) {
                if ((param2.length() ^ -1) < (var5 ^ -1)) {
                  if (!fl.a(-82, param2.charAt(var5))) {
                    stackOut_10_0 = um.field_i;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5++;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      stackOut_13_0 = null;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("so.H(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return (String) ((Object) stackIn_14_0);
          }
        }
    }

    final static void a(int param0, long param1, int param2) {
        ga var4 = ma.field_a;
        var4.b((byte) -35, param2);
        var4.field_j = var4.field_j + 1;
        int var5 = var4.field_j;
        if (param0 != -21148) {
            return;
        }
        var4.a(param0 + 21034, 6);
        var4.a(param1, true);
        var4.e(44, var4.field_j - var5);
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
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
        int[] var20 = null;
        cj var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        cj var26 = null;
        cj stackIn_18_0 = null;
        cj stackIn_19_0 = null;
        cj stackIn_20_0 = null;
        cj stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_71_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_88_0 = 0;
        Object stackIn_104_0 = null;
        boolean stackIn_135_0 = false;
        int stackIn_151_0 = 0;
        cj stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        cj stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        cj stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        cj stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        cj stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        int stackIn_177_2 = 0;
        cj stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        cj stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        cj stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        cj stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        cj stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        int stackIn_182_2 = 0;
        cj stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        cj stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        cj stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        cj stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        cj stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        int stackIn_187_2 = 0;
        Object stackIn_188_0 = null;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_17_0 = null;
        cj stackOut_18_0 = null;
        cj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        cj stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_70_0 = 0;
        boolean stackOut_80_0 = false;
        int stackOut_87_0 = 0;
        Object stackOut_103_0 = null;
        boolean stackOut_134_0 = false;
        int stackOut_150_0 = 0;
        cj stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        cj stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        cj stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        cj stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        int stackOut_175_2 = 0;
        cj stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        int stackOut_176_2 = 0;
        cj stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        cj stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        cj stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        cj stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        int stackOut_180_2 = 0;
        cj stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        int stackOut_181_2 = 0;
        cj stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        cj stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        cj stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        cj stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        cj stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        Object stackOut_187_0 = null;
        var18 = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                mf.a(da.field_a, false);
                if (null != mh.field_c) {
                  L3: {
                    L4: {
                      jp.field_b.field_Z = true;
                      en.field_b.field_z = 0;
                      var22 = en.field_b;
                      var26 = var22;
                      var26.field_zb = 0;
                      var6 = gb.field_a;
                      gb.field_a.field_z = 0;
                      var6.field_zb = 0;
                      eb.field_B.field_z = 0;
                      var7 = eb.field_B;
                      var7.field_zb = 0;
                      if (!hl.b(0)) {
                        break L4;
                      } else {
                        L5: {
                          L6: {
                            gg.field_m.field_wb = fn.field_l.toUpperCase();
                            var9 = (2 + fc.field_a.field_zb) / 2;
                            en.field_b.a(40, fc.field_a.field_z + -40, var9 - 2, 0, -3344);
                            if ((mh.field_c.field_mc ^ -1) >= (mh.field_c.field_cc ^ -1)) {
                              break L6;
                            } else {
                              en.field_b.field_wb = p.field_c.toUpperCase();
                              en.field_b.field_Z = true;
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          en.field_b.field_wb = ka.field_p.toUpperCase();
                          en.field_b.field_Z = false;
                          break L5;
                        }
                        L7: {
                          en.field_b.field_ab = he.field_i.field_ab;
                          if (cb.field_i > 0) {
                            L8: {
                              L9: {
                                if (cb.field_i != 1) {
                                  break L9;
                                } else {
                                  var10_ref_String = u.field_k;
                                  if (var19 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var10_ref_String = vl.a(uk.field_R, new String[]{Integer.toString(cb.field_i)}, 2);
                              break L8;
                            }
                            en.field_b.field_wb = en.field_b.field_wb + "<br>" + var10_ref_String;
                            if ((qj.field_i & 16) != 0) {
                              break L7;
                            } else {
                              if (!io.field_b) {
                                en.field_b.field_ab = he.field_i.field_X;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        L10: {
                          L11: {
                            gb.field_a.a(40, -40 + fc.field_a.field_z, fc.field_a.field_zb - var9, var9, -3344);
                            gb.field_a.field_wb = qk.field_f.toUpperCase();
                            var8 = gb.field_a;
                            stackOut_17_0 = gb.field_a;
                            stackIn_20_0 = stackOut_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            if (!param3) {
                              break L11;
                            } else {
                              stackOut_18_0 = (cj) ((Object) stackIn_18_0);
                              stackIn_20_0 = stackOut_18_0;
                              stackIn_19_0 = stackOut_18_0;
                              if (0L != qi.field_c) {
                                break L11;
                              } else {
                                stackOut_19_0 = (cj) ((Object) stackIn_19_0);
                                stackOut_19_1 = 1;
                                stackIn_21_0 = stackOut_19_0;
                                stackIn_21_1 = stackOut_19_1;
                                break L10;
                              }
                            }
                          }
                          stackOut_20_0 = (cj) ((Object) stackIn_20_0);
                          stackOut_20_1 = 0;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          break L10;
                        }
                        L12: {
                          stackIn_21_0.field_Z = stackIn_21_1 != 0;
                          var10 = 2;
                          if (iq.field_b == null) {
                            break L12;
                          } else {
                            L13: {
                              if (null != rl.field_v) {
                                break L13;
                              } else {
                                rl.field_v = new byte[kj.field_h];
                                ll.field_c = new boolean[kj.field_h];
                                break L13;
                              }
                            }
                            var11 = 0;
                            L14: while (true) {
                              L15: {
                                L16: {
                                  if ((var11 ^ -1) <= (kj.field_h ^ -1)) {
                                    break L16;
                                  } else {
                                    ll.field_c[var11] = false;
                                    var11++;
                                    if (var19 != 0) {
                                      break L15;
                                    } else {
                                      if (var19 == 0) {
                                        continue L14;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                var10 = 0;
                                break L15;
                              }
                              L17: while (true) {
                                L18: {
                                  L19: {
                                    if (-3 >= (var10 ^ -1)) {
                                      break L19;
                                    } else {
                                      var11 = 0;
                                      stackOut_32_0 = 0;
                                      stackIn_71_0 = stackOut_32_0;
                                      stackIn_33_0 = stackOut_32_0;
                                      if (var19 != 0) {
                                        break L18;
                                      } else {
                                        var12 = stackIn_33_0;
                                        L20: while (true) {
                                          stackOut_34_0 = iq.field_b.length;
                                          stackOut_34_1 = var12;
                                          stackIn_35_0 = stackOut_34_0;
                                          stackIn_35_1 = stackOut_34_1;
                                          L21: while (true) {
                                            L22: {
                                              L23: {
                                                if (stackIn_35_0 <= stackIn_35_1) {
                                                  break L23;
                                                } else {
                                                  var25 = iq.field_b[var12];
                                                  var23 = var25;
                                                  var20 = var23;
                                                  var13_ref_int__ = var20;
                                                  stackOut_36_0 = 0;
                                                  stackIn_65_0 = stackOut_36_0;
                                                  stackIn_37_0 = stackOut_36_0;
                                                  if (var19 != 0) {
                                                    break L22;
                                                  } else {
                                                    var14 = stackIn_37_0;
                                                    L24: while (true) {
                                                      L25: {
                                                        L26: {
                                                          L27: {
                                                            if (var14 >= var25.length) {
                                                              break L27;
                                                            } else {
                                                              var15 = var25[var14];
                                                              var16 = var20[var14 + 1];
                                                              stackOut_39_0 = var15;
                                                              stackOut_39_1 = -1;
                                                              stackIn_56_0 = stackOut_39_0;
                                                              stackIn_56_1 = stackOut_39_1;
                                                              stackIn_40_0 = stackOut_39_0;
                                                              stackIn_40_1 = stackOut_39_1;
                                                              if (var19 != 0) {
                                                                break L26;
                                                              } else {
                                                                L28: {
                                                                  L29: {
                                                                    if (stackIn_40_0 != stackIn_40_1) {
                                                                      break L29;
                                                                    } else {
                                                                      L30: {
                                                                        if ((var10 ^ -1) == -1) {
                                                                          stackOut_43_0 = mh.field_c.field_mc;
                                                                          stackIn_44_0 = stackOut_43_0;
                                                                          break L30;
                                                                        } else {
                                                                          stackOut_42_0 = mh.field_c.field_cc;
                                                                          stackIn_44_0 = stackOut_42_0;
                                                                          break L30;
                                                                        }
                                                                      }
                                                                      L31: {
                                                                        var17_int = stackIn_44_0;
                                                                        if (var17_int == var16) {
                                                                          break L31;
                                                                        } else {
                                                                          if (var19 == 0) {
                                                                            break L25;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var19 == 0) {
                                                                        break L28;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                  }
                                                                  if ((mh.field_c.field_Zb[var15] & 255 ^ -1) == (var16 ^ -1)) {
                                                                    break L28;
                                                                  } else {
                                                                    if (var19 == 0) {
                                                                      break L25;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                }
                                                                var14 += 2;
                                                                if (var19 == 0) {
                                                                  continue L24;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var11 = 1;
                                                          var14 = -1;
                                                          var15 = 0;
                                                          stackOut_55_0 = var25.length ^ -1;
                                                          stackOut_55_1 = var15 ^ -1;
                                                          stackIn_56_0 = stackOut_55_0;
                                                          stackIn_56_1 = stackOut_55_1;
                                                          break L26;
                                                        }
                                                        L32: while (true) {
                                                          L33: {
                                                            if (stackIn_56_0 >= stackIn_56_1) {
                                                              break L33;
                                                            } else {
                                                              var16 = var25[var15];
                                                              stackOut_57_0 = var16;
                                                              stackOut_57_1 = var14;
                                                              stackIn_35_0 = stackOut_57_0;
                                                              stackIn_35_1 = stackOut_57_1;
                                                              stackIn_58_0 = stackOut_57_0;
                                                              stackIn_58_1 = stackOut_57_1;
                                                              if (var19 != 0) {
                                                                continue L21;
                                                              } else {
                                                                L34: {
                                                                  if (stackIn_58_0 > stackIn_58_1) {
                                                                    var14 = var16;
                                                                    break L34;
                                                                  } else {
                                                                    break L34;
                                                                  }
                                                                }
                                                                var15 += 2;
                                                                if (var19 == 0) {
                                                                  stackOut_55_0 = var25.length ^ -1;
                                                                  stackOut_55_1 = var15 ^ -1;
                                                                  stackIn_56_0 = stackOut_55_0;
                                                                  stackIn_56_1 = stackOut_55_1;
                                                                  continue L32;
                                                                } else {
                                                                  break L33;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          ll.field_c[var14] = true;
                                                          break L25;
                                                        }
                                                      }
                                                      var12++;
                                                      if (var19 == 0) {
                                                        continue L20;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_64_0 = var11;
                                              stackIn_65_0 = stackOut_64_0;
                                              break L22;
                                            }
                                            L35: {
                                              if (stackIn_65_0 == 0) {
                                                break L35;
                                              } else {
                                                if (var19 == 0) {
                                                  break L19;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                            var10++;
                                            if (var19 == 0) {
                                              continue L17;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_70_0 = kj.field_q;
                                  stackIn_71_0 = stackOut_70_0;
                                  break L18;
                                }
                                if (stackIn_71_0 < 2) {
                                  break L12;
                                } else {
                                  if (lc.field_m[12]) {
                                    var10 = 2;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L36: {
                          L37: {
                            if (var10 >= 2) {
                              break L37;
                            } else {
                              gb.field_a.field_Z = false;
                              if (gb.field_a.field_pb) {
                                var11_ref = null;
                                var12 = 0;
                                var13 = 0;
                                L38: while (true) {
                                  L39: {
                                    L40: {
                                      if ((kj.field_h ^ -1) >= (var13 ^ -1)) {
                                        break L40;
                                      } else {
                                        stackOut_80_0 = ll.field_c[var13];
                                        stackIn_88_0 = stackOut_80_0 ? 1 : 0;
                                        stackIn_81_0 = stackOut_80_0;
                                        if (var19 != 0) {
                                          break L39;
                                        } else {
                                          L41: {
                                            if (stackIn_81_0) {
                                              L42: {
                                                var24 = "<col=A00000>" + cf.field_f[var13] + "</col>";
                                                if (var11_ref == null) {
                                                  break L42;
                                                } else {
                                                  var12 = 1;
                                                  var11_ref = (String) (var11_ref) + ", " + var24;
                                                  if (var19 == 0) {
                                                    break L41;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                              var11_ref = var24;
                                              break L41;
                                            } else {
                                              break L41;
                                            }
                                          }
                                          var13++;
                                          if (var19 == 0) {
                                            continue L38;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_87_0 = -1;
                                    stackIn_88_0 = stackOut_87_0;
                                    break L39;
                                  }
                                  L43: {
                                    if (stackIn_88_0 == (var10 ^ -1)) {
                                      L44: {
                                        var13_ref_String = ai.field_d;
                                        if (var12 == 0) {
                                          break L44;
                                        } else {
                                          var14_ref_String = aq.field_n + (String) (var11_ref);
                                          if (var19 == 0) {
                                            break L43;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                      var14_ref_String = vl.a(wq.field_f, new String[]{(String) (var11_ref)}, 2);
                                      break L43;
                                    } else {
                                      L45: {
                                        var13_ref_String = vb.field_e;
                                        if (var12 == 0) {
                                          break L45;
                                        } else {
                                          var14_ref_String = lj.field_k + (String) (var11_ref);
                                          if (var19 == 0) {
                                            break L43;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                      var14_ref_String = vl.a(kn.field_d, new String[]{(String) (var11_ref)}, param0 + -48);
                                      break L43;
                                    }
                                  }
                                  ui.field_j = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                                  if (var19 == 0) {
                                    break L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              } else {
                                break L36;
                              }
                            }
                          }
                          L46: {
                            if (null != ch.field_g) {
                              break L46;
                            } else {
                              if (sd.field_G != null) {
                                break L46;
                              } else {
                                if (r.field_c != null) {
                                  break L46;
                                } else {
                                  if (na.field_J != null) {
                                    break L46;
                                  } else {
                                    break L36;
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
                          L47: while (true) {
                            L48: {
                              if ((kj.field_h ^ -1) >= (var16 ^ -1)) {
                                break L48;
                              } else {
                                var17_int = 255 & mh.field_c.field_Zb[var16];
                                stackOut_103_0 = null;
                                stackIn_188_0 = stackOut_103_0;
                                stackIn_104_0 = stackOut_103_0;
                                if (var19 != 0) {
                                  break L1;
                                } else {
                                  L49: {
                                    if (stackIn_104_0 == ch.field_g) {
                                      break L49;
                                    } else {
                                      if (ch.field_g[var16] != null) {
                                        if (!ch.field_g[var16][var17_int]) {
                                          break L49;
                                        } else {
                                          var11 = 1;
                                          break L49;
                                        }
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                  L50: {
                                    if (null == sd.field_G) {
                                      break L50;
                                    } else {
                                      if (sd.field_G[var16] != null) {
                                        L51: {
                                          var18_int = sd.field_G[var16][var17_int];
                                          if (var18_int <= var13) {
                                            break L51;
                                          } else {
                                            var13 = var18_int;
                                            break L51;
                                          }
                                        }
                                        if (-1 == (var18_int ^ -1)) {
                                          break L50;
                                        } else {
                                          if (!bo.field_e) {
                                            var11 = 1;
                                            break L50;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  L52: {
                                    if (na.field_J == null) {
                                      break L52;
                                    } else {
                                      if (na.field_J[var16] == null) {
                                        break L52;
                                      } else {
                                        var15 = var15 | na.field_J[var16][var17_int];
                                        break L52;
                                      }
                                    }
                                  }
                                  L53: {
                                    if (null == r.field_c) {
                                      break L53;
                                    } else {
                                      if (r.field_c[var16] != null) {
                                        L54: {
                                          var18_int = r.field_c[var16][var17_int];
                                          if (var18_int == 0) {
                                            break L54;
                                          } else {
                                            if (!bo.field_e) {
                                              var11 = 1;
                                              break L54;
                                            } else {
                                              break L54;
                                            }
                                          }
                                        }
                                        if (var14 < var18_int) {
                                          var14 = var18_int;
                                          break L53;
                                        } else {
                                          break L53;
                                        }
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                  var16++;
                                  if (var19 == 0) {
                                    continue L47;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                            var16 = 0;
                            var17 = bf.field_n.field_Gb.field_Cb;
                            var18_ref = (dm) ((Object) var17.c(81));
                            L55: while (true) {
                              L56: {
                                L57: {
                                  if (var18_ref == null) {
                                    break L57;
                                  } else {
                                    stackOut_134_0 = var18_ref.c((byte) 15);
                                    stackIn_151_0 = stackOut_134_0 ? 1 : 0;
                                    stackIn_135_0 = stackOut_134_0;
                                    if (var19 != 0) {
                                      break L56;
                                    } else {
                                      L58: {
                                        if (stackIn_135_0) {
                                          break L58;
                                        } else {
                                          L59: {
                                            if (var11 == 0) {
                                              break L59;
                                            } else {
                                              if (!var18_ref.field_Nb) {
                                                var16 = 1;
                                                if (var19 == 0) {
                                                  break L57;
                                                } else {
                                                  break L59;
                                                }
                                              } else {
                                                break L59;
                                              }
                                            }
                                          }
                                          L60: {
                                            if ((var13 ^ -1) >= (var18_ref.field_Mb ^ -1)) {
                                              break L60;
                                            } else {
                                              var16 = 1;
                                              if (var19 == 0) {
                                                break L57;
                                              } else {
                                                break L60;
                                              }
                                            }
                                          }
                                          L61: {
                                            if ((var14 ^ -1) < (var18_ref.field_Sb ^ -1)) {
                                              var16 = 1;
                                              if (var19 == 0) {
                                                break L57;
                                              } else {
                                                break L61;
                                              }
                                            } else {
                                              break L61;
                                            }
                                          }
                                          L62: {
                                            if (-1 <= ((var18_ref.field_Vb ^ -1) & var15 ^ -1)) {
                                              break L62;
                                            } else {
                                              var16 = 1;
                                              if (var19 == 0) {
                                                break L57;
                                              } else {
                                                break L62;
                                              }
                                            }
                                          }
                                          if (var12 == 0) {
                                            break L58;
                                          } else {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L57;
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                      }
                                      var18_ref = (dm) ((Object) var17.b(6));
                                      if (var19 == 0) {
                                        continue L55;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                }
                                stackOut_150_0 = kj.field_q ^ -1;
                                stackIn_151_0 = stackOut_150_0;
                                break L56;
                              }
                              L63: {
                                if (stackIn_151_0 > -3) {
                                  break L63;
                                } else {
                                  if (!lc.field_m[12]) {
                                    break L63;
                                  } else {
                                    var16 = 0;
                                    break L63;
                                  }
                                }
                              }
                              if (var16 == 0) {
                                break L36;
                              } else {
                                gb.field_a.field_Z = false;
                                if (gb.field_a.field_pb) {
                                  L64: {
                                    if (em.field_U.field_c.field_Kb == 0) {
                                      break L64;
                                    } else {
                                      ui.field_j = vl.a(rn.field_b, new String[]{l.field_d}, 2);
                                      if (var19 == 0) {
                                        break L36;
                                      } else {
                                        break L64;
                                      }
                                    }
                                  }
                                  ui.field_j = ka.field_s;
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                            }
                          }
                        }
                        if (var19 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9_ref_String = mh.field_c.field_Nb;
                    gg.field_m.field_wb = vl.a(ae.field_g, new String[]{var9_ref_String}, 2).toUpperCase();
                    eb.field_B.a(40, fc.field_a.field_z + -40, fc.field_a.field_zb, 0, -3344);
                    eb.field_B.field_wb = vl.a(mp.field_a, new String[]{var9_ref_String}, 2);
                    var8 = eb.field_B;
                    break L3;
                  }
                  L65: {
                    if (qi.field_c != 0L) {
                      L66: {
                        var9 = (int)(-bl.a((byte) 97) + qi.field_c);
                        var9 = (var9 - -999) / 1000;
                        if ((var9 ^ -1) > -2) {
                          var9 = 1;
                          break L66;
                        } else {
                          break L66;
                        }
                      }
                      var8.field_wb = vl.a(ge.field_pb, new String[]{Integer.toString(var9)}, param0 ^ 48);
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  fn.field_h.field_wb = vl.a(pb.field_g, new String[]{Integer.toString(mh.field_c.field_cc), Integer.toString(mh.field_c.field_mc)}, 2);
                  break L2;
                } else {
                  break L2;
                }
              }
              L67: {
                if (param0 == 50) {
                  break L67;
                } else {
                  field_t = (ma) null;
                  break L67;
                }
              }
              L68: {
                L69: {
                  stackOut_172_0 = mh.field_i;
                  stackOut_172_1 = -11838;
                  stackIn_176_0 = stackOut_172_0;
                  stackIn_176_1 = stackOut_172_1;
                  stackIn_173_0 = stackOut_172_0;
                  stackIn_173_1 = stackOut_172_1;
                  if (!param1) {
                    break L69;
                  } else {
                    stackOut_173_0 = (cj) ((Object) stackIn_173_0);
                    stackOut_173_1 = stackIn_173_1;
                    stackIn_176_0 = stackOut_173_0;
                    stackIn_176_1 = stackOut_173_1;
                    stackIn_174_0 = stackOut_173_0;
                    stackIn_174_1 = stackOut_173_1;
                    if (param2) {
                      break L69;
                    } else {
                      stackOut_174_0 = (cj) ((Object) stackIn_174_0);
                      stackOut_174_1 = stackIn_174_1;
                      stackIn_176_0 = stackOut_174_0;
                      stackIn_176_1 = stackOut_174_1;
                      stackIn_175_0 = stackOut_174_0;
                      stackIn_175_1 = stackOut_174_1;
                      if (io.field_b) {
                        break L69;
                      } else {
                        stackOut_175_0 = (cj) ((Object) stackIn_175_0);
                        stackOut_175_1 = stackIn_175_1;
                        stackOut_175_2 = 1;
                        stackIn_177_0 = stackOut_175_0;
                        stackIn_177_1 = stackOut_175_1;
                        stackIn_177_2 = stackOut_175_2;
                        break L68;
                      }
                    }
                  }
                }
                stackOut_176_0 = (cj) ((Object) stackIn_176_0);
                stackOut_176_1 = stackIn_176_1;
                stackOut_176_2 = 0;
                stackIn_177_0 = stackOut_176_0;
                stackIn_177_1 = stackOut_176_1;
                stackIn_177_2 = stackOut_176_2;
                break L68;
              }
              L70: {
                L71: {
                  ((cj) (Object) stackIn_177_0).a(stackIn_177_1, stackIn_177_2 != 0);
                  stackOut_177_0 = fc.field_a;
                  stackOut_177_1 = -11838;
                  stackIn_181_0 = stackOut_177_0;
                  stackIn_181_1 = stackOut_177_1;
                  stackIn_178_0 = stackOut_177_0;
                  stackIn_178_1 = stackOut_177_1;
                  if (!param1) {
                    break L71;
                  } else {
                    stackOut_178_0 = (cj) ((Object) stackIn_178_0);
                    stackOut_178_1 = stackIn_178_1;
                    stackIn_181_0 = stackOut_178_0;
                    stackIn_181_1 = stackOut_178_1;
                    stackIn_179_0 = stackOut_178_0;
                    stackIn_179_1 = stackOut_178_1;
                    if (param2) {
                      break L71;
                    } else {
                      stackOut_179_0 = (cj) ((Object) stackIn_179_0);
                      stackOut_179_1 = stackIn_179_1;
                      stackIn_181_0 = stackOut_179_0;
                      stackIn_181_1 = stackOut_179_1;
                      stackIn_180_0 = stackOut_179_0;
                      stackIn_180_1 = stackOut_179_1;
                      if (io.field_b) {
                        break L71;
                      } else {
                        stackOut_180_0 = (cj) ((Object) stackIn_180_0);
                        stackOut_180_1 = stackIn_180_1;
                        stackOut_180_2 = 1;
                        stackIn_182_0 = stackOut_180_0;
                        stackIn_182_1 = stackOut_180_1;
                        stackIn_182_2 = stackOut_180_2;
                        break L70;
                      }
                    }
                  }
                }
                stackOut_181_0 = (cj) ((Object) stackIn_181_0);
                stackOut_181_1 = stackIn_181_1;
                stackOut_181_2 = 0;
                stackIn_182_0 = stackOut_181_0;
                stackIn_182_1 = stackOut_181_1;
                stackIn_182_2 = stackOut_181_2;
                break L70;
              }
              L72: {
                L73: {
                  ((cj) (Object) stackIn_182_0).a(stackIn_182_1, stackIn_182_2 != 0);
                  stackOut_182_0 = qf.field_b;
                  stackOut_182_1 = -11838;
                  stackIn_186_0 = stackOut_182_0;
                  stackIn_186_1 = stackOut_182_1;
                  stackIn_183_0 = stackOut_182_0;
                  stackIn_183_1 = stackOut_182_1;
                  if (!param1) {
                    break L73;
                  } else {
                    stackOut_183_0 = (cj) ((Object) stackIn_183_0);
                    stackOut_183_1 = stackIn_183_1;
                    stackIn_186_0 = stackOut_183_0;
                    stackIn_186_1 = stackOut_183_1;
                    stackIn_184_0 = stackOut_183_0;
                    stackIn_184_1 = stackOut_183_1;
                    if (param2) {
                      break L73;
                    } else {
                      stackOut_184_0 = (cj) ((Object) stackIn_184_0);
                      stackOut_184_1 = stackIn_184_1;
                      stackIn_186_0 = stackOut_184_0;
                      stackIn_186_1 = stackOut_184_1;
                      stackIn_185_0 = stackOut_184_0;
                      stackIn_185_1 = stackOut_184_1;
                      if (!io.field_b) {
                        break L73;
                      } else {
                        stackOut_185_0 = (cj) ((Object) stackIn_185_0);
                        stackOut_185_1 = stackIn_185_1;
                        stackOut_185_2 = 1;
                        stackIn_187_0 = stackOut_185_0;
                        stackIn_187_1 = stackOut_185_1;
                        stackIn_187_2 = stackOut_185_2;
                        break L72;
                      }
                    }
                  }
                }
                stackOut_186_0 = (cj) ((Object) stackIn_186_0);
                stackOut_186_1 = stackIn_186_1;
                stackOut_186_2 = 0;
                stackIn_187_0 = stackOut_186_0;
                stackIn_187_1 = stackOut_186_1;
                stackIn_187_2 = stackOut_186_2;
                break L72;
              }
              ((cj) (Object) stackIn_187_0).a(stackIn_187_1, stackIn_187_2 != 0);
              em.field_U.field_c.h(-40);
              stackOut_187_0 = null;
              stackIn_188_0 = stackOut_187_0;
              break L1;
            }
            L74: {
              if (stackIn_188_0 == mh.field_c) {
                break L74;
              } else {
                L75: {
                  if (jp.field_b.field_T != 0) {
                    ml.a(mh.field_c.i(6), param4, -76);
                    break L75;
                  } else {
                    break L75;
                  }
                }
                L76: {
                  if (0 == en.field_b.field_T) {
                    break L76;
                  } else {
                    io.field_b = true;
                    break L76;
                  }
                }
                L77: {
                  if (0 != gb.field_a.field_T) {
                    cf.field_r = true;
                    break L77;
                  } else {
                    break L77;
                  }
                }
                L78: {
                  if (-1 == (pg.field_a.field_T ^ -1)) {
                    break L78;
                  } else {
                    io.field_b = false;
                    break L78;
                  }
                }
                ld.a(mh.field_c, false, param4, 1);
                break L74;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5), "so.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean c(int param0) {
        lp var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        lp var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4 = (lp) ((Object) we.field_k.c(74));
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2 >= var1.field_n) {
                      break L3;
                    } else {
                      if (var3 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var4.field_m[var2] != null) {
                            if (0 != var4.field_m[var2].field_f) {
                              break L4;
                            } else {
                              stackOut_10_0 = 0;
                              stackIn_11_0 = stackOut_10_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (var4.field_l[var2] != null) {
                            if (var4.field_l[var2].field_f == 0) {
                              stackOut_16_0 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var2++;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 == 1) {
                    break L2;
                  } else {
                    field_k = (k) null;
                    return true;
                  }
                }
                stackOut_21_0 = 1;
                stackIn_22_0 = stackOut_21_0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "so.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!((this.field_p ^ -1) != -2)) {
            return;
        }
        pb.field_e.c(Integer.toString(this.field_f + -param3), this.field_q >> -param2 + 16, this.field_u >> 16 - param0, 4, -1);
        pb.field_e.c(Integer.toString(-param3 + this.field_f), -param2 + this.field_i, -param0 + this.field_m, 0, -1);
        if (!param1) {
            field_k = (k) null;
        }
        oo.d(this.field_q >> 16 + -param2, this.field_u >> 16 + -param0, this.field_i - param2, -param0 + this.field_m, 16711680, 10);
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    param3--;
                    if (-1 < (param3 ^ -1)) {
                      break L4;
                    } else {
                      var9 = param0;
                      var5 = var9;
                      var6 = param2;
                      var7 = param4;
                      var9[var6] = var7 + tq.b(8355711, var9[var6] >> 1435928705);
                      param2++;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1) {
                    break L3;
                  } else {
                    field_k = (k) null;
                    break L2;
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5_ref);
            stackOut_8_1 = new StringBuilder().append("so.I(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L5;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, qd param1) {
        boolean discarded$0 = false;
        try {
            param1.a(this.field_v, this.field_q, false, this.field_m, this.field_n, this.field_u, this.field_p, this.field_i);
            if (param0 != 0) {
                discarded$0 = so.a(-46, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "so.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        if (param7) {
            this.a((byte) 113);
        }
        super.a(0, param2);
        this.field_p = param8;
        this.field_n = param3;
        this.field_v = param0;
        this.field_q = param1;
        this.field_u = param4;
        this.field_m = param5;
        this.field_i = param6;
    }

    so() {
    }

    static {
        field_j = new th();
        field_t = new ma();
        field_o = new ao(2, 4, 4, 0);
    }
}
