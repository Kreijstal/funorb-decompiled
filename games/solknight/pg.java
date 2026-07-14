/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pg {
    static int field_b;
    static long[] field_d;
    static o field_a;
    static String field_c;
    static boolean field_e;

    final static void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        sd var4_ref_sd = null;
        long var4 = 0L;
        int var5 = 0;
        qc var6 = null;
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
        jd var27 = null;
        L0: {
          var26 = SolKnight.field_L ? 1 : 0;
          if (param0 < -112) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          var27 = te.field_N;
          var2 = var27.j(255);
          if (var2 != 0) {
            if (1 == var2) {
              var3 = var27.i(-4);
              var4 = var27.a(10526);
              var6 = (qc) (Object) sb.field_c.a((byte) 51);
              L2: while (true) {
                L3: {
                  if (var6 == null) {
                    break L3;
                  } else {
                    if (var6.field_u != var3) {
                      var6 = (qc) (Object) sb.field_c.b(-111);
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var6 == null) {
                  je.a(false);
                  return;
                } else {
                  var6.field_n = var4;
                  var6.c(10);
                  break L1;
                }
              }
            } else {
              hi.a((Throwable) null, "HS1: " + oc.a(false), 1);
              je.a(false);
              break L1;
            }
          } else {
            var3 = var27.i(-109);
            var4_ref_sd = (sd) (Object) r.field_b.a((byte) 51);
            L4: while (true) {
              L5: {
                if (var4_ref_sd == null) {
                  break L5;
                } else {
                  if (var3 == var4_ref_sd.field_o) {
                    break L5;
                  } else {
                    var4_ref_sd = (sd) (Object) r.field_b.b(-125);
                    continue L4;
                  }
                }
              }
              if (var4_ref_sd == null) {
                je.a(false);
                return;
              } else {
                L6: {
                  var5 = var27.j(255);
                  if (var5 == 0) {
                    break L6;
                  } else {
                    var6_int = var4_ref_sd.field_k;
                    da.field_a[0].field_c = false;
                    da.field_a[0].field_d = ne.field_g;
                    var7 = var4_ref_sd.field_l;
                    da.field_a[0].field_a = null;
                    var8_int = 1;
                    L7: while (true) {
                      if (var5 <= var8_int) {
                        var4_ref_sd.field_n = new String[3][var6_int];
                        var8 = new String[3][var6_int];
                        var9 = new String[3][var6_int];
                        var4_ref_sd.field_m = new long[3][var6_int];
                        var10 = new long[3][var6_int];
                        var4_ref_sd.field_i = new int[3][var7 * var6_int];
                        var11 = new int[3][var7 * var6_int];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.j(255);
                        if (0 >= var18) {
                          break L6;
                        } else {
                          var19 = 0;
                          L8: while (true) {
                            if (var18 <= var19) {
                              break L6;
                            } else {
                              L9: {
                                var20 = var27.j(255);
                                var21 = da.field_a[var20].field_d;
                                var22 = var27.a(10526);
                                var24 = var27.field_m;
                                if (var6_int > var19) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = da.field_a[var20].field_a;
                                  var10[0][var12] = var22;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var7 <= var25) {
                                      var12++;
                                      break L9;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var27.e(true);
                                      var25++;
                                      continue L10;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              L11: {
                                if (var21 == null) {
                                  break L11;
                                } else {
                                  if (kj.a(var21, (byte) -47)) {
                                    var8[1][var13] = ne.field_g;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var27.field_m = var24;
                                    var13++;
                                    var25 = 0;
                                    L12: while (true) {
                                      if (var7 <= var25) {
                                        break L11;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var27.e(true);
                                        var25++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var14 < var6_int) {
                                if (!da.field_a[var20].field_c) {
                                  da.field_a[var20].field_c = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = da.field_a[var20].field_a;
                                  var10[2][var14] = var22;
                                  var27.field_m = var24;
                                  var14++;
                                  var25 = 0;
                                  L13: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var27.e(true);
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
                        da.field_a[var8_int].field_d = var27.h(115);
                        da.field_a[var8_int].field_c = false;
                        if ((var27.j(255) ^ -1) != -2) {
                          da.field_a[var8_int].field_a = null;
                          var8_int++;
                          continue L7;
                        } else {
                          da.field_a[var8_int].field_a = var27.h(105);
                          var8_int++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                var4_ref_sd.field_h = true;
                var4_ref_sd.c(10);
                break L1;
              }
            }
          }
        }
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            gb var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_35_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (il.field_c.field_l >= 4) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (-1 != il.field_c.field_c) {
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
                        if (il.field_c.field_c != -2) {
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
                    case 8: {
                        try {
                            if (0 == ug.field_f) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ik.field_b = n.field_a.a(qk.field_o, ue.field_a, -28148);
                            ug.field_f = ug.field_f + 1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (-2 != ug.field_f) {
                                statePc = 18;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (2 != ik.field_b.field_c) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = ua.a(-1, (byte) -86);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if (-2 == ik.field_b.field_c) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ug.field_f = ug.field_f + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (-3 != (ug.field_f ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            qf.field_a = new ad((java.net.Socket) ik.field_b.field_e, n.field_a);
                            var2 = new gb(13);
                            si.a(hj.field_x, (byte) 22, sa.field_o, q.field_a, var2);
                            var2.c(param0 + 35, 15);
                            var2.b(nc.field_a, false);
                            qf.field_a.a(-28748, 0, 13, var2.field_l);
                            ug.field_f = ug.field_f + 1;
                            cj.field_c = 30000L + je.a(1);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-4 != (ug.field_f ^ -1)) {
                                statePc = 30;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if ((qf.field_a.b(-30119) ^ -1) >= -1) {
                                statePc = 27;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var1_int = qf.field_a.a(-116);
                            if (0 != var1_int) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            stackOut_24_0 = ua.a(var1_int, (byte) -86);
                            stackIn_25_0 = stackOut_24_0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        return stackIn_25_0;
                    }
                    case 26: {
                        try {
                            ug.field_f = ug.field_f + 1;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if ((cj.field_c ^ -1L) <= (je.a(param0 ^ 82) ^ -1L)) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = ua.a(-2, (byte) -86);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            if (param0 == 83) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            int discarded$2 = pg.a((byte) 9);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((ug.field_f ^ -1) != -5) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            il.field_c.a(la.field_n, (byte) 106, (Object) (Object) qf.field_a);
                            ug.field_f = 0;
                            ik.field_b = null;
                            qf.field_a = null;
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        try {
                            stackOut_35_0 = -1;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0;
                    }
                    case 37: {
                        var1 = (IOException) (Object) caughtException;
                        return ua.a(-3, (byte) -86);
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

    final static void a(int param0, int param1) {
        uc.field_b = (param0 << 666124592) / 150;
        if (param1 != 1) {
            field_e = false;
        }
        uc.field_c = param0 * 400 / 150;
        uc.field_e = param0 * 100 / 150;
    }

    public static void b(byte param0) {
        if (param0 <= 112) {
            field_b = -11;
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new long[32];
        field_c = "Menu: 'ESC'";
    }
}
