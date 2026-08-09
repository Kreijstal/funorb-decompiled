/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tk extends nc {
    static int field_m;
    static cj field_l;
    static int field_n;
    static String field_o;
    static java.awt.Canvas field_q;
    private int field_p;

    private final void e(int param0) {
        if (param0 >= -88) {
            this.e(-105);
        }
        on.field_bb = new ki[63];
    }

    private final void b(int param0, int param1, int param2) {
        int stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param2 == -2939) {
            break L0;
          } else {
            field_o = (String) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= 3) {
              break L2;
            } else {
              var5 = var4 * 73;
              s.field_c.a(420 - -var5, 341);
              if (var9 != 0) {
                break L2;
              } else {
                L3: {
                  if (!s.field_c.b(var5 + 420, 341, bd.field_g, bo.field_d)) {
                    break L3;
                  } else {
                    q.field_d = 5 + var4;
                    break L3;
                  }
                }
                L4: {
                  var6 = ll.field_k.field_s[var4];
                  if (255 == var6) {
                    break L4;
                  } else {
                    if (-64 < (var6 ^ -1)) {
                      L5: {
                        var7 = ll.field_k.d(var6, param2 + 2992) ? 1 : 0;
                        wa.field_b[var6 + -18].g(429 + var5, 357);
                        var8 = ll.field_k.field_t[var6];
                        if (ll.field_k.d(var6, 53)) {
                          var8 = cr.a(var6, -97);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        var8 = var8 * 29 / cr.a(var6, -109);
                        stackIn_15_0 = 473 - -var5;

                        stackIn_15_1 = -var8 + 386;

                        stackIn_15_2 = 7;

                        stackIn_15_3 = var8;

                        if (var7 == 0) {
                          stackIn_16_0 = stackIn_15_0;
                          stackIn_16_1 = stackIn_15_1;
                          stackIn_16_2 = stackIn_15_2;
                          stackIn_16_3 = stackIn_15_3;
                          stackIn_16_4 = param1;
                          break L6;
                        } else {
                          stackIn_16_0 = stackIn_15_0;
                          stackIn_16_1 = stackIn_15_1;
                          stackIn_16_2 = stackIn_15_2;
                          stackIn_16_3 = stackIn_15_3;
                          stackIn_16_4 = param0;
                          break L6;
                        }
                      }
                      oo.e(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4);
                      if (!h.i(51603)) {
                        break L4;
                      } else {
                        if (!jk.a((byte) -70, var6)) {
                          break L4;
                        } else {
                          el.field_E.a(var5 + 419, 345);
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                var4++;
                if (var9 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final void a(boolean param0) {
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        Object var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    super.a(param0);
                    b.field_a.a(41, b.field_a.field_zb, 850, wa.field_g);
                    b.field_a.c(false, -1);
                    cp.field_O = -1;
                    kn.field_b = -1;
                    q.field_d = -1;
                    oo.h(0, 53, 640, 85);
                    var2 = 112;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 >= 3) {
                        statePc = 15;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_16_0 = bo.field_d;
                    stackIn_3_0 = stackIn_16_0;
                    if (var7 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 < 43) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if ((bo.field_d ^ -1) < -79) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if ((var2 ^ -1) < (bd.field_g ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var2 + 120 < bd.field_g) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    kn.field_b = var3;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var3 == ao.field_d) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var3 != kn.field_b) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (ud.field_S) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var6_int = 3884288;
                    var5 = 3202868;
                    var4 = 16768544;
                    if (var7 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4 = 8886132;
                    var6_int = 1774864;
                    var5 = 44800;
                    if (var7 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var5 = 65280;
                    var4 = 16768512;
                    var6_int = 1783040;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    oo.e(var2, 43, 120, 35, 10, var4);
                    oo.a(var2 - -2, 45, 116, 31, 10, var5, var6_int);
                    pb.field_e.b(fl.field_b[var3], 60 + var2, 69, 16646020, -1);
                    var2 += 141;
                    var3++;
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.a(56, 86, 172, 18, (byte) -92);
                    var3 = 0;
                    stackIn_16_0 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var4 = stackIn_16_0;
                    var5 = 0;
                    if (-256 != (lh.field_l ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (32 > lh.field_l) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (-39 > (lh.field_l ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var5 = stackIn_22_0;
                    if (lh.field_l < 44) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((lh.field_l ^ -1) < -63) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = 1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var4 = stackIn_26_0;
                    if (lh.field_l < 0) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if ((lh.field_l ^ -1) <= -20) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var3 = stackIn_30_0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = 7;
                    stackIn_32_0 = stackIn_33_0;
                    stackIn_33_1 = 337;
                    stackIn_32_1 = stackIn_33_1;
                    stackIn_33_2 = 328;
                    stackIn_32_2 = stackIn_33_2;
                    stackIn_33_3 = 80;
                    stackIn_32_3 = stackIn_33_3;
                    if (var3 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = stackIn_32_0;
                    stackIn_34_1 = stackIn_32_1;
                    stackIn_34_2 = stackIn_32_2;
                    stackIn_34_3 = stackIn_32_3;
                    stackIn_34_4 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = stackIn_33_0;
                    stackIn_34_1 = stackIn_33_1;
                    stackIn_34_2 = stackIn_33_2;
                    stackIn_34_3 = stackIn_33_3;
                    stackIn_34_4 = 16711680;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    oo.f(stackIn_34_0, stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4, 128);
                    stackIn_36_0 = 337;
                    stackIn_35_0 = stackIn_36_0;
                    stackIn_36_1 = 337;
                    stackIn_35_1 = stackIn_36_1;
                    stackIn_36_2 = 296;
                    stackIn_35_2 = stackIn_36_2;
                    stackIn_36_3 = 80;
                    stackIn_35_3 = stackIn_36_3;
                    if (var4 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = stackIn_35_0;
                    stackIn_37_1 = stackIn_35_1;
                    stackIn_37_2 = stackIn_35_2;
                    stackIn_37_3 = stackIn_35_3;
                    stackIn_37_4 = 16711680;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = stackIn_36_0;
                    stackIn_37_1 = stackIn_36_1;
                    stackIn_37_2 = stackIn_36_2;
                    stackIn_37_3 = stackIn_36_3;
                    stackIn_37_4 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    oo.f(stackIn_37_0, stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_37_4, 128);
                    oo.a(9, 339, 74, 76, 0);
                    oo.a(10, 340, 72, 74, 6575425, 3354915);
                    oo.a(339, 339, 74, 76, 0);
                    oo.a(340, 340, 72, 74, 1989419, 597262);
                    qp.field_w.a(ve.field_a, 10, 340, 72, 74, 16777215, -1, 1, 1, 0);
                    qp.field_w.a(en.field_f, 339, 339, 72, 74, 16777215, -1, 1, 1, 0);
                    this.a(var5 != 0, (byte) -120, 14680064, 53248);
                    this.b(14680064, 53248, -2939);
                    this.d((byte) -104);
                    this.e((byte) -67);
                    if (-256 == (lh.field_l ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var6 = null;
                    if (lh.field_l < 0) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if ((lh.field_l ^ -1) > -20) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (32 > lh.field_l) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (lh.field_l <= 38) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (lh.field_l < 44) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (lh.field_l > 62) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var6 = wa.field_b[-44 + (lh.field_l + 26)];
                    statePc = 49;
                    continue stateLoop;
                }
                case 47: {
                    var6 = wa.field_b[lh.field_l + -32 - -19];
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    var6 = wa.field_b[lh.field_l];
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var6 == null) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((ja) (var6)).c(bd.field_g + -8, bo.field_d - 8, 200);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        int stackIn_3_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_26_0 = 0;
        boolean stackOut_16_0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    if ((kj.field_q ^ -1) > -3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var2 = stackIn_3_0;
                    var7 = sj.field_p;
                    if (var7 == 1) {
                        statePc = 13;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (10 == var7) {
                        statePc = 36;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (11 != var7) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var10 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if ((var7 ^ -1) != -6) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var10 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var7 == 12) {
                        statePc = 102;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var2 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4 = 8;
                    var7 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var7 >= 5) {
                        statePc = 25;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var3 = ll.field_k.field_m[var7];
                    stackOut_16_0 = ll.field_k.c(127, var3);
                    stackIn_26_0 = stackOut_16_0 ? 1 : 0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var10 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (!stackIn_17_0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (!ll.field_k.d(var3, 53)) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ll.field_k.a(34, var4, var3);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var3 = ll.field_k.field_g[var7];
                    if (!ll.field_k.c(127, var3)) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (ll.field_k.d(var3, 53)) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ll.field_k.a(-88, var4, var3);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var7++;
                    if (var10 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var7 = stackIn_26_0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((var7 ^ -1) <= -4) {
                        statePc = 34;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var3 = ll.field_k.field_s[var7];
                    if (var10 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (!ll.field_k.c(127, var3)) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (!ll.field_k.d(var3, 53)) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ll.field_k.a(-98, var4, var3);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var7++;
                    if (var10 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.e(-100);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var10 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var2 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var10 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var5 = hp.a((byte) 29, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (ll.field_k.d(var5, 53)) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ll.field_k.a(40, 10, var5);
                    this.e(-125);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var5 = hp.a((byte) -77, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!ll.field_k.d(var5, 53)) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ll.field_k.a(-106, 10, var5);
                    this.e(-106);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var5 = hp.a((byte) -74, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (ll.field_k.d(var5, 53)) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    ll.field_k.a(91, 10, var5);
                    this.e(-95);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var5 = hp.a((byte) -91, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (ll.field_k.d(var5, 53)) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ll.field_k.a(117, 10, var5);
                    this.e(-121);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var5 = hp.a((byte) 123, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (!ll.field_k.d(var5, 53)) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ll.field_k.a(125, 10, var5);
                    this.e(-122);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var5 = hp.a((byte) -115, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 60;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (!ll.field_k.d(var5, 53)) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    ll.field_k.a(-100, 10, var5);
                    this.e(-90);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var5 = hp.a((byte) -69, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 64;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (!ll.field_k.d(var5, 53)) {
                        statePc = 63;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 63: {
                    ll.field_k.a(56, 10, var5);
                    this.e(-100);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var5 = hp.a((byte) -125, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (ll.field_k.d(var5, 53)) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    ll.field_k.a(97, 10, var5);
                    this.e(-117);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var5 = hp.a((byte) 82, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (ll.field_k.d(var5, 53)) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    ll.field_k.a(76, 10, var5);
                    this.e(-101);
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var5 = hp.a((byte) 104, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (!ll.field_k.d(var5, 53)) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    ll.field_k.a(76, 10, var5);
                    this.e(-109);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var5 = hp.a((byte) -85, g.field_a, 63);
                    if (!ll.field_k.c(127, var5)) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (!ll.field_k.d(var5, 53)) {
                        statePc = 77;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 77: {
                    ll.field_k.a(-100, 10, var5);
                    this.e(-92);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    ll.field_k.c((byte) -108);
                    if (var10 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var2 != 0) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var10 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    ll.field_k.field_f = 0L;
                    ll.field_k.field_n = ej.a((byte) 120);
                    var7 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if ((ll.field_k.field_t.length ^ -1) >= (var7 ^ -1)) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    ll.field_k.field_t[var7] = 0;
                    var7++;
                    if (var10 != 0) {
                        statePc = 88;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var10 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    this.e(-100);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (var10 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var2 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var6 = new int[]{58, 0, 53, 59, 8, 32, 3, 52, 9, 2, 56, 10, 51, 1, 61, 60, 4, 54, 57, 34, 55, 50, 11, 49, 33, 7, 16};
                    var11 = var6;
                    var8 = 0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (var11.length <= var8) {
                        statePc = 123;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var9 = var11[var8];
                    ll.field_k.a(-86, 9999, var9);
                    var8++;
                    if (var10 != 0) {
                        statePc = 125;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var10 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (var2 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var6 = new int[]{58, 0, 53, 59, 8, 32, 3, 52, 9, 2, 56, 10, 51, 1, 61, 60, 4, 54, 57, 34, 55, 50, 11, 49, 33, 7, 16};
                    var12 = var6;
                    var8 = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (var12.length <= var8) {
                        statePc = 123;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var9 = var12[var8];
                    ll.field_k.a(-86, 9999, var9);
                    var8++;
                    if (var10 != 0) {
                        statePc = 125;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (var10 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var2 != 0) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (var10 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    ll.field_k.e(-6821, 33);
                    ll.field_k.e(-6821, 2);
                    ll.field_k.e(-6821, 57);
                    ll.field_k.e(-6821, 0);
                    ll.field_k.e(-6821, 1);
                    ll.field_k.e(-6821, 58);
                    ll.field_k.c((byte) -93);
                    ll.field_k.e(-6821, 16);
                    var7 = 0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (-20 >= (var7 ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    ll.field_k.e(-6821, var7);
                    var7++;
                    if (var10 != 0) {
                        statePc = 112;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var10 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var7 = 44;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if ((var7 ^ -1) <= -63) {
                        statePc = 116;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    ll.field_k.e(-6821, var7);
                    var7++;
                    if (var10 != 0) {
                        statePc = 118;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (var10 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var7 = 32;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (var7 > 38) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    ll.field_k.e(-6821, var7);
                    var7++;
                    if (var10 != 0) {
                        statePc = 125;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var10 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    this.e(-109);
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    super.c(param0);
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, byte param1, int param2, int param3) {
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int statePc = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ZombieDawnMulti.field_E ? 1 : 0;
                    var5 = ll.field_k.g((byte) 125);
                    var6 = 0;
                    if (param1 == -120) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (-6 >= (var6 ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var7 = 50 * var6;
                    if (var13 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (!pf.field_a.b(84 + var7, 340, bd.field_g, bo.field_d)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    q.field_d = var6;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var5 > var6) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    pf.field_a.a(var7 + 84, 340, 32);
                    if (var13 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (!param0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (pb.a(ll.field_k.field_m[var6], -20, lh.field_l)) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    pf.field_a.a(var7 + 84, 340);
                    if (var13 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    pf.field_a.a(var7 + 84, 340, 128, 8388608);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var8 = ll.field_k.field_m[var6];
                    var9 = ll.field_k.field_g[var6];
                    if (-256 == (var8 ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (-64 >= (var8 ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var10 = ll.field_k.d(var8, 53) ? 1 : 0;
                    var11 = ll.field_k.d(var9, param1 ^ -67) ? 1 : 0;
                    wa.field_b[var8].g(90 - -var7, 354);
                    var12 = ll.field_k.field_t[var8];
                    if (var10 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var12 = cr.a(var8, -111);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var12 = 28 * var12 / cr.a(var8, -112);
                    stackIn_21_0 = var7 + 120;
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = 378 - var12;
                    stackIn_20_1 = stackIn_21_1;
                    stackIn_21_2 = 8;
                    stackIn_20_2 = stackIn_21_2;
                    stackIn_21_3 = var12;
                    stackIn_20_3 = stackIn_21_3;
                    if (var10 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = stackIn_20_0;
                    stackIn_22_1 = stackIn_20_1;
                    stackIn_22_2 = stackIn_20_2;
                    stackIn_22_3 = stackIn_20_3;
                    stackIn_22_4 = param3;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = stackIn_21_0;
                    stackIn_22_1 = stackIn_21_1;
                    stackIn_22_2 = stackIn_21_2;
                    stackIn_22_3 = stackIn_21_3;
                    stackIn_22_4 = param2;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    oo.e(stackIn_22_0, stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4);
                    if ((var9 ^ -1) == -256) {
                        statePc = 33;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (63 > var9) {
                        statePc = 25;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 25: {
                    wa.field_b[-13 + var9].g(90 + var7, 384);
                    if (var6 != q.field_d) {
                        statePc = 26;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = ll.field_k.field_t[var9];
                    if (ll.field_k.d(var9, 53)) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var12 = cr.a(var9, param1 ^ 10);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var12 = var12 * 28 / cr.a(var9, -115);
                    stackIn_31_0 = 120 - -var7;
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = -var12 + 410;
                    stackIn_30_1 = stackIn_31_1;
                    stackIn_31_2 = 8;
                    stackIn_30_2 = stackIn_31_2;
                    stackIn_31_3 = var12;
                    stackIn_30_3 = stackIn_31_3;
                    if (var11 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = stackIn_30_0;
                    stackIn_32_1 = stackIn_30_1;
                    stackIn_32_2 = stackIn_30_2;
                    stackIn_32_3 = stackIn_30_3;
                    stackIn_32_4 = param3;
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = stackIn_31_0;
                    stackIn_32_1 = stackIn_31_1;
                    stackIn_32_2 = stackIn_31_2;
                    stackIn_32_3 = stackIn_31_3;
                    stackIn_32_4 = param2;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    oo.e(stackIn_32_0, stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (!ll.field_k.a(45, -126)) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var8 == 255) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (17 == var8) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    el.field_E.a(84 - -var7, 340);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (!h.i(51603)) {
                        statePc = 42;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (jk.a((byte) -51, var8)) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (jk.a((byte) -103, var9)) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    el.field_E.a(84 + var7, 340);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var6++;
                    if (var13 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        this.e(-107);
        this.field_p = 0;
    }

    final void b(byte param0) {
        th.b((byte) -61);
        super.b(param0);
    }

    tk(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        RuntimeException runtimeException = null;
        ja var9 = null;
        int var10 = 0;
        int var11 = 0;
        ja var12 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        on.field_bb = new ki[63];
                        lh.field_l = 255;
                        var12 = fq.field_k;
                        var9 = fq.field_k.f();
                        rq.field_u = new int[255];
                        var10 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var10 >= 255) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        rq.field_u[var10] = var10 * 65793;
                        var10++;
                        if (var11 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var11 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        bp.field_u.field_ab = wc.field_M;
                        cr.field_i.field_ab = df.field_Q;
                        b.field_a = new mj(0L, ih.field_d, var12, var9, bp.field_u, cr.field_i, false);
                        b.field_a.field_Q = 315;
                        b.field_a.field_zb = 631;
                        this.field_p = 0;
                        b.field_a.field_x = 5;
                        b.field_a.field_z = 15;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (runtimeException);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("tk.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_8_1 = stackIn_9_1;
                    if (param6 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 != -562798775) {
            this.field_p = 119;
        }
        int var7 = ((wf.field_m << -1066238943) / 3 - -(10 * param2)) % 29;
        int var8 = -var7 + 29;
        int var9 = q.a((byte) -126, (var7 << 1347089130) / 29) >> -562798775;
        int var10 = (var7 * param0 - -(param5 * var8) << 2099132868) / 29;
        int var11 = (param3 * var7 - -(var8 * param4) << 2052546500) / 29;
        oo.a(var10, var11, 64, var9, rq.field_u);
    }

    private final void e(byte param0) {
        int stackIn_37_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        rp var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        ef var11 = null;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        String var20 = null;
        int[] var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (!ud.field_S) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (param0 == -67) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var6 = ll.field_k;
                    var7 = -1;
                    var8 = -1;
                    if ((cp.field_O ^ -1) == -256) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (0 != (cp.field_O ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-6 < (q.field_d ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var7 = var6.field_s[-5 + q.field_d];
                    if (var19 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (0 > q.field_d) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if ((q.field_d ^ -1) <= (var6.g((byte) -80) ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var8 = var6.field_g[q.field_d];
                    var7 = var6.field_m[q.field_d];
                    if (var19 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var7 = -2;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (!h.i(51603)) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (jk.a((byte) -51, var7)) {
                        statePc = 16;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var7 = -3;
                    if (var19 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var7 = cp.field_O;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (255 == var7) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var7 = -1;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (-256 == (var8 ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var8 = -1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (-1 == var7) {
                        statePc = 73;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (gf.field_f != 0) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (10 < b.a(true)) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    gf.field_f = gf.field_f + 1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (gf.field_f > 0) {
                        statePc = 31;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 31: {
                    gf.field_f = gf.field_f + 2;
                    if (255 < gf.field_f) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    gf.field_f = 255;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (!var6.c(127, var7)) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var9 = stackIn_37_0;
                    if (var7 == -2) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var7 == -3) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var20 = wq.field_g[var7][var9];
                    var10 = var20;
                    if (-1 != var8) {
                        statePc = 41;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var10 = var20 + ii.field_b + wq.field_g[var8][var9];
                    if (var19 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var10 = ik.field_b;
                    if (var19 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var10 = vc.field_b;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var11 = qp.field_w;
                    var12 = var11.a(var10);
                    var13 = 8 * gf.field_f;
                    var4 = qp.field_w.field_w * (1 - -ro.a(-124, '<', (CharSequence) ((Object) var10)));
                    if (var13 > 255) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var13 = 255;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (400 >= var12) {
                        statePc = 51;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var12 = var12 / 2;
                    var4 = var4 * 2;
                    if (var19 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var19 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var14 = new String[var11.b(var10, var12)];
                    var24 = new int[var14.length];
                    var16 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var16 >= var14.length) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var24[var16] = var12;
                    var16++;
                    if (var19 != 0) {
                        statePc = 57;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var19 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var11.a(var10, var24, var14);
                    var16 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var17 = 0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if ((var14.length ^ -1) >= (var17 ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var18 = var11.a(var14[var17]);
                    stackIn_64_0 = var16 ^ -1;
                    stackIn_60_0 = stackIn_64_0;
                    if (var19 != 0) {
                        statePc = 64;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (stackIn_60_0 <= (var18 ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var16 = var18;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var17++;
                    if (var19 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = var16;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var5 = stackIn_64_0;
                    var4 = var14.length * qp.field_w.field_w;
                    var2 = bd.field_g;
                    var3 = 32 + bo.field_d;
                    if (var2 >= 0) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var2 = 0;
                    if (var19 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if ((var5 + var2 ^ -1) < -636) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var2 = -var5 + 640 + -5;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (var3 - -var4 > 475) {
                        statePc = 71;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var3 = -5 + (-var4 + 480);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    oo.b(var2 - 2, -2 + var3, var5 - -8, var4 + 8, 4, 0, var13 / 2);
                    oo.b(-4 + var2, var3 + -4, 8 + var5, var4 + 8, 4, 5005603, var13);
                    var11.a(var10, var2, var3, var5, var4, 16777215, 0, var13, 1, 1, 0);
                    if (var19 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    gf.field_f = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(hp param0, int param1, int param2) {
        ga var6 = null;
        int var4 = 0;
        try {
            if (param1 < 13) {
                hp var5 = (hp) null;
                tk.a((hp) null, -88, 107);
            }
            var6 = ma.field_a;
            var6.b((byte) -35, param2);
            var6.field_j = var6.field_j + 1;
            var4 = var6.field_j;
            var6.a(121, 1);
            var6.a(127, param0.field_v);
            var6.c(param0.field_f, 0);
            var6.b(-118, param0.field_q);
            var6.b(92, param0.field_u);
            var6.b(-115, param0.field_r);
            var6.b(100, param0.field_n);
            var6.f(var4, 115);
            var6.e(70, var6.field_j + -var4);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "tk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        ki stackIn_21_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        ki stackIn_42_0 = null;
        int statePc = 0;
        int[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[][] var26 = null;
        int[][] var29 = null;
        int[] var34 = null;
        int[] var35 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = ZombieDawnMulti.field_E ? 1 : 0;
                    oo.h(5, 54, 635, 330);
                    var29 = em.field_Y[ao.field_d];
                    var26 = var29;
                    var25 = var26;
                    var6 = var25;
                    var7 = 0;
                    var8 = -9 / ((-16 - param4) / 50);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackIn_2_0 = var7;
                    stackIn_2_1 = var29.length;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 >= stackIn_2_1) {
                        statePc = 67;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var34 = var29[var7];
                    var10 = var34.length;
                    if (var24 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var11 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var11 ^ -1) <= (var10 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var12 = var34[var11];
                    stackIn_13_0 = var12;
                    stackIn_7_0 = stackIn_13_0;
                    stackIn_13_1 = 255;
                    stackIn_7_1 = stackIn_13_1;
                    if (var24 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 == stackIn_7_1) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var10 = var11;
                    if (var24 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var11++;
                    if (var24 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var11 = (-var10 + var34.length) * param0 / 2;
                    stackIn_13_0 = 0;
                    stackIn_13_1 = var10;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (stackIn_13_0 == stackIn_13_1) {
                        statePc = 66;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = var10;
                    stackIn_16_1 = var12;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (stackIn_16_0 <= stackIn_16_1) {
                        statePc = 66;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var13 = var34[var12];
                    stackIn_2_0 = 255;
                    stackIn_18_0 = stackIn_2_0;
                    stackIn_2_1 = var13;
                    stackIn_18_1 = stackIn_2_1;
                    if (var24 != 0) {
                        statePc = 2;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 == stackIn_18_1) {
                        statePc = 65;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (!ll.field_k.g(var13, 4)) {
                        statePc = 65;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = on.field_bb[var13];
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0 == null) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var14 = param3 + var7 * param2 - wa.field_g;
                    var15 = var11 + param1 - -(var12 * param0);
                    on.field_bb[var13] = new ki(var13, var14, var15);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    on.field_bb[var13].field_q = -wa.field_g + (param3 - -(var7 * param2));
                    on.field_bb[var13].a(true);
                    if (!on.field_bb[var13].b((byte) 39)) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if ((lh.field_l ^ -1) != -256) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (!ud.field_S) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    cp.field_O = var13;
                    on.field_bb[var13].field_b.e(on.field_bb[var13].field_q, on.field_bb[var13].field_g, (q.a((byte) -60, wf.field_m << -610265308) >> -522875959) + 128);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var14 = on.field_bb[var13].field_c;
                    if (ll.field_k.g(var14, 4)) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var24 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var35 = em.field_ab[var14];
                    var16 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (var35.length <= var16) {
                        statePc = 65;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var17 = var35[var16];
                    stackIn_16_0 = var17 ^ -1;
                    stackIn_35_0 = stackIn_16_0;
                    stackIn_16_1 = -256;
                    stackIn_35_1 = stackIn_16_1;
                    if (var24 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (stackIn_35_0 != stackIn_35_1) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var24 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (!ll.field_k.g(var17, 4)) {
                        statePc = 64;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var18 = -1;
                    var19 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var19 >= on.field_bb.length) {
                        statePc = 46;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_21_0 = on.field_bb[var19];
                    stackIn_42_0 = stackIn_21_0;
                    if (var24 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 == null) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if ((var17 ^ -1) != (on.field_bb[var19].field_c ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var18 = var19;
                    var19 = on.field_bb.length;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var19++;
                    if (var24 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if ((var18 ^ -1) == 0) {
                        statePc = 64;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (on.field_bb[var18] != null) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var24 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var19 = -3 + on.field_bb[var13].field_q;
                    var20 = on.field_bb[var13].field_b.field_w / 2 + on.field_bb[var13].field_g;
                    var21 = on.field_bb[var13].field_b.field_x + (on.field_bb[var18].field_q + 3);
                    var22 = on.field_bb[var13].field_b.field_w / 2 + on.field_bb[var18].field_g;
                    var23 = -1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (-2 >= (var23 ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    oo.g(var19, var20 + var23, var21, var23 + var22, 11528032);
                    var23++;
                    if (var24 != 0) {
                        statePc = 57;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var24 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (ll.field_k.c(127, var14)) {
                        statePc = 57;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var23 = 0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (var23 >= 3) {
                        statePc = 62;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    this.b(var19, -562798775, var23, var20, var22, var21);
                    var23++;
                    if (var24 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var24 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    oo.a(var19, -4 + var20, 4, 9, 1);
                    oo.a(var19 - -1, -3 + var20, 2, 7, 11316396, 5066061);
                    oo.a(var21 + -4, -4 + var22, 4, 9, 1);
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    oo.a(-3 + var21, -3 + var22, 2, 7, 11316396, 5066061);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var16++;
                    if (var24 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var12++;
                    if (var24 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var7++;
                    if (var24 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    oo.c();
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        if (param0 >= -62) {
            hp var2 = (hp) null;
            tk.a((hp) null, -91, 7);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        oo.h(param5, param2, param4 + param5 + (param1 << -124016383), (param1 << 139151681) + param2 + param0);
        o.field_h.c(param5, param2);
        oo.f(param5, param2, param4 - -(param1 << -2047811167), param0 + (param1 << 1921606209), 2560, 160);
        ak.a((param1 << 814062817) + param4, param0 - -(param1 << 840826433), -5, param5, param2);
        oo.c();
        if (param3 >= -55) {
            this.b((byte) 22);
        }
    }

    final void a(int param0) {
        int stackIn_6_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        int stackIn_175_0 = 0;
        int stackIn_175_1 = 0;
        boolean stackOut_10_0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        rp var8 = null;
        rp var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (-601 < (bd.field_g ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (620 <= bd.field_g) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (-11 < (bo.field_d ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if ((bo.field_d ^ -1) < -31) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    u.field_i = stackIn_6_0 != 0;
                    if (ud.field_S) {
                        statePc = 8;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_p = this.field_p + 1;
                    var2 = 0;
                    var3 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if ((var3 ^ -1) <= (lc.field_m.length ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = lc.field_m[var3];
                    stackIn_16_0 = stackOut_10_0 ? 1 : 0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var7 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2 = 1;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var3++;
                    if (var7 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = var2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (stackIn_16_0 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ud.field_S = false;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if ((kd.field_b ^ -1) == -2) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ud.field_S = false;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    this.field_p = 0;
                    if (kd.field_b != 1) {
                        statePc = 29;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (u.field_i) {
                        statePc = 25;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (ud.field_S) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = 1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    ud.field_S = stackIn_28_0 != 0;
                    this.field_p = 2000;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    super.a(param0 ^ 0);
                    var8 = ll.field_k;
                    var9 = var8;
                    var3 = var9.g((byte) 123);
                    en.a(param0 ^ -1, 4);
                    if (lh.field_l == 255) {
                        statePc = 50;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (0 == (q.field_d ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (lh.field_l < 44) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (lh.field_l <= 62) {
                        statePc = 46;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (0 > lh.field_l) {
                        statePc = 39;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (-20 >= (lh.field_l ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var3 <= q.field_d) {
                        statePc = 38;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 38: {
                    en.a(-1, 6);
                    if (var7 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (32 > lh.field_l) {
                        statePc = 50;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (-39 >= (lh.field_l ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (q.field_d < 0) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((var3 ^ -1) >= (q.field_d ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!pb.a(var8.field_m[q.field_d], -20, lh.field_l)) {
                        statePc = 45;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 45: {
                    en.a(param0 + -1, 6);
                    if (var7 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (0 > q.field_d) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (q.field_d < 5) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    en.a(-1, 6);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (!c.field_b) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (-1 != (pq.field_f ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    kk.field_u = false;
                    if (var7 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (wf.field_m + -sq.field_S >= 25) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_58_0 = 1;
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = 0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    kk.field_u = stackIn_58_0 != 0;
                    sq.field_S = wf.field_m;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (pq.field_f != param0) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_62_0 = 1;
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    c.field_b = stackIn_62_0 != 0;
                    if (!kk.field_u) {
                        statePc = 117;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (!ll.field_k.c(127, cp.field_O)) {
                        statePc = 107;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (0 > cp.field_O) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if ((cp.field_O ^ -1) > -20) {
                        statePc = 87;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (cp.field_O < 44) {
                        statePc = 107;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if ((cp.field_O ^ -1) < -63) {
                        statePc = 107;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var4 = 0;
                    var5 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if ((var5 ^ -1) <= -4) {
                        statePc = 76;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_108_0 = var8.field_s[var5];
                    stackIn_72_0 = stackIn_108_0;
                    stackIn_108_1 = cp.field_O;
                    stackIn_72_1 = stackIn_108_1;
                    if (var7 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (stackIn_72_0 != stackIn_72_1) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var4 = 1;
                    if (var7 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var5++;
                    if (var7 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var4 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var5 = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (3 <= var5) {
                        statePc = 85;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackIn_108_0 = 255;
                    stackIn_80_0 = stackIn_108_0;
                    stackIn_108_1 = var8.field_s[var5];
                    stackIn_80_1 = stackIn_108_1;
                    if (var7 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (stackIn_80_0 != stackIn_80_1) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var8.field_s[var5] = cp.field_O;
                    nm.b(-127, 87);
                    if (var7 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var5++;
                    if (var7 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var7 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var4 = var9.g((byte) -42);
                    var5 = 0;
                    if (var5 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var6 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if ((var6 ^ -1) <= (var4 ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackIn_108_0 = var8.field_m[var6] ^ -1;
                    stackIn_92_0 = stackIn_108_0;
                    stackIn_108_1 = -256;
                    stackIn_92_1 = stackIn_108_1;
                    if (var7 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (stackIn_92_0 != stackIn_92_1) {
                        statePc = 95;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var8.field_m[var6] = cp.field_O;
                    nm.b(-128, 87);
                    if (var7 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var6++;
                    if (var7 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var4 = var9.g((byte) -42);
                    var5 = 0;
                    if (var5 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var6 = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if ((var6 ^ -1) <= (var4 ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_108_0 = var8.field_m[var6] ^ -1;
                    stackIn_102_0 = stackIn_108_0;
                    stackIn_108_1 = -256;
                    stackIn_102_1 = stackIn_108_1;
                    if (var7 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (stackIn_102_0 != stackIn_102_1) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var8.field_m[var6] = cp.field_O;
                    nm.b(-128, 87);
                    if (var7 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var6++;
                    if (var7 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackIn_108_0 = -1;
                    stackIn_108_1 = q.field_d ^ -1;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (stackIn_108_0 < stackIn_108_1) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (-6 < (q.field_d ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (-6 >= (q.field_d ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var8.field_s[-5 + q.field_d] = 255;
                    if (var7 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (380 >= bo.field_d) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var8.field_g[q.field_d] = 255;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var8.field_m[q.field_d] = 255;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    b.field_a.a(-11838, true);
                    wa.field_g = b.field_a.a(850, b.field_a.field_zb, -18367);
                    var4 = -10;
                    wa.field_g = wa.field_g + var4 * t.field_d;
                    var5 = -100;
                    if (!b.field_a.k(20)) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    wa.field_g = wa.field_g + var4;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (!b.field_a.h(4690)) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    wa.field_g = wa.field_g - var4;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (!b.field_a.j(param0 ^ 64)) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    wa.field_g = wa.field_g + var5;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (!b.field_a.c((byte) -104)) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    wa.field_g = wa.field_g - var5;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if ((wa.field_g ^ -1) > -1) {
                        statePc = 127;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 127: {
                    wa.field_g = 0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (wa.field_g <= -b.field_a.field_zb + 850) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    wa.field_g = -b.field_a.field_zb + 850;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (1 != kd.field_b) {
                        statePc = 147;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (255 == cp.field_O) {
                        statePc = 135;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (var9.c(127, cp.field_O)) {
                        statePc = 134;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 134: {
                    lh.field_l = cp.field_O;
                    nm.b(-126, 90);
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if ((kn.field_b ^ -1) == 0) {
                        statePc = 138;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    ao.field_d = kn.field_b;
                    nm.b(-126, 91);
                    if (var7 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (-256 != (lh.field_l ^ -1)) {
                        statePc = 147;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if ((q.field_d ^ -1) == 0) {
                        statePc = 147;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if ((q.field_d ^ -1) > -6) {
                        statePc = 143;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    lh.field_l = var8.field_s[q.field_d - 5];
                    nm.b(-128, 90);
                    var8.field_s[q.field_d + -5] = 255;
                    if (var7 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if ((bo.field_d ^ -1) <= -381) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    lh.field_l = var8.field_m[q.field_d];
                    nm.b(-128, 90);
                    var8.field_m[q.field_d] = 255;
                    var8.field_g[q.field_d] = 255;
                    if (var7 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    lh.field_l = var8.field_g[q.field_d];
                    nm.b(param0 ^ -128, 90);
                    var8.field_g[q.field_d] = 255;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if ((pq.field_f ^ -1) == -2) {
                        statePc = 177;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (0 == (q.field_d ^ -1)) {
                        statePc = 176;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if ((lh.field_l ^ -1) == -256) {
                        statePc = 176;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if ((q.field_d ^ -1) <= -6) {
                        statePc = 164;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (q.field_d < var3) {
                        statePc = 153;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (-1 < (lh.field_l ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (lh.field_l >= 19) {
                        statePc = 158;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var8.field_m[q.field_d] = lh.field_l;
                    if (!pb.a(lh.field_l, -20, var8.field_g[q.field_d])) {
                        statePc = 157;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var8.field_g[q.field_d] = 255;
                    nm.b(-126, 87);
                    if (var7 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (-33 < (lh.field_l ^ -1)) {
                        statePc = 176;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (-39 <= (lh.field_l ^ -1)) {
                        statePc = 161;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (!pb.a(var8.field_m[q.field_d], -20, lh.field_l)) {
                        statePc = 176;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var8.field_g[q.field_d] = lh.field_l;
                    nm.b(-128, 87);
                    if (var7 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if ((lh.field_l ^ -1) > -45) {
                        statePc = 176;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (lh.field_l <= 62) {
                        statePc = 167;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var6 = 0;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if (3 <= var6) {
                        statePc = 174;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    stackIn_175_0 = lh.field_l ^ -1;
                    stackIn_170_0 = stackIn_175_0;
                    stackIn_175_1 = var8.field_s[var6] ^ -1;
                    stackIn_170_1 = stackIn_175_1;
                    if (var7 != 0) {
                        statePc = 175;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (stackIn_170_0 == stackIn_170_1) {
                        statePc = 172;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var8.field_s[var6] = 255;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    var6++;
                    if (var7 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var8.field_s[-5 + q.field_d] = lh.field_l;
                    stackIn_175_0 = param0 + -127;
                    stackIn_175_1 = 87;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    nm.b(stackIn_175_0, stackIn_175_1);
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    lh.field_l = 255;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          L1: {
            var7 = ZombieDawnMulti.field_E ? 1 : 0;
            if (u.field_i) {
              break L1;
            } else {
              L2: {
                if (ud.field_S) {
                  break L2;
                } else {
                  oo.d(610, 20, 9, 16711680, (q.a((byte) -104, wf.field_m << 174035877) >> -556021271) + 128);
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              oo.d(610, 20, 9, 65280);
              if (var7 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          oo.d(610, 20, 9, 16777215);
          break L0;
        }
        L3: {
          if (param0 < -85) {
            break L3;
          } else {
            field_n = 43;
            break L3;
          }
        }
        L4: {
          jl.field_u.c(600, 10);
          if (!ud.field_S) {
            break L4;
          } else {
            L5: {
              oo.f(0, 0, 640, 480, 0, 64);
              var6 = 10;
              var2 = 445;
              var3 = 2;
              var4 = 120;
              var5 = pb.field_e.a(cc.field_a, var4, 0);
              this.a(var5, var6, var3, -79, var4, var2);
              pb.field_e.a(cc.field_a, var2 - -var6, var6 + var3, var4, var5, 16777215, -1, 0, 0, 0);
              lh.field_m.a(-3 + ((var6 << 1842328065) + (var2 - -var4)), 8 + var3);
              if ((this.field_p ^ -1) < -1) {
                var2 = 200;
                var4 = 390;
                var3 = 100;
                var5 = pb.field_e.a(uc.field_g, var4, 0);
                this.a(var5, var6, var3, -105, var4, var2);
                pb.field_e.a(uc.field_g, var2 + var6, var3 + var6, var4, var5, 16777215, -1, 0, 0, 0);
                ip.field_e.a(var2 - -50, var3 - -3 + -ip.field_e.field_b);
                oi.field_k.a(var2 + 50, var5 + var3 + -3 - -(var6 << 1705362977));
                lh.field_m.a(var2 - (-var4 + -(var6 << 1178440097) - -3), var3 + (var5 >> 215109665));
                uo.field_n.a(var2 + (-var6 + -1), (var5 >> 1410202977) + var3);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((this.field_p ^ -1) < -101) {
                var2 = 50;
                var5 = 80;
                var4 = 250;
                var3 = 280;
                var5 = pb.field_e.a(wq.field_d, var4, 0);
                this.a(var5, var6, var3, -126, var4, var2);
                pb.field_e.a(wq.field_d, var6 + var2, var3 - -var6, var4, var5, 16777215, -1, 0, 0, 0);
                oi.field_k.a(var2 - -50, var5 + var3 + (-3 - -(var6 << 386190529)));
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-301 <= (this.field_p ^ -1)) {
                break L7;
              } else {
                L8: {
                  L9: {
                    var5 = 80;
                    var3 = 400;
                    var4 = 250;
                    var2 = 50;
                    if (-2 == (p.field_e ^ -1)) {
                      break L9;
                    } else {
                      if (-3 != (p.field_e ^ -1)) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var3 -= 10;
                  break L8;
                }
                var5 = pb.field_e.a(jf.field_c, var4, 0);
                this.a(var5, var6, var3, -71, var4, var2);
                pb.field_e.a(jf.field_c, var6 + var2, var3 - -var6, var4, var5, 16777215, -1, 0, 0, 0);
                ip.field_e.a(50 + var2, -ip.field_e.field_b + (var3 + 3));
                break L7;
              }
            }
            L10: {
              if (this.field_p <= 200) {
                break L10;
              } else {
                var3 = 280;
                var4 = 250;
                var5 = 80;
                var2 = 350;
                var5 = pb.field_e.a(pi.field_h, var4, 0);
                this.a(var5, var6, var3, -118, var4, var2);
                pb.field_e.a(pi.field_h, var2 + var6, var6 + var3, var4, var5, 16777215, -1, 0, 0, 0);
                oi.field_k.a(80 + var2, var5 + -3 + (var3 + (var6 << 1871587905)));
                break L10;
              }
            }
            break L4;
          }
        }
    }

    static {
        field_o = "Show lobby chat from my friends";
    }
}
