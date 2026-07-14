/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class c extends v {
    private long field_g;
    static String field_i;
    static String field_f;
    private String field_d;
    static int field_h;
    static int field_e;

    final static boolean a(String param0, byte param1) {
        if (param1 > -43) {
            return true;
        }
        return null != vo.a(param0, 0) ? true : false;
    }

    final void a(ed param0, int param1) {
        param0.a((byte) -126, ((c) this).field_g);
        if (param1 != 47) {
            Object var4 = null;
            ((c) this).a((ed) null, 82);
        }
        param0.b(param1 ^ 47, ((c) this).field_d);
    }

    final static boolean a(int param0, byte param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_13_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (id.field_f.field_u < param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (lo.field_k == null) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        try {
                            var2_int = lo.field_k.a(15166);
                            if ((var2_int ^ -1) < -1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (param0 + -id.field_f.field_u < var2_int) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2_int = -id.field_f.field_u + param0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            lo.field_k.a(id.field_f.field_p, false, var2_int, id.field_f.field_u);
                            gn.field_b = gk.a(89);
                            id.field_f.field_u = id.field_f.field_u + var2_int;
                            if (param0 <= id.field_f.field_u) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            id.field_f.field_u = 0;
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            if (-1 < (var2_int ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (-30001L <= (qg.b(false) ^ -1L)) {
                                statePc = 22;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            rm.b((byte) 94);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            rm.b((byte) 94);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var2 = (IOException) (Object) caughtException;
                        rm.b((byte) 114);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (param1 == -104) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        c.a(-128, -125);
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        return false;
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

    tq a(byte param0) {
        if (param0 != -83) {
            return null;
        }
        return rf.field_n;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          var2 = 0;
          var3 = hm.field_F;
          if ((var3 ^ -1) <= -6) {
            if (var3 < 105) {
              var2 = (16384 * var3 - 40960) / 220;
              break L0;
            } else {
              if ((var3 ^ -1) > -121) {
                var3 = 120 - var3;
                var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          }
        }
        L1: {
          if (param1 == -3797) {
            break L1;
          } else {
            c.a(-62, -13);
            break L1;
          }
        }
        L2: {
          var4 = 1;
          var5 = 0;
          if ((param0 ^ -1) != -2) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if (param0 != 3) {
            break L3;
          } else {
            var4 = -1;
            break L3;
          }
        }
        L4: {
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param0 != 5) {
            break L5;
          } else {
            var5 = 1;
            var4 = -1;
            break L5;
          }
        }
        L6: {
          if (param0 != 6) {
            break L6;
          } else {
            var4 = 1;
            var5 = -1;
            break L6;
          }
        }
        L7: {
          L8: {
            if ((param0 ^ -1) == -8) {
              break L8;
            } else {
              if (param0 == 8) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (param0 != 11) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param0 != 12) {
            break L10;
          } else {
            var5 = -1;
            var4 = -1;
            break L10;
          }
        }
        L11: {
          if (param0 == 13) {
            var5 = -1;
            var4 = 1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if ((param0 ^ -1) == -15) {
            var4 = -1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if ((param0 ^ -1) == -16) {
            var4 = 1;
            var5 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        ba.field_g = hh.a(var5 * var2, var4 * var2, false);
    }

    public static void b(int param0) {
        field_i = null;
        field_f = null;
        if (param0 < 113) {
            c.a(-58, -80);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, er[] param4, int param5, cc param6, int param7, int param8, int param9, er[] param10, int param11, int param12, er[] param13, cc param14, int param15, int param16, int param17, int param18, int param19) {
        if (param16 != 20412) {
            return;
        }
        on.a(param6, param3, param9, param18, param1, param7, param12, new mp(param4), new mp(param13), param0, (byte) 24, param19, new mp(param10), param11, param17, param14, param8, param2, param15, param5);
    }

    c(long param0, String param1) {
        ((c) this).field_d = param1;
        ((c) this).field_g = param0;
    }

    final static void c(int param0) {
        int var2 = 0;
        ri var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        mi var13 = null;
        int var14 = 0;
        int var15 = 0;
        mi var16 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        var13 = id.field_f;
        var16 = var13;
        var2 = var16.h(-11);
        if (param0 == 4) {
          var3 = (ri) (Object) ob.field_M.a((byte) 100);
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var3.field_w == var2) {
                  break L1;
                } else {
                  var3 = (ri) (Object) ob.field_M.b(94);
                  continue L0;
                }
              }
            }
            if (var3 == null) {
              rm.b((byte) -59);
              return;
            } else {
              L2: {
                var4 = var16.h(-11);
                if (-1 == (var4 ^ -1)) {
                  break L2;
                } else {
                  var5 = var3.field_n;
                  Vertigo2.field_I[0] = qe.field_V;
                  var6_int = 1;
                  L3: while (true) {
                    if (var4 <= var6_int) {
                      vl.a(var5, var4, -26418);
                      var6_int = 0;
                      L4: while (true) {
                        if (var6_int >= var4) {
                          qb.a(var5, 2);
                          var3.field_t = new String[2][var5];
                          var6 = new String[2][var5];
                          var3.field_q = new int[2][4 * var5];
                          var7 = new int[2][4 * var5];
                          var8 = cq.field_i;
                          var9 = 0;
                          var10 = 0;
                          L5: while (true) {
                            if (var8 <= var9) {
                              var14 = 0;
                              var9 = var14;
                              var15 = 0;
                              var10 = var15;
                              L6: while (true) {
                                if (var14 >= var8) {
                                  break L2;
                                } else {
                                  var11 = ac.field_I[var5 + var14];
                                  var6[1][var15] = Vertigo2.field_I[var11];
                                  var7[1][4 * var15] = on.field_e[var11];
                                  var7[1][1 + var15 * 4] = li.field_g[var11];
                                  var7[1][var15 * 4 - -2] = ub.field_p[var11];
                                  var7[1][3 + 4 * var15] = jf.field_N[var11];
                                  if (wc.a(Vertigo2.field_I[var11], true)) {
                                    if (0 == jf.field_N[var11] + ub.field_p[var11] + li.field_g[var11]) {
                                      var6[1][var15] = null;
                                      var15--;
                                      var15++;
                                      var14++;
                                      continue L6;
                                    } else {
                                      var15++;
                                      var14++;
                                      continue L6;
                                    }
                                  } else {
                                    var15++;
                                    var14++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              var11 = ac.field_I[var9];
                              var6[0][var10] = Vertigo2.field_I[var11];
                              var7[0][var10 * 4] = on.field_e[var11];
                              var7[0][4 * var10 - -1] = li.field_g[var11];
                              var7[0][2 + 4 * var10] = ub.field_p[var11];
                              var7[0][4 * var10 - -3] = jf.field_N[var11];
                              if (wc.a(Vertigo2.field_I[var11], true)) {
                                if (ub.field_p[var11] + li.field_g[var11] + jf.field_N[var11] == 0) {
                                  var6[0][var10] = null;
                                  var10--;
                                  var10++;
                                  var9++;
                                  continue L5;
                                } else {
                                  var10++;
                                  var9++;
                                  continue L5;
                                }
                              } else {
                                var10++;
                                var9++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          vd.a((ed) (Object) var16, 11591);
                          if (0 == var6_int) {
                            var3.field_s = br.field_U;
                            var3.field_y = kp.field_P;
                            var3.field_u = af.field_E;
                            var3.field_p = bp.field_z;
                            wo.a(kp.field_P, af.field_E, true, var6_int, br.field_U, bp.field_z);
                            var6_int++;
                            continue L4;
                          } else {
                            wo.a(kp.field_P, af.field_E, true, var6_int, br.field_U, bp.field_z);
                            var6_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      Vertigo2.field_I[var6_int] = var13.f(128);
                      var6_int++;
                      continue L3;
                    }
                  }
                }
              }
              var3.field_v = true;
              var3.c(2);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Show all lobby chat";
    }
}
