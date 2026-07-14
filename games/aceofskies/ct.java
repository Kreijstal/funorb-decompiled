/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ct extends vb {
    private int field_F;
    static gu field_t;
    private int field_E;
    private int field_y;
    private int field_s;
    private boolean field_q;
    private boolean field_r;
    private int field_D;
    private int field_u;
    String field_w;
    private long field_z;
    static ej field_H;
    static String field_C;
    static int[] field_v;
    static float field_I;
    static int field_x;
    private boolean field_A;
    static int field_B;

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            rb var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = AceOfSkies.field_G ? 1 : 0;
                        var4 = b.a(nh.field_e, (byte) 72, param1, fb.field_e);
                        if (var4 != 0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        throw new IllegalStateException();
                    }
                    case 2: {
                        if ((var4 ^ -1) == -2) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5_int = bb.a(gt.a((byte) -46), (byte) 127, ju.e(123));
                        if (-1 != var5_int) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        gt.a(param0 + 115, rp.field_m, var5_int, sd.field_j);
                        rp.field_m = null;
                        sd.field_j = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = ct.h(122);
                        if (var11 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        qf.a((byte) 77, var11.booleanValue());
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if ((var4 ^ -1) != -3) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var5_int = mj.a(la.a(4), param0 ^ 11, ((ct) this).field_E, ve.a(true), ce.g(-3), sa.b(-25752), of.a(false));
                        if (-1 == var5_int) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        pp.a(sd.field_j, var5_int, rp.field_m, param0 + 26318);
                        sd.field_j = null;
                        rp.field_m = null;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (-4 == (var4 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (-1 == sk.field_a) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (0 == sk.field_a) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        sk.field_a = -1;
                        wj.e(104);
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (param2) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var5_int = pi.a(((ct) this).field_E, la.a(4), 0, ((ct) this).field_r, sa.b(-25752), false);
                        if (var5_int == -1) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (0 != var5_int) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        dl.field_o = as.field_b;
                        um.d(param0 ^ 9);
                        ob.field_d = 10;
                        ks.field_b = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 22: {
                        li.a(param0 ^ 118, var5_int, rp.field_m);
                        rp.field_m = null;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        vs.field_f = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (4 == var4) {
                            statePc = 26;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (!te.field_h) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        la.a(true, bm.m(117));
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        ob.field_d = 10;
                        ks.field_b = true;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if ((var4 ^ -1) == -6) {
                            statePc = 31;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        rr.a((byte) -96, bm.m(119));
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (6 == var4) {
                            statePc = 34;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (!nq.field_a) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        ob.field_d = 10;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (var4 == 7) {
                            statePc = 38;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        po.a(bm.m(param0 + 117), (byte) -104);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (var4 == param0) {
                            statePc = 41;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        la.a(true, bm.m(param0 ^ 114));
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if ((var4 ^ -1) == -10) {
                            statePc = 44;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        lb.a(61, bm.m(param0 + 119));
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (var4 != 10) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        q.field_p.g(100, 17);
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (var4 == -12) {
                            statePc = 49;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        jn.a((byte) 124, bm.m(107));
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if (-13 == var4) {
                            statePc = 52;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        vi.a((byte) 103, kb.a(-1903710079), bm.m(107));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (-14 != (var4 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        try {
                            if (null == hb.field_a) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            hb.field_a = new cc(pt.field_b, new java.net.URL(((ct) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (!hb.field_a.a((byte) 118)) {
                                statePc = 64;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var12 = hb.field_a.a(true);
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
                            var9 = (String) null;
                            hp.a((byte) -117, (String) null);
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
                            var7 = hf.a(65, ((rb) var12).field_g, 0, ((rb) var12).field_f);
                            hp.a((byte) -121, var7);
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
                            hb.field_a = null;
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
                        v.a("S1", (byte) -52, (Throwable) (Object) var5);
                        var10 = (String) null;
                        hp.a((byte) -112, (String) null);
                        hb.field_a = null;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if (15 != var4) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        ob.field_d = 10;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        if ((var4 ^ -1) != -17) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        return 1;
                    }
                    case 68: {
                        if (var4 != 17) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        return 2;
                    }
                    case 70: {
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

    final void a(byte param0, String param1, int param2) {
        this.a(640, true, param1, param2, 480);
        if (param0 != -60) {
            ((ct) this).field_z = -63L;
        }
    }

    private final void e(byte param0) {
        String var2 = pl.b(111);
        rr.a(var2, (byte) -108, bm.m(108));
        int var3 = 64 % ((56 - param0) / 61);
    }

    final void i(int param0) {
        int var3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 4) {
          return;
        } else {
          L0: {
            if (!jr.a((byte) 32)) {
              if ((bl.field_c ^ -1) <= -11) {
                if (uk.a((byte) -5)) {
                  if (ob.field_d == 0) {
                    int discarded$2 = this.a(8, false, false);
                    break L0;
                  } else {
                    ic.a(nh.field_e, false);
                    break L0;
                  }
                } else {
                  rp.b(param0 + -3);
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              L1: {
                stackOut_2_0 = this;
                stackOut_2_1 = 8;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (null == jf.field_a) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L1;
                }
              }
              int discarded$3 = this.a(stackIn_5_1, stackIn_5_2 != 0, false);
              break L0;
            }
          }
          return;
        }
    }

    private final void a(int param0, boolean param1, String param2, int param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
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
          if (((ct) this).b(param1)) {
            L0: {
              L1: {
                ((ct) this).field_w = ((ct) this).getCodeBase().getHost();
                var6_ref = ((ct) this).field_w.toLowerCase();
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
              ((ct) this).field_r = stackIn_7_1 != 0;
              ((ct) this).field_y = Integer.parseInt(((ct) this).getParameter("gameport1"));
              ((ct) this).field_F = Integer.parseInt(((ct) this).getParameter("gameport2"));
              var7 = ((ct) this).getParameter("servernum");
              if (var7 == null) {
                break L2;
              } else {
                ((ct) this).field_s = Integer.parseInt(var7);
                break L2;
              }
            }
            L3: {
              ((ct) this).field_u = Integer.parseInt(((ct) this).getParameter("gamecrc"));
              ((ct) this).field_z = Long.parseLong(((ct) this).getParameter("instanceid"));
              ((ct) this).field_A = ((ct) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((ct) this).getParameter("lang");
              if (var8 == null) {
                break L3;
              } else {
                ((ct) this).field_D = Integer.parseInt(var8);
                break L3;
              }
            }
            L4: {
              if ((((ct) this).field_D ^ -1) <= -6) {
                ((ct) this).field_D = 0;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var9 = ((ct) this).getParameter("affid");
              if (var9 != null) {
                ((ct) this).field_E = Integer.parseInt(var9);
                break L5;
              } else {
                break L5;
              }
            }
            qr.field_b = Boolean.valueOf(((ct) this).getParameter("simplemode")).booleanValue();
            ((ct) this).a(param0, 0, param3, param2, ((ct) this).field_u, param4, 32);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = (String) null;
        v.a((String) null, (byte) -52, (Throwable) (Object) var6);
        ((ct) this).a(-107, "crash");
    }

    private final void n(int param0) {
        ho.field_d[12] = -1;
        ho.field_d[13] = -1;
        ho.field_d[5] = -1;
        ho.field_d[18] = 1;
        ho.field_d[8] = -2;
        ho.field_d[4] = -1;
        ho.field_d[11] = -1;
        ho.field_d[16] = -1;
        ho.field_d[17] = -1;
        ho.field_d[3] = -1;
        ho.field_d[10] = -1;
        ho.field_d[7] = -1;
        ho.field_d[6] = -2;
        ho.field_d[2] = -2;
        ho.field_d[1] = 16;
        ho.field_d[9] = param0;
    }

    final int a(boolean param0, int param1) {
        if (param1 > -21) {
            this.a(20, true);
        }
        return this.a(8, param0, true);
    }

    final int p(int param0) {
        int var2 = 0;
        var2 = this.j(-76);
        if (param0 != 16637) {
          return -117;
        } else {
          L0: {
            L1: {
              if (-1 == (var2 ^ -1)) {
                break L1;
              } else {
                if (1 != var2) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!fh.field_e[1]) {
                break L2;
              } else {
                io.a((byte) -117, 2);
                break L2;
              }
            }
            L3: {
              if (!fh.field_e[2]) {
                break L3;
              } else {
                pl.c(3, 0);
                break L3;
              }
            }
            L4: {
              if (!fh.field_e[3]) {
                break L4;
              } else {
                so.a(4, (byte) -39);
                break L4;
              }
            }
            L5: {
              if (fh.field_e[4]) {
                eq.a((byte) 123, 5);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (fh.field_e[5]) {
                tt.a(6, 2048);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (!fh.field_e[6]) {
                break L7;
              } else {
                mj.a((byte) 84, 7);
                break L7;
              }
            }
            if (!fh.field_e[8]) {
              break L0;
            } else {
              qs.a(-72);
              break L0;
            }
          }
          return var2;
        }
    }

    private final void m(int param0) {
        int var2 = 98 % ((-68 - param0) / 54);
        fh.field_e[1] = true;
    }

    private final void g(int param0) {
        int var2 = 39 % ((-37 - param0) / 63);
        fh.field_e[4] = true;
    }

    private final void k(int param0) {
        int var2 = nm.field_c.g(-53);
        if (param0 > -75) {
            this.m(-11);
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + ag.field_s;
        byte[] var5 = new byte[var4];
        nm.field_c.a(var5, var4, 0, false);
        wc.a(ea.a(0, var5), bm.m(125), 14301, var3 != 0);
    }

    private final int j(int param0) {
        if (param0 >= -35) {
            this.e((byte) 71);
        }
        if (!(!((ct) this).field_e)) {
            return -1;
        }
        if (!(dg.j(27711))) {
            return -1;
        }
        if (!(!vs.field_f)) {
            return -1;
        }
        int var2 = pi.a(((ct) this).field_E, la.a(4), 0, ((ct) this).field_r, sa.b(-25752), true);
        if (var2 == -1) {
            return -1;
        }
        if (-1 != (var2 ^ -1)) {
            // if_icmpeq L99
        } else {
            if (ob.field_d == 11) {
                if (!(-1 != sk.field_a)) {
                    um.d(1);
                }
            }
            return var2;
        }
        if (!(v.field_a)) {
            ((ct) this).a(-103, "reconnect");
        }
        rc.c((byte) 124);
        li.a(-2, var2, rp.field_m);
        vs.field_f = true;
        wg.field_b = kh.a(-76) - -15000L;
        return var2;
    }

    private final void a(int param0, boolean param1) {
        fh.field_e[8] = param1;
        fh.field_e[17] = true;
        fh.field_e[0] = true;
        fh.field_e[3] = true;
        fh.field_e[18] = true;
        if (param0 != -16342) {
          return;
        } else {
          fh.field_e[16] = true;
          fh.field_e[7] = true;
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ct) this).setBackground(java.awt.Color.black);
        if (param6 != 12) {
            int discarded$0 = ((ct) this).a(false, -10);
        }
        fb.field_e = ((ct) this).field_D;
        qm.a(fb.field_e, (byte) -44);
        ka.a(-31808, ((ct) this).field_z, ((ct) this).field_w, 5000, ((ct) this).field_F, param1, ((ct) this).field_A, 5000, fb.field_e, ((ct) this).field_s, ((ct) this).field_y, ((ct) this).field_u, pt.field_b, param2);
        hh.a(((ct) this).field_F, ((ct) this).field_w, ((ct) this).field_y, param2, (byte) -36, pt.field_b, fb.field_e, ((ct) this).field_u, ((ct) this).field_s);
        du.k(-128);
        jd.field_c = qj.g(param6 + 8180);
        cd.a(ci.field_f, 42);
        hf.field_r = param0;
        ks.field_a = param7;
        ju.field_m = param5;
        mb.field_q = param3;
        uk.field_e = param4;
        this.n(-1);
        qj.h(34);
    }

    private final static Boolean h(int param0) {
        Boolean var1 = qj.field_r;
        if (param0 < 109) {
            Boolean discarded$0 = ct.h(-116);
        }
        qj.field_r = null;
        return var1;
    }

    final void b(boolean param0, byte param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        String stackIn_113_1 = null;
        int stackIn_114_0 = 0;
        String stackIn_114_1 = null;
        int stackIn_115_0 = 0;
        String stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_146_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_112_0 = 0;
        String stackOut_112_1 = null;
        int stackOut_114_0 = 0;
        String stackOut_114_1 = null;
        int stackOut_114_2 = 0;
        int stackOut_113_0 = 0;
        String stackOut_113_1 = null;
        int stackOut_113_2 = 0;
        int stackOut_145_0 = 0;
        int stackOut_144_0 = 0;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          if (aj.field_s != null) {
            L1: {
              if (jf.field_a != null) {
                break L1;
              } else {
                var6 = nk.b((byte) 127);
                var4 = var6.getSize();
                aj.field_s.a(0, ((java.awt.Dimension) var4).width, ((java.awt.Dimension) var4).height);
                break L1;
              }
            }
            aj.field_s.b(59);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          kc.a(0);
          fb.a(92);
          if (im.a(true)) {
            break L2;
          } else {
            if (ob.field_d == 11) {
              break L2;
            } else {
              mb.c((byte) 125);
              break L2;
            }
          }
        }
        L3: {
          if (null != jd.field_c) {
            nh.field_e = jd.field_c.b(12);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (tg.a(-128)) {
            L5: {
              var3 = bl.a(101) * 1200;
              if (((ct) this).field_q) {
                break L5;
              } else {
                if (var3 >= fb.b(0)) {
                  break L4;
                } else {
                  if (ro.c((byte) -37) <= var3) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ct) this).field_q = false;
            te.b(true);
            rc.c((byte) -110);
            li.a(11, 2, oi.field_b);
            np.b(34066);
            vs.field_f = true;
            wg.field_b = 15000L + kh.a(-105);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (0 == (sk.field_a ^ -1)) {
              break L7;
            } else {
              if (sk.field_a != -1) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (0 != sk.field_a) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          var3 = stackIn_24_0;
          sk.field_a = lb.a(0);
          if (var3 != 0) {
            if (0 == sk.field_a) {
              if ((ob.field_d ^ -1) == -12) {
                if (!dg.j(27711)) {
                  um.d(1);
                  if ((sk.field_a ^ -1) == 0) {
                    break L6;
                  } else {
                    if (sk.field_a == -1) {
                      break L6;
                    } else {
                      wg.field_b = 15000L + kh.a(-100);
                      break L6;
                    }
                  }
                } else {
                  if ((sk.field_a ^ -1) == 0) {
                    break L6;
                  } else {
                    if (sk.field_a == 0) {
                      break L6;
                    } else {
                      wg.field_b = 15000L + kh.a(-100);
                      break L6;
                    }
                  }
                }
              } else {
                if ((sk.field_a ^ -1) == 0) {
                  break L6;
                } else {
                  if (sk.field_a == 0) {
                    break L6;
                  } else {
                    wg.field_b = 15000L + kh.a(-100);
                    break L6;
                  }
                }
              }
            } else {
              if ((sk.field_a ^ -1) == 0) {
                break L6;
              } else {
                if (sk.field_a == 0) {
                  break L6;
                } else {
                  wg.field_b = 15000L + kh.a(-100);
                  break L6;
                }
              }
            }
          } else {
            if ((sk.field_a ^ -1) == 0) {
              break L6;
            } else {
              if (sk.field_a == 0) {
                break L6;
              } else {
                wg.field_b = 15000L + kh.a(-100);
                break L6;
              }
            }
          }
        }
        L9: {
          if (0 == sk.field_a) {
            break L9;
          } else {
            if (sk.field_a == -1) {
              break L9;
            } else {
              if (bl.field_c >= 10) {
                if (-11 >= (ob.field_d ^ -1)) {
                  L10: {
                    rc.c((byte) 122);
                    if (sk.field_a != -4) {
                      if (-5 != sk.field_a) {
                        if (sk.field_a == -3) {
                          li.a(116, 256, eu.field_k);
                          break L10;
                        } else {
                          if (-6 == sk.field_a) {
                            li.a(-102, 5, ut.field_b);
                            break L10;
                          } else {
                            li.a(-71, 256, rt.field_g);
                            break L10;
                          }
                        }
                      } else {
                        li.a(6, 256, vi.field_n);
                        break L10;
                      }
                    } else {
                      li.a(122, 256, fh.field_f);
                      break L10;
                    }
                  }
                  vs.field_f = true;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                if (-4 != sk.field_a) {
                  if (sk.field_a == 4) {
                    ((ct) this).a(-109, "js5io");
                    break L9;
                  } else {
                    if (sk.field_a != -3) {
                      if (-6 != sk.field_a) {
                        ((ct) this).a(-109, "js5connect");
                        break L9;
                      } else {
                        ((ct) this).a(-109, "outofdate");
                        break L9;
                      }
                    } else {
                      ((ct) this).a(-109, "js5connect_full");
                      break L9;
                    }
                  }
                } else {
                  ((ct) this).a(-116, "js5crc");
                  break L9;
                }
              }
            }
          }
        }
        L11: {
          L12: {
            L13: {
              if (0 == (sk.field_a ^ -1)) {
                break L13;
              } else {
                if (0 != sk.field_a) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (dg.j(27711)) {
              break L12;
            } else {
              break L11;
            }
          }
          if (wg.field_b <= kh.a(-119)) {
            vs.field_f = false;
            if ((sk.field_a ^ -1) == 0) {
              break L11;
            } else {
              if (0 == sk.field_a) {
                break L11;
              } else {
                sk.field_a = -1;
                wj.e(100);
                break L11;
              }
            }
          } else {
            break L11;
          }
        }
        L14: {
          if (0 != sk.field_a) {
            break L14;
          } else {
            if (!dg.j(27711)) {
              w.field_a = false;
              break L14;
            } else {
              break L14;
            }
          }
        }
        if (param1 >= 76) {
          L15: {
            if (0 != bl.field_c) {
              break L15;
            } else {
              if (!sg.a(127)) {
                break L15;
              } else {
                bl.field_c = 1;
                break L15;
              }
            }
          }
          L16: {
            if (bl.field_c == 1) {
              L17: {
                if (fb.field_e == 0) {
                  break L17;
                } else {
                  ij.field_h = ot.a(-86, ju.field_m);
                  break L17;
                }
              }
              oi.field_a = sd.a(false, 1, true, false, uk.field_e);
              uj.field_b = sd.a(false, 1, true, false, ks.field_a);
              cf.field_f = sd.a(false, 1, true, false, mb.field_q);
              fg.field_t = uj.field_b;
              bl.field_c = 2;
              hg.field_x = oi.field_a;
              break L16;
            } else {
              break L16;
            }
          }
          L18: {
            if ((bl.field_c ^ -1) != -3) {
              break L18;
            } else {
              L19: {
                if (ij.field_h != null) {
                  if (!ij.field_h.b((byte) 104)) {
                    break L19;
                  } else {
                    if (!ij.field_h.a("", 116)) {
                      ij.field_h = null;
                      break L19;
                    } else {
                      if (!ij.field_h.c("", -14012)) {
                        break L19;
                      } else {
                        ub.a((byte) -125, ij.field_h);
                        ij.field_h = null;
                        te.a(62);
                        break L19;
                      }
                    }
                  }
                } else {
                  break L19;
                }
              }
              if (null != ij.field_h) {
                break L18;
              } else {
                bl.field_c = 3;
                break L18;
              }
            }
          }
          L20: {
            if (3 != bl.field_c) {
              break L20;
            } else {
              if (!bu.a(uj.field_b, cf.field_f, oi.field_a, false)) {
                break L20;
              } else {
                if (gh.a((byte) 15, cf.field_f)) {
                  L21: {
                    L22: {
                      ps.a(true);
                      om.c(5665);
                      nq.field_a = false;
                      dq.field_b = mp.field_e;
                      cg.a(false, uj.field_b, oi.field_a, te.field_h, cf.field_f);
                      if (qp.field_i) {
                        break L22;
                      } else {
                        if (fg.field_k == null) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (qp.field_i) {
                        stackOut_111_0 = 0;
                        stackIn_112_0 = stackOut_111_0;
                        break L23;
                      } else {
                        stackOut_110_0 = 1;
                        stackIn_112_0 = stackOut_110_0;
                        break L23;
                      }
                    }
                    L24: {
                      stackOut_112_0 = stackIn_112_0;
                      stackOut_112_1 = fg.field_k;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      if (qp.field_i) {
                        stackOut_114_0 = stackIn_114_0;
                        stackOut_114_1 = (String) (Object) stackIn_114_1;
                        stackOut_114_2 = 0;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        stackIn_115_2 = stackOut_114_2;
                        break L24;
                      } else {
                        stackOut_113_0 = stackIn_113_0;
                        stackOut_113_1 = (String) (Object) stackIn_113_1;
                        stackOut_113_2 = 1;
                        stackIn_115_0 = stackOut_113_0;
                        stackIn_115_1 = stackOut_113_1;
                        stackIn_115_2 = stackOut_113_2;
                        break L24;
                      }
                    }
                    hr.a(stackIn_115_0 != 0, (String) (Object) stackIn_115_1, stackIn_115_2 != 0, (byte) -61);
                    break L21;
                  }
                  L25: {
                    if (qr.field_b) {
                      of.a(109);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (rt.field_h != null) {
                      break L26;
                    } else {
                      rt.field_h = pj.c((byte) -101);
                      co.field_c = ci.b(15);
                      break L26;
                    }
                  }
                  du.a(co.field_c, 37, rt.field_h, cf.field_f);
                  oi.field_a = null;
                  uj.field_b = null;
                  cf.field_f = null;
                  wb.a((java.applet.Applet) this, 17337);
                  te.a(67);
                  bl.field_c = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
            }
          }
          L27: {
            if (-11 != bl.field_c) {
              break L27;
            } else {
              L28: {
                if (-1 != fb.field_e) {
                  fn.field_a = ot.a(-92, hf.field_r);
                  break L28;
                } else {
                  break L28;
                }
              }
              bl.field_c = 11;
              break L27;
            }
          }
          L29: {
            if (-12 == (bl.field_c ^ -1)) {
              L30: {
                if (null == fn.field_a) {
                  break L30;
                } else {
                  L31: {
                    if (!fn.field_a.b((byte) -88)) {
                      break L31;
                    } else {
                      if (fn.field_a.b(0)) {
                        break L30;
                      } else {
                        break L31;
                      }
                    }
                  }
                  fh.a(-82, 0.0f, kc.a(dt.field_b, gm.field_w, fn.field_a, 50));
                  break L29;
                }
              }
              bl.field_c = 12;
              jn.field_t = true;
              break L29;
            } else {
              break L29;
            }
          }
          L32: {
            if (-13 == (bl.field_c ^ -1)) {
              if (!jn.field_t) {
                bl.field_c = 13;
                break L32;
              } else {
                break L32;
              }
            } else {
              break L32;
            }
          }
          L33: {
            if ((bl.field_c ^ -1) != -14) {
              break L33;
            } else {
              L34: {
                var3 = 1;
                if (null != hg.field_y) {
                  L35: {
                    if (!hg.field_y.a(-18738)) {
                      stackOut_145_0 = 0;
                      stackIn_146_0 = stackOut_145_0;
                      break L35;
                    } else {
                      stackOut_144_0 = 1;
                      stackIn_146_0 = stackOut_144_0;
                      break L35;
                    }
                  }
                  var3 = stackIn_146_0;
                  fh.a(-59, hg.field_y.field_d, hg.field_y.field_j);
                  break L34;
                } else {
                  break L34;
                }
              }
              if (var3 != 0) {
                bl.field_c = 20;
                break L33;
              } else {
                break L33;
              }
            }
          }
          L36: {
            if (param0) {
              break L36;
            } else {
              if (or.field_c) {
                pg.a(ci.field_f, -69);
                ((ct) this).b(-14829);
                cd.a(ci.field_f, 37);
                break L36;
              } else {
                break L36;
              }
            }
          }
          L37: {
            if (fh.field_e[8]) {
              ei.a(-114);
              break L37;
            } else {
              break L37;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param4, false, param2, param3, param6, param5, param0 + 25, param1);
        if (param0 != -13) {
            this.e((byte) -88);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    private final void d(byte param0) {
        if (param0 != 56) {
            ((ct) this).field_D = -65;
        }
        fh.field_e[2] = true;
    }

    final void a(byte param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(param0 + -16404, false);
        if (!(!param3)) {
            this.m(param0 + -41);
        }
        if (!(!param2)) {
            this.d((byte) 56);
        }
        if (param4) {
            this.g(67);
        }
        if (!(!param1)) {
            this.l(-11);
        }
        if (param0 != 62) {
            ((ct) this).field_z = -91L;
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        s var4 = null;
        int var5 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          var2 = qs.field_b;
          var3 = -90 / ((param0 - -27) / 61);
          if (var2 >= 64) {
            break L0;
          } else {
            if (!fh.field_e[var2]) {
              break L0;
            } else {
              if (var2 == 0) {
                return;
              } else {
                L1: {
                  if ((var2 ^ -1) == -2) {
                    br.f(113);
                    break L1;
                  } else {
                    if (2 == var2) {
                      ce.a((byte) 116);
                      break L1;
                    } else {
                      if (var2 != 3) {
                        if (var2 != 4) {
                          if (var2 != -6) {
                            if (-7 != var2) {
                              if (7 != var2) {
                                if (-9 == var2) {
                                  ae.a(ag.field_s, (rb) (Object) nm.field_c, false, pt.field_b);
                                  break L1;
                                } else {
                                  if (-17 == var2) {
                                    vb.a(true);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var2 == 11) {
                                        break L2;
                                      } else {
                                        if (12 != var2) {
                                          if (13 == var2) {
                                            se.a(-86);
                                            break L1;
                                          } else {
                                            if (17 != var2) {
                                              if (var2 == 18) {
                                                to.g(0);
                                                break L1;
                                              } else {
                                                v.a("MGS1: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
                                                te.b(true);
                                                break L1;
                                              }
                                            } else {
                                              this.k(-105);
                                              break L1;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    L3: {
                                      if (12 != var2) {
                                        stackOut_24_0 = 0;
                                        stackIn_25_0 = stackOut_24_0;
                                        break L3;
                                      } else {
                                        stackOut_23_0 = 1;
                                        stackIn_25_0 = stackOut_23_0;
                                        break L3;
                                      }
                                    }
                                    var4 = um.a(stackIn_25_0 != 0, 1);
                                    pj.a(0, var4);
                                    break L1;
                                  }
                                }
                              } else {
                                this.e((byte) -94);
                                break L1;
                              }
                            } else {
                              gu.a(4);
                              break L1;
                            }
                          } else {
                            rq.a((byte) 126);
                            break L1;
                          }
                        } else {
                          qo.a((byte) -26);
                          break L1;
                        }
                      } else {
                        dh.a(120);
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
        v.a("MGS2: " + dl.k((byte) 65), (byte) -52, (Throwable) null);
        te.b(true);
    }

    public static void o(int param0) {
        field_H = null;
        if (param0 != -12516) {
            field_t = (gu) null;
        }
        field_v = null;
        field_C = null;
        field_t = null;
    }

    private final void l(int param0) {
        if (param0 != -11) {
            int discarded$0 = this.j(-15);
        }
        fh.field_e[5] = true;
    }

    protected ct() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new gu("");
        field_H = new ej(13, 0, 1, 0);
        field_B = 250;
        field_C = "Music: ";
    }
}
