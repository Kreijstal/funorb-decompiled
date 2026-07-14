/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tl {
    static Random field_f;
    static int field_a;
    static ba field_c;
    static String field_e;
    static va field_h;
    static qj field_g;
    static int[] field_d;
    static int[] field_b;

    final static void a(int param0, ha param1, int param2) {
        se var5 = uk.field_b;
        if (param0 > -121) {
            field_h = null;
        }
        var5.i(param2, 92);
        var5.field_i = var5.field_i + 1;
        int var4 = var5.field_i;
        var5.a(1, -125);
        var5.a(param1.field_h, -85);
        var5.a(param1.field_i, -69);
        var5.b(param1.field_m, -1);
        var5.b(param1.field_n, -1);
        var5.b(param1.field_k, -1);
        var5.b(param1.field_f, -1);
        int discarded$0 = var5.e(-18951, var4);
        var5.c((byte) -77, -var4 + var5.field_i);
    }

    final static int a(int param0, int param1, boolean param2, byte param3) {
        int var4 = 14 % ((1 - param3) / 43);
        return nk.a((byte) -97);
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_5_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = OrbDefence.field_D ? 1 : 0;
                        if (fa.field_b) {
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
                            var3 = (String) gm.a(-31183, "getcookies", param0);
                            var4 = g.a(param1 ^ -90, ';', var3);
                            if (param1 == 61) {
                                statePc = 6;
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
                            stackOut_4_0 = 0;
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            var5 = 0;
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
                            if (var5 >= var4.length) {
                                statePc = 15;
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
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                                statePc = 12;
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
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
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
                            statePc = 7;
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
                        if (param0.getParameter("tuhstatbut") == null) {
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

    final boolean a(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 74) {
            break L0;
          } else {
            boolean discarded$2 = ((tl) this).a((byte) -102);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == (Object) (Object) da.field_m) {
              break L2;
            } else {
              if (this == (Object) (Object) lm.field_e) {
                break L2;
              } else {
                if ((Object) (Object) da.field_r != this) {
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

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param0 != -102) {
                    field_a = 43;
                }
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                param1.getAppletContext().showDocument(f.a(param1, var2, param0 ^ -3), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_f = null;
        if (param0 >= -88) {
            field_e = null;
        }
        field_h = null;
        field_g = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          if (param1 == 12105912) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (kk.field_U == null) {
              break L2;
            } else {
              if (param0 > kk.field_U.length) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          kk.field_U = new int[param0 * 2];
          break L1;
        }
        L3: {
          L4: {
            if (null == field_d) {
              break L4;
            } else {
              if (field_d.length >= param0) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          field_d = new int[param0 * 2];
          break L3;
        }
        L5: {
          L6: {
            if (null == vl.field_g) {
              break L6;
            } else {
              if (param0 > vl.field_g.length) {
                break L6;
              } else {
                break L5;
              }
            }
          }
          vl.field_g = new int[param0 * 2];
          break L5;
        }
        L7: {
          L8: {
            if (null == th.field_f) {
              break L8;
            } else {
              if (th.field_f.length >= param0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          th.field_f = new int[param0 * 2];
          break L7;
        }
        L9: {
          L10: {
            if (null == ld.field_b) {
              break L10;
            } else {
              if (param0 <= ld.field_b.length) {
                break L9;
              } else {
                break L10;
              }
            }
          }
          ld.field_b = new int[param0 * 2];
          break L9;
        }
        L11: {
          L12: {
            if (rh.field_c == null) {
              break L12;
            } else {
              if (param0 <= rh.field_c.length) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          rh.field_c = new int[param0 * 2];
          break L11;
        }
        L13: {
          L14: {
            if (bc.field_o == null) {
              break L14;
            } else {
              if (bc.field_o.length < param2 + param0) {
                break L14;
              } else {
                break L13;
              }
            }
          }
          bc.field_o = new int[(param2 + param0) * 2];
          break L13;
        }
        L15: {
          L16: {
            if (null == ql.field_c) {
              break L16;
            } else {
              if (ql.field_c.length >= param0) {
                break L15;
              } else {
                break L16;
              }
            }
          }
          ql.field_c = new boolean[param0 * 2];
          break L15;
        }
        qh.field_a = 2147483647;
        jl.field_d = -2147483648;
        am.field_e = 2147483647;
        hc.field_j = -2147483648;
        rc.field_d = 0;
    }

    final static void b(int param0) {
        ql.field_e = 0;
        if (param0 < 93) {
            field_g = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = OrbDefence.field_D ? 1 : 0;
        ul.d(param2, param1, param3 - -1, 10000536);
        ul.d(param2, param1 - -param0, param3 + 1, 12105912);
        int var5 = 1;
        int var6 = param0;
        if (var5 + param1 < ul.field_d) {
            var5 = -param1 + ul.field_d;
        }
        if (!(var6 + param1 <= ul.field_a)) {
            var6 = -param1 + ul.field_a;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 152 - -(var7 * 48 / param0);
            var9 = var8 << 1882216976 | var8 << 840434568 | var8;
            ul.field_b[(var7 + param1) * ul.field_f + param2] = var9;
            ul.field_b[param3 + ul.field_f * (param1 - -var7) - -param2] = var9;
        }
        var7 = -80 % ((85 - param4) / 33);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new Random();
        field_c = new ba(7, 0, 1, 1);
        field_h = new va();
    }
}
