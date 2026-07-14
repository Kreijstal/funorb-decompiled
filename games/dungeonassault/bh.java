/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bh extends ck {
    private ci field_O;
    static int field_P;
    static boolean field_M;
    static String field_L;
    static String field_Q;
    private String[] field_R;
    static String[] field_J;
    static String field_K;
    static String[] field_N;
    private md field_S;

    final static int b(int param0, int param1, boolean param2) {
        int var3 = tg.field_f[param1][param0];
        if (param2) {
            return -123;
        }
        if (ke.a(71, var3)) {
            return 260;
        }
        return tg.field_b[param1];
    }

    final static String a(int param0, int param1) {
        if (param0 <= 116) {
            return null;
        }
        if (param1 == ek.field_c) {
            return null;
        }
        return cc.field_e[param1];
    }

    public static void f(byte param0) {
        field_J = null;
        int var1 = -97 / ((param0 - -1) / 33);
        field_L = null;
        field_N = null;
        field_K = null;
        field_Q = null;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((bh) this).g((byte) -109);
    }

    final void a(int param0, int param1, String param2) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (null != ((bh) this).field_R) {
            // if_icmpgt L84
        }
        String[] var7 = new String[param1 - -1];
        String[] var4 = var7;
        if (((bh) this).field_R != null) {
            for (var5 = 0; var5 < ((bh) this).field_R.length; var5++) {
                var7[var5] = ((bh) this).field_R[var5];
            }
        }
        ((bh) this).field_R = var4;
        if (param0 != 8) {
            return;
        }
        ((bh) this).field_R[param1] = param2;
    }

    bh(String param0, ca param1) {
        super(param0, (pg) null);
        ((bh) this).field_O = null;
        ((bh) this).field_o = param1;
    }

    boolean a(int param0, lm param1) {
        if (param0 != 34) {
            field_K = null;
            return false;
        }
        return false;
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -((bh) this).field_q + param3;
        int var6 = param0 - ((bh) this).field_v;
        ci var7 = this.a(var5, var6, true);
        if (var7 != null) {
            if (((bh) this).field_n != null) {
                ((pf) (Object) ((bh) this).field_n).a(var7.field_r, (bh) this, param2 + 125, param1);
            }
        }
    }

    final static int a(boolean param0, String param1, int param2, int param3, boolean param4, String param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = DungeonAssault.field_K;
                        if (null != sp.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!rj.a((byte) 98, param4)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return -1;
                    }
                    case 4: {
                        if (pd.field_A == no.field_c) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (!param4) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var10 = null;
                        be.field_n = l.a(param1, false, hg.field_s, false, (String) null);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        be.field_n = qf.a(96, false, param1, param5);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ac.field_B.field_o = 0;
                        ac.field_B.a(6, 14);
                        ac.field_B.a(6, be.field_n.b(-110).field_c);
                        op.a(0, -1);
                        pd.field_A = ik.field_b;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (pd.field_A != ik.field_b) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (oi.a(-12929, 1)) {
                            statePc = 13;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var6 = ra.field_c.c(true);
                        if (var6 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        pd.field_A = mh.field_c;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        hc.field_c = var6;
                        nj.field_b = -1;
                        pd.field_A = bj.field_K;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        ra.field_c.field_o = 0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (mh.field_c == pd.field_A) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (oi.a(-12929, 8)) {
                            statePc = 21;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        o.field_j = ra.field_c.c((byte) 105);
                        ra.field_c.field_o = 0;
                        b.a(be.field_n, param0, (byte) -27, param3, param4);
                        pd.field_A = rp.field_d;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (rp.field_d != pd.field_A) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (oi.a(-12929, 1)) {
                            statePc = 25;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        var6 = ra.field_c.c(true);
                        ra.field_c.field_o = 0;
                        hc.field_c = var6;
                        pd.field_E = null;
                        if (0 == var6) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if ((var6 ^ -1) == -2) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (var6 == 8) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        pd.field_A = bj.field_K;
                        nj.field_b = -1;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 29: {
                        tl.a(127);
                        nh.field_e = false;
                        return var6;
                    }
                    case 30: {
                        nj.field_b = -1;
                        pd.field_A = k.field_e;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (param2 > 99) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        field_N = null;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (k.field_e != pd.field_A) {
                            statePc = 74;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (kh.d((byte) -86)) {
                            statePc = 36;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        hg.field_s = ra.field_c.c((byte) 53);
                        nh.field_k = ra.field_c.c(true);
                        int discarded$12 = ra.field_c.c(true);
                        pb.field_G = ra.field_c.k(0);
                        var6_ref = ra.field_c.b(true);
                        var7 = ra.field_c.c(true);
                        if (-1 == (1 & var7 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        l.b(false);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (!param4) {
                            statePc = 40;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        if (0 == (8 & var7)) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 42: {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        field_M = stackIn_43_0 != 0;
                        if ((var7 & 4) == 0) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        stackOut_44_0 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 45: {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        e.field_l = stackIn_46_0 != 0;
                        if (field_M) {
                            statePc = 47;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        if (fa.field_j) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        int discarded$13 = ra.field_c.c(true);
                        int discarded$14 = ra.field_c.c(true);
                        int discarded$15 = ra.field_c.h(-59);
                        ao.field_k = ra.field_c.k(0);
                        ti.field_q = new byte[ao.field_k];
                        var8 = 0;
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if (var8 >= ao.field_k) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        ti.field_q[var8] = ra.field_c.a((byte) 2);
                        var8++;
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 52: {
                        tc.field_u = ra.field_c.d(-98);
                        var11 = (CharSequence) (Object) tc.field_u;
                        nn.field_k = jm.a((byte) 59, var11);
                        hf.field_sb = ra.field_c.c(true);
                        pd.field_A = qa.field_c;
                        if (be.field_n.b(65) != pe.field_j) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        ba.field_e.a(64, m.c(true));
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 54: {
                        if (be.field_n.b(-104) == ug.field_w) {
                            statePc = 56;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        gg.field_c.a(64, m.c(true));
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        nh.field_e = false;
                        if (var6_ref == null) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        jb.a(true, var6_ref, m.c(true));
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        if (pb.field_G > 0) {
                            statePc = 65;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        if (e.field_l) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        try {
                            Object discarded$16 = ee.a((byte) -21, m.c(true), "unzap");
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        var8_ref_Throwable = caughtException;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 65: {
                        try {
                            Object discarded$17 = ee.a("zap", m.c(true), 15647, new Object[1]);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        var8_ref_Throwable = caughtException;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        if ((pb.field_G ^ -1) >= -1) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        ld.field_g = true;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 70: {
                        ac.field_B.a(n.field_f, (byte) -86);
                        var8 = 0;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 71: {
                        if (4 <= var8) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        n.field_f[var8] = n.field_f[var8] + 50;
                        var8++;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 73: {
                        ra.field_c.a(n.field_f, (byte) -108);
                        return hc.field_c;
                    }
                    case 74: {
                        if (pd.field_A != bj.field_K) {
                            statePc = 84;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        if (!kh.d((byte) -60)) {
                            statePc = 84;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        tl.a(-17);
                        if (-8 != (hc.field_c ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        if (!nh.field_e) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        if (hc.field_c == 7) {
                            statePc = 81;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        hc.field_c = 3;
                        statePc = 82;
                        continue stateLoop;
                    }
                    case 82: {
                        tp.field_v = ra.field_c.d(-96);
                        nh.field_e = false;
                        return hc.field_c;
                    }
                    case 83: {
                        nh.field_e = true;
                        return -1;
                    }
                    case 84: {
                        if (null != sp.field_c) {
                            statePc = 91;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        if (!nh.field_e) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        if (b.a(123) <= 30000L) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        tp.field_v = lh.field_r;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 88: {
                        tp.field_v = fc.field_l;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        nh.field_e = false;
                        return 3;
                    }
                    case 90: {
                        var6 = an.field_E;
                        an.field_E = l.field_b;
                        l.field_b = var6;
                        nh.field_e = true;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 91: {
                        return -1;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ((bh) this).b(0, param2, param3, param0, ((th) (Object) ((bh) this).field_o).a((lm) this, 8));
        if (param1 >= -11) {
            field_M = false;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2 ^ param2, param3);
        if (-1 != (param0 ^ -1)) {
            return;
        }
        th var5 = (th) (Object) ((bh) this).field_o;
        ci var6 = ((bh) this).field_O;
        if (var6 != null) {
            var7 = var5.a((lm) this, (byte) 75, param1);
            var8 = var5.a((byte) 84, param3, (lm) this);
            do {
                in.a(-2 + (var6.field_k + var7), var6.field_p + 2, var6.field_i + 2, var6.field_l + (var8 - 2), 1);
                var6 = var6.field_o;
            } while (var6 != null);
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((bh) this).field_O = null;
        if (!(!((bh) this).field_u)) {
            var5 = -((bh) this).field_q + (hj.field_S - param0);
            var6 = -param1 + eh.field_h - ((bh) this).field_v;
            ((bh) this).field_O = this.a(var5, var6, true);
        }
        if (!param3) {
            String discarded$0 = bh.a(110, 28);
        }
    }

    final void g(byte param0) {
        int var2 = 0;
        th var3 = null;
        int var4 = 0;
        l var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ci var11 = null;
        int var12 = 0;
        tg var13 = null;
        int var14 = 0;
        int var15 = 0;
        ci var16 = null;
        int var17 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var17 = DungeonAssault.field_K;
        ((bh) this).field_S = new md();
        var2 = 0;
        var3 = (th) (Object) ((bh) this).field_o;
        var4 = -22 / ((param0 - -42) / 62);
        var5 = var3.b(-2, (lm) this);
        L0: while (true) {
          var6 = ((bh) this).field_w.indexOf("<hotspot=", var2);
          if (0 != (var6 ^ -1)) {
            var8 = ((bh) this).field_w.indexOf(">", var6);
            var7 = ((bh) this).field_w.substring(var6 - -9, var8);
            var8 = Integer.parseInt(var7);
            var2 = ((bh) this).field_w.indexOf("</hotspot>", var6);
            var9 = var5.a(0, var6);
            var10 = var5.a(0, var2);
            var11 = null;
            var12 = var9;
            L1: while (true) {
              if (var10 < var12) {
                continue L0;
              } else {
                L2: {
                  var13 = var5.field_e[var12];
                  if (var12 == var9) {
                    stackOut_7_0 = var5.a((byte) 60, var6);
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = var13.field_k[0];
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_8_0;
                  if (var10 != var12) {
                    if (var13 == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var13.field_k[-1 + var13.field_k.length];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  } else {
                    stackOut_9_0 = var5.a((byte) 70, var2);
                    stackIn_13_0 = stackOut_9_0;
                    break L3;
                  }
                }
                L4: {
                  var15 = stackIn_13_0;
                  var16 = new ci(var8, var14, var13.field_m, -var14 + var15, Math.max(var3.a(100), -var13.field_m + var13.field_c));
                  if (var11 != null) {
                    var11.field_o = var16;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((bh) this).field_S.a((ne) (Object) var16, false);
                var11 = var16;
                var12++;
                continue L1;
              }
            }
          } else {
            return;
          }
        }
    }

    private final ci a(int param0, int param1, boolean param2) {
        ci var4 = null;
        ci var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        var4 = (ci) (Object) ((bh) this).field_S.e(-24172);
        if (param2) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (ci) (Object) ((bh) this).field_S.a(4);
                  continue L0;
                } else {
                  L2: {
                    if (param0 < var5.field_k) {
                      break L2;
                    } else {
                      if (param1 < var5.field_l) {
                        break L2;
                      } else {
                        if (var5.field_i + var5.field_k <= param0) {
                          break L2;
                        } else {
                          if (var5.field_l - -var5.field_p >= param1) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_o;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    String c(byte param0) {
        if (((bh) this).field_O == null) {
            return null;
        }
        if (((bh) this).field_R == null) {
            return null;
        }
        if (param0 <= 3) {
            return null;
        }
        if (((bh) this).field_R.length <= ((bh) this).field_O.field_r) {
            return null;
        }
        return ((bh) this).field_R[((bh) this).field_O.field_r];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = true;
        field_J = new String[]{"Welcome", "Welcome to <%highlight>Dungeon Assault</col>! In this game, you play a dragon, battling your kind to gain <%highlight>Renown</col> in the realm of Dungaria.<br><br><%command>You can hide this tutorial by clicking on the down arrow icon at the top-right of this scroll, and return to it by clicking the visible portion of this scroll at the right edge of the screen. You can also reposition it by holding the mouse button and dragging.</col><br><br><%command>Click the arrow at the bottom-right of this scroll to continue."};
        field_L = "There is a pit in this room, but it remains concealed until a raider steps on it.";
        field_K = "OVER <%0>";
        field_Q = "Please log in to access this feature.";
        field_N = new String[]{"Master of Chaos", "Sacrifice a raider to defeat any room. (Multiple use)"};
    }
}
