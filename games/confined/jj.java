/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jj extends ug {
    private boolean field_nb;
    private String field_mb;
    static String field_hb;
    private boolean field_jb;
    private String field_ib;
    static int[] field_lb;
    private ib field_kb;

    public static void h(byte param0) {
        field_lb = null;
        if (param0 >= -64) {
            in discarded$0 = jj.a((byte) -108, true);
            field_hb = null;
            return;
        }
        field_hb = null;
    }

    jj(sh param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((jj) this).field_ib = param1;
        if (((jj) this).field_ib != null) {
            var3 = fd.field_k.b(((jj) this).field_ib, 260, fd.field_k.field_C);
            ((jj) this).a(-68, var3 + 150, 300);
        }
        ((jj) this).field_kb = new ib(13, 50, 274, 30, 15, 2113632, 4210752);
        ((jj) this).field_kb.field_N = true;
        ((jj) this).field_jb = false;
        ((jj) this).field_nb = false;
        ((jj) this).b((fj) (Object) ((jj) this).field_kb, 10);
    }

    final static in a(byte param0, boolean param1) {
        int var2 = -100 / ((param0 - 80) / 42);
        in var3 = new in(true);
        var3.field_i = param1 ? true : false;
        return var3;
    }

    final void a(int param0, boolean param1, float param2, String param3) {
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_18_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        boolean stackOut_15_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_17_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        if (param0 < -57) {
          L0: {
            stackOut_15_0 = ((jj) this).field_nb;
            stackIn_17_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (param1) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = 0;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L0;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L0;
            }
          }
          if ((stackIn_18_0 ? 1 : 0) == stackIn_18_1) {
            L1: {
              stackOut_20_0 = this;
              stackIn_22_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (!param1) {
                stackOut_22_0 = this;
                stackOut_22_1 = 0;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L1;
              } else {
                stackOut_21_0 = this;
                stackOut_21_1 = 1;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                break L1;
              }
            }
            ((jj) this).field_nb = stackIn_23_1 != 0;
            if (!((jj) this).field_nb) {
              ((jj) this).field_kb.a(2113632, false, 4210752);
              if (((jj) this).field_jb) {
                ((jj) this).field_kb.field_N = false;
                ((jj) this).field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
                ((jj) this).field_mb = param3;
                return;
              } else {
                ((jj) this).field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
                ((jj) this).field_mb = param3;
                return;
              }
            } else {
              ((jj) this).field_kb.a(8405024, false, 4210752);
              ((jj) this).field_kb.field_N = true;
              ((jj) this).field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
              ((jj) this).field_mb = param3;
              return;
            }
          } else {
            ((jj) this).field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
            ((jj) this).field_mb = param3;
            return;
          }
        } else {
          L2: {
            field_lb = null;
            stackOut_1_0 = ((jj) this).field_nb;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param1) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L2;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L2;
            }
          }
          if ((stackIn_4_0 ? 1 : 0) == stackIn_4_1) {
            L3: {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (!param1) {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            ((jj) this).field_nb = stackIn_9_1 != 0;
            if (!((jj) this).field_nb) {
              ((jj) this).field_kb.a(2113632, false, 4210752);
              if (((jj) this).field_jb) {
                ((jj) this).field_kb.field_N = false;
                ((jj) this).field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
                ((jj) this).field_mb = param3;
                return;
              } else {
                ((jj) this).field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
                ((jj) this).field_mb = param3;
                return;
              }
            } else {
              ((jj) this).field_kb.a(8405024, false, 4210752);
              ((jj) this).field_kb.field_N = true;
              ((jj) this).field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
              ((jj) this).field_mb = param3;
              return;
            }
          } else {
            ((jj) this).field_kb.field_R = (int)(65536.0f * (param2 / 100.0f));
            ((jj) this).field_mb = param3;
            return;
          }
        }
    }

    final static boolean a(int param0, byte param1) {
        try {
            int var2 = 0;
            int var3_int = 0;
            IOException var3 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_13_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (e.field_c.field_n < param0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (null != kl.field_G) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return false;
                    }
                    case 4: {
                        var2 = -103 % ((param1 - -39) / 37);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            var3_int = kl.field_G.c((byte) -79);
                            if (0 < var3_int) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (-e.field_c.field_n + param0 >= var3_int) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_int = param0 + -e.field_c.field_n;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            kl.field_G.a(e.field_c.field_m, -77, var3_int, e.field_c.field_n);
                            m.field_b = ri.a(-3);
                            e.field_c.field_n = e.field_c.field_n + var3_int;
                            if (param0 > e.field_c.field_n) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            e.field_c.field_n = 0;
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            if (0 > var3_int) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((la.h(118) ^ -1L) >= -30001L) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            dc.d(125);
                            return false;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            dc.d(125);
                            return false;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return false;
                    }
                    case 21: {
                        var3 = (IOException) (Object) caughtException;
                        dc.d(111);
                        return false;
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

    final void b(int param0, byte param1, int param2) {
        super.b(param0, (byte) -112, param2);
        fd.field_k.b(((jj) this).field_mb, param0 - -(((jj) this).field_F >> 252509569), param2 - -103, 16777215, -1);
        if (param1 >= -58) {
          L0: {
            ((jj) this).field_ib = null;
            if (((jj) this).field_ib != null) {
              fn.b(20 + param0, param2 - -120 + -7, 260, 8421504);
              int discarded$2 = fd.field_k.a(((jj) this).field_ib, param0 - -20, param2 - -128, 260, 100, 16777215, -1, 1, 0, fd.field_k.field_C);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((jj) this).field_ib != null) {
              fn.b(20 + param0, param2 - -120 + -7, 260, 8421504);
              int discarded$3 = fd.field_k.a(((jj) this).field_ib, param0 - -20, param2 - -128, 260, 100, 16777215, -1, 1, 0, fd.field_k.field_C);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void i(byte param0) {
        int var2 = -38 % ((67 - param0) / 57);
        ((jj) this).field_kb.field_N = false;
        ((jj) this).field_jb = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = "Passwords must be between 5 and 20 letters and numbers";
    }
}
