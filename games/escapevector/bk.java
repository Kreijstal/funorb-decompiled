/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk extends sb {
    static String[] field_q;
    static sf field_r;
    static int field_s;
    private pj field_t;

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            s var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = EscapeVector.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != ((bk) this).field_t) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 35 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 35 : 3);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((bk) this).field_t.c(12497);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof Exception ? 6 : 35);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var4 = (Exception) (Object) caughtException;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((bk) this).field_t = null;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (param2 < -80) {
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
                        return;
                    }
                    case 10: {
                        try {
                            ((bk) this).field_t = (pj) param0;
                            this.f(78);
                            this.a(param1, false);
                            ((bk) this).field_c = null;
                            ((bk) this).field_o.field_m = 0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var4_ref3 = (s) (Object) ((bk) this).field_l.b((byte) -75);
                            if (var4_ref3 == null) {
                                statePc = 15;
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
                            ((bk) this).field_p.a(-1, (fl) (Object) var4_ref3);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 14 : 35);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var4_ref3 = (s) (Object) ((bk) this).field_n.b((byte) -75);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var4_ref3 == null) {
                                statePc = 23;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 19 : 35);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((bk) this).field_j.a(-1, (fl) (Object) var4_ref3);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 22 : 35);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof Exception ? 22 : 35);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof Exception ? 22 : 35);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof Exception ? 22 : 35);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-1 != (((bk) this).field_m ^ -1)) {
                                statePc = 26;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof Exception ? 25 : 35);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof Exception ? 25 : 35);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((bk) this).field_e.field_m = 0;
                            ((bk) this).field_e.f(4, -123);
                            ((bk) this).field_e.f((int) ((bk) this).field_m, -123);
                            ((bk) this).field_e.a((byte) 125, 0);
                            ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 28 : 35);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var4_ref = (IOException) (Object) caughtException;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((bk) this).field_t.c(12497);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof Exception ? 31 : 35);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var5 = (Exception) (Object) caughtException;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ((bk) this).field_g = ((bk) this).field_g + 1;
                            ((bk) this).field_d = -2;
                            ((bk) this).field_t = null;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            ((bk) this).field_f = 0;
                            ((bk) this).field_k = td.b(128);
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        var4_ref2 = (RuntimeException) (Object) caughtException;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = (RuntimeException) var4_ref2;
                            stackOut_36_1 = new StringBuilder().append("bk.F(");
                            stackIn_39_0 = stackOut_36_0;
                            stackIn_39_1 = stackOut_36_1;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            if (param0 == null) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                            stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                            stackOut_37_2 = "{...}";
                            stackIn_40_0 = stackOut_37_0;
                            stackIn_40_1 = stackOut_37_1;
                            stackIn_40_2 = stackOut_37_2;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 39: {
                        stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                        stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                        stackOut_39_2 = "null";
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        throw t.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param1 + 44 + param2 + 41);
                    }
                    case 41: {
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

    public static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_q = null;
              if (param0 == -24811) {
                break L0;
              } else {
                field_q = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_r = null;
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException var3 = null;
            RuntimeException var3_ref = null;
            Exception var4 = null;
            n stackIn_3_0 = null;
            n stackIn_5_0 = null;
            n stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            n stackOut_2_0 = null;
            n stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            n stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (null != ((bk) this).field_t) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        try {
                            ((bk) this).field_e.field_m = 0;
                            stackOut_2_0 = ((bk) this).field_e;
                            stackIn_5_0 = stackOut_2_0;
                            stackIn_3_0 = stackOut_2_0;
                            if (!param0) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 12 : 18);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (n) (Object) stackIn_3_0;
                            stackOut_3_1 = 2;
                            stackIn_6_0 = stackOut_3_0;
                            stackIn_6_1 = stackOut_3_1;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 12 : 18);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (n) (Object) stackIn_5_0;
                            stackOut_5_1 = 3;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 12 : 18);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((n) (Object) stackIn_6_0).f(stackIn_6_1, -123);
                            ((bk) this).field_e.a(0L, 125);
                            if (!param1) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 12 : 18);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            bk.g(90);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 12 : 18);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 12 : 18);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 18);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3 = (IOException) (Object) caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((bk) this).field_t.c(12497);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 15 : 18);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var4 = (Exception) (Object) caughtException;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((bk) this).field_t = null;
                            ((bk) this).field_d = -2;
                            ((bk) this).field_g = ((bk) this).field_g + 1;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var3_ref = (RuntimeException) (Object) caughtException;
                        throw t.a((Throwable) (Object) var3_ref, "bk.N(" + param0 + 44 + param1 + 41);
                    }
                    case 19: {
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

    final static ij a(int param0, boolean param1, int param2, int param3, int param4) {
        ij var5 = null;
        ij var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        ij stackIn_7_0 = null;
        boolean stackIn_10_0 = false;
        int stackIn_10_1 = 0;
        ij stackIn_15_0 = null;
        ij stackOut_6_0 = null;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        ij stackOut_14_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = (ij) (Object) qd.field_n.a(false);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == var5) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((param0 ^ -1) != (var5.field_n ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (ij) var5;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var5 = (ij) (Object) qd.field_n.b((byte) 70);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = param1;
                        stackOut_9_1 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((stackIn_10_0 ? 1 : 0) == stackIn_10_1) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        field_q = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5_ref = new ij();
                        var5_ref.field_j = param4;
                        var5_ref.field_n = param0;
                        var5_ref.field_h = param2;
                        qd.field_n.a(-12328, (hg) (Object) var5_ref);
                        aj.a(124, param3, var5_ref);
                        stackOut_14_0 = (ij) var5_ref;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    var5_ref2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var5_ref2, "bk.K(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        Exception var2 = null;
        RuntimeException var2_ref = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((bk) this).field_t.c(12497);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof Exception ? 2 : 9);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = (Exception) (Object) caughtException;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((bk) this).field_g = ((bk) this).field_g + 1;
                        if (param0 < -108) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof Exception ? 6 : 9);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        bk.h(-33);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 6 : 9);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((bk) this).field_d = -1;
                        ((bk) this).field_t = null;
                        ((bk) this).field_m = (byte)(int)(1.0 + 255.0 * Math.random());
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2_ref, "bk.B(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((bk) this).a(-28);
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((bk) this).field_t == null) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((bk) this).field_t.c(12497);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "bk.E(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        try {
          if (!param1) {
            return stackIn_2_0;
          } else {
            stackOut_1_0 = 36;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var3_int = param2 >>> 960105023;
          stackOut_3_0 = (param2 - -var3_int) / param0 + -var3_int;
          stackIn_4_0 = stackOut_3_0;
        }
        return 0;
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        c var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref = null;
        int var4 = 0;
        tg var5 = null;
        String var6 = null;
        String var7 = null;
        tg var7_ref = null;
        int var8 = 0;
        int stackIn_13_0 = 0;
        String stackIn_62_0 = null;
        String stackIn_68_0 = null;
        tg stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        String stackIn_70_0 = null;
        tg stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        String stackOut_61_0 = null;
        String stackOut_67_0 = null;
        tg stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        String stackOut_68_0 = null;
        tg stackOut_68_1 = null;
        int stackOut_68_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = EscapeVector.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = om.field_g;
                        var2 = var1_ref.e(param0 ^ 0);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 == var2) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null == ml.field_a) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ml.field_a = new nn(128);
                        qc.field_Ab = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var1_ref.e(0) ^ -1) != -2) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3_int = stackIn_13_0;
                        var4_ref = var1_ref.c(false);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var3_int != 0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        String discarded$1 = var1_ref.c(false);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = gf.a(var4_ref, (byte) -125);
                        var6 = var1_ref.c(false);
                        var7 = sf.a(-123, (CharSequence) (Object) var4_ref);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == var7) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = var4_ref;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5 != null) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = gf.a(var6, (byte) 114);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null != var5) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ml.field_a.a((long)var7.hashCode(), (fl) (Object) var5, 26);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == var5) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5 = new tg();
                        ml.field_a.a((long)var7.hashCode(), (fl) (Object) var5, 37);
                        qc.field_Ab = qc.field_Ab + 1;
                        var5.field_pb = qc.field_Ab;
                        jd.field_a.a(-12328, (hg) (Object) var5);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5.field_ob = var4_ref;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return;
                }
                case 35: {
                    try {
                        if ((var2 ^ -1) == -2) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (bm.field_b == null) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        bm.field_b = new nn(128);
                        ua.field_a = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3 = var1_ref.c(false);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var3.equals((Object) (Object) "")) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var3 = null;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4_ref = var1_ref.c(false);
                        var5 = (tg) (Object) var1_ref.c(false);
                        var6 = (String) (Object) fk.a(param0 ^ -1465, var4_ref);
                        if (var6 != null) {
                            statePc = 53;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var6 = (String) (Object) fk.a(-1465, (String) (Object) var5);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var6 != null) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        bm.field_b.a((long)sf.a(-88, (CharSequence) (Object) var4_ref).hashCode(), (fl) (Object) var6, 25);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (null != var6) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var6 = (String) (Object) new tg();
                        bm.field_b.a((long)sf.a(-109, (CharSequence) (Object) var4_ref).hashCode(), (fl) (Object) var6, param0 ^ 123);
                        ua.field_a = ua.field_a + 1;
                        ((tg) (Object) var6).field_pb = ua.field_a;
                        ji.field_c.a(-12328, (hg) (Object) var6);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (null != var3) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var3 = var3.intern();
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ((tg) (Object) var6).field_ob = var4_ref;
                        ((tg) (Object) var6).field_lb = var3;
                        ((tg) (Object) var6).c((byte) -14);
                        var7_ref = (tg) (Object) ji.field_c.a(false);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (null == var7_ref) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = (String) var6;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!EscapeVector.a((tg) (Object) stackIn_62_0, var7_ref, -7457)) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var7_ref = (tg) (Object) ji.field_c.b((byte) 70);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var7_ref == null) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = (String) var6;
                        stackOut_67_1 = (tg) var7_ref;
                        stackOut_67_2 = -7;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        stackIn_68_2 = stackOut_67_2;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackOut_68_0 = (String) (Object) stackIn_68_0;
                        stackOut_68_1 = (tg) (Object) stackIn_68_1;
                        stackOut_68_2 = stackIn_68_2;
                        stackIn_70_0 = stackOut_68_0;
                        stackIn_70_1 = stackOut_68_1;
                        stackIn_70_2 = stackOut_68_2;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        EscapeVector.a((hg) (Object) stackIn_70_0, (hg) (Object) stackIn_70_1, (byte) stackIn_70_2);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ji.field_c.a(param0 ^ -12328, (hg) (Object) var6);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 74: {
                    return;
                }
                case 75: {
                    try {
                        if (-3 == (var2 ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (-2 != (mi.field_g ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        mi.field_g = 2;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 82: {
                    return;
                }
                case 83: {
                    try {
                        if ((var2 ^ -1) == -4) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((mi.field_g ^ -1) != -3) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        mi.field_g = 1;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 90: {
                    return;
                }
                case 91: {
                    try {
                        if (4 == var2) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        mi.field_g = 1;
                        var3 = var1_ref.c(false);
                        di.field_f = var3.intern();
                        var4 = var1_ref.e(0);
                        ii.a((byte) 16, var4);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    return;
                }
                case 96: {
                    try {
                        pf.a(false, "F1: " + hf.b((byte) -76), (Throwable) null);
                        nm.a(16);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 98: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var1, "bk.M(" + param0 + 41);
                }
                case 99: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(int param0) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (null != ((bk) this).field_t) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        try {
                            ((bk) this).field_e.field_m = 0;
                            ((bk) this).field_e.f(6, -123);
                            var2_int = 45 % ((-48 - param0) / 39);
                            ((bk) this).field_e.b(1743120456, 3);
                            ((bk) this).field_e.h(82, 0);
                            ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 4 : 10);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2 = (IOException) (Object) caughtException;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((bk) this).field_t.c(12497);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof Exception ? 7 : 10);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3 = (Exception) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((bk) this).field_g = ((bk) this).field_g + 1;
                            ((bk) this).field_d = -2;
                            ((bk) this).field_t = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        throw t.a((Throwable) (Object) var2_ref, "bk.L(" + param0 + 41);
                    }
                    case 11: {
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

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            long var2_long = 0L;
            s var2_ref2 = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            s var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_21_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_99_0 = 0;
            int stackIn_101_0 = 0;
            int stackIn_121_0 = 0;
            int stackIn_125_0 = 0;
            int stackIn_143_0 = 0;
            int stackIn_153_0 = 0;
            int stackIn_155_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_92_0 = 0;
            int stackOut_94_0 = 0;
            int stackOut_98_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_120_0 = 0;
            int stackOut_122_0 = 0;
            int stackOut_124_0 = 0;
            int stackOut_142_0 = 0;
            int stackOut_152_0 = 0;
            int stackOut_154_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = EscapeVector.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != ((bk) this).field_t) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 156 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 156 : 3);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2_long = td.b(param0 + 4122);
                            var4 = (int)(-((bk) this).field_k + var2_long);
                            ((bk) this).field_k = var2_long;
                            if (-201 <= (var4 ^ -1)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var4 = 200;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((bk) this).field_f = ((bk) this).field_f + var4;
                            if (30000 < ((bk) this).field_f) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof Exception ? 8 : 156);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 8 : 156);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((bk) this).field_t.c(param0 + 16491);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof Exception ? 11 : 156);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var5_ref_Exception = (Exception) (Object) caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((bk) this).field_t = null;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (null == ((bk) this).field_t) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 15 : 156);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 15 : 156);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (0 != ((bk) this).a(true)) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 19 : 156);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (((bk) this).a((byte) 88) == 0) {
                                statePc = 22;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 19 : 156);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = 0;
                            stackIn_21_0 = stackOut_20_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return stackIn_21_0 != 0;
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = 1;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return stackIn_23_0 != 0;
                    }
                    case 24: {
                        try {
                            ((bk) this).field_t.a((byte) 123);
                            var2_ref2 = (s) (Object) ((bk) this).field_p.a(0);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2_ref2 == null) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((bk) this).field_e.field_m = 0;
                            ((bk) this).field_e.f(1, -123);
                            ((bk) this).field_e.a(var2_ref2.field_p, -118);
                            ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                            ((bk) this).field_l.a(param0 + 3993, (fl) (Object) var2_ref2);
                            var2_ref2 = (s) (Object) ((bk) this).field_p.a((byte) -101);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 144 : (stateCaught_27 instanceof Exception ? 29 : 156));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var2_ref2 = (s) (Object) ((bk) this).field_j.a(param0 ^ param0);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var2_ref2 == null) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ((bk) this).field_e.field_m = 0;
                            ((bk) this).field_e.f(0, -123);
                            ((bk) this).field_e.a(var2_ref2.field_p, -3);
                            ((bk) this).field_t.a(((bk) this).field_e.field_g.length, 0, ((bk) this).field_e.field_g, 5000);
                            ((bk) this).field_n.a(-1, (fl) (Object) var2_ref2);
                            var2_ref2 = (s) (Object) ((bk) this).field_j.a((byte) -43);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var2_int = 0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 142;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var3_int = ((bk) this).field_t.b(param0 + 3876);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var3_int < 0) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 144 : (stateCaught_36 instanceof Exception ? 38 : 156));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if ((var3_int ^ -1) == -1) {
                                statePc = 142;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((bk) this).field_f = 0;
                            var4 = 0;
                            if (((bk) this).field_c != null) {
                                statePc = 45;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var4 = 10;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 144 : (stateCaught_44 instanceof Exception ? 47 : 156));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (((bk) this).field_c.field_F == 0) {
                                statePc = 50;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 144 : (stateCaught_45 instanceof Exception ? 49 : 156));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 144 : (stateCaught_46 instanceof Exception ? 49 : 156));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 144 : (stateCaught_47 instanceof Exception ? 49 : 156));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 144 : (stateCaught_48 instanceof Exception ? 49 : 156));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var4 = 1;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (-1 > (var4 ^ -1)) {
                                statePc = 77;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var5 = ((bk) this).field_c.field_A.field_g.length - ((bk) this).field_c.field_y;
                            var6 = -((bk) this).field_c.field_F + 512;
                            if ((-((bk) this).field_c.field_A.field_m + var5 ^ -1) <= (var6 ^ -1)) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var6 = var5 + -((bk) this).field_c.field_A.field_m;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if ((var6 ^ -1) < (var3_int ^ -1)) {
                                statePc = 57;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 144 : (stateCaught_54 instanceof Exception ? 56 : 156));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 144 : (stateCaught_55 instanceof Exception ? 56 : 156));
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var6 = var3_int;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((bk) this).field_t.a(((bk) this).field_c.field_A.field_m, var6, ((bk) this).field_c.field_A.field_g, (byte) -49);
                            if (((bk) this).field_m != 0) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 144 : (stateCaught_58 instanceof Exception ? 60 : 156));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 144 : (stateCaught_59 instanceof Exception ? 60 : 156));
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var7 = 0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if ((var6 ^ -1) >= (var7 ^ -1)) {
                                statePc = 66;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((bk) this).field_c.field_A.field_g[var7 + ((bk) this).field_c.field_A.field_m] = (byte)n.a((int) ((bk) this).field_c.field_A.field_g[var7 + ((bk) this).field_c.field_A.field_m], (int) ((bk) this).field_m);
                            var7++;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 144 : (stateCaught_63 instanceof Exception ? 65 : 156));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            ((bk) this).field_c.field_F = ((bk) this).field_c.field_F + var6;
                            ((bk) this).field_c.field_A.field_m = ((bk) this).field_c.field_A.field_m + var6;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if ((var5 ^ -1) != (((bk) this).field_c.field_A.field_m ^ -1)) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof IOException ? 144 : (stateCaught_67 instanceof Exception ? 70 : 156));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            ((bk) this).field_c.d(-110);
                            ((bk) this).field_c.field_u = false;
                            ((bk) this).field_c = null;
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof IOException ? 144 : (stateCaught_68 instanceof Exception ? 73 : 156));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof IOException ? 144 : (stateCaught_70 instanceof Exception ? 73 : 156));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if ((((bk) this).field_c.field_F ^ -1) == -513) {
                                statePc = 76;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof IOException ? 144 : (stateCaught_71 instanceof Exception ? 75 : 156));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof IOException ? 144 : (stateCaught_72 instanceof Exception ? 75 : 156));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof IOException ? 144 : (stateCaught_73 instanceof Exception ? 75 : 156));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof IOException ? 144 : (stateCaught_74 instanceof Exception ? 75 : 156));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ((bk) this).field_c.field_F = 0;
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var5 = var4 + -((bk) this).field_o.field_m;
                            if (var3_int >= var5) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var5 = var3_int;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((bk) this).field_t.a(((bk) this).field_o.field_m, var5, ((bk) this).field_o.field_g, (byte) -49);
                            if ((((bk) this).field_m ^ -1) == -1) {
                                statePc = 85;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var6 = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var6 >= var5) {
                                statePc = 85;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((bk) this).field_o.field_g[var6 + ((bk) this).field_o.field_m] = (byte)n.a((int) ((bk) this).field_o.field_g[var6 + ((bk) this).field_o.field_m], (int) ((bk) this).field_m);
                            var6++;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof IOException ? 144 : (stateCaught_82 instanceof Exception ? 84 : 156));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            ((bk) this).field_o.field_m = ((bk) this).field_o.field_m + var5;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if ((((bk) this).field_o.field_m ^ -1) > (var4 ^ -1)) {
                                statePc = 141;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof IOException ? 144 : (stateCaught_86 instanceof Exception ? 89 : 156));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (((bk) this).field_c != null) {
                                statePc = 127;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof IOException ? 144 : (stateCaught_87 instanceof Exception ? 89 : 156));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            ((bk) this).field_o.field_m = 0;
                            var6 = ((bk) this).field_o.e(0);
                            var7 = ((bk) this).field_o.g(-5053);
                            var8 = ((bk) this).field_o.e(0);
                            var9 = ((bk) this).field_o.g(-5053);
                            var10 = var8 & 127;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (0 == (128 & var8)) {
                                statePc = 94;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof IOException ? 144 : (stateCaught_91 instanceof Exception ? 93 : 156));
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            stackOut_92_0 = 1;
                            stackIn_95_0 = stackOut_92_0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof IOException ? 144 : (stateCaught_92 instanceof Exception ? 93 : 156));
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            stackOut_94_0 = 0;
                            stackIn_95_0 = stackOut_94_0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var11 = stackIn_95_0;
                            var12 = (long)var7 + ((long)var6 << 75841248);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var14_ref = (s) (Object) ((bk) this).field_n.a(0);
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (var14_ref == null) {
                                statePc = 117;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof IOException ? 144 : (stateCaught_97 instanceof Exception ? 100 : 156));
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            stackOut_98_0 = (var12 < var14_ref.field_p ? -1 : (var12 == var14_ref.field_p ? 0 : 1));
                            stackIn_99_0 = stackOut_98_0;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof IOException ? 144 : (stateCaught_98 instanceof Exception ? 103 : 156));
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            stackOut_99_0 = stackIn_99_0;
                            stackIn_101_0 = stackOut_99_0;
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof IOException ? 144 : (stateCaught_99 instanceof Exception ? 103 : 156));
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof IOException ? 144 : (stateCaught_100 instanceof Exception ? 103 : 156));
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (stackIn_101_0 != 0) {
                                statePc = 107;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof IOException ? 144 : (stateCaught_101 instanceof Exception ? 103 : 156));
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof IOException ? 144 : (stateCaught_104 instanceof Exception ? 106 : 156));
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var14_ref = (s) (Object) ((bk) this).field_n.a((byte) 106);
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var14_ref = (s) (Object) ((bk) this).field_l.a(0);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if (null == var14_ref) {
                                statePc = 117;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            if ((var12 ^ -1L) != (var14_ref.field_p ^ -1L)) {
                                statePc = 116;
                            } else {
                                statePc = 111;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof IOException ? 144 : (stateCaught_110 instanceof Exception ? 112 : 156));
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof IOException ? 144 : (stateCaught_113 instanceof Exception ? 115 : 156));
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = (stateCaught_115 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            var14_ref = (s) (Object) ((bk) this).field_l.a((byte) -52);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = (stateCaught_116 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            if (null != var14_ref) {
                                statePc = 120;
                            } else {
                                statePc = 118;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = (stateCaught_117 instanceof IOException ? 144 : (stateCaught_117 instanceof Exception ? 119 : 156));
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = (stateCaught_118 instanceof IOException ? 144 : (stateCaught_118 instanceof Exception ? 119 : 156));
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = (stateCaught_119 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            ((bk) this).field_c = var14_ref;
                            stackOut_120_0 = -1;
                            stackIn_121_0 = stackOut_120_0;
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = (stateCaught_120 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            if (stackIn_121_0 != (var10 ^ -1)) {
                                statePc = 124;
                            } else {
                                statePc = 122;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = (stateCaught_121 instanceof IOException ? 144 : (stateCaught_121 instanceof Exception ? 123 : 156));
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            stackOut_122_0 = 5;
                            stackIn_125_0 = stackOut_122_0;
                            statePc = 125;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = (stateCaught_122 instanceof IOException ? 144 : (stateCaught_122 instanceof Exception ? 123 : 156));
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = (stateCaught_123 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            stackOut_124_0 = 9;
                            stackIn_125_0 = stackOut_124_0;
                            statePc = 125;
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = (stateCaught_124 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 125: {
                        try {
                            var15 = stackIn_125_0;
                            statePc = 126;
                            continue stateLoop;
                        } catch (Throwable stateCaught_125) {
                            caughtException = stateCaught_125;
                            statePc = (stateCaught_125 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            ((bk) this).field_c.field_A = new n(var15 + (var9 - -((bk) this).field_c.field_y));
                            ((bk) this).field_c.field_A.f(var10, -123);
                            ((bk) this).field_c.field_A.a((byte) 125, var9);
                            ((bk) this).field_c.field_F = 10;
                            ((bk) this).field_o.field_m = 0;
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = (stateCaught_126 instanceof IOException ? 144 : (stateCaught_126 instanceof Exception ? 129 : 156));
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            if (0 == ((bk) this).field_c.field_F) {
                                statePc = 132;
                            } else {
                                statePc = 128;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = (stateCaught_127 instanceof IOException ? 144 : (stateCaught_127 instanceof Exception ? 131 : 156));
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        try {
                            statePc = 130;
                            continue stateLoop;
                        } catch (Throwable stateCaught_128) {
                            caughtException = stateCaught_128;
                            statePc = (stateCaught_128 instanceof IOException ? 144 : (stateCaught_128 instanceof Exception ? 131 : 156));
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = (stateCaught_129 instanceof IOException ? 144 : (stateCaught_129 instanceof Exception ? 131 : 156));
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            statePc = 139;
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = (stateCaught_130 instanceof IOException ? 144 : (stateCaught_130 instanceof Exception ? 131 : 156));
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = (stateCaught_131 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 132: {
                        try {
                            if (0 == (((bk) this).field_o.field_g[0] ^ -1)) {
                                statePc = 136;
                            } else {
                                statePc = 133;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_132) {
                            caughtException = stateCaught_132;
                            statePc = (stateCaught_132 instanceof IOException ? 144 : (stateCaught_132 instanceof Exception ? 135 : 156));
                            continue stateLoop;
                        }
                    }
                    case 133: {
                        try {
                            ((bk) this).field_c = null;
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_133) {
                            caughtException = stateCaught_133;
                            statePc = (stateCaught_133 instanceof IOException ? 144 : (stateCaught_133 instanceof Exception ? 138 : 156));
                            continue stateLoop;
                        }
                    }
                    case 135: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_135) {
                            caughtException = stateCaught_135;
                            statePc = (stateCaught_135 instanceof IOException ? 144 : (stateCaught_135 instanceof Exception ? 138 : 156));
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            ((bk) this).field_o.field_m = 0;
                            ((bk) this).field_c.field_F = 1;
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = (stateCaught_136 instanceof IOException ? 144 : (stateCaught_136 instanceof Exception ? 140 : 156));
                            continue stateLoop;
                        }
                    }
                    case 138: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = (stateCaught_138 instanceof IOException ? 144 : (stateCaught_138 instanceof Exception ? 140 : 156));
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = (stateCaught_139 instanceof IOException ? 144 : (stateCaught_139 instanceof Exception ? 140 : 156));
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = (stateCaught_140 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            var2_int++;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = (stateCaught_141 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        try {
                            stackOut_142_0 = 1;
                            stackIn_143_0 = stackOut_142_0;
                            statePc = 143;
                            continue stateLoop;
                        } catch (Throwable stateCaught_142) {
                            caughtException = stateCaught_142;
                            statePc = (stateCaught_142 instanceof IOException ? 144 : 156);
                            continue stateLoop;
                        }
                    }
                    case 143: {
                        return stackIn_143_0 != 0;
                    }
                    case 144: {
                        try {
                            var2 = (IOException) (Object) caughtException;
                            statePc = 145;
                            continue stateLoop;
                        } catch (Throwable stateCaught_144) {
                            caughtException = stateCaught_144;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 145: {
                        try {
                            ((bk) this).field_t.c(12497);
                            statePc = 146;
                            continue stateLoop;
                        } catch (Throwable stateCaught_145) {
                            caughtException = stateCaught_145;
                            statePc = (stateCaught_145 instanceof Exception ? 147 : 156);
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            statePc = 148;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        try {
                            var3 = (Exception) (Object) caughtException;
                            statePc = 148;
                            continue stateLoop;
                        } catch (Throwable stateCaught_147) {
                            caughtException = stateCaught_147;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 148: {
                        try {
                            ((bk) this).field_t = null;
                            ((bk) this).field_d = -2;
                            ((bk) this).field_g = ((bk) this).field_g + 1;
                            if ((((bk) this).a(true) ^ -1) != -1) {
                                statePc = 154;
                            } else {
                                statePc = 149;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = (stateCaught_148 instanceof Exception ? 151 : 156);
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        try {
                            if (((bk) this).a((byte) 88) != 0) {
                                statePc = 154;
                            } else {
                                statePc = 150;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_149) {
                            caughtException = stateCaught_149;
                            statePc = (stateCaught_149 instanceof Exception ? 151 : 156);
                            continue stateLoop;
                        }
                    }
                    case 150: {
                        try {
                            statePc = 152;
                            continue stateLoop;
                        } catch (Throwable stateCaught_150) {
                            caughtException = stateCaught_150;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 152: {
                        try {
                            stackOut_152_0 = 1;
                            stackIn_153_0 = stackOut_152_0;
                            statePc = 153;
                            continue stateLoop;
                        } catch (Throwable stateCaught_152) {
                            caughtException = stateCaught_152;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 153: {
                        return stackIn_153_0 != 0;
                    }
                    case 154: {
                        try {
                            stackOut_154_0 = 0;
                            stackIn_155_0 = stackOut_154_0;
                            statePc = 155;
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = 156;
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        return stackIn_155_0 != 0;
                    }
                    case 156: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        throw t.a((Throwable) (Object) var2_ref, "bk.I(" + param0 + 41);
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

    final static Object a(boolean param0, byte[] param1, int param2) {
        km var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        km stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Object stackOut_1_0 = null;
        Object stackOut_4_0 = null;
        km stackOut_7_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 == 9) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        if (null != param1) {
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
                        stackOut_4_0 = null;
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
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        if ((param1.length ^ -1) >= -137) {
                            statePc = 9;
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
                        var3 = new km();
                        ((fh) (Object) var3).a(true, param1);
                        stackOut_7_0 = (km) var3;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return (Object) (Object) stackIn_8_0;
                }
                case 9: {
                    try {
                        if (param0) {
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
                        stackOut_10_0 = (byte[]) param1;
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
                    return (Object) (Object) stackIn_11_0;
                }
                case 12: {
                    try {
                        stackOut_12_0 = pn.a(param2 + -9, param1);
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
                    return (Object) (Object) stackIn_13_0;
                }
                case 14: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) var3_ref;
                        stackOut_15_1 = new StringBuilder().append("bk.O(").append(param0).append(44);
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param1 == null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                    stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                    stackOut_18_2 = "null";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public bk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{"Well done, commander. You have secured all the stolen technology stored in the aliens' outer system.<delay><br>Your mission is complete."};
    }
}
