/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk {
    short field_o;
    short[] field_K;
    byte[] field_r;
    int[] field_C;
    int[] field_M;
    short[] field_O;
    short[] field_t;
    short[] field_c;
    byte field_l;
    int[] field_D;
    int[] field_g;
    private boolean field_B;
    short[] field_w;
    static sd field_j;
    short[] field_k;
    short[] field_q;
    short[] field_Q;
    short[] field_i;
    short[] field_z;
    short[] field_A;
    int[] field_a;
    int field_n;
    static hj[] field_y;
    static mg field_f;
    int[] field_h;
    int field_d;
    int field_L;
    int field_H;
    int field_p;
    short[] field_P;
    int[] field_R;
    short[] field_s;
    short field_J;
    short[] field_m;
    static String field_I;
    short[] field_G;
    int field_F;
    short field_u;
    int[] field_v;
    short[] field_e;
    short[] field_x;
    int[] field_b;
    short[] field_N;
    static hj[] field_E;

    final static void a(int param0, int param1, boolean param2, boolean param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = HoldTheLine.field_D;
        if (param0 <= param1) {
          return;
        } else {
          if (1 + param1 >= param4) {
            return;
          } else {
            L0: {
              if (param4 <= param1 + 5) {
                break L0;
              } else {
                if (param5 != param6) {
                  var7 = (param5 & param6 & 1) + (param6 >> 900385217) + (param5 >> -1009700159);
                  var8 = param1;
                  var9 = param6;
                  var10 = param5;
                  var11 = param1;
                  L1: while (true) {
                    if (param4 <= var11) {
                      qk.a(param0, param1, param2, param3, var8, var9, param6);
                      qk.a(param0, var8, param2, param3, param4, param5, var10);
                      return;
                    } else {
                      L2: {
                        var12 = im.field_h[var11];
                        if (!param3) {
                          stackOut_22_0 = oh.field_s[var12];
                          stackIn_23_0 = stackOut_22_0;
                          break L2;
                        } else {
                          stackOut_21_0 = va.field_j[var12];
                          stackIn_23_0 = stackOut_21_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_23_0;
                      if (var13 <= var7) {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        L3: {
                          im.field_h[var11] = im.field_h[var8];
                          if (var13 < var9) {
                            var9 = var13;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        im.field_h[var8] = var12;
                        var11++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            var7 = param4 - 1;
            L4: while (true) {
              if (param1 >= var7) {
                return;
              } else {
                var8 = param1;
                L5: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L4;
                  } else {
                    var9 = im.field_h[var8];
                    var10 = im.field_h[1 + var8];
                    if (mf.a(var10, param3, var9, 13234)) {
                      im.field_h[var8] = var10;
                      im.field_h[var8 - -1] = var9;
                      var8++;
                      continue L5;
                    } else {
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static int[] a(int[] param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        pf var8 = null;
        pf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        pf var14 = null;
        var11 = HoldTheLine.field_D;
        var2 = param0[0];
        var3 = param0[1];
        var4 = param0.length / 2;
        var5 = 1;
        L0: while (true) {
          if (var4 <= var5) {
            L1: {
              L2: {
                if (null == qn.field_l) {
                  break L2;
                } else {
                  if (var4 <= qn.field_l.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              qn.field_l = new pf[var4];
              break L1;
            }
            var5 = 0;
            L3: while (true) {
              if (var5 >= var4) {
                var5 = 0;
                L4: while (true) {
                  if (var4 <= var5) {
                    L5: {
                      if (param1 < -110) {
                        break L5;
                      } else {
                        qk.a(-8);
                        break L5;
                      }
                    }
                    en.a(5433, (hd[]) (Object) qn.field_l, var4);
                    var5 = 2;
                    var6 = 2;
                    L6: while (true) {
                      if (var4 <= var6) {
                        var12 = new int[2 * var5];
                        var7 = var12;
                        var13 = 0;
                        var6 = var13;
                        L7: while (true) {
                          if (var5 <= var13) {
                            return var7;
                          } else {
                            var12[var13 * 2] = var2 + qn.field_l[var13].field_a;
                            var12[2 * var13 - -1] = qn.field_l[var13].field_e + var3;
                            var13++;
                            continue L7;
                          }
                        }
                      } else {
                        L8: {
                          var14 = qn.field_l[-2 + var5];
                          var8 = qn.field_l[var5 + -1];
                          var9 = qn.field_l[var6];
                          var10 = -((-var14.field_e + var8.field_e) * (var9.field_a + -var14.field_a)) + (-var14.field_a + var8.field_a) * (var9.field_e - var14.field_e);
                          if (var10 < -1) {
                            break L8;
                          } else {
                            if (-4 <= var5) {
                              var5--;
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var5++;
                        qn.field_l[var5] = var9;
                        var6++;
                        continue L6;
                      }
                    }
                  } else {
                    qn.field_l[var5].field_a = -var2 + param0[var5 * 2];
                    qn.field_l[var5].field_e = param0[var5 * 2 - -1] + -var3;
                    var5++;
                    continue L4;
                  }
                }
              } else {
                qn.field_l[var5] = new pf();
                var5++;
                continue L3;
              }
            }
          } else {
            L9: {
              if (param0[2 * var5] < var2) {
                break L9;
              } else {
                if (var2 == param0[2 * var5]) {
                  if (param0[2 * var5 - -1] < var3) {
                    break L9;
                  } else {
                    var5++;
                    continue L0;
                  }
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
            var2 = param0[2 * var5];
            var3 = param0[2 * var5 + 1];
            var5++;
            continue L0;
          }
        }
    }

    private final void a(byte param0) {
        if (param0 >= -101) {
            this.a((byte) -87);
        }
        ((qk) this).field_B = false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        if (param3 != 2) {
            return;
        }
        for (var6 = 0; var6 < ((qk) this).field_u; var6++) {
            ((qk) this).field_m[var6] = (short)(param2 * ((qk) this).field_m[var6] / param4);
            ((qk) this).field_G[var6] = (short)(((qk) this).field_G[var6] * param1 / param4);
            ((qk) this).field_k[var6] = (short)(param0 * ((qk) this).field_k[var6] / param4);
        }
        this.a((byte) -103);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        if (!((qk) this).field_B) {
          ((qk) this).field_B = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = param0;
          L0: while (true) {
            if (((qk) this).field_u <= var8) {
              ((qk) this).field_H = var3;
              ((qk) this).field_n = var4;
              ((qk) this).field_p = var7;
              ((qk) this).field_L = var2;
              ((qk) this).field_d = var6;
              ((qk) this).field_F = var5;
              return;
            } else {
              L1: {
                var9 = ((qk) this).field_m[var8];
                var10 = ((qk) this).field_G[var8];
                if (var2 > var9) {
                  var2 = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var9 > var5) {
                  var5 = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10 <= var6) {
                  break L3;
                } else {
                  var6 = var10;
                  break L3;
                }
              }
              L4: {
                if (var3 <= var10) {
                  break L4;
                } else {
                  var3 = var10;
                  break L4;
                }
              }
              L5: {
                var11 = ((qk) this).field_k[var8];
                if (var4 <= var11) {
                  break L5;
                } else {
                  var4 = var11;
                  break L5;
                }
              }
              if (var7 < var11) {
                var7 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        if (param2 != -26608) {
            qk.a(-35);
        }
        for (var5 = 0; ((qk) this).field_u > var5; var5++) {
            ((qk) this).field_m[var5] = (short)(((qk) this).field_m[var5] + param1);
            ((qk) this).field_G[var5] = (short)(((qk) this).field_G[var5] + param0);
            ((qk) this).field_k[var5] = (short)(((qk) this).field_k[var5] + param3);
        }
        this.a((byte) -109);
    }

    public static void a(int param0) {
        field_E = null;
        if (param0 != -32768) {
            field_I = null;
        }
        field_y = null;
        field_f = null;
        field_j = null;
        field_I = null;
    }

    final static int b(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            th var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_33_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ce.field_n.field_c >= 4) {
                            statePc = 2;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if ((ce.field_n.field_f ^ -1) != 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if ((ce.field_n.field_f ^ -1) != 1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 4;
                    }
                    case 6: {
                        return 1;
                    }
                    case 7: {
                        try {
                            if (lc.field_g != 0) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            tl.field_y = kl.field_v.a(0, lg.field_e, pe.field_c);
                            lc.field_g = lc.field_g + 1;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (lc.field_g != param0) {
                                statePc = 16;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (2 == tl.field_y.field_d) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = bd.a(-1, 8077);
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        try {
                            if (1 != tl.field_y.field_d) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            lc.field_g = lc.field_g + 1;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (2 != lc.field_g) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            oc.field_c = new nn((java.net.Socket) tl.field_y.field_b, kl.field_v);
                            var2 = new th(13);
                            ui.a(a.field_H, (byte) -95, var2, ee.field_n, wd.field_r);
                            var2.f(111, 15);
                            var2.a((byte) -58, rd.field_g);
                            oc.field_c.a(13, var2.field_i, 0, 1);
                            lc.field_g = lc.field_g + 1;
                            aj.field_b = 30000L + bb.b(-1);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (lc.field_g == 3) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((oc.field_c.b(false) ^ -1) < -1) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (aj.field_b < bb.b(param0 ^ -2)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            stackOut_23_0 = bd.a(-2, param0 + 8076);
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return stackIn_24_0;
                    }
                    case 25: {
                        try {
                            var1_int = oc.field_c.c(-27418);
                            if (-1 != (var1_int ^ -1)) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            stackOut_27_0 = bd.a(var1_int, 8077);
                            stackIn_28_0 = stackOut_27_0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        return stackIn_28_0;
                    }
                    case 29: {
                        try {
                            lc.field_g = lc.field_g + 1;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (lc.field_g != 4) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ce.field_n.a((Object) (Object) oc.field_c, ka.field_d, 20);
                            oc.field_c = null;
                            tl.field_y = null;
                            lc.field_g = 0;
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = -1;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        var1 = (IOException) (Object) caughtException;
                        return bd.a(-3, 8077);
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

    qk() {
        ((qk) this).field_l = (byte) 0;
        ((qk) this).field_B = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = null;
        field_I = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
