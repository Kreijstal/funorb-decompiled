/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qh {
    ob field_i;
    static byte[][] field_a;
    int field_e;
    static kl field_c;
    static int field_j;
    ob field_f;
    static int field_g;
    static int field_b;
    static int field_l;
    int field_k;
    int field_h;
    int field_d;

    final static int a(String param0, int param1, boolean param2, int param3, String param4, boolean param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = wizardrun.field_H;
                        if (null == jc.field_H) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!ol.a(124, param5)) {
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
                        if (param3 == -9) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return -113;
                    }
                    case 7: {
                        if (wh.field_j != tj.field_G) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        if (!param5) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var10 = null;
                        eh.field_e = uk.a((String) null, 8355711, pe.field_D, false, param0);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 10: {
                        eh.field_e = qb.a(param0, false, (byte) -90, param4);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        n.field_b.field_m = 0;
                        n.field_b.b((byte) 11, 14);
                        n.field_b.b((byte) 11, eh.field_e.a(true).field_a);
                        id.a((byte) -67, -1);
                        wh.field_j = pj.field_P;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (wh.field_j == pj.field_P) {
                            statePc = 14;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (hc.a(1, param3 ^ 28257)) {
                            statePc = 16;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var6 = nk.field_N.f(255);
                        if ((var6 ^ -1) == -1) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        wh.field_j = ta.field_c;
                        ra.field_k = var6;
                        gd.field_c = -1;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 18: {
                        wh.field_j = bd.field_b;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        nk.field_N.field_m = 0;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (bd.field_b != wh.field_j) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (hc.a(8, -28266)) {
                            statePc = 23;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        tg.field_g = nk.field_N.e((byte) 0);
                        nk.field_N.field_m = 0;
                        gi.a(param2, eh.field_e, true, param5, param1);
                        wh.field_j = vb.field_F;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (wh.field_j == vb.field_F) {
                            statePc = 26;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (!hc.a(1, -28266)) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        var6 = nk.field_N.f(255);
                        sf.field_b = null;
                        ra.field_k = var6;
                        nk.field_N.field_m = 0;
                        if (var6 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (1 == var6) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if ((var6 ^ -1) != -9) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        ql.a(-57);
                        n.field_a = false;
                        return var6;
                    }
                    case 31: {
                        gd.field_c = -1;
                        wh.field_j = ta.field_c;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 32: {
                        gd.field_c = -1;
                        wh.field_j = fc.field_b;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (fc.field_b == wh.field_j) {
                            statePc = 35;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        if (!bd.b(param3 + 71)) {
                            statePc = 75;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        pe.field_D = nk.field_N.e((byte) 0);
                        dd.field_m = nk.field_N.f(255);
                        int discarded$12 = nk.field_N.f(255);
                        hl.field_a = nk.field_N.j(-14477);
                        var11 = nk.field_N.c(-1);
                        var7 = nk.field_N.f(255);
                        if ((1 & var7 ^ -1) != -1) {
                            statePc = 38;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        fi.f(95);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (!param5) {
                            statePc = 41;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        if ((8 & var7) == 0) {
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
                        la.field_d = stackIn_44_0 != 0;
                        if (0 == (4 & var7)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        kd.field_c = stackIn_47_0 != 0;
                        if (la.field_d) {
                            statePc = 48;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        if (cb.field_g) {
                            statePc = 50;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        int discarded$13 = nk.field_N.f(255);
                        int discarded$14 = nk.field_N.f(param3 ^ -248);
                        int discarded$15 = nk.field_N.i(255);
                        ga.field_b = nk.field_N.j(-14477);
                        kh.field_f = new byte[ga.field_b];
                        var8 = 0;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if ((ga.field_b ^ -1) >= (var8 ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        kh.field_f[var8] = nk.field_N.k(0);
                        var8++;
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 53: {
                        d.field_a = nk.field_N.d(0);
                        var12 = (CharSequence) (Object) d.field_a;
                        wl.field_a = ta.a(-124, var12);
                        ei.field_t = nk.field_N.f(255);
                        wh.field_j = hi.field_l;
                        if (eh.field_e.a(true) == pc.field_v) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        if (eh.field_e.a(true) != ud.field_c) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        jf.field_e.a(jg.f(1), param3 ^ -8903);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 56: {
                        hd.field_C.a(jg.f(param3 + 10), 8910);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        n.field_a = false;
                        if (var11 != null) {
                            statePc = 59;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        q.a(26017, jg.f(1), var11);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        if ((hl.field_a ^ -1) < -1) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        if (kd.field_c) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        try {
                            Object discarded$16 = cl.a(jg.f(param3 ^ -10), -3264, "unzap");
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        var8_ref_Throwable = caughtException;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 66: {
                        try {
                            Object discarded$17 = cl.a(new Object[1], "zap", 30383, jg.f(1));
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        var8_ref_Throwable = caughtException;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 69: {
                        if ((hl.field_a ^ -1) >= -1) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        pf.field_g = true;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 71: {
                        n.field_b.a(uh.field_d, (byte) 109);
                        var8 = 0;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 72: {
                        if (var8 >= 4) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        uh.field_d[var8] = uh.field_d[var8] + 50;
                        var8++;
                        statePc = 72;
                        continue stateLoop;
                    }
                    case 74: {
                        nk.field_N.a(uh.field_d, (byte) 109);
                        return ra.field_k;
                    }
                    case 75: {
                        if (wh.field_j != ta.field_c) {
                            statePc = 84;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        if (!bd.b(param3 + 85)) {
                            statePc = 84;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        ql.a(-77);
                        if ((ra.field_k ^ -1) != -8) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        if (n.field_a) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        n.field_a = true;
                        return -1;
                    }
                    case 80: {
                        if (7 == ra.field_k) {
                            statePc = 82;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        ra.field_k = 3;
                        statePc = 83;
                        continue stateLoop;
                    }
                    case 83: {
                        bh.field_g = nk.field_N.d(0);
                        n.field_a = false;
                        return ra.field_k;
                    }
                    case 84: {
                        if (jc.field_H != null) {
                            statePc = 91;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        if (!n.field_a) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 86: {
                        if (eh.a(2) > 30000L) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        bh.field_g = fg.field_d;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 88: {
                        bh.field_g = sa.field_b;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        n.field_a = false;
                        return 3;
                    }
                    case 90: {
                        var6 = vl.field_d;
                        vl.field_d = tj.field_J;
                        n.field_a = true;
                        tj.field_J = var6;
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

    public static void b(byte param0) {
        field_a = null;
        if (param0 != -25) {
            Object var2 = null;
            int discarded$0 = qh.a((String) null, 125, true, 98, (String) null, false);
        }
        field_c = null;
    }

    final void a(byte param0) {
        if (((qh) this).field_f.field_b < 0) {
            ((qh) this).field_f.field_b = ((qh) this).field_f.field_b + 240;
            ((qh) this).field_i.field_b = ((qh) this).field_i.field_b - 1;
        }
        if (!(((qh) this).field_f.field_b < 240)) {
            ((qh) this).field_f.field_b = ((qh) this).field_f.field_b - 240;
            ((qh) this).field_i.field_b = ((qh) this).field_i.field_b + 1;
        }
        if (param0 <= 51) {
            Object var3 = null;
            int discarded$0 = ((qh) this).b((tg) null, 94);
        }
    }

    final void a(int param0, je[] param1, tg param2, int param3, int param4, int param5, vi param6, boolean param7, byte param8) {
        int var10 = 0;
        int var11 = 0;
        ob var12 = null;
        L0: {
          var11 = wizardrun.field_H;
          if (2 == param0) {
            break L0;
          } else {
            L1: {
              if (1 != ((qh) this).b(param2, -4)) {
                break L1;
              } else {
                if (-1 != (((qh) this).field_f.field_a ^ -1)) {
                  break L1;
                } else {
                  if (((qh) this).field_e < 0) {
                    ((qh) this).field_e = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              L3: {
                if ((((qh) this).b(param2, -4) ^ -1) == -1) {
                  break L3;
                } else {
                  if ((((qh) this).field_e ^ -1) < -1) {
                    break L3;
                  } else {
                    if (-1 <= (((qh) this).field_f.field_a ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.a(param2, -80);
              if ((param3 ^ -1) == -1) {
                return;
              } else {
                break L2;
              }
            }
            if ((param0 ^ -1) == -1) {
              L4: {
                var12 = new ob(((qh) this).field_i);
                ((qh) this).field_i.field_b = ((qh) this).field_i.field_b + ((qh) this).field_h;
                if ((((qh) this).b(param2, -4) ^ -1) == -1) {
                  ((qh) this).field_h = -((qh) this).field_h;
                  break L4;
                } else {
                  break L4;
                }
              }
              ((qh) this).field_i = var12;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L5: {
          if (-1 < (((qh) this).field_h ^ -1)) {
            ((qh) this).field_f.field_b = ((qh) this).field_f.field_b - param4;
            break L5;
          } else {
            ((qh) this).field_f.field_b = ((qh) this).field_f.field_b + param4;
            break L5;
          }
        }
        L6: {
          L7: {
            if (-2 == (param5 ^ -1)) {
              L8: {
                if (-1 <= (32 * ((qh) this).field_f.field_b / 240 + ((qh) this).field_i.field_b * 32 ^ -1)) {
                  ((qh) this).field_h = 1;
                  ((qh) this).field_f.field_b = ((qh) this).field_f.field_b + param4;
                  break L8;
                } else {
                  break L8;
                }
              }
              if (-641 > (((qh) this).field_f.field_b * 32 / 240 - (-(32 * ((qh) this).field_i.field_b) - ((qh) this).field_d) ^ -1)) {
                ((qh) this).field_f.field_b = ((qh) this).field_f.field_b - param4;
                ((qh) this).field_h = -1;
                break L7;
              } else {
                break L7;
              }
            } else {
              L9: {
                if ((((qh) this).field_i.field_b ^ -1) > 1) {
                  break L9;
                } else {
                  if ((((qh) this).field_i.field_b ^ -1) < -21) {
                    break L9;
                  } else {
                    var10 = 102 % ((param8 - 83) / 43);
                    ((qh) this).a((byte) 67);
                    break L6;
                  }
                }
              }
              ((qh) this).field_k = 1;
              break L7;
            }
          }
          var10 = 102 % ((param8 - 83) / 43);
          ((qh) this).a((byte) 67);
          break L6;
        }
    }

    private final void a(tg param0, int param1) {
        if (param1 > -29) {
            Object var4 = null;
            this.a((tg) null, 121);
        }
        if (((qh) this).field_e > -60) {
            ((qh) this).field_e = ((qh) this).field_e - 2;
        }
        ((qh) this).field_f.field_a = ((qh) this).field_f.field_a + ((qh) this).field_e;
        if (-1 < (((qh) this).field_f.field_a ^ -1)) {
            if (((qh) this).b(param0, -4) != 0) {
                ((qh) this).field_e = 0;
                ((qh) this).field_f.field_a = 0;
            } else {
                ((qh) this).field_f.field_a = ((qh) this).field_f.field_a + 240;
                ((qh) this).field_i.field_a = ((qh) this).field_i.field_a - 1;
            }
        }
        if (((qh) this).field_f.field_a >= 240) {
            if (!(((qh) this).field_i.field_a >= 15)) {
                ((qh) this).field_f.field_a = ((qh) this).field_f.field_a - 240;
                ((qh) this).field_i.field_a = ((qh) this).field_i.field_a + 1;
            }
        }
    }

    final void a(int param0, vi param1, boolean param2, je[] param3, byte param4, tg param5) {
        if (!((((qh) this).field_e ^ -1) >= 59)) {
            ((qh) this).field_e = ((qh) this).field_e - 2;
        }
        ((qh) this).field_f.field_a = ((qh) this).field_f.field_a + ((qh) this).field_e;
        if (!(0 <= ((qh) this).field_f.field_a)) {
            ((qh) this).field_f.field_a = ((qh) this).field_f.field_a + 240;
            ((qh) this).field_i.field_a = ((qh) this).field_i.field_a - 1;
        }
        if (param4 != -15) {
            return;
        }
        if (((qh) this).field_h < 0) {
            ((qh) this).field_f.field_b = ((qh) this).field_f.field_b - param0;
        } else {
            ((qh) this).field_f.field_b = ((qh) this).field_f.field_b + param0;
        }
        if (!(((qh) this).field_f.field_a < 240)) {
            ((qh) this).field_f.field_a = ((qh) this).field_f.field_a - 240;
            ((qh) this).field_i.field_a = ((qh) this).field_i.field_a + 1;
        }
        if ((((qh) this).field_i.field_b ^ -1) <= 0) {
            // if_icmpge L210
        }
        ((qh) this).field_k = 1;
        ((qh) this).a((byte) 85);
    }

    final static void a(boolean param0) {
        if (param0) {
            qh.b(false);
        }
    }

    final int b(tg param0, int param1) {
        int var5 = wizardrun.field_H;
        ((qh) this).a((byte) 66);
        ob var6 = new ob(((qh) this).field_i);
        ob var3 = var6;
        var3.field_a = var3.field_a - 1;
        int var4 = param1 + (32 * ((qh) this).field_f.field_b / 240 + ((qh) this).field_d);
        if (0 > var3.field_a) {
            return 0;
        }
        while (0 < var4) {
            if (!(1 != param0.field_f[var6.a((byte) -68)])) {
                return 1;
            }
            var3.field_b = var3.field_b + 1;
            var4 -= 32;
        }
        return 0;
    }

    qh() {
        ((qh) this).field_h = 0;
        ((qh) this).field_k = 0;
        ((qh) this).field_e = 0;
        ((qh) this).field_d = 24;
        ((qh) this).field_i = new ob();
        ((qh) this).field_f = new ob();
    }

    final static void b(boolean param0) {
        int var2_int = 0;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        o var6 = null;
        o var7 = null;
        o var7_ref = null;
        o var8 = null;
        var4 = wizardrun.field_H;
        ed.a(243, 197, 369, 143, 16777215);
        ed.c(244, 198, 367, 141, 0);
        if (null != f.field_d) {
          L0: {
            var6 = f.field_d[ej.field_c];
            var7 = var6;
            var7 = var6;
            if (var6 == null) {
              if (null != bk.field_a) {
                int discarded$3 = bk.field_a.a(wj.field_G, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L0;
              } else {
                break L0;
              }
            } else {
              var6.e(245, 199);
              break L0;
            }
          }
          L1: {
            if (fl.field_M <= od.field_j) {
              break L1;
            } else {
              var7_ref = f.field_d[ra.field_o];
              if (var7_ref == null) {
                break L1;
              } else {
                var2_int = (60 + var7_ref.field_x) * od.field_j / fl.field_M;
                var3 = var2_int + -30;
                if (!ei.field_j) {
                  lb.a((-var3 + var7_ref.field_x) * 256 / 30, -256 * var3 / 30, 245, var7_ref, 199, -107);
                  break L1;
                } else {
                  lb.a(-256 * var3 / 30, 256 * (-var3 + var7_ref.field_x) / 30, 245, var7_ref, 199, -83);
                  break L1;
                }
              }
            }
          }
          L2: {
            if (param0) {
              break L2;
            } else {
              field_c = null;
              break L2;
            }
          }
          L3: {
            if (null != bk.field_a) {
              var2 = null;
              var5 = 0;
              var3 = var5;
              L4: while (true) {
                if ((f.field_d.length ^ -1) >= (var5 ^ -1)) {
                  if (var2 == null) {
                    break L3;
                  } else {
                    int discarded$4 = bk.field_a.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L3;
                  }
                } else {
                  L5: {
                    var8 = f.field_d[var5];
                    if (var8 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (-366 != (var8.field_x ^ -1)) {
                          break L6;
                        } else {
                          if (var8.field_s == 139) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var2 == null) {
                        var2 = Integer.toString(var5);
                        break L5;
                      } else {
                        var2 = var2 + ", " + var5;
                        break L5;
                      }
                    }
                  }
                  var5++;
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          return;
        } else {
          if (null == bk.field_a) {
            return;
          } else {
            int discarded$5 = bk.field_a.a(wj.field_G, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[50][];
        field_b = 0;
    }
}
