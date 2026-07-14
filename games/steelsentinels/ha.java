/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha extends dl implements qn {
    static String field_R;
    static wk[] field_Q;
    static String field_S;
    private vn field_U;
    static int field_V;
    static wj field_T;
    static String field_P;

    abstract int h(byte param0);

    public final tl a(boolean param0) {
        if (param0) {
            int discarded$0 = ((ha) this).h((byte) 56);
        }
        return (tl) (Object) ((ha) this).field_U;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = SteelSentinels.field_G;
          var5 = param1 + param0;
          var6 = param2 + param4;
          if (param0 > pb.field_i) {
            stackOut_2_0 = param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = pb.field_i;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param4 > pb.field_l) {
            stackOut_5_0 = param4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = pb.field_l;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 >= pb.field_b) {
            stackOut_8_0 = pb.field_b;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var6 >= pb.field_d) {
            stackOut_11_0 = pb.field_d;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var10 = stackIn_12_0;
          if (pb.field_i > param0) {
            break L4;
          } else {
            if (pb.field_b > param0) {
              var11 = var8 * pb.field_c - -param0;
              var12 = 1 + (var10 + -var8) >> -909883775;
              L5: while (true) {
                var12--;
                if ((var12 ^ -1) > -1) {
                  break L4;
                } else {
                  pb.field_g[var11] = 16777215;
                  var11 = var11 + pb.field_c * 2;
                  continue L5;
                }
              }
            } else {
              break L4;
            }
          }
        }
        L6: {
          if (param4 < pb.field_l) {
            break L6;
          } else {
            if (pb.field_d <= var6) {
              break L6;
            } else {
              var11 = var7 + param4 * pb.field_c;
              var12 = -var7 + var9 + 1 >> 1141241665;
              L7: while (true) {
                var12--;
                if ((var12 ^ -1) > -1) {
                  break L6;
                } else {
                  pb.field_g[var11] = 16777215;
                  var11 += 2;
                  continue L7;
                }
              }
            }
          }
        }
        if (param3 == 0) {
          L8: {
            if (pb.field_i > var5) {
              break L8;
            } else {
              if (pb.field_b > var5) {
                var11 = ((1 & -param0 + var5) + var8) * pb.field_c + var5;
                var12 = -var8 + var10 + 1 >> -1245447519;
                L9: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L8;
                  } else {
                    pb.field_g[var11] = 16777215;
                    var11 = var11 + pb.field_c * 2;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
          }
          L10: {
            if (pb.field_l > param4) {
              break L10;
            } else {
              if (pb.field_d <= var6) {
                break L10;
              } else {
                var11 = var6 * pb.field_c + (var7 + (1 & var6 + -param4));
                var12 = -var7 + 1 - -var9 >> -1789499263;
                L11: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L10;
                  } else {
                    pb.field_g[var11] = 16777215;
                    var11 += 2;
                    continue L11;
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

    abstract int k(int param0);

    ha(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static String a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = SteelSentinels.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) hn.a(param0, (byte) -96, "getcookies");
                            var4 = ka.a(';', false, var3);
                            var5 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var4[var5].substring(var6 - -1).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var5++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3_ref = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (param2 != -15645) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        return null;
                    }
                    case 12: {
                        field_P = null;
                        return null;
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

    abstract int j(int param0);

    abstract boolean i(int param0);

    void a(byte param0, vn param1) {
        ((ha) this).field_U = param1;
        ((ha) this).field_U.field_n = (ha) this;
        if (param0 >= -17) {
            tl discarded$0 = ((ha) this).a(true);
        }
    }

    public static void c(boolean param0) {
        field_R = null;
        field_T = null;
        if (!param0) {
            Object var2 = null;
            String discarded$0 = ha.a((java.applet.Applet) null, (String) null, 37);
        }
        field_S = null;
        field_P = null;
        field_Q = null;
    }

    final static void a(int param0, int param1, byte param2, mi param3, int param4, wk param5, int param6, int param7, int param8, int param9, int param10) {
        pa.field_b = param6;
        ij.field_W = param10;
        be.field_e = param4;
        vl.field_t = param8;
        sg.field_e = param7;
        int var11 = 51 / ((param2 - 42) / 49);
        ej.field_y = param1;
        ci.field_g = param9;
        hl.field_r = param5;
    }

    final static int a(byte param0) {
        int var1 = 117 / ((2 - param0) / 58);
        return ob.field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "The <%0> module cannot be engineered at this time.";
        field_V = -1;
        field_S = "CONFIGURATION";
        field_P = "Find opponents";
    }
}
