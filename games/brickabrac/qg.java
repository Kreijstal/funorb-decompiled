/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qg extends ke {
    private int field_o;
    static jp[][] field_r;
    String field_x;
    static jp[] field_D;
    private int field_u;
    private int field_C;
    static int field_A;
    private long field_w;
    static String field_z;
    private boolean field_y;
    private boolean field_s;
    private boolean field_q;
    private int field_v;
    static boolean field_t;
    private int field_B;
    private int field_p;

    private final void f(boolean param0) {
        String var2 = go.a((byte) 120);
        da.a(var2, 70, uc.e((byte) -116));
        if (!param0) {
            ((qg) this).g(false);
        }
    }

    private final void m(int param0) {
        ch.field_g[6] = -2;
        if (param0 <= 116) {
            return;
        }
        ch.field_g[1] = 16;
        ch.field_g[18] = 1;
        ch.field_g[11] = -1;
        ch.field_g[9] = -1;
        ch.field_g[2] = -2;
        ch.field_g[5] = -1;
        ch.field_g[10] = -1;
        ch.field_g[7] = -1;
        ch.field_g[12] = -1;
        ch.field_g[13] = -1;
        ch.field_g[17] = -1;
        ch.field_g[8] = -2;
        ch.field_g[4] = -1;
        ch.field_g[3] = -1;
        ch.field_g[16] = -1;
    }

    final void a(String param0, int param1, int param2) {
        this.a(103, param0, param1, 640, 480);
        if (param2 != 1686) {
            field_D = null;
        }
    }

    final void a(byte param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((qg) this).setBackground(java.awt.Color.black);
        cd.field_e = ((qg) this).field_u;
        hk.a(cd.field_e, (byte) 125);
        im.a(param7, ((qg) this).field_x, ((qg) this).field_q, ((qg) this).field_B, 5000, 5000, cd.field_e, ((qg) this).field_o, lp.field_ub, (byte) 123, param3, ((qg) this).field_w, ((qg) this).field_p, ((qg) this).field_v);
        cr.a(param7, cd.field_e, param0 + 3, ((qg) this).field_v, lp.field_ub, ((qg) this).field_x, ((qg) this).field_p, ((qg) this).field_o, ((qg) this).field_B);
        rn.a(59);
        qa.field_x = ea.a(60);
        ap.a((byte) 117, kj.field_D);
        nd.field_c = param4;
        lc.field_i = param5;
        wq.field_j = param1;
        o.field_f = param6;
        ea.field_c = param2;
        if (param0 != 39) {
            ((qg) this).g(false);
        }
        this.m(123);
        oc.c((byte) -35);
    }

    final static jp a(jp param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        var2 = param0.field_C;
        var3 = param0.field_D;
        var4 = param0.field_G;
        var5 = var2 - 1;
        L0: while (true) {
          L1: {
            if (var5 < 0) {
              break L1;
            } else {
              var6 = var5 * var3;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var5--;
                  continue L0;
                } else {
                  if (-16777216 == (var4[var7 + var6] ^ -1)) {
                    var7++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          var6 = 0;
          L3: while (true) {
            L4: {
              if (var6 >= var5) {
                break L4;
              } else {
                var7 = var3 * var6;
                var8 = 0;
                L5: while (true) {
                  if (var8 >= var3) {
                    var6++;
                    continue L3;
                  } else {
                    if ((var4[var8 + var7] ^ -1) == -16777216) {
                      var8++;
                      continue L5;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            L6: {
              var7 = -1 + var3;
              if (param1 == 1) {
                break L6;
              } else {
                field_z = null;
                break L6;
              }
            }
            L7: while (true) {
              L8: {
                if ((var7 ^ -1) > -1) {
                  break L8;
                } else {
                  var8 = var6;
                  L9: while (true) {
                    if (var5 < var8) {
                      var7--;
                      continue L7;
                    } else {
                      if (16711422 == var4[var7 + var8 * var3]) {
                        var8++;
                        continue L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
              }
              var8 = 0;
              L10: while (true) {
                L11: {
                  if (var7 <= var8) {
                    break L11;
                  } else {
                    var9 = var6;
                    L12: while (true) {
                      if (var5 < var9) {
                        var8++;
                        continue L10;
                      } else {
                        if ((var4[var9 * var3 - -var8] ^ -1) == -16711423) {
                          var9++;
                          continue L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (var8 != 0) {
                    break L13;
                  } else {
                    if (var7 != var3 - 1) {
                      break L13;
                    } else {
                      if (var6 != 0) {
                        break L13;
                      } else {
                        if (var2 + -1 != var5) {
                          break L13;
                        } else {
                          return param0;
                        }
                      }
                    }
                  }
                }
                var9 = -var8 + (1 + var7);
                var10 = -var6 + 1 + var5;
                var11 = new int[var10 * var9];
                var12 = 0;
                L14: while (true) {
                  if (var12 >= var10) {
                    param0.field_D = var9;
                    param0.field_E = param0.field_E + var8;
                    param0.field_C = var10;
                    param0.field_G = var11;
                    param0.field_F = param0.field_F + var6;
                    return param0;
                  } else {
                    var13 = 0;
                    L15: while (true) {
                      if (var13 >= var9) {
                        var12++;
                        continue L14;
                      } else {
                        var11[var9 * var12 + var13] = var4[var3 * (var12 - -var6) + var8 + var13];
                        var13++;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final int n(int param0) {
        int var2 = 0;
        if (((qg) this).field_d) {
          return -1;
        } else {
          if (ui.a(false)) {
            if (n.field_e) {
              return -1;
            } else {
              var2 = wp.a(ud.d(true), true, true, ((qg) this).field_s, ((qg) this).field_C, ee.b(false));
              if (var2 == param0) {
                return -1;
              } else {
                L0: {
                  if (var2 == -1) {
                    break L0;
                  } else {
                    if (-2 != var2) {
                      L1: {
                        if (!hk.field_R) {
                          ((qg) this).a("reconnect", 4000);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      qb.g(108);
                      tf.a(eo.field_e, (byte) -61, var2);
                      n.field_e = true;
                      cg.field_i = ue.a(false) + 15000L;
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (-12 != (i.field_j ^ -1)) {
                    break L2;
                  } else {
                    if (tm.field_a == 0) {
                      ei.b(param0 ^ -1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                return var2;
              }
            }
          } else {
            return -1;
          }
        }
    }

    final void l(int param0) {
        uf.field_d[1] = true;
        if (param0 != 12) {
            ((qg) this).field_C = 30;
        }
    }

    final int o(int param0) {
        int var2 = this.n(-1);
        if (var2 != 0) {
            // if_icmpne L140
        }
        if (uf.field_d[1]) {
            ie.a(2, (byte) -46);
        }
        if (uf.field_d[2]) {
            ff.a((byte) -61, 3);
        }
        if (uf.field_d[3]) {
            nq.a(4, 13330);
        }
        if (uf.field_d[4]) {
            ui.a(5, (byte) 115);
        }
        if (uf.field_d[5]) {
            hj.b(6, 0);
        }
        if (!(!uf.field_d[6])) {
            qn.a((byte) 119, 7);
        }
        if (uf.field_d[8]) {
            we.a((byte) -46);
        }
        int var3 = -122 % ((-43 - param0) / 60);
        return var2;
    }

    final int b(boolean param0, byte param1) {
        if (param1 != -118) {
            int discarded$0 = ((qg) this).o(30);
        }
        return this.a(param0, (byte) 46, true);
    }

    final void j(int param0) {
        if (param0 <= 28) {
            this.m(-5);
        }
        uf.field_d[6] = true;
    }

    final void c(byte param0) {
        uf.field_d[12] = true;
        uf.field_d[11] = true;
        if (param0 != -19) {
            return;
        }
        uf.field_d[13] = true;
    }

    final static void a(int param0, int param1, byte param2) {
        cc.field_J = param0;
        ea.field_e = param1;
        if (param2 > -110) {
            field_z = null;
        }
    }

    final void e(boolean param0) {
        uf.field_d[5] = param0;
    }

    private final int a(boolean param0, byte param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Boolean var11 = null;
            wq var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = BrickABrac.field_J ? 1 : 0;
                        var4 = df.a(-27790, qc.field_o, cd.field_e, param0);
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
                        if (var4 != -2) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5_int = ek.a(oo.f(param1 ^ 67), sq.a(64), (byte) -16);
                        if (0 == var5_int) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        ef.a(eo.field_e, -106, var5_int, co.field_f);
                        eo.field_e = null;
                        co.field_f = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var11 = df.a(0);
                        if (var11 != null) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        to.a(var11.booleanValue(), -128);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (var4 != 2) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var5_int = wg.a(ee.b(false), (byte) -74, be.a((byte) -44), fc.a(param1 ^ 115), aa.a(480), ud.d(true), ((qg) this).field_C);
                        if (-1 != var5_int) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        vh.a(var5_int, (byte) -123, eo.field_e, co.field_f);
                        eo.field_e = null;
                        co.field_f = null;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if ((var4 ^ -1) == -4) {
                            statePc = 15;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if ((tm.field_a ^ -1) == 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (0 != tm.field_a) {
                            statePc = 18;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        tm.field_a = -1;
                        pp.a((byte) 79);
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (!param2) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        n.field_e = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 21: {
                        var5_int = wp.a(ud.d(true), false, true, ((qg) this).field_s, ((qg) this).field_C, ee.b(false));
                        if (var5_int == -1) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (-1 != (var5_int ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        sb.field_e = sl.field_v;
                        ei.b(0);
                        i.field_j = 10;
                        ol.field_s = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        tf.a(eo.field_e, (byte) -77, var5_int);
                        eo.field_e = null;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (4 != var4) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (!qb.field_u) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        jc.a(uc.e((byte) -97), (byte) 97);
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        i.field_j = 10;
                        ol.field_s = true;
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
                        nk.a(2048, uc.e((byte) -110));
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (-7 == var4) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (ci.field_t) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        i.field_j = 10;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (7 == var4) {
                            statePc = 39;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        pf.a(uc.e((byte) -76), false);
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (param1 == 46) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        ((qg) this).field_o = 120;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if (-9 != (var4 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        jc.a(uc.e((byte) -70), (byte) 97);
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if ((var4 ^ -1) != -10) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        vl.a(uc.e((byte) -108), (byte) -106);
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (var4 != 10) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        k.field_h.e(-13413, 17);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (var4 != 11) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        mi.a((byte) -123, uc.e((byte) -93));
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if (12 != var4) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        kf.a(oh.b((byte) -49), (byte) -125, uc.e((byte) -97));
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (-14 == (var4 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        try {
                            if (null == po.field_e) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            po.field_e = new ad(lp.field_ub, new java.net.URL(((qg) this).getCodeBase(), "countrylist.ws"), 5000);
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
                            if (po.field_e.a(1)) {
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
                            var12 = po.field_e.a((byte) 100);
                            if (var12 != null) {
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
                            var9 = null;
                            hi.a(85, (String) null);
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
                            var7 = df.a(var12.field_l, 97, var12.field_k, 0);
                            hi.a(85, var7);
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
                            po.field_e = null;
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
                        rk.a("S1", (Throwable) (Object) var5, 28);
                        hi.a(param1 ^ 123, (String) null);
                        po.field_e = null;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (-16 == (var4 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        i.field_j = 10;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        if ((var4 ^ -1) == -17) {
                            statePc = 70;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        return 1;
                    }
                    case 71: {
                        if (17 != var4) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        return 2;
                    }
                    case 73: {
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

    final void g(boolean param0) {
        int var3 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackOut_10_0;
        Object stackOut_12_0;
        int stackOut_12_1;
        Object stackOut_11_0;
        int stackOut_11_1;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ((qg) this).field_B = -15;
            break L0;
          }
        }
        L1: {
          if (kb.i(7457)) {
            L2: {
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (ua.field_d == null) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L2;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L2;
              }
            }
            int discarded$32 = this.a(stackIn_13_1 != 0, (byte) 46, false);
            break L1;
          } else {
            if ((field_A ^ -1) <= -11) {
              if (il.e((byte) -126)) {
                if (i.field_j == 0) {
                  int discarded$33 = this.a(false, (byte) 46, false);
                  break L1;
                } else {
                  gk.a(qc.field_o, (byte) 124);
                  break L1;
                }
              } else {
                hk.a((byte) -122);
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
    }

    public static void k(int param0) {
        field_r = null;
        field_D = null;
        if (param0 > -103) {
            field_D = null;
        }
        field_z = null;
    }

    final void h(boolean param0) {
        int var2 = 0;
        gb var3 = null;
        int var4 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_29_0;
        int stackOut_31_0;
        int stackOut_31_1;
        int stackOut_30_0;
        int stackOut_30_1;
        Object stackOut_19_0;
        Object stackOut_21_0;
        int stackOut_21_1;
        Object stackOut_20_0;
        int stackOut_20_1;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          var2 = si.field_a;
          if (var2 >= 64) {
            break L0;
          } else {
            if (uf.field_d[var2]) {
              if (!param0) {
                if (0 != var2) {
                  L1: {
                    if ((var2 ^ -1) == -2) {
                      ba.f(-1);
                      break L1;
                    } else {
                      if (var2 != 2) {
                        if ((var2 ^ -1) != -4) {
                          if ((var2 ^ -1) == -5) {
                            jm.a((byte) 22);
                            break L1;
                          } else {
                            if ((var2 ^ -1) != -6) {
                              if (var2 != 6) {
                                if (var2 != -8) {
                                  if (-9 != var2) {
                                    if (-17 == (var2 ^ -1)) {
                                      bc.a(27423);
                                      break L1;
                                    } else {
                                      L2: {
                                        if ((var2 ^ -1) == -12) {
                                          break L2;
                                        } else {
                                          if ((var2 ^ -1) != -13) {
                                            if ((var2 ^ -1) != -14) {
                                              if ((var2 ^ -1) != -18) {
                                                if (var2 != 18) {
                                                  rk.a("MGS1: " + eq.c((byte) -71), (Throwable) null, 119);
                                                  hn.a((byte) 101);
                                                  break L1;
                                                } else {
                                                  g.e((byte) -114);
                                                  break L1;
                                                }
                                              } else {
                                                this.a((byte) 120);
                                                break L1;
                                              }
                                            } else {
                                              ch.a((byte) 63);
                                              break L1;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                      L3: {
                                        stackOut_29_0 = 67;
                                        stackIn_31_0 = stackOut_29_0;
                                        stackIn_30_0 = stackOut_29_0;
                                        if (var2 != 12) {
                                          stackOut_31_0 = stackIn_31_0;
                                          stackOut_31_1 = 0;
                                          stackIn_32_0 = stackOut_31_0;
                                          stackIn_32_1 = stackOut_31_1;
                                          break L3;
                                        } else {
                                          stackOut_30_0 = stackIn_30_0;
                                          stackOut_30_1 = 1;
                                          stackIn_32_0 = stackOut_30_0;
                                          stackIn_32_1 = stackOut_30_1;
                                          break L3;
                                        }
                                      }
                                      var3 = kc.a((byte) stackIn_32_0, stackIn_32_1 != 0);
                                      lj.a(var3, 79);
                                      break L1;
                                    }
                                  } else {
                                    um.a(ga.field_j, (wq) (Object) jl.field_e, (byte) 107, lp.field_ub);
                                    break L1;
                                  }
                                } else {
                                  L4: {
                                    stackOut_19_0 = this;
                                    stackIn_21_0 = stackOut_19_0;
                                    stackIn_20_0 = stackOut_19_0;
                                    if (param0) {
                                      stackOut_21_0 = this;
                                      stackOut_21_1 = 0;
                                      stackIn_22_0 = stackOut_21_0;
                                      stackIn_22_1 = stackOut_21_1;
                                      break L4;
                                    } else {
                                      stackOut_20_0 = this;
                                      stackOut_20_1 = 1;
                                      stackIn_22_0 = stackOut_20_0;
                                      stackIn_22_1 = stackOut_20_1;
                                      break L4;
                                    }
                                  }
                                  this.f(stackIn_22_1 != 0);
                                  break L1;
                                }
                              } else {
                                wl.c(false);
                                break L1;
                              }
                            } else {
                              re.f((byte) -71);
                              break L1;
                            }
                          }
                        } else {
                          qi.a(-1);
                          break L1;
                        }
                      } else {
                        f.a((byte) 7);
                        break L1;
                      }
                    }
                  }
                  return;
                } else {
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
        rk.a("MGS2: " + eq.c((byte) -66), (Throwable) null, 89);
        hn.a((byte) 71);
    }

    private final void a(int param0, String param1, int param2, int param3, int param4) {
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
        Object stackOut_2_0;
        Object stackOut_3_0;
        Object stackOut_6_0;
        int stackOut_6_1;
        Object stackOut_4_0;
        Object stackOut_5_0;
        int stackOut_5_1;
        try {
          if (((qg) this).e(-128)) {
            L0: {
              L1: {
                ((qg) this).field_x = ((qg) this).getCodeBase().getHost();
                var6_ref = ((qg) this).field_x.toLowerCase();
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
              ((qg) this).field_s = stackIn_7_1 != 0;
              ((qg) this).field_v = Integer.parseInt(((qg) this).getParameter("gameport1"));
              if (param0 >= 86) {
                break L2;
              } else {
                field_A = -93;
                break L2;
              }
            }
            L3: {
              ((qg) this).field_p = Integer.parseInt(((qg) this).getParameter("gameport2"));
              var7 = ((qg) this).getParameter("servernum");
              if (var7 != null) {
                ((qg) this).field_B = Integer.parseInt(var7);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ((qg) this).field_o = Integer.parseInt(((qg) this).getParameter("gamecrc"));
              ((qg) this).field_w = Long.parseLong(((qg) this).getParameter("instanceid"));
              ((qg) this).field_q = ((qg) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((qg) this).getParameter("lang");
              if (var8 == null) {
                break L4;
              } else {
                ((qg) this).field_u = Integer.parseInt(var8);
                break L4;
              }
            }
            L5: {
              if (((qg) this).field_u < 5) {
                break L5;
              } else {
                ((qg) this).field_u = 0;
                break L5;
              }
            }
            L6: {
              var9 = ((qg) this).getParameter("affid");
              if (var9 == null) {
                break L6;
              } else {
                ((qg) this).field_C = Integer.parseInt(var9);
                break L6;
              }
            }
            ld.field_u = Boolean.valueOf(((qg) this).getParameter("simplemode")).booleanValue();
            ((qg) this).a(32, 123, param4, param3, ((qg) this).field_o, param1, param2);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        rk.a((String) null, (Throwable) (Object) var6, 58);
        ((qg) this).a("crash", 4000);
    }

    final void a(int param0, boolean param1) {
        uf.field_d[16] = true;
        uf.field_d[param0] = param1;
        uf.field_d[7] = true;
        uf.field_d[0] = true;
        uf.field_d[3] = true;
        uf.field_d[18] = true;
        uf.field_d[17] = true;
    }

    final static jp[] a(jp[] param0, byte param1) {
        int var2 = 0;
        jp var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 > -101) {
            field_D = null;
        }
        for (var2 = 0; param0.length > var2; var2++) {
            var3 = param0[var2];
            param0[var2].field_F = 0;
            var3.field_E = 0;
            param0[var2].field_x = param0[var2].field_D;
            param0[var2].field_z = param0[var2].field_C;
        }
        return param0;
    }

    qg() {
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_131_0 = 0;
        int stackOut_22_0;
        int stackOut_21_0;
        int stackOut_97_0;
        int stackOut_96_0;
        int stackOut_98_0;
        int stackOut_100_0;
        int stackOut_100_1;
        int stackOut_99_0;
        int stackOut_99_1;
        int stackOut_130_0;
        int stackOut_129_0;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (jj.field_a == null) {
            break L0;
          } else {
            L1: {
              if (null == ua.field_d) {
                var6 = ea.b(0);
                var4 = var6.getSize();
                jj.field_a.a(44, var4.width, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            jj.field_a.c(param1 + 118);
            break L0;
          }
        }
        L2: {
          wn.b((byte) -97);
          sg.e(70);
          if (r.c((byte) -114)) {
            break L2;
          } else {
            if (i.field_j != 11) {
              qc.c(27144);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (qa.field_x == null) {
            break L3;
          } else {
            qc.field_o = qa.field_x.b(500);
            break L3;
          }
        }
        L4: {
          if (!ik.a(false)) {
            break L4;
          } else {
            L5: {
              var3 = wn.a((byte) -98) * 1200;
              if (((qg) this).field_y) {
                break L5;
              } else {
                if (wi.c(1) <= var3) {
                  break L4;
                } else {
                  if (var3 >= so.a((byte) -35)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((qg) this).field_y = false;
            hn.a((byte) 91);
            qb.g(120);
            tf.a(qa.field_s, (byte) -113, 2);
            rj.b(param1 ^ -111);
            n.field_e = true;
            cg.field_i = 15000L + ue.a(false);
            break L4;
          }
        }
        L6: {
          L7: {
            if ((tm.field_a ^ -1) == 0) {
              break L7;
            } else {
              if (tm.field_a != -1) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (0 != tm.field_a) {
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
          tm.field_a = wg.a(false);
          if (var3 != 0) {
            if (-1 == tm.field_a) {
              break L6;
            } else {
              if (tm.field_a == 0) {
                break L6;
              } else {
                cg.field_i = 15000L + ue.a(false);
                break L6;
              }
            }
          } else {
            if (-1 == tm.field_a) {
              break L6;
            } else {
              if (tm.field_a == 0) {
                break L6;
              } else {
                cg.field_i = 15000L + ue.a(false);
                break L6;
              }
            }
          }
        }
        L9: {
          if (0 == tm.field_a) {
            break L9;
          } else {
            if (-1 == tm.field_a) {
              break L9;
            } else {
              if (10 <= field_A) {
                if (10 <= i.field_j) {
                  L10: {
                    qb.g(114);
                    if (tm.field_a == 3) {
                      tf.a(nk.field_d, (byte) -49, 256);
                      break L10;
                    } else {
                      if (tm.field_a != 4) {
                        if (tm.field_a != 2) {
                          if (5 == tm.field_a) {
                            tf.a(u.field_b, (byte) -48, 5);
                            break L10;
                          } else {
                            tf.a(np.field_e, (byte) -55, 256);
                            break L10;
                          }
                        } else {
                          tf.a(ke.field_k, (byte) -54, 256);
                          break L10;
                        }
                      } else {
                        tf.a(vh.field_M, (byte) -103, 256);
                        break L10;
                      }
                    }
                  }
                  n.field_e = true;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                if (-4 != (tm.field_a ^ -1)) {
                  if (4 != tm.field_a) {
                    if ((tm.field_a ^ -1) != -3) {
                      if (5 != tm.field_a) {
                        ((qg) this).a("js5connect", 4000);
                        break L9;
                      } else {
                        ((qg) this).a("outofdate", 4000);
                        break L9;
                      }
                    } else {
                      ((qg) this).a("js5connect_full", 4000);
                      break L9;
                    }
                  } else {
                    ((qg) this).a("js5io", 4000);
                    break L9;
                  }
                } else {
                  ((qg) this).a("js5crc", 4000);
                  break L9;
                }
              }
            }
          }
        }
        L11: {
          L12: {
            L13: {
              if (0 == (tm.field_a ^ -1)) {
                break L13;
              } else {
                if (0 != tm.field_a) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (!ui.a(false)) {
              break L11;
            } else {
              break L12;
            }
          }
          if (cg.field_i > ue.a(false)) {
            break L11;
          } else {
            n.field_e = false;
            if ((tm.field_a ^ -1) == 0) {
              break L11;
            } else {
              if (0 == tm.field_a) {
                break L11;
              } else {
                tm.field_a = -1;
                pp.a((byte) -101);
                break L11;
              }
            }
          }
        }
        L14: {
          if (tm.field_a != 0) {
            if (0 != field_A) {
              break L14;
            } else {
              if (!o.d(param1 ^ -572695520)) {
                break L14;
              } else {
                field_A = 1;
                break L14;
              }
            }
          } else {
            if (0 != field_A) {
              break L14;
            } else {
              if (!o.d(param1 ^ -572695520)) {
                break L14;
              } else {
                field_A = 1;
                break L14;
              }
            }
          }
        }
        L15: {
          if (field_A != param1) {
            break L15;
          } else {
            L16: {
              if (-1 == (cd.field_e ^ -1)) {
                break L16;
              } else {
                wl.field_K = aj.a(wq.field_j, true);
                break L16;
              }
            }
            ma.field_P = bq.a(-6, 1, true, nd.field_c, false);
            vh.field_S = bq.a(-6, 1, true, ea.field_c, false);
            ja.field_c = bq.a(-6, 1, true, o.field_f, false);
            wn.field_c = vh.field_S;
            field_A = 2;
            gq.field_Rb = ma.field_P;
            break L15;
          }
        }
        L17: {
          if (2 == field_A) {
            L18: {
              if (null == wl.field_K) {
                break L18;
              } else {
                if (!wl.field_K.a((byte) -127)) {
                  break L18;
                } else {
                  if (!wl.field_K.a(113, "")) {
                    wl.field_K = null;
                    break L18;
                  } else {
                    if (wl.field_K.a("", -28138)) {
                      nn.a(wl.field_K, 122);
                      wl.field_K = null;
                      hc.b(param1 ^ 3);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
              }
            }
            if (wl.field_K == null) {
              field_A = 3;
              break L17;
            } else {
              break L17;
            }
          } else {
            break L17;
          }
        }
        L19: {
          if (3 != field_A) {
            break L19;
          } else {
            if (!fk.a(vh.field_S, ma.field_P, ja.field_c, -111)) {
              break L19;
            } else {
              if (rg.a(ja.field_c, (byte) 101)) {
                L20: {
                  L21: {
                    ui.a(384920353);
                    kg.a(param1 + 21677);
                    ci.field_t = false;
                    ri.field_N = cm.field_t;
                    gn.a(qb.field_u, ja.field_c, ma.field_P, vh.field_S, param1 ^ 23);
                    if (cb.field_k) {
                      break L21;
                    } else {
                      if (null == dq.field_a) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if (cb.field_k) {
                      stackOut_97_0 = 0;
                      stackIn_98_0 = stackOut_97_0;
                      break L22;
                    } else {
                      stackOut_96_0 = 1;
                      stackIn_98_0 = stackOut_96_0;
                      break L22;
                    }
                  }
                  L23: {
                    stackOut_98_0 = stackIn_98_0;
                    stackIn_100_0 = stackOut_98_0;
                    stackIn_99_0 = stackOut_98_0;
                    if (cb.field_k) {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      break L23;
                    } else {
                      stackOut_99_0 = stackIn_99_0;
                      stackOut_99_1 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      stackIn_101_1 = stackOut_99_1;
                      break L23;
                    }
                  }
                  bf.a(stackIn_101_0 != 0, stackIn_101_1 != 0, param1 ^ -15948, dq.field_a);
                  break L20;
                }
                L24: {
                  if (!ld.field_u) {
                    break L24;
                  } else {
                    cc.f(967);
                    break L24;
                  }
                }
                L25: {
                  if (null == sg.field_l) {
                    sg.field_l = ni.h(114);
                    ri.field_M = ar.a((byte) 120);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                kc.a(ja.field_c, sg.field_l, ri.field_M, 107);
                vh.field_S = null;
                ma.field_P = null;
                ja.field_c = null;
                km.a((java.applet.Applet) this, -90);
                hc.b(2);
                field_A = 10;
                break L19;
              } else {
                break L19;
              }
            }
          }
        }
        L26: {
          if (10 != field_A) {
            break L26;
          } else {
            L27: {
              if (0 != cd.field_e) {
                qc.field_k = aj.a(lc.field_i, true);
                break L27;
              } else {
                break L27;
              }
            }
            field_A = 11;
            break L26;
          }
        }
        L28: {
          if (-12 == (field_A ^ -1)) {
            L29: {
              if (null == qc.field_k) {
                break L29;
              } else {
                L30: {
                  if (!qc.field_k.a((byte) -127)) {
                    break L30;
                  } else {
                    if (!qc.field_k.a(98)) {
                      break L30;
                    } else {
                      break L29;
                    }
                  }
                }
                ai.a((byte) 24, 0.0f, be.a(qc.field_k, wn.field_a, 125, d.field_C));
                break L28;
              }
            }
            field_A = 12;
            lo.field_d = true;
            break L28;
          } else {
            break L28;
          }
        }
        L31: {
          if ((field_A ^ -1) == -13) {
            if (lo.field_d) {
              break L31;
            } else {
              field_A = 13;
              break L31;
            }
          } else {
            break L31;
          }
        }
        L32: {
          if ((field_A ^ -1) == -14) {
            L33: {
              var3 = 1;
              if (bh.field_tb == null) {
                break L33;
              } else {
                L34: {
                  if (!bh.field_tb.d(-115)) {
                    stackOut_130_0 = 0;
                    stackIn_131_0 = stackOut_130_0;
                    break L34;
                  } else {
                    stackOut_129_0 = 1;
                    stackIn_131_0 = stackOut_129_0;
                    break L34;
                  }
                }
                var3 = stackIn_131_0;
                ai.a((byte) 24, bh.field_tb.field_e, bh.field_tb.field_g);
                break L33;
              }
            }
            if (var3 != 0) {
              field_A = 20;
              break L32;
            } else {
              break L32;
            }
          } else {
            break L32;
          }
        }
        L35: {
          if (param0) {
            break L35;
          } else {
            if (!tn.field_A) {
              break L35;
            } else {
              t.a(false, kj.field_D);
              ((qg) this).c(false);
              ap.a((byte) 117, kj.field_D);
              break L35;
            }
          }
        }
        L36: {
          if (!uf.field_d[8]) {
            break L36;
          } else {
            fk.a(14114);
            break L36;
          }
        }
    }

    final void b(byte param0) {
        if (param0 != -67) {
            return;
        }
        uf.field_d[4] = true;
    }

    final void i(int param0) {
        uf.field_d[param0] = true;
    }

    private final void a(byte param0) {
        int var2 = jl.field_e.l(255);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + ga.field_j;
        byte[] var5 = new byte[var4];
        if (param0 != 120) {
            return;
        }
        jl.field_e.a(false, 0, var4, var5);
        fk.a((byte) 114, uc.e((byte) -73), q.a(var5, (byte) 70), var3 != 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Open in popup window";
        field_t = false;
    }
}
