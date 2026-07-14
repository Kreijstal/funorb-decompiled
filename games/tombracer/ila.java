/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ila {
    private vna field_d;
    private boolean field_e;
    private boolean field_c;
    private vna field_b;
    private gqa field_a;

    final void d(boolean param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!(((ila) this).field_e)) {
            return;
        }
        if (!param0) {
            ((ila) this).field_a = null;
        }
        jha var4 = (jha) (Object) ((ila) this).field_d.f(-80);
        while (var4 != null) {
            var4.b((byte) -111);
            var4 = (jha) (Object) ((ila) this).field_d.e(107);
        }
    }

    final boolean b(int param0) {
        if (param0 != 4782) {
            ((ila) this).field_d = null;
        }
        return ((ila) this).field_e;
    }

    private final gqa f(int param0) {
        if (param0 != 1366884705) {
            ((ila) this).d(-116);
        }
        if (ara.field_xb == 0) {
            return null;
        }
        return wea.field_d[-1 + ara.field_xb];
    }

    final void a(byte param0, boolean param1, boolean param2) {
        gqa var4 = null;
        int var5 = 0;
        int var6 = 0;
        jha var7 = null;
        String[] var7_array = null;
        int var8 = 0;
        gqa var8_ref_gqa = null;
        int var9 = 0;
        String[] var10 = null;
        gqa var11 = null;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param1) {
            ((ila) this).g(0);
            break L0;
          } else {
            this.b(false);
            break L0;
          }
        }
        if (param1) {
          L1: {
            if (null == ((ila) this).field_a) {
              ((ila) this).field_a = this.f(1366884705);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var11 = this.f(1366884705);
            var4 = var11;
            var5 = -127 % ((param0 - -34) / 44);
            if (var11 == null) {
              break L2;
            } else {
              if (((ila) this).field_a != var11) {
                var6 = 0;
                var10 = new String[10];
                var7_array = var10;
                L3: while (true) {
                  L4: {
                    if (-11 >= (var6 ^ -1)) {
                      break L4;
                    } else {
                      if (0 > -var6 + (ara.field_xb - 1)) {
                        break L4;
                      } else {
                        var8_ref_gqa = wea.field_d[-1 + ara.field_xb - var6];
                        if (var8_ref_gqa == ((ila) this).field_a) {
                          break L4;
                        } else {
                          if (var8_ref_gqa.field_f != null) {
                            if (var8_ref_gqa.field_m) {
                              var10[var6] = var8_ref_gqa.field_f;
                              var6++;
                              continue L3;
                            } else {
                              var6++;
                              continue L3;
                            }
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var8 = 9;
                  L5: while (true) {
                    if (-1 < (var8 ^ -1)) {
                      ((ila) this).field_a = var11;
                      break L2;
                    } else {
                      if (null != var10[var8]) {
                        if ("" != var10[var8]) {
                          ((ila) this).a(0, eea.a(var10[var8], (byte) -62));
                          var8--;
                          continue L5;
                        } else {
                          var8--;
                          continue L5;
                        }
                      } else {
                        var8--;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
          }
          L6: {
            var6 = 120;
            if (!((ila) this).field_e) {
              break L6;
            } else {
              var7 = (jha) (Object) ((ila) this).field_b.f(-80);
              L7: while (true) {
                if (var7 == null) {
                  var7 = (jha) (Object) ((ila) this).field_d.f(-80);
                  L8: while (true) {
                    if (var7 == null) {
                      break L6;
                    } else {
                      L9: {
                        var7.a(var6, 4, aaa.a(false) - var7.c((byte) -96));
                        var7.a(-43);
                        if (var7.c(-1)) {
                          var6 = var6 + var7.a(true);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (var7.e((byte) -39)) {
                          var7.p(3);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var7 = (jha) (Object) ((ila) this).field_d.e(121);
                      continue L8;
                    }
                  }
                } else {
                  L11: {
                    var7.d((byte) 80);
                    if (-1 > (var7.a((byte) -100) ^ -1)) {
                      break L11;
                    } else {
                      ((ila) this).field_d.b((byte) -77, (vg) (Object) var7);
                      break L11;
                    }
                  }
                  var7 = (jha) (Object) ((ila) this).field_b.e(111);
                  continue L7;
                }
              }
            }
          }
          L12: {
            if (!((ila) this).field_c) {
              break L12;
            } else {
              rk.b(108, param1, aaa.a(false) >> 1970883489, koa.b(0) >> -2076865759);
              String discarded$1 = fa.a((byte) -127);
              break L12;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, jha param2) {
        L0: {
          if (param2 == null) {
            break L0;
          } else {
            if (param2.b(29161) != null) {
              if (!((ila) this).field_e) {
                return;
              } else {
                L1: {
                  if ((param0 ^ -1) < -1) {
                    ((ila) this).field_b.b((byte) -80, (vg) (Object) param2);
                    param2.a(false, param0);
                    break L1;
                  } else {
                    ((ila) this).field_d.b((byte) -67, (vg) (Object) param2);
                    break L1;
                  }
                }
                L2: {
                  if (param1 == 0) {
                    break L2;
                  } else {
                    ((ila) this).field_e = true;
                    break L2;
                  }
                }
                param2.a(false, 25, 12, 150);
                param2.a(1, aaa.a(false) / 3);
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    private final void c(boolean param0) {
        if (!(!((ila) this).field_c)) {
            return;
        }
        aka.j(28191);
        int var2 = 4;
        int var3 = 16;
        av.a(koa.b(0) >> 1092439713, 20, var2, -5327, "", var2, var3, var3, aaa.a(param0) >> 1366884705);
        ((ila) this).field_c = true;
    }

    final static int a(boolean param0, String param1, int param2, int param3, String param4, boolean param5) {
        try {
            int var6 = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            CharSequence var11 = null;
            int stackIn_39_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_50_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_38_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = TombRacer.field_G ? 1 : 0;
                        if (oba.field_e != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (joa.a(param5, (byte) 121)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return -1;
                    }
                    case 3: {
                        if (param2 == 50) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return -82;
                    }
                    case 5: {
                        if (sua.field_G != km.field_p) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (!param5) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var10 = null;
                        fd.field_d = b.a(param1, 0, (String) null, false, tr.field_g);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 8: {
                        fd.field_d = via.a(param1, 64, false, param4);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ql.field_k.field_h = 0;
                        ql.field_k.i(14, 0);
                        ql.field_k.i(fd.field_d.a((byte) 113).field_d, 0);
                        bl.a(-1, -1);
                        km.field_p = bva.field_b;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (km.field_p != bva.field_b) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (!ama.a(1, -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var6 = vc.field_q.h(255);
                        if (-1 == (var6 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        km.field_p = bi.field_a;
                        oka.field_z = var6;
                        uca.field_d = -1;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        km.field_p = ola.field_yb;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        vc.field_q.field_h = 0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (ola.field_yb != km.field_p) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (ama.a(8, -1)) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        ra.field_L = vc.field_q.b(290646880);
                        vc.field_q.field_h = 0;
                        ova.a((byte) 121, param5, param3, fd.field_d, param0);
                        km.field_p = ria.field_o;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (km.field_p == ria.field_o) {
                            statePc = 22;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (ama.a(1, param2 + -51)) {
                            statePc = 24;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        var6 = vc.field_q.h(param2 + 205);
                        vc.field_q.field_h = 0;
                        oka.field_z = var6;
                        ji.field_d = null;
                        if (-1 == var6) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (-2 == var6) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (8 != var6) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        dea.a(60);
                        uc.field_L = false;
                        return var6;
                    }
                    case 28: {
                        km.field_p = bi.field_a;
                        uca.field_d = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        km.field_p = eo.field_w;
                        uca.field_d = -1;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (eo.field_w != km.field_p) {
                            statePc = 77;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (!cla.g(0)) {
                            statePc = 77;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        tr.field_g = vc.field_q.b(param2 + 290646830);
                        gj.field_q = param1;
                        ld.field_e = vc.field_q.h(param2 ^ 205);
                        rja.field_e = vc.field_q.h(255);
                        wla.field_ub = vc.field_q.d(124);
                        var6_ref = vc.field_q.c(param2 + -28740);
                        var7 = vc.field_q.h(255);
                        if ((var7 & 1) != 0) {
                            statePc = 34;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        rra.a(84);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (param5) {
                            statePc = 47;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if (0 == (var7 & 4)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        stackOut_37_0 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 38: {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        ai.field_a = stackIn_39_0 != 0;
                        if ((2 & var7) == 0) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        stackOut_40_0 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 41: {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        ok.field_s = stackIn_42_0 != 0;
                        if ((8 & var7) == 0) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 44: {
                        stackOut_44_0 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        fua.field_g = stackIn_45_0 != 0;
                        if (!fua.field_g) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        ok.field_s = true;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (0 == (var7 & 16)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        stackOut_48_0 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 49: {
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        ha.field_b = stackIn_50_0 != 0;
                        if (!q.field_r) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        int discarded$10 = vc.field_q.h(255);
                        int discarded$11 = vc.field_q.h(255);
                        int discarded$12 = vc.field_q.e(-104);
                        kl.field_k = vc.field_q.d(121);
                        np.field_J = new byte[kl.field_k];
                        var8 = 0;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (var8 >= kl.field_k) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        np.field_J[var8] = vc.field_q.c((byte) 103);
                        var8++;
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 54: {
                        fna.field_k = vc.field_q.e((byte) -76);
                        var11 = (CharSequence) (Object) fna.field_k;
                        tia.field_b = jd.a(1, var11);
                        lsa.field_a = vc.field_q.h(255);
                        km.field_p = uga.field_n;
                        if (fd.field_d.a((byte) 113) == boa.field_s) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        if (fd.field_d.a((byte) 113) == vm.field_f) {
                            statePc = 57;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        ub.field_d.a(di.a(109), 5);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 58: {
                        vw.field_a.a(di.a(120), param2 ^ 55);
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        uc.field_L = false;
                        if (var6_ref != null) {
                            statePc = 61;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        mp.a(var6_ref, di.a(41), -21407);
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if (0 < wla.field_ub) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        if (!ai.field_a) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        try {
                            Object discarded$13 = lb.a(param2 ^ -114, "zap", di.a(param2 + 43), new Object[1]);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        var8_ref_Throwable = caughtException;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 68: {
                        try {
                            Object discarded$14 = lb.b(di.a(26), 2864, "unzap");
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        var8_ref_Throwable = caughtException;
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 71: {
                        if (0 >= wla.field_ub) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        ft.field_a = true;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 73: {
                        ql.field_k.a(-26185, qi.field_K);
                        var8 = 0;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        if (4 <= var8) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        qi.field_K[var8] = qi.field_K[var8] + 50;
                        var8++;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 76: {
                        vc.field_q.a(param2 ^ -26235, qi.field_K);
                        return oka.field_z;
                    }
                    case 77: {
                        if (bi.field_a == km.field_p) {
                            statePc = 79;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        if (!cla.g(0)) {
                            statePc = 87;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    }
                    case 80: {
                        dea.a(60);
                        if (-8 != (oka.field_z ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        if (uc.field_L) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    }
                    case 82: {
                        uc.field_L = true;
                        return -1;
                    }
                    case 83: {
                        if (7 == oka.field_z) {
                            statePc = 85;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    }
                    case 85: {
                        oka.field_z = 3;
                        statePc = 86;
                        continue stateLoop;
                    }
                    case 86: {
                        io.field_b = vc.field_q.e((byte) -76);
                        uc.field_L = false;
                        return oka.field_z;
                    }
                    case 87: {
                        if (null == oba.field_e) {
                            statePc = 89;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    }
                    case 89: {
                        if (uc.field_L) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        var6 = nn.field_b;
                        nn.field_b = uq.field_a;
                        uq.field_a = var6;
                        uc.field_L = true;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 91: {
                        if ((rf.b((byte) -121) ^ -1L) < -30001L) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        io.field_b = sq.field_x;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 93: {
                        io.field_b = hb.field_u;
                        statePc = 94;
                        continue stateLoop;
                    }
                    case 94: {
                        uc.field_L = false;
                        return 3;
                    }
                    case 95: {
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

    final boolean a(int param0, int param1, char param2) {
        if (param1 != -1) {
            ila.a(false);
        }
        if (!((ila) this).field_c) {
            return false;
        }
        int var4 = 0;
        var4 = dha.a(13, 12, (byte) -107, 15) ? 1 : 0;
        return var4 != 0;
    }

    final void g(int param0) {
        if (!(!((ila) this).field_e)) {
            return;
        }
        ((ila) this).field_e = true;
        ((ila) this).field_d.d(8);
        if (param0 != 0) {
            ((ila) this).field_a = null;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            int discarded$0 = ila.a(false, (String) null, 15, -14, (String) null, true);
        }
        qw.a(256);
    }

    final static gqa a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        kh var8 = null;
        wua var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_21_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        Object stackOut_19_0 = null;
        int[] stackOut_20_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TombRacer.field_G ? 1 : 0;
                    var8 = vc.field_q;
                    var3 = var8.h(param0 + 19042);
                    gja.field_x = 127 & var3;
                    if ((128 & var3) == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    sb.field_b = stackIn_3_0 != 0;
                    jda.field_m = var8.h(255);
                    cca.field_z = var8.b(param0 ^ -290628099);
                    if (gja.field_x == 2) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    gb.field_a = 0;
                    ega.field_b = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    gb.field_a = var8.d(127);
                    ega.field_b = var8.a(-32768);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-2 != (var8.h(param0 + 19042) ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    esa.field_c = var8.e((byte) -76);
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    gia.field_q = esa.field_c;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    gia.field_q = var8.e((byte) -76);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (gja.field_x == -2) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (-5 == gja.field_x) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    era.field_a = 0;
                    dga.field_a = null;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    era.field_a = var8.d(122);
                    dga.field_a = var8.e((byte) -76);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (!param1) {
                        statePc = 24;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = var8.d(121);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        var9 = qu.field_a.a(false, var5);
                        hi.field_p = var9.b((byte) -5);
                        if (!gia.field_q.equals((Object) (Object) fna.field_k)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = null;
                        stackIn_21_0 = (int[]) (Object) stackOut_19_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var9.field_m;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        qra.field_e = stackIn_21_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var6 = (Exception) (Object) caughtException;
                    ssa.a("CC1", (byte) 115, (Throwable) (Object) var6);
                    hi.field_p = null;
                    qra.field_e = null;
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    hi.field_p = dl.a((uia) (Object) var8, 80, -117);
                    qra.field_e = null;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (param0 == -18787) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    ila.a(true);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return new gqa(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, jha param1) {
        ((ila) this).a(param0, 0, param1);
    }

    final void a(int param0) {
        ((ila) this).g(0);
        this.c(false);
        if (param0 >= -57) {
            ((ila) this).field_b = null;
        }
    }

    private final void b(boolean param0) {
        if (!(((ila) this).field_e)) {
            return;
        }
        ((ila) this).field_e = param0 ? true : false;
        ((ila) this).field_d.d(8);
    }

    final boolean e(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -8832) {
            break L0;
          } else {
            gqa discarded$2 = this.f(-98);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((ila) this).field_c) {
              break L2;
            } else {
              if (!ni.field_c) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void d(int param0) {
        this.b(false);
        ((ila) this).c(-59);
        int var2 = -75 / ((31 - param0) / 57);
    }

    final void c(int param0) {
        int var2 = -48 % ((2 - param0) / 41);
        if (!((ila) this).field_c) {
            return;
        }
        cn.e(19470);
        ((ila) this).field_c = false;
    }

    ila() {
        ((ila) this).field_e = false;
        ((ila) this).field_c = false;
        ((ila) this).field_d = new vna();
        ((ila) this).field_b = new vna();
    }

    static {
    }
}
