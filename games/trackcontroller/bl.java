/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl {
    static oi field_c;
    private String field_e;
    static String field_d;
    static qj field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 > -106) {
          field_a = null;
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        if (param1 != -4) {
          field_a = null;
          dh.a(((bl) this).field_e, 31536000L, param0, "jagex-last-login-method", param1 + 1004);
          return;
        } else {
          dh.a(((bl) this).field_e, 31536000L, param0, "jagex-last-login-method", param1 + 1004);
          return;
        }
    }

    final static void a(int param0, int param1, uf param2, be param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            kj var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            var14 = TrackController.field_F ? 1 : 0;
            var18 = new kj();
            var18.field_n = param3.h(16383);
            var18.field_w = param3.e((byte) 113);
            var18.field_j = new ce[var18.field_n];
            var18.field_u = new int[var18.field_n];
            var18.field_i = new int[var18.field_n];
            var18.field_m = new int[var18.field_n];
            var18.field_v = new ce[var18.field_n];
            var18.field_p = new byte[var18.field_n][][];
            var5 = param0;
            L0: while (true) {
              if (var18.field_n <= var5) {
              } else {
                try {
                  L1: {
                    L2: {
                      var6_int = param3.h(param0 ^ 16383);
                      if (0 == var6_int) {
                        break L2;
                      } else {
                        if ((var6_int ^ -1) == -2) {
                          break L2;
                        } else {
                          if ((var6_int ^ -1) != -3) {
                            L3: {
                              if (3 == var6_int) {
                                break L3;
                              } else {
                                if (-5 == (var6_int ^ -1)) {
                                  break L3;
                                } else {
                                  var5++;
                                  break L1;
                                }
                              }
                            }
                            var20 = param3.g(param0 + 0);
                            var8 = param3.g(0);
                            var9 = param3.h(16383);
                            var10 = new String[var9];
                            var11_int = 0;
                            L4: while (true) {
                              if (var9 <= var11_int) {
                                L5: {
                                  var23 = new byte[var9][];
                                  var22 = var23;
                                  var21 = var22;
                                  var19 = var21;
                                  var11 = var19;
                                  if (-4 == (var6_int ^ -1)) {
                                    var12_int = 0;
                                    L6: while (true) {
                                      if (var9 <= var12_int) {
                                        break L5;
                                      } else {
                                        var13 = param3.e((byte) 113);
                                        var11[var12_int] = new byte[var13];
                                        param3.a(105, var23[var12_int], 0, var13);
                                        var12_int++;
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                                var18.field_m[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L7: while (true) {
                                  if (var9 <= var17) {
                                    var18.field_v[var5] = param2.a(var8, var12, 0, ve.a((byte) 11, var20));
                                    var18.field_p[var5] = var23;
                                    break L1;
                                  } else {
                                    var12[var17] = ve.a((byte) 11, var10[var17]);
                                    var17++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var10[var11_int] = param3.g(0);
                                var11_int++;
                                continue L4;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L8: {
                      var16 = param3.g(param0 + 0);
                      var7 = var16;
                      var15 = param3.g(param0 ^ 0);
                      var8 = var15;
                      var9 = 0;
                      if (var6_int == 1) {
                        var9 = param3.e((byte) 113);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var18.field_m[var5] = var6_int;
                    var18.field_u[var5] = var9;
                    var18.field_j[var5] = param2.a(ma.a(param0, -26462), var15, ve.a((byte) 11, var16));
                    var5++;
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_i[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_i[var5] = -4;
                  var5++;
                }
                continue L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            be var2 = null;
            int stackIn_17_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_40_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_16_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_39_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (rj.field_d.field_e <= -5) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (0 == rj.field_d.field_b) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 3;
                    }
                    case 5: {
                        if (1 == (rj.field_d.field_b ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return 1;
                    }
                    case 7: {
                        return 4;
                    }
                    case 9: {
                        try {
                            if (rf.field_c == 0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            w.field_V = kb.field_d.a(35, ga.field_e, fc.field_g);
                            rf.field_c = rf.field_c + 1;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (1 == rf.field_c) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (-3 == w.field_V.field_f) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = ej.a(40, -1);
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0;
                    }
                    case 18: {
                        try {
                            if (-2 == w.field_V.field_f) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            rf.field_c = rf.field_c + 1;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (param0 <= -84) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            field_a = null;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if ((rf.field_c ^ -1) != -3) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ob.field_u = new bc((java.net.Socket) w.field_V.field_e, kb.field_d);
                            var2 = new be(13);
                            hl.a(kf.field_a, var2, 17, sa.field_T, vk.field_j);
                            var2.a(15, (byte) -100);
                            var2.b(false, gi.field_r);
                            ob.field_u.a(-128, var2.field_j, 13, 0);
                            rf.field_c = rf.field_c + 1;
                            ma.field_b = qg.a(false) + 30000L;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-4 != (rf.field_c ^ -1)) {
                                statePc = 36;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (0 >= ob.field_u.b(0)) {
                                statePc = 32;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var1_int = ob.field_u.a(-85);
                            if (0 != var1_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackOut_29_0 = ej.a(39, var1_int);
                            stackIn_30_0 = stackOut_29_0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        return stackIn_30_0;
                    }
                    case 31: {
                        try {
                            rf.field_c = rf.field_c + 1;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((ma.field_b ^ -1L) > (qg.a(false) ^ -1L)) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = ej.a(116, -2);
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        try {
                            if (-5 != (rf.field_c ^ -1)) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            rj.field_d.a((byte) 121, ai.field_b, (Object) (Object) ob.field_u);
                            ob.field_u = null;
                            w.field_V = null;
                            rf.field_c = 0;
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return stackIn_38_0;
                    }
                    case 39: {
                        try {
                            stackOut_39_0 = -1;
                            stackIn_40_0 = stackOut_39_0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        return stackIn_40_0;
                    }
                    case 41: {
                        var1 = (IOException) (Object) caughtException;
                        return ej.a(91, -3);
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

    bl(String param0) {
        ((bl) this).field_e = param0;
    }

    final boolean a(String param0, boolean param1) {
        if (param1) {
            return false;
        }
        return ((bl) this).field_e.equals((Object) (Object) param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "(Escape)";
        field_c = new oi();
    }
}
