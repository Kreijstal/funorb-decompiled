/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class oh extends md {
    private long field_l;
    private boolean field_v;
    private int field_t;
    private int field_u;
    private int field_q;
    static String field_r;
    private boolean field_w;
    static hj field_m;
    static int[] field_s;
    private int field_y;
    private int field_p;
    private int field_x;
    private boolean field_o;
    String field_n;

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a(98, false);
        if (param1) {
            this.n(param4 + -657);
        }
        if (!(!param3)) {
            this.a(true);
        }
        if (param4 != 640) {
            ((oh) this).field_u = -90;
        }
        if (!(!param0)) {
            this.h(-6);
        }
        if (!(!param2)) {
            this.i(param4 ^ 645);
        }
    }

    private final void k(int param0) {
        ae.field_e[3] = -1;
        ae.field_e[11] = -1;
        ae.field_e[7] = -1;
        ae.field_e[18] = 1;
        ae.field_e[10] = -1;
        ae.field_e[17] = -1;
        ae.field_e[13] = -1;
        ae.field_e[8] = -2;
        ae.field_e[2] = -2;
        ae.field_e[1] = 16;
        ae.field_e[4] = -1;
        ae.field_e[12] = -1;
        ae.field_e[9] = -1;
        ae.field_e[16] = -1;
        ae.field_e[5] = -1;
        if (param0 != 29385) {
            Object var3 = null;
            ((oh) this).a(-53, 124, (String) null);
        }
        ae.field_e[6] = -2;
    }

    private final void a(boolean param0) {
        eb.field_j[2] = param0;
    }

    private final void i(int param0) {
        eb.field_j[param0] = true;
    }

    final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((oh) this).setBackground(java.awt.Color.black);
        if (param4 != 63) {
            field_m = null;
        }
        v.field_C = ((oh) this).field_u;
        ab.a(v.field_C, (byte) 89);
        v.a(((oh) this).field_t, ((oh) this).field_v, 5000, 5000, ((oh) this).field_y, ((oh) this).field_x, wi.field_b, param1, ((oh) this).field_l, ((oh) this).field_n, v.field_C, param0, true, ((oh) this).field_p);
        j.a(((oh) this).field_t, 24, v.field_C, wi.field_b, ((oh) this).field_x, ((oh) this).field_n, param0, ((oh) this).field_y, ((oh) this).field_p);
        ha.a(false);
        lb.field_u = HoldTheLine.f((byte) -87);
        am.a(kd.field_b, 114);
        en.field_a = param6;
        wd.field_n = param2;
        wa.field_k = param7;
        qb.field_i = param5;
        ig.field_v = param3;
        this.k(29385);
        fj.f(0);
    }

    private final void h(int param0) {
        eb.field_j[4] = true;
        if (param0 != -6) {
            ((oh) this).field_l = 25L;
        }
    }

    final void j(int param0) {
        int var2 = 0;
        ij var3 = null;
        int var4 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var4 = HoldTheLine.field_D;
        if (param0 == -6) {
          L0: {
            var2 = vn.field_c;
            if (var2 >= 64) {
              break L0;
            } else {
              if (eb.field_j[var2]) {
                if (0 == var2) {
                  return;
                } else {
                  L1: {
                    if ((var2 ^ -1) == -2) {
                      pa.a((byte) 79);
                      break L1;
                    } else {
                      if ((var2 ^ -1) == -3) {
                        wj.b((byte) 68);
                        break L1;
                      } else {
                        if (3 == var2) {
                          ci.b((byte) -128);
                          break L1;
                        } else {
                          if (4 == var2) {
                            q.c((byte) -24);
                            break L1;
                          } else {
                            if ((var2 ^ -1) == -6) {
                              hm.b(param0 ^ -56);
                              break L1;
                            } else {
                              if (var2 == -7) {
                                nn.b((byte) -126);
                                break L1;
                              } else {
                                if (var2 == -8) {
                                  this.e((byte) -15);
                                  break L1;
                                } else {
                                  if (-9 == var2) {
                                    tn.a((byte) -107, wi.field_b, (th) (Object) rd.field_e, ad.field_c);
                                    break L1;
                                  } else {
                                    if (-17 == var2) {
                                      hb.a((byte) 3);
                                      break L1;
                                    } else {
                                      L2: {
                                        if (var2 == 11) {
                                          break L2;
                                        } else {
                                          if (12 != var2) {
                                            if ((var2 ^ -1) == -14) {
                                              b.a(param0 + 16);
                                              break L1;
                                            } else {
                                              if (var2 != 17) {
                                                if (var2 == 18) {
                                                  ng.a(param0 ^ 41);
                                                  break L1;
                                                } else {
                                                  bl.a((Throwable) null, (byte) -119, "MGS1: " + em.b(false));
                                                  r.a(-28036);
                                                  break L1;
                                                }
                                              } else {
                                                this.o(-1);
                                                break L1;
                                              }
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                      L3: {
                                        if (-13 != (var2 ^ -1)) {
                                          stackOut_21_0 = 0;
                                          stackIn_22_0 = stackOut_21_0;
                                          break L3;
                                        } else {
                                          stackOut_20_0 = 1;
                                          stackIn_22_0 = stackOut_20_0;
                                          break L3;
                                        }
                                      }
                                      var3 = wa.a(stackIn_22_0 != 0, false);
                                      mf.a(var3, false);
                                      break L1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          bl.a((Throwable) null, (byte) 70, "MGS2: " + em.b(false));
          r.a(-28036);
          return;
        } else {
          return;
        }
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
            th var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = HoldTheLine.field_D;
                        var4 = aa.a(param1, vg.field_T, 1, v.field_C);
                        if (-1 == (var4 ^ -1)) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        throw new IllegalStateException();
                    }
                    case 3: {
                        if (var4 != 1) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5_int = sd.a((byte) -124, gi.i(-80), dk.a(8790));
                        if (0 != (var5_int ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        nj.a(256, var5_int, wn.field_h, um.field_b);
                        wn.field_h = null;
                        um.field_b = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = pd.b((byte) -29);
                        if (var11 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        mc.a(0, var11.booleanValue());
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (-3 != (var4 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var5_int = uf.a(oi.a((byte) 31), ob.d((byte) -116), (byte) 80, ck.a((byte) -27), ((oh) this).field_q, tn.d(0), ef.c(4));
                        if (0 == var5_int) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        si.a(um.field_b, wn.field_h, -98, var5_int);
                        wn.field_h = null;
                        um.field_b = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (-4 == var4) {
                            statePc = 14;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (0 == (ao.field_a ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (ao.field_a == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        ao.field_a = -1;
                        ti.k(-87);
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (!param0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        pj.field_n = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 19: {
                        var5_int = v.a(((oh) this).field_w, 1, tn.d(0), ef.c(4), false, ((oh) this).field_q);
                        if (0 != (var5_int ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (0 != var5_int) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        ul.field_e = vd.field_a;
                        de.g((byte) 121);
                        bk.field_w = 10;
                        mn.field_a = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        mk.a(var5_int, um.field_b, -2698);
                        um.field_b = null;
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
                        if (hc.field_b) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        mn.field_a = true;
                        bk.field_w = 10;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        co.a(en.a(126), 237);
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (var4 == -6) {
                            statePc = 31;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        kd.a(en.a(116), true);
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (-7 != var4) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        if (bn.field_j) {
                            statePc = 35;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        bk.field_w = 10;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (7 != var4) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        oa.a(true, en.a(92));
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (var4 == 8) {
                            statePc = 40;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        co.a(en.a(120), 237);
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (var4 == 9) {
                            statePc = 43;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        v.a(en.a(93), 102);
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if ((var4 ^ -1) != -11) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        da.field_p.c((byte) 33, 17);
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (var4 != 11) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        ae.a(-16666, en.a(106));
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (param2) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        return -101;
                    }
                    case 50: {
                        if ((var4 ^ -1) != -13) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        sh.a((byte) -68, en.a(116), wd.j(-14));
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if ((var4 ^ -1) == -14) {
                            statePc = 54;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        try {
                            if (va.field_a != null) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            va.field_a = new dl(wi.field_b, new java.net.URL(((oh) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (!va.field_a.a((byte) 90)) {
                                statePc = 63;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var12 = va.field_a.b((byte) 85);
                            if (var12 != null) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var9 = null;
                            t.a((String) null, (byte) -64);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var7 = sm.a(var12.field_l, 0, -129, var12.field_i);
                            t.a(var7, (byte) -55);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            va.field_a = null;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        var5 = (Exception) (Object) caughtException;
                        bl.a((Throwable) (Object) var5, (byte) 87, "S1");
                        var10 = null;
                        t.a((String) null, (byte) -87);
                        va.field_a = null;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if (var4 != 15) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        bk.field_w = 10;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (16 != var4) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        return 1;
                    }
                    case 67: {
                        if (-18 == (var4 ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        return 0;
                    }
                    case 69: {
                        return 2;
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

    private final void a(String param0, int param1, int param2, int param3, int param4) {
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
          if (((oh) this).e(-11)) {
            L0: {
              L1: {
                ((oh) this).field_n = ((oh) this).getCodeBase().getHost();
                var6_ref = ((oh) this).field_n.toLowerCase();
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
              ((oh) this).field_w = stackIn_7_1 != 0;
              ((oh) this).field_x = Integer.parseInt(((oh) this).getParameter("gameport1"));
              ((oh) this).field_y = Integer.parseInt(((oh) this).getParameter("gameport2"));
              var7 = ((oh) this).getParameter("servernum");
              if (var7 == null) {
                break L2;
              } else {
                ((oh) this).field_p = Integer.parseInt(var7);
                break L2;
              }
            }
            L3: {
              ((oh) this).field_t = Integer.parseInt(((oh) this).getParameter("gamecrc"));
              ((oh) this).field_l = Long.parseLong(((oh) this).getParameter("instanceid"));
              if (param2 >= 125) {
                break L3;
              } else {
                int discarded$1 = this.a(false, true, false);
                break L3;
              }
            }
            L4: {
              ((oh) this).field_v = ((oh) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((oh) this).getParameter("lang");
              if (var8 != null) {
                ((oh) this).field_u = Integer.parseInt(var8);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((((oh) this).field_u ^ -1) <= -6) {
                ((oh) this).field_u = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var9 = ((oh) this).getParameter("affid");
              if (var9 != null) {
                ((oh) this).field_q = Integer.parseInt(var9);
                break L6;
              } else {
                break L6;
              }
            }
            vb.field_b = Boolean.valueOf(((oh) this).getParameter("simplemode")).booleanValue();
            ((oh) this).a(param0, param1, param4, param3, (byte) -101, ((oh) this).field_t, 32);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        bl.a((Throwable) (Object) var6, (byte) 113, (String) null);
        ((oh) this).a("crash", 221);
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        String stackIn_100_2 = null;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        String stackIn_101_2 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        String stackIn_102_2 = null;
        int stackIn_102_3 = 0;
        int stackIn_133_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        String stackOut_99_2 = null;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        String stackOut_101_2 = null;
        int stackOut_101_3 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        String stackOut_100_2 = null;
        int stackOut_100_3 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        L0: {
          var5 = HoldTheLine.field_D;
          if (hh.field_c != null) {
            L1: {
              if (null != cc.field_w) {
                break L1;
              } else {
                var6 = tf.e(param0 ^ 1051);
                var4 = var6.getSize();
                hh.field_c.a(var4.width, var4.height, (byte) -117);
                break L1;
              }
            }
            hh.field_c.b((byte) -9);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          ea.a(false);
          cg.a(1983);
          if (nn.a((byte) -128)) {
            break L2;
          } else {
            if (bk.field_w == 11) {
              break L2;
            } else {
              ln.a(param0 ^ 1142);
              break L2;
            }
          }
        }
        L3: {
          if (null == lb.field_u) {
            break L3;
          } else {
            vg.field_T = lb.field_u.a((byte) 119);
            break L3;
          }
        }
        L4: {
          if (gd.e((byte) 15)) {
            L5: {
              var3 = nc.a(855) * 1200;
              if (((oh) this).field_o) {
                break L5;
              } else {
                if (co.a(0) <= var3) {
                  break L4;
                } else {
                  if (dg.b((byte) 65) > var3) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((oh) this).field_o = false;
            r.a(param0 + -29087);
            kh.b(false);
            mk.a(2, qn.field_n, -2698);
            jh.b(param0 ^ 1127);
            pj.field_n = true;
            bn.field_k = bb.b(-1) - -15000L;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (0 == (ao.field_a ^ -1)) {
              break L7;
            } else {
              if (ao.field_a == 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (ao.field_a != 0) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L8;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L8;
            }
          }
          var3 = stackIn_23_0;
          ao.field_a = wc.e(-17204);
          if (var3 == 0) {
            if (ao.field_a == -1) {
              break L6;
            } else {
              if (-1 == ao.field_a) {
                break L6;
              } else {
                bn.field_k = bb.b(-1) - -15000L;
                break L6;
              }
            }
          } else {
            if (ao.field_a == -1) {
              break L6;
            } else {
              if (-1 == ao.field_a) {
                break L6;
              } else {
                bn.field_k = bb.b(-1) - -15000L;
                break L6;
              }
            }
          }
        }
        L9: {
          if ((ao.field_a ^ -1) == 0) {
            break L9;
          } else {
            if (ao.field_a != 0) {
              if (10 > pf.field_d) {
                if (-4 != ao.field_a) {
                  if (-5 == ao.field_a) {
                    ((oh) this).a("js5io", 221);
                    break L9;
                  } else {
                    if (2 != ao.field_a) {
                      if (-6 == (ao.field_a ^ -1)) {
                        ((oh) this).a("outofdate", 221);
                        break L9;
                      } else {
                        ((oh) this).a("js5connect", 221);
                        break L9;
                      }
                    } else {
                      ((oh) this).a("js5connect_full", 221);
                      break L9;
                    }
                  }
                } else {
                  ((oh) this).a("js5crc", param0 + -830);
                  break L9;
                }
              } else {
                if ((bk.field_w ^ -1) > -11) {
                  break L9;
                } else {
                  L10: {
                    kh.b(false);
                    if (3 != ao.field_a) {
                      if (4 != ao.field_a) {
                        if (ao.field_a == 2) {
                          mk.a(256, wb.field_f, param0 + -3749);
                          break L10;
                        } else {
                          if (ao.field_a == 5) {
                            mk.a(5, ef.field_e, -2698);
                            break L10;
                          } else {
                            mk.a(256, vm.field_ub, -2698);
                            break L10;
                          }
                        }
                      } else {
                        mk.a(256, ll.field_b, -2698);
                        break L10;
                      }
                    } else {
                      mk.a(256, t.field_k, -2698);
                      break L10;
                    }
                  }
                  pj.field_n = true;
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
              if (0 == ao.field_a) {
                break L13;
              } else {
                if (ao.field_a != 0) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (!oa.b((byte) 103)) {
              break L11;
            } else {
              break L12;
            }
          }
          if (bb.b(-1) < bn.field_k) {
            break L11;
          } else {
            pj.field_n = false;
            if (0 == ao.field_a) {
              break L11;
            } else {
              if (ao.field_a == 0) {
                break L11;
              } else {
                ao.field_a = -1;
                ti.k(-112);
                break L11;
              }
            }
          }
        }
        L14: {
          if (-1 != ao.field_a) {
            break L14;
          } else {
            if (!oa.b((byte) 103)) {
              de.field_K = false;
              break L14;
            } else {
              break L14;
            }
          }
        }
        L15: {
          if (-1 != pf.field_d) {
            break L15;
          } else {
            if (ol.b((byte) 38)) {
              pf.field_d = 1;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (-2 != (pf.field_d ^ -1)) {
            break L16;
          } else {
            L17: {
              if (v.field_C == 0) {
                break L17;
              } else {
                ml.field_a = bi.a(param0 ^ 1134, wa.field_k);
                break L17;
              }
            }
            ah.field_d = nm.a(true, ig.field_v, -115, false, 1);
            am.field_d = nm.a(true, wd.field_n, -84, false, 1);
            ca.field_p = nm.a(true, en.field_a, -94, false, 1);
            g.field_p = am.field_d;
            pf.field_d = 2;
            si.field_lb = ah.field_d;
            break L16;
          }
        }
        L18: {
          if (-3 == (pf.field_d ^ -1)) {
            L19: {
              if (null != ml.field_a) {
                if (!ml.field_a.b((byte) -115)) {
                  break L19;
                } else {
                  if (!ml.field_a.a("", true)) {
                    ml.field_a = null;
                    break L19;
                  } else {
                    if (ml.field_a.b("", param0 + -1135)) {
                      wg.a(1, ml.field_a);
                      ml.field_a = null;
                      qd.d(42);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              } else {
                break L19;
              }
            }
            if (ml.field_a != null) {
              break L18;
            } else {
              pf.field_d = 3;
              break L18;
            }
          } else {
            break L18;
          }
        }
        L20: {
          if (pf.field_d == 3) {
            if (!ej.a(ah.field_d, am.field_d, param0 ^ 1125, ca.field_p)) {
              break L20;
            } else {
              if (td.a((byte) -83, ca.field_p)) {
                L21: {
                  L22: {
                    ic.b((byte) 10);
                    ml.c(param0 + 25668);
                    bn.field_j = false;
                    aa.field_m = ug.field_f;
                    cj.a(am.field_d, ca.field_p, ah.field_d, param0 + -946, hc.field_b);
                    if (cb.field_i) {
                      break L22;
                    } else {
                      if (kh.field_i == null) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (cb.field_i) {
                      stackOut_98_0 = 0;
                      stackIn_99_0 = stackOut_98_0;
                      break L23;
                    } else {
                      stackOut_97_0 = 1;
                      stackIn_99_0 = stackOut_97_0;
                      break L23;
                    }
                  }
                  L24: {
                    stackOut_99_0 = stackIn_99_0;
                    stackOut_99_1 = 85;
                    stackOut_99_2 = kh.field_i;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_101_1 = stackOut_99_1;
                    stackIn_101_2 = stackOut_99_2;
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    stackIn_100_2 = stackOut_99_2;
                    if (cb.field_i) {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = stackIn_101_1;
                      stackOut_101_2 = (String) (Object) stackIn_101_2;
                      stackOut_101_3 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      stackIn_102_1 = stackOut_101_1;
                      stackIn_102_2 = stackOut_101_2;
                      stackIn_102_3 = stackOut_101_3;
                      break L24;
                    } else {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = stackIn_100_1;
                      stackOut_100_2 = (String) (Object) stackIn_100_2;
                      stackOut_100_3 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      stackIn_102_2 = stackOut_100_2;
                      stackIn_102_3 = stackOut_100_3;
                      break L24;
                    }
                  }
                  pg.a(stackIn_102_0 != 0, (byte) stackIn_102_1, stackIn_102_2, stackIn_102_3 != 0);
                  break L21;
                }
                L25: {
                  if (vb.field_b) {
                    rl.h(0);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (null != ao.field_f) {
                    break L26;
                  } else {
                    ao.field_f = qh.a(124);
                    ek.field_l = dc.m(param0 + 28624);
                    break L26;
                  }
                }
                fi.a(ek.field_l, ca.field_p, param0 ^ 1051, ao.field_f);
                am.field_d = null;
                ah.field_d = null;
                ca.field_p = null;
                jd.a((java.applet.Applet) this, (byte) 92);
                qd.d(71);
                pf.field_d = 10;
                break L20;
              } else {
                break L20;
              }
            }
          } else {
            break L20;
          }
        }
        L27: {
          if (10 != pf.field_d) {
            break L27;
          } else {
            L28: {
              if (v.field_C == 0) {
                break L28;
              } else {
                md.field_i = bi.a(-110, qb.field_i);
                break L28;
              }
            }
            pf.field_d = 11;
            break L27;
          }
        }
        L29: {
          if (pf.field_d == 11) {
            L30: {
              if (null == md.field_i) {
                break L30;
              } else {
                L31: {
                  if (!md.field_i.b((byte) -76)) {
                    break L31;
                  } else {
                    if (md.field_i.a((byte) -60)) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                jj.a(85, uj.a(-115, md.field_i, pb.field_d, rg.field_f), 0.0f);
                break L29;
              }
            }
            nk.field_R = true;
            pf.field_d = 12;
            break L29;
          } else {
            break L29;
          }
        }
        L32: {
          if (param0 == 1051) {
            break L32;
          } else {
            ((oh) this).field_y = 95;
            break L32;
          }
        }
        L33: {
          if (12 != pf.field_d) {
            break L33;
          } else {
            if (!nk.field_R) {
              pf.field_d = 13;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L34: {
          if ((pf.field_d ^ -1) == -14) {
            L35: {
              var3 = 1;
              if (ri.field_e == null) {
                break L35;
              } else {
                L36: {
                  if (!ri.field_e.a(-1)) {
                    stackOut_132_0 = 0;
                    stackIn_133_0 = stackOut_132_0;
                    break L36;
                  } else {
                    stackOut_131_0 = 1;
                    stackIn_133_0 = stackOut_131_0;
                    break L36;
                  }
                }
                var3 = stackIn_133_0;
                jj.a(116, ri.field_e.field_b, ri.field_e.field_j);
                break L35;
              }
            }
            if (var3 == 0) {
              break L34;
            } else {
              pf.field_d = 20;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param1) {
            break L37;
          } else {
            if (!ud.field_n) {
              break L37;
            } else {
              om.a(param0 + -47393, kd.field_b);
              ((oh) this).c((byte) 91);
              am.a(kd.field_b, 114);
              break L37;
            }
          }
        }
        L38: {
          if (!eb.field_j[8]) {
            break L38;
          } else {
            eb.b(-74);
            break L38;
          }
        }
    }

    private final void a(int param0, boolean param1) {
        if (param0 <= 96) {
            ((oh) this).field_o = true;
        }
        eb.field_j[0] = true;
        eb.field_j[17] = true;
        eb.field_j[16] = true;
        eb.field_j[18] = true;
        eb.field_j[3] = true;
        eb.field_j[8] = param1;
        eb.field_j[7] = true;
    }

    public static void m(int param0) {
        if (param0 != 8) {
            oh.m(46);
        }
        field_r = null;
        field_s = null;
        field_m = null;
    }

    final int d(byte param0) {
        int var2 = 0;
        if (!((oh) this).field_b) {
          if (oa.b((byte) 103)) {
            if (!pj.field_n) {
              var2 = v.a(((oh) this).field_w, 1, tn.d(0), ef.c(4), true, ((oh) this).field_q);
              if (var2 != -1) {
                L0: {
                  if (0 == var2) {
                    break L0;
                  } else {
                    if (-2 != (var2 ^ -1)) {
                      L1: {
                        if (!go.field_n) {
                          ((oh) this).a("reconnect", param0 + 132);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      kh.b(false);
                      mk.a(var2, um.field_b, -2698);
                      pj.field_n = true;
                      bn.field_k = 15000L + bb.b(-1);
                      if (param0 != 89) {
                        return 54;
                      } else {
                        return var2;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (11 != bk.field_w) {
                    break L2;
                  } else {
                    if (ao.field_a != 0) {
                      break L2;
                    } else {
                      de.g((byte) 78);
                      break L2;
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
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final static int a(el param0, int param1, int param2) {
        if (param2 <= 76) {
            field_s = null;
        }
        return param0.field_j * param1 / 1000;
    }

    final static void a(boolean param0, boolean param1) {
        io.field_b = 0;
        hk.field_e = bg.field_g;
        va.field_e = 0;
        dl.field_i = 0;
        ln.field_k = new jn(2);
        if (!param1) {
            field_s = null;
        }
        ln.field_k.a(wa.a(125, rf.field_X, nc.field_g), 0, param0, -1);
    }

    private final void n(int param0) {
        if (param0 != -17) {
            ((oh) this).field_l = 71L;
        }
        eb.field_j[1] = true;
    }

    final void l(int param0) {
        int var3 = HoldTheLine.field_D;
        if (jn.a((byte) -30)) {
            int discarded$1 = this.a(false, null != cc.field_w ? true : false, true);
        } else {
            if (pf.field_d >= 10) {
                if (!ge.a(true)) {
                    co.c(0);
                } else {
                    if (0 != bk.field_w) {
                        qb.a(vg.field_T, (byte) -97);
                    } else {
                        int discarded$2 = this.a(false, false, true);
                    }
                }
            }
        }
        if (param0 != 0) {
            this.a(false);
        }
    }

    final void a(int param0, int param1, String param2) {
        this.a(param2, 640, 127, 480, param0);
        if (param1 != 6165) {
            oh.a(true, false);
        }
    }

    final int c(int param0, boolean param1) {
        if (param0 != -1) {
            ((oh) this).field_o = false;
        }
        return this.a(true, param1, true);
    }

    private final void e(byte param0) {
        String var2 = vd.a(-1);
        if (param0 != -15) {
            oh.a(false, false);
        }
        mn.a(var2, en.a(104), -1);
    }

    final static nl[] a(ib param0, byte param1) {
        int[] var3 = null;
        nl[] var4 = null;
        int var5 = 0;
        nl var6 = null;
        int var7 = 0;
        af var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var7 = HoldTheLine.field_D;
        if (param0.a(true)) {
          var8 = param0.a(2);
          L0: while (true) {
            if (0 != var8.field_d) {
              if (-3 == (var8.field_d ^ -1)) {
                return new nl[]{};
              } else {
                L1: {
                  var12 = (int[]) var8.field_b;
                  var11 = var12;
                  var10 = var11;
                  var9 = var10;
                  var3 = var9;
                  var4 = new nl[var12.length >> -1270309854];
                  if (param1 > 108) {
                    break L1;
                  } else {
                    field_s = null;
                    break L1;
                  }
                }
                var5 = 0;
                L2: while (true) {
                  if (var4.length <= var5) {
                    return var4;
                  } else {
                    var6 = new nl();
                    var4[var5] = var6;
                    var6.field_b = var3[var5 << -673655166];
                    var6.field_a = var3[(var5 << -1227798206) + 1];
                    var6.field_g = var3[2 + (var5 << 186451170)];
                    var6.field_d = var3[(var5 << 2072249506) - -3];
                    var5++;
                    continue L2;
                  }
                }
              }
            } else {
              qe.a(10L, (byte) 45);
              continue L0;
            }
          }
        } else {
          return new nl[]{};
        }
    }

    private final void o(int param0) {
        int var2 = rd.field_e.f((byte) -97);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        int var4 = param0 + ad.field_c;
        byte[] var5 = new byte[var4];
        rd.field_e.a(var5, var4, 0, true);
        ba.a(-7235, rk.a((byte) 80, var5), var3 != 0, en.a(109));
    }

    protected oh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Waiting for sound effects";
    }
}
