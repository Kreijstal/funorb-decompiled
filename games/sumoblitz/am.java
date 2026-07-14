/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends rb {
    private te field_k;
    private sg field_x;
    static hr[] field_j;
    private ti field_q;
    static int[] field_z;
    static vf field_e;
    private int field_y;
    private int field_u;
    private wl field_f;
    private gd field_r;
    private wl field_h;
    private byte[] field_p;
    private byte[] field_w;
    private rw field_i;
    private int field_v;
    private boolean field_l;
    private int field_g;
    private jn field_s;
    private boolean field_o;
    private jn field_n;
    private long field_t;
    private boolean field_m;

    public static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_j = null;
              field_z = null;
              if (param0 <= -78) {
                break L0;
              } else {
                field_z = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_e = null;
        }
    }

    final sg b(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        sg stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_55_0 = null;
        sg stackIn_65_0 = null;
        sg stackOut_2_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_38_0 = null;
        Object stackOut_54_0 = null;
        sg stackOut_64_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == ((am) this).field_x) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = ((am) this).field_x;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (((am) this).field_i == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((am) this).field_r.a(-88)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = null;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return (sg) (Object) stackIn_11_0;
                }
                case 12: {
                    try {
                        ((am) this).field_i = (rw) (Object) ((am) this).field_r.a(255, true, ((am) this).field_u, (byte) -88, (byte) 0);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (((am) this).field_i.field_u) {
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
                        statePc = 18;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = null;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return (sg) (Object) stackIn_17_0;
                }
                case 18: {
                    try {
                        if (param0 < -62) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = null;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return (sg) (Object) stackIn_20_0;
                }
                case 21: {
                    try {
                        var2_array = ((am) this).field_i.d(false);
                        if (!(((am) this).field_i instanceof ql)) {
                            statePc = 40;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (null != var2_array) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((am) this).field_x = new sg(var2_array, ((am) this).field_y, ((am) this).field_w);
                        if ((((am) this).field_x.field_l ^ -1) != (((am) this).field_v ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3 = (RuntimeException) (Object) caughtException;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((am) this).field_x = null;
                        if (!((am) this).field_r.a(122)) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((am) this).field_i = null;
                        if (var4 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((am) this).field_i = (rw) (Object) ((am) this).field_r.a(255, true, ((am) this).field_u, (byte) -81, (byte) 0);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = null;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return (sg) (Object) stackIn_39_0;
                }
                case 40: {
                    try {
                        if (var2_array == null) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((am) this).field_x = new sg(var2_array, ((am) this).field_y, ((am) this).field_w);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var3 = (RuntimeException) (Object) caughtException;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((am) this).field_r.b(14702);
                        ((am) this).field_x = null;
                        if (!((am) this).field_r.a(-6)) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((am) this).field_i = null;
                        if (var4 == 0) {
                            statePc = 54;
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
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((am) this).field_i = (rw) (Object) ((am) this).field_r.a(255, true, ((am) this).field_u, (byte) 90, (byte) 0);
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = null;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 55: {
                    return (sg) (Object) stackIn_55_0;
                }
                case 56: {
                    try {
                        if (((am) this).field_f != null) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        ql discarded$1 = ((am) this).field_q.a(((am) this).field_u, var2_array, 2, ((am) this).field_f);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ((am) this).field_i = null;
                        if (((am) this).field_h == null) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        ((am) this).field_p = new byte[((am) this).field_x.field_d];
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = ((am) this).field_x;
                        stackIn_65_0 = stackOut_64_0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    return stackIn_65_0;
                }
                case 66: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var2, "am.D(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        RuntimeException runtimeException = null;
        ms var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_16_0 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_24_0 = null;
        int stackOut_15_0 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((am) this).field_n != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (param0 <= -18) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((am) this).c((byte) 124);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((am) this).b((byte) -120) == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var2 = ((am) this).field_s.b(-72);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == var2) {
                            statePc = 47;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = (int)var2.field_h;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = var3;
                        stackIn_16_0 = stackOut_15_0;
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
                        if (stackIn_16_0 < 0) {
                            statePc = 29;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = this;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((am) this).field_x.field_d <= var3) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = this;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((am) this).field_x.field_m[var3] == 0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
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
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var2.b(false);
                        if (var4 == 0) {
                            statePc = 44;
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
                        if (((am) this).field_p[var3] != 0) {
                            statePc = 36;
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
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        rw discarded$3 = this.a(var3, 1, 30561);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (-1 == ((am) this).field_p[var3]) {
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
                        statePc = 40;
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
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        rw discarded$4 = this.a(var3, 2, 30561);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (((am) this).field_p[var3] != 1) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var2.b(false);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var2 = ((am) this).field_s.d((byte) 18);
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) runtimeException, "am.F(" + param0 + 41);
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final rw a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        rw var4_ref = null;
        Object var4_ref2 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        rw stackIn_8_0 = null;
        int stackIn_23_0 = 0;
        Object stackIn_30_0 = null;
        int stackIn_33_0 = 0;
        Object stackIn_51_0 = null;
        int stackIn_53_0 = 0;
        Object stackIn_64_0 = null;
        byte[] stackIn_73_0 = null;
        byte stackIn_90_0 = 0;
        byte stackIn_90_1 = 0;
        Object stackIn_107_0 = null;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        fv stackIn_120_0 = null;
        byte[] stackIn_123_0 = null;
        Object stackIn_135_0 = null;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        fv stackIn_165_0 = null;
        Object stackIn_173_0 = null;
        int stackOut_3_0 = 0;
        rw stackOut_7_0 = null;
        int stackOut_22_0 = 0;
        Object stackOut_29_0 = null;
        int stackOut_32_0 = 0;
        Object stackOut_50_0 = null;
        int stackOut_52_0 = 0;
        Object stackOut_63_0 = null;
        byte[] stackOut_72_0 = null;
        byte stackOut_89_0 = 0;
        byte stackOut_89_1 = 0;
        Object stackOut_106_0 = null;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        fv stackOut_119_0 = null;
        byte[] stackOut_122_0 = null;
        Object stackOut_134_0 = null;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_149_0 = 0;
        int stackOut_149_1 = 0;
        fv stackOut_164_0 = null;
        Object stackOut_172_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_ref = (rw) (Object) ((am) this).field_k.a(120, (long)param0);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == var4_ref) {
                            statePc = 15;
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
                        stackOut_3_0 = param1;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
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
                        stackOut_7_0 = (rw) var4_ref;
                        stackIn_8_0 = stackOut_7_0;
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
                        if (stackIn_8_0.field_t) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!var4_ref.field_u) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
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
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_ref.b(false);
                        var4_ref = null;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4_ref != null) {
                            statePc = 62;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((param1 ^ -1) != -1) {
                            statePc = 34;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == ((am) this).field_h) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 != (((am) this).field_p[param0] ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
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
                        if (!((am) this).field_r.a(119)) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = null;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return (rw) (Object) stackIn_30_0;
                }
                case 31: {
                    try {
                        var4_ref2 = ((am) this).field_r.a(((am) this).field_u, true, param0, (byte) -87, (byte) 2);
                        if (var10 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4_ref2 = (fv) (Object) ((am) this).field_q.a(((am) this).field_h, -128, param0);
                        stackOut_32_0 = var10;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (1 == param1) {
                            statePc = 54;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (2 == param1) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((am) this).field_h == null) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (((am) this).field_p[param0] == -1) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!((am) this).field_r.b(true)) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = null;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 51: {
                    return (rw) (Object) stackIn_51_0;
                }
                case 52: {
                    try {
                        var4_ref2 = ((am) this).field_r.a(((am) this).field_u, false, param0, (byte) -126, (byte) 2);
                        stackOut_52_0 = var10;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (null == ((am) this).field_h) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var4_ref2 = (fv) (Object) ((am) this).field_q.a(param0, -82, ((am) this).field_h);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        ((am) this).field_k.a((ms) (Object) var4_ref2, param2 ^ -30562, (long)param0);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!((rw) (Object) var4_ref2).field_u) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = null;
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 64: {
                    return (rw) (Object) stackIn_64_0;
                }
                case 65: {
                    try {
                        var5 = ((rw) (Object) var4_ref2).d(false);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (param2 == 30561) {
                            statePc = 70;
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
                        ((am) this).field_p = null;
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
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var4_ref2 instanceof ql) {
                            statePc = 121;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (null == var5) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = (byte[]) var5;
                        stackIn_73_0 = stackOut_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((stackIn_73_0.length ^ -1) < -3) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        pt.field_c.reset();
                        pt.field_c.update(var5, 0, var5.length - 2);
                        var6_int = (int)pt.field_c.getValue();
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (((am) this).field_x.field_b[param0] != var6_int) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (null == ((am) this).field_x.field_a) {
                            statePc = 96;
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
                        if (((am) this).field_x.field_a[param0] == null) {
                            statePc = 96;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var7_ref_byte__ = ((am) this).field_x.field_a[param0];
                        var8 = gn.a(var5, (byte) -110, 0, -2 + var5.length);
                        var9 = 0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (64 <= var9) {
                            statePc = 96;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = var8[var9];
                        stackOut_89_1 = var7_ref_byte__[var9];
                        stackIn_112_0 = stackOut_89_0;
                        stackIn_112_1 = stackOut_89_1;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        if (var10 != 0) {
                            statePc = 112;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (stackIn_90_0 != stackIn_90_1) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var9++;
                        if (var10 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        ((am) this).field_r.field_d = 0;
                        ((am) this).field_r.field_j = 0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var6 = (RuntimeException) (Object) caughtException;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        ((am) this).field_r.b(14702);
                        ((rw) (Object) var4_ref2).b(false);
                        if (((rw) (Object) var4_ref2).field_t) {
                            statePc = 102;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (!((am) this).field_r.a(param2 + -30435)) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var4_ref2 = ((am) this).field_r.a(((am) this).field_u, true, param0, (byte) -69, (byte) 2);
                        ((am) this).field_k.a((ms) (Object) var4_ref2, -1, (long)param0);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackOut_106_0 = null;
                        stackIn_107_0 = stackOut_106_0;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 107: {
                    return (rw) (Object) stackIn_107_0;
                }
                case 108: {
                    try {
                        var5[var5.length - 2] = (byte)(((am) this).field_x.field_c[param0] >>> 368142120);
                        var5[-1 + var5.length] = (byte)((am) this).field_x.field_c[param0];
                        if (null != ((am) this).field_h) {
                            statePc = 111;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        ql discarded$1 = ((am) this).field_q.a(param0, var5, 2, ((am) this).field_h);
                        stackOut_111_0 = ((am) this).field_p[param0] ^ -1;
                        stackOut_111_1 = -2;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (stackIn_112_0 != stackIn_112_1) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        ((am) this).field_p[param0] = (byte) 1;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (!((rw) (Object) var4_ref2).field_t) {
                            statePc = 118;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        ((rw) (Object) var4_ref2).b(false);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = (fv) var4_ref2;
                        stackIn_120_0 = stackOut_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 120: {
                    return (rw) (Object) stackIn_120_0;
                }
                case 121: {
                    try {
                        if (null == var5) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = (stateCaught_121 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        stackOut_122_0 = (byte[]) var5;
                        stackIn_123_0 = stackOut_122_0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = (stateCaught_122 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (stackIn_123_0.length > 2) {
                            statePc = 128;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = (stateCaught_123 instanceof Exception ? 166 : 127);
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = (stateCaught_124 instanceof Exception ? 166 : 127);
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = (stateCaught_126 instanceof Exception ? 166 : 127);
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = (stateCaught_127 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        pt.field_c.reset();
                        pt.field_c.update(var5, 0, -2 + var5.length);
                        var6_int = (int)pt.field_c.getValue();
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = (stateCaught_128 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if (((am) this).field_x.field_b[param0] != var6_int) {
                            statePc = 132;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = (stateCaught_129 instanceof Exception ? 166 : 131);
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = (stateCaught_130 instanceof Exception ? 166 : 131);
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = (stateCaught_131 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = (stateCaught_132 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (((am) this).field_x.field_a == null) {
                            statePc = 149;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = (stateCaught_133 instanceof Exception ? 166 : 137);
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = this;
                        stackIn_135_0 = stackOut_134_0;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = (stateCaught_134 instanceof Exception ? 166 : 137);
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (((am) this).field_x.field_a[param0] != null) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = (stateCaught_135 instanceof Exception ? 166 : 139);
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = (stateCaught_136 instanceof Exception ? 166 : 139);
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = (stateCaught_137 instanceof Exception ? 166 : 139);
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = (stateCaught_138 instanceof Exception ? 166 : 139);
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = (stateCaught_139 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var7_ref_byte__ = ((am) this).field_x.field_a[param0];
                        var8 = gn.a(var5, (byte) -109, 0, var5.length + -2);
                        var9 = 0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = (stateCaught_140 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (-65 >= (var9 ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = (stateCaught_141 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = var7_ref_byte__[var9] ^ -1;
                        stackOut_142_1 = var8[var9] ^ -1;
                        stackIn_150_0 = stackOut_142_0;
                        stackIn_150_1 = stackOut_142_1;
                        stackIn_143_0 = stackOut_142_0;
                        stackIn_143_1 = stackOut_142_1;
                        if (var10 != 0) {
                            statePc = 150;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = (stateCaught_142 instanceof Exception ? 166 : 145);
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (stackIn_143_0 == stackIn_143_1) {
                            statePc = 148;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = (stateCaught_143 instanceof Exception ? 166 : 145);
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = (stateCaught_144 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = (stateCaught_145 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = (stateCaught_146 instanceof Exception ? 166 : 147);
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = (stateCaught_147 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var9++;
                        if (var10 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = (stateCaught_148 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackOut_149_0 = var5[-1 + var5.length] & 255;
                        stackOut_149_1 = 65280 & var5[-2 + var5.length] << 1213445768;
                        stackIn_150_0 = stackOut_149_0;
                        stackIn_150_1 = stackOut_149_1;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = (stateCaught_149 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        var7 = stackIn_150_0 + stackIn_150_1;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = (stateCaught_150 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (var7 != (65535 & ((am) this).field_x.field_c[param0])) {
                            statePc = 154;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = (stateCaught_151 instanceof Exception ? 166 : 153);
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = (stateCaught_152 instanceof Exception ? 166 : 153);
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = (stateCaught_153 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = (stateCaught_154 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (1 == ((am) this).field_p[param0]) {
                            statePc = 160;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = (stateCaught_155 instanceof Exception ? 166 : 158);
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (-1 == (((am) this).field_p[param0] ^ -1)) {
                            statePc = 159;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = (stateCaught_156 instanceof Exception ? 166 : 158);
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = (stateCaught_157 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = (stateCaught_158 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        ((am) this).field_p[param0] = (byte) 1;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = (stateCaught_159 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (((rw) (Object) var4_ref2).field_t) {
                            statePc = 164;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = (stateCaught_160 instanceof Exception ? 166 : 163);
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        ((rw) (Object) var4_ref2).b(false);
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = (stateCaught_161 instanceof Exception ? 166 : 163);
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = (stateCaught_162 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = (stateCaught_163 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        stackOut_164_0 = (fv) var4_ref2;
                        stackIn_165_0 = stackOut_164_0;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = (stateCaught_164 instanceof Exception ? 166 : 174);
                        continue stateLoop;
                    }
                }
                case 165: {
                    return (rw) (Object) stackIn_165_0;
                }
                case 166: {
                    try {
                        var6_ref = (Exception) (Object) caughtException;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        ((am) this).field_p[param0] = (byte) -1;
                        ((rw) (Object) var4_ref2).b(false);
                        if (((rw) (Object) var4_ref2).field_t) {
                            statePc = 170;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        if (((am) this).field_r.a(param2 + -30551)) {
                            statePc = 172;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        var4_ref2 = ((am) this).field_r.a(((am) this).field_u, true, param0, (byte) 78, (byte) 2);
                        ((am) this).field_k.a((ms) (Object) var4_ref2, -1, (long)param0);
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        stackOut_172_0 = null;
                        stackIn_173_0 = stackOut_172_0;
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 174;
                        continue stateLoop;
                    }
                }
                case 173: {
                    return (rw) (Object) stackIn_173_0;
                }
                case 174: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var4, "am.C(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] a(int param0, boolean param1) {
        rw var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        Object stackOut_4_0 = null;
        byte[] stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = this.a(param0, 0, 30561);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (var3 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
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
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return (byte[]) (Object) stackIn_5_0;
                }
                case 6: {
                    try {
                        var4 = var3.d(param1);
                        var3.b(param1);
                        stackOut_6_0 = (byte[]) var4;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var3_ref, "am.I(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (((am) this).field_h != null) {
            try {
              L0: {
                ((am) this).field_o = true;
                if (((am) this).field_n != null) {
                  break L0;
                } else {
                  ((am) this).field_n = new jn();
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            throw decompiledCaughtException;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var2_int = -71 / ((param0 - -2) / 46);
        }
    }

    final int a(int param0, int param1) {
        rw var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = (rw) (Object) ((am) this).field_k.a(param1 + 120, (long)param0);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (var3 != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = var3.a(-1);
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        if (param1 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((am) this).field_o = true;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var3_ref, "am.B(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        rw var2_ref = null;
        ms var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_111_0 = 0;
        rw stackIn_120_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_110_0 = 0;
        rw stackOut_119_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != ((am) this).field_n) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == ((am) this).b((byte) -102)) {
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
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        if (((am) this).field_l) {
                            statePc = 59;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((am) this).field_o) {
                            statePc = 15;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((am) this).field_n = null;
                        if (var5 == 0) {
                            statePc = 104;
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
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_int = 1;
                        var3 = ((am) this).field_n.b(89);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == var3) {
                            statePc = 30;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4 = (int)var3.field_h;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = -2;
                        stackOut_18_1 = ((am) this).field_p[var4] ^ -1;
                        stackIn_31_0 = stackOut_18_0;
                        stackIn_31_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (var5 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 != stackIn_19_1) {
                            statePc = 23;
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
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        rw discarded$5 = this.a(var4, 2, 30561);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (((am) this).field_p[var4] != 1) {
                            statePc = 28;
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
                        var3.b(false);
                        if (var5 == 0) {
                            statePc = 29;
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
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var2_int = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var3 = ((am) this).field_n.d((byte) 18);
                        if (var5 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = ((am) this).field_x.field_m.length ^ -1;
                        stackOut_30_1 = ((am) this).field_g ^ -1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 >= stackIn_31_1) {
                            statePc = 54;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = ((am) this).field_x.field_m[((am) this).field_g] ^ -1;
                        stackOut_32_1 = -1;
                        stackIn_105_0 = stackOut_32_0;
                        stackIn_105_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (var5 != 0) {
                            statePc = 105;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = stackIn_33_0;
                        stackOut_33_1 = stackIn_33_1;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 == stackIn_35_1) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        ((am) this).field_g = ((am) this).field_g + 1;
                        if (var5 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (((am) this).field_r.b(true)) {
                            statePc = 43;
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
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var2_int = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var5 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-2 != (((am) this).field_p[((am) this).field_g] ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        rw discarded$6 = this.a(((am) this).field_g, 2, 30561);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((((am) this).field_p[((am) this).field_g] ^ -1) == -2) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3 = new ms();
                        var3.field_h = (long)((am) this).field_g;
                        var2_int = 0;
                        ((am) this).field_n.a(var3, (byte) 39);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((am) this).field_g = ((am) this).field_g + 1;
                        if (var5 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var2_int == 0) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((am) this).field_g = 0;
                        ((am) this).field_o = false;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var5 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var2_int = 1;
                        var3 = ((am) this).field_n.b(122);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (null == var3) {
                            statePc = 76;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var4 = (int)var3.field_h;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = -1;
                        stackOut_62_1 = ((am) this).field_p[var4] ^ -1;
                        stackIn_77_0 = stackOut_62_0;
                        stackIn_77_1 = stackOut_62_1;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        if (var5 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 != stackIn_63_1) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        rw discarded$7 = this.a(var4, 1, 30561);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (0 != ((am) this).field_p[var4]) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var2_int = 0;
                        stackOut_70_0 = var5;
                        stackIn_71_0 = stackOut_70_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (stackIn_71_0 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var3.b(false);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var3 = ((am) this).field_n.d((byte) 18);
                        if (var5 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = ((am) this).field_g;
                        stackOut_76_1 = ((am) this).field_x.field_m.length;
                        stackIn_77_0 = stackOut_76_0;
                        stackIn_77_1 = stackOut_76_1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (stackIn_77_0 >= stackIn_77_1) {
                            statePc = 100;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackOut_78_0 = -1;
                        stackOut_78_1 = ((am) this).field_x.field_m[((am) this).field_g] ^ -1;
                        stackIn_105_0 = stackOut_78_0;
                        stackIn_105_1 = stackOut_78_1;
                        stackIn_79_0 = stackOut_78_0;
                        stackIn_79_1 = stackOut_78_1;
                        if (var5 != 0) {
                            statePc = 105;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = stackIn_79_0;
                        stackOut_79_1 = stackIn_79_1;
                        stackIn_81_0 = stackOut_79_0;
                        stackIn_81_1 = stackOut_79_1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (stackIn_81_0 == stackIn_81_1) {
                            statePc = 85;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ((am) this).field_g = ((am) this).field_g + 1;
                        if (var5 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (250 <= ((am) this).field_q.field_e) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var2_int = 0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var5 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (((am) this).field_p[((am) this).field_g] != 0) {
                            statePc = 97;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        rw discarded$8 = this.a(((am) this).field_g, 1, 30561);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (0 != ((am) this).field_p[((am) this).field_g]) {
                            statePc = 99;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var3 = new ms();
                        var3.field_h = (long)((am) this).field_g;
                        ((am) this).field_n.a(var3, (byte) 39);
                        var2_int = 0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        ((am) this).field_g = ((am) this).field_g + 1;
                        if (var5 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var2_int == 0) {
                            statePc = 104;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        ((am) this).field_g = 0;
                        ((am) this).field_l = false;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackOut_104_0 = param0;
                        stackOut_104_1 = -29;
                        stackIn_105_0 = stackOut_104_0;
                        stackIn_105_1 = stackOut_104_1;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (stackIn_105_0 <= stackIn_105_1) {
                            statePc = 109;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        int discarded$9 = ((am) this).a(30, -8);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (!((am) this).field_m) {
                            statePc = 139;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = -91;
                        stackIn_111_0 = stackOut_110_0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if ((wq.a(stackIn_111_0) ^ -1L) <= (((am) this).field_t ^ -1L)) {
                            statePc = 116;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var2_ref = (rw) (Object) ((am) this).field_k.a(84);
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (null == var2_ref) {
                            statePc = 136;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (var5 != 0) {
                            statePc = 139;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = (rw) var2_ref;
                        stackIn_120_0 = stackOut_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (stackIn_120_0.field_u) {
                            statePc = 135;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (!var2_ref.field_s) {
                            statePc = 132;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var2_ref.field_t) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var2_ref.b(false);
                        if (var5 == 0) {
                            statePc = 135;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var2_ref.field_s = true;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var2_ref = (rw) (Object) ((am) this).field_k.a(true);
                        if (var5 == 0) {
                            statePc = 117;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        ((am) this).field_t = 1000L + wq.a(-42);
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 138: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var2, "am.E(" + param0 + 41);
                }
                case 139: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3_int = -87 % ((-27 - param2) / 41);
                        stackOut_0_0 = rd.a(param1, 0, param0, 1001);
                        stackIn_1_0 = stackOut_0_0;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return stackIn_1_0;
                }
                case 2: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) var3;
                        stackOut_3_1 = new StringBuilder().append("am.A(").append(param0).append(44);
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
                    throw (RuntimeException) (Object) caughtException;
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
                    throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    am(int param0, wl param1, wl param2, gd param3, ti param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((am) this).field_k = new te(16);
                    ((am) this).field_g = 0;
                    ((am) this).field_s = new jn();
                    ((am) this).field_t = 0L;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((am) this).field_h = param1;
                        ((am) this).field_u = param0;
                        if (((am) this).field_h != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((am) this).field_l = false;
                        if (!Sumoblitz.field_L) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((am) this).field_l = true;
                        ((am) this).field_n = new jn();
                        statePc = 4;
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
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((am) this).field_m = param8;
                        ((am) this).field_y = param5;
                        ((am) this).field_v = param7;
                        ((am) this).field_r = param3;
                        ((am) this).field_w = param6;
                        ((am) this).field_q = param4;
                        ((am) this).field_f = param2;
                        if (((am) this).field_f == null) {
                            statePc = 33;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((am) this).field_i = (rw) (Object) ((am) this).field_q.a(((am) this).field_f, 91, ((am) this).field_u);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) var10;
                        stackOut_12_1 = new StringBuilder().append("am.<init>(").append(param0).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param1 == null) {
                            statePc = 15;
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
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param2 == null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param3 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                    stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                    stackOut_23_2 = "null";
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (param4 == null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                        stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                        stackOut_25_2 = "{...}";
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                    stackOut_27_2 = "null";
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    try {
                        stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                        stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44).append(param5).append(44);
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        if (param6 == null) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                        stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                        stackOut_29_2 = "{...}";
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_32_2 = stackOut_29_2;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 31: {
                    stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                    stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                    stackOut_31_2 = "null";
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw qo.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param7 + 44 + param8 + 41);
                }
                case 33: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_e = new vf();
    }
}
