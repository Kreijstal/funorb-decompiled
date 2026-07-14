/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sh {
    static km[] field_b;
    static String field_a;
    static String field_c;
    static String field_d;

    final static void a(byte param0) {
        bo.a((byte) 33);
        if (param0 != -59) {
          return;
        } else {
          dk.field_g = true;
          bc.field_d = true;
          jh.field_e.i(param0 ^ -59);
          qd.a(-1845, qi.field_n, false);
          return;
        }
    }

    public static void c(int param0) {
        Object var2 = null;
        if (param0 > -96) {
          var2 = null;
          c discarded$2 = sh.a(113, (byte[]) null);
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static um a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param3 != 935) {
            return null;
        }
        return ci.a(param3 ^ -16417, param1, param0, param4, false, param2);
    }

    final static void a(int param0) {
        int var1 = 0;
        L0: {
          var1 = 121 / ((param0 - 40) / 53);
          if (jh.field_e != null) {
            jh.field_e.j(10907);
            break L0;
          } else {
            break L0;
          }
        }
        if (null != mk.field_e) {
          mk.field_e.l(-30336);
          of.d(-103);
          return;
        } else {
          of.d(-103);
          return;
        }
    }

    final static c a(int param0, byte[] param1) {
        c var2 = null;
        if (param0 == -1) {
          if (param1 == null) {
            return null;
          } else {
            var2 = new c(param1, be.field_a, a.field_c, wm.field_b, b.field_c, vk.field_d);
            ch.k(4210752);
            return var2;
          }
        } else {
          um discarded$9 = sh.a(-117, -92, false, -84, false);
          if (param1 == null) {
            return null;
          } else {
            var2 = new c(param1, be.field_a, a.field_c, wm.field_b, b.field_c, vk.field_d);
            ch.k(4210752);
            return var2;
          }
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (-1 < param1) {
          L0: {
            if (-1 != (1 + param1) % 4) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          return stackIn_5_0 != 0;
        } else {
          if (1582 > param1) {
            L1: {
              if (0 != param1 % 4) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            if (0 != param1 % 4) {
              return false;
            } else {
              if (-1 == (param1 % 100 ^ -1)) {
                if (param1 % 400 == 0) {
                  if (param0 != 14222) {
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    final static int b(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            p var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_33_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (4 <= qh.field_c.field_g) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (0 != (qh.field_c.field_c ^ -1)) {
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
                        if (-2 == qh.field_c.field_c) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 1;
                    }
                    case 6: {
                        return 4;
                    }
                    case 8: {
                        try {
                            if (vm.field_k != 0) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            dm.field_b = ol.field_N.a(ml.field_h, false, of.field_g);
                            vm.field_k = vm.field_k + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (vm.field_k != 1) {
                                statePc = 17;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (dm.field_b.field_f == 2) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = ic.a(125, -1);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if (-2 != (dm.field_b.field_f ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            vm.field_k = vm.field_k + 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (vm.field_k != 2) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            jj.field_a = new hn((java.net.Socket) dm.field_b.field_b, ol.field_N);
                            var2 = new p(13);
                            dh.a(ue.field_e, 11, uj.field_n, tg.field_t, var2);
                            var2.c(15, (byte) 95);
                            var2.d(ln.field_oc, (byte) -81);
                            jj.field_a.a(0, 13, (byte) -92, var2.field_o);
                            vm.field_k = vm.field_k + 1;
                            ve.field_Pb = 30000L + ud.a(2);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (vm.field_k != -4) {
                                statePc = 28;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-1 < jj.field_a.c(0)) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (ud.a(2) <= ve.field_Pb) {
                                statePc = 28;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = ic.a(-92, -2);
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return stackIn_23_0;
                    }
                    case 24: {
                        try {
                            var1_int = jj.field_a.b((byte) -103);
                            if (0 == var1_int) {
                                statePc = 27;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = ic.a(118, var1_int);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            vm.field_k = vm.field_k + 1;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (param0 == 32288) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            sh.a(24);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((vm.field_k ^ -1) != -5) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            qh.field_c.a((byte) 45, (Object) (Object) jj.field_a, oh.field_b);
                            jj.field_a = null;
                            dm.field_b = null;
                            vm.field_k = 0;
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = -1;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        var1 = (IOException) (Object) caughtException;
                        return ic.a(-18, -3);
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

    final static void a(boolean param0) {
        vk.field_g = 0;
        if (param0) {
            return;
        }
        df.a(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Withdraw invitation to <%0> to join this game";
        field_c = "Pawn";
        field_d = "Names should contain a maximum of 12 characters";
    }
}
