/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug extends jna {
    private long field_w;
    private boolean field_A;
    private boolean field_y;
    private boolean field_q;
    private int field_s;
    String field_x;
    private int field_z;
    private int field_t;
    private static String[] field_r;
    private int field_u;
    private int field_p;
    private int field_v;

    final int t(int param0) {
        int var2 = 0;
        if (param0 != 8) {
          return 102;
        } else {
          L0: {
            L1: {
              var2 = this.e((byte) -46);
              if (-1 == (var2 ^ -1)) {
                break L1;
              } else {
                if ((var2 ^ -1) == -2) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              if (hd.field_a[1]) {
                ql.a(2, -28521);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (hd.field_a[2]) {
                ki.b(false, 3);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (hd.field_a[3]) {
                ua.b(4, 2);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!hd.field_a[4]) {
                break L5;
              } else {
                qda.a(5, -21);
                break L5;
              }
            }
            L6: {
              if (hd.field_a[5]) {
                gw.b(param0 ^ -109, 6);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (hd.field_a[6]) {
                mda.b(7, (byte) -105);
                break L7;
              } else {
                break L7;
              }
            }
            if (hd.field_a[8]) {
              nf.a((byte) 5);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        }
    }

    private final void k(int param0) {
        if (param0 <= 95) {
            ((ug) this).field_v = 64;
        }
        String var2 = dca.f(12);
        cc.a(55, di.a(78), var2);
    }

    private final void f(byte param0) {
        int var2 = vc.field_q.h(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = uca.field_d + -1;
        if (param0 != -15) {
            ug.n(39);
        }
        byte[] var5 = new byte[var4];
        vc.field_q.a(0, param0 + -103, var5, var4);
        eq.a(param0 ^ -16, di.a(param0 + 82), jaa.a((byte) 64, var5), var3 != 0);
    }

    final static boolean q(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = ug.q(12);
        }
        return !ok.field_s ? true : false;
    }

    final void p(int param0) {
        int var2 = -114 / ((param0 - 66) / 34);
        hd.field_a[6] = true;
    }

    private final int a(byte param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            uia var7 = null;
            String var8 = null;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            Boolean var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = TombRacer.field_G ? 1 : 0;
                        var4 = si.a(bg.field_t, pg.field_y, 103, param2);
                        if (var4 == 0) {
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
                        var5 = cha.a(pla.a(-1), sua.A(49), 2);
                        if (-1 == var5) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        ifa.a(dja.field_s, var5, io.field_b, (byte) 100);
                        io.field_b = null;
                        dja.field_s = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var12 = nw.e((byte) 78);
                        if (var12 != null) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        kb.a(2753, var12.booleanValue());
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (var4 == 2) {
                            statePc = 11;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var5 = pe.a(vk.b(69), toa.a(false), hha.a(false), ((ug) this).field_u, cs.a((byte) 105), cja.a(0), (byte) 53);
                        if (0 == var5) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ura.a(var5, dja.field_s, (byte) -103, io.field_b);
                        dja.field_s = null;
                        io.field_b = null;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (-4 != var4) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (-1 == fsa.field_m) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (fsa.field_m != 0) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        fsa.field_m = -1;
                        vja.b(true);
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (param1) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var5 = ila.a(((ug) this).field_q, cja.a(0), 50, ((ug) this).field_u, cs.a((byte) 81), false);
                        if (0 == (var5 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (var5 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        epa.a(var5, (byte) -84, io.field_b);
                        io.field_b = null;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 22: {
                        ic.field_b = tr.field_g;
                        ak.g(0);
                        gda.field_c = 10;
                        qga.field_m = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        wta.field_G = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (var4 == 4) {
                            statePc = 26;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (!ft.field_a) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        cua.a((byte) -26, di.a(118));
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        qga.field_m = true;
                        gda.field_c = 10;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (5 == var4) {
                            statePc = 31;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        hha.a(di.a(104), (byte) -117);
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (var4 == 6) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (sra.field_t) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        gda.field_c = 10;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (-8 == (var4 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        ft.a(89, di.a(113));
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (8 == var4) {
                            statePc = 42;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        cua.a((byte) -65, di.a(37));
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (9 != var4) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        qea.a(di.a(104), -87);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (-11 == (var4 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        ql.field_k.k(17, -2988);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (11 != var4) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        nt.a(di.a(41), -1978);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        var5 = 70 / ((param0 - -35) / 35);
                        if ((var4 ^ -1) != -13) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        jc.a(mn.g(-128), di.a(28), (byte) -74);
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (13 != var4) {
                            statePc = 62;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        try {
                            if (ana.field_o != null) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ana.field_o = new caa(dsa.field_c, new java.net.URL(((ug) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (!ana.field_o.a(false)) {
                                statePc = 62;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var7 = ana.field_o.b((byte) -123);
                            if (var7 != null) {
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
                            var10 = null;
                            nd.a((String) null, -1);
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
                            var8 = nia.a(var7.field_g, 0, var7.field_h, 255);
                            nd.a(var8, -1);
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
                            ana.field_o = null;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        var6 = (Exception) (Object) caughtException;
                        ssa.a("S1", (byte) 121, (Throwable) (Object) var6);
                        var11 = null;
                        nd.a((String) null, -1);
                        ana.field_o = null;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if (-16 != var4) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        gda.field_c = 10;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if (16 != var4) {
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
                        if (-18 != var4) {
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

    private final void a(byte param0, int param1, boolean param2) {
        this.a(rd.field_r.field_c, wla.field_Eb.field_c, gfa.field_l.field_c, dba.field_d.field_c, 5000, param1, rm.field_d.field_c, param2);
        if (param0 >= -25) {
            ((ug) this).field_w = 116L;
        }
    }

    final void m(int param0) {
        int var2 = 0;
        gqa var3 = null;
        int var4 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var2 = oka.field_z;
          if (param0 == -5) {
            break L0;
          } else {
            ((ug) this).field_z = 113;
            break L0;
          }
        }
        L1: {
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (!hd.field_a[var2]) {
              break L1;
            } else {
              if (-1 == (var2 ^ -1)) {
                return;
              } else {
                L2: {
                  if ((var2 ^ -1) == -2) {
                    bma.d((byte) 82);
                    break L2;
                  } else {
                    if (var2 == -3) {
                      voa.d(-95);
                      break L2;
                    } else {
                      if (-4 == var2) {
                        au.a(3);
                        break L2;
                      } else {
                        if (var2 == 4) {
                          iv.f(0);
                          break L2;
                        } else {
                          if (var2 != 5) {
                            if (-7 == (var2 ^ -1)) {
                              vh.a((byte) -44);
                              break L2;
                            } else {
                              if (var2 != 7) {
                                if (8 == var2) {
                                  kq.a(uca.field_d, dsa.field_c, (byte) 72, (uia) (Object) vc.field_q);
                                  break L2;
                                } else {
                                  if (var2 != 16) {
                                    L3: {
                                      if (-12 == var2) {
                                        break L3;
                                      } else {
                                        if (-13 != var2) {
                                          if ((var2 ^ -1) != -14) {
                                            if (var2 == 17) {
                                              this.f((byte) -15);
                                              break L2;
                                            } else {
                                              if ((var2 ^ -1) == -19) {
                                                vta.c((byte) 101);
                                                break L2;
                                              } else {
                                                ssa.a("MGS1: " + kk.a(32), (byte) 123, (Throwable) null);
                                                dea.a(60);
                                                break L2;
                                              }
                                            }
                                          } else {
                                            ri.e(14180);
                                            break L2;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L4: {
                                      stackOut_22_0 = -18787;
                                      stackIn_24_0 = stackOut_22_0;
                                      stackIn_23_0 = stackOut_22_0;
                                      if (-13 != (var2 ^ -1)) {
                                        stackOut_24_0 = stackIn_24_0;
                                        stackOut_24_1 = 0;
                                        stackIn_25_0 = stackOut_24_0;
                                        stackIn_25_1 = stackOut_24_1;
                                        break L4;
                                      } else {
                                        stackOut_23_0 = stackIn_23_0;
                                        stackOut_23_1 = 1;
                                        stackIn_25_0 = stackOut_23_0;
                                        stackIn_25_1 = stackOut_23_1;
                                        break L4;
                                      }
                                    }
                                    var3 = ila.a(stackIn_25_0, stackIn_25_1 != 0);
                                    k.a((byte) 113, var3);
                                    break L2;
                                  } else {
                                    fq.a((byte) -68);
                                    break L2;
                                  }
                                }
                              } else {
                                this.k(116);
                                break L2;
                              }
                            }
                          } else {
                            rj.a(param0 + 9);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
        ssa.a("MGS2: " + kk.a(32), (byte) 120, (Throwable) null);
        dea.a(60);
    }

    private final int e(byte param0) {
        int var2 = 0;
        if (!((ug) this).field_b) {
          if (uma.b(-1)) {
            if (wta.field_G) {
              return -1;
            } else {
              var2 = ila.a(((ug) this).field_q, cja.a(0), 50, ((ug) this).field_u, cs.a((byte) -118), true);
              if (0 == (var2 ^ -1)) {
                return -1;
              } else {
                L0: {
                  if (0 == var2) {
                    if (gda.field_c == 11) {
                      if (0 == fsa.field_m) {
                        ak.g(param0 + 46);
                        break L0;
                      } else {
                        return var2;
                      }
                    } else {
                      if (gda.field_c == 11) {
                        if (0 == fsa.field_m) {
                          ak.g(param0 + 46);
                          break L0;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    }
                  } else {
                    if (gda.field_c == 11) {
                      if (0 == fsa.field_m) {
                        ak.g(param0 + 46);
                        break L0;
                      } else {
                        return var2;
                      }
                    } else {
                      return var2;
                    }
                  }
                }
                return var2;
              }
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int a(int param0, boolean param1) {
        if (param0 > -26) {
            return 16;
        }
        return this.a((byte) 73, true, param1);
    }

    final void o(int param0) {
        hd.field_a[5] = true;
        if (param0 != 9822) {
            ((ug) this).field_A = false;
        }
    }

    final void j(int param0) {
        hd.field_a[2] = true;
        if (param0 != -13) {
            ((ug) this).field_t = -50;
        }
    }

    final void a(int param0, int param1) {
        this.a((byte) -86, param1, false);
        int var3 = 53 % ((param0 - 38) / 36);
    }

    public static void l(int param0) {
        field_r = null;
        if (param0 != -1) {
            field_r = null;
        }
    }

    private final void i(int param0) {
        vca.field_c[11] = -1;
        vca.field_c[9] = -1;
        vca.field_c[5] = -1;
        vca.field_c[10] = -1;
        vca.field_c[6] = -2;
        vca.field_c[7] = -1;
        vca.field_c[4] = -1;
        vca.field_c[3] = -1;
        vca.field_c[12] = -1;
        vca.field_c[18] = 1;
        vca.field_c[1] = param0;
        vca.field_c[17] = -1;
        vca.field_c[16] = -1;
        vca.field_c[2] = -2;
        vca.field_c[8] = -2;
        vca.field_c[13] = -1;
    }

    final void d(byte param0) {
        hd.field_a[11] = true;
        hd.field_a[13] = true;
        hd.field_a[12] = true;
        if (param0 != 87) {
            ((ug) this).field_u = 29;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ug) this).setBackground(java.awt.Color.black);
        bg.field_t = ((ug) this).field_z;
        pt.b(bg.field_t, (byte) 65);
        qea.a(((ug) this).field_s, ((ug) this).field_v, dsa.field_c, ((ug) this).field_p, ((ug) this).field_x, ((ug) this).field_t, 5000, param4, -1367135824, param7, ((ug) this).field_A, bg.field_t, param5, ((ug) this).field_w);
        av.a(bg.field_t, dsa.field_c, 103, ((ug) this).field_x, ((ug) this).field_v, param5, ((ug) this).field_p, ((ug) this).field_s, ((ug) this).field_t);
        wka.b(520);
        tja.field_q = dka.a((byte) -86);
        fpa.a(nma.field_l, (byte) 75);
        bi.field_c = param2;
        nga.field_p = param3;
        tj.field_c = param6;
        fq.field_g = param1;
        fm.field_j = param0;
        this.i(16);
        ws.f(29320);
    }

    final void g(byte param0) {
        hd.field_a[4] = true;
        if (param0 >= -45) {
            ((ug) this).s(120);
        }
    }

    final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        try {
          if (!((ug) this).a((byte) 51)) {
            return;
          } else {
            L0: {
              ((ug) this).field_x = ((ug) this).getCodeBase().getHost();
              var6_ref = ((ug) this).field_x.toLowerCase();
              if (param4 == 20575) {
                break L0;
              } else {
                ((ug) this).s(118);
                break L0;
              }
            }
            L1: {
              L2: {
                stackOut_5_0 = this;
                stackIn_8_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L2;
                } else {
                  stackOut_6_0 = this;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_7_0 = this;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_8_0 = this;
              stackOut_8_1 = 1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L1;
            }
            L3: {
              ((ug) this).field_q = stackIn_10_1 != 0;
              ((ug) this).field_p = Integer.parseInt(((ug) this).getParameter("gameport1"));
              ((ug) this).field_t = Integer.parseInt(((ug) this).getParameter("gameport2"));
              var7 = ((ug) this).getParameter("servernum");
              if (var7 != null) {
                ((ug) this).field_s = Integer.parseInt(var7);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ((ug) this).field_v = Integer.parseInt(((ug) this).getParameter("gamecrc"));
              ((ug) this).field_w = Long.parseLong(((ug) this).getParameter("instanceid"));
              ((ug) this).field_A = ((ug) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((ug) this).getParameter("lang");
              if (var8 != null) {
                ((ug) this).field_z = Integer.parseInt(var8);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((((ug) this).field_z ^ -1) <= -6) {
                ((ug) this).field_z = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var9 = ((ug) this).getParameter("affid");
              if (var9 == null) {
                break L6;
              } else {
                ((ug) this).field_u = Integer.parseInt(var9);
                break L6;
              }
            }
            vv.field_r = Boolean.valueOf(((ug) this).getParameter("simplemode")).booleanValue();
            ((ug) this).a(false, param2, param1, param0, ((ug) this).field_v, 32, param3);
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        ssa.a((String) null, (byte) 126, (Throwable) (Object) var6);
        ((ug) this).a(-6738, "crash");
    }

    final static void n(int param0) {
        qoa.field_a = false;
        if (param0 != -18) {
            return;
        }
        wr.field_o = null;
        cia.field_a = null;
        ea.field_k = null;
        pm.field_d = null;
    }

    final void r(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 89) {
            ug.n(-80);
        }
        if (wua.c((byte) 49)) {
            int discarded$1 = this.a((byte) -72, false, null != dq.field_f ? true : false);
        } else {
            if (-11 < (cga.field_f ^ -1)) {
            } else {
                if (!qk.i(250)) {
                    pw.C(-5);
                } else {
                    if (0 == gda.field_c) {
                        int discarded$3 = this.a((byte) -111, false, false);
                    } else {
                        tc.a(pg.field_y, -2886);
                    }
                }
            }
        }
    }

    final void c(byte param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_151_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (null != wba.field_o) {
            L1: {
              if (null == dq.field_f) {
                var6 = tj.b(25128);
                var4_ref = var6.getSize();
                wba.field_o.a(var4_ref.width, false, var4_ref.height);
                break L1;
              } else {
                break L1;
              }
            }
            wba.field_o.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          at.j(3321);
          uka.s((byte) -44);
          if (wna.c(-112)) {
            break L2;
          } else {
            if (-12 != (gda.field_c ^ -1)) {
              sw.h(100);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != tja.field_q) {
            pg.field_y = tja.field_q.b(65);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (o.e(540800)) {
            L5: {
              var3 = aqa.a(1188664449) * 1200;
              if (((ug) this).field_y) {
                break L5;
              } else {
                if (rg.g((byte) 118) <= var3) {
                  break L4;
                } else {
                  if (var3 < ada.b(false)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((ug) this).field_y = false;
            dea.a(60);
            dw.b((byte) -84);
            epa.a(2, (byte) -84, th.field_n);
            bk.c(9033);
            wta.field_G = true;
            oga.field_f = 15000L + bva.b((byte) -107);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if ((fsa.field_m ^ -1) == 0) {
              break L7;
            } else {
              if (0 == fsa.field_m) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (fsa.field_m != -1) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L8;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L8;
            }
          }
          var3 = stackIn_26_0;
          fsa.field_m = si.A(61);
          if (var3 != 0) {
            if (fsa.field_m == -1) {
              if (-12 == gda.field_c) {
                if (!uma.b(-1)) {
                  ak.g(0);
                  if (fsa.field_m == -1) {
                    break L6;
                  } else {
                    if (-1 == fsa.field_m) {
                      break L6;
                    } else {
                      oga.field_f = bva.b((byte) -107) + 15000L;
                      break L6;
                    }
                  }
                } else {
                  if (fsa.field_m == -1) {
                    break L6;
                  } else {
                    if (-1 == fsa.field_m) {
                      break L6;
                    } else {
                      oga.field_f = bva.b((byte) -107) + 15000L;
                      break L6;
                    }
                  }
                }
              } else {
                if (fsa.field_m == -1) {
                  break L6;
                } else {
                  if (-1 == fsa.field_m) {
                    break L6;
                  } else {
                    oga.field_f = bva.b((byte) -107) + 15000L;
                    break L6;
                  }
                }
              }
            } else {
              if (fsa.field_m == -1) {
                break L6;
              } else {
                if (-1 == fsa.field_m) {
                  break L6;
                } else {
                  oga.field_f = bva.b((byte) -107) + 15000L;
                  break L6;
                }
              }
            }
          } else {
            if (fsa.field_m == -1) {
              break L6;
            } else {
              if (-1 == (fsa.field_m ^ -1)) {
                break L6;
              } else {
                oga.field_f = bva.b((byte) -107) + 15000L;
                break L6;
              }
            }
          }
        }
        L9: {
          if (-1 == fsa.field_m) {
            break L9;
          } else {
            if (fsa.field_m == 0) {
              break L9;
            } else {
              if (cga.field_f > -11) {
                if (-4 != fsa.field_m) {
                  if (-5 == fsa.field_m) {
                    ((ug) this).a(-6738, "js5io");
                    break L9;
                  } else {
                    if (-3 == fsa.field_m) {
                      ((ug) this).a(-6738, "js5connect_full");
                      break L9;
                    } else {
                      if (-6 != fsa.field_m) {
                        ((ug) this).a(-6738, "js5connect");
                        break L9;
                      } else {
                        ((ug) this).a(-6738, "outofdate");
                        break L9;
                      }
                    }
                  }
                } else {
                  ((ug) this).a(-6738, "js5crc");
                  break L9;
                }
              } else {
                if (gda.field_c < 10) {
                  break L9;
                } else {
                  L10: {
                    dw.b((byte) -123);
                    if (-4 != fsa.field_m) {
                      if (-5 != (fsa.field_m ^ -1)) {
                        if ((fsa.field_m ^ -1) != -3) {
                          if (fsa.field_m != 5) {
                            epa.a(256, (byte) -84, wqa.field_H);
                            break L10;
                          } else {
                            epa.a(5, (byte) -84, wq.field_a);
                            break L10;
                          }
                        } else {
                          epa.a(256, (byte) -84, kka.field_r);
                          break L10;
                        }
                      } else {
                        epa.a(256, (byte) -84, uta.field_e);
                        break L10;
                      }
                    } else {
                      epa.a(256, (byte) -84, oe.field_l);
                      break L10;
                    }
                  }
                  wta.field_G = true;
                  break L9;
                }
              }
            }
          }
        }
        L11: {
          L12: {
            L13: {
              L14: {
                if (fsa.field_m == -1) {
                  break L14;
                } else {
                  if (fsa.field_m != 0) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              if (uma.b(-1)) {
                break L13;
              } else {
                break L12;
              }
            }
            if (oga.field_f <= bva.b((byte) -107)) {
              wta.field_G = false;
              if (-1 == fsa.field_m) {
                L15: {
                  if (fsa.field_m == 0) {
                    break L15;
                  } else {
                    if (fsa.field_m != 0) {
                      break L11;
                    } else {
                      break L15;
                    }
                  }
                }
                if (uma.b(-1)) {
                  break L11;
                } else {
                  rca.field_l = false;
                  break L11;
                }
              } else {
                if (fsa.field_m != 0) {
                  break L11;
                } else {
                  if (uma.b(-1)) {
                    break L11;
                  } else {
                    rca.field_l = false;
                    break L11;
                  }
                }
              }
            } else {
              break L12;
            }
          }
          if (fsa.field_m != 0) {
            break L11;
          } else {
            if (uma.b(-1)) {
              break L11;
            } else {
              rca.field_l = false;
              break L11;
            }
          }
        }
        L16: {
          if (cga.field_f != 0) {
            break L16;
          } else {
            if (!ula.k((byte) -117)) {
              break L16;
            } else {
              cga.field_f = 1;
              break L16;
            }
          }
        }
        L17: {
          if ((cga.field_f ^ -1) == -2) {
            L18: {
              if (0 == bg.field_t) {
                break L18;
              } else {
                nja.field_J = dd.a(nga.field_p, 1);
                break L18;
              }
            }
            tk.field_b = sa.a(true, fq.field_g, false, 1, (byte) -95);
            hm.field_n = sa.a(true, bi.field_c, false, 1, (byte) -109);
            vc.field_p = sa.a(true, fm.field_j, false, 1, (byte) -79);
            cga.field_f = 2;
            oma.field_G = tk.field_b;
            ota.field_b = hm.field_n;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if ((cga.field_f ^ -1) == -3) {
            L20: {
              if (null != nja.field_J) {
                if (!nja.field_J.b(-79)) {
                  break L20;
                } else {
                  if (nja.field_J.a("", 108)) {
                    if (nja.field_J.c("", -127)) {
                      jga.a((byte) -45, nja.field_J);
                      nja.field_J = null;
                      ea.a(-33);
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    nja.field_J = null;
                    break L20;
                  }
                }
              } else {
                break L20;
              }
            }
            if (null != nja.field_J) {
              break L19;
            } else {
              cga.field_f = 3;
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (-4 == (cga.field_f ^ -1)) {
            if (!esa.a(vc.field_p, tk.field_b, -128, hm.field_n)) {
              break L21;
            } else {
              if (tt.a(vc.field_p, (byte) -53)) {
                L22: {
                  L23: {
                    ee.a(-1);
                    eha.a((byte) -27);
                    ura.field_b = nl.field_c;
                    sra.field_t = false;
                    cra.a(tk.field_b, hm.field_n, 1, ft.field_a, vc.field_p);
                    if (ofa.field_I) {
                      break L23;
                    } else {
                      if (null != bma.field_s) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    if (ofa.field_I) {
                      stackOut_118_0 = 0;
                      stackIn_119_0 = stackOut_118_0;
                      break L24;
                    } else {
                      stackOut_117_0 = 1;
                      stackIn_119_0 = stackOut_117_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_119_0 = stackIn_119_0;
                    stackIn_121_0 = stackOut_119_0;
                    stackIn_120_0 = stackOut_119_0;
                    if (ofa.field_I) {
                      stackOut_121_0 = stackIn_121_0;
                      stackOut_121_1 = 0;
                      stackIn_122_0 = stackOut_121_0;
                      stackIn_122_1 = stackOut_121_1;
                      break L25;
                    } else {
                      stackOut_120_0 = stackIn_120_0;
                      stackOut_120_1 = 1;
                      stackIn_122_0 = stackOut_120_0;
                      stackIn_122_1 = stackOut_120_1;
                      break L25;
                    }
                  }
                  ag.a(stackIn_122_0 != 0, stackIn_122_1 != 0, false, bma.field_s);
                  break L22;
                }
                L26: {
                  if (!vv.field_r) {
                    break L26;
                  } else {
                    aoa.b(true);
                    break L26;
                  }
                }
                L27: {
                  if (null != sma.field_c) {
                    break L27;
                  } else {
                    sma.field_c = epa.d((byte) -91);
                    ci.field_k = fta.c(-93);
                    break L27;
                  }
                }
                wk.a(sma.field_c, ci.field_k, 11861, vc.field_p);
                hm.field_n = null;
                tk.field_b = null;
                vc.field_p = null;
                vga.a((java.applet.Applet) this, (byte) -128);
                ea.a(-33);
                cga.field_f = 10;
                break L21;
              } else {
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (10 == cga.field_f) {
            L29: {
              if (bg.field_t == 0) {
                break L29;
              } else {
                oqa.field_v = dd.a(tj.field_c, 1);
                break L29;
              }
            }
            cga.field_f = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          var3 = 69 % ((param0 - -63) / 62);
          if ((cga.field_f ^ -1) == -12) {
            L31: {
              if (oqa.field_v == null) {
                break L31;
              } else {
                L32: {
                  if (!oqa.field_v.b(-100)) {
                    break L32;
                  } else {
                    if (!oqa.field_v.a(0)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                ima.a(0.0f, vca.a(voa.field_s, hra.field_c, oqa.field_v, (byte) 92), -80);
                break L30;
              }
            }
            lpa.field_w = true;
            cga.field_f = 12;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (12 != cga.field_f) {
            break L33;
          } else {
            if (!lpa.field_w) {
              cga.field_f = 13;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L34: {
          if (cga.field_f == 13) {
            L35: {
              var4 = 1;
              if (null == lba.field_r) {
                break L35;
              } else {
                L36: {
                  if (!lba.field_r.a((byte) 37)) {
                    stackOut_150_0 = 0;
                    stackIn_151_0 = stackOut_150_0;
                    break L36;
                  } else {
                    stackOut_149_0 = 1;
                    stackIn_151_0 = stackOut_149_0;
                    break L36;
                  }
                }
                var4 = stackIn_151_0;
                ima.a(lba.field_r.field_i, lba.field_r.field_b, -65);
                break L35;
              }
            }
            if (var4 == 0) {
              break L34;
            } else {
              cga.field_f = 20;
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
            if (!wla.field_Cb) {
              break L37;
            } else {
              pq.a(nma.field_l, false);
              ((ug) this).b((byte) 14);
              fpa.a(nma.field_l, (byte) 75);
              break L37;
            }
          }
        }
        L38: {
          if (!hd.field_a[8]) {
            break L38;
          } else {
            dra.a(true);
            break L38;
          }
        }
    }

    final void b(byte param0, boolean param1) {
        hd.field_a[3] = true;
        if (param0 < 101) {
            ((ug) this).d((byte) 96);
        }
        hd.field_a[8] = param1;
        hd.field_a[7] = true;
        hd.field_a[16] = true;
        hd.field_a[0] = true;
        hd.field_a[17] = true;
        hd.field_a[18] = true;
    }

    ug() {
    }

    final void s(int param0) {
        hd.field_a[1] = true;
        if (param0 != -1) {
            ((ug) this).field_t = -30;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[4];
        field_r[2] = "Prim's Algorithm";
        field_r[0] = "Recursive Backtracker";
        field_r[1] = "Striped";
        field_r[3] = "Division";
    }
}
