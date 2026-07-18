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
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a((byte) -111);
              if (param0 < -47) {
                break L1;
              } else {
                String discarded$2 = so.a(true, -39, (CharSequence) null);
                break L1;
              }
            }
            fk.field_n.a((br) this, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "so.O(" + param0 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_10_0 = stackOut_7_0;
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
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("so.K(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void a(int param0) {
        try {
            field_l = null;
            field_j = null;
            field_t = null;
            field_k = null;
            field_o = null;
            int var1_int = -125 / ((param0 - -13) / 41);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "so.L(" + param0 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param0.addMouseListener((java.awt.event.MouseListener) (Object) on.field_Z);
            var2_int = 51 % ((param1 - 75) / 47);
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) on.field_Z);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) on.field_Z);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("so.R(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == we.field_g) {
              L1: {
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
                  break L1;
                } else {
                  so.a(-95);
                  break L1;
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "so.J(" + param0 + ')');
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_5_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3 = no.a(param0, -107, param2);
            if (var3 != null) {
              stackOut_4_0 = (String) var3;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var4 = 61 / ((param1 - 14) / 63);
              var5 = 0;
              L1: while (true) {
                L2: {
                  if (~param2.length() >= ~var5) {
                    break L2;
                  } else {
                    if (!fl.a(-82, param2.charAt(var5))) {
                      stackOut_11_0 = um.field_i;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    } else {
                      var5++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("so.H(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return (String) (Object) stackIn_15_0;
    }

    final static void a(int param0, long param1, int param2) {
        ga var4 = ma.field_a;
        var4.b((byte) -35, param2);
        var4.field_j = var4.field_j + 1;
        int var5 = var4.field_j;
        if (param0 != -21148) {
            return;
        }
        try {
            var4.a(param0 + 21034, 6);
            var4.a(param1, true);
            var4.e(44, var4.field_j - var5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "so.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        cj var5_ref = null;
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
        dm var18 = null;
        int var18_int = 0;
        int var19 = 0;
        cj stackIn_25_0 = null;
        cj stackIn_26_0 = null;
        cj stackIn_28_0 = null;
        cj stackIn_30_0 = null;
        cj stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_97_0 = 0;
        boolean stackIn_113_0 = false;
        int stackIn_122_0 = 0;
        Object stackIn_147_0 = null;
        boolean stackIn_198_0 = false;
        int stackIn_230_0 = 0;
        cj stackIn_262_0 = null;
        int stackIn_262_1 = 0;
        cj stackIn_263_0 = null;
        int stackIn_263_1 = 0;
        cj stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        cj stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        cj stackIn_268_0 = null;
        int stackIn_268_1 = 0;
        cj stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        cj stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        int stackIn_271_2 = 0;
        cj stackIn_272_0 = null;
        int stackIn_272_1 = 0;
        cj stackIn_273_0 = null;
        int stackIn_273_1 = 0;
        cj stackIn_275_0 = null;
        int stackIn_275_1 = 0;
        cj stackIn_276_0 = null;
        int stackIn_276_1 = 0;
        cj stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        cj stackIn_280_0 = null;
        int stackIn_280_1 = 0;
        cj stackIn_281_0 = null;
        int stackIn_281_1 = 0;
        int stackIn_281_2 = 0;
        cj stackIn_282_0 = null;
        int stackIn_282_1 = 0;
        cj stackIn_283_0 = null;
        int stackIn_283_1 = 0;
        cj stackIn_285_0 = null;
        int stackIn_285_1 = 0;
        cj stackIn_286_0 = null;
        int stackIn_286_1 = 0;
        cj stackIn_288_0 = null;
        int stackIn_288_1 = 0;
        cj stackIn_290_0 = null;
        int stackIn_290_1 = 0;
        cj stackIn_291_0 = null;
        int stackIn_291_1 = 0;
        int stackIn_291_2 = 0;
        Object stackIn_292_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_24_0 = null;
        cj stackOut_25_0 = null;
        cj stackOut_26_0 = null;
        cj stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        cj stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_96_0 = 0;
        boolean stackOut_112_0 = false;
        int stackOut_121_0 = 0;
        Object stackOut_146_0 = null;
        boolean stackOut_197_0 = false;
        int stackOut_229_0 = 0;
        cj stackOut_261_0 = null;
        int stackOut_261_1 = 0;
        cj stackOut_262_0 = null;
        int stackOut_262_1 = 0;
        cj stackOut_263_0 = null;
        int stackOut_263_1 = 0;
        cj stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        cj stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        cj stackOut_268_0 = null;
        int stackOut_268_1 = 0;
        int stackOut_268_2 = 0;
        cj stackOut_270_0 = null;
        int stackOut_270_1 = 0;
        int stackOut_270_2 = 0;
        cj stackOut_271_0 = null;
        int stackOut_271_1 = 0;
        cj stackOut_272_0 = null;
        int stackOut_272_1 = 0;
        cj stackOut_273_0 = null;
        int stackOut_273_1 = 0;
        cj stackOut_275_0 = null;
        int stackOut_275_1 = 0;
        cj stackOut_276_0 = null;
        int stackOut_276_1 = 0;
        cj stackOut_278_0 = null;
        int stackOut_278_1 = 0;
        int stackOut_278_2 = 0;
        cj stackOut_280_0 = null;
        int stackOut_280_1 = 0;
        int stackOut_280_2 = 0;
        cj stackOut_281_0 = null;
        int stackOut_281_1 = 0;
        cj stackOut_282_0 = null;
        int stackOut_282_1 = 0;
        cj stackOut_283_0 = null;
        int stackOut_283_1 = 0;
        cj stackOut_285_0 = null;
        int stackOut_285_1 = 0;
        cj stackOut_286_0 = null;
        int stackOut_286_1 = 0;
        cj stackOut_288_0 = null;
        int stackOut_288_1 = 0;
        int stackOut_288_2 = 0;
        cj stackOut_290_0 = null;
        int stackOut_290_1 = 0;
        int stackOut_290_2 = 0;
        Object stackOut_291_0 = null;
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
                      var5_ref = en.field_b;
                      var5_ref.field_zb = 0;
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
                            if (~mh.field_c.field_mc >= ~mh.field_c.field_cc) {
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
                              var10_ref_String = vl.a(uk.field_R, new String[1], 2);
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
                            stackOut_24_0 = gb.field_a;
                            stackIn_30_0 = stackOut_24_0;
                            stackIn_25_0 = stackOut_24_0;
                            if (!param3) {
                              break L11;
                            } else {
                              stackOut_25_0 = (cj) (Object) stackIn_25_0;
                              stackIn_30_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (0L != qi.field_c) {
                                break L11;
                              } else {
                                stackOut_26_0 = (cj) (Object) stackIn_26_0;
                                stackIn_28_0 = stackOut_26_0;
                                stackOut_28_0 = (cj) (Object) stackIn_28_0;
                                stackOut_28_1 = 1;
                                stackIn_31_0 = stackOut_28_0;
                                stackIn_31_1 = stackOut_28_1;
                                break L10;
                              }
                            }
                          }
                          stackOut_30_0 = (cj) (Object) stackIn_30_0;
                          stackOut_30_1 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          stackIn_31_1 = stackOut_30_1;
                          break L10;
                        }
                        L12: {
                          stackIn_31_0.field_Z = stackIn_31_1 != 0;
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
                                  if (~var11 <= ~kj.field_h) {
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
                                    if (var10 >= 2) {
                                      break L19;
                                    } else {
                                      var11 = 0;
                                      stackOut_45_0 = 0;
                                      stackIn_97_0 = stackOut_45_0;
                                      stackIn_46_0 = stackOut_45_0;
                                      if (var19 != 0) {
                                        break L18;
                                      } else {
                                        var12 = stackIn_46_0;
                                        L20: while (true) {
                                          stackOut_47_0 = iq.field_b.length;
                                          stackOut_47_1 = var12;
                                          stackIn_48_0 = stackOut_47_0;
                                          stackIn_48_1 = stackOut_47_1;
                                          L21: while (true) {
                                            L22: {
                                              L23: {
                                                if (stackIn_48_0 <= stackIn_48_1) {
                                                  break L23;
                                                } else {
                                                  var13_ref_int__ = iq.field_b[var12];
                                                  stackOut_49_0 = 0;
                                                  stackIn_89_0 = stackOut_49_0;
                                                  stackIn_50_0 = stackOut_49_0;
                                                  if (var19 != 0) {
                                                    break L22;
                                                  } else {
                                                    var14 = stackIn_50_0;
                                                    L24: while (true) {
                                                      L25: {
                                                        L26: {
                                                          L27: {
                                                            if (var14 >= var13_ref_int__.length) {
                                                              break L27;
                                                            } else {
                                                              var15 = var13_ref_int__[var14];
                                                              var16 = var13_ref_int__[var14 + 1];
                                                              stackOut_52_0 = var15;
                                                              stackOut_52_1 = -1;
                                                              stackIn_80_0 = stackOut_52_0;
                                                              stackIn_80_1 = stackOut_52_1;
                                                              stackIn_53_0 = stackOut_52_0;
                                                              stackIn_53_1 = stackOut_52_1;
                                                              if (var19 != 0) {
                                                                break L26;
                                                              } else {
                                                                L28: {
                                                                  L29: {
                                                                    if (stackIn_53_0 != stackIn_53_1) {
                                                                      break L29;
                                                                    } else {
                                                                      L30: {
                                                                        if (var10 == 0) {
                                                                          stackOut_61_0 = mh.field_c.field_mc;
                                                                          stackIn_62_0 = stackOut_61_0;
                                                                          break L30;
                                                                        } else {
                                                                          stackOut_59_0 = mh.field_c.field_cc;
                                                                          stackIn_62_0 = stackOut_59_0;
                                                                          break L30;
                                                                        }
                                                                      }
                                                                      L31: {
                                                                        var17_int = stackIn_62_0;
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
                                                                  if (~(mh.field_c.field_Zb[var15] & 255) == ~var16) {
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
                                                          stackOut_79_0 = ~var13_ref_int__.length;
                                                          stackOut_79_1 = ~var15;
                                                          stackIn_80_0 = stackOut_79_0;
                                                          stackIn_80_1 = stackOut_79_1;
                                                          break L26;
                                                        }
                                                        L32: while (true) {
                                                          L33: {
                                                            if (stackIn_80_0 >= stackIn_80_1) {
                                                              break L33;
                                                            } else {
                                                              var16 = var13_ref_int__[var15];
                                                              stackOut_81_0 = var16;
                                                              stackOut_81_1 = var14;
                                                              stackIn_48_0 = stackOut_81_0;
                                                              stackIn_48_1 = stackOut_81_1;
                                                              stackIn_82_0 = stackOut_81_0;
                                                              stackIn_82_1 = stackOut_81_1;
                                                              if (var19 != 0) {
                                                                continue L21;
                                                              } else {
                                                                L34: {
                                                                  if (stackIn_82_0 > stackIn_82_1) {
                                                                    var14 = var16;
                                                                    break L34;
                                                                  } else {
                                                                    break L34;
                                                                  }
                                                                }
                                                                var15 += 2;
                                                                if (var19 == 0) {
                                                                  stackOut_79_0 = ~var13_ref_int__.length;
                                                                  stackOut_79_1 = ~var15;
                                                                  stackIn_80_0 = stackOut_79_0;
                                                                  stackIn_80_1 = stackOut_79_1;
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
                                              stackOut_88_0 = var11;
                                              stackIn_89_0 = stackOut_88_0;
                                              break L22;
                                            }
                                            L35: {
                                              if (stackIn_89_0 == 0) {
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
                                  stackOut_96_0 = kj.field_q;
                                  stackIn_97_0 = stackOut_96_0;
                                  break L18;
                                }
                                if (stackIn_97_0 < 2) {
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
                                      if (~kj.field_h >= ~var13) {
                                        break L40;
                                      } else {
                                        stackOut_112_0 = ll.field_c[var13];
                                        stackIn_122_0 = stackOut_112_0 ? 1 : 0;
                                        stackIn_113_0 = stackOut_112_0;
                                        if (var19 != 0) {
                                          break L39;
                                        } else {
                                          L41: {
                                            if (stackIn_113_0) {
                                              L42: {
                                                var14_ref_String = "<col=A00000>" + cf.field_f[var13] + "</col>";
                                                if (null == var11_ref) {
                                                  break L42;
                                                } else {
                                                  var12 = 1;
                                                  var11_ref = (Object) (Object) ((String) var11_ref + ", " + var14_ref_String);
                                                  if (var19 == 0) {
                                                    break L41;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                              var11_ref = (Object) (Object) var14_ref_String;
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
                                    stackOut_121_0 = -1;
                                    stackIn_122_0 = stackOut_121_0;
                                    break L39;
                                  }
                                  L43: {
                                    if (stackIn_122_0 == ~var10) {
                                      L44: {
                                        var13_ref_String = ai.field_d;
                                        if (var12 == 0) {
                                          break L44;
                                        } else {
                                          var14_ref_String = aq.field_n + (String) var11_ref;
                                          if (var19 == 0) {
                                            break L43;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                      var14_ref_String = vl.a(wq.field_f, new String[1], 2);
                                      break L43;
                                    } else {
                                      L45: {
                                        var13_ref_String = vb.field_e;
                                        if (var12 == 0) {
                                          break L45;
                                        } else {
                                          var14_ref_String = lj.field_k + (String) var11_ref;
                                          if (var19 == 0) {
                                            break L43;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                      var14_ref_String = vl.a(kn.field_d, new String[1], param0 + -48);
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
                              if (~kj.field_h >= ~var16) {
                                break L48;
                              } else {
                                var17_int = 255 & mh.field_c.field_Zb[var16];
                                stackOut_146_0 = null;
                                stackIn_292_0 = stackOut_146_0;
                                stackIn_147_0 = stackOut_146_0;
                                if (var19 != 0) {
                                  break L1;
                                } else {
                                  L49: {
                                    if (stackIn_147_0 == (Object) (Object) ch.field_g) {
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
                                        if (var18_int == 0) {
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
                            var18 = (dm) (Object) var17.c(81);
                            L55: while (true) {
                              L56: {
                                L57: {
                                  if (null == var18) {
                                    break L57;
                                  } else {
                                    stackOut_197_0 = var18.c((byte) 15);
                                    stackIn_230_0 = stackOut_197_0 ? 1 : 0;
                                    stackIn_198_0 = stackOut_197_0;
                                    if (var19 != 0) {
                                      break L56;
                                    } else {
                                      L58: {
                                        if (stackIn_198_0) {
                                          break L58;
                                        } else {
                                          L59: {
                                            if (var11 == 0) {
                                              break L59;
                                            } else {
                                              if (!var18.field_Nb) {
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
                                            if (~var13 >= ~var18.field_Mb) {
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
                                            if (~var14 < ~var18.field_Sb) {
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
                                            if ((~var18.field_Vb & var15) <= 0) {
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
                                      var18 = (dm) (Object) var17.b(6);
                                      if (var19 == 0) {
                                        continue L55;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                }
                                stackOut_229_0 = ~kj.field_q;
                                stackIn_230_0 = stackOut_229_0;
                                break L56;
                              }
                              L63: {
                                if (stackIn_230_0 > -3) {
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
                                      ui.field_j = vl.a(rn.field_b, new String[1], 2);
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
                    gg.field_m.field_wb = vl.a(ae.field_g, new String[1], 2).toUpperCase();
                    eb.field_B.a(40, fc.field_a.field_z + -40, fc.field_a.field_zb, 0, -3344);
                    eb.field_B.field_wb = vl.a(mp.field_a, new String[1], 2);
                    var8 = eb.field_B;
                    break L3;
                  }
                  L65: {
                    if (qi.field_c != 0L) {
                      L66: {
                        var9 = (int)(-bl.a((byte) 97) + qi.field_c);
                        var9 = (var9 - -999) / 1000;
                        if (var9 < 1) {
                          var9 = 1;
                          break L66;
                        } else {
                          break L66;
                        }
                      }
                      var8.field_wb = vl.a(ge.field_pb, new String[1], param0 ^ 48);
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  fn.field_h.field_wb = vl.a(pb.field_g, new String[2], 2);
                  break L2;
                } else {
                  break L2;
                }
              }
              L67: {
                if (param0 == 50) {
                  break L67;
                } else {
                  field_t = null;
                  break L67;
                }
              }
              L68: {
                L69: {
                  stackOut_261_0 = mh.field_i;
                  stackOut_261_1 = -11838;
                  stackIn_270_0 = stackOut_261_0;
                  stackIn_270_1 = stackOut_261_1;
                  stackIn_262_0 = stackOut_261_0;
                  stackIn_262_1 = stackOut_261_1;
                  if (!param1) {
                    break L69;
                  } else {
                    stackOut_262_0 = (cj) (Object) stackIn_262_0;
                    stackOut_262_1 = stackIn_262_1;
                    stackIn_270_0 = stackOut_262_0;
                    stackIn_270_1 = stackOut_262_1;
                    stackIn_263_0 = stackOut_262_0;
                    stackIn_263_1 = stackOut_262_1;
                    if (param2) {
                      break L69;
                    } else {
                      stackOut_263_0 = (cj) (Object) stackIn_263_0;
                      stackOut_263_1 = stackIn_263_1;
                      stackIn_265_0 = stackOut_263_0;
                      stackIn_265_1 = stackOut_263_1;
                      stackOut_265_0 = (cj) (Object) stackIn_265_0;
                      stackOut_265_1 = stackIn_265_1;
                      stackIn_270_0 = stackOut_265_0;
                      stackIn_270_1 = stackOut_265_1;
                      stackIn_266_0 = stackOut_265_0;
                      stackIn_266_1 = stackOut_265_1;
                      if (io.field_b) {
                        break L69;
                      } else {
                        stackOut_266_0 = (cj) (Object) stackIn_266_0;
                        stackOut_266_1 = stackIn_266_1;
                        stackIn_268_0 = stackOut_266_0;
                        stackIn_268_1 = stackOut_266_1;
                        stackOut_268_0 = (cj) (Object) stackIn_268_0;
                        stackOut_268_1 = stackIn_268_1;
                        stackOut_268_2 = 1;
                        stackIn_271_0 = stackOut_268_0;
                        stackIn_271_1 = stackOut_268_1;
                        stackIn_271_2 = stackOut_268_2;
                        break L68;
                      }
                    }
                  }
                }
                stackOut_270_0 = (cj) (Object) stackIn_270_0;
                stackOut_270_1 = stackIn_270_1;
                stackOut_270_2 = 0;
                stackIn_271_0 = stackOut_270_0;
                stackIn_271_1 = stackOut_270_1;
                stackIn_271_2 = stackOut_270_2;
                break L68;
              }
              L70: {
                L71: {
                  ((cj) (Object) stackIn_271_0).a(stackIn_271_1, stackIn_271_2 != 0);
                  stackOut_271_0 = fc.field_a;
                  stackOut_271_1 = -11838;
                  stackIn_280_0 = stackOut_271_0;
                  stackIn_280_1 = stackOut_271_1;
                  stackIn_272_0 = stackOut_271_0;
                  stackIn_272_1 = stackOut_271_1;
                  if (!param1) {
                    break L71;
                  } else {
                    stackOut_272_0 = (cj) (Object) stackIn_272_0;
                    stackOut_272_1 = stackIn_272_1;
                    stackIn_280_0 = stackOut_272_0;
                    stackIn_280_1 = stackOut_272_1;
                    stackIn_273_0 = stackOut_272_0;
                    stackIn_273_1 = stackOut_272_1;
                    if (param2) {
                      break L71;
                    } else {
                      stackOut_273_0 = (cj) (Object) stackIn_273_0;
                      stackOut_273_1 = stackIn_273_1;
                      stackIn_275_0 = stackOut_273_0;
                      stackIn_275_1 = stackOut_273_1;
                      stackOut_275_0 = (cj) (Object) stackIn_275_0;
                      stackOut_275_1 = stackIn_275_1;
                      stackIn_280_0 = stackOut_275_0;
                      stackIn_280_1 = stackOut_275_1;
                      stackIn_276_0 = stackOut_275_0;
                      stackIn_276_1 = stackOut_275_1;
                      if (io.field_b) {
                        break L71;
                      } else {
                        stackOut_276_0 = (cj) (Object) stackIn_276_0;
                        stackOut_276_1 = stackIn_276_1;
                        stackIn_278_0 = stackOut_276_0;
                        stackIn_278_1 = stackOut_276_1;
                        stackOut_278_0 = (cj) (Object) stackIn_278_0;
                        stackOut_278_1 = stackIn_278_1;
                        stackOut_278_2 = 1;
                        stackIn_281_0 = stackOut_278_0;
                        stackIn_281_1 = stackOut_278_1;
                        stackIn_281_2 = stackOut_278_2;
                        break L70;
                      }
                    }
                  }
                }
                stackOut_280_0 = (cj) (Object) stackIn_280_0;
                stackOut_280_1 = stackIn_280_1;
                stackOut_280_2 = 0;
                stackIn_281_0 = stackOut_280_0;
                stackIn_281_1 = stackOut_280_1;
                stackIn_281_2 = stackOut_280_2;
                break L70;
              }
              L72: {
                L73: {
                  ((cj) (Object) stackIn_281_0).a(stackIn_281_1, stackIn_281_2 != 0);
                  stackOut_281_0 = qf.field_b;
                  stackOut_281_1 = -11838;
                  stackIn_290_0 = stackOut_281_0;
                  stackIn_290_1 = stackOut_281_1;
                  stackIn_282_0 = stackOut_281_0;
                  stackIn_282_1 = stackOut_281_1;
                  if (!param1) {
                    break L73;
                  } else {
                    stackOut_282_0 = (cj) (Object) stackIn_282_0;
                    stackOut_282_1 = stackIn_282_1;
                    stackIn_290_0 = stackOut_282_0;
                    stackIn_290_1 = stackOut_282_1;
                    stackIn_283_0 = stackOut_282_0;
                    stackIn_283_1 = stackOut_282_1;
                    if (param2) {
                      break L73;
                    } else {
                      stackOut_283_0 = (cj) (Object) stackIn_283_0;
                      stackOut_283_1 = stackIn_283_1;
                      stackIn_285_0 = stackOut_283_0;
                      stackIn_285_1 = stackOut_283_1;
                      stackOut_285_0 = (cj) (Object) stackIn_285_0;
                      stackOut_285_1 = stackIn_285_1;
                      stackIn_290_0 = stackOut_285_0;
                      stackIn_290_1 = stackOut_285_1;
                      stackIn_286_0 = stackOut_285_0;
                      stackIn_286_1 = stackOut_285_1;
                      if (!io.field_b) {
                        break L73;
                      } else {
                        stackOut_286_0 = (cj) (Object) stackIn_286_0;
                        stackOut_286_1 = stackIn_286_1;
                        stackIn_288_0 = stackOut_286_0;
                        stackIn_288_1 = stackOut_286_1;
                        stackOut_288_0 = (cj) (Object) stackIn_288_0;
                        stackOut_288_1 = stackIn_288_1;
                        stackOut_288_2 = 1;
                        stackIn_291_0 = stackOut_288_0;
                        stackIn_291_1 = stackOut_288_1;
                        stackIn_291_2 = stackOut_288_2;
                        break L72;
                      }
                    }
                  }
                }
                stackOut_290_0 = (cj) (Object) stackIn_290_0;
                stackOut_290_1 = stackIn_290_1;
                stackOut_290_2 = 0;
                stackIn_291_0 = stackOut_290_0;
                stackIn_291_1 = stackOut_290_1;
                stackIn_291_2 = stackOut_290_2;
                break L72;
              }
              ((cj) (Object) stackIn_291_0).a(stackIn_291_1, stackIn_291_2 != 0);
              em.field_U.field_c.h(-40);
              stackOut_291_0 = null;
              stackIn_292_0 = stackOut_291_0;
              break L1;
            }
            L74: {
              if (stackIn_292_0 == (Object) (Object) mh.field_c) {
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
                  if (pg.field_a.field_T == 0) {
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
          throw fa.a((Throwable) (Object) var5, "so.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean c(int param0) {
        lp var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_2_0 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1 = (lp) (Object) we.field_k.c(74);
            if (null != var1) {
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
                          if (var1.field_m[var2] != null) {
                            if (0 != var1.field_m[var2].field_f) {
                              break L4;
                            } else {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              return stackIn_14_0 != 0;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (var1.field_l[var2] != null) {
                            if (var1.field_l[var2].field_f == 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              return stackIn_22_0 != 0;
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
                    field_k = null;
                    break L2;
                  }
                }
                stackOut_27_0 = 1;
                stackIn_28_0 = stackOut_27_0;
                break L0;
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
          throw fa.a((Throwable) (Object) var1_ref, "so.P(" + param0 + ')');
        }
        return stackIn_28_0 != 0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((so) this).field_p == 1) {
              return;
            } else {
              L1: {
                pb.field_e.c(Integer.toString(((so) this).field_f + -param3), ((so) this).field_q >> -param2 + 16, ((so) this).field_u >> 16 - param0, 4, -1);
                pb.field_e.c(Integer.toString(-param3 + ((so) this).field_f), -param2 + ((so) this).field_i, -param0 + ((so) this).field_m, 0, -1);
                if (param1) {
                  break L1;
                } else {
                  field_k = null;
                  break L1;
                }
              }
              oo.d(((so) this).field_q >> 16 + -param2, ((so) this).field_u >> 16 + -param0, ((so) this).field_i - param2, -param0 + ((so) this).field_m, 16711680, 10);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var5, "so.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  param3--;
                  if (param3 < 0) {
                    break L3;
                  } else {
                    var5 = param0;
                    var6 = param2;
                    var7 = param4;
                    var5[var6] = var7 + tq.b(8355711, var5[var6] >> 1435928705);
                    param2++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1) {
                  break L2;
                } else {
                  field_k = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("so.I(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, qd param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
                boolean discarded$3 = so.a(-46, (String) null);
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
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        RuntimeException var10 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param7) {
                break L1;
              } else {
                ((so) this).a((byte) 113);
                break L1;
              }
            }
            super.a(0, param2);
            ((so) this).field_p = param8;
            ((so) this).field_n = param3;
            ((so) this).field_v = param0;
            ((so) this).field_q = param1;
            ((so) this).field_u = param4;
            ((so) this).field_m = param5;
            ((so) this).field_i = param6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var10, "so.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
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
