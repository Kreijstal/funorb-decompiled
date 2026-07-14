/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends iv {
    static wk[] field_B;
    static String field_u;
    static int[] field_y;
    static String field_A;
    static String field_s;
    private boolean field_r;
    private int field_C;
    private boolean field_o;
    static String[] field_F;
    private long field_x;
    String field_p;
    private boolean field_w;
    static int field_D;
    private int field_G;
    private int field_n;
    private int field_t;
    private int field_z;
    static int field_v;
    private int field_E;
    static String[] field_q;

    private final void a(int param0, int param1, boolean param2, byte param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((wf) this).setBackground(java.awt.Color.black);
        if (param3 <= 73) {
            field_v = 91;
        }
        og.field_m = ((wf) this).field_z;
        qa.b(og.field_m, 1);
        hq.a(param6, 5000, ((wf) this).field_E, 5000, param2, og.field_m, ((wf) this).field_C, 0, ((wf) this).field_t, ((wf) this).field_o, ((wf) this).field_p, ft.field_m, ((wf) this).field_x, ((wf) this).field_G);
        qf.a(og.field_m, ((wf) this).field_p, ((wf) this).field_G, (byte) 103, ((wf) this).field_C, param6, ((wf) this).field_E, ((wf) this).field_t, ft.field_m);
        rf.b((byte) 112);
        om.field_I = jk.b(68);
        lk.a(101, si.field_b);
        mo.field_c = param7;
        on.field_n = param5;
        lk.field_p = param0;
        wl.field_E = param1;
        ms.field_t = param4;
        this.f((byte) -51);
        df.l(0);
    }

    final static void g(int param0) {
        dp.field_Lb = vi.b(-83);
        mu.field_d = 0;
        if (param0 != -20873) {
            wf.h(-23);
        }
    }

    private final void k(int param0) {
        tk.field_f[12] = true;
        tk.field_f[13] = true;
        tk.field_f[11] = true;
        if (param0 != -13) {
            this.b(true);
        }
    }

    public static void h(int param0) {
        field_u = null;
        field_s = null;
        field_A = null;
        int var1 = -43 / ((-1 - param0) / 41);
        field_q = null;
        field_F = null;
        field_y = null;
        field_B = null;
    }

    private final void a(boolean param0, boolean param1) {
        tk.field_f[8] = param1;
        tk.field_f[7] = param0;
        tk.field_f[0] = true;
        tk.field_f[18] = true;
        tk.field_f[16] = true;
        tk.field_f[3] = true;
        tk.field_f[17] = true;
    }

    final int h(byte param0) {
        int var2 = 0;
        if (((wf) this).field_i) {
          return -1;
        } else {
          if (!qv.j(-11)) {
            return -1;
          } else {
            if (!ol.field_C) {
              L0: {
                if (param0 < -15) {
                  break L0;
                } else {
                  ((wf) this).field_o = true;
                  break L0;
                }
              }
              var2 = rk.a((byte) -53, ((wf) this).field_n, ((wf) this).field_w, jr.a(-1), sk.i(-4938), true);
              if (0 != var2) {
                L1: {
                  if (var2 == 0) {
                    if (p.field_b == 11) {
                      if (-1 == gk.field_K) {
                        ms.e(116);
                        break L1;
                      } else {
                        return var2;
                      }
                    } else {
                      if (p.field_b == 11) {
                        if (-1 == gk.field_K) {
                          ms.e(116);
                          break L1;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    }
                  } else {
                    if (p.field_b == 11) {
                      if (-1 == gk.field_K) {
                        ms.e(116);
                        break L1;
                      } else {
                        return var2;
                      }
                    } else {
                      return var2;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    private final void l(int param0) {
        tk.field_f[param0] = true;
    }

    private final void e(byte param0) {
        if (param0 <= 119) {
            return;
        }
        String var2 = hr.b((byte) 61);
        dj.a(ag.d((byte) 47), 0, var2);
    }

    private final void m(int param0) {
        if (param0 != -7532) {
            field_u = null;
        }
        tk.field_f[4] = true;
    }

    private final void i(int param0) {
        if (param0 <= 77) {
            field_s = null;
        }
        tk.field_f[5] = true;
    }

    private final void b(boolean param0) {
        if (param0) {
            return;
        }
        tk.field_f[2] = true;
    }

    private final void f(int param0) {
        tk.field_f[6] = true;
        if (param0 != 9) {
            ((wf) this).field_t = -103;
        }
    }

    final int a(byte param0, boolean param1) {
        int var3 = 14 % ((-26 - param0) / 53);
        return this.a(param1, true, (byte) -109);
    }

    final void a(byte param0, int param1, String param2) {
        this.a(param1, -26261, 480, 640, param2);
        int var4 = -77 % ((param0 - -5) / 34);
    }

    private final void n(int param0) {
        int var2 = mg.field_e.k(0);
        int var3 = -1 != (var2 & 1 ^ -1) ? 1 : 0;
        int var4 = fk.field_b - 1;
        byte[] var5 = new byte[var4];
        mg.field_e.a(var4, var5, false, 0);
        ua.a(ag.d((byte) -125), 87, uu.a(var5, (byte) 127), var3 != 0);
        if (param0 != 16433) {
            ((wf) this).j(-76);
        }
    }

    private final int a(boolean param0, boolean param1, byte param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            vh var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
                        if (param2 < -68) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ((wf) this).field_r = true;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var4 = tc.a(el.field_d, param0, true, og.field_m);
                        if (-1 != (var4 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        throw new IllegalStateException();
                    }
                    case 4: {
                        if (1 != var4) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var5_int = sa.a(false, om.c((byte) -27), fp.l(-117));
                        if (var5_int != -1) {
                            statePc = 7;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        sm.a(103, br.field_b, lk.field_r, var5_int);
                        lk.field_r = null;
                        br.field_b = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = r.l(-11506);
                        if (var11 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        dl.a((byte) 32, var11.booleanValue());
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (2 == var4) {
                            statePc = 12;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var5_int = vo.a((byte) -46, sk.i(-4938), cn.e(488997228), lb.b(0), ((wf) this).field_n, qp.e((byte) -127), jr.a(-1));
                        if (var5_int == -1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        cq.a(lk.field_r, -14, br.field_b, var5_int);
                        lk.field_r = null;
                        br.field_b = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (3 == var4) {
                            statePc = 16;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if ((gk.field_K ^ -1) == 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (gk.field_K == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        gk.field_K = -1;
                        lb.a((byte) -8);
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (param1) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var5_int = rk.a((byte) -53, ((wf) this).field_n, ((wf) this).field_w, jr.a(-1), sk.i(-4938), false);
                        if (var5_int != 0) {
                            statePc = 22;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (-1 != var5_int) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        ck.field_b = dc.field_o;
                        ms.e(112);
                        bl.field_b = false;
                        p.field_b = 10;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 24: {
                        wv.a(lk.field_r, 10, var5_int);
                        lk.field_r = null;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 25: {
                        ol.field_C = false;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        if (var4 == 4) {
                            statePc = 28;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (aw.field_l) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        bl.field_b = true;
                        p.field_b = 10;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 30: {
                        bl.a(ag.d((byte) -116), true);
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (5 != var4) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        ho.a(ag.d((byte) -115), (byte) -3);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (6 == var4) {
                            statePc = 35;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        if (!it.field_b) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        p.field_b = 10;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (var4 != 7) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        ws.a(ag.d((byte) 53), -126);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (-9 != (var4 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        bl.a(ag.d((byte) -120), true);
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (9 == var4) {
                            statePc = 43;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        ov.a(ag.d((byte) 48), 11982);
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (10 != var4) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        vl.field_n.h(32161, 17);
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (11 != var4) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        t.a((byte) -118, ag.d((byte) 7));
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (var4 == 12) {
                            statePc = 50;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        ra.a(ag.d((byte) -123), -69, ob.j(-129));
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (var4 == 13) {
                            statePc = 53;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        try {
                            if (fq.field_h == null) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            fq.field_h = new fa(ft.field_m, new java.net.URL(((wf) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (fq.field_h.b(0)) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var12 = fq.field_h.a(3);
                            if (var12 != null) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var9 = null;
                            df.a((String) null, -108);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var7 = co.a(0, var12.field_q, -127, var12.field_o);
                            df.a(var7, -73);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            fq.field_h = null;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        var5 = (Exception) (Object) caughtException;
                        af.a((Throwable) (Object) var5, -99, "S1");
                        var10 = null;
                        df.a((String) null, -119);
                        fq.field_h = null;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if (15 == var4) {
                            statePc = 66;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        p.field_b = 10;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (-17 != var4) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        return 1;
                    }
                    case 69: {
                        if (-18 != var4) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        return 2;
                    }
                    case 71: {
                        return 0;
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

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 >= -60) {
            ((wf) this).a(85, -61, 12, -69, -2, -25, 37);
        }
        this.a(param0, param3, false, (byte) 126, param2, param5, param1, param6);
    }

    private final void f(byte param0) {
        sh.field_a[9] = -1;
        sh.field_a[7] = -1;
        sh.field_a[1] = 16;
        sh.field_a[18] = 1;
        if (param0 != -51) {
          return;
        } else {
          sh.field_a[13] = -1;
          sh.field_a[4] = -1;
          sh.field_a[12] = -1;
          sh.field_a[6] = -2;
          sh.field_a[5] = -1;
          sh.field_a[3] = -1;
          sh.field_a[11] = -1;
          sh.field_a[16] = -1;
          sh.field_a[8] = -2;
          sh.field_a[17] = -1;
          sh.field_a[10] = -1;
          sh.field_a[2] = -2;
          return;
        }
    }

    final void g(byte param0) {
        int var3 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 4) {
            break L0;
          } else {
            int discarded$47 = ((wf) this).a((byte) 113, true);
            break L0;
          }
        }
        L1: {
          if (!wd.a((byte) 60)) {
            if (-11 < (f.field_E ^ -1)) {
              break L1;
            } else {
              if (!lk.b(true)) {
                qq.e((byte) -84);
                break L1;
              } else {
                if (p.field_b == 0) {
                  int discarded$48 = this.a(false, false, (byte) -92);
                  break L1;
                } else {
                  ii.a(el.field_d, (byte) -89);
                  break L1;
                }
              }
            }
          } else {
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (null == wq.field_a) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            int discarded$49 = this.a(stackIn_6_1 != 0, false, (byte) -97);
            break L1;
          }
        }
    }

    final void j(int param0) {
        int var2 = 0;
        mo var3 = null;
        int var4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = nm.field_o;
          if (var2 >= 64) {
            break L0;
          } else {
            if (tk.field_f[var2]) {
              if (0 == var2) {
                return;
              } else {
                L1: {
                  if (1 != var2) {
                    if (2 == var2) {
                      gm.d(9);
                      break L1;
                    } else {
                      if ((var2 ^ -1) != -4) {
                        if (var2 == 4) {
                          da.a((byte) -101);
                          break L1;
                        } else {
                          if (5 != var2) {
                            if (var2 == -7) {
                              ir.a(true);
                              break L1;
                            } else {
                              if (-8 != var2) {
                                if (8 != var2) {
                                  if (16 == var2) {
                                    da.a(67);
                                    break L1;
                                  } else {
                                    L2: {
                                      if ((var2 ^ -1) == -12) {
                                        break L2;
                                      } else {
                                        if (var2 == 12) {
                                          break L2;
                                        } else {
                                          if (var2 != -14) {
                                            if (-18 == var2) {
                                              this.n(16433);
                                              break L1;
                                            } else {
                                              if (18 != var2) {
                                                af.a((Throwable) null, param0 ^ -100, "MGS1: " + cm.b(false));
                                                dj.a((byte) -124);
                                                break L1;
                                              } else {
                                                fq.b((byte) 119);
                                                break L1;
                                              }
                                            }
                                          } else {
                                            u.a(param0 + -11);
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_28_0 = -34;
                                      stackIn_30_0 = stackOut_28_0;
                                      stackIn_29_0 = stackOut_28_0;
                                      if (-13 != (var2 ^ -1)) {
                                        stackOut_30_0 = stackIn_30_0;
                                        stackOut_30_1 = 0;
                                        stackIn_31_0 = stackOut_30_0;
                                        stackIn_31_1 = stackOut_30_1;
                                        break L3;
                                      } else {
                                        stackOut_29_0 = stackIn_29_0;
                                        stackOut_29_1 = 1;
                                        stackIn_31_0 = stackOut_29_0;
                                        stackIn_31_1 = stackOut_29_1;
                                        break L3;
                                      }
                                    }
                                    var3 = ea.a((byte) stackIn_31_0, stackIn_31_1 != 0);
                                    lo.a(var3, -1);
                                    break L1;
                                  }
                                } else {
                                  jh.a((vh) (Object) mg.field_e, ft.field_m, fk.field_b, param0 + -13);
                                  break L1;
                                }
                              } else {
                                this.e((byte) 127);
                                break L1;
                              }
                            }
                          } else {
                            cd.b(param0 + -48);
                            break L1;
                          }
                        }
                      } else {
                        jg.e(0);
                        break L1;
                      }
                    }
                  } else {
                    rk.e(param0 + -135);
                    break L1;
                  }
                }
                L4: {
                  if (param0 == 12) {
                    break L4;
                  } else {
                    field_B = null;
                    break L4;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        af.a((Throwable) null, -115, "MGS2: " + cm.b(false));
        dj.a((byte) -126);
    }

    protected wf() {
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6) {
        this.a(true, true);
        if (param5) {
            this.l(1);
        }
        if (!(!param6)) {
            this.b(false);
        }
        if (param1) {
            this.m(-7532);
        }
        if (param2) {
            this.i(125);
        }
        if (param0) {
            this.f(9);
        }
        if (!(!param3)) {
            this.k(-13);
        }
        if (param4 <= 6) {
            field_B = null;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_25_0 = 0;
        int stackIn_106_0 = 0;
        String stackIn_106_1 = null;
        int stackIn_107_0 = 0;
        String stackIn_107_1 = null;
        int stackIn_108_0 = 0;
        String stackIn_108_1 = null;
        int stackIn_108_2 = 0;
        int stackIn_109_0 = 0;
        String stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        int stackIn_110_0 = 0;
        String stackIn_110_1 = null;
        int stackIn_110_2 = 0;
        int stackIn_111_0 = 0;
        String stackIn_111_1 = null;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        int stackIn_138_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_105_0 = 0;
        String stackOut_105_1 = null;
        int stackOut_107_0 = 0;
        String stackOut_107_1 = null;
        int stackOut_107_2 = 0;
        int stackOut_106_0 = 0;
        String stackOut_106_1 = null;
        int stackOut_106_2 = 0;
        int stackOut_108_0 = 0;
        String stackOut_108_1 = null;
        int stackOut_108_2 = 0;
        int stackOut_110_0 = 0;
        String stackOut_110_1 = null;
        int stackOut_110_2 = 0;
        int stackOut_110_3 = 0;
        int stackOut_109_0 = 0;
        String stackOut_109_1 = null;
        int stackOut_109_2 = 0;
        int stackOut_109_3 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (null == ra.field_e) {
            break L0;
          } else {
            L1: {
              if (null == wq.field_a) {
                var6 = sp.a(0);
                var4 = var6.getSize();
                ra.field_e.b(var4.height, var4.width, -30514);
                break L1;
              } else {
                break L1;
              }
            }
            ra.field_e.a(0);
            break L0;
          }
        }
        r.c(true);
        ds.a((byte) 118);
        if (param0 > 124) {
          L2: {
            if (ql.h(31337)) {
              break L2;
            } else {
              if ((p.field_b ^ -1) == -12) {
                break L2;
              } else {
                pf.a((byte) 73);
                break L2;
              }
            }
          }
          L3: {
            if (om.field_I != null) {
              el.field_d = om.field_I.a(9);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (!go.a(99)) {
              break L4;
            } else {
              L5: {
                var3 = tp.b(-113) * 1200;
                if (((wf) this).field_r) {
                  break L5;
                } else {
                  if (var3 >= bs.a((byte) 99)) {
                    break L4;
                  } else {
                    if (os.g(4) <= var3) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              ((wf) this).field_r = false;
              dj.a((byte) -126);
              er.b(-11);
              wv.a(of.field_bc, 10, 2);
              qf.b(56);
              ol.field_C = true;
              jl.field_a = 15000L + vi.b(-49);
              break L4;
            }
          }
          L6: {
            L7: {
              if (0 == gk.field_K) {
                break L7;
              } else {
                if (0 == gk.field_K) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (0 != gk.field_K) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L8;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L8;
              }
            }
            var3 = stackIn_25_0;
            gk.field_K = tc.b(86);
            if (var3 != 0) {
              if (0 != gk.field_K) {
                if (-1 == gk.field_K) {
                  break L6;
                } else {
                  jl.field_a = vi.b(98) + 15000L;
                  break L6;
                }
              } else {
                if (0 == gk.field_K) {
                  break L6;
                } else {
                  if (-1 == gk.field_K) {
                    break L6;
                  } else {
                    jl.field_a = vi.b(98) + 15000L;
                    break L6;
                  }
                }
              }
            } else {
              if (0 == gk.field_K) {
                break L6;
              } else {
                if (-1 == gk.field_K) {
                  break L6;
                } else {
                  jl.field_a = vi.b(98) + 15000L;
                  break L6;
                }
              }
            }
          }
          L9: {
            if (gk.field_K == -1) {
              break L9;
            } else {
              if (gk.field_K == -1) {
                break L9;
              } else {
                if (-11 > f.field_E) {
                  if (3 == gk.field_K) {
                    ((wf) this).a("js5crc", (byte) -107);
                    break L9;
                  } else {
                    if (gk.field_K != -5) {
                      if (gk.field_K == 2) {
                        ((wf) this).a("js5connect_full", (byte) -37);
                        break L9;
                      } else {
                        if (-6 == gk.field_K) {
                          ((wf) this).a("outofdate", (byte) -67);
                          break L9;
                        } else {
                          ((wf) this).a("js5connect", (byte) -41);
                          break L9;
                        }
                      }
                    } else {
                      ((wf) this).a("js5io", (byte) -113);
                      break L9;
                    }
                  }
                } else {
                  if (p.field_b > -11) {
                    break L9;
                  } else {
                    L10: {
                      er.b(-11);
                      if (3 != gk.field_K) {
                        if (-5 != gk.field_K) {
                          if (gk.field_K != 2) {
                            if (-6 == (gk.field_K ^ -1)) {
                              wv.a(fk.field_f, 10, 5);
                              break L10;
                            } else {
                              wv.a(wm.field_a, 10, 256);
                              break L10;
                            }
                          } else {
                            wv.a(kl.field_d, 10, 256);
                            break L10;
                          }
                        } else {
                          wv.a(cv.field_k, 10, 256);
                          break L10;
                        }
                      } else {
                        wv.a(oq.field_k, 10, 256);
                        break L10;
                      }
                    }
                    ol.field_C = true;
                    break L9;
                  }
                }
              }
            }
          }
          L11: {
            if (gk.field_K != -1) {
              if (gk.field_K != 0) {
                if (jl.field_a > vi.b(74)) {
                  break L11;
                } else {
                  ol.field_C = false;
                  if (0 == (gk.field_K ^ -1)) {
                    break L11;
                  } else {
                    if (gk.field_K == -1) {
                      break L11;
                    } else {
                      gk.field_K = -1;
                      lb.a((byte) -8);
                      break L11;
                    }
                  }
                }
              } else {
                if (!qv.j(-11)) {
                  break L11;
                } else {
                  if (jl.field_a > vi.b(74)) {
                    break L11;
                  } else {
                    ol.field_C = false;
                    if (0 == (gk.field_K ^ -1)) {
                      break L11;
                    } else {
                      if (gk.field_K == -1) {
                        break L11;
                      } else {
                        gk.field_K = -1;
                        lb.a((byte) -8);
                        break L11;
                      }
                    }
                  }
                }
              }
            } else {
              if (!qv.j(-11)) {
                break L11;
              } else {
                if (jl.field_a > vi.b(74)) {
                  break L11;
                } else {
                  ol.field_C = false;
                  if (0 == (gk.field_K ^ -1)) {
                    break L11;
                  } else {
                    if (gk.field_K == -1) {
                      break L11;
                    } else {
                      gk.field_K = -1;
                      lb.a((byte) -8);
                      break L11;
                    }
                  }
                }
              }
            }
          }
          L12: {
            if (-1 != gk.field_K) {
              break L12;
            } else {
              if (!qv.j(-11)) {
                dd.field_a = false;
                break L12;
              } else {
                break L12;
              }
            }
          }
          L13: {
            if (-1 != (f.field_E ^ -1)) {
              break L13;
            } else {
              if (!us.b(94)) {
                break L13;
              } else {
                f.field_E = 1;
                break L13;
              }
            }
          }
          L14: {
            if ((f.field_E ^ -1) != -2) {
              break L14;
            } else {
              L15: {
                if (og.field_m == 0) {
                  break L15;
                } else {
                  nf.field_Nb = nu.a(on.field_n, true);
                  break L15;
                }
              }
              ps.field_u = nw.a(1, mo.field_c, (byte) 119, false, true);
              sk.field_M = nw.a(1, wl.field_E, (byte) 122, false, true);
              h.field_g = nw.a(1, ms.field_t, (byte) 127, false, true);
              gg.field_K = ps.field_u;
              f.field_E = 2;
              ks.field_A = sk.field_M;
              break L14;
            }
          }
          L16: {
            if (f.field_E == 2) {
              L17: {
                if (null != nf.field_Nb) {
                  if (nf.field_Nb.a((byte) 82)) {
                    if (!nf.field_Nb.a((byte) -128, "")) {
                      nf.field_Nb = null;
                      break L17;
                    } else {
                      if (!nf.field_Nb.a(28979, "")) {
                        break L17;
                      } else {
                        id.a((byte) -82, nf.field_Nb);
                        nf.field_Nb = null;
                        wl.a(0);
                        break L17;
                      }
                    }
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              if (nf.field_Nb != null) {
                break L16;
              } else {
                f.field_E = 3;
                break L16;
              }
            } else {
              break L16;
            }
          }
          L18: {
            if (-4 != (f.field_E ^ -1)) {
              break L18;
            } else {
              if (!wh.a(ps.field_u, (byte) 127, h.field_g, sk.field_M)) {
                break L18;
              } else {
                if (!wh.a(h.field_g, -27701)) {
                  break L18;
                } else {
                  L19: {
                    L20: {
                      cd.a(12);
                      vl.c((byte) 91);
                      it.field_b = false;
                      wa.field_e = ef.field_a;
                      qq.a(sk.field_M, ps.field_u, h.field_g, 0, aw.field_l);
                      if (mo.field_r) {
                        break L20;
                      } else {
                        if (pd.field_b == null) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      stackOut_105_0 = 3;
                      stackOut_105_1 = pd.field_b;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      stackIn_106_0 = stackOut_105_0;
                      stackIn_106_1 = stackOut_105_1;
                      if (mo.field_r) {
                        stackOut_107_0 = stackIn_107_0;
                        stackOut_107_1 = (String) (Object) stackIn_107_1;
                        stackOut_107_2 = 0;
                        stackIn_108_0 = stackOut_107_0;
                        stackIn_108_1 = stackOut_107_1;
                        stackIn_108_2 = stackOut_107_2;
                        break L21;
                      } else {
                        stackOut_106_0 = stackIn_106_0;
                        stackOut_106_1 = (String) (Object) stackIn_106_1;
                        stackOut_106_2 = 1;
                        stackIn_108_0 = stackOut_106_0;
                        stackIn_108_1 = stackOut_106_1;
                        stackIn_108_2 = stackOut_106_2;
                        break L21;
                      }
                    }
                    L22: {
                      stackOut_108_0 = stackIn_108_0;
                      stackOut_108_1 = (String) (Object) stackIn_108_1;
                      stackOut_108_2 = stackIn_108_2;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_110_1 = stackOut_108_1;
                      stackIn_110_2 = stackOut_108_2;
                      stackIn_109_0 = stackOut_108_0;
                      stackIn_109_1 = stackOut_108_1;
                      stackIn_109_2 = stackOut_108_2;
                      if (mo.field_r) {
                        stackOut_110_0 = stackIn_110_0;
                        stackOut_110_1 = (String) (Object) stackIn_110_1;
                        stackOut_110_2 = stackIn_110_2;
                        stackOut_110_3 = 0;
                        stackIn_111_0 = stackOut_110_0;
                        stackIn_111_1 = stackOut_110_1;
                        stackIn_111_2 = stackOut_110_2;
                        stackIn_111_3 = stackOut_110_3;
                        break L22;
                      } else {
                        stackOut_109_0 = stackIn_109_0;
                        stackOut_109_1 = (String) (Object) stackIn_109_1;
                        stackOut_109_2 = stackIn_109_2;
                        stackOut_109_3 = 1;
                        stackIn_111_0 = stackOut_109_0;
                        stackIn_111_1 = stackOut_109_1;
                        stackIn_111_2 = stackOut_109_2;
                        stackIn_111_3 = stackOut_109_3;
                        break L22;
                      }
                    }
                    rn.a(stackIn_111_0, (String) (Object) stackIn_111_1, stackIn_111_2 != 0, stackIn_111_3 != 0);
                    break L19;
                  }
                  L23: {
                    if (!hc.field_i) {
                      break L23;
                    } else {
                      di.c((byte) -128);
                      break L23;
                    }
                  }
                  L24: {
                    if (null != pt.field_eb) {
                      break L24;
                    } else {
                      pt.field_eb = fq.a(18757);
                      ko.field_e = nb.c((byte) 111);
                      break L24;
                    }
                  }
                  qd.a(h.field_g, (byte) 76, pt.field_eb, ko.field_e);
                  ps.field_u = null;
                  sk.field_M = null;
                  h.field_g = null;
                  p.a(-24602, (java.applet.Applet) this);
                  wl.a(0);
                  f.field_E = 10;
                  break L18;
                }
              }
            }
          }
          L25: {
            if (f.field_E == 10) {
              L26: {
                if (0 == og.field_m) {
                  break L26;
                } else {
                  a.field_o = nu.a(lk.field_p, true);
                  break L26;
                }
              }
              f.field_E = 11;
              break L25;
            } else {
              break L25;
            }
          }
          L27: {
            if (-12 != (f.field_E ^ -1)) {
              break L27;
            } else {
              L28: {
                if (a.field_o == null) {
                  break L28;
                } else {
                  L29: {
                    if (!a.field_o.a((byte) 82)) {
                      break L29;
                    } else {
                      if (a.field_o.d(-27927)) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  bn.a((byte) -24, 0.0f, ao.a(db.field_b, true, of.field_Jb, a.field_o));
                  break L27;
                }
              }
              ts.field_l = true;
              f.field_E = 12;
              break L27;
            }
          }
          L30: {
            if (-13 != (f.field_E ^ -1)) {
              break L30;
            } else {
              if (!ts.field_l) {
                f.field_E = 13;
                break L30;
              } else {
                break L30;
              }
            }
          }
          L31: {
            if (13 != f.field_E) {
              break L31;
            } else {
              L32: {
                var3 = 1;
                if (null == sk.field_G) {
                  break L32;
                } else {
                  L33: {
                    if (!sk.field_G.a(2189)) {
                      stackOut_137_0 = 0;
                      stackIn_138_0 = stackOut_137_0;
                      break L33;
                    } else {
                      stackOut_136_0 = 1;
                      stackIn_138_0 = stackOut_136_0;
                      break L33;
                    }
                  }
                  var3 = stackIn_138_0;
                  bn.a((byte) -24, sk.field_G.field_d, sk.field_G.field_b);
                  break L32;
                }
              }
              if (var3 != 0) {
                f.field_E = 20;
                break L31;
              } else {
                break L31;
              }
            }
          }
          L34: {
            if (param1) {
              break L34;
            } else {
              if (tq.field_a) {
                dt.a(si.field_b, 23678);
                ((wf) this).c((byte) 87);
                lk.a(123, si.field_b);
                break L34;
              } else {
                break L34;
              }
            }
          }
          L35: {
            if (!tk.field_f[8]) {
              break L35;
            } else {
              pu.b(28704);
              break L35;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        try {
          if (((wf) this).e(param1 + 26203)) {
            L0: {
              L1: {
                ((wf) this).field_p = ((wf) this).getCodeBase().getHost();
                var6_ref = ((wf) this).field_p.toLowerCase();
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L0;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L0;
            }
            L2: {
              ((wf) this).field_w = stackIn_7_1 != 0;
              ((wf) this).field_t = Integer.parseInt(((wf) this).getParameter("gameport1"));
              ((wf) this).field_E = Integer.parseInt(((wf) this).getParameter("gameport2"));
              var7 = ((wf) this).getParameter("servernum");
              if (var7 == null) {
                break L2;
              } else {
                ((wf) this).field_C = Integer.parseInt(var7);
                break L2;
              }
            }
            L3: {
              ((wf) this).field_G = Integer.parseInt(((wf) this).getParameter("gamecrc"));
              if (param1 == -26261) {
                break L3;
              } else {
                int discarded$1 = this.a(true, true, (byte) -74);
                break L3;
              }
            }
            L4: {
              ((wf) this).field_x = Long.parseLong(((wf) this).getParameter("instanceid"));
              ((wf) this).field_o = ((wf) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((wf) this).getParameter("lang");
              if (var8 == null) {
                break L4;
              } else {
                ((wf) this).field_z = Integer.parseInt(var8);
                break L4;
              }
            }
            L5: {
              if (((wf) this).field_z >= 5) {
                ((wf) this).field_z = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var9 = ((wf) this).getParameter("affid");
              if (var9 == null) {
                break L6;
              } else {
                ((wf) this).field_n = Integer.parseInt(var9);
                break L6;
              }
            }
            hc.field_i = Boolean.valueOf(((wf) this).getParameter("simplemode")).booleanValue();
            ((wf) this).a(param3, 32, param4, 10, ((wf) this).field_G, param0, param2);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        af.a((Throwable) (Object) var6, 98, (String) null);
        ((wf) this).a("crash", (byte) -40);
    }

    final static String a(String param0, int param1) {
        og[] var2 = null;
        int var3 = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        og var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        og[] var11 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 107 % ((param1 - -11) / 61);
        var11 = vv.a(param0, 119);
        var2 = var11;
        var4 = new StringBuilder();
        var5 = 0;
        L0: while (true) {
          if (var11.length <= var5) {
            return var4.toString();
          } else {
            L1: {
              var6 = var11[var5];
              var7 = var6.field_s;
              if (var5 == -1 + var11.length) {
                stackOut_4_0 = param0.length();
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var2[1 + var5].field_s;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var8 = stackIn_5_0;
            var9 = param0.substring(var7, var8);
            if (var6.field_q == iu.field_x) {
              StringBuilder discarded$6 = var4.append("<col=66ffff>").append(var9).append("</col>");
              var5++;
              continue L0;
            } else {
              if (hf.field_h != var6.field_q) {
                if (var6.field_q != rn.field_c) {
                  if (var6.field_q != gg.field_G) {
                    if (var6.field_q != gb.field_z) {
                      StringBuilder discarded$7 = var4.append(var9);
                      var5++;
                      continue L0;
                    } else {
                      StringBuilder discarded$8 = var4.append("<col=33ffaa>").append(var9).append("</col>");
                      var5++;
                      continue L0;
                    }
                  } else {
                    StringBuilder discarded$9 = var4.append("<col=ffaaff>").append(var9).append("</col>");
                    var5++;
                    continue L0;
                  }
                } else {
                  StringBuilder discarded$10 = var4.append("<col=ffff99>").append(var9).append("</col>");
                  var5++;
                  continue L0;
                }
              } else {
                StringBuilder discarded$11 = var4.append("<col=33bbff>").append(var9).append("</col>");
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Players: ";
        field_A = "Attack";
        field_y = new int[]{14, 15, 8};
        field_F = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_v = 3000;
        field_D = 0;
        field_u = "Public";
        field_q = new String[]{"Neutral", "Saradomin", "Zamorak", "Guthix", "Seren", "Bandos", "Menaphite pantheon"};
    }
}
