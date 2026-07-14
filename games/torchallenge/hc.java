/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc extends ng {
    static ka[] field_T;
    static boolean field_Q;
    static volatile long field_R;
    static int field_S;
    static k field_P;
    static int field_O;

    hc(String param0, gg param1, boolean param2) {
        this(param0, param1);
        ((hc) this).field_D = param2 ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        fe var8 = ia.field_i[param3][param5][param2];
        int var9 = qk.a(param3, param7, param6, param2, 125, param1, param5, param4);
        if (param0 < 20) {
            hc.d((byte) -55);
        }
        if (!(-1 > (var9 ^ -1))) {
            return;
        }
        if (!(var8 != null)) {
            return;
        }
        e discarded$0 = ol.a(-120, var8, var9);
    }

    final static void a(uf param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = TorChallenge.field_F ? 1 : 0;
                        if (param1 == -13) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_S = 50;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var6 = new byte[24];
                        var2 = var6;
                        if (null != cf.field_d) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        param0.a(24, 0, var2, -16384);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            cf.field_d.a(0L, 0);
                            cf.field_d.a((byte) -128, var6);
                            var3_int = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var2[var3_int] == 0) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_int++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (24 > var3_int) {
                                statePc = 15;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (24 <= var4) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 15: {
                        param0.a(24, 0, var2, -16384);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        return;
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, ka param8) {
        dd.field_u = param5;
        vk.field_d = param8;
        rl.field_f = param3;
        pi.field_b = param6;
        if (param1 < 86) {
            return;
        }
        si.field_J = param0;
        fd.field_f = param4;
        vk.field_k = param7;
        bh.field_t = param2;
    }

    final static void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ae var4_ref_ae = null;
        long var4 = 0L;
        int var5 = 0;
        ji var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        pa var28 = null;
        L0: {
          var26 = TorChallenge.field_F ? 1 : 0;
          var28 = id.field_b;
          var2 = var28.j(-105);
          if (param0 == -117) {
            break L0;
          } else {
            boolean discarded$1 = hc.c((byte) -46);
            break L0;
          }
        }
        L1: {
          if (var2 != 0) {
            if ((var2 ^ -1) == -2) {
              var3 = var28.c(false);
              var4 = var28.k(param0 ^ 95);
              var6 = (ji) (Object) wf.field_g.c((byte) 1);
              L2: while (true) {
                L3: {
                  if (var6 == null) {
                    break L3;
                  } else {
                    if (var6.field_l == var3) {
                      break L3;
                    } else {
                      var6 = (ji) (Object) wf.field_g.c(-270);
                      continue L2;
                    }
                  }
                }
                if (var6 != null) {
                  var6.field_x = var4;
                  var6.a(true);
                  break L1;
                } else {
                  ob.b(-99);
                  return;
                }
              }
            } else {
              td.a("HS1: " + ck.a(param0 + -13182), (Throwable) null, (byte) -92);
              ob.b(-89);
              break L1;
            }
          } else {
            var3 = var28.c(false);
            var4_ref_ae = (ae) (Object) bk.field_t.c((byte) -110);
            L4: while (true) {
              L5: {
                if (var4_ref_ae == null) {
                  break L5;
                } else {
                  if (var4_ref_ae.field_o == var3) {
                    break L5;
                  } else {
                    var4_ref_ae = (ae) (Object) bk.field_t.c(-270);
                    continue L4;
                  }
                }
              }
              if (var4_ref_ae == null) {
                ob.b(-127);
                return;
              } else {
                L6: {
                  var5 = var28.j(-127);
                  if (var5 == 0) {
                    break L6;
                  } else {
                    var6_int = var4_ref_ae.field_r;
                    ph.field_b[0].field_e = false;
                    var7 = var4_ref_ae.field_q;
                    ph.field_b[0].field_g = mf.field_a;
                    ph.field_b[0].field_a = null;
                    var8_int = 1;
                    L7: while (true) {
                      if (var5 <= var8_int) {
                        var4_ref_ae.field_i = new String[3][var6_int];
                        var8 = new String[3][var6_int];
                        var9 = new String[3][var6_int];
                        var4_ref_ae.field_t = new long[3][var6_int];
                        var10 = new long[3][var6_int];
                        var4_ref_ae.field_l = new int[3][var7 * var6_int];
                        var11 = new int[3][var7 * var6_int];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.j(param0 + 25);
                        if (0 >= var18) {
                          break L6;
                        } else {
                          var19 = 0;
                          L8: while (true) {
                            if (var19 >= var18) {
                              break L6;
                            } else {
                              L9: {
                                var20 = var28.j(-85);
                                var21 = ph.field_b[var20].field_g;
                                var22 = var28.k(-120);
                                var24 = var28.field_q;
                                if (var19 >= var6_int) {
                                  break L9;
                                } else {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = ph.field_b[var20].field_a;
                                  var10[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var7 <= var25) {
                                      break L9;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var28.i(51);
                                      var25++;
                                      continue L10;
                                    }
                                  }
                                }
                              }
                              L11: {
                                if (var21 == null) {
                                  break L11;
                                } else {
                                  if (jc.a(var21, 26691)) {
                                    var8[1][var13] = mf.field_a;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var13++;
                                    var28.field_q = var24;
                                    var25 = 0;
                                    L12: while (true) {
                                      if (var25 >= var7) {
                                        break L11;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var28.i(46);
                                        var25++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var6_int > var14) {
                                if (!ph.field_b[var20].field_e) {
                                  ph.field_b[var20].field_e = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = ph.field_b[var20].field_a;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var28.field_q = var24;
                                  var25 = 0;
                                  L13: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var28.i(param0 + 158);
                                      var25++;
                                      continue L13;
                                    } else {
                                      var19++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L8;
                                }
                              } else {
                                var19++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        ph.field_b[var8_int].field_g = var28.b(false);
                        ph.field_b[var8_int].field_e = false;
                        if ((var28.j(-121) ^ -1) == -2) {
                          ph.field_b[var8_int].field_a = var28.b(false);
                          var8_int++;
                          continue L7;
                        } else {
                          ph.field_b[var8_int].field_a = null;
                          var8_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                var4_ref_ae.field_n = true;
                var4_ref_ae.a(true);
                break L1;
              }
            }
          }
        }
    }

    private hc(String param0, gg param1) {
        this(param0, kl.field_e.field_f, param1);
        ((hc) this).field_q = kl.field_e.field_l;
    }

    public static void a(int param0) {
        field_T = null;
        field_P = null;
        if (param0 > -23) {
            field_P = null;
        }
    }

    final static boolean c(byte param0) {
        int var1 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var1 = -73 % ((param0 - -52) / 54);
            if (-21 < (li.field_K ^ -1)) {
              break L1;
            } else {
              if (!ih.f((byte) -108)) {
                break L1;
              } else {
                L2: {
                  if (0 >= uk.field_H) {
                    break L2;
                  } else {
                    if (mf.a((byte) -119)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    private hc(String param0, j param1, gg param2) {
        super(param0, param1, param2);
        ((hc) this).field_q = kl.field_e.field_l;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((hc) this).field_D = !((hc) this).field_D ? true : false;
        super.a(param0, param1 ^ 0, param2, param3);
        if (param1 != -13461) {
            field_Q = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = false;
        field_R = 0L;
        field_P = new k(7, 0, 1, 1);
    }
}
