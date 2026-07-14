/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class em extends t {
    static pj field_C;
    static int field_B;

    final static boolean a(byte param0, String param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 84) {
          L0: {
            field_B = 72;
            if (null == ch.a(param1, -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == ch.a(param1, -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static ad a(boolean param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            gf var6 = null;
            IOException var6_ref = null;
            gf var7 = null;
            ca var8 = null;
            Object stackIn_12_0 = null;
            ad stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_11_0 = null;
            ad stackOut_15_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var6 = null;
                            if (null == rk.field_g.field_t) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            ah.field_f = new ch(rk.field_g.field_t, 5200, 0);
                            rk.field_g.field_t = null;
                            var6 = new gf(255, ah.field_f, new ch(rk.field_g.field_i, 12000, 0), 2097152);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7 = null;
                            if (ah.field_f == null) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (bl.field_o == null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            bl.field_o = new ch[rk.field_g.field_e.length];
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (null == bl.field_o[param1]) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            bl.field_o[param1] = new ch(rk.field_g.field_e[param1], 12000, 0);
                            rk.field_g.field_e[param1] = null;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var7 = new gf(param1, ah.field_f, bl.field_o[param1], 2097152);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var8 = c.field_h.a(-24559, var6, param1, var7, param0);
                            if (param5 == 50) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = null;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return (ad) (Object) stackIn_12_0;
                    }
                    case 13: {
                        try {
                            if (!param2) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var8.a(-1);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = new ad((rf) (Object) var8, param3, param4);
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0;
                    }
                    case 17: {
                        var6_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException(var6_ref.toString());
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

    final static void a(long param0, boolean param1) {
        if ((param0 ^ -1L) < -1L) {
          if (!param1) {
            if (0L != param0 % 10L) {
              hc.a(param0, (byte) -50);
              return;
            } else {
              hc.a(param0 - 1L, (byte) -50);
              hc.a(1L, (byte) -50);
              return;
            }
          } else {
            field_C = null;
            if (0L != param0 % 10L) {
              hc.a(param0, (byte) -50);
              return;
            } else {
              hc.a(param0 - 1L, (byte) -50);
              hc.a(1L, (byte) -50);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -27714) {
            field_B = 50;
            field_C = null;
            return;
        }
        field_C = null;
    }

    private em(String param0, of param1) {
        this(param0, hi.field_b.field_i, param1);
        ((em) this).field_h = hi.field_b.field_l;
    }

    final static void a(Object param0, byte param1, md param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param2.field_b != null) {
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (50 <= var3_int) {
                break L1;
              } else {
                if (param2.field_b.peekEvent() == null) {
                  break L1;
                } else {
                  em.a(1L, false);
                  var3_int++;
                  continue L0;
                }
              }
            }
            L2: {
              if (param1 == -101) {
                break L2;
              } else {
                var5 = null;
                boolean discarded$1 = em.a((byte) -42, (String) null);
                break L2;
              }
            }
            try {
              if (param0 != null) {
                param2.field_b.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param0, 1001, "dummy"));
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return;
            }
          }
        } else {
          return;
        }
    }

    private em(String param0, ml param1, of param2) {
        super(param0, param1, param2);
        ((em) this).field_h = hi.field_b.field_l;
    }

    final void b(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((em) this).field_u) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((em) this).field_u = stackIn_3_1 != 0;
        if (param0 >= -23) {
          em.a(-109);
          super.b(-48, param1, param2, param3);
          return;
        } else {
          super.b(-48, param1, param2, param3);
          return;
        }
    }

    em(String param0, of param1, boolean param2) {
        this(param0, param1);
        ((em) this).field_u = param2 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new pj();
    }
}
