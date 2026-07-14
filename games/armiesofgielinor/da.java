/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static sa field_b;
    static int[][][] field_a;

    final static void c(int param0) {
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        vl.field_p = null;
        dj.field_a = 0;
        vg.field_p = 0;
        wh.field_c.b(126);
        ot.field_E.b(81);
        ms var1 = nh.field_K.a((byte) 66);
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
    }

    final static void a(byte param0, int param1) {
        L0: {
          if (null == vi.field_a) {
            break L0;
          } else {
            if (0 != vi.field_a.length) {
              L1: {
                if (-1 < (param1 ^ -1)) {
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
        if (param0 <= 10) {
            Object var2 = null;
            da.a(70, 41, (String[][]) null, (String[]) null, 94);
        }
        CharSequence var3 = (CharSequence) (Object) mv.field_d;
        ft.field_p = k.a(var3, false);
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
                        if (at.field_a) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) lj.a("getcookies", (byte) 81, param1);
                            var4 = dj.a(29, ';', var3);
                            if (param0 == 23660) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            field_a = null;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var5 = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 15;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                                statePc = 12;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var2_ref = caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (param1.getParameter("tuhstatbut") == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
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
        if (param0) {
            field_a = null;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, String[][] param2, String[] param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        param0 = ha.b(param0, param4, -4);
        int var5 = param2[param0].length;
        for (var6 = param1; var6 < var5; var6++) {
            var7 = var6;
            var8 = jj.a((byte) 103, var7, param2, param0);
            var9 = t.a(var8, param3, (byte) 118);
            aw.field_j[param4][param0][var7] = var9;
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
        t.field_c = kv.k(5);
        rl.field_C = new gk();
        if (param0 != -2) {
            Object var2 = null;
            boolean discarded$0 = da.a(43, (java.applet.Applet) null);
        }
        td.a(true, true, param0 + 25);
    }

    final static void a(byte param0) {
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
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var9 = mg.field_e;
        var2 = var9.k(0);
        if (param0 < -77) {
          L0: {
            var3 = var9.k(0);
            if (0 == var2) {
              var4 = (on) (Object) ss.field_t.e((byte) 96);
              if (var4 != null) {
                L1: {
                  var5 = fk.field_b + -var9.field_q;
                  var13 = var4.field_m;
                  var12 = var13;
                  var11 = var12;
                  var10 = var11;
                  var6 = var10;
                  if (var5 <= var13.length << -1591929918) {
                    break L1;
                  } else {
                    var5 = var13.length << -14358366;
                    break L1;
                  }
                }
                var7 = 0;
                L2: while (true) {
                  if (var5 <= var7) {
                    var4.d(-116);
                    break L0;
                  } else {
                    var6[var7 >> 1247296610] = var6[var7 >> 1247296610] + (var9.k(0) << rn.a(var7 << -39351256, 768));
                    var7++;
                    continue L2;
                  }
                }
              } else {
                dj.a((byte) -124);
                return;
              }
            } else {
              if (1 != var2) {
                af.a((Throwable) null, 70, "LR1: " + cm.b(false));
                dj.a((byte) -127);
                break L0;
              } else {
                var4_int = var9.a(100);
                var5_ref_rs = (rs) (Object) gg.field_F.e((byte) 107);
                L3: while (true) {
                  L4: {
                    if (var5_ref_rs == null) {
                      break L4;
                    } else {
                      L5: {
                        if (var5_ref_rs.field_r != var3) {
                          break L5;
                        } else {
                          if (var4_int != var5_ref_rs.field_l) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5_ref_rs = (rs) (Object) gg.field_F.a((byte) 123);
                      continue L3;
                    }
                  }
                  if (var5_ref_rs != null) {
                    var5_ref_rs.d(-105);
                    break L0;
                  } else {
                    dj.a((byte) -125);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
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
