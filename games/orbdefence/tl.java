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

    final static void a(int param0, ha param1) {
        se var5 = null;
        int var4 = 0;
        try {
            var5 = uk.field_b;
            if (param0 > -121) {
                field_h = null;
            }
            var5.i(4, 92);
            var5.field_i = var5.field_i + 1;
            var4 = var5.field_i;
            var5.a(1, -125);
            var5.a(param1.field_h, -85);
            var5.a(param1.field_i, -69);
            var5.b(param1.field_m, -1);
            var5.b(param1.field_n, -1);
            var5.b(param1.field_k, -1);
            var5.b(param1.field_f, -1);
            int discarded$0 = var5.e(-18951, var4);
            var5.c((byte) -77, -var4 + var5.field_i);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "tl.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 4 + 41);
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        int var4 = 0;
        return nk.a((byte) -97);
    }

    final static boolean a(java.applet.Applet param0) {
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
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int stackOut_3_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (fa.field_b) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
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
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) gm.a(-31183, "getcookies", param0);
                            var4 = g.a(-101, ';', var3);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 15;
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
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 16;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            var5++;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var2_ref = caughtException;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (param0.getParameter("tuhstatbut") == null) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_20_0 = (RuntimeException) var2_ref2;
                        stackOut_20_1 = new StringBuilder().append("tl.G(");
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param0 == null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "null";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        throw dd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 61 + 41);
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
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                    param1.getAppletContext().showDocument(f.a(param1, var2, 103), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("tl.E(").append(-102).append(44);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_b = null;
        field_e = null;
        field_d = null;
        field_f = null;
        field_h = null;
        field_g = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (kk.field_U == null) {
              break L1;
            } else {
              if (param0 > kk.field_U.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          kk.field_U = new int[param0 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == field_d) {
              break L3;
            } else {
              if (field_d.length >= param0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          field_d = new int[param0 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (null == vl.field_g) {
              break L5;
            } else {
              if (param0 > vl.field_g.length) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          vl.field_g = new int[param0 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (null == th.field_f) {
              break L7;
            } else {
              if (th.field_f.length >= param0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          th.field_f = new int[param0 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (null == ld.field_b) {
              break L9;
            } else {
              if (param0 <= ld.field_b.length) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          ld.field_b = new int[param0 * 2];
          break L8;
        }
        L10: {
          L11: {
            if (rh.field_c == null) {
              break L11;
            } else {
              if (param0 <= rh.field_c.length) {
                break L10;
              } else {
                break L11;
              }
            }
          }
          rh.field_c = new int[param0 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (bc.field_o == null) {
              break L13;
            } else {
              if (bc.field_o.length < param2 + param0) {
                break L13;
              } else {
                break L12;
              }
            }
          }
          bc.field_o = new int[(param2 + param0) * 2];
          break L12;
        }
        L14: {
          L15: {
            if (null == ql.field_c) {
              break L15;
            } else {
              if (ql.field_c.length >= param0) {
                break L14;
              } else {
                break L15;
              }
            }
          }
          ql.field_c = new boolean[param0 * 2];
          break L14;
        }
        qh.field_a = 2147483647;
        jl.field_d = -2147483648;
        am.field_e = 2147483647;
        hc.field_j = -2147483648;
        rc.field_d = 0;
    }

    final static void b() {
        ql.field_e = 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              ul.d(param2, param1, param3 - -1, 10000536);
              ul.d(param2, param1 - -param0, param3 + 1, 12105912);
              var5_int = 1;
              var6 = param0;
              if (var5_int + param1 >= ul.field_d) {
                break L1;
              } else {
                var5_int = -param1 + ul.field_d;
                break L1;
              }
            }
            L2: {
              if (var6 + param1 > ul.field_a) {
                var6 = -param1 + ul.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                var7 = -80 % ((85 - param4) / 33);
                break L0;
              } else {
                var8 = 152 - -(var7 * 48 / param0);
                var9 = var8 << 16 | var8 << 8 | var8;
                ul.field_b[(var7 + param1) * ul.field_f + param2] = var9;
                ul.field_b[param3 + ul.field_f * (param1 - -var7) - -param2] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var5, "tl.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
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
