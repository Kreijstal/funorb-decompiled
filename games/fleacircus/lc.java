/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class lc extends pa {
    static int field_r;
    static String field_s;
    static String field_q;
    static int[] field_v;
    static dd field_t;
    static int field_u;

    final static void a(ni param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            int var9 = 0;
            int var10 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int var4 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = fleas.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var8 = new byte[24];
                            var7 = var8;
                            var6 = var7;
                            var2 = var6;
                            if (null != ge.field_d) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ge.field_d.a(param1 ^ 14, 0L);
                            ge.field_d.a(631, var8);
                            var3_int = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 14;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = ((Object) stateCaught_4 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var10 = var8[var3_int] ^ -1;
                            var9 = -1;
                            if (var5 != 0) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var9 == var10) {
                                statePc = 12;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var9 <= var10) {
                                statePc = 16;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var5 == 0) {
                                statePc = 14;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_int++;
                            if (var5 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof Exception ? 18 : 27);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3 = (Exception) ((Object) caughtException);
                            var4 = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((var4 ^ -1) <= -25) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var6[var4] = (byte)-1;
                            var4++;
                            if (var5 != 0) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var5 == 0) {
                                statePc = 19;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            param0.a(var8, 24, 0, 0);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (param1 == -113) {
                                statePc = 31;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            lc.c((byte) -96);
                            return;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        var2_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_29_0 = (RuntimeException) (var2_ref);
                        stackIn_28_0 = stackIn_29_0;
                        stackIn_29_1 = new StringBuilder().append("lc.D(");
                        stackIn_28_1 = stackIn_29_1;
                        if (param0 == null) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                        stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                        stackIn_30_2 = "{...}";
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                        stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                        stackIn_30_2 = "null";
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        throw pf.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
                    }
                    case 31: {
                        return;
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

    lc() {
    }

    final static String f(int param0) {
        if (!(wi.field_f != cb.field_v)) {
            return ef.field_j;
        }
        if (param0 != 0) {
            return (String) null;
        }
        return jk.field_j;
    }

    public static void c(byte param0) {
        field_s = null;
        field_q = null;
        if (param0 != 99) {
            return;
        }
        field_t = null;
        field_v = null;
    }

    final static jh a(byte[] param0, boolean param1) {
        jh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        jh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2 = new jh(param0, vg.field_I, b.field_b, ij.field_H, ob.field_a, of.field_d);
                c.o(-28210);
                if (!param1) {
                  break L1;
                } else {
                  lc.f(105);
                  break L1;
                }
              }
              stackIn_6_0 = (jh) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("lc.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jh) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_q = "Account created successfully!";
        field_s = "Suggested names: ";
        field_v = new int[5];
    }
}
