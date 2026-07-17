/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static sa field_b;
    static int[][][] field_a;

    final static void c(int param0) {
        ms var1 = null;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            vl.field_p = null;
            dj.field_a = 0;
            vg.field_p = 0;
            wh.field_c.b(126);
            ot.field_E.b(81);
            var1 = nh.field_K.a((byte) 66);
            while (var1 != null) {
                var1.c((byte) -76);
                var1 = nh.field_K.c(1);
            }
            if (param0 > -112) {
                da.a(89, true);
            }
            var1 = bk.field_a.a((byte) 66);
            while (var1 != null) {
                var1.c((byte) -76);
                var1 = bk.field_a.c(1);
            }
            th.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "da.I(" + param0 + 41);
        }
    }

    final static void a(byte param0, int param1) {
        L0: {
          if (null == vi.field_a) {
            break L0;
          } else {
            if (0 != vi.field_a.length) {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param1 < vi.field_a.length) {
                    L2: {
                      te discarded$8 = ub.a((byte) 106, vi.field_a[param1]);
                      if (param0 <= -22) {
                        break L2;
                      } else {
                        da.b(0);
                        break L2;
                      }
                    }
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0) {
        mv.field_d = mg.field_e.g(1);
        CharSequence var2 = (CharSequence) (Object) mv.field_d;
        int discarded$0 = 0;
        ft.field_p = k.a(var2);
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_19_0 = 0;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (at.field_a) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 1;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) lj.a("getcookies", (byte) 81, param1);
                            var4 = dj.a(29, ';', var3);
                            if (param0 == 23660) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            field_a = null;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var5 = 0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 17;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 14;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            var5++;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var2_ref = caughtException;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param1.getParameter("tuhstatbut") == null) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return stackIn_20_0 != 0;
                    }
                    case 21: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_21_0 = (RuntimeException) var2_ref2;
                        stackOut_21_1 = new StringBuilder().append("da.E(").append(param0).append(44);
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (param1 == null) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "{...}";
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                        stackOut_23_2 = "null";
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        throw ig.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
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

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, String[][] param2, String[] param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param0 = ha.b(param0, param4, -4);
            var5_int = param2[param0].length;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var5_int) {
                break L0;
              } else {
                var7 = var6;
                var8 = jj.a((byte) 103, var7, param2, param0);
                int discarded$2 = 118;
                var9 = t.a(var8, param3);
                aw.field_j[param4][param0][var7] = var9;
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("da.B(").append(param0).append(44).append(0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -10820) {
            field_b = null;
        }
        if (jj.b((byte) -73)) {
            param1 = false;
        }
        ca.a(5295, param1);
        jg.a((byte) 102);
    }

    final static void b(int param0) {
        int discarded$0 = 5;
        t.field_c = kv.k();
        rl.field_C = new gk();
        if (param0 != -2) {
            Object var2 = null;
            boolean discarded$1 = da.a(43, (java.applet.Applet) null);
        }
        td.a(true, true, param0 + 25);
    }

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        on var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rs var5_ref_rs = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        bv var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var9 = mg.field_e;
            var2 = var9.k(0);
            L1: {
              var3 = var9.k(0);
              if (0 == var2) {
                var4 = (on) (Object) ss.field_t.e((byte) 96);
                if (var4 != null) {
                  L2: {
                    var5 = fk.field_b + -var9.field_q;
                    var13 = var4.field_m;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5 <= var13.length << 2) {
                      break L2;
                    } else {
                      var5 = var13.length << 2;
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var5 <= var7) {
                      var4.d(-116);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.k(0) << rn.a(var7 << 8, 768));
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  dj.a((byte) -124);
                  return;
                }
              } else {
                if (1 != var2) {
                  int discarded$1 = 0;
                  af.a((Throwable) null, 70, "LR1: " + cm.b());
                  dj.a((byte) -127);
                  break L1;
                } else {
                  var4_int = var9.a(100);
                  var5_ref_rs = (rs) (Object) gg.field_F.e((byte) 107);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_rs == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var5_ref_rs.field_r != var3) {
                            break L6;
                          } else {
                            if (var4_int != var5_ref_rs.field_l) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_rs = (rs) (Object) gg.field_F.a((byte) 123);
                        continue L4;
                      }
                    }
                    if (var5_ref_rs != null) {
                      var5_ref_rs.d(-105);
                      break L1;
                    } else {
                      dj.a((byte) -125);
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "da.G(" + -101 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new sa();
        field_a = new int[][][]{new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[2][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][]};
    }
}
