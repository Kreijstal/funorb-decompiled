/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eab implements Runnable {
    private tlb field_e;
    static String field_s;
    boolean field_j;
    private mob field_u;
    private Thread field_p;
    au field_d;
    au field_o;
    private static int field_b;
    au field_t;
    private static String field_v;
    private mob field_f;
    private Object field_a;
    private static volatile long field_h;
    private eea field_x;
    private Object field_c;
    static java.lang.reflect.Method field_q;
    private static String field_m;
    static String field_r;
    private static String field_i;
    static String field_w;
    boolean field_k;
    au[] field_l;
    private boolean field_g;
    java.awt.EventQueue field_n;

    final mob a(int param0, int param1, Runnable param2) {
        RuntimeException var4 = null;
        mob stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        mob stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == 0) {
                break L0;
              } else {
                mob discarded$2 = this.a((byte) -95, 5, 55, 125, (Object) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((byte) -107, 2, param1, 0, (Object) (Object) param2);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final mob a(java.awt.Component param0, boolean param1, byte param2) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        mob stackIn_9_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        mob stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 <= -92) {
                            statePc = 4;
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
                    try {
                        mob discarded$2 = ((eab) this).a((byte) 95, (java.awt.datatransfer.Transferable) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackOut_4_1 = -107;
                        stackOut_4_2 = 15;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        if (!param1) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = stackIn_5_2;
                        stackOut_5_3 = 1;
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        stackIn_8_3 = stackOut_5_3;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = this;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = stackIn_7_2;
                        stackOut_7_3 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
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
                        stackOut_8_0 = this.a((byte) stackIn_8_1, stackIn_8_2, stackIn_8_3, 0, (Object) (Object) param0);
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((eab) this).field_k) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (param0 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        if (((eab) this).field_j) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((eab) this).field_c == null) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
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
                        statePc = 19;
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    try {
                        if (((eab) this).field_x == null) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 1;
                        stackIn_18_0 = stackOut_15_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final mob a(String param0, Class param1, int param2) {
        RuntimeException var4 = null;
        mob stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        mob stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param2 == -6576) {
                break L0;
              } else {
                mob discarded$2 = ((eab) this).a(-99, (String) null, -92);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((byte) -107, 9, 0, 0, (Object) (Object) new Object[2]);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    private final mob a(int param0, boolean param1, byte param2, String param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        mob stackIn_8_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        mob stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 == 85) {
                            statePc = 3;
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
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (mob) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackOut_3_1 = -107;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param1) {
                            statePc = 6;
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
                        stackOut_4_0 = this;
                        stackOut_4_1 = stackIn_4_1;
                        stackOut_4_2 = 1;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 22;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = this.a((byte) stackIn_7_1, stackIn_7_2, param0, 0, (Object) (Object) param3);
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            RuntimeException var2_ref3 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = this;
                            // monitorenter this
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            ((eab) this).field_g = true;
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) var3;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((eab) this).field_p.join();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 7 : 41);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var2_ref = (InterruptedException) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (((eab) this).field_d != null) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof InterruptedException ? 10 : 41);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof InterruptedException ? 10 : 41);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((eab) this).field_d.a(false);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 13 : 41);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((eab) this).field_t != null) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof InterruptedException ? 16 : 41);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof InterruptedException ? 16 : 41);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((eab) this).field_t.a(false);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 19 : 41);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (((eab) this).field_l == null) {
                                statePc = 31;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var2_int = 0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if ((((eab) this).field_l.length ^ -1) >= (var2_int ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof InterruptedException ? 25 : 41);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (((eab) this).field_l[var2_int] == null) {
                                statePc = 30;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof InterruptedException ? 25 : 28);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((eab) this).field_l[var2_int].a(false);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 29 : 28);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var2_int++;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (param0 == 0) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof InterruptedException ? 34 : 41);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ((eab) this).field_d = null;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof InterruptedException ? 34 : 41);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (null == ((eab) this).field_o) {
                                statePc = 42;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            ((eab) this).field_o.a(false);
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 39 : 38);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        var2_ref3 = (RuntimeException) (Object) caughtException;
                        throw var2_ref3;
                    }
                    case 42: {
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

    final mob a(Class[] param0, byte param1, Class param2, String param3) {
        RuntimeException var5 = null;
        mob stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        mob stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param1 >= 12) {
                break L0;
              } else {
                mob discarded$2 = ((eab) this).a(2, 98, (Runnable) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((byte) -107, 8, 0, 0, (Object) (Object) new Object[3]);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    private final mob a(byte param0, int param1, int param2, int param3, Object param4) {
        mob var6 = null;
        RuntimeException var6_ref = null;
        Object var7 = null;
        Throwable var8 = null;
        mob stackIn_13_0 = null;
        mob stackOut_12_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -107) {
                            statePc = 4;
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
                        mob discarded$3 = ((eab) this).a((java.awt.Frame) null, (byte) 92);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = new mob();
                        var6.field_b = param4;
                        var6.field_c = param1;
                        var6.field_e = param3;
                        var6.field_a = param2;
                        var7 = this;
                        // monitorenter this
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((eab) this).field_u == null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((eab) this).field_u.field_g = var6;
                        ((eab) this).field_u = var6;
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
                        ((eab) this).field_f = var6;
                        ((eab) this).field_u = var6;
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
                        this.notify();
                        // monitorexit var7
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) var8;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (mob) var6;
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
                    var6_ref = (RuntimeException) (Object) caughtException;
                    throw var6_ref;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final mob a(java.net.URL param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        mob stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        mob stackOut_3_0 = null;
        try {
          if (param1 >= 90) {
            return (mob) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a((byte) -107, 4, 0, 0, (Object) (Object) param0);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    final mob a(byte param0, java.awt.datatransfer.Transferable param1) {
        RuntimeException var3 = null;
        mob stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        mob stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == -45) {
                break L0;
              } else {
                boolean discarded$2 = ((eab) this).a(-33);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((byte) -107, 19, 0, 0, (Object) (Object) param1);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final mob a(int param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        mob stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        mob stackOut_0_0 = null;
        try {
          var4_int = -31 % ((-10 - param2) / 45);
          stackOut_0_0 = this.a(param0, false, (byte) 85, param1);
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return null;
    }

    final mob a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        mob stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        mob stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param1 == 4) {
                break L0;
              } else {
                ((eab) this).field_x = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((byte) -107, 6, (param3 << 1233998256) + param0, (param2 << -1815172880) + param4, (Object) null);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    public final void run() {
        try {
            mob var1 = null;
            RuntimeException var1_ref = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            ndb var3_ref2 = null;
            Thread var3_ref3 = null;
            Object[] var3_array = null;
            java.awt.datatransfer.Transferable var3_ref4 = null;
            int var3_int = 0;
            String var3_ref5 = null;
            Throwable var4 = null;
            java.awt.datatransfer.Clipboard var4_ref = null;
            int var4_int = 0;
            java.awt.Component var4_ref2 = null;
            int var5 = 0;
            Throwable var6 = null;
            int stackIn_88_0 = 0;
            int stackIn_95_0 = 0;
            String stackIn_113_0 = null;
            int stackIn_135_0 = 0;
            int stackOut_87_0 = 0;
            int stackOut_94_0 = 0;
            String stackOut_112_0 = null;
            int stackOut_132_0 = 0;
            int stackOut_134_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = this;
                            // monitorenter this
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            if (!((eab) this).field_g) {
                                statePc = 4;
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
                            // monitorexit var2
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (((eab) this).field_f == null) {
                                statePc = 9;
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
                            var1 = ((eab) this).field_f;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((eab) this).field_f = ((eab) this).field_f.field_g;
                            if (null != ((eab) this).field_f) {
                                statePc = 12;
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
                            ((eab) this).field_u = null;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            this.wait();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof InterruptedException ? 11 : 14);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            throw (RuntimeException) (Object) var4;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var2_int = var1.field_c;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (1 != var2_int) {
                                statePc = 24;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if ((wt.a(false) ^ -1L) <= (field_h ^ -1L)) {
                                statePc = 23;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var1.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var1.field_b), var1.field_a);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (22 == var2_int) {
                                statePc = 173;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-3 == (var2_int ^ -1)) {
                                statePc = 172;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (4 != var2_int) {
                                statePc = 38;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((field_h ^ -1L) < (wt.a(false) ^ -1L)) {
                                statePc = 36;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var1.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var1.field_b).openStream());
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if ((var2_int ^ -1) != -9) {
                                statePc = 47;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var3_array = (Object[]) var1.field_b;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((eab) this).field_k) {
                                statePc = 43;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (null != ((Class) var3_array[0]).getClassLoader()) {
                                statePc = 46;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var1.field_d = (Object) (Object) ((Class) var3_array[0]).getDeclaredMethod((String) var3_array[1], (Class[]) var3_array[2]);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (9 == var2_int) {
                                statePc = 164;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (-19 != (var2_int ^ -1)) {
                                statePc = 52;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var3_ref3 = (Thread) (Object) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var1.field_d = (Object) (Object) ((java.awt.datatransfer.Clipboard) (Object) var3_ref3).getContents((Object) null);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if ((var2_int ^ -1) == -20) {
                                statePc = 163;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (!((eab) this).field_k) {
                                statePc = 162;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if ((var2_int ^ -1) == -4) {
                                statePc = 157;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if ((var2_int ^ -1) != -22) {
                                statePc = 69;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if ((wt.a(false) ^ -1L) > (field_h ^ -1L)) {
                                statePc = 67;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var1.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var1.field_b).getAddress();
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (-6 == (var2_int ^ -1)) {
                                statePc = 153;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if ((var2_int ^ -1) == -7) {
                                statePc = 147;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var2_int != 7) {
                                statePc = 82;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (((eab) this).field_j) {
                                statePc = 81;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            Object discarded$6 = Class.forName("rk").getMethod("exit", new Class[0]).invoke(((eab) this).field_c, new Object[0]);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((eab) this).field_x.a(-76, (java.awt.Frame) var1.field_b);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (-13 != (var2_int ^ -1)) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var3_ref3 = (Thread) (Object) eab.a(field_b, field_m, (byte) -128, (String) var1.field_b);
                            var1.field_d = (Object) (Object) var3_ref3;
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (13 != var2_int) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var3_ref3 = (Thread) (Object) eab.a(field_b, "", (byte) -127, (String) var1.field_b);
                            var1.field_d = (Object) (Object) var3_ref3;
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (!((eab) this).field_k) {
                                statePc = 91;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            stackOut_87_0 = var2_int;
                            stackIn_88_0 = stackOut_87_0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if (stackIn_88_0 == 14) {
                                statePc = 141;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (!((eab) this).field_k) {
                                statePc = 98;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            stackOut_94_0 = 15;
                            stackIn_95_0 = stackOut_94_0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (stackIn_95_0 == var2_int) {
                                statePc = 131;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (((eab) this).field_j) {
                                statePc = 105;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (17 != var2_int) {
                                statePc = 105;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var3_array = (Object[]) var1.field_b;
                            Object discarded$7 = Class.forName("jg").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((eab) this).field_a, new Object[5]);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (var2_int != 16) {
                                statePc = 130;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (!field_s.startsWith("win")) {
                                statePc = 109;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof Exception ? 129 : (stateCaught_106 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof Exception ? 129 : (stateCaught_107 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof Exception ? 129 : (stateCaught_109 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var3_ref5 = (String) var1.field_b;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof Exception ? 129 : (stateCaught_110 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            if (var3_ref5.startsWith("http://")) {
                                statePc = 119;
                            } else {
                                statePc = 112;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof Exception ? 129 : (stateCaught_111 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            stackOut_112_0 = (String) var3_ref5;
                            stackIn_113_0 = stackOut_112_0;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof Exception ? 129 : (stateCaught_112 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            if (!((String) (Object) stackIn_113_0).startsWith("https://")) {
                                statePc = 118;
                            } else {
                                statePc = 114;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof Exception ? 129 : (stateCaught_113 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof Exception ? 129 : (stateCaught_114 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = (stateCaught_116 instanceof Exception ? 129 : (stateCaught_116 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = (stateCaught_118 instanceof Exception ? 129 : (stateCaught_118 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            var4_ref = (java.awt.datatransfer.Clipboard) (Object) "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = (stateCaught_119 instanceof Exception ? 129 : (stateCaught_119 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            if (var5 >= var3_ref5.length()) {
                                statePc = 127;
                            } else {
                                statePc = 121;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = (stateCaught_120 instanceof Exception ? 129 : (stateCaught_120 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            if (0 != (((String) (Object) var4_ref).indexOf((int) var3_ref5.charAt(var5)) ^ -1)) {
                                statePc = 126;
                            } else {
                                statePc = 122;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = (stateCaught_121 instanceof Exception ? 129 : (stateCaught_121 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = (stateCaught_122 instanceof Exception ? 129 : (stateCaught_122 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = (stateCaught_124 instanceof Exception ? 129 : (stateCaught_124 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            var5++;
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = (stateCaught_126 instanceof Exception ? 129 : (stateCaught_126 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var3_ref5 + "\"");
                            var1.field_d = null;
                            statePc = 128;
                            continue stateLoop;
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = (stateCaught_127 instanceof Exception ? 129 : (stateCaught_127 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        try {
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_128) {
                            caughtException = stateCaught_128;
                            statePc = (stateCaught_128 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var1.field_d = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = (stateCaught_129 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = (stateCaught_130 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            if (0 == var1.field_a) {
                                statePc = 134;
                            } else {
                                statePc = 132;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = (stateCaught_131 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 132: {
                        try {
                            stackOut_132_0 = 1;
                            stackIn_135_0 = stackOut_132_0;
                            statePc = 135;
                            continue stateLoop;
                        } catch (Throwable stateCaught_132) {
                            caughtException = stateCaught_132;
                            statePc = (stateCaught_132 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 134: {
                        try {
                            stackOut_134_0 = 0;
                            stackIn_135_0 = stackOut_134_0;
                            statePc = 135;
                            continue stateLoop;
                        } catch (Throwable stateCaught_134) {
                            caughtException = stateCaught_134;
                            statePc = (stateCaught_134 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 135: {
                        try {
                            var3_int = stackIn_135_0;
                            var4_ref2 = (java.awt.Component) var1.field_b;
                            statePc = 136;
                            continue stateLoop;
                        } catch (Throwable stateCaught_135) {
                            caughtException = stateCaught_135;
                            statePc = (stateCaught_135 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            if (!((eab) this).field_j) {
                                statePc = 139;
                            } else {
                                statePc = 137;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = (stateCaught_136 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        try {
                            ((eab) this).field_e.a(var4_ref2, -4, var3_int != 0);
                            statePc = 140;
                            continue stateLoop;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = (stateCaught_137 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            Object discarded$9 = Class.forName("jg").getDeclaredMethod("showcursor", new Class[2]).invoke(((eab) this).field_a, new Object[2]);
                            statePc = 140;
                            continue stateLoop;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = (stateCaught_139 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = (stateCaught_140 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            var3_int = var1.field_a;
                            var4_int = var1.field_e;
                            statePc = 142;
                            continue stateLoop;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = (stateCaught_141 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        try {
                            if (!((eab) this).field_j) {
                                statePc = 145;
                            } else {
                                statePc = 143;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_142) {
                            caughtException = stateCaught_142;
                            statePc = (stateCaught_142 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 143: {
                        try {
                            ((eab) this).field_e.a(var4_int, var3_int, (byte) -122);
                            statePc = 146;
                            continue stateLoop;
                        } catch (Throwable stateCaught_143) {
                            caughtException = stateCaught_143;
                            statePc = (stateCaught_143 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 145: {
                        try {
                            Object discarded$10 = Class.forName("jg").getDeclaredMethod("movemouse", new Class[2]).invoke(((eab) this).field_a, new Object[2]);
                            statePc = 146;
                            continue stateLoop;
                        } catch (Throwable stateCaught_145) {
                            caughtException = stateCaught_145;
                            statePc = (stateCaught_145 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = (stateCaught_146 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        try {
                            var3_ref3 = (Thread) (Object) new java.awt.Frame("Jagex Full Screen");
                            statePc = 148;
                            continue stateLoop;
                        } catch (Throwable stateCaught_147) {
                            caughtException = stateCaught_147;
                            statePc = (stateCaught_147 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 148: {
                        try {
                            var1.field_d = (Object) (Object) var3_ref3;
                            ((java.awt.Frame) (Object) var3_ref3).setResizable(false);
                            if (((eab) this).field_j) {
                                statePc = 151;
                            } else {
                                statePc = 149;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = (stateCaught_148 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        try {
                            Object discarded$11 = Class.forName("rk").getMethod("enter", new Class[5]).invoke(((eab) this).field_c, new Object[5]);
                            statePc = 152;
                            continue stateLoop;
                        } catch (Throwable stateCaught_149) {
                            caughtException = stateCaught_149;
                            statePc = (stateCaught_149 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        try {
                            ((eab) this).field_x.a(-70, (java.awt.Frame) (Object) var3_ref3, var1.field_e >> -98560208, var1.field_a >>> 1866735120, var1.field_e & 65535, var1.field_a & 65535);
                            statePc = 152;
                            continue stateLoop;
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = (stateCaught_151 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 152: {
                        try {
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_152) {
                            caughtException = stateCaught_152;
                            statePc = (stateCaught_152 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 153: {
                        try {
                            if (!((eab) this).field_j) {
                                statePc = 156;
                            } else {
                                statePc = 154;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_153) {
                            caughtException = stateCaught_153;
                            statePc = (stateCaught_153 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 154: {
                        try {
                            var1.field_d = (Object) (Object) ((eab) this).field_x.a(false);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = (stateCaught_154 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 156: {
                        try {
                            var1.field_d = Class.forName("rk").getMethod("listmodes", new Class[0]).invoke(((eab) this).field_c, new Object[0]);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_156) {
                            caughtException = stateCaught_156;
                            statePc = (stateCaught_156 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 157: {
                        try {
                            if (wt.a(false) < field_h) {
                                statePc = 160;
                            } else {
                                statePc = 158;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_157) {
                            caughtException = stateCaught_157;
                            statePc = (stateCaught_157 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 158: {
                        try {
                            statePc = 161;
                            continue stateLoop;
                        } catch (Throwable stateCaught_158) {
                            caughtException = stateCaught_158;
                            statePc = (stateCaught_158 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 160: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_160) {
                            caughtException = stateCaught_160;
                            statePc = (stateCaught_160 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 161: {
                        try {
                            var3_ref3 = (Thread) (Object) ((255 & var1.field_a >> 1743848856) + "." + ((var1.field_a & 16719400) >> -1852358736) + "." + (255 & var1.field_a >> 1405733512) + "." + (var1.field_a & 255));
                            var1.field_d = (Object) (Object) java.net.InetAddress.getByName((String) (Object) var3_ref3).getHostName();
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_161) {
                            caughtException = stateCaught_161;
                            statePc = (stateCaught_161 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 162: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_162) {
                            caughtException = stateCaught_162;
                            statePc = (stateCaught_162 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 163: {
                        try {
                            var3_ref4 = (java.awt.datatransfer.Transferable) var1.field_b;
                            var4_ref = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var4_ref.setContents(var3_ref4, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_163) {
                            caughtException = stateCaught_163;
                            statePc = (stateCaught_163 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 164: {
                        try {
                            var3_array = (Object[]) var1.field_b;
                            statePc = 165;
                            continue stateLoop;
                        } catch (Throwable stateCaught_164) {
                            caughtException = stateCaught_164;
                            statePc = (stateCaught_164 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 165: {
                        try {
                            if (((eab) this).field_k) {
                                statePc = 168;
                            } else {
                                statePc = 166;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_165) {
                            caughtException = stateCaught_165;
                            statePc = (stateCaught_165 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 166: {
                        try {
                            statePc = 171;
                            continue stateLoop;
                        } catch (Throwable stateCaught_166) {
                            caughtException = stateCaught_166;
                            statePc = (stateCaught_166 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 168: {
                        try {
                            if (null != ((Class) var3_array[0]).getClassLoader()) {
                                statePc = 171;
                            } else {
                                statePc = 169;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_168) {
                            caughtException = stateCaught_168;
                            statePc = (stateCaught_168 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 169: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_169) {
                            caughtException = stateCaught_169;
                            statePc = (stateCaught_169 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 171: {
                        try {
                            var1.field_d = (Object) (Object) ((Class) var3_array[0]).getDeclaredField((String) var3_array[1]);
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_171) {
                            caughtException = stateCaught_171;
                            statePc = (stateCaught_171 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 172: {
                        try {
                            var3_ref3 = new Thread((Runnable) var1.field_b);
                            var3_ref3.setDaemon(true);
                            var3_ref3.start();
                            var3_ref3.setPriority(var1.field_a);
                            var1.field_d = (Object) (Object) var3_ref3;
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_172) {
                            caughtException = stateCaught_172;
                            statePc = (stateCaught_172 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 173: {
                        try {
                            if ((wt.a(false) ^ -1L) <= (field_h ^ -1L)) {
                                statePc = 176;
                            } else {
                                statePc = 174;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_173) {
                            caughtException = stateCaught_173;
                            statePc = (stateCaught_173 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 174: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_174) {
                            caughtException = stateCaught_174;
                            statePc = (stateCaught_174 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 176: {
                        try {
                            var1.field_d = (Object) (Object) ppb.a((String) var1.field_b, var1.field_a, (byte) -112).a(2048);
                            statePc = 177;
                            continue stateLoop;
                        } catch (Throwable stateCaught_176) {
                            caughtException = stateCaught_176;
                            statePc = (stateCaught_176 instanceof ndb ? 178 : (stateCaught_176 instanceof ThreadDeath ? 181 : 182));
                            continue stateLoop;
                        }
                    }
                    case 177: {
                        try {
                            statePc = 179;
                            continue stateLoop;
                        } catch (Throwable stateCaught_177) {
                            caughtException = stateCaught_177;
                            statePc = (stateCaught_177 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 178: {
                        try {
                            var3_ref2 = (ndb) (Object) caughtException;
                            var1.field_d = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_178) {
                            caughtException = stateCaught_178;
                            statePc = (stateCaught_178 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 179: {
                        try {
                            var1.field_f = 1;
                            statePc = 180;
                            continue stateLoop;
                        } catch (Throwable stateCaught_179) {
                            caughtException = stateCaught_179;
                            statePc = (stateCaught_179 instanceof ThreadDeath ? 181 : 182);
                            continue stateLoop;
                        }
                    }
                    case 180: {
                        try {
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_180) {
                            caughtException = stateCaught_180;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 181: {
                        try {
                            var2_ref = (ThreadDeath) (Object) caughtException;
                            throw var2_ref;
                        } catch (Throwable stateCaught_181) {
                            caughtException = stateCaught_181;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 182: {
                        try {
                            var2_ref2 = caughtException;
                            var1.field_f = 2;
                            statePc = 183;
                            continue stateLoop;
                        } catch (Throwable stateCaught_182) {
                            caughtException = stateCaught_182;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 183: {
                        try {
                            var2 = (Object) (Object) var1;
                            // monitorenter var1
                            statePc = 184;
                            continue stateLoop;
                        } catch (Throwable stateCaught_183) {
                            caughtException = stateCaught_183;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 184: {
                        try {
                            ((Object) (Object) var1).notify();
                            // monitorexit var2
                            statePc = 185;
                            continue stateLoop;
                        } catch (Throwable stateCaught_184) {
                            caughtException = stateCaught_184;
                            statePc = 186;
                            continue stateLoop;
                        }
                    }
                    case 185: {
                        try {
                            statePc = 188;
                            continue stateLoop;
                        } catch (Throwable stateCaught_185) {
                            caughtException = stateCaught_185;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 186: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 187;
                            continue stateLoop;
                        } catch (Throwable stateCaught_186) {
                            caughtException = stateCaught_186;
                            statePc = 186;
                            continue stateLoop;
                        }
                    }
                    case 187: {
                        try {
                            throw (RuntimeException) (Object) var6;
                        } catch (Throwable stateCaught_187) {
                            caughtException = stateCaught_187;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 188: {
                        try {
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_188) {
                            caughtException = stateCaught_188;
                            statePc = 189;
                            continue stateLoop;
                        }
                    }
                    case 189: {
                        var1_ref = (RuntimeException) (Object) caughtException;
                        throw var1_ref;
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

    private final static au a(int param0, String param1, byte param2, String param3) {
        try {
            RuntimeException var4 = null;
            String var4_ref = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            au var8_ref = null;
            Object stackIn_2_0 = null;
            au stackIn_19_0 = null;
            Object stackIn_23_0 = null;
            Object stackOut_1_0 = null;
            au stackOut_18_0 = null;
            Object stackOut_22_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param2 < -126) {
                                statePc = 3;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 24;
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
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return (au) (Object) stackIn_2_0;
                    }
                    case 3: {
                        try {
                            if (-34 == (param0 ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof RuntimeException ? 24 : 6);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((param0 ^ -1) == -35) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof RuntimeException ? 24 : 6);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4_ref = "jagex_" + param1 + "_preferences" + param3 + ".dat";
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var4_ref = "jagex_" + param1 + "_preferences" + param3 + "_wip.dat";
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var4_ref = "jagex_" + param1 + "_preferences" + param3 + "_rc.dat";
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var5_array = new String[]{"c:/rscache/", "/rscache/", field_v, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
                            var6 = 0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if ((var6 ^ -1) <= (var5_array.length ^ -1)) {
                                statePc = 22;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var7 = var5_array[var6];
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (-1 <= (var7.length() ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 16 : 24);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (new File(var7).exists()) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 16 : 24);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8_ref = new au(new File(var7, var4_ref), "rw", 10000L);
                            stackOut_18_0 = (au) var8_ref;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof Exception ? 20 : 24);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0;
                    }
                    case 20: {
                        try {
                            var8 = (Exception) (Object) caughtException;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var6++;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = null;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return (au) (Object) stackIn_23_0;
                    }
                    case 24: {
                        var4 = (RuntimeException) (Object) caughtException;
                        throw var4;
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

    final boolean a(byte[] param0, byte param1, File param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        RuntimeException var4_ref2 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = new FileOutputStream(param2);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var4.write(param0, 0, param0.length);
                        if (param1 == 110) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof IOException ? 4 : 8);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_m = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IOException ? 4 : 8);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4.close();
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var4_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var4_ref2 = (RuntimeException) (Object) caughtException;
                    throw var4_ref2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final mob a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.Point var5 = null;
        RuntimeException var5_ref = null;
        mob stackIn_6_0 = null;
        mob stackOut_5_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var5 = param0.getLocationOnScreen();
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (param3 == 14) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        mob discarded$2 = ((eab) this).a((java.awt.Component) null, true, (byte) 77);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this.a((byte) -107, 14, var5.x + param2, var5.y + param1, (Object) null);
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    throw var5_ref;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final mob c(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        mob stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        mob stackOut_3_0 = null;
        try {
          if (param0 >= 91) {
            return (mob) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a((byte) -107, 18, 0, 0, (Object) null);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    final mob a(java.awt.Frame param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mob stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        mob stackOut_0_0 = null;
        try {
          var3_int = -90 % ((param1 - -51) / 55);
          stackOut_0_0 = this.a((byte) -107, 7, 0, 0, (Object) (Object) param0);
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return null;
    }

    final mob d(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        mob stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        mob stackOut_3_0 = null;
        try {
          if (param0 > 84) {
            return (mob) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a((byte) -107, 5, 0, 0, (Object) null);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    eab(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var5_int = 0;
        ThreadGroup var5_ref3 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        Thread[] stackIn_73_0 = null;
        Thread[] stackOut_72_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((eab) this).field_u = null;
                    ((eab) this).field_d = null;
                    ((eab) this).field_t = null;
                    ((eab) this).field_j = false;
                    ((eab) this).field_o = null;
                    ((eab) this).field_g = false;
                    ((eab) this).field_f = null;
                    ((eab) this).field_k = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_m = param1;
                        field_r = "1.1";
                        ((eab) this).field_k = param3;
                        field_b = param0;
                        field_w = "Unknown";
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_w = System.getProperty("java.vendor");
                        field_r = System.getProperty("java.version");
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 4 : 82);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (field_w.toLowerCase().indexOf("microsoft") != -1) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 7 : 82);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 7 : 82);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((eab) this).field_j = true;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_i = System.getProperty("os.name");
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 11 : 82);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        field_i = "Unknown";
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        field_s = field_i.toLowerCase();
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        String discarded$5 = System.getProperty("os.arch").toLowerCase();
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 15 : 82);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        String discarded$6 = System.getProperty("os.version").toLowerCase();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 18 : 82);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        field_v = System.getProperty("user.home");
                        if (field_v == null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 22 : 82);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        field_v = field_v + "/";
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 22 : 82);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (field_v == null) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 25 : 82);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof Exception ? 25 : 82);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        field_v = "~/";
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((eab) this).field_n = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5_ref = caughtException;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((eab) this).field_j) {
                            statePc = 37;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        java.lang.reflect.Method discarded$7 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof Exception ? 33 : 82);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        field_q = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof Exception ? 36 : 82);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        lfb.a(field_b, -109, field_m);
                        if (((eab) this).field_k) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof Exception ? 39 : 82);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 39 : 82);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((eab) this).field_o = new au(lfb.a("random.dat", -1, (String) null, field_b), "rw", 25L);
                        ((eab) this).field_d = new au(lfb.a("main_file_cache.dat2", (byte) 34), "rw", 314572800L);
                        ((eab) this).field_t = new au(lfb.a("main_file_cache.idx255", (byte) 34), "rw", 1048576L);
                        ((eab) this).field_l = new au[param2];
                        var5_int = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var5_int >= param2) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = (stateCaught_41 instanceof Exception ? 43 : 82);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((eab) this).field_l[var5_int] = new au(lfb.a("main_file_cache.idx" + var5_int, (byte) 34), "rw", 1048576L);
                        var5_int++;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof Exception ? 43 : 82);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (!((eab) this).field_j) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        Object discarded$8 = Class.forName("dna").newInstance();
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var5_ref = caughtException;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (((eab) this).field_j) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((eab) this).field_c = Class.forName("rk").newInstance();
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((eab) this).field_x = new eea();
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var5_ref = caughtException;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (((eab) this).field_j) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((eab) this).field_a = Class.forName("jg").newInstance();
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ((eab) this).field_e = new tlb();
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var5_ref = caughtException;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (!((eab) this).field_k) {
                            statePc = 80;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = (stateCaught_60 instanceof Exception ? 63 : 82);
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (((eab) this).field_j) {
                            statePc = 80;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = (stateCaught_61 instanceof Exception ? 63 : 82);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var5_ref3 = Thread.currentThread().getThreadGroup();
                        var6 = var5_ref3.getParent();
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (null == var6) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var5_ref3 = var6;
                        var6 = var5_ref3.getParent();
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var7 = new Thread[1000];
                        int discarded$9 = var5_ref3.enumerate(var7);
                        var8 = 0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((var7.length ^ -1) >= (var8 ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = (stateCaught_68 instanceof Exception ? 71 : 82);
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var7[var8] == null) {
                            statePc = 79;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = (stateCaught_69 instanceof Exception ? 75 : 82);
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = (stateCaught_70 instanceof Exception ? 75 : 82);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof Exception ? 75 : 82);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = (Thread[]) var7;
                        stackIn_73_0 = stackOut_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof Exception ? 75 : 82);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (((Thread) (Object) stackIn_73_0[var8]).getName().startsWith("AWT")) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof Exception ? 77 : 82);
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = (stateCaught_74 instanceof Exception ? 77 : 82);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof Exception ? 77 : 82);
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof Exception ? 77 : 82);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var7[var8].setPriority(1);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var8++;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ((eab) this).field_g = false;
                        ((eab) this).field_p = new Thread((Runnable) this);
                        ((eab) this).field_p.setPriority(10);
                        ((eab) this).field_p.setDaemon(true);
                        ((eab) this).field_p.start();
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    var5_ref2 = (RuntimeException) (Object) caughtException;
                    throw var5_ref2;
                }
                case 83: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0L;
    }
}
