/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends id {
    static int field_F;
    boolean field_K;
    static cj field_O;
    static ef field_G;
    boolean field_H;
    static th field_M;
    private boolean field_J;
    private int field_P;
    static java.applet.Applet field_L;
    static String field_N;
    static String field_I;

    fd(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((fd) this).field_J = false;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (-1 == (((fd) this).field_C & 1073741824 ^ -1)) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((fd) this).field_H = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((((fd) this).field_C & 536870912) == 0) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        ((fd) this).field_K = stackIn_6_1 != 0;
        ((fd) this).field_P = ((fd) this).field_C;
        ((fd) this).field_P = ((fd) this).field_P & -1610612737;
        ((fd) this).field_P = ((fd) this).field_P - 1;
        var10 = rb.field_c;
        var9 = var10;
        var8 = var9;
        var4 = var8;
        var5 = 0;
        L2: while (true) {
          if (var5 >= var10.length) {
          } else {
            var6 = var10[var5];
            if (((fd) this).field_P == var6) {
              ((fd) this).field_J = true;
              var5++;
              continue L2;
            } else {
              var5++;
              continue L2;
            }
          }
        }
    }

    public static void g(byte param0) {
        field_G = null;
        field_M = null;
        field_L = null;
        if (param0 != 97) {
            return;
        }
        field_I = null;
        field_N = null;
        field_O = null;
    }

    final void a(int param0, nm param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -10136) {
            break L0;
          } else {
            field_M = null;
            break L0;
          }
        }
        var3 = param1.c(((fd) this).g(param0 ^ 10195), -20126);
        var4 = -24 + param1.d(((fd) this).h(param0 ^ -10230), 127);
        if (!io.a(var3, var4, (byte) -110, param1)) {
          return;
        } else {
          L1: {
            if (!((fd) this).field_J) {
              break L1;
            } else {
              if (io.a(var3, -24 + var4, (byte) -114, param1)) {
                break L1;
              } else {
                return;
              }
            }
          }
          L2: {
            var5 = ((fd) this).g(-128) / 24;
            var6 = ((fd) this).h(-51) / 24;
            if (he.field_a) {
              break L2;
            } else {
              if ((var5 ^ -1) > -1) {
                break L2;
              } else {
                if (var5 >= fb.field_e.field_u.field_k[0].length) {
                  break L2;
                } else {
                  if (var6 < 0) {
                    break L2;
                  } else {
                    if (var6 >= fb.field_e.field_u.field_k.length) {
                      break L2;
                    } else {
                      if (fb.field_e.field_u.field_k[var6][var5]) {
                        return;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
          }
          L3: {
            L4: {
              if (!((fd) this).field_H) {
                break L4;
              } else {
                if (!((fd) this).field_K) {
                  break L4;
                } else {
                  od.field_Ab[((fd) this).field_P].d(var3, var4);
                  break L3;
                }
              }
            }
            if (((fd) this).field_H) {
              od.field_Ab[((fd) this).field_P].b(var3, var4);
              break L3;
            } else {
              if (!((fd) this).field_K) {
                od.field_Ab[((fd) this).field_P].g(var3, var4);
                break L3;
              } else {
                od.field_Ab[((fd) this).field_P].a(var3, var4);
                break L3;
              }
            }
          }
          L5: {
            if (!((fd) this).field_J) {
              break L5;
            } else {
              if (!((fd) this).field_H) {
                if (!((fd) this).field_K) {
                  od.field_Ab[-8 + ((fd) this).field_P].g(var3, -24 + var4);
                  break L5;
                } else {
                  od.field_Ab[-8 + ((fd) this).field_P].a(var3, -24 + var4);
                  break L5;
                }
              } else {
                od.field_Ab[-8 + ((fd) this).field_P].b(var3, var4 + -24);
                break L5;
              }
            }
          }
          return;
        }
    }

    final void f(byte param0) {
        if (param0 > -79) {
            ((fd) this).f((byte) 89);
        }
    }

    final static void h(byte param0) {
        oq.field_w = null;
        qp.field_t = null;
        qj.field_o = null;
        vj.field_p = null;
        k.field_i = null;
        if (param0 <= 124) {
            field_G = null;
        }
        tp.field_t = null;
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, String param4, int param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_41_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_59_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = ZombieDawnMulti.field_E ? 1 : 0;
                        if (ki.field_h == null) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!ee.a(param1, false)) {
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
                        if (ud.field_cb != vo.field_l) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (!param1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var10 = null;
                        ki.field_a = eg.a(64, ii.field_d, (String) null, false, param3);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        ki.field_a = cn.a((byte) 125, param4, param3, false);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ma.field_a.field_j = 0;
                        ma.field_a.a(-94, 14);
                        ma.field_a.a(126, ki.field_a.b(param0 + -7).field_d);
                        cb.a(-1, false);
                        vo.field_l = de.field_h;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (param0 == 14) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        return -97;
                    }
                    case 12: {
                        if (de.field_h == vo.field_l) {
                            statePc = 14;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (fa.b(10, 1)) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var6 = s.field_e.g(param0 ^ 31371);
                        s.field_e.field_j = 0;
                        if (-1 == (var6 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        hd.field_q = -1;
                        vo.field_l = gn.field_K;
                        op.field_i = var6;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 18: {
                        vo.field_l = ul.field_n;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (ul.field_n != vo.field_l) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (!fa.b(10, 8)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        nm.field_c = s.field_e.a((byte) -30);
                        s.field_e.field_j = 0;
                        pi.a((byte) -59, param2, param1, ki.field_a, param5);
                        vo.field_l = lc.field_l;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (vo.field_l == lc.field_l) {
                            statePc = 24;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (!fa.b(10, 1)) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        var6 = s.field_e.g(31365);
                        s.field_e.field_j = 0;
                        oe.field_f = null;
                        op.field_i = var6;
                        if (var6 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (var6 == 1) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (-9 != (var6 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        ak.a((byte) -111);
                        sk.field_j = false;
                        return var6;
                    }
                    case 29: {
                        hd.field_q = -1;
                        vo.field_l = gn.field_K;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 30: {
                        hd.field_q = -1;
                        vo.field_l = qb.field_e;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (vo.field_l == qb.field_e) {
                            statePc = 33;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        if (!dd.a(0)) {
                            statePc = 86;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        ii.field_d = s.field_e.a((byte) -30);
                        ci.field_f = param3;
                        kj.field_q = s.field_e.g(31365);
                        am.field_b = s.field_e.g(31365);
                        vl.field_h = s.field_e.d((byte) 69);
                        var11 = s.field_e.g((byte) -89);
                        var7 = s.field_e.g(31365);
                        if ((var7 & 1) != 0) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        fj.a((byte) 85);
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (!param1) {
                            statePc = 45;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        if ((var7 & 16) == 0) {
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
                        tm.field_b = stackIn_41_0 != 0;
                        if (!gj.field_e) {
                            statePc = 63;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        int discarded$16 = s.field_e.g(31365);
                        int discarded$17 = s.field_e.g(param0 + 31351);
                        int discarded$18 = s.field_e.i(-1478490344);
                        vn.field_f = s.field_e.d((byte) 69);
                        kq.field_b = new byte[vn.field_f];
                        var8 = 0;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (var8 >= vn.field_f) {
                            statePc = 63;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                        var8++;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 45: {
                        if (0 == (4 & var7)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = 1;
                        stackIn_48_0 = stackOut_46_0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 47: {
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        fj.field_M = stackIn_48_0 != 0;
                        if ((2 & var7) == 0) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 50: {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        sh.field_L = stackIn_51_0 != 0;
                        if ((var7 & 8) == 0) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        stackOut_52_0 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 53: {
                        stackOut_53_0 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        nh.field_m = stackIn_54_0 != 0;
                        if (!nh.field_m) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        sh.field_L = true;
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 56: {
                        if ((var7 & 16) == 0) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        stackOut_57_0 = 1;
                        stackIn_59_0 = stackOut_57_0;
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 58: {
                        stackOut_58_0 = 0;
                        stackIn_59_0 = stackOut_58_0;
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        tm.field_b = stackIn_59_0 != 0;
                        if (!gj.field_e) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        int discarded$19 = s.field_e.g(31365);
                        int discarded$20 = s.field_e.g(param0 + 31351);
                        int discarded$21 = s.field_e.i(-1478490344);
                        vn.field_f = s.field_e.d((byte) 69);
                        kq.field_b = new byte[vn.field_f];
                        var8 = 0;
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if (var8 >= vn.field_f) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                        var8++;
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 63: {
                        ta.field_lb = s.field_e.f((byte) -48);
                        var12 = (CharSequence) (Object) ta.field_lb;
                        kf.field_k = tg.a(var12, false);
                        qq.field_a = s.field_e.g(31365);
                        vo.field_l = pi.field_a;
                        if (ki.field_a.b(7) != uq.field_b) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        wp.field_b.a(-108, jl.b(0));
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 65: {
                        if (ki.field_a.b(7) == pl.field_G) {
                            statePc = 67;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        l.field_c.a(-100, jl.b(0));
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        sk.field_j = false;
                        if (var11 == null) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        jh.a(jl.b(0), param0 ^ -15, var11);
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 70: {
                        if (-1 > (vl.field_h ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        if (fj.field_M) {
                            statePc = 76;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        try {
                            Object discarded$22 = fo.b(jl.b(0), 13093, "unzap");
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        var8_ref_Throwable = caughtException;
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 76: {
                        try {
                            Object discarded$23 = fo.a(jl.b(0), "zap", (byte) 23, new Object[1]);
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 78;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        var8_ref_Throwable = caughtException;
                        statePc = 79;
                        continue stateLoop;
                    }
                    case 79: {
                        if ((vl.field_h ^ -1) < -1) {
                            statePc = 81;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        cm.field_e = true;
                        statePc = 82;
                        continue stateLoop;
                    }
                    case 82: {
                        ma.field_a.a((byte) -77, mj.field_Fb);
                        var8 = 0;
                        statePc = 83;
                        continue stateLoop;
                    }
                    case 83: {
                        if (4 <= var8) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        mj.field_Fb[var8] = mj.field_Fb[var8] + 50;
                        var8++;
                        statePc = 83;
                        continue stateLoop;
                    }
                    case 85: {
                        s.field_e.a((byte) -116, mj.field_Fb);
                        return op.field_i;
                    }
                    case 86: {
                        if (vo.field_l == gn.field_K) {
                            statePc = 88;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    }
                    case 88: {
                        if (dd.a(0)) {
                            statePc = 90;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        ak.a((byte) -124);
                        if (op.field_i != 7) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        if (!sk.field_j) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        if ((op.field_i ^ -1) == -8) {
                            statePc = 95;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    }
                    case 95: {
                        op.field_i = 3;
                        statePc = 96;
                        continue stateLoop;
                    }
                    case 96: {
                        ol.field_q = s.field_e.f((byte) -31);
                        sk.field_j = false;
                        return op.field_i;
                    }
                    case 97: {
                        sk.field_j = true;
                        return -1;
                    }
                    case 98: {
                        if (ki.field_h == null) {
                            statePc = 100;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    }
                    case 100: {
                        if (sk.field_j) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    }
                    case 101: {
                        var6 = jo.field_b;
                        jo.field_b = ff.field_s;
                        sk.field_j = true;
                        ff.field_s = var6;
                        statePc = 106;
                        continue stateLoop;
                    }
                    case 102: {
                        if (-30001L > (he.b((byte) -22) ^ -1L)) {
                            statePc = 104;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    }
                    case 103: {
                        ol.field_q = ga.field_w;
                        statePc = 105;
                        continue stateLoop;
                    }
                    case 104: {
                        ol.field_q = aj.field_l;
                        statePc = 105;
                        continue stateLoop;
                    }
                    case 105: {
                        sk.field_j = false;
                        return 3;
                    }
                    case 106: {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = -1;
        field_M = new th();
        field_I = "You have declined the invitation.";
        field_N = "Elapsed time";
    }
}
