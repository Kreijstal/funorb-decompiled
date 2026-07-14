/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eb extends wa {
    String field_u;
    private boolean field_t;
    private boolean field_r;
    static dp field_p;
    private int field_x;
    private boolean field_q;
    private long field_n;
    static int field_l;
    static bf field_w;
    static String field_m;
    private int field_s;
    private int field_z;
    static String[] field_y;
    private int field_A;
    private int field_v;
    private int field_o;

    private final void b(boolean param0, int param1) {
        uf.field_i[3] = true;
        uf.field_i[18] = true;
        if (param1 != 28427) {
            return;
        }
        uf.field_i[17] = true;
        uf.field_i[16] = true;
        uf.field_i[0] = true;
        uf.field_i[8] = param0;
        uf.field_i[7] = true;
    }

    private final void h(int param0) {
        uf.field_i[1] = true;
        if (param0 != 26528) {
            this.j(-94);
        }
    }

    final void l(int param0) {
        int var2 = 0;
        uf var3 = null;
        int var4 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          if (param0 < -116) {
            break L0;
          } else {
            ((eb) this).a(false, true, false, false, -110);
            break L0;
          }
        }
        L1: {
          var2 = bf.field_b;
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (!uf.field_i[var2]) {
              break L1;
            } else {
              if (-1 == var2) {
                return;
              } else {
                L2: {
                  if (var2 != 1) {
                    if (-3 != var2) {
                      if (3 != var2) {
                        if (4 != var2) {
                          if (var2 == 5) {
                            pk.a(-128);
                            break L2;
                          } else {
                            if (var2 != -7) {
                              if (-8 == var2) {
                                this.j(-8);
                                break L2;
                              } else {
                                if (var2 == -9) {
                                  ah.a((ng) (Object) kd.field_n, rk.field_b, -126, te.field_a);
                                  break L2;
                                } else {
                                  if (-17 == var2) {
                                    ld.g(-1266);
                                    break L2;
                                  } else {
                                    L3: {
                                      if (-12 == (var2 ^ -1)) {
                                        break L3;
                                      } else {
                                        if (var2 != 12) {
                                          if (13 != var2) {
                                            if (var2 == 17) {
                                              this.g(7808);
                                              break L2;
                                            } else {
                                              if (-19 == (var2 ^ -1)) {
                                                go.b(480);
                                                break L2;
                                              } else {
                                                wp.a((Throwable) null, "MGS1: " + ug.a(-1815), 21862);
                                                jj.a(4);
                                                break L2;
                                              }
                                            }
                                          } else {
                                            ap.a(false);
                                            break L2;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L4: {
                                      stackOut_24_0 = 16;
                                      stackIn_26_0 = stackOut_24_0;
                                      stackIn_25_0 = stackOut_24_0;
                                      if (var2 != 12) {
                                        stackOut_26_0 = stackIn_26_0;
                                        stackOut_26_1 = 0;
                                        stackIn_27_0 = stackOut_26_0;
                                        stackIn_27_1 = stackOut_26_1;
                                        break L4;
                                      } else {
                                        stackOut_25_0 = stackIn_25_0;
                                        stackOut_25_1 = 1;
                                        stackIn_27_0 = stackOut_25_0;
                                        stackIn_27_1 = stackOut_25_1;
                                        break L4;
                                      }
                                    }
                                    var3 = hl.a(stackIn_27_0, stackIn_27_1 != 0);
                                    c.a(-1, var3);
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              pe.a(-1);
                              break L2;
                            }
                          }
                        } else {
                          pf.e((byte) 52);
                          break L2;
                        }
                      } else {
                        le.a(15295);
                        break L2;
                      }
                    } else {
                      ma.e((byte) 109);
                      break L2;
                    }
                  } else {
                    ib.e(-16);
                    break L2;
                  }
                }
                return;
              }
            }
          }
        }
        wp.a((Throwable) null, "MGS2: " + ug.a(-1815), 21862);
        jj.a(4);
    }

    private final int a(boolean param0, byte param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            ng var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = CrazyCrystals.field_B;
                        var4 = uc.a(param2, (byte) 63, of.field_H, ul.field_g);
                        if (param1 == -94) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ((eb) this).field_x = 76;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (var4 == -1) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        throw new IllegalStateException();
                    }
                    case 5: {
                        if (-2 != var4) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        var5_int = qm.a(gh.h(26500), param1 + 194, rh.b(param1 + 459));
                        if (-1 == var5_int) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        f.a((byte) 125, gj.field_o, re.field_j, var5_int);
                        gj.field_o = null;
                        re.field_j = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = gg.a(-23387);
                        if (var11 != null) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        mj.a((byte) -34, var11.booleanValue());
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if ((var4 ^ -1) == -3) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var5_int = gg.a(bh.a((byte) 78), (byte) 126, ((eb) this).field_x, ac.c(70), bp.a(6), vg.b((byte) -29), hp.d(5));
                        if ((var5_int ^ -1) != 0) {
                            statePc = 15;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        r.a(-13405, gj.field_o, var5_int, re.field_j);
                        re.field_j = null;
                        gj.field_o = null;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (3 == var4) {
                            statePc = 18;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (-1 == ei.field_E) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (-1 != (ei.field_E ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        ei.field_E = -1;
                        cd.e((byte) -70);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (param0) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var5_int = jj.a(hp.d(param1 ^ -89), false, vg.b((byte) -29), ((eb) this).field_x, false, ((eb) this).field_t);
                        if (var5_int == -1) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (var5_int != 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        wi.field_h = go.field_h;
                        a.a((byte) 63);
                        gl.field_c = false;
                        hp.field_s = 10;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 26: {
                        rg.a(re.field_j, var5_int, -257);
                        re.field_j = null;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 27: {
                        an.field_r = false;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        if (4 != var4) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (!fj.field_d) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        kl.a((byte) -1, le.b((byte) -20));
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 31: {
                        gl.field_c = true;
                        hp.field_s = 10;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (var4 == 5) {
                            statePc = 34;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        ta.a(le.b((byte) -20), 19);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (var4 != 6) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if (!jd.field_z) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        hp.field_s = 10;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (-8 != (var4 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        gm.a(le.b((byte) -20), 2);
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if ((var4 ^ -1) == -9) {
                            statePc = 42;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        kl.a((byte) -1, le.b((byte) -20));
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (var4 == 9) {
                            statePc = 45;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        vn.a(le.b((byte) -20), (byte) 87);
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (10 != var4) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        tp.field_f.d(param1 + 102, 17);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if ((var4 ^ -1) != -12) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        qe.a(param1 ^ -94, le.b((byte) -20));
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if (12 == var4) {
                            statePc = 52;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        vo.a(31251, qn.a((byte) -114), le.b((byte) -20));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (-14 == (var4 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        try {
                            if (jl.field_e != null) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            jl.field_e = new ai(te.field_a, new java.net.URL(((eb) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (jl.field_e.b(0)) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var12 = jl.field_e.a((byte) -111);
                            if (var12 == null) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var7 = gd.a((byte) 11, var12.field_h, 0, var12.field_f);
                            ag.a(var7, 48);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var9 = null;
                            ag.a((String) null, 48);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            jl.field_e = null;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        var5 = (Exception) (Object) caughtException;
                        wp.a((Throwable) (Object) var5, "S1", param1 + 21956);
                        var10 = null;
                        ag.a((String) null, 48);
                        jl.field_e = null;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (-16 != (var4 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        hp.field_s = 10;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if ((var4 ^ -1) != -17) {
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
                        if (17 != var4) {
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

    public static void f(byte param0) {
        if (param0 < 3) {
            int discarded$0 = eb.a((byte) -108, 100);
        }
        field_w = null;
        field_y = null;
        field_m = null;
        field_p = null;
    }

    final void a(int param0, int param1, byte param2, boolean param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        ((eb) this).setBackground(java.awt.Color.black);
        ul.field_g = ((eb) this).field_o;
        th.a(ul.field_g, -127);
        qe.a((byte) -106, param3, ((eb) this).field_A, te.field_a, 5000, param7, 5000, ((eb) this).field_n, ((eb) this).field_v, ul.field_g, ((eb) this).field_u, ((eb) this).field_r, ((eb) this).field_z, ((eb) this).field_s);
        pb.a(((eb) this).field_A, te.field_a, param7, ((eb) this).field_s, 1843275042, ((eb) this).field_v, ((eb) this).field_u, ((eb) this).field_z, ul.field_g);
        o.b(-25281);
        ok.field_g = qm.d(1);
        mm.a(jd.field_D, true);
        sl.field_q = param1;
        tp.field_b = param5;
        kj.field_b = param6;
        oh.field_e = param0;
        ik.field_e = param4;
        this.b(false);
        qo.c((byte) 107);
        int var10 = -98 % ((-48 - param2) / 38);
    }

    private final void g(int param0) {
        if (param0 != 7808) {
            ((eb) this).field_n = -14L;
        }
        int var2 = kd.field_n.h(255);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        int var4 = -1 + rk.field_b;
        byte[] var5 = new byte[var4];
        kd.field_n.b(var4, 0, 29712, var5);
        ec.a(var3 != 0, fa.a((byte) -70, var5), le.b((byte) -20), (byte) -17);
    }

    private final void a(int param0, int param1, String param2, int param3, byte param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        Object var11 = null;
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
          if (!((eb) this).f(112)) {
            return;
          } else {
            L0: {
              L1: {
                ((eb) this).field_u = ((eb) this).getCodeBase().getHost();
                var6_ref = ((eb) this).field_u.toLowerCase();
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
              ((eb) this).field_t = stackIn_8_1 != 0;
              ((eb) this).field_A = Integer.parseInt(((eb) this).getParameter("gameport1"));
              ((eb) this).field_s = Integer.parseInt(((eb) this).getParameter("gameport2"));
              var7 = ((eb) this).getParameter("servernum");
              if (var7 != null) {
                ((eb) this).field_v = Integer.parseInt(var7);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((eb) this).field_z = Integer.parseInt(((eb) this).getParameter("gamecrc"));
              ((eb) this).field_n = Long.parseLong(((eb) this).getParameter("instanceid"));
              ((eb) this).field_r = ((eb) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((eb) this).getParameter("lang");
              if (var8 == null) {
                break L3;
              } else {
                ((eb) this).field_o = Integer.parseInt(var8);
                break L3;
              }
            }
            L4: {
              if ((((eb) this).field_o ^ -1) > -6) {
                break L4;
              } else {
                ((eb) this).field_o = 0;
                break L4;
              }
            }
            L5: {
              var9 = ((eb) this).getParameter("affid");
              var10 = 59 % ((param4 - -65) / 52);
              if (var9 == null) {
                break L5;
              } else {
                ((eb) this).field_x = Integer.parseInt(var9);
                break L5;
              }
            }
            ng.field_j = Boolean.valueOf(((eb) this).getParameter("simplemode")).booleanValue();
            ((eb) this).a((byte) 118, 32, param3, param2, ((eb) this).field_z, param1, param0);
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var11 = null;
        wp.a((Throwable) (Object) var6, (String) null, 21862);
        ((eb) this).a(0, "crash");
    }

    private final void b(boolean param0) {
        ai.field_c[16] = -1;
        ai.field_c[18] = 1;
        ai.field_c[5] = -1;
        ai.field_c[8] = -2;
        ai.field_c[11] = -1;
        ai.field_c[3] = -1;
        ai.field_c[13] = -1;
        ai.field_c[10] = -1;
        if (param0) {
            return;
        }
        ai.field_c[2] = -2;
        ai.field_c[17] = -1;
        ai.field_c[9] = -1;
        ai.field_c[12] = -1;
        ai.field_c[7] = -1;
        ai.field_c[1] = 16;
        ai.field_c[6] = -2;
        ai.field_c[4] = -1;
    }

    private final void c(boolean param0) {
        uf.field_i[2] = param0;
    }

    final int i(int param0) {
        int var2 = 0;
        if (!((eb) this).field_b) {
          if (gl.c(-11)) {
            if (an.field_r) {
              return -1;
            } else {
              var2 = jj.a(hp.d(5), false, vg.b((byte) -29), ((eb) this).field_x, true, ((eb) this).field_t);
              if (param0 != var2) {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (1 != var2) {
                      L1: {
                        if (ka.field_j) {
                          break L1;
                        } else {
                          ((eb) this).a(0, "reconnect");
                          break L1;
                        }
                      }
                      tn.e((byte) -127);
                      rg.a(re.field_j, var2, -257);
                      an.field_r = true;
                      ee.field_e = lo.a((byte) 88) - -15000L;
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if ((hp.field_s ^ -1) != -12) {
                    break L2;
                  } else {
                    if (ei.field_E == 0) {
                      a.a((byte) 63);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        if (param4 != -1) {
            ((eb) this).field_x = -85;
        }
        this.b(false, 28427);
        if (!(!param0)) {
            this.h(26528);
        }
        if (param2) {
            this.c(true);
        }
        if (param3) {
            this.d((byte) -84);
        }
        if (param1) {
            this.e((byte) 19);
        }
    }

    private final void d(byte param0) {
        uf.field_i[4] = true;
        if (param0 > -64) {
            this.h(-114);
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        Object var6 = null;
        java.awt.Container var7 = null;
        int stackIn_25_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_139_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_138_0 = 0;
        int stackOut_137_0 = 0;
        L0: {
          var5 = CrazyCrystals.field_B;
          if (ne.field_f != null) {
            L1: {
              if (ph.field_E != null) {
                break L1;
              } else {
                var7 = pi.d(0);
                var4 = var7.getSize();
                ne.field_f.a(var4.height, (byte) 56, var4.width);
                break L1;
              }
            }
            ne.field_f.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          ao.a((byte) -124);
          lm.a((byte) 64);
          if (aj.e((byte) -14)) {
            break L2;
          } else {
            if (-12 != (hp.field_s ^ -1)) {
              kd.d(3);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (ok.field_g != null) {
            of.field_H = ok.field_g.a(false);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (of.a(param1 + -15000)) {
            L5: {
              var3 = sm.d((byte) 24) * 1200;
              if (((eb) this).field_q) {
                break L5;
              } else {
                if (var3 >= mi.e((byte) 125)) {
                  break L4;
                } else {
                  if (var3 < al.a(false)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((eb) this).field_q = false;
            jj.a(4);
            tn.e((byte) -128);
            rg.a(hd.field_a, 2, -257);
            me.a(20);
            an.field_r = true;
            ee.field_e = 15000L + lo.a((byte) 107);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (-1 == ei.field_E) {
              break L7;
            } else {
              if (-1 == ei.field_E) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (0 != ei.field_E) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L8;
            } else {
              stackOut_23_0 = 1;
              stackIn_25_0 = stackOut_23_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_25_0;
            ei.field_E = sc.a((byte) -98);
            if (var3 == 0) {
              break L9;
            } else {
              if (ei.field_E == 0) {
                if (hp.field_s != 11) {
                  break L9;
                } else {
                  if (!gl.c(-11)) {
                    a.a((byte) 63);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (ei.field_E == -1) {
            break L6;
          } else {
            if (ei.field_E != 0) {
              ee.field_e = lo.a((byte) -65) - -15000L;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (-1 == ei.field_E) {
            break L10;
          } else {
            if (0 == ei.field_E) {
              break L10;
            } else {
              if (eq.field_j < 10) {
                if (ei.field_E == -4) {
                  ((eb) this).a(0, "js5crc");
                  break L10;
                } else {
                  if (-5 == ei.field_E) {
                    ((eb) this).a(param1 ^ 15000, "js5io");
                    break L10;
                  } else {
                    if (ei.field_E == 2) {
                      ((eb) this).a(param1 + -15000, "js5connect_full");
                      break L10;
                    } else {
                      if (ei.field_E != 5) {
                        ((eb) this).a(0, "js5connect");
                        break L10;
                      } else {
                        ((eb) this).a(0, "outofdate");
                        break L10;
                      }
                    }
                  }
                }
              } else {
                if ((hp.field_s ^ -1) > -11) {
                  break L10;
                } else {
                  L11: {
                    tn.e((byte) -127);
                    if (ei.field_E == -4) {
                      rg.a(gm.field_a, 256, -257);
                      break L11;
                    } else {
                      if (-5 != ei.field_E) {
                        if (ei.field_E != 2) {
                          if (ei.field_E == 5) {
                            rg.a(fm.field_o, 5, param1 + -15257);
                            break L11;
                          } else {
                            rg.a(ci.field_j, 256, -257);
                            break L11;
                          }
                        } else {
                          rg.a(ao.field_a, 256, -257);
                          break L11;
                        }
                      } else {
                        rg.a(cj.field_C, 256, param1 + -15257);
                        break L11;
                      }
                    }
                  }
                  an.field_r = true;
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (0 == (ei.field_E ^ -1)) {
                break L14;
              } else {
                if (ei.field_E != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!gl.c(-11)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (ee.field_e <= lo.a((byte) -86)) {
            an.field_r = false;
            if (ei.field_E == -1) {
              break L12;
            } else {
              if (ei.field_E != 0) {
                ei.field_E = -1;
                cd.e((byte) -60);
                break L12;
              } else {
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (ei.field_E != 0) {
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (eq.field_j != 0) {
            break L16;
          } else {
            if (!pk.a((byte) -56)) {
              break L16;
            } else {
              eq.field_j = 1;
              break L16;
            }
          }
        }
        L17: {
          if (eq.field_j != 1) {
            break L17;
          } else {
            L18: {
              if (-1 == (ul.field_g ^ -1)) {
                break L18;
              } else {
                be.field_e = mi.c(kj.field_b, -96);
                break L18;
              }
            }
            rb.field_k = de.a(false, true, tp.field_b, 1, param1 + -14988);
            ok.field_c = de.a(false, true, sl.field_q, 1, 12);
            dd.field_a = de.a(false, true, oh.field_e, 1, param1 + -14988);
            dj.field_ab = rb.field_k;
            eq.field_j = 2;
            lo.field_a = ok.field_c;
            break L17;
          }
        }
        L19: {
          if (eq.field_j == 2) {
            L20: {
              if (be.field_e == null) {
                break L20;
              } else {
                if (be.field_e.a((byte) 102)) {
                  if (!be.field_e.c("", -93)) {
                    be.field_e = null;
                    break L20;
                  } else {
                    if (!be.field_e.a(-20402, "")) {
                      break L20;
                    } else {
                      qb.a(be.field_e, param1 ^ -15041);
                      be.field_e = null;
                      vp.a(106);
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
            }
            if (null == be.field_e) {
              eq.field_j = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if ((eq.field_j ^ -1) == -4) {
            if (!ro.a(rb.field_k, ok.field_c, false, dd.field_a)) {
              break L21;
            } else {
              if (!jg.a(dd.field_a, -38)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    sg.a(param1 ^ 15099);
                    m.c(29537);
                    jd.field_z = false;
                    ta.field_i = vl.field_b;
                    pg.a((byte) -106, dd.field_a, fj.field_d, ok.field_c, rb.field_k);
                    if (uk.field_j) {
                      break L23;
                    } else {
                      if (tp.field_h != null) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    if (uk.field_j) {
                      stackOut_100_0 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      break L24;
                    } else {
                      stackOut_99_0 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_101_0 = stackIn_101_0;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_102_0 = stackOut_101_0;
                    if (uk.field_j) {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      break L25;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      break L25;
                    }
                  }
                  fa.a(stackIn_104_0 != 0, stackIn_104_1 != 0, tp.field_h, true);
                  break L22;
                }
                L26: {
                  if (ng.field_j) {
                    hf.a(4);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (am.field_e == null) {
                    am.field_e = ba.a(-29513);
                    tb.field_a = ep.c((byte) 112);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                am.a(am.field_e, 0, dd.field_a, tb.field_a);
                rb.field_k = null;
                dd.field_a = null;
                ok.field_c = null;
                rb.a((java.applet.Applet) this, (byte) 126);
                vp.a(param1 ^ 15078);
                eq.field_j = 10;
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (param1 == 15000) {
            break L28;
          } else {
            var6 = null;
            ((eb) this).a(58, (String) null, 3);
            break L28;
          }
        }
        L29: {
          if (eq.field_j == 10) {
            L30: {
              if (0 == ul.field_g) {
                break L30;
              } else {
                ak.field_f = mi.c(ik.field_e, param1 + -15113);
                break L30;
              }
            }
            eq.field_j = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if ((eq.field_j ^ -1) == -12) {
            L32: {
              if (null == ak.field_f) {
                break L32;
              } else {
                L33: {
                  if (!ak.field_f.a((byte) 102)) {
                    break L33;
                  } else {
                    if (!ak.field_f.a(false)) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                td.a(0.0f, fl.a(127, jg.field_h, ak.field_f, ge.field_a), false);
                break L31;
              }
            }
            eq.field_j = 12;
            hb.field_g = true;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if (eq.field_j != 12) {
            break L34;
          } else {
            if (!hb.field_g) {
              eq.field_j = 13;
              break L34;
            } else {
              break L34;
            }
          }
        }
        L35: {
          if ((eq.field_j ^ -1) == -14) {
            L36: {
              var3 = 1;
              if (ul.field_k == null) {
                break L36;
              } else {
                L37: {
                  if (!ul.field_k.a(param1 ^ 15000)) {
                    stackOut_138_0 = 0;
                    stackIn_139_0 = stackOut_138_0;
                    break L37;
                  } else {
                    stackOut_137_0 = 1;
                    stackIn_139_0 = stackOut_137_0;
                    break L37;
                  }
                }
                var3 = stackIn_139_0;
                td.a(ul.field_k.field_b, ul.field_k.field_l, false);
                break L36;
              }
            }
            if (var3 != 0) {
              eq.field_j = 20;
              if (param0) {
                break L35;
              } else {
                if (!em.field_f) {
                  break L35;
                } else {
                  fq.a(-101, jd.field_D);
                  ((eb) this).b(-109);
                  mm.a(jd.field_D, true);
                  break L35;
                }
              }
            } else {
              if (!em.field_f) {
                break L35;
              } else {
                fq.a(-101, jd.field_D);
                ((eb) this).b(-109);
                mm.a(jd.field_D, true);
                break L35;
              }
            }
          } else {
            if (param0) {
              break L35;
            } else {
              if (!em.field_f) {
                break L35;
              } else {
                fq.a(-101, jd.field_D);
                ((eb) this).b(-109);
                mm.a(jd.field_D, true);
                break L35;
              }
            }
          }
        }
        L38: {
          if (!uf.field_i[8]) {
            break L38;
          } else {
            rl.d(0);
            break L38;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        if (param0 != -113) {
            int discarded$0 = eb.a((byte) 10, -72);
        }
        if ((param1 & 7) != 0) {
            var2 = 8 + -(param1 & 7);
        }
        int var3 = param1 + var2;
        return var3;
    }

    final void a(int param0, String param1, int param2) {
        this.a(640, 480, param1, param2, (byte) -121);
        if (param0 != -1) {
            field_w = null;
        }
    }

    final void k(int param0) {
        int var3 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        L0: {
          var3 = CrazyCrystals.field_B;
          if (!kf.b(param0 ^ 6572)) {
            if ((eq.field_j ^ -1) <= -11) {
              if (!ji.f(250)) {
                vg.a((byte) -82);
                break L0;
              } else {
                if (hp.field_s != 0) {
                  pi.a(of.field_H, -109);
                  break L0;
                } else {
                  int discarded$363 = this.a(false, (byte) -94, false);
                  break L0;
                }
              }
            } else {
              break L0;
            }
          } else {
            L1: {
              stackOut_1_0 = this;
              stackOut_1_1 = 0;
              stackOut_1_2 = -94;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (ph.field_E == null) {
                stackOut_3_0 = this;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                break L1;
              }
            }
            int discarded$364 = this.a(stackIn_4_1 != 0, (byte) stackIn_4_2, stackIn_4_3 != 0);
            break L0;
          }
        }
        L2: {
          if (param0 == 6579) {
            break L2;
          } else {
            ((eb) this).field_A = 59;
            break L2;
          }
        }
    }

    private final void j(int param0) {
        String var2 = hn.b(false);
        if (param0 != -8) {
            field_m = null;
        }
        d.a(le.b((byte) -20), (byte) 125, var2);
    }

    final int a(int param0, boolean param1) {
        if (param0 <= 32) {
            ((eb) this).field_n = 3L;
        }
        return this.a(true, (byte) -94, param1);
    }

    protected eb() {
    }

    private final void e(byte param0) {
        if (param0 != 19) {
            ((eb) this).a(95, -14, (byte) -45, true, -26, 9, 15, 104);
        }
        uf.field_i[5] = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new bf();
        field_y = new String[16];
        field_m = "Laser Hub";
    }
}
