/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends gg {
    static int field_o;
    static boolean field_m;
    byte[] field_h;
    static int[] field_n;
    g[] field_i;
    private int[] field_k;
    byte[] field_r;
    byte[] field_p;
    sh[] field_q;
    static gl field_l;
    int field_j;
    short[] field_s;

    final static int a(String param0, int param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            String var12 = null;
            CharSequence var13 = null;
            int stackIn_41_0 = 0;
            int stackIn_44_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = SolKnight.field_L ? 1 : 0;
                        if (null == lf.field_d) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!ai.a(param2, (byte) -37)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return -1;
                    }
                    case 5: {
                        if (qc.field_i != ef.field_e) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (param2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        lf.field_a = rj.a(param0, (byte) 102, param4, false);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = null;
                        lf.field_a = pb.a(false, param4, kc.field_P, 0, (String) null);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        id.field_c.field_m = 0;
                        id.field_c.c(param5 ^ -121, 14);
                        id.field_c.c(-127, lf.field_a.a(77).field_e);
                        qf.a(param5 + 0, -1);
                        ef.field_e = gl.field_s;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (ef.field_e != gl.field_s) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (bf.c(81, 1)) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var6 = te.field_N.j(255);
                        te.field_N.field_m = 0;
                        if (0 != var6) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        ef.field_e = pl.field_b;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        ef.field_e = ik.field_e;
                        ob.field_h = var6;
                        te.field_O = -1;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (ef.field_e == pl.field_b) {
                            statePc = 18;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (bf.c(54, 8)) {
                            statePc = 20;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        i.field_H = te.field_N.a(10526);
                        te.field_N.field_m = 0;
                        ci.a(-25776, param2, param1, lf.field_a, param3);
                        ef.field_e = rc.field_o;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (ef.field_e != rc.field_o) {
                            statePc = 30;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (!bf.c(53, 1)) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var6 = te.field_N.j(255);
                        ob.field_h = var6;
                        te.field_N.field_m = 0;
                        ri.field_a = null;
                        if (0 == var6) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if ((var6 ^ -1) != -2) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        ef.field_e = dk.field_h;
                        te.field_O = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 27: {
                        if ((var6 ^ -1) != -9) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        je.a(false);
                        je.field_c = false;
                        return var6;
                    }
                    case 29: {
                        ef.field_e = ik.field_e;
                        te.field_O = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (dk.field_h == ef.field_e) {
                            statePc = 32;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        if (qd.b((byte) 127)) {
                            statePc = 34;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        kc.field_P = te.field_N.a(10526);
                        lh.field_s = te.field_N.j(255);
                        int discarded$14 = te.field_N.j(param5 + 255);
                        ob.field_l = te.field_N.i(param5 + -103);
                        var12 = te.field_N.g(87);
                        var7 = te.field_N.j(255);
                        if (0 != (var7 & 1)) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        uf.d(31911);
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (param2) {
                            statePc = 45;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        if ((4 & var7) == 0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        stackOut_39_0 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 40: {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        lc.field_u = stackIn_41_0 != 0;
                        if (0 == (8 & var7)) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        stackOut_42_0 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 43: {
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        fb.field_a = stackIn_44_0 != 0;
                        if (!fb.field_a) {
                            statePc = 45;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        if (!b.field_b) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        int discarded$15 = te.field_N.j(255);
                        int discarded$16 = te.field_N.j(255);
                        int discarded$17 = te.field_N.e(true);
                        me.field_d = te.field_N.i(param5 + -105);
                        dk.field_l = new byte[me.field_d];
                        var8 = 0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (var8 >= me.field_d) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        dk.field_l[var8] = te.field_N.a((byte) -14);
                        var8++;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 49: {
                        ne.field_g = te.field_N.h(16);
                        var13 = (CharSequence) (Object) ne.field_g;
                        kf.field_D = jg.a(var13, -2);
                        c.field_H = te.field_N.j(255);
                        ef.field_e = jj.field_Y;
                        if (lf.field_a.a(123) != dc.field_k) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        sk.field_p.a((byte) 82, ia.g(-55));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 51: {
                        if (lf.field_a.a(param5 + 70) != qb.field_L) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        bb.field_I.a((byte) 104, ia.g(-78));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        je.field_c = false;
                        if (var12 != null) {
                            statePc = 55;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        kl.a(ia.g(90), var12, 13536);
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 56: {
                        if (ob.field_l > 0) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        if (!lc.field_u) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        try {
                            Object discarded$18 = fd.a(param5 + -4476, ia.g(-63), "zap", new Object[1]);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        var8_ref_Throwable = caughtException;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 62: {
                        try {
                            Object discarded$19 = fd.a(ia.g(param5 + 110), "unzap", (byte) 101);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        var8_ref_Throwable = caughtException;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (0 >= ob.field_l) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        cl.field_m = true;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        id.field_c.a(-1, ed.field_a);
                        var8 = 0;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        if ((var8 ^ -1) <= -5) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        ed.field_a[var8] = ed.field_a[var8] + 50;
                        var8++;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 70: {
                        te.field_N.a(-1, ed.field_a);
                        return ob.field_h;
                    }
                    case 71: {
                        if (ik.field_e == ef.field_e) {
                            statePc = 73;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        if (!qd.b((byte) 125)) {
                            statePc = 82;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        je.a(false);
                        if (-8 != (ob.field_h ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        if (!je.field_c) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        if ((ob.field_h ^ -1) == -8) {
                            statePc = 79;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        ob.field_h = 3;
                        statePc = 80;
                        continue stateLoop;
                    }
                    case 80: {
                        md.field_v = te.field_N.h(param5 + 121);
                        je.field_c = false;
                        return ob.field_h;
                    }
                    case 81: {
                        je.field_c = true;
                        return -1;
                    }
                    case 82: {
                        if (param5 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 83: {
                        var10 = null;
                        ve discarded$20 = fc.a((Throwable) null, (String) null);
                        statePc = 84;
                        continue stateLoop;
                    }
                    case 84: {
                        if (null == lf.field_d) {
                            statePc = 86;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        if (je.field_c) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        var6 = ia.field_kb;
                        ia.field_kb = ki.field_C;
                        ki.field_C = var6;
                        je.field_c = true;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 88: {
                        if (dh.b(-1) > 30000L) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        md.field_v = cl.field_j;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 90: {
                        md.field_v = il.field_d;
                        statePc = 91;
                        continue stateLoop;
                    }
                    case 91: {
                        je.field_c = false;
                        return 3;
                    }
                    case 92: {
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

    final void a(int param0) {
        ((fc) this).field_k = null;
        if (param0 != 6890) {
            fc.a((byte) 62);
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_l = null;
        if (param0 != 124) {
            Object var2 = null;
            ve discarded$0 = fc.a((Throwable) null, (String) null);
        }
    }

    final boolean a(me param0, int[] param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        sh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        var6 = 89 % ((-82 - param3) / 36);
        var5 = 1;
        var7 = 0;
        var8 = null;
        var9 = 0;
        L0: while (true) {
          if ((var9 ^ -1) <= -129) {
            return var5 != 0;
          } else {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param2[var9] != 0) {
                  break L1;
                } else {
                  var9++;
                  continue L0;
                }
              }
            }
            var10 = ((fc) this).field_k[var9];
            if (0 != var10) {
              L2: {
                if (var7 == var10) {
                  break L2;
                } else {
                  L3: {
                    var7 = var10;
                    var10--;
                    if (0 == (var10 & 1)) {
                      var8 = param0.a(0, var10 >> 1600326754, param1);
                      break L3;
                    } else {
                      var8 = param0.a(param1, -2, var10 >> -530492670);
                      break L3;
                    }
                  }
                  if (var8 == null) {
                    var5 = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (var8 != null) {
                ((fc) this).field_q[var9] = var8;
                ((fc) this).field_k[var9] = 0;
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    final static ve a(Throwable param0, String param1) {
        ve var2_ref = null;
        ve var2 = null;
        if (param0 instanceof ve) {
            var2 = (ve) (Object) param0;
            var2.field_d = var2.field_d + 32 + param1;
        } else {
            var2_ref = new ve(param0, param1);
        }
        return var2_ref;
    }

    fc(byte[] param0) {
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        g[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        g var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        g var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        gb var38 = null;
        byte[] var39 = null;
        g var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        g var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        g var48 = null;
        g var49 = null;
        g var50 = null;
        g var51 = null;
        g var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] var59 = null;
        byte[] var60 = null;
        byte[] var61 = null;
        byte[] var62 = null;
        byte[] var63 = null;
        byte[] var64 = null;
        byte[] var65 = null;
        byte[] var66 = null;
        byte[] var67 = null;
        byte[] var68 = null;
        byte[] var69 = null;
        byte[] var70 = null;
        byte[] stackIn_38_0 = null;
        byte[] stackIn_41_0 = null;
        byte[] stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_40_0 = null;
        byte[] stackOut_39_0 = null;
        ((fc) this).field_r = new byte[128];
        ((fc) this).field_p = new byte[128];
        ((fc) this).field_h = new byte[128];
        ((fc) this).field_i = new g[128];
        ((fc) this).field_q = new sh[128];
        ((fc) this).field_s = new short[128];
        ((fc) this).field_k = new int[128];
        var38 = new gb(param0);
        var3 = 0;
        L0: while (true) {
          if (0 == var38.field_l[var3 + var38.field_m]) {
            var67 = new byte[var3];
            var61 = var67;
            var55 = var61;
            var42 = var55;
            var4 = var42;
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                var3++;
                var38.field_m = var38.field_m + 1;
                var5 = var38.field_m;
                var38.field_m = var38.field_m + var3;
                var6 = 0;
                L2: while (true) {
                  if (var38.field_l[var38.field_m + var6] == 0) {
                    var68 = new byte[var6];
                    var62 = var68;
                    var56 = var62;
                    var43 = var56;
                    var7 = var43;
                    var8 = 0;
                    L3: while (true) {
                      if (var6 <= var8) {
                        var6++;
                        var38.field_m = var38.field_m + 1;
                        var8 = var38.field_m;
                        var38.field_m = var38.field_m + var6;
                        var9 = 0;
                        L4: while (true) {
                          if (var38.field_l[var9 + var38.field_m] == 0) {
                            var69 = new byte[var9];
                            var63 = var69;
                            var57 = var63;
                            var44 = var57;
                            var10 = var44;
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var9++;
                                  var38.field_m = var38.field_m + 1;
                                  var65 = new byte[var9];
                                  var59 = var65;
                                  var53 = var59;
                                  var39 = var53;
                                  var11 = var39;
                                  if ((var9 ^ -1) < -2) {
                                    var65[1] = (byte) 1;
                                    var13_int = 1;
                                    var12 = 2;
                                    var14 = 2;
                                    L7: while (true) {
                                      if (var9 <= var14) {
                                        break L6;
                                      } else {
                                        L8: {
                                          var15_int = var38.j(255);
                                          if (var15_int != 0) {
                                            L9: {
                                              if (var13_int < var15_int) {
                                                break L9;
                                              } else {
                                                var15_int--;
                                                break L9;
                                              }
                                            }
                                            var13_int = var15_int;
                                            break L8;
                                          } else {
                                            var12++;
                                            var13_int = var12;
                                            break L8;
                                          }
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    var12 = var9;
                                    break L6;
                                  }
                                }
                                var13 = new g[var12];
                                var14 = 0;
                                L10: while (true) {
                                  if (var14 >= var13.length) {
                                    L11: {
                                      var14 = var38.j(255);
                                      if (var14 > 0) {
                                        stackOut_37_0 = new byte[2 * var14];
                                        stackIn_38_0 = stackOut_37_0;
                                        break L11;
                                      } else {
                                        stackOut_36_0 = null;
                                        stackIn_38_0 = (byte[]) (Object) stackOut_36_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var70 = stackIn_38_0;
                                      var64 = var70;
                                      var58 = var64;
                                      var46 = var58;
                                      var15_array = var46;
                                      var14 = var38.j(255);
                                      if ((var14 ^ -1) >= -1) {
                                        stackOut_40_0 = null;
                                        stackIn_41_0 = (byte[]) (Object) stackOut_40_0;
                                        break L12;
                                      } else {
                                        stackOut_39_0 = new byte[var14 * 2];
                                        stackIn_41_0 = stackOut_39_0;
                                        break L12;
                                      }
                                    }
                                    var47 = stackIn_41_0;
                                    var16 = var47;
                                    var17 = 0;
                                    L13: while (true) {
                                      if (-1 == (var38.field_l[var38.field_m + var17] ^ -1)) {
                                        var66 = new byte[var17];
                                        var60 = var66;
                                        var54 = var60;
                                        var41 = var54;
                                        var18 = var41;
                                        var19 = 0;
                                        L14: while (true) {
                                          if (var17 <= var19) {
                                            var38.field_m = var38.field_m + 1;
                                            var17++;
                                            var19 = 0;
                                            var20 = 0;
                                            L15: while (true) {
                                              if (-129 >= (var20 ^ -1)) {
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                    var22 = 0;
                                                    var23 = 0;
                                                    L17: while (true) {
                                                      if (128 <= var23) {
                                                        var21 = 0;
                                                        var20 = 0;
                                                        var23 = 0;
                                                        var24 = 0;
                                                        L18: while (true) {
                                                          if (-129 >= var24) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var24 = 0;
                                                            var25_int = 0;
                                                            L19: while (true) {
                                                              if (var25_int <= -129) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var25 = null;
                                                                var26 = 0;
                                                                L20: while (true) {
                                                                  if (var26 >= 128) {
                                                                    var20 = 0;
                                                                    var21 = 0;
                                                                    var26 = 0;
                                                                    var27 = 0;
                                                                    L21: while (true) {
                                                                      if (128 <= var27) {
                                                                        ((fc) this).field_j = var38.j(255) - -1;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (var27 >= var12) {
                                                                            L23: {
                                                                              if (var15_array == null) {
                                                                                break L23;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L24: while (true) {
                                                                                  if (var70.length <= var27) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    var15_array[var27] = var38.a((byte) -14);
                                                                                    var27 += 2;
                                                                                    continue L24;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L25: {
                                                                              if (var16 == null) {
                                                                                break L25;
                                                                              } else {
                                                                                var27 = 1;
                                                                                L26: while (true) {
                                                                                  if (var27 >= var47.length) {
                                                                                    break L25;
                                                                                  } else {
                                                                                    var16[var27] = var38.a((byte) -14);
                                                                                    var27 += 2;
                                                                                    continue L26;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            var27 = 0;
                                                                            L27: while (true) {
                                                                              if (var12 <= var27) {
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    L29: {
                                                                                      if (var15_array == null) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        var19 = var38.j(255);
                                                                                        var15_array[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L30: while (true) {
                                                                                          if (var27 >= var70.length) {
                                                                                            var27 = var70[0];
                                                                                            var28 = var70[1];
                                                                                            var29 = 0;
                                                                                            L31: while (true) {
                                                                                              if (var29 >= var27) {
                                                                                                var29 = 2;
                                                                                                L32: while (true) {
                                                                                                  if (var70.length <= var29) {
                                                                                                    var30 = var27;
                                                                                                    L33: while (true) {
                                                                                                      if (-129 >= (var30 ^ -1)) {
                                                                                                        var15_array = null;
                                                                                                        break L29;
                                                                                                      } else {
                                                                                                        ((fc) this).field_p[var30] = (byte)(32 + ((fc) this).field_p[var30] * var28 >> -409955258);
                                                                                                        var30++;
                                                                                                        continue L33;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var70[var29];
                                                                                                    var31 = var15_array[1 + var29];
                                                                                                    var32 = (var30 + -var27) * var28 - -((-var27 + var30) / 2);
                                                                                                    var33 = var27;
                                                                                                    L34: while (true) {
                                                                                                      if (var33 >= var30) {
                                                                                                        var28 = var31;
                                                                                                        var29 += 2;
                                                                                                        var27 = var30;
                                                                                                        continue L32;
                                                                                                      } else {
                                                                                                        var34 = ke.b(var32, -1697860097, var30 + -var27);
                                                                                                        var32 = var32 + (var31 - var28);
                                                                                                        ((fc) this).field_p[var33] = (byte)(32 + var34 * ((fc) this).field_p[var33] >> -1502842426);
                                                                                                        var33++;
                                                                                                        continue L34;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                ((fc) this).field_p[var29] = (byte)(((fc) this).field_p[var29] * var28 + 32 >> 1602553798);
                                                                                                var29++;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = 1 + (var19 + var38.j(255));
                                                                                            var15_array[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L30;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      if (var16 == null) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        var19 = var38.j(255);
                                                                                        var16[0] = (byte)var19;
                                                                                        var27 = 2;
                                                                                        L36: while (true) {
                                                                                          if (var47.length <= var27) {
                                                                                            var27 = var47[0];
                                                                                            var28 = var47[1] << -1053044159;
                                                                                            var29 = 0;
                                                                                            L37: while (true) {
                                                                                              if (var27 <= var29) {
                                                                                                var29 = 2;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var47.length) {
                                                                                                    var30 = var27;
                                                                                                    L39: while (true) {
                                                                                                      if ((var30 ^ -1) <= -129) {
                                                                                                        var16 = null;
                                                                                                        break L35;
                                                                                                      } else {
                                                                                                        L40: {
                                                                                                          var31 = (255 & ((fc) this).field_r[var30]) - -var28;
                                                                                                          if (var31 >= 0) {
                                                                                                            break L40;
                                                                                                          } else {
                                                                                                            var31 = 0;
                                                                                                            break L40;
                                                                                                          }
                                                                                                        }
                                                                                                        L41: {
                                                                                                          if ((var31 ^ -1) >= -129) {
                                                                                                            break L41;
                                                                                                          } else {
                                                                                                            var31 = 128;
                                                                                                            break L41;
                                                                                                          }
                                                                                                        }
                                                                                                        ((fc) this).field_r[var30] = (byte)var31;
                                                                                                        var30++;
                                                                                                        continue L39;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var30 = var47[var29];
                                                                                                    var31 = var16[var29 - -1] << -1223639519;
                                                                                                    var32 = (var30 + -var27) * var28 + (var30 - var27) / 2;
                                                                                                    var37 = var27;
                                                                                                    var33 = var37;
                                                                                                    L42: while (true) {
                                                                                                      if (var30 <= var37) {
                                                                                                        var29 += 2;
                                                                                                        var28 = var31;
                                                                                                        var27 = var30;
                                                                                                        continue L38;
                                                                                                      } else {
                                                                                                        L43: {
                                                                                                          var34 = ke.b(var32, -1697860097, -var27 + var30);
                                                                                                          var35 = var34 + (255 & ((fc) this).field_r[var37]);
                                                                                                          if (var35 >= 0) {
                                                                                                            break L43;
                                                                                                          } else {
                                                                                                            var35 = 0;
                                                                                                            break L43;
                                                                                                          }
                                                                                                        }
                                                                                                        L44: {
                                                                                                          if (-129 <= (var35 ^ -1)) {
                                                                                                            break L44;
                                                                                                          } else {
                                                                                                            var35 = 128;
                                                                                                            break L44;
                                                                                                          }
                                                                                                        }
                                                                                                        var32 = var32 + (-var28 + var31);
                                                                                                        ((fc) this).field_r[var37] = (byte)var35;
                                                                                                        var37++;
                                                                                                        continue L42;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L45: {
                                                                                                  var30 = var28 + (((fc) this).field_r[var29] & 255);
                                                                                                  if (0 <= var30) {
                                                                                                    break L45;
                                                                                                  } else {
                                                                                                    var30 = 0;
                                                                                                    break L45;
                                                                                                  }
                                                                                                }
                                                                                                L46: {
                                                                                                  if (-129 <= (var30 ^ -1)) {
                                                                                                    break L46;
                                                                                                  } else {
                                                                                                    var30 = 128;
                                                                                                    break L46;
                                                                                                  }
                                                                                                }
                                                                                                ((fc) this).field_r[var29] = (byte)var30;
                                                                                                var29++;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var19 = var19 + (1 - -var38.j(255));
                                                                                            var16[var27] = (byte)var19;
                                                                                            var27 += 2;
                                                                                            continue L36;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27 = 0;
                                                                                    L47: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                      } else {
                                                                                                        var52 = var13[var27];
                                                                                                        if ((var52.field_d ^ -1) < -1) {
                                                                                                          var52.field_f = var38.j(255);
                                                                                                          var27++;
                                                                                                          continue L51;
                                                                                                        } else {
                                                                                                          var27++;
                                                                                                          continue L51;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var51 = var13[var27];
                                                                                                    if (var51.field_m > 0) {
                                                                                                      var51.field_d = var38.j(255);
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    } else {
                                                                                                      var27++;
                                                                                                      continue L50;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_m = var38.j(255);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L52: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_j) {
                                                                                                break L52;
                                                                                              } else {
                                                                                                var50.field_b = var38.j(255);
                                                                                                break L52;
                                                                                              }
                                                                                            }
                                                                                            L53: {
                                                                                              if (var50.field_i == null) {
                                                                                                break L53;
                                                                                              } else {
                                                                                                var50.field_h = var38.j(255);
                                                                                                break L53;
                                                                                              }
                                                                                            }
                                                                                            if (var50.field_c > 0) {
                                                                                              var50.field_g = var38.j(255);
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            } else {
                                                                                              var27++;
                                                                                              continue L48;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        var13[var27].field_c = var38.j(255);
                                                                                        var27++;
                                                                                        continue L47;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    var49 = var13[var27];
                                                                                    if (var49.field_j != null) {
                                                                                      var19 = 0;
                                                                                      var29 = 2;
                                                                                      L54: while (true) {
                                                                                        if (var29 < var49.field_j.length) {
                                                                                          var19 = var38.j(255) + var19 - -1;
                                                                                          var49.field_j[var29] = (byte)var19;
                                                                                          var29 += 2;
                                                                                          continue L54;
                                                                                        } else {
                                                                                          var27++;
                                                                                          continue L28;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      var27++;
                                                                                      continue L28;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var48 = var13[var27];
                                                                                if (null != var48.field_i) {
                                                                                  var19 = 0;
                                                                                  var29 = 2;
                                                                                  L55: while (true) {
                                                                                    if (var48.field_i.length > var29) {
                                                                                      var19 = 1 + (var19 - -var38.j(255));
                                                                                      var48.field_i[var29] = (byte)var19;
                                                                                      var29 += 2;
                                                                                      continue L55;
                                                                                    } else {
                                                                                      var27++;
                                                                                      continue L27;
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  var27++;
                                                                                  continue L27;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L56: {
                                                                              var45 = var13[var27];
                                                                              if (null == var45.field_j) {
                                                                                break L56;
                                                                              } else {
                                                                                var29 = 1;
                                                                                L57: while (true) {
                                                                                  if (var29 >= var45.field_j.length) {
                                                                                    break L56;
                                                                                  } else {
                                                                                    var45.field_j[var29] = var38.a((byte) -14);
                                                                                    var29 += 2;
                                                                                    continue L57;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            if (null != var45.field_i) {
                                                                              var29 = 3;
                                                                              L58: while (true) {
                                                                                if (-2 + var45.field_i.length > var29) {
                                                                                  var45.field_i[var29] = var38.a((byte) -14);
                                                                                  var29 += 2;
                                                                                  continue L58;
                                                                                } else {
                                                                                  var27++;
                                                                                  continue L22;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              var27++;
                                                                              continue L22;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L59: {
                                                                          if (var20 != 0) {
                                                                            break L59;
                                                                          } else {
                                                                            L60: {
                                                                              if (var66.length > var21) {
                                                                                var21++;
                                                                                var20 = var18[var21];
                                                                                break L60;
                                                                              } else {
                                                                                var20 = -1;
                                                                                break L60;
                                                                              }
                                                                            }
                                                                            if (0 >= ((fc) this).field_k[var27]) {
                                                                              break L59;
                                                                            } else {
                                                                              var26 = 1 + var38.j(255);
                                                                              break L59;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        ((fc) this).field_p[var27] = (byte)var26;
                                                                        var27++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((fc) this).field_k[var26] != 0) {
                                                                      L61: {
                                                                        if (var20 != 0) {
                                                                          break L61;
                                                                        } else {
                                                                          var25_ref = var13[var65[var21]];
                                                                          if (var21 < var69.length) {
                                                                            var21++;
                                                                            var20 = var10[var21];
                                                                            break L61;
                                                                          } else {
                                                                            var20 = -1;
                                                                            break L61;
                                                                          }
                                                                        }
                                                                      }
                                                                      var20--;
                                                                      ((fc) this).field_i[var26] = var25_ref;
                                                                      var26++;
                                                                      continue L20;
                                                                    } else {
                                                                      var26++;
                                                                      continue L20;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (-1 != ((fc) this).field_k[var25_int]) {
                                                                  L62: {
                                                                    if (-1 != (var20 ^ -1)) {
                                                                      break L62;
                                                                    } else {
                                                                      var8++;
                                                                      var24 = 16 + var38.field_l[var8] << -2100200158;
                                                                      if (var68.length <= var21) {
                                                                        var20 = -1;
                                                                        break L62;
                                                                      } else {
                                                                        var21++;
                                                                        var20 = var7[var21];
                                                                        break L62;
                                                                      }
                                                                    }
                                                                  }
                                                                  ((fc) this).field_r[var25_int] = (byte)var24;
                                                                  var20--;
                                                                  var25_int++;
                                                                  continue L19;
                                                                } else {
                                                                  var25_int++;
                                                                  continue L19;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (-1 != ((fc) this).field_k[var24]) {
                                                              L63: {
                                                                if (0 != var20) {
                                                                  break L63;
                                                                } else {
                                                                  L64: {
                                                                    if (var21 >= var67.length) {
                                                                      var20 = -1;
                                                                      break L64;
                                                                    } else {
                                                                      var21++;
                                                                      var20 = var4[var21];
                                                                      break L64;
                                                                    }
                                                                  }
                                                                  var5++;
                                                                  var23 = -1 + var38.field_l[var5];
                                                                  break L63;
                                                                }
                                                              }
                                                              ((fc) this).field_h[var24] = (byte)var23;
                                                              var20--;
                                                              var24++;
                                                              continue L18;
                                                            } else {
                                                              var24++;
                                                              continue L18;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L65: {
                                                          if (var20 != 0) {
                                                            break L65;
                                                          } else {
                                                            L66: {
                                                              if (var21 < var66.length) {
                                                                var21++;
                                                                var20 = var18[var21];
                                                                break L66;
                                                              } else {
                                                                var20 = -1;
                                                                break L66;
                                                              }
                                                            }
                                                            var22 = var38.c((byte) 120);
                                                            break L65;
                                                          }
                                                        }
                                                        ((fc) this).field_s[var23] = (short)(((fc) this).field_s[var23] + (fi.a(-1 + var22, 2) << 741160046));
                                                        var20--;
                                                        ((fc) this).field_k[var23] = var22;
                                                        var23++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.j(255);
                                                    ((fc) this).field_s[var20] = (short)(((fc) this).field_s[var20] + (var19 << -2128998808));
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var19 = var19 + var38.j(255);
                                                ((fc) this).field_s[var20] = (short)var19;
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var18[var19] = var38.a((byte) -14);
                                            var19++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        var17++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    L67: {
                                      var13[var14] = new g();
                                      var40 = new g();
                                      var15 = var40;
                                      var16_int = var38.j(255);
                                      if (-1 <= var16_int) {
                                        break L67;
                                      } else {
                                        var15.field_j = new byte[2 * var16_int];
                                        break L67;
                                      }
                                    }
                                    var16_int = var38.j(255);
                                    if (-1 < var16_int) {
                                      var15.field_i = new byte[2 + 2 * var16_int];
                                      var40.field_i[1] = (byte)64;
                                      var14++;
                                      continue L10;
                                    } else {
                                      var14++;
                                      continue L10;
                                    }
                                  }
                                }
                              } else {
                                var10[var11_int] = var38.a((byte) -14);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        var7[var8] = var38.a((byte) -14);
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var4[var5] = var38.a((byte) -14);
                var5++;
                continue L1;
              }
            }
          } else {
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_n = new int[]{1, 1, 2, 3, 5, 1, 2, 3, 5, 1, 2, 5, 2, 3, 10, 2};
        field_m = false;
        field_l = null;
    }
}
