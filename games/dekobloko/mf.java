/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends oe implements vn {
    static String field_S;
    static String field_V;
    static int field_Q;
    private ek field_U;
    private pn field_T;
    static sb field_N;
    static ck field_O;
    static int field_R;
    static String field_P;

    final void a(ce param0, int param1, int param2, int param3) {
        try {
            if (param1 < 38) {
                field_V = (String) null;
            }
            super.a(param0, 98, param2, param3);
            this.field_U.field_I = this.field_T.a(-128).a(20350) == dc.field_b ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "mf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        if (param0 != 67) {
            field_R = -124;
        }
        if (this.field_T.a(-101).a(param0 ^ 20285) != dc.field_b) {
            return;
        }
        try {
            kh.a(-31, this.field_T.i(-22079), this.field_T.f((byte) 48), this.field_T.b(false));
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "mf.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var4 = param3.getGraphics();
                  le.field_m.a((byte) 54, var4, param1, param2);
                  var4.dispose();
                  if (param0 == 1) {
                    break L2;
                  } else {
                    field_V = (String) null;
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param3.repaint();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref2);

            stackIn_7_1 = new StringBuilder().append("mf.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void h(int param0) {
        vk.field_f = hk.field_i;
        wj.field_Lb = hk.field_j;
        pa.g((byte) 115);
        dc.field_e.a(g.field_R.field_N + -42, g.field_R.field_mb, 0, 107, 0);
        fn.field_g.a(aj.field_a.field_mb, 0, 0, kf.field_O, 0);
        int var1 = kf.field_O + 2;
        gg.field_y.a(aj.field_a.field_mb, param0 ^ 5, !pd.field_a ? 0 : var1, -(!pd.field_a ? 0 : var1) + aj.field_a.field_N, 0);
        bf.c((byte) -103);
        uh.field_c.a(g.field_R.field_mb, 0, -40 + g.field_R.field_N, 40, 0);
        p.field_b.a(wm.field_h.field_mb, 0, 0, 30, 0);
        li.field_h.a(wm.field_h.field_mb, param0 ^ 5, 30, -70 + (wm.field_h.field_N - 2), 0);
        f.field_o.a(68, param0 ^ 5, 5, 30, 5);
        d.field_a.a(78, 0, 5, 30, 75);
        tg.field_f.a(48, 0, 5, 30, 155);
        md.field_X.a(48, 0, param0, 30, 205);
        int var2 = !pd.field_a ? 200 : 250;
        jc.field_h.a(363 + -var2, param0 + -5, 5, 30, 5 - -var2);
        bk.field_Rb.a(-370 + (wm.field_h.field_mb - 5), 0, 5, 30, 370);
        gf.field_c.a(6, 37, vh.field_e, 5, -10 + (li.field_h.field_N - 32), li.field_h.field_mb - 5 - 5, 2);
        int var3 = (wm.field_h.field_mb + 2) / 2;
        o.field_a.a(var3 + -2, 0, wm.field_h.field_N + -40, 40, 0);
        if (!pd.field_a) {
            var3 = 0;
        }
        se.field_U.a(wm.field_h.field_mb - var3, 0, wm.field_h.field_N + -40, 40, var3);
    }

    final static void a(int param0, String[] param1, byte[] param2, ji param3, int param4, String[][] param5, ck[][] param6, int param7, String[][] param8, String[] param9, String[] param10, ck[][] param11, int param12, byte[] param13, int[] param14) {
        qd[] array$0 = null;
        qd[] array$1 = null;
        qd[] array$2 = null;
        w stackIn_4_0 = null;
        w stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        w stackIn_4_3 = null;
        w stackIn_5_0 = null;
        w stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        w stackIn_5_3 = null;
        w stackIn_6_0 = null;
        w stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        w stackIn_6_3 = null;
        String stackIn_6_4 = null;
        int stackIn_39_0 = 0;
        int stackIn_56_0 = 0;
        qd stackIn_66_0 = null;
        Object stackIn_74_0 = null;
        qd stackIn_88_0 = null;
        Object stackIn_94_0 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        qd stackOut_65_0;
        qd stackOut_87_0;
        int statePc = 0;
        RuntimeException var15 = null;
        w var16 = null;
        int var17_int = 0;
        Object var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        w var23 = null;
        w var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    pa.field_db = param10;
                    jj.field_a = param1;
                    gn.field_c = param5;
                    hb.field_Qb = param8;
                    pf.field_k = param9;
                    hd.field_u = param0;
                    rn.field_e = param6;
                    da.field_a = param13;
                    mg.field_Vb = param7;
                    be.field_u = param11;
                    ne.field_c = param2;
                    b.field_P = param14;
                    fj.field_a = bj.a(112, param3, "lobby", "gameprivacy");
                    si.field_d = bj.a(112, param3, "lobby", "ratedgame");
                    client.field_x = bj.a(112, param3, "lobby", "opentome");
                    bb.field_b = bj.a(112, param3, "lobby", "allowspectators");
                    ed.field_b = new String[5];
                    ed.field_b[2] = om.field_g;
                    ed.field_b[3] = hd.field_p;
                    ed.field_b[4] = ik.field_a;
                    ed.field_b[1] = ul.field_h;
                    ed.field_b[0] = dk.field_b;
                    gg.field_y = new w(0L, (w) null);
                    gh.field_b = new w(0L, fh.field_g, cb.field_h);
                    kn.field_r = new w(0L, dd.field_k, ak.field_a);
                    ec.field_k = new nm(0L, new w(0L, (w) null), gf.field_g, tm.field_b);
                    gg.field_y.a(gh.field_b, -16834);
                    if (!pd.field_a) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    gg.field_y.a(kn.field_r, param4 + -7940);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    gg.field_y.a(ec.field_k, -16834);
                    ec.field_k.field_Rb.a(-122, ua.field_H);
                    var23 = ec.field_k.field_Rb;
                    var24 = var23;
                    ec.field_k.field_Rb.field_W = 1;
                    var24.field_X = 1;
                    fn.field_g = new w(0L, ua.field_H);
                    fn.field_g.field_X = 1;
                    uh.field_c = new w(0L, hd.field_q, pc.field_f.toUpperCase());
                    p.field_b = new w(0L, ml.field_a, in.field_u.toUpperCase());
                    li.field_h = new w(0L, bf.field_t);
                    f.field_o = new w(0L, fh.field_g, li.field_c);
                    d.field_a = new w(0L, bl.field_Y, ml.field_c);
                    tg.field_f = new w(0L, bl.field_Y, ba.field_e);
                    md.field_X = new w(0L, bl.field_Y, be.field_o);
                    jc.field_h = new w(0L, bl.field_Y, gk.field_Db);
                    bk.field_Rb = new w(0L, dd.field_k, bk.field_Qb);
                    gf.field_c = new nm(0L, new w(0L, (w) null), gf.field_g, tm.field_b);
                    o.field_a = new w(0L, d.field_g, qe.field_c.toUpperCase());
                    o.field_a.field_Hb = pd.field_a;
                    stackIn_5_0 = null;
                    stackIn_4_0 = stackIn_5_0;
                    stackIn_5_1 = null;
                    stackIn_4_1 = stackIn_5_1;
                    stackIn_5_2 = 0L;
                    stackIn_4_2 = stackIn_5_2;
                    stackIn_5_3 = d.field_g;
                    stackIn_4_3 = stackIn_5_3;
                    if (pd.field_a) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = null;
                    stackIn_6_1 = null;
                    stackIn_6_2 = stackIn_4_2;
                    stackIn_6_3 = (w) ((Object) stackIn_4_3);
                    stackIn_6_4 = pl.field_c;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = null;
                    stackIn_6_1 = null;
                    stackIn_6_2 = stackIn_5_2;
                    stackIn_6_3 = (w) ((Object) stackIn_5_3);
                    stackIn_6_4 = p.field_c;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    se.field_U = new w(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
                    wm.field_h = new w(0L, (w) null);
                    wm.field_h.a(p.field_b, -16834);
                    wm.field_h.a(li.field_h, -16834);
                    li.field_h.a(f.field_o, -16834);
                    li.field_h.a(d.field_a, -16834);
                    li.field_h.a(tg.field_f, -16834);
                    if (pd.field_a) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    li.field_h.a(md.field_X, -16834);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    li.field_h.a(jc.field_h, -16834);
                    li.field_h.a(bk.field_Rb, -16834);
                    li.field_h.a(gf.field_c, param4 + -7940);
                    if (!pd.field_a) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    wm.field_h.a(o.field_a, -16834);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    wm.field_h.a(se.field_U, -16834);
                    f.field_n = new w(0L, ua.field_H);
                    f.field_n.field_W = 0;
                    f.field_n.field_X = 1;
                    ce.field_A = new w(0L, kn.field_p, gm.field_J.toUpperCase());
                    tc.field_Ob = new w(0L, ui.field_x);
                    tc.field_Ob.a(f.field_n, -16834);
                    tc.field_Ob.a(ce.field_A, -16834);
                    cl.field_n = new w(0L, gf.field_g);
                    cl.field_n.a(-128, ua.field_H);
                    cl.field_n.field_W = 1;
                    var16 = cl.field_n;
                    var16.field_X = 1;
                    in.field_o = new w(0L, (w) null);
                    if (param4 == -8894) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    he.field_jb = new w(0L, ua.field_H);
                    he.field_jb.field_X = 1;
                    kl.field_r = new w(0L, fh.field_g, cb.field_h);
                    ea.field_A = new w(0L, dd.field_k, ak.field_a);
                    tb.field_b = new nm(0L, new w(0L, (w) null), gf.field_g, tm.field_b);
                    in.field_o.a(he.field_jb, -16834);
                    in.field_o.a(kl.field_r, -16834);
                    if (pd.field_a) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    in.field_o.a(ea.field_A, param4 ^ 25468);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    in.field_o.a(tb.field_b, param4 ^ 25468);
                    ma.field_G = new w(0L, hd.field_q, om.field_b.toUpperCase());
                    fl.field_b = new w(0L, ml.field_a);
                    qm.field_a = new w(0L, bf.field_t);
                    li.field_d = new w(0L, i.field_e, bk.field_Nb.toUpperCase());
                    um.field_c = new w[4 + param12];
                    qa.field_v = new qd[param12 - -4][];
                    um.field_c[0] = new w(0L, sg.field_e, qc.field_l);
                    qa.field_v[0] = new qd[6];
                    var17_int = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((var17_int ^ -1) <= -6) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    qa.field_v[0][var17_int - -1] = new qd(0L, l.field_a, (w) null, df.field_ab, fj.field_a[var17_int], ed.field_b[var17_int]);
                    var17_int++;
                    if (var21 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var21 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (2 <= b.field_P.length) {
                        statePc = 23;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 23: {
                    um.field_c[1] = new w(0L, sg.field_e, hb.field_Pb);
                    array$0 = new qd[1 + b.field_P.length];
                    qa.field_v[1] = array$0;
                    qa.field_v[1][0] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var17_int = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (b.field_P.length <= var17_int) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    qa.field_v[1][var17_int + 1] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, Integer.toString(b.field_P[var17_int]));
                    var17_int++;
                    if (var21 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var21 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    um.field_c[2] = new w(0L, sg.field_e, bc.field_G);
                    qa.field_v[2] = new qd[]{new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t), new qd(0L, l.field_a, (w) null, df.field_ab, bb.field_b[0], jh.field_f), new qd(0L, l.field_a, (w) null, df.field_ab, bb.field_b[1], h.field_f)};
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (mg.field_Vb <= 1) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    um.field_c[3] = new w(0L, sg.field_e, mk.field_a);
                    array$1 = new qd[mg.field_Vb + 1];
                    qa.field_v[3] = array$1;
                    qa.field_v[3][0] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t);
                    var17_int = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (mg.field_Vb <= var17_int) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    qa.field_v[3][var17_int - -1] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, pf.field_k[var17_int]);
                    var17_int++;
                    if (var21 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var21 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var17_int = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (param12 <= var17_int) {
                        statePc = 55;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    um.field_c[4 + var17_int] = new w(0L, sg.field_e, pa.field_db[var17_int]);
                    array$2 = new qd[lb.a((int) da.field_a[var17_int], 255) - -1];
                    qa.field_v[4 - -var17_int] = array$2;
                    qa.field_v[var17_int + 4][0] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t);
                    stackIn_56_0 = 0;
                    stackIn_39_0 = stackIn_56_0;
                    if (var21 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var18 = stackIn_39_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if ((da.field_a[var17_int] & 255) <= var18) {
                        statePc = 53;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var21 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (rn.field_e == null) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (null != rn.field_e[var17_int]) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var19_ref = null;
                    statePc = 47;
                    continue stateLoop;
                }
                case 45: {
                    var19_ref = rn.field_e[var17_int][var18];
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    var19_ref = null;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (null != gn.field_c) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var20 = null;
                    statePc = 52;
                    continue stateLoop;
                }
                case 49: {
                    if (null == gn.field_c[var17_int]) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var20 = gn.field_c[var17_int][var18];
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    var20 = null;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    qa.field_v[var17_int + 4][var18 - -1] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) (var19_ref), (String) (var20));
                    var18++;
                    if (var21 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var17_int++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var21 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var17_int = stackIn_56_0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var17_int >= param12 - -4) {
                        statePc = 72;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var21 != 0) {
                        statePc = 73;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (null != um.field_c[var17_int]) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    um.field_c[var17_int].field_Db = 11;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (null == qa.field_v[var17_int]) {
                        statePc = 71;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var18 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var18 >= qa.field_v[var17_int].length) {
                        statePc = 71;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = qa.field_v[var17_int][var18];
                    stackIn_74_0 = stackOut_65_0;
                    stackIn_66_0 = stackOut_65_0;
                    if (var21 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (stackIn_66_0 == null) {
                        statePc = 70;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (qa.field_v[var17_int][var18].field_Tb != null) {
                        statePc = 69;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 69: {
                    qa.field_v[var17_int][var18].field_Tb.field_Db = 11;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var18++;
                    if (var21 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var17_int++;
                    if (var21 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    fh.field_d = new w(0L, d.field_g);
                    nn.field_a = new w(0L, d.field_g);
                    tg.field_i = new w(0L, fc.field_c);
                    tg.field_i.a(-112, ua.field_H);
                    tg.field_i.field_W = 1;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = tg.field_i;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var17 = stackIn_74_0;
                    ((w) (var17)).field_X = 1;
                    oh.field_d = new w(0L, (w) null);
                    oh.field_d.a(fl.field_b, -16834);
                    oh.field_d.a(qm.field_a, -16834);
                    qm.field_a.a(li.field_d, -16834);
                    var18 = 0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (var18 >= 4 + param12) {
                        statePc = 93;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var21 != 0) {
                        statePc = 130;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((var18 ^ -1) != -2) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (-3 >= (b.field_P.length ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var21 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var18 != 3) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (-2 > (mg.field_Vb ^ -1)) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var21 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    qm.field_a.a(um.field_c[var18], -16834);
                    var19 = 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (var19 >= qa.field_v[var18].length) {
                        statePc = 92;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackOut_87_0 = qa.field_v[var18][var19];
                    stackIn_94_0 = stackOut_87_0;
                    stackIn_88_0 = stackOut_87_0;
                    if (var21 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (stackIn_88_0 != null) {
                        statePc = 90;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 90: {
                    qm.field_a.a(qa.field_v[var18][var19], -16834);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var19++;
                    if (var21 == 0) {
                        statePc = 86;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var18++;
                    if (var21 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    oh.field_d.a(fh.field_d, -16834);
                    oh.field_d.a(nn.field_a, param4 + -7940);
                    oh.field_d.a(tg.field_i, -16834);
                    ie.field_a = new w(0L, tg.field_h, ea.field_u.toUpperCase());
                    stackIn_94_0 = new w(0L, kn.field_p, kb.field_d.toUpperCase());
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    qc.field_q = (w) ((Object) stackIn_94_0);
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void g(int param0) {
        int var2 = 250;
        this.field_T.b(25, 140, -var2 + this.field_t >> 876882657, this.field_y - 5 >> -262495615, -16555);
        this.field_U.b(30, 100, 10 + (140 + (-var2 + this.field_t >> -1122840863)), 2 + (20 + (this.field_y - param0) >> -5749503), param0 ^ -16565);
    }

    final static void a(byte param0, int param1) {
        if (param0 < 80) {
            field_S = (String) null;
        }
        uf var2 = we.field_b;
        var2.f(param1, -4);
        var2.a(true, 2);
        var2.a(true, 4);
        var2.a(true, am.b(112));
    }

    public static void i(int param0) {
        field_O = null;
        field_S = null;
        field_V = null;
        field_N = null;
        field_P = null;
        if (param0 != -17690) {
            field_O = (ck) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, -106, param2, param3);
        bj.field_f.a(vf.field_e, 4 + param0 + this.field_u, 4 + bj.field_f.field_R + param3 - -this.field_D, 16777215, -1);
        if (param1 >= -103) {
            ek var6 = (ek) null;
            this.a((byte) -51, -52, (ek) null, -94, 59);
        }
    }

    mf(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (gl) null);
        this.field_T = new pn(new di(10000536), gf.field_i, 0, 0, 140, 25);
        this.field_T.a((byte) 79, new qf());
        this.field_U = new ek(fa.field_o, (kg) (this));
        this.field_K = new ce[]{(ce) ((Object) this.field_T), (ce) ((Object) this.field_U)};
        this.field_U.field_p = (gl) ((Object) new fk());
        this.f(119);
    }

    static {
        field_V = "Add name";
        field_S = "Please select options in the following rows:  ";
        field_O = new ck(36, 36);
        field_P = "Achievements";
    }
}
