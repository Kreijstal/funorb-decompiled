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
          try {
            L0: {
              super.a((byte) -111);
              if (param0 < -47) {
                break L0;
              } else {
                String discarded$2 = so.a(true, -39, (CharSequence) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          fk.field_n.a((br) this, false);
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null != ci.field_f) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (param0 <= -69) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_t = null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param1.toLowerCase().indexOf(ci.field_f.toLowerCase()) ^ -1) > -1) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 1;
                        stackIn_11_0 = stackOut_8_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) var2;
                        stackOut_13_1 = new StringBuilder().append("so.K(").append(param0).append(44);
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param1 == null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
            throw fa.a((Throwable) (Object) runtimeException, "so.L(" + param0 + 41);
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param0.addMouseListener((java.awt.event.MouseListener) (Object) on.field_Z);
                        var2_int = 51 % ((param1 - 75) / 47);
                        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) on.field_Z);
                        param0.addFocusListener((java.awt.event.FocusListener) (Object) on.field_Z);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) runtimeException;
                        stackOut_3_1 = new StringBuilder().append("so.R(");
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param0 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
                        stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
                        stackOut_4_2 = "{...}";
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                    stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                    stackOut_6_2 = "null";
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == we.field_g) {
            try {
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
            } catch (java.lang.RuntimeException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            throw decompiledCaughtException;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
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
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_6_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        String stackOut_5_0 = null;
        String stackOut_12_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = no.a(param0, -107, param2);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 != null) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (String) var3;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        var4 = 61 / ((param1 - 14) / 63);
                        var5 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param2.length() ^ -1) >= (var5 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!fl.a(-82, param2.charAt(var5))) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = um.field_i;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    try {
                        var5++;
                        if (var6 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = null;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return (String) (Object) stackIn_16_0;
                }
                case 17: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) var3_ref;
                        stackOut_18_1 = new StringBuilder().append("so.H(").append(param0).append(44).append(param1).append(44);
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param2 == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                    stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                    stackOut_21_2 = "null";
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw fa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        try {
            var4.a(param0 + 21034, 6);
            var4.a(param1, true);
            var4.e(44, var4.field_j - var5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "so.Q(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        cj var5_ref = null;
        cj var6 = null;
        cj var7 = null;
        cj var8 = null;
        String var9_ref = null;
        int var9 = 0;
        String var10_ref = null;
        int var10 = 0;
        int var11 = 0;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref = null;
        int var15 = 0;
        int var16 = 0;
        th var17 = null;
        int var17_int = 0;
        dm var18 = null;
        int var18_int = 0;
        int var19 = 0;
        boolean stackIn_21_0 = false;
        cj stackIn_29_0 = null;
        cj stackIn_30_0 = null;
        long stackIn_30_1 = 0L;
        cj stackIn_31_0 = null;
        cj stackIn_33_0 = null;
        cj stackIn_35_0 = null;
        cj stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_106_0 = 0;
        boolean[] stackIn_108_0 = null;
        boolean stackIn_123_0 = false;
        int stackIn_132_0 = 0;
        int[][] stackIn_144_0 = null;
        int[][] stackIn_148_0 = null;
        int[][] stackIn_152_0 = null;
        Object stackIn_161_0 = null;
        Object stackIn_162_0 = null;
        boolean[][] stackIn_162_1 = null;
        boolean[][] stackIn_166_0 = null;
        int[][] stackIn_175_0 = null;
        boolean stackIn_184_0 = false;
        int[][] stackIn_197_0 = null;
        boolean stackIn_205_0 = false;
        boolean stackIn_219_0 = false;
        dm stackIn_226_0 = null;
        int stackIn_256_0 = 0;
        cj stackIn_291_0 = null;
        int stackIn_291_1 = 0;
        cj stackIn_292_0 = null;
        int stackIn_292_1 = 0;
        boolean stackIn_292_2 = false;
        cj stackIn_293_0 = null;
        int stackIn_293_1 = 0;
        cj stackIn_295_0 = null;
        int stackIn_295_1 = 0;
        cj stackIn_296_0 = null;
        int stackIn_296_1 = 0;
        boolean stackIn_296_2 = false;
        cj stackIn_297_0 = null;
        int stackIn_297_1 = 0;
        cj stackIn_299_0 = null;
        int stackIn_299_1 = 0;
        cj stackIn_301_0 = null;
        int stackIn_301_1 = 0;
        cj stackIn_302_0 = null;
        int stackIn_302_1 = 0;
        int stackIn_302_2 = 0;
        cj stackIn_303_0 = null;
        int stackIn_303_1 = 0;
        cj stackIn_304_0 = null;
        int stackIn_304_1 = 0;
        boolean stackIn_304_2 = false;
        cj stackIn_305_0 = null;
        int stackIn_305_1 = 0;
        cj stackIn_307_0 = null;
        int stackIn_307_1 = 0;
        cj stackIn_308_0 = null;
        int stackIn_308_1 = 0;
        boolean stackIn_308_2 = false;
        cj stackIn_309_0 = null;
        int stackIn_309_1 = 0;
        cj stackIn_311_0 = null;
        int stackIn_311_1 = 0;
        cj stackIn_313_0 = null;
        int stackIn_313_1 = 0;
        cj stackIn_314_0 = null;
        int stackIn_314_1 = 0;
        int stackIn_314_2 = 0;
        cj stackIn_315_0 = null;
        int stackIn_315_1 = 0;
        cj stackIn_316_0 = null;
        int stackIn_316_1 = 0;
        boolean stackIn_316_2 = false;
        cj stackIn_317_0 = null;
        int stackIn_317_1 = 0;
        cj stackIn_319_0 = null;
        int stackIn_319_1 = 0;
        cj stackIn_320_0 = null;
        int stackIn_320_1 = 0;
        boolean stackIn_320_2 = false;
        cj stackIn_321_0 = null;
        int stackIn_321_1 = 0;
        cj stackIn_323_0 = null;
        int stackIn_323_1 = 0;
        cj stackIn_325_0 = null;
        int stackIn_325_1 = 0;
        cj stackIn_326_0 = null;
        int stackIn_326_1 = 0;
        int stackIn_326_2 = 0;
        Object stackIn_327_0 = null;
        Throwable caughtException = null;
        boolean stackOut_20_0 = false;
        cj stackOut_28_0 = null;
        cj stackOut_29_0 = null;
        long stackOut_29_1 = 0L;
        cj stackOut_30_0 = null;
        cj stackOut_31_0 = null;
        cj stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        cj stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_105_0 = 0;
        boolean[] stackOut_107_0 = null;
        boolean stackOut_122_0 = false;
        int stackOut_131_0 = 0;
        int[][] stackOut_143_0 = null;
        int[][] stackOut_147_0 = null;
        int[][] stackOut_151_0 = null;
        Object stackOut_160_0 = null;
        Object stackOut_161_0 = null;
        boolean[][] stackOut_161_1 = null;
        boolean[][] stackOut_165_0 = null;
        int[][] stackOut_174_0 = null;
        boolean stackOut_183_0 = false;
        int[][] stackOut_196_0 = null;
        boolean stackOut_204_0 = false;
        boolean stackOut_218_0 = false;
        dm stackOut_225_0 = null;
        int stackOut_255_0 = 0;
        cj stackOut_290_0 = null;
        int stackOut_290_1 = 0;
        cj stackOut_291_0 = null;
        int stackOut_291_1 = 0;
        boolean stackOut_291_2 = false;
        cj stackOut_292_0 = null;
        int stackOut_292_1 = 0;
        cj stackOut_293_0 = null;
        int stackOut_293_1 = 0;
        cj stackOut_295_0 = null;
        int stackOut_295_1 = 0;
        boolean stackOut_295_2 = false;
        cj stackOut_296_0 = null;
        int stackOut_296_1 = 0;
        cj stackOut_297_0 = null;
        int stackOut_297_1 = 0;
        cj stackOut_299_0 = null;
        int stackOut_299_1 = 0;
        int stackOut_299_2 = 0;
        cj stackOut_301_0 = null;
        int stackOut_301_1 = 0;
        int stackOut_301_2 = 0;
        cj stackOut_302_0 = null;
        int stackOut_302_1 = 0;
        cj stackOut_303_0 = null;
        int stackOut_303_1 = 0;
        boolean stackOut_303_2 = false;
        cj stackOut_304_0 = null;
        int stackOut_304_1 = 0;
        cj stackOut_305_0 = null;
        int stackOut_305_1 = 0;
        cj stackOut_307_0 = null;
        int stackOut_307_1 = 0;
        boolean stackOut_307_2 = false;
        cj stackOut_308_0 = null;
        int stackOut_308_1 = 0;
        cj stackOut_309_0 = null;
        int stackOut_309_1 = 0;
        cj stackOut_311_0 = null;
        int stackOut_311_1 = 0;
        int stackOut_311_2 = 0;
        cj stackOut_313_0 = null;
        int stackOut_313_1 = 0;
        int stackOut_313_2 = 0;
        cj stackOut_314_0 = null;
        int stackOut_314_1 = 0;
        cj stackOut_315_0 = null;
        int stackOut_315_1 = 0;
        boolean stackOut_315_2 = false;
        cj stackOut_316_0 = null;
        int stackOut_316_1 = 0;
        cj stackOut_317_0 = null;
        int stackOut_317_1 = 0;
        cj stackOut_319_0 = null;
        int stackOut_319_1 = 0;
        boolean stackOut_319_2 = false;
        cj stackOut_320_0 = null;
        int stackOut_320_1 = 0;
        cj stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        cj stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        int stackOut_323_2 = 0;
        cj stackOut_325_0 = null;
        int stackOut_325_1 = 0;
        int stackOut_325_2 = 0;
        Object stackOut_326_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    mf.a(da.field_a, false);
                    if (null != mh.field_c) {
                        statePc = 4;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 4: {
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
                        statePc = 275;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    gg.field_m.field_wb = fn.field_l.toUpperCase();
                    var9 = (2 + fc.field_a.field_zb) / 2;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    en.field_b.a(40, fc.field_a.field_z + -40, var9 - 2, 0, -3344);
                    if ((mh.field_c.field_mc ^ -1) >= (mh.field_c.field_cc ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    en.field_b.field_wb = p.field_c.toUpperCase();
                    en.field_b.field_Z = true;
                    if (var19 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    en.field_b.field_wb = ka.field_p.toUpperCase();
                    en.field_b.field_Z = false;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    en.field_b.field_ab = he.field_i.field_ab;
                    if (cb.field_i > 0) {
                        statePc = 16;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (cb.field_i != 1) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10_ref = u.field_k;
                    if (var19 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10_ref = vl.a(uk.field_R, new String[1], 2);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    en.field_b.field_wb = en.field_b.field_wb + "<br>" + var10_ref;
                    if ((qj.field_i & 16) != 0) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackOut_20_0 = io.field_b;
                    stackIn_21_0 = stackOut_20_0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (!stackIn_21_0) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    en.field_b.field_ab = he.field_i.field_X;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    gb.field_a.a(40, -40 + fc.field_a.field_z, fc.field_a.field_zb - var9, var9, -3344);
                    gb.field_a.field_wb = qk.field_f.toUpperCase();
                    var8 = gb.field_a;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = gb.field_a;
                    stackIn_35_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (!param3) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = (cj) (Object) stackIn_29_0;
                    stackOut_29_1 = 0L;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (cj) (Object) stackIn_30_0;
                    stackIn_35_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (stackIn_30_1 != qi.field_c) {
                        statePc = 35;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = (cj) (Object) stackIn_31_0;
                    stackIn_33_0 = stackOut_31_0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = (cj) (Object) stackIn_33_0;
                    stackOut_33_1 = 1;
                    stackIn_36_0 = stackOut_33_0;
                    stackIn_36_1 = stackOut_33_1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = (cj) (Object) stackIn_35_0;
                    stackOut_35_1 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_36_0.field_Z = stackIn_36_1 != 0;
                    var10 = 2;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (iq.field_b == null) {
                        statePc = 114;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (null != rl.field_v) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    rl.field_v = new byte[kj.field_h];
                    ll.field_c = new boolean[kj.field_h];
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var11 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if ((var11 ^ -1) <= (kj.field_h ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ll.field_c[var11] = false;
                    var11++;
                    if (var19 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var19 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var10 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (-3 >= (var10 ^ -1)) {
                        statePc = 105;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var11 = 0;
                    stackOut_52_0 = 0;
                    stackIn_106_0 = stackOut_52_0;
                    stackIn_53_0 = stackOut_52_0;
                    if (var19 != 0) {
                        statePc = 106;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var12 = stackIn_53_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    stackOut_54_0 = iq.field_b.length;
                    stackOut_54_1 = var12;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (stackIn_55_0 <= stackIn_55_1) {
                        statePc = 97;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var13_ref_int__ = iq.field_b[var12];
                    stackOut_56_0 = 0;
                    stackIn_98_0 = stackOut_56_0;
                    stackIn_57_0 = stackOut_56_0;
                    if (var19 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var14 = stackIn_57_0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (var14 >= var13_ref_int__.length) {
                        statePc = 87;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var15 = var13_ref_int__[var14];
                    var16 = var13_ref_int__[var14 + 1];
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    stackOut_60_0 = var15;
                    stackOut_60_1 = -1;
                    stackIn_89_0 = stackOut_60_0;
                    stackIn_89_1 = stackOut_60_1;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    if (var19 != 0) {
                        statePc = 89;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 != stackIn_61_1) {
                        statePc = 78;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if ((var10 ^ -1) == -1) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = mh.field_c.field_cc;
                    stackIn_70_0 = stackOut_67_0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = mh.field_c.field_mc;
                    stackIn_70_0 = stackOut_69_0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var17_int = stackIn_70_0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (var17_int == var16) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var19 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var19 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((mh.field_c.field_Zb[var15] & 255 ^ -1) == (var16 ^ -1)) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var19 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var14 += 2;
                    if (var19 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var11 = 1;
                    var14 = -1;
                    var15 = 0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    stackOut_88_0 = var13_ref_int__.length ^ -1;
                    stackOut_88_1 = var15 ^ -1;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0 >= stackIn_89_1) {
                        statePc = 95;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var16 = var13_ref_int__[var15];
                    stackOut_90_0 = var16;
                    stackOut_90_1 = var14;
                    stackIn_55_0 = stackOut_90_0;
                    stackIn_55_1 = stackOut_90_1;
                    stackIn_91_0 = stackOut_90_0;
                    stackIn_91_1 = stackOut_90_1;
                    if (var19 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0 > stackIn_91_1) {
                        statePc = 93;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var14 = var16;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    ll.field_c[var14] = true;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackOut_97_0 = var11;
                    stackIn_98_0 = stackOut_97_0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (stackIn_98_0 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (var19 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackOut_105_0 = kj.field_q;
                    stackIn_106_0 = stackOut_105_0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (stackIn_106_0 < 2) {
                        statePc = 114;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackOut_107_0 = lc.field_m;
                    stackIn_108_0 = stackOut_107_0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (stackIn_108_0[12]) {
                        statePc = 113;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var10 = 2;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (var10 >= 2) {
                        statePc = 140;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    gb.field_a.field_Z = false;
                    if (gb.field_a.field_pb) {
                        statePc = 120;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var11_ref = null;
                    var12 = 0;
                    var13 = 0;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if ((kj.field_h ^ -1) >= (var13 ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    stackOut_122_0 = ll.field_c[var13];
                    stackIn_132_0 = stackOut_122_0 ? 1 : 0;
                    stackIn_123_0 = stackOut_122_0;
                    if (var19 != 0) {
                        statePc = 132;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (stackIn_123_0) {
                        statePc = 127;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var14_ref = "<col=A00000>" + cf.field_f[var13] + "</col>";
                    if (null == var11_ref) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var12 = 1;
                    var11_ref = var11_ref + ", " + var14_ref;
                    if (var19 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var11_ref = var14_ref;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var13++;
                    if (var19 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackOut_131_0 = -1;
                    stackIn_132_0 = stackOut_131_0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (stackIn_132_0 == (var10 ^ -1)) {
                        statePc = 136;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var13_ref = vb.field_e;
                    if (var12 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var14_ref = lj.field_k + var11_ref;
                    if (var19 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var14_ref = vl.a(kn.field_d, new String[1], param0 + -48);
                    statePc = 139;
                    continue stateLoop;
                }
                case 136: {
                    var13_ref = ai.field_d;
                    if (var12 == 0) {
                        statePc = 138;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var14_ref = aq.field_n + var11_ref;
                    if (var19 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var14_ref = vl.a(wq.field_f, new String[1], 2);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    ui.field_j = "<col=A00000>" + var13_ref + "<br>" + var14_ref;
                    if (var19 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (null != ch.field_g) {
                        statePc = 157;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    stackOut_143_0 = sd.field_G;
                    stackIn_144_0 = stackOut_143_0;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (stackIn_144_0 != null) {
                        statePc = 157;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackOut_147_0 = r.field_c;
                    stackIn_148_0 = stackOut_147_0;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (stackIn_148_0 != null) {
                        statePc = 157;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    stackOut_151_0 = na.field_J;
                    stackIn_152_0 = stackOut_151_0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (stackIn_152_0 != null) {
                        statePc = 157;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if ((kj.field_h ^ -1) >= (var16 ^ -1)) {
                        statePc = 216;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var17_int = 255 & mh.field_c.field_Zb[var16];
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    stackOut_160_0 = null;
                    stackIn_327_0 = stackOut_160_0;
                    stackIn_161_0 = stackOut_160_0;
                    if (var19 != 0) {
                        statePc = 327;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackOut_161_0 = stackIn_161_0;
                    stackOut_161_1 = ch.field_g;
                    stackIn_162_0 = stackOut_161_0;
                    stackIn_162_1 = stackOut_161_1;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (stackIn_162_0 == (Object) (Object) stackIn_162_1) {
                        statePc = 173;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    stackOut_165_0 = ch.field_g;
                    stackIn_166_0 = stackOut_165_0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (stackIn_166_0[var16] != null) {
                        statePc = 171;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (!ch.field_g[var16][var17_int]) {
                        statePc = 173;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var11 = 1;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (null == sd.field_G) {
                        statePc = 190;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackOut_174_0 = sd.field_G;
                    stackIn_175_0 = stackOut_174_0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (stackIn_175_0[var16] != null) {
                        statePc = 180;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var18_int = sd.field_G[var16][var17_int];
                    if (var18_int <= var13) {
                        statePc = 182;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var13 = var18_int;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (-1 == (var18_int ^ -1)) {
                        statePc = 190;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    stackOut_183_0 = bo.field_e;
                    stackIn_184_0 = stackOut_183_0;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (!stackIn_184_0) {
                        statePc = 189;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var11 = 1;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    if (na.field_J == null) {
                        statePc = 195;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (na.field_J[var16] == null) {
                        statePc = 195;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var15 = var15 | na.field_J[var16][var17_int];
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (null == r.field_c) {
                        statePc = 215;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    stackOut_196_0 = r.field_c;
                    stackIn_197_0 = stackOut_196_0;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (stackIn_197_0[var16] != null) {
                        statePc = 202;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var18_int = r.field_c[var16][var17_int];
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (var18_int == 0) {
                        statePc = 211;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    stackOut_204_0 = bo.field_e;
                    stackIn_205_0 = stackOut_204_0;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (!stackIn_205_0) {
                        statePc = 210;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var11 = 1;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    if (var14 < var18_int) {
                        statePc = 214;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 214: {
                    var14 = var18_int;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var16 = 0;
                    var17 = bf.field_n.field_Gb.field_Cb;
                    var18 = (dm) (Object) var17.c(81);
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (null == var18) {
                        statePc = 255;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    stackOut_218_0 = var18.c((byte) 15);
                    stackIn_256_0 = stackOut_218_0 ? 1 : 0;
                    stackIn_219_0 = stackOut_218_0;
                    if (var19 != 0) {
                        statePc = 256;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (stackIn_219_0) {
                        statePc = 254;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (var11 == 0) {
                        statePc = 233;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    stackOut_225_0 = (dm) var18;
                    stackIn_226_0 = stackOut_225_0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (!stackIn_226_0.field_Nb) {
                        statePc = 231;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var16 = 1;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (var19 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if ((var13 ^ -1) >= (var18.field_Mb ^ -1)) {
                        statePc = 238;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var16 = 1;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if (var19 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if ((var14 ^ -1) < (var18.field_Sb ^ -1)) {
                        statePc = 243;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var16 = 1;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    if (var19 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (-1 <= ((var18.field_Vb ^ -1) & var15 ^ -1)) {
                        statePc = 250;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var16 = 1;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    if (var19 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (var12 == 0) {
                        statePc = 254;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var18 = (dm) (Object) var17.b(6);
                    if (var19 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    stackOut_255_0 = kj.field_q ^ -1;
                    stackIn_256_0 = stackOut_255_0;
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    if (stackIn_256_0 > -3) {
                        statePc = 261;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (!lc.field_m[12]) {
                        statePc = 261;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var16 = 0;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (var16 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    gb.field_a.field_Z = false;
                    if (gb.field_a.field_pb) {
                        statePc = 267;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (em.field_U.field_c.field_Kb == 0) {
                        statePc = 271;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    ui.field_j = vl.a(rn.field_b, new String[1], 2);
                    if (var19 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    ui.field_j = ka.field_s;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    if (var19 == 0) {
                        statePc = 276;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var9_ref = mh.field_c.field_Nb;
                    gg.field_m.field_wb = vl.a(ae.field_g, new String[1], 2).toUpperCase();
                    eb.field_B.a(40, fc.field_a.field_z + -40, fc.field_a.field_zb, 0, -3344);
                    eb.field_B.field_wb = vl.a(mp.field_a, new String[1], 2);
                    var8 = eb.field_B;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (qi.field_c != 0L) {
                        statePc = 279;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var9 = (int)(-bl.a((byte) 97) + qi.field_c);
                    var9 = (var9 - -999) / 1000;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    if ((var9 ^ -1) > -2) {
                        statePc = 283;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 283: {
                    var9 = 1;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    var8.field_wb = vl.a(ge.field_pb, new String[1], param0 ^ 48);
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    fn.field_h.field_wb = vl.a(pb.field_g, new String[2], 2);
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (param0 == 50) {
                        statePc = 290;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    field_t = null;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    stackOut_290_0 = mh.field_i;
                    stackOut_290_1 = -11838;
                    stackIn_301_0 = stackOut_290_0;
                    stackIn_301_1 = stackOut_290_1;
                    stackIn_291_0 = stackOut_290_0;
                    stackIn_291_1 = stackOut_290_1;
                    if (!param1) {
                        statePc = 301;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = (cj) (Object) stackIn_291_0;
                    stackOut_291_1 = stackIn_291_1;
                    stackOut_291_2 = param2;
                    stackIn_292_0 = stackOut_291_0;
                    stackIn_292_1 = stackOut_291_1;
                    stackIn_292_2 = stackOut_291_2;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    stackOut_292_0 = (cj) (Object) stackIn_292_0;
                    stackOut_292_1 = stackIn_292_1;
                    stackIn_301_0 = stackOut_292_0;
                    stackIn_301_1 = stackOut_292_1;
                    stackIn_293_0 = stackOut_292_0;
                    stackIn_293_1 = stackOut_292_1;
                    if (stackIn_292_2) {
                        statePc = 301;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    stackOut_293_0 = (cj) (Object) stackIn_293_0;
                    stackOut_293_1 = stackIn_293_1;
                    stackIn_295_0 = stackOut_293_0;
                    stackIn_295_1 = stackOut_293_1;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    stackOut_295_0 = (cj) (Object) stackIn_295_0;
                    stackOut_295_1 = stackIn_295_1;
                    stackOut_295_2 = io.field_b;
                    stackIn_296_0 = stackOut_295_0;
                    stackIn_296_1 = stackOut_295_1;
                    stackIn_296_2 = stackOut_295_2;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    stackOut_296_0 = (cj) (Object) stackIn_296_0;
                    stackOut_296_1 = stackIn_296_1;
                    stackIn_301_0 = stackOut_296_0;
                    stackIn_301_1 = stackOut_296_1;
                    stackIn_297_0 = stackOut_296_0;
                    stackIn_297_1 = stackOut_296_1;
                    if (stackIn_296_2) {
                        statePc = 301;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    stackOut_297_0 = (cj) (Object) stackIn_297_0;
                    stackOut_297_1 = stackIn_297_1;
                    stackIn_299_0 = stackOut_297_0;
                    stackIn_299_1 = stackOut_297_1;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = (cj) (Object) stackIn_299_0;
                    stackOut_299_1 = stackIn_299_1;
                    stackOut_299_2 = 1;
                    stackIn_302_0 = stackOut_299_0;
                    stackIn_302_1 = stackOut_299_1;
                    stackIn_302_2 = stackOut_299_2;
                    statePc = 302;
                    continue stateLoop;
                }
                case 301: {
                    stackOut_301_0 = (cj) (Object) stackIn_301_0;
                    stackOut_301_1 = stackIn_301_1;
                    stackOut_301_2 = 0;
                    stackIn_302_0 = stackOut_301_0;
                    stackIn_302_1 = stackOut_301_1;
                    stackIn_302_2 = stackOut_301_2;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    ((cj) (Object) stackIn_302_0).a(stackIn_302_1, stackIn_302_2 != 0);
                    stackOut_302_0 = fc.field_a;
                    stackOut_302_1 = -11838;
                    stackIn_313_0 = stackOut_302_0;
                    stackIn_313_1 = stackOut_302_1;
                    stackIn_303_0 = stackOut_302_0;
                    stackIn_303_1 = stackOut_302_1;
                    if (!param1) {
                        statePc = 313;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    stackOut_303_0 = (cj) (Object) stackIn_303_0;
                    stackOut_303_1 = stackIn_303_1;
                    stackOut_303_2 = param2;
                    stackIn_304_0 = stackOut_303_0;
                    stackIn_304_1 = stackOut_303_1;
                    stackIn_304_2 = stackOut_303_2;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    stackOut_304_0 = (cj) (Object) stackIn_304_0;
                    stackOut_304_1 = stackIn_304_1;
                    stackIn_313_0 = stackOut_304_0;
                    stackIn_313_1 = stackOut_304_1;
                    stackIn_305_0 = stackOut_304_0;
                    stackIn_305_1 = stackOut_304_1;
                    if (stackIn_304_2) {
                        statePc = 313;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    stackOut_305_0 = (cj) (Object) stackIn_305_0;
                    stackOut_305_1 = stackIn_305_1;
                    stackIn_307_0 = stackOut_305_0;
                    stackIn_307_1 = stackOut_305_1;
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    stackOut_307_0 = (cj) (Object) stackIn_307_0;
                    stackOut_307_1 = stackIn_307_1;
                    stackOut_307_2 = io.field_b;
                    stackIn_308_0 = stackOut_307_0;
                    stackIn_308_1 = stackOut_307_1;
                    stackIn_308_2 = stackOut_307_2;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    stackOut_308_0 = (cj) (Object) stackIn_308_0;
                    stackOut_308_1 = stackIn_308_1;
                    stackIn_313_0 = stackOut_308_0;
                    stackIn_313_1 = stackOut_308_1;
                    stackIn_309_0 = stackOut_308_0;
                    stackIn_309_1 = stackOut_308_1;
                    if (stackIn_308_2) {
                        statePc = 313;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    stackOut_309_0 = (cj) (Object) stackIn_309_0;
                    stackOut_309_1 = stackIn_309_1;
                    stackIn_311_0 = stackOut_309_0;
                    stackIn_311_1 = stackOut_309_1;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    stackOut_311_0 = (cj) (Object) stackIn_311_0;
                    stackOut_311_1 = stackIn_311_1;
                    stackOut_311_2 = 1;
                    stackIn_314_0 = stackOut_311_0;
                    stackIn_314_1 = stackOut_311_1;
                    stackIn_314_2 = stackOut_311_2;
                    statePc = 314;
                    continue stateLoop;
                }
                case 313: {
                    stackOut_313_0 = (cj) (Object) stackIn_313_0;
                    stackOut_313_1 = stackIn_313_1;
                    stackOut_313_2 = 0;
                    stackIn_314_0 = stackOut_313_0;
                    stackIn_314_1 = stackOut_313_1;
                    stackIn_314_2 = stackOut_313_2;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    ((cj) (Object) stackIn_314_0).a(stackIn_314_1, stackIn_314_2 != 0);
                    stackOut_314_0 = qf.field_b;
                    stackOut_314_1 = -11838;
                    stackIn_325_0 = stackOut_314_0;
                    stackIn_325_1 = stackOut_314_1;
                    stackIn_315_0 = stackOut_314_0;
                    stackIn_315_1 = stackOut_314_1;
                    if (!param1) {
                        statePc = 325;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    stackOut_315_0 = (cj) (Object) stackIn_315_0;
                    stackOut_315_1 = stackIn_315_1;
                    stackOut_315_2 = param2;
                    stackIn_316_0 = stackOut_315_0;
                    stackIn_316_1 = stackOut_315_1;
                    stackIn_316_2 = stackOut_315_2;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    stackOut_316_0 = (cj) (Object) stackIn_316_0;
                    stackOut_316_1 = stackIn_316_1;
                    stackIn_325_0 = stackOut_316_0;
                    stackIn_325_1 = stackOut_316_1;
                    stackIn_317_0 = stackOut_316_0;
                    stackIn_317_1 = stackOut_316_1;
                    if (stackIn_316_2) {
                        statePc = 325;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    stackOut_317_0 = (cj) (Object) stackIn_317_0;
                    stackOut_317_1 = stackIn_317_1;
                    stackIn_319_0 = stackOut_317_0;
                    stackIn_319_1 = stackOut_317_1;
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    stackOut_319_0 = (cj) (Object) stackIn_319_0;
                    stackOut_319_1 = stackIn_319_1;
                    stackOut_319_2 = io.field_b;
                    stackIn_320_0 = stackOut_319_0;
                    stackIn_320_1 = stackOut_319_1;
                    stackIn_320_2 = stackOut_319_2;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    stackOut_320_0 = (cj) (Object) stackIn_320_0;
                    stackOut_320_1 = stackIn_320_1;
                    stackIn_325_0 = stackOut_320_0;
                    stackIn_325_1 = stackOut_320_1;
                    stackIn_321_0 = stackOut_320_0;
                    stackIn_321_1 = stackOut_320_1;
                    if (!stackIn_320_2) {
                        statePc = 325;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    stackOut_321_0 = (cj) (Object) stackIn_321_0;
                    stackOut_321_1 = stackIn_321_1;
                    stackIn_323_0 = stackOut_321_0;
                    stackIn_323_1 = stackOut_321_1;
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    stackOut_323_0 = (cj) (Object) stackIn_323_0;
                    stackOut_323_1 = stackIn_323_1;
                    stackOut_323_2 = 1;
                    stackIn_326_0 = stackOut_323_0;
                    stackIn_326_1 = stackOut_323_1;
                    stackIn_326_2 = stackOut_323_2;
                    statePc = 326;
                    continue stateLoop;
                }
                case 325: {
                    stackOut_325_0 = (cj) (Object) stackIn_325_0;
                    stackOut_325_1 = stackIn_325_1;
                    stackOut_325_2 = 0;
                    stackIn_326_0 = stackOut_325_0;
                    stackIn_326_1 = stackOut_325_1;
                    stackIn_326_2 = stackOut_325_2;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    ((cj) (Object) stackIn_326_0).a(stackIn_326_1, stackIn_326_2 != 0);
                    em.field_U.field_c.h(-40);
                    stackOut_326_0 = null;
                    stackIn_327_0 = stackOut_326_0;
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    if (stackIn_327_0 == (Object) (Object) mh.field_c) {
                        statePc = 349;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (jp.field_b.field_T != 0) {
                        statePc = 333;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 333: {
                    ml.a(mh.field_c.i(6), param4, -76);
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    if (0 == en.field_b.field_T) {
                        statePc = 338;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    io.field_b = true;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (0 != gb.field_a.field_T) {
                        statePc = 341;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 341: {
                    cf.field_r = true;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (-1 == (pg.field_a.field_T ^ -1)) {
                        statePc = 346;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    io.field_b = false;
                    statePc = 346;
                    continue stateLoop;
                }
                case 346: {
                    ld.a(mh.field_c, false, param4, 1);
                    statePc = 349;
                    continue stateLoop;
                }
                case 349: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean c(int param0) {
        lp var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        lp stackIn_8_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_2_0 = 0;
        lp stackOut_7_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_29_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = (lp) (Object) we.field_k.c(74);
                        if (null != var1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var2 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2 >= var1.field_n) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (lp) var1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0.field_m[var2] != null) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (0 != var1.field_m[var2].field_f) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        if (var1.field_l[var2] != null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var1.field_l[var2].field_f == 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    try {
                        var2++;
                        if (var3 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param0 == 1) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        field_k = null;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = 1;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    var1_ref = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var1_ref, "so.P(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((((so) this).field_p ^ -1) == -2) {
            return;
          } else {
            try {
              L0: {
                pb.field_e.c(Integer.toString(((so) this).field_f + -param3), ((so) this).field_q >> -param2 + 16, ((so) this).field_u >> 16 - param0, 4, -1);
                pb.field_e.c(Integer.toString(-param3 + ((so) this).field_f), -param2 + ((so) this).field_i, -param0 + ((so) this).field_m, 0, -1);
                if (param1) {
                  break L0;
                } else {
                  field_k = null;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            throw decompiledCaughtException;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          oo.d(((so) this).field_q >> 16 + -param2, ((so) this).field_u >> 16 + -param0, ((so) this).field_i - param2, -param0 + ((so) this).field_m, 16711680, 10);
        }
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param3--;
                        if (-1 < (param3 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = param0;
                        var6 = param2;
                        var7 = param4;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5[var6] = var7 + tq.b(8355711, var5[var6] >> 1435928705);
                        param2++;
                        if (var8 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_k = null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) runtimeException;
                        stackOut_13_1 = new StringBuilder().append("so.I(");
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param0 == null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, qd param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        param1.a(((so) this).field_v, ((so) this).field_q, false, ((so) this).field_m, ((so) this).field_n, ((so) this).field_u, ((so) this).field_p, ((so) this).field_i);
                        if (param0 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        boolean discarded$3 = so.a(-46, (String) null);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("so.D(").append(param0).append(44);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param1 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        RuntimeException var10 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (!param7) {
                break L0;
              } else {
                ((so) this).a((byte) 113);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          super.a(0, param2);
          ((so) this).field_p = param8;
          ((so) this).field_n = param3;
          ((so) this).field_v = param0;
          ((so) this).field_q = param1;
          ((so) this).field_u = param4;
          ((so) this).field_m = param5;
          ((so) this).field_i = param6;
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
