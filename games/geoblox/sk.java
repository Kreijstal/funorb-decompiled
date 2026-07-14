/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk {
    private int field_i;
    private long field_c;
    private int field_d;
    private long field_e;
    private pa field_a;
    private long field_k;
    private long field_g;
    private byte[] field_j;
    private byte[] field_h;
    private long field_b;
    private long field_f;

    private final void b(byte param0) throws IOException {
        RuntimeException var2 = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_34_0 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_33_0 = 0;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0L == (((sk) this).field_c ^ -1L)) {
                            statePc = 48;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((((sk) this).field_b ^ -1L) != (((sk) this).field_c ^ -1L)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
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
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((sk) this).field_a.a(((sk) this).field_c, true);
                        ((sk) this).field_b = ((sk) this).field_c;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((sk) this).field_a.a(((sk) this).field_j, 0, 90, ((sk) this).field_d);
                        ((sk) this).field_b = ((sk) this).field_b + (long)((sk) this).field_d;
                        if ((((sk) this).field_b ^ -1L) >= (((sk) this).field_e ^ -1L)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((sk) this).field_e = ((sk) this).field_b;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_long = -1L;
                        var4 = -1L;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((sk) this).field_c < ((sk) this).field_g) {
                            statePc = 18;
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
                        stackOut_14_0 = this;
                        stackIn_15_0 = stackOut_14_0;
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
                        if (((long)((sk) this).field_i + ((sk) this).field_g ^ -1L) < (((sk) this).field_c ^ -1L)) {
                            statePc = 28;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (((sk) this).field_c > ((sk) this).field_g) {
                            statePc = 29;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = this;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((((sk) this).field_g ^ -1L) > (((sk) this).field_c - -(long)((sk) this).field_d ^ -1L)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var2_long = ((sk) this).field_g;
                        if (var7 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var2_long = ((sk) this).field_c;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((((sk) this).field_g ^ -1L) <= (((sk) this).field_c + (long)((sk) this).field_d ^ -1L)) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((sk) this).field_g - -(long)((sk) this).field_i < (long)((sk) this).field_d + ((sk) this).field_c) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var4 = (long)((sk) this).field_d + ((sk) this).field_c;
                        stackOut_33_0 = var7;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (((long)((sk) this).field_i + ((sk) this).field_g ^ -1L) >= (((sk) this).field_c ^ -1L)) {
                            statePc = 42;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((((sk) this).field_c + (long)((sk) this).field_d ^ -1L) > ((long)((sk) this).field_i + ((sk) this).field_g ^ -1L)) {
                            statePc = 42;
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
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var4 = ((sk) this).field_g - -(long)((sk) this).field_i;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var2_long ^ -1L) >= 0L) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var4 <= var2_long) {
                            statePc = 47;
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
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var6 = (int)(var4 + -var2_long);
                        sf.a(((sk) this).field_j, (int)(-((sk) this).field_c + var2_long), ((sk) this).field_h, (int)(-((sk) this).field_g + var2_long), var6);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((sk) this).field_d = 0;
                        ((sk) this).field_c = -1L;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (param0 > 60) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((sk) this).field_e = 28L;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "sk.H(" + param0 + 41);
                }
                case 54: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) throws IOException {
        RuntimeException var2 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        this.b((byte) 91);
                        ((sk) this).field_a.a((byte) -5);
                        if (param0 == 27034) {
                            statePc = 6;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof RuntimeException ? 5 : 3);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof RuntimeException ? 5 : 3);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "sk.A(" + param0 + 41);
                }
                case 6: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long a(byte param0) {
        RuntimeException var2 = null;
        long stackIn_5_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_4_0 = 0L;
        try {
          try {
            L0: {
              if (param0 == 46) {
                break L0;
              } else {
                ((sk) this).field_h = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ((sk) this).field_k;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0L;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_75_0 = 0;
        long stackIn_80_0 = 0L;
        int stackIn_92_0 = 0;
        long stackIn_102_0 = 0L;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        Object stackOut_6_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_74_0 = 0;
        long stackOut_79_0 = 0L;
        int stackOut_91_0 = 0;
        long stackOut_101_0 = 0L;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param1 + param2 ^ -1) < (param0.length ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new ArrayIndexOutOfBoundsException(-param0.length + param2 + param1);
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-1L == ((sk) this).field_c) {
                            statePc = 18;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof IOException ? 9 : 116);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof IOException ? 9 : 116);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((sk) this).field_f < ((sk) this).field_c) {
                            statePc = 18;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof IOException ? 13 : 116);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof IOException ? 13 : 116);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof IOException ? 13 : 116);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = (stateCaught_10 instanceof IOException ? 13 : 116);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((long)((sk) this).field_d + ((sk) this).field_c >= (long)param1 + ((sk) this).field_f) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof IOException ? 15 : 116);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof IOException ? 15 : 116);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof IOException ? 15 : 116);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof IOException ? 15 : 116);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        sf.a(((sk) this).field_j, (int)(-((sk) this).field_c + ((sk) this).field_f), param0, param2, param1);
                        ((sk) this).field_f = ((sk) this).field_f + (long)param1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        var5_long = ((sk) this).field_f;
                        var7 = param2;
                        var8 = param1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param3 == 9868) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        boolean discarded$1 = sk.a(-115);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((sk) this).field_f ^ -1L) > (((sk) this).field_g ^ -1L)) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((long)((sk) this).field_i + ((sk) this).field_g ^ -1L) >= (((sk) this).field_f ^ -1L)) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9_int = (int)((long)((sk) this).field_i - ((sk) this).field_f - -((sk) this).field_g);
                        if ((param1 ^ -1) <= (var9_int ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9_int = param1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        sf.a(((sk) this).field_h, (int)(-((sk) this).field_g + ((sk) this).field_f), param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        ((sk) this).field_f = ((sk) this).field_f + (long)var9_int;
                        param2 = param2 + var9_int;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((sk) this).field_h.length >= param1) {
                            statePc = 44;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((sk) this).field_a.a(((sk) this).field_f, true);
                        ((sk) this).field_b = ((sk) this).field_f;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-1 <= (param1 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9_int = ((sk) this).field_a.a(param1, param0, param2, false);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = -1;
                        stackOut_36_1 = var9_int;
                        stackIn_58_0 = stackOut_36_0;
                        stackIn_58_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (var14 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 != stackIn_37_1) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var14 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = (stateCaught_41 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ((sk) this).field_f = ((sk) this).field_f + (long)var9_int;
                        ((sk) this).field_b = ((sk) this).field_b + (long)var9_int;
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        if (var14 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 51;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.a(true);
                        var9_int = param1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = (stateCaught_45 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((sk) this).field_i < var9_int) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = (stateCaught_46 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = (stateCaught_47 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var9_int = ((sk) this).field_i;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = (stateCaught_49 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        sf.a(((sk) this).field_h, 0, param0, param2, var9_int);
                        param1 = param1 - var9_int;
                        param2 = param2 + var9_int;
                        ((sk) this).field_f = ((sk) this).field_f + (long)var9_int;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = (stateCaught_50 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (-1L != ((sk) this).field_c) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = (stateCaught_51 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((((sk) this).field_c ^ -1L) >= (((sk) this).field_f ^ -1L)) {
                            statePc = 69;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = -1;
                        stackOut_55_1 = param1 ^ -1;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = stackIn_56_0;
                        stackOut_56_1 = stackIn_56_1;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = (stateCaught_56 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 <= stackIn_58_1) {
                            statePc = 69;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = (stateCaught_58 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var9_int = param2 + (int)(-((sk) this).field_f + ((sk) this).field_c);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = (stateCaught_59 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (param2 + param1 < var9_int) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = (stateCaught_60 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = (stateCaught_61 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var9_int = param2 + param1;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var9_int ^ -1) >= (param2 ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = (stateCaught_64 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        param1--;
                        param2++;
                        param0[param2] = (byte) 0;
                        ((sk) this).field_f = ((sk) this).field_f + 1L;
                        if (var14 != 0) {
                            statePc = 109;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = (stateCaught_65 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var14 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = (stateCaught_67 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var9 = -1L;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = (stateCaught_69 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((((sk) this).field_c ^ -1L) > (var5_long ^ -1L)) {
                            statePc = 76;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = (stateCaught_70 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((((sk) this).field_c ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var9 = ((sk) this).field_c;
                        stackOut_74_0 = var14;
                        stackIn_75_0 = stackOut_74_0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = (stateCaught_74 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (stackIn_75_0 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((((sk) this).field_c ^ -1L) < (var5_long ^ -1L)) {
                            statePc = 86;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = var5_long;
                        stackIn_80_0 = stackOut_79_0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = (stateCaught_79 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (stackIn_80_0 < ((sk) this).field_c - -(long)((sk) this).field_d) {
                            statePc = 85;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = (stateCaught_80 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = (stateCaught_81 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = (stateCaught_83 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var9 = var5_long;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = (stateCaught_85 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var11 = -1L;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = (stateCaught_86 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if ((var5_long ^ -1L) <= ((long)((sk) this).field_d + ((sk) this).field_c ^ -1L)) {
                            statePc = 93;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = (stateCaught_87 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if ((long)var8 + var5_long < (long)((sk) this).field_d + ((sk) this).field_c) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = (stateCaught_88 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = (stateCaught_89 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var11 = ((sk) this).field_c + (long)((sk) this).field_d;
                        stackOut_91_0 = var14;
                        stackIn_92_0 = stackOut_91_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = (stateCaught_91 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = (stateCaught_92 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (((sk) this).field_c >= var5_long - -(long)var8) {
                            statePc = 100;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = (stateCaught_93 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = (stateCaught_94 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if ((var5_long + (long)var8 ^ -1L) < (((sk) this).field_c - -(long)((sk) this).field_d ^ -1L)) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = (stateCaught_96 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = (stateCaught_97 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var11 = (long)var8 + var5_long;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = (stateCaught_99 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var9 <= -1L) {
                            statePc = 109;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = (stateCaught_100 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackOut_101_0 = var9;
                        stackIn_102_0 = stackOut_101_0;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = (stateCaught_101 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (stackIn_102_0 < var11) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = (stateCaught_102 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = (stateCaught_103 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = (stateCaught_105 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var13 = (int)(-var9 + var11);
                        sf.a(((sk) this).field_j, (int)(var9 - ((sk) this).field_c), param0, var7 + (int)(-var5_long + var9), var13);
                        if (var11 <= ((sk) this).field_f) {
                            statePc = 109;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = (stateCaught_107 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        param1 = (int)((long)param1 - (var11 - ((sk) this).field_f));
                        ((sk) this).field_f = var11;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = (stateCaught_108 instanceof IOException ? 110 : 116);
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var5 = (IOException) (Object) caughtException;
                        ((sk) this).field_b = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (param1 > 0) {
                            statePc = 114;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = (stateCaught_111 instanceof IOException ? 113 : 116);
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = (stateCaught_112 instanceof IOException ? 113 : 116);
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw new EOFException();
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 116: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    try {
                        stackOut_117_0 = (RuntimeException) var5_ref;
                        stackOut_117_1 = new StringBuilder().append("sk.B(");
                        stackIn_120_0 = stackOut_117_0;
                        stackIn_120_1 = stackOut_117_1;
                        stackIn_118_0 = stackOut_117_0;
                        stackIn_118_1 = stackOut_117_1;
                        if (param0 == null) {
                            statePc = 120;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
                        stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
                        stackOut_118_2 = "{...}";
                        stackIn_121_0 = stackOut_118_0;
                        stackIn_121_1 = stackOut_118_1;
                        stackIn_121_2 = stackOut_118_2;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 120: {
                    stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
                    stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
                    stackOut_120_2 = "null";
                    stackIn_121_0 = stackOut_120_0;
                    stackIn_121_1 = stackOut_120_1;
                    stackIn_121_2 = stackOut_120_2;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    throw t.a((Throwable) (Object) stackIn_121_0, stackIn_121_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 122: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        pa stackIn_29_0 = null;
        long stackIn_29_1 = 0L;
        pa stackIn_31_0 = null;
        long stackIn_31_1 = 0L;
        pa stackIn_33_0 = null;
        long stackIn_33_1 = 0L;
        pa stackIn_34_0 = null;
        long stackIn_34_1 = 0L;
        int stackIn_34_2 = 0;
        Object stackIn_42_0 = null;
        int stackIn_58_0 = 0;
        long stackIn_68_0 = 0L;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        Object stackOut_6_0 = null;
        Object stackOut_10_0 = null;
        pa stackOut_28_0 = null;
        long stackOut_28_1 = 0L;
        pa stackOut_29_0 = null;
        long stackOut_29_1 = 0L;
        pa stackOut_31_0 = null;
        long stackOut_31_1 = 0L;
        int stackOut_31_2 = 0;
        pa stackOut_33_0 = null;
        long stackOut_33_1 = 0L;
        int stackOut_33_2 = 0;
        Object stackOut_41_0 = null;
        int stackOut_57_0 = 0;
        long stackOut_67_0 = 0L;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((((sk) this).field_k ^ -1L) <= ((long)param0 + ((sk) this).field_f ^ -1L)) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((sk) this).field_k = (long)param0 + ((sk) this).field_f;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-1L == ((sk) this).field_c) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof IOException ? 9 : 91);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof IOException ? 9 : 91);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((((sk) this).field_c ^ -1L) < (((sk) this).field_f ^ -1L)) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof IOException ? 13 : 91);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof IOException ? 13 : 91);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof IOException ? 13 : 91);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = (stateCaught_10 instanceof IOException ? 13 : 91);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((((sk) this).field_f ^ -1L) >= (((sk) this).field_c - -(long)((sk) this).field_d ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof IOException ? 16 : 91);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof IOException ? 16 : 91);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof IOException ? 16 : 91);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.b((byte) 99);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof IOException ? 16 : 91);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-1L == ((sk) this).field_c) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof IOException ? 20 : 91);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((long)param0 + ((sk) this).field_f <= (long)((sk) this).field_j.length + ((sk) this).field_c) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof IOException ? 20 : 91);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5_int = (int)((long)((sk) this).field_j.length + ((sk) this).field_c + -((sk) this).field_f);
                        sf.a(param2, param1, ((sk) this).field_j, (int)(-((sk) this).field_c + ((sk) this).field_f), var5_int);
                        ((sk) this).field_f = ((sk) this).field_f + (long)var5_int;
                        param1 = param1 + var5_int;
                        param0 = param0 - var5_int;
                        ((sk) this).field_d = ((sk) this).field_j.length;
                        this.b((byte) 127);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!param3) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        if (param0 > ((sk) this).field_j.length) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((sk) this).field_f == ((sk) this).field_b) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = ((sk) this).field_a;
                        stackOut_28_1 = ((sk) this).field_f;
                        stackIn_33_0 = stackOut_28_0;
                        stackIn_33_1 = stackOut_28_1;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        if (param3) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = (pa) (Object) stackIn_29_0;
                        stackOut_29_1 = stackIn_29_1;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = (pa) (Object) stackIn_31_0;
                        stackOut_31_1 = stackIn_31_1;
                        stackOut_31_2 = 1;
                        stackIn_34_0 = stackOut_31_0;
                        stackIn_34_1 = stackOut_31_1;
                        stackIn_34_2 = stackOut_31_2;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = (pa) (Object) stackIn_33_0;
                        stackOut_33_1 = stackIn_33_1;
                        stackOut_33_2 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        stackIn_34_2 = stackOut_33_2;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((pa) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2 != 0);
                        ((sk) this).field_b = ((sk) this).field_f;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((sk) this).field_a.a(param2, param1, 90, param0);
                        ((sk) this).field_b = ((sk) this).field_b + (long)param0;
                        if ((((sk) this).field_b ^ -1L) < (((sk) this).field_e ^ -1L)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((sk) this).field_e = ((sk) this).field_b;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var5_long = -1L;
                        var7 = -1L;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((((sk) this).field_g ^ -1L) < (((sk) this).field_f ^ -1L)) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = this;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = (stateCaught_41 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((((sk) this).field_f ^ -1L) > (((sk) this).field_g - -(long)((sk) this).field_i ^ -1L)) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((((sk) this).field_g ^ -1L) > (((sk) this).field_f ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = (stateCaught_45 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = (stateCaught_46 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((((sk) this).field_g ^ -1L) <= (((sk) this).field_f - -(long)param0 ^ -1L)) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = (stateCaught_48 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = (stateCaught_49 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var5_long = ((sk) this).field_g;
                        if (var10 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = (stateCaught_51 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var5_long = ((sk) this).field_f;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((((sk) this).field_g ^ -1L) <= ((long)param0 + ((sk) this).field_f ^ -1L)) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = (stateCaught_53 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (((long)((sk) this).field_i + ((sk) this).field_g ^ -1L) > (((sk) this).field_f + (long)param0 ^ -1L)) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var7 = ((sk) this).field_f - -(long)param0;
                        stackOut_57_0 = var10;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = (stateCaught_57 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = (stateCaught_58 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (((sk) this).field_f >= ((sk) this).field_g - -(long)((sk) this).field_i) {
                            statePc = 66;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = (stateCaught_59 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = (stateCaught_60 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((((sk) this).field_g + (long)((sk) this).field_i ^ -1L) < (((sk) this).field_f - -(long)param0 ^ -1L)) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var7 = (long)((sk) this).field_i + ((sk) this).field_g;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = (stateCaught_65 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (0L <= (var5_long ^ -1L)) {
                            statePc = 74;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = var5_long;
                        stackIn_68_0 = stackOut_67_0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = (stateCaught_67 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((stackIn_68_0 ^ -1L) > (var7 ^ -1L)) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = (stateCaught_68 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = (stateCaught_69 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var9 = (int)(-var5_long + var7);
                        sf.a(param2, (int)(var5_long + ((long)param1 + -((sk) this).field_f)), ((sk) this).field_h, (int)(var5_long + -((sk) this).field_g), var9);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        ((sk) this).field_f = ((sk) this).field_f + (long)param0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = (stateCaught_74 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 75: {
                    return;
                }
                case 76: {
                    try {
                        if (param0 <= 0) {
                            statePc = 88;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (((sk) this).field_c != -1L) {
                            statePc = 83;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = (stateCaught_77 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = (stateCaught_78 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ((sk) this).field_c = ((sk) this).field_f;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = (stateCaught_80 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = (stateCaught_81 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        sf.a(param2, param1, ((sk) this).field_j, (int)(-((sk) this).field_c + ((sk) this).field_f), param0);
                        ((sk) this).field_f = ((sk) this).field_f + (long)param0;
                        if (((long)((sk) this).field_d ^ -1L) <= (-((sk) this).field_c + ((sk) this).field_f ^ -1L)) {
                            statePc = 87;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = (stateCaught_83 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        ((sk) this).field_d = (int)(((sk) this).field_f + -((sk) this).field_c);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = (stateCaught_84 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = (stateCaught_85 instanceof IOException ? 89 : 91);
                        continue stateLoop;
                    }
                }
                case 87: {
                    return;
                }
                case 88: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var5 = (IOException) (Object) caughtException;
                        ((sk) this).field_b = -1L;
                        throw var5;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    try {
                        stackOut_92_0 = (RuntimeException) var5_ref;
                        stackOut_92_1 = new StringBuilder().append("sk.C(").append(param0).append(44).append(param1).append(44);
                        stackIn_95_0 = stackOut_92_0;
                        stackIn_95_1 = stackOut_92_1;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        if (param2 == null) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                        stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
                        stackOut_93_2 = "{...}";
                        stackIn_96_0 = stackOut_93_0;
                        stackIn_96_1 = stackOut_93_1;
                        stackIn_96_2 = stackOut_93_2;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 95: {
                    stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
                    stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
                    stackOut_95_2 = "null";
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    stackIn_96_2 = stackOut_95_2;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    throw t.a((Throwable) (Object) stackIn_96_0, stackIn_96_2 + 44 + param3 + 41);
                }
                case 97: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((sk) this).a(param1, param1.length, 0, 9868);
                        var3_int = -83 / ((param0 - -9) / 39);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) runtimeException;
                        stackOut_3_1 = new StringBuilder().append("sk.I(").append(param0).append(44);
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param1 == null) {
                            statePc = 6;
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
                        stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
                        stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
                        stackOut_4_2 = "{...}";
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 6: {
                    stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                    stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                    stackOut_6_2 = "null";
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) throws IOException {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof RuntimeException ? 22 : 3);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        return;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 4: {
                    try {
                        ((sk) this).field_i = 0;
                        if ((((sk) this).field_b ^ -1L) == (((sk) this).field_f ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((sk) this).field_a.a(((sk) this).field_f, true);
                        ((sk) this).field_b = ((sk) this).field_f;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((sk) this).field_g = ((sk) this).field_f;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((sk) this).field_i >= ((sk) this).field_h.length) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = -((sk) this).field_i + ((sk) this).field_h.length;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var2_int ^ -1) >= -200000001) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_int = 200000000;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = ((sk) this).field_a.a(var2_int, ((sk) this).field_h, ((sk) this).field_i, false);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0 == (var3 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((sk) this).field_i = ((sk) this).field_i + var3;
                        ((sk) this).field_b = ((sk) this).field_b + (long)var3;
                        if (var4 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                        if (caughtException instanceof Error) throw (Error) caughtException;
                        throw (IOException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var2, "sk.G(" + param0 + 41);
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, long param1) throws IOException {
        int var4_int = 0;
        RuntimeException var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 < 0L) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_int = -65 / ((-57 - param0) / 37);
                        ((sk) this).field_f = param1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var4, "sk.F(" + param0 + 44 + param1 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        ja var1_ref = null;
        ja var1_ref2 = null;
        float var2 = 0.0f;
        ja var3 = null;
        wd var3_ref = null;
        wd var4 = null;
        int var5 = 0;
        ja var6 = null;
        int var7 = 0;
        ja var8 = null;
        ja var9 = null;
        ja var9_ref = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        ja stackIn_20_0 = null;
        int stackIn_22_0 = 0;
        ja stackIn_25_0 = null;
        ja stackIn_28_0 = null;
        ja stackIn_28_1 = null;
        ja stackIn_38_0 = null;
        ja stackIn_38_1 = null;
        ja stackIn_39_0 = null;
        ja stackIn_39_1 = null;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackOut_6_0 = 0;
        ja stackOut_19_0 = null;
        int stackOut_21_0 = 0;
        ja stackOut_24_0 = null;
        ja stackOut_27_0 = null;
        ja stackOut_27_1 = null;
        ja stackOut_37_0 = null;
        ja stackOut_37_1 = null;
        ja stackOut_38_0 = null;
        ja stackOut_38_1 = null;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -1) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        boolean discarded$1 = sk.a(3);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!el.field_o.field_H) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        bk.field_a.e();
                        if (ld.a(-61)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        el.field_o.d((byte) 116);
                        sh.field_y.a(255);
                        var1_ref = (ja) (Object) a.field_d.a(false);
                        var2 = (-320.0f + var1_ref.field_o) * (-320.0f + var1_ref.field_o) + (var1_ref.field_v - 240.0f) * (var1_ref.field_v - 240.0f);
                        var3 = (ja) (Object) a.field_d.a(false);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == var3) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var2 < (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (-240.0f + var3.field_v) * (-240.0f + var3.field_v)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2 = (-320.0f + var3.field_o) * (var3.field_o - 320.0f) + (var3.field_v - 240.0f) * (-240.0f + var3.field_v);
                        var1_ref2 = var3;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3 = (ja) (Object) a.field_d.b(0);
                        if (var10 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var3_ref = new wd();
                        var4 = new wd();
                        var5 = 0;
                        var3_ref.a((rc) (Object) var1_ref2, false);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (ja) (Object) var3_ref.a(true);
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = stackIn_20_0;
                        if (null == var6) {
                            statePc = 47;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6.field_z = 6;
                        var6.field_r = var5;
                        var5 += 50;
                        var4.a((rc) (Object) var6, false);
                        stackOut_21_0 = 0;
                        stackIn_48_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var10 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var7 ^ -1) <= (var6.field_L ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8 = var6.field_n[var7];
                        stackOut_24_0 = (ja) (Object) var4.c((byte) 121);
                        stackIn_20_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var10 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var9 = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (null == var9) {
                            statePc = 35;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (ja) var9;
                        stackOut_27_1 = (ja) var8;
                        stackIn_38_0 = stackOut_27_0;
                        stackIn_38_1 = stackOut_27_1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        if (var10 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 != stackIn_28_1) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var10 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9_ref = (ja) (Object) var4.a(param0 ^ 24);
                        if (var10 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9_ref = (ja) (Object) var3_ref.c((byte) 121);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (null == var9_ref) {
                            statePc = 44;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = (ja) var9_ref;
                        stackOut_37_1 = (ja) var8;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = (ja) (Object) stackIn_38_0;
                        stackOut_38_1 = (ja) (Object) stackIn_38_1;
                        stackIn_28_0 = stackOut_38_0;
                        stackIn_28_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (var10 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 != stackIn_39_1) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var10 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var9_ref = (ja) (Object) var3_ref.a(69);
                        if (var10 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var3_ref.a(-82, (rc) (Object) var8);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7++;
                        if (var10 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var10 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = 1;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    return stackIn_48_0 != 0;
                }
                case 49: {
                    try {
                        sh.field_y.a(255);
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    return stackIn_50_0 != 0;
                }
                case 51: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw t.a((Throwable) (Object) var1, "sk.D(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    sk(pa param0, int param1, int param2) throws IOException {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        int statePc = 0;
        Object caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((sk) this).field_d = 0;
                    ((sk) this).field_c = -1L;
                    ((sk) this).field_g = -1L;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((sk) this).field_a = param0;
                        ((sk) this).field_e = param0.a(1);
                        ((sk) this).field_k = param0.a(1);
                        ((sk) this).field_j = new byte[param2];
                        ((sk) this).field_h = new byte[param1];
                        ((sk) this).field_f = 0L;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("sk.<init>(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
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
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    if (caughtException instanceof RuntimeException) throw (RuntimeException) caughtException;
                    if (caughtException instanceof Error) throw (Error) caughtException;
                    throw (IOException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
                }
                case 9: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
