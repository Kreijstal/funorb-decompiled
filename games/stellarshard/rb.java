/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class rb extends ac {
    private boolean field_x;
    private boolean field_o;
    private long field_y;
    private int field_q;
    static int field_s;
    static String field_t;
    String field_C;
    private int field_r;
    static ci field_u;
    private int field_v;
    private int field_D;
    static int field_w;
    private int field_A;
    private int field_z;
    private boolean field_p;

    final void k(int param0) {
        int var3 = stellarshard.field_B;
        if (vj.a(25424)) {
            int discarded$1 = this.a(pd.field_f != null ? true : false, false, true);
        } else {
            if (-11 >= (rk.field_f ^ -1)) {
                if (!gh.b((byte) 82)) {
                    hf.c(param0 ^ -241);
                } else {
                    if (eg.field_d == 0) {
                        int discarded$3 = this.a(false, false, true);
                    } else {
                        sg.a(51, ke.field_b);
                    }
                }
            }
        }
        if (param0 != -11) {
            this.a((byte) -116, true);
        }
    }

    final static ek[] g(int param0) {
        ek[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = stellarshard.field_B;
        var1 = new ek[sb.field_b];
        var2 = 0;
        L0: while (true) {
          if (sb.field_b <= var2) {
            if (param0 != 1851) {
              return null;
            } else {
              tb.f((byte) -118);
              return var1;
            }
          } else {
            var1[var2] = new ek(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], ih.field_b[var2], gj.field_w);
            var2++;
            continue L0;
          }
        }
    }

    private final void c(boolean param0) {
        if (param0) {
            return;
        }
        wc.field_x[2] = true;
    }

    private final void i(int param0) {
        i.field_e[3] = -1;
        i.field_e[10] = -1;
        i.field_e[7] = -1;
        i.field_e[11] = -1;
        i.field_e[4] = -1;
        i.field_e[12] = -1;
        i.field_e[17] = -1;
        i.field_e[2] = -2;
        i.field_e[16] = -1;
        i.field_e[8] = -2;
        i.field_e[9] = -1;
        i.field_e[5] = -1;
        i.field_e[6] = -2;
        if (param0 != 18) {
            Object var3 = null;
            ((rb) this).a(-41, false, (String) null);
        }
        i.field_e[13] = -1;
        i.field_e[1] = 16;
        i.field_e[18] = 1;
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            ka var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = stellarshard.field_B;
                        if (param2) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ((rb) this).field_q = -96;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var4 = ck.a(bb.field_d, ke.field_b, param0, false);
                        if (var4 != -1) {
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
                        if (-2 != var4) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var5_int = dc.a(tb.g((byte) 118), -112, n.a(20));
                        if (var5_int == -1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        sl.a(ga.field_a, var5_int, (byte) -110, fc.field_b);
                        fc.field_b = null;
                        ga.field_a = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = wj.g(-117);
                        if (var11 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        vk.a((byte) -122, var11.booleanValue());
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (-3 == (var4 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var5_int = qe.a(tc.c(-5), kg.e(false), param2, rb.j(5), ((rb) this).field_v, wh.a((byte) 88), jg.i((byte) 113));
                        if (var5_int != -1) {
                            statePc = 14;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        pk.a(ga.field_a, fc.field_b, var5_int, (byte) 125);
                        ga.field_a = null;
                        fc.field_b = null;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (3 == var4) {
                            statePc = 17;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (ei.field_F == -1) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (-1 != (ei.field_F ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        ei.field_F = -1;
                        ee.a(112);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (!param1) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        pc.field_m = false;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 23: {
                        var5_int = wj.a(wh.a((byte) 97), ((rb) this).field_v, ((rb) this).field_x, tc.c(-5), (byte) 74, false);
                        if (0 == (var5_int ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (0 == var5_int) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        wl.a(var5_int, -8440, ga.field_a);
                        ga.field_a = null;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 26: {
                        al.field_b = we.field_a;
                        db.a(127);
                        cg.field_a = false;
                        eg.field_d = 10;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        if (4 == var4) {
                            statePc = 29;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (uj.field_f) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        eg.field_d = 10;
                        cg.field_a = true;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 31: {
                        pf.a(hf.a((byte) -126), (byte) 123);
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (5 == var4) {
                            statePc = 34;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        df.a(false, hf.a((byte) -96));
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (var4 != -7) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if (!qh.field_d) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        eg.field_d = 10;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (-8 != var4) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        qj.a((byte) 109, hf.a((byte) -17));
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (var4 != 8) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        pf.a(hf.a((byte) -85), (byte) 123);
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if (var4 != -10) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        of.a((byte) 99, hf.a((byte) -101));
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (-11 != var4) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        pg.field_fb.f(17, 950);
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
                        wf.a(63, hf.a((byte) -7));
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (-13 != (var4 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        gf.a(hf.a((byte) -125), kf.b(-940626896), 16729);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if ((var4 ^ -1) == -14) {
                            statePc = 52;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        try {
                            if (q.field_d != null) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            q.field_d = new v(ic.field_d, new java.net.URL(((rb) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (q.field_d.a(14709)) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var12 = q.field_d.b(-4);
                            if (var12 != null) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var9 = null;
                            il.a(7110, (String) null);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var7 = kk.a(var12.field_k, (byte) 97, 0, var12.field_r);
                            il.a(7110, var7);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            q.field_d = null;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        var5 = (Exception) (Object) caughtException;
                        qe.a(-123, "S1", (Throwable) (Object) var5);
                        var10 = null;
                        il.a(7110, (String) null);
                        q.field_d = null;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if (var4 != 15) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        eg.field_d = 10;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if ((var4 ^ -1) != -17) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        return 1;
                    }
                    case 66: {
                        if (var4 != 17) {
                            statePc = 68;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        return 2;
                    }
                    case 68: {
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

    private final void a(byte param0, boolean param1) {
        wc.field_x[3] = true;
        wc.field_x[8] = param1;
        wc.field_x[16] = true;
        wc.field_x[18] = true;
        wc.field_x[0] = true;
        if (param0 < 126) {
            field_s = -20;
        }
        wc.field_x[17] = true;
        wc.field_x[7] = true;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, byte param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        ((rb) this).setBackground(java.awt.Color.black);
        bb.field_d = ((rb) this).field_q;
        ke.a(41, bb.field_d);
        sg.a(5000, ((rb) this).field_D, ((rb) this).field_C, bb.field_d, ic.field_d, param5, 96, param4, ((rb) this).field_y, 5000, ((rb) this).field_A, ((rb) this).field_z, ((rb) this).field_r, ((rb) this).field_o);
        bg.a(69, ((rb) this).field_r, bb.field_d, ((rb) this).field_A, ic.field_d, param5, ((rb) this).field_C, ((rb) this).field_z, ((rb) this).field_D);
        bl.a((byte) -62);
        og.field_c = ck.n(2113632);
        nc.a(qd.field_j, (byte) 123);
        nk.field_b = param1;
        ck.field_hb = param3;
        ki.field_A = param0;
        vd.field_b = param2;
        int var10 = 11 / ((param6 - 30) / 36);
        wd.field_d = param7;
        this.i(18);
        df.a(-3);
    }

    final int c(int param0, boolean param1) {
        if (param0 != -25186) {
            ((rb) this).field_q = 86;
        }
        return this.a(param1, true, true);
    }

    private final void e(int param0) {
        if (param0 != 5978) {
            return;
        }
        wc.field_x[4] = true;
    }

    private final void j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var2 = ae.field_N.f(4);
          if (-1 == (1 & var2 ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param0 != 108) {
          return;
        } else {
          var4 = -1 + ue.field_b;
          var5 = new byte[var4];
          ae.field_N.a(var5, true, 0, var4);
          fk.a(hf.a((byte) -113), var3 != 0, se.a(param0 + -108, var5), (byte) 103);
          return;
        }
    }

    private final void i(byte param0) {
        int var2 = -75 / ((35 - param0) / 59);
        wc.field_x[1] = true;
    }

    public static void m(int param0) {
        int var1 = 77 / ((param0 - 79) / 32);
        field_u = null;
        field_t = null;
    }

    final void a(int param0, boolean param1, String param2) {
        this.a(param0, 480, param2, 640, -7);
        if (!param1) {
            this.c(false);
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var5 = 0;
        int stackIn_24_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        String stackIn_113_2 = null;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        String stackIn_114_2 = null;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        String stackIn_115_2 = null;
        int stackIn_115_3 = 0;
        int stackIn_153_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        String stackOut_112_2 = null;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        String stackOut_114_2 = null;
        int stackOut_114_3 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        String stackOut_113_2 = null;
        int stackOut_113_3 = 0;
        int stackOut_152_0 = 0;
        int stackOut_151_0 = 0;
        L0: {
          var5 = stellarshard.field_B;
          if (null == ja.field_m) {
            ci.a(36);
            ii.g(256);
            if (ee.b(-117)) {
              break L0;
            } else {
              if (eg.field_d == 11) {
                break L0;
              } else {
                ie.d((byte) -56);
                break L0;
              }
            }
          } else {
            ci.a(36);
            ii.g(256);
            if (ee.b(-117)) {
              break L0;
            } else {
              if (eg.field_d == 11) {
                break L0;
              } else {
                ie.d((byte) -56);
                break L0;
              }
            }
          }
        }
        L1: {
          if (null != og.field_c) {
            ke.field_b = og.field_c.b(-115);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (ih.b(12871)) {
            L3: {
              var3 = ea.f((byte) -21) * 1200;
              if (((rb) this).field_p) {
                break L3;
              } else {
                if (kf.a(65280) <= var3) {
                  break L2;
                } else {
                  if (var3 >= gh.a(true)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            ((rb) this).field_p = false;
            oj.c(-2290);
            pk.a(4);
            wl.a(2, -8440, wc.field_p);
            cm.a((byte) -117);
            pc.field_m = true;
            vc.field_a = ih.a((byte) -98) + 15000L;
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          L5: {
            if ((ei.field_F ^ -1) == 0) {
              break L5;
            } else {
              if (ei.field_F != -1) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (-1 != ei.field_F) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L6;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L6;
            }
          }
          L7: {
            var3 = stackIn_24_0;
            ei.field_F = fa.d(0);
            if (var3 == 0) {
              break L7;
            } else {
              if (-1 == ei.field_F) {
                if (-12 != (eg.field_d ^ -1)) {
                  break L7;
                } else {
                  if (il.e(32525)) {
                    break L7;
                  } else {
                    db.a(111);
                    break L7;
                  }
                }
              } else {
                break L7;
              }
            }
          }
          if (ei.field_F == -1) {
            break L4;
          } else {
            if (ei.field_F != 0) {
              vc.field_a = ih.a((byte) -98) - -15000L;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L8: {
          if (param0 > 15) {
            break L8;
          } else {
            field_t = null;
            break L8;
          }
        }
        L9: {
          if (-1 == ei.field_F) {
            break L9;
          } else {
            if (-1 != ei.field_F) {
              if (-11 > rk.field_f) {
                if ((ei.field_F ^ -1) == -4) {
                  ((rb) this).a(1, "js5crc");
                  break L9;
                } else {
                  if (4 == ei.field_F) {
                    ((rb) this).a(1, "js5io");
                    break L9;
                  } else {
                    if (2 == ei.field_F) {
                      ((rb) this).a(1, "js5connect_full");
                      break L9;
                    } else {
                      if (5 != ei.field_F) {
                        ((rb) this).a(1, "js5connect");
                        break L9;
                      } else {
                        ((rb) this).a(1, "outofdate");
                        break L9;
                      }
                    }
                  }
                }
              } else {
                if (eg.field_d < 10) {
                  break L9;
                } else {
                  L10: {
                    pk.a(4);
                    if (ei.field_F == -4) {
                      wl.a(256, -8440, al.field_a);
                      break L10;
                    } else {
                      if (-5 == ei.field_F) {
                        wl.a(256, -8440, eb.field_d);
                        break L10;
                      } else {
                        if (2 != ei.field_F) {
                          if (-6 != (ei.field_F ^ -1)) {
                            wl.a(256, -8440, ui.field_B);
                            break L10;
                          } else {
                            wl.a(5, -8440, ah.field_n);
                            break L10;
                          }
                        } else {
                          wl.a(256, -8440, ea.field_n);
                          break L10;
                        }
                      }
                    }
                  }
                  pc.field_m = true;
                  break L9;
                }
              }
            } else {
              break L9;
            }
          }
        }
        L11: {
          L12: {
            L13: {
              if (ei.field_F == -1) {
                break L13;
              } else {
                if (-1 != (ei.field_F ^ -1)) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (il.e(32525)) {
              break L12;
            } else {
              if (ei.field_F != 0) {
                break L11;
              } else {
                if (il.e(32525)) {
                  break L11;
                } else {
                  b.field_v = false;
                  break L11;
                }
              }
            }
          }
          if (ih.a((byte) -98) >= vc.field_a) {
            pc.field_m = false;
            if (ei.field_F != -1) {
              if (ei.field_F != 0) {
                ei.field_F = -1;
                ee.a(88);
                if (ei.field_F != 0) {
                  break L11;
                } else {
                  if (il.e(32525)) {
                    break L11;
                  } else {
                    b.field_v = false;
                    break L11;
                  }
                }
              } else {
                if (ei.field_F != 0) {
                  break L11;
                } else {
                  if (il.e(32525)) {
                    break L11;
                  } else {
                    b.field_v = false;
                    break L11;
                  }
                }
              }
            } else {
              if (ei.field_F != 0) {
                break L11;
              } else {
                if (il.e(32525)) {
                  break L11;
                } else {
                  b.field_v = false;
                  break L11;
                }
              }
            }
          } else {
            if (ei.field_F != 0) {
              break L11;
            } else {
              if (il.e(32525)) {
                break L11;
              } else {
                b.field_v = false;
                break L11;
              }
            }
          }
        }
        L14: {
          if (0 != rk.field_f) {
            break L14;
          } else {
            if (!tg.a((byte) 49)) {
              break L14;
            } else {
              rk.field_f = 1;
              break L14;
            }
          }
        }
        L15: {
          if (rk.field_f != 1) {
            break L15;
          } else {
            L16: {
              if (bb.field_d == 0) {
                break L16;
              } else {
                pg.field_db = wl.a(1, ki.field_A);
                break L16;
              }
            }
            lk.field_i = o.a(1, 2, nk.field_b, false, true);
            wf.field_e = o.a(1, 2, ck.field_hb, false, true);
            am.field_g = o.a(1, 2, vd.field_b, false, true);
            rk.field_f = 2;
            fc.field_a = lk.field_i;
            ie.field_u = wf.field_e;
            break L15;
          }
        }
        L17: {
          if ((rk.field_f ^ -1) == -3) {
            L18: {
              if (pg.field_db == null) {
                break L18;
              } else {
                if (pg.field_db.a((byte) -36)) {
                  if (!pg.field_db.c("", (byte) -116)) {
                    pg.field_db = null;
                    break L18;
                  } else {
                    if (!pg.field_db.a("", (byte) -109)) {
                      break L18;
                    } else {
                      g.a(pg.field_db, 1);
                      pg.field_db = null;
                      rg.g(-33);
                      break L18;
                    }
                  }
                } else {
                  break L18;
                }
              }
            }
            if (null != pg.field_db) {
              break L17;
            } else {
              rk.field_f = 3;
              break L17;
            }
          } else {
            break L17;
          }
        }
        L19: {
          if (-4 == (rk.field_f ^ -1)) {
            if (!ni.a(wf.field_e, am.field_g, lk.field_i, (byte) -104)) {
              break L19;
            } else {
              if (!dj.a(am.field_g, (byte) -126)) {
                break L19;
              } else {
                L20: {
                  L21: {
                    ol.b(-114);
                    gk.a(false);
                    am.field_i = fl.field_c;
                    qh.field_d = false;
                    hc.a(am.field_g, lk.field_i, wf.field_e, uj.field_f, (byte) -88);
                    if (v.field_b) {
                      break L21;
                    } else {
                      if (null == ai.field_g) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if (v.field_b) {
                      stackOut_111_0 = 0;
                      stackIn_112_0 = stackOut_111_0;
                      break L22;
                    } else {
                      stackOut_110_0 = 1;
                      stackIn_112_0 = stackOut_110_0;
                      break L22;
                    }
                  }
                  L23: {
                    stackOut_112_0 = stackIn_112_0;
                    stackOut_112_1 = -1;
                    stackOut_112_2 = ai.field_g;
                    stackIn_114_0 = stackOut_112_0;
                    stackIn_114_1 = stackOut_112_1;
                    stackIn_114_2 = stackOut_112_2;
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    stackIn_113_2 = stackOut_112_2;
                    if (v.field_b) {
                      stackOut_114_0 = stackIn_114_0;
                      stackOut_114_1 = stackIn_114_1;
                      stackOut_114_2 = (String) (Object) stackIn_114_2;
                      stackOut_114_3 = 0;
                      stackIn_115_0 = stackOut_114_0;
                      stackIn_115_1 = stackOut_114_1;
                      stackIn_115_2 = stackOut_114_2;
                      stackIn_115_3 = stackOut_114_3;
                      break L23;
                    } else {
                      stackOut_113_0 = stackIn_113_0;
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = (String) (Object) stackIn_113_2;
                      stackOut_113_3 = 1;
                      stackIn_115_0 = stackOut_113_0;
                      stackIn_115_1 = stackOut_113_1;
                      stackIn_115_2 = stackOut_113_2;
                      stackIn_115_3 = stackOut_113_3;
                      break L23;
                    }
                  }
                  ai.a(stackIn_115_0 != 0, stackIn_115_1, stackIn_115_2, stackIn_115_3 != 0);
                  break L20;
                }
                L24: {
                  if (!wi.field_a) {
                    break L24;
                  } else {
                    qh.a(true);
                    break L24;
                  }
                }
                L25: {
                  if (pg.field_cb != null) {
                    break L25;
                  } else {
                    pg.field_cb = fk.d(75);
                    mj.field_L = qc.a(1);
                    break L25;
                  }
                }
                ab.a(am.field_g, true, mj.field_L, pg.field_cb);
                lk.field_i = null;
                wf.field_e = null;
                am.field_g = null;
                aa.a((java.applet.Applet) this, -106);
                rg.g(-33);
                rk.field_f = 10;
                break L19;
              }
            }
          } else {
            break L19;
          }
        }
        L26: {
          if (rk.field_f == 10) {
            L27: {
              if (bb.field_d != 0) {
                ld.field_G = wl.a(1, wd.field_d);
                break L27;
              } else {
                break L27;
              }
            }
            rk.field_f = 11;
            break L26;
          } else {
            break L26;
          }
        }
        L28: {
          L29: {
            if ((rk.field_f ^ -1) == -12) {
              L30: {
                if (ld.field_G == null) {
                  break L30;
                } else {
                  if (ld.field_G.a((byte) -36)) {
                    if (!ld.field_G.c((byte) -111)) {
                      rd.a((byte) -76, 0.0f, pi.a(kf.field_d, ld.field_G, rg.field_I, 1));
                      break L29;
                    } else {
                      break L30;
                    }
                  } else {
                    if (param1) {
                      break L28;
                    } else {
                      if (!tl.field_d) {
                        break L28;
                      } else {
                        nd.a(-26621, qd.field_j);
                        ((rb) this).c(31178);
                        nc.a(qd.field_j, (byte) 118);
                        break L28;
                      }
                    }
                  }
                }
              }
              rk.field_f = 12;
              qd.field_h = true;
              break L29;
            } else {
              break L29;
            }
          }
          if (-13 == (rk.field_f ^ -1)) {
            L31: {
              if (!qd.field_h) {
                rk.field_f = 13;
                break L31;
              } else {
                break L31;
              }
            }
            if (rk.field_f == 13) {
              L32: {
                var3 = 1;
                if (fa.field_n != null) {
                  L33: {
                    if (!fa.field_n.a(true)) {
                      stackOut_152_0 = 0;
                      stackIn_153_0 = stackOut_152_0;
                      break L33;
                    } else {
                      stackOut_151_0 = 1;
                      stackIn_153_0 = stackOut_151_0;
                      break L33;
                    }
                  }
                  var3 = stackIn_153_0;
                  rd.a((byte) -83, fa.field_n.field_a, fa.field_n.field_g);
                  break L32;
                } else {
                  break L32;
                }
              }
              if (var3 != 0) {
                rk.field_f = 20;
                if (param1) {
                  break L28;
                } else {
                  if (!tl.field_d) {
                    break L28;
                  } else {
                    nd.a(-26621, qd.field_j);
                    ((rb) this).c(31178);
                    nc.a(qd.field_j, (byte) 118);
                    break L28;
                  }
                }
              } else {
                if (param1) {
                  break L28;
                } else {
                  if (!tl.field_d) {
                    break L28;
                  } else {
                    nd.a(-26621, qd.field_j);
                    ((rb) this).c(31178);
                    nc.a(qd.field_j, (byte) 118);
                    break L28;
                  }
                }
              }
            } else {
              if (param1) {
                break L28;
              } else {
                if (!tl.field_d) {
                  break L28;
                } else {
                  nd.a(-26621, qd.field_j);
                  ((rb) this).c(31178);
                  nc.a(qd.field_j, (byte) 118);
                  break L28;
                }
              }
            }
          } else {
            if (!tl.field_d) {
              break L28;
            } else {
              nd.a(-26621, qd.field_j);
              ((rb) this).c(31178);
              nc.a(qd.field_j, (byte) 118);
              break L28;
            }
          }
        }
        L34: {
          if (wc.field_x[8]) {
            o.b(-10834);
            break L34;
          } else {
            break L34;
          }
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var3 = la.a(param2, (byte) 110);
        if (-1 == param0.indexOf(param2)) {
          if (0 != (param0.indexOf(var3) ^ -1)) {
            return true;
          } else {
            L0: {
              if (param1 < -24) {
                break L0;
              } else {
                ek[] discarded$9 = rb.g(19);
                break L0;
              }
            }
            L1: {
              L2: {
                if (param0.startsWith(param2)) {
                  break L2;
                } else {
                  if (param0.startsWith(var3)) {
                    break L2;
                  } else {
                    if (param0.endsWith(param2)) {
                      break L2;
                    } else {
                      if (!param0.endsWith(var3)) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L1;
            }
            return stackIn_12_0 != 0;
          }
        } else {
          return true;
        }
    }

    private final void b(boolean param0) {
        String var2 = wa.a(-1);
        be.a(hf.a((byte) -70), var2, (byte) 116);
        if (param0) {
            int discarded$0 = this.a(false, false, true);
        }
    }

    final static String j(int param0) {
        if (!(dj.field_a != o.field_l)) {
            return sb.field_a;
        }
        if (param0 != 5) {
            field_t = null;
        }
        if (!(al.field_f.a(true))) {
            return al.field_f.c(-112);
        }
        if (!(dj.field_a != el.field_E)) {
            return al.field_f.c(param0 + -122);
        }
        return va.field_a;
    }

    private final void a(int param0, int param1, String param2, int param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        try {
          if (!((rb) this).g((byte) 93)) {
            return;
          } else {
            L0: {
              L1: {
                ((rb) this).field_C = ((rb) this).getCodeBase().getHost();
                var6_ref = ((rb) this).field_C.toLowerCase();
                stackOut_3_0 = this;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L0;
                  } else {
                    stackOut_5_0 = this;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
            L2: {
              ((rb) this).field_x = stackIn_8_1 != 0;
              ((rb) this).field_A = Integer.parseInt(((rb) this).getParameter("gameport1"));
              ((rb) this).field_D = Integer.parseInt(((rb) this).getParameter("gameport2"));
              var7 = ((rb) this).getParameter("servernum");
              if (var7 == null) {
                break L2;
              } else {
                ((rb) this).field_z = Integer.parseInt(var7);
                break L2;
              }
            }
            ((rb) this).field_r = Integer.parseInt(((rb) this).getParameter("gamecrc"));
            if (param4 == -7) {
              L3: {
                ((rb) this).field_y = Long.parseLong(((rb) this).getParameter("instanceid"));
                ((rb) this).field_o = ((rb) this).getParameter("member").equals((Object) (Object) "yes");
                var8 = ((rb) this).getParameter("lang");
                if (var8 == null) {
                  break L3;
                } else {
                  ((rb) this).field_q = Integer.parseInt(var8);
                  break L3;
                }
              }
              L4: {
                if (((rb) this).field_q < 5) {
                  break L4;
                } else {
                  ((rb) this).field_q = 0;
                  break L4;
                }
              }
              L5: {
                var9 = ((rb) this).getParameter("affid");
                if (var9 != null) {
                  ((rb) this).field_v = Integer.parseInt(var9);
                  break L5;
                } else {
                  break L5;
                }
              }
              wi.field_a = Boolean.valueOf(((rb) this).getParameter("simplemode")).booleanValue();
              ((rb) this).a(32, param0, param1, ((rb) this).field_r, param4 + -111, param3, param2);
            } else {
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        qe.a(-105, (String) null, (Throwable) (Object) var6);
        ((rb) this).a(1, "crash");
    }

    final void h(int param0) {
        int var2 = 0;
        nj var3 = null;
        int var4 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var4 = stellarshard.field_B;
          var2 = ja.field_t;
          if (var2 >= 64) {
            break L0;
          } else {
            if (wc.field_x[var2]) {
              if (param0 == 6476) {
                if (-1 == (var2 ^ -1)) {
                  return;
                } else {
                  L1: {
                    if (1 == var2) {
                      pe.c(param0 + 18738);
                      break L1;
                    } else {
                      if ((var2 ^ -1) == -3) {
                        eh.a(-1);
                        break L1;
                      } else {
                        if (var2 != -4) {
                          if (var2 == 4) {
                            v.a((byte) -125);
                            break L1;
                          } else {
                            if (5 == var2) {
                              nf.a((byte) 84);
                              break L1;
                            } else {
                              if (-7 != var2) {
                                if (var2 != 7) {
                                  if (8 != var2) {
                                    if (var2 == -17) {
                                      ue.a((byte) -121);
                                      break L1;
                                    } else {
                                      L2: {
                                        if (-12 == var2) {
                                          break L2;
                                        } else {
                                          if ((var2 ^ -1) == -13) {
                                            break L2;
                                          } else {
                                            if (var2 == -14) {
                                              n.d((byte) 4);
                                              break L1;
                                            } else {
                                              if (var2 != 17) {
                                                if (-19 == var2) {
                                                  sl.a((byte) 51);
                                                  break L1;
                                                } else {
                                                  qe.a(-6, "MGS1: " + bh.b((byte) -98), (Throwable) null);
                                                  oj.c(-2290);
                                                  break L1;
                                                }
                                              } else {
                                                this.j((byte) 108);
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L3: {
                                        if (-13 != (var2 ^ -1)) {
                                          stackOut_31_0 = 0;
                                          stackIn_32_0 = stackOut_31_0;
                                          break L3;
                                        } else {
                                          stackOut_30_0 = 1;
                                          stackIn_32_0 = stackOut_30_0;
                                          break L3;
                                        }
                                      }
                                      var3 = ff.a(stackIn_32_0 != 0, (byte) 92);
                                      ok.a((byte) -54, var3);
                                      break L1;
                                    }
                                  } else {
                                    fb.a((ka) (Object) ae.field_N, ue.field_b, ic.field_d, 20);
                                    break L1;
                                  }
                                } else {
                                  this.b(false);
                                  break L1;
                                }
                              } else {
                                df.c(-88);
                                break L1;
                              }
                            }
                          }
                        } else {
                          jf.e(116);
                          break L1;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        qe.a(86, "MGS2: " + bh.b((byte) -118), (Throwable) null);
        oj.c(-2290);
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        this.a((byte) 127, false);
        if (param3) {
            this.i((byte) -110);
        }
        if (param4) {
            this.c(false);
        }
        if (!(!param0)) {
            this.e(5978);
        }
        if (!(!param2)) {
            this.h((byte) 28);
        }
        if (param1 >= -70) {
            this.i(-7);
        }
    }

    private final void h(byte param0) {
        if (param0 != 28) {
            return;
        }
        wc.field_x[5] = true;
    }

    final int f(int param0) {
        int var2 = this.l(param0 + 15981);
        if (-1 != (var2 ^ -1)) {
            // if_icmpne L150
        }
        if (wc.field_x[1]) {
            fa.a(2, param0 ^ 16064);
        }
        if (wc.field_x[2]) {
            vk.a((byte) -128, 3);
        }
        if (wc.field_x[3]) {
            se.a(4, -91);
        }
        if (!(!wc.field_x[4])) {
            ic.a(5, 55);
        }
        if (wc.field_x[5]) {
            h.a(-96, 6);
        }
        if (!(!wc.field_x[6])) {
            sl.a(7, (byte) -105);
        }
        if (wc.field_x[8]) {
            we.a((byte) 15);
        }
        if (param0 != -16028) {
            ((rb) this).field_o = false;
        }
        return var2;
    }

    private final int l(int param0) {
        if (!(!((rb) this).field_g)) {
            return -1;
        }
        if (!il.e(32525)) {
            return -1;
        }
        if (pc.field_m) {
            return -1;
        }
        int var2 = wj.a(wh.a((byte) 116), ((rb) this).field_v, ((rb) this).field_x, tc.c(-5), (byte) 71, true);
        if (!(-1 != var2)) {
            return -1;
        }
        if (param0 >= -36) {
            this.i((byte) 122);
        }
        if (0 != var2) {
            // if_icmpeq L94
        } else {
            if (11 == eg.field_d) {
                if (!(ei.field_F != 0)) {
                    db.a(-113);
                }
            }
            return var2;
        }
        if (!(pf.field_c)) {
            ((rb) this).a(1, "reconnect");
        }
        pk.a(4);
        wl.a(var2, -8440, ga.field_a);
        pc.field_m = true;
        vc.field_a = 15000L + ih.a((byte) -98);
        return var2;
    }

    protected rb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "achievements to collect";
    }
}
