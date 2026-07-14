/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rf {
    static int field_c;
    static boolean field_b;
    static int field_a;
    static kj field_d;

    final static void a(wk[] param0, int param1, int param2, int param3, int param4, int param5, wk[] param6, int param7, int param8, mi param9, int param10, int param11, int param12, int param13, wk[] param14) {
        if (param13 >= -81) {
            return;
        }
        int var15 = param9.field_U - -param9.field_F;
        int var16 = param9.field_U;
        pc.a(var16, param0, param1, param9, param5, param3, param12, param7, param2, param6, param8, var15, param10, param11, var16, param4, param9, var15, param14, 480, 53);
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 < 105) {
            field_b = false;
        }
    }

    final static int a(int param0) {
        if (param0 != -58) {
            return 24;
        }
        return 1;
    }

    final static ef a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = SteelSentinels.field_G;
        int var2 = param1.length();
        if (param0 != 16) {
            field_c = 67;
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return ec.field_b;
    }

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 >= 77) {
            break L0;
          } else {
            int discarded$2 = rf.a(-62);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == (Object) (Object) uf.field_g) {
              break L2;
            } else {
              if ((Object) (Object) wl.field_N == this) {
                break L2;
              } else {
                if (this != (Object) (Object) jd.field_sb) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static cm a(boolean param0, int param1, byte param2, boolean param3, boolean param4, int param5) {
        try {
            int var6 = 0;
            rc var7 = null;
            IOException var7_ref = null;
            rc var8 = null;
            fi var9 = null;
            cm stackIn_13_0 = null;
            cm stackOut_12_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = 73 % ((-55 - param2) / 59);
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var7 = null;
                            var8 = null;
                            if (km.field_k.field_f == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            si.field_o = new rj(km.field_k.field_f, 5200, 0);
                            km.field_k.field_f = null;
                            var7 = new rc(255, si.field_o, new rj(km.field_k.field_g, 12000, 0), 2097152);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (si.field_o == null) {
                                statePc = 10;
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
                            if (rh.field_o == null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            rh.field_o = new rj[km.field_k.field_a.length];
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (rh.field_o[param5] != null) {
                                statePc = 9;
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
                            rh.field_o[param5] = new rj(km.field_k.field_a[param5], 12000, 0);
                            km.field_k.field_a[param5] = null;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var8 = new rc(param5, si.field_o, rh.field_o[param5], 2097152);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var9 = gb.field_c.a(var7, (byte) 115, param3, var8, param5);
                            if (!param4) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var9.d((byte) 74);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = new cm((fa) (Object) var9, param0, param1);
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        var7_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException(var7_ref.toString());
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

    final static int a(int param0, na param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = v.field_e;
        if (param0 < -75) {
          L0: {
            if (2 != param1.field_k) {
              if (param1.field_k == 4) {
                var2 = pf.field_j[param1.field_k];
                break L0;
              } else {
                if (nb.field_G == param1.field_j) {
                  var2 = ag.field_r[param1.field_k];
                  break L0;
                } else {
                  var2 = pf.field_j[param1.field_k];
                  break L0;
                }
              }
            } else {
              if (param1.field_g) {
                var2 = v.field_e;
                break L0;
              } else {
                L1: {
                  if (-1 != (param1.field_w ^ -1)) {
                    break L1;
                  } else {
                    if (0 != param1.field_n) {
                      break L1;
                    } else {
                      var2 = ag.field_r[param1.field_k];
                      break L0;
                    }
                  }
                }
                var2 = pf.field_j[param1.field_k];
                break L0;
              }
            }
          }
          return var2;
        } else {
          return -50;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = 1024;
    }
}
