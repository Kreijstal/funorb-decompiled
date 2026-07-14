/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class stellarshard extends rb implements cf {
    private int field_M;
    private int field_O;
    private pi field_H;
    private int[] field_P;
    static int field_T;
    private int[] field_N;
    private int field_R;
    private int field_J;
    static th field_E;
    private pb field_F;
    private int[] field_S;
    static int[] field_U;
    private pb field_G;
    private int field_I;
    private int field_Q;
    static String[] field_L;
    static boolean field_K;
    public static int field_B;

    public static void r(int param0) {
        field_U = null;
        if (param0 != 50) {
            return;
        }
        try {
            field_L = null;
            field_E = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "stellarshard.DB(" + param0 + 41);
        }
    }

    public final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 == 16711680) {
                break L0;
              } else {
                this.p(2);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = 16711680;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    public final int[] a(boolean param0, int param1, float param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        int[] stackOut_3_0 = null;
        try {
          if (param0) {
            return (int[]) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = mf.field_a[param1].field_z;
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    public final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param1 == 7152) {
                break L0;
              } else {
                ((stellarshard) this).field_H = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
        }
        return false;
    }

    private final void k(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_2_0 = 0;
        oj stackIn_6_0 = null;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        oj stackIn_32_0 = null;
        int stackOut_1_0 = 0;
        oj stackOut_5_0 = null;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        oj stackOut_31_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (0 != te.field_c) {
                            statePc = 12;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 44;
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
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (stackIn_2_0 != tl.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = tf.field_a;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((oj) (Object) stackIn_6_0).a(0)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        oa.field_D = true;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (ah.a(-1)) {
                            statePc = 24;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((stellarshard) this).c(127, te.field_c);
                        oc.field_d = false;
                        cl.field_a = cl.field_a + te.field_c;
                        if ((tl.field_a ^ -1) >= -1) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        oc.field_d = true;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (mk.field_k <= 0) {
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
                        stackOut_20_0 = 1;
                        stackIn_23_0 = stackOut_20_0;
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
                        statePc = 44;
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
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        oa.field_D = stackIn_23_0 != 0;
                        te.field_c = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        na.field_j = new ij((stellarshard) this);
                        if (te.field_c > 0) {
                            statePc = 35;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 < tl.field_a) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = tf.field_a;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (((oj) (Object) stackIn_32_0).a(0)) {
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
                        tl.field_c = 5;
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
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        s.field_i = false;
                        ll.a(16);
                        nc.field_H = 0;
                        var2_int = -73 % ((param0 - 31) / 34);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (fe.field_e) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 45;
                        continue stateLoop;
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
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ll.field_c.a(sb.field_e[19], 100, pk.field_h * 2);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.BB(" + param0 + 41);
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void q(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (pk.a(-12663, 0)) {
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (0.004 <= Math.random()) {
                            statePc = 9;
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
                        var2_int = (int)(9.0 * Math.random()) + 42;
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
                        if (fe.field_e) {
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
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ll.field_c.a(sb.field_e[var2_int], 50 + (int)(Math.random() * 50.0), 2 * pk.field_h);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 == 50) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_E = null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.VA(" + param0 + 41);
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param1 >= 65) {
                break L0;
              } else {
                this.a(false, (byte) 48);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = 1;
          stackIn_5_0 = stackOut_4_0;
        }
        return false;
    }

    private final void p(int param0) {
        RuntimeException var2 = null;
        double var2_double = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        double var28_double = 0.0;
        int var28 = 0;
        int var29 = 0;
        double var30_double = 0.0;
        int var30 = 0;
        int var31 = 0;
        double var32_double = 0.0;
        int var32 = 0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var42 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cc.a();
                        ((stellarshard) this).field_H.a(sk.field_a, 8);
                        var2_double = sk.field_a[3];
                        var4 = sk.field_a[4];
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 > 15) {
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
                        field_T = -66;
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
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = sk.field_a[5];
                        var8 = sk.field_a[6];
                        var10 = sk.field_a[7];
                        var12 = sk.field_a[8];
                        var14 = sk.field_a[9];
                        var16 = sk.field_a[10];
                        var18 = sk.field_a[11];
                        var20 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-7 >= (var20 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var21 = ag.field_b[var20];
                        var22 = og.field_d[var20];
                        var23 = wd.field_e[var20];
                        var24 = th.field_a[var20];
                        var25 = el.field_F[var20];
                        var26 = lg.field_a[var20];
                        var27 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-26 >= (var27 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var28_double = nj.field_l[var27] * (double)((stellarshard) this).field_P[var25] + ((double)((stellarshard) this).field_P[var24] * nj.field_e[var27] + (double)((stellarshard) this).field_P[var23] * nj.field_b[var27]) + (double)((stellarshard) this).field_P[var26] * nj.field_h[var27];
                        var30_double = nj.field_h[var27] * (double)((stellarshard) this).field_N[var26] + (nj.field_b[var27] * (double)((stellarshard) this).field_N[var23] + (double)((stellarshard) this).field_N[var24] * nj.field_e[var27] + nj.field_l[var27] * (double)((stellarshard) this).field_N[var25]);
                        var32_double = nj.field_l[var27] * (double)((stellarshard) this).field_S[var25] + (nj.field_e[var27] * (double)((stellarshard) this).field_S[var24] + nj.field_b[var27] * (double)((stellarshard) this).field_S[var23]) + nj.field_h[var27] * (double)((stellarshard) this).field_S[var26];
                        var34 = 384.0 / Math.sqrt(var32_double * var32_double + (var28_double * var28_double + var30_double * var30_double));
                        var36 = var34 * var28_double;
                        var38 = var34 * var30_double;
                        var40 = var32_double * var34;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        uf.field_c[var27] = (int)(var40 * var14 + (var38 * (var8 * 1.0 + -var2_double * 0.0) + (var8 * 0.0 + 1.0 * var2_double) * var36));
                        fd.field_qb[var27] = (int)((var10 * 0.0 + var4 * 1.0) * var36 + (0.0 * -var4 + var10 * 1.0) * var38 + var40 * var16);
                        uc.field_a[var27] = (int)((var38 * (1.0 * var12 + -var6 * 0.0) + var36 * (var6 * 1.0 + 0.0 * var12) + var18 * var40) * 0.8);
                        var27++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var27 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var27 ^ -1) <= -5) {
                            statePc = 36;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var28 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var28 ^ -1) <= -5) {
                            statePc = 35;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var29 = 4 * var28 + var27;
                        if (-3 == (var20 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = 4;
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
                        if (stackIn_20_0 == var20) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var29 += 16;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var20 == 0) {
                            statePc = 29;
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
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var29 += 32;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (-2 == (var20 ^ -1)) {
                            statePc = 33;
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var29 += 48;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var30 = 5 * var28 + var27;
                        var31 = var28 * 5 + (var27 - -1);
                        var32 = 1 + var27 + 5 * (1 + var28);
                        qa.a(uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, var21, var22, var26, var23, var24);
                        qa.a(0, 2, var29, uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, 128, 128, 128);
                        var30 = var27 - -(5 * var28);
                        var32 = (1 + var28) * 5 + var27;
                        var31 = (1 + var28) * 5 + (var27 + 1);
                        qa.a(uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, var21, var22, var25, var23, var26);
                        qa.a(0, 2, var29, uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, 128, 128, 128);
                        var28++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var27++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var20++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.IB(" + param0 + 41);
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        kl var2_ref = null;
        int var3 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        va stackIn_13_0 = null;
        Object stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        va stackOut_12_0 = null;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 21) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        ac.field_h.a();
                        ka.field_m.a();
                        stackOut_3_0 = this;
                        stackOut_3_1 = 119;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (s.field_e != null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackOut_4_1 = stackIn_4_1;
                        stackOut_4_2 = 0;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((stellarshard) this).b(stackIn_7_1, stackIn_7_2 != 0);
                        if (qd.field_h) {
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
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.o(122);
                        qd.field_h = false;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (s.field_e == null) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = s.field_e;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!stackIn_13_0.field_c) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ke.a(4);
                        nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                        s.field_e.a(ic.field_d, -57);
                        qd.field_j.requestFocus();
                        s.field_e = null;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!ee.b(122)) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((stellarshard) this).k(-11);
                        if (!vj.a(25424)) {
                            statePc = 147;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.a(false, (byte) -81);
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
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
                        if (fd.field_mb) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (fd.d((byte) -21)) {
                            statePc = 34;
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
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((stellarshard) this).l((byte) -124);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        fd.field_mb = false;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!hf.field_f) {
                            statePc = 129;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (be.field_g == null) {
                            statePc = 59;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (be.field_g.field_n) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 132;
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
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        tl.field_a = tl.field_a & (be.field_g.field_m[0] ^ -1);
                        sd.field_d = sd.field_d | be.field_g.field_m[0];
                        be.field_g = null;
                        if (na.field_j == null) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((tl.field_a ^ -1) == -1) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        oc.field_d = false;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        hi.b((byte) 109);
                        var2_ref = (kl) (Object) ue.field_c.b(-91);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var2_ref == null) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        tc.a(var2_ref, 4, false);
                        var2_ref = (kl) (Object) ue.field_c.b((byte) -128);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (null == gg.field_f) {
                            statePc = 72;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (gg.field_f.field_m) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (of.field_A < gg.field_f.field_s[0]) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        of.field_A = gg.field_f.field_s[0];
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        gg.field_f = null;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (fd.d((byte) -21)) {
                            statePc = 112;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (!wk.a(113)) {
                            statePc = 109;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackOut_78_0 = this;
                        stackOut_78_1 = 0;
                        stackIn_83_0 = stackOut_78_0;
                        stackIn_83_1 = stackOut_78_1;
                        stackIn_79_0 = stackOut_78_0;
                        stackIn_79_1 = stackOut_78_1;
                        if (null == s.field_e) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = this;
                        stackOut_79_1 = stackIn_79_1;
                        stackIn_81_0 = stackOut_79_0;
                        stackIn_81_1 = stackOut_79_1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackOut_81_0 = this;
                        stackOut_81_1 = stackIn_81_1;
                        stackOut_81_2 = 1;
                        stackIn_84_0 = stackOut_81_0;
                        stackIn_84_1 = stackOut_81_1;
                        stackIn_84_2 = stackOut_81_2;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackOut_83_0 = this;
                        stackOut_83_1 = stackIn_83_1;
                        stackOut_83_2 = 0;
                        stackIn_84_0 = stackOut_83_0;
                        stackIn_84_1 = stackOut_83_1;
                        stackIn_84_2 = stackOut_83_2;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var2_int = oa.a((rb) this, stackIn_84_1, stackIn_84_2 != 0);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (-2 != (var2_int ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (null != s.field_e) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                        s.field_e.a(ic.field_d, -71);
                        s.field_e = null;
                        qd.field_j.requestFocus();
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (2 == var2_int) {
                            statePc = 101;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (-2364825 == (var2_int ^ -1)) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        cj.b(-5);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (null != s.field_e) {
                            statePc = 106;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                        s.field_e.a(ic.field_d, -15);
                        s.field_e = null;
                        qd.field_j.requestFocus();
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        df.a(false, hf.a((byte) -84));
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        this.d(true);
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var2_int = vd.a((byte) -61);
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var2_int == 2) {
                            statePc = 116;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 120;
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
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (s.field_e != null) {
                            statePc = 119;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                        s.field_e.a(ic.field_d, -15);
                        s.field_e = null;
                        qd.field_j.requestFocus();
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (var2_int == 3) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        ((stellarshard) this).l((byte) -110);
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (4 != var2_int) {
                            statePc = 128;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        wj.h(-128);
                        fd.field_mb = true;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        this.a(true, (byte) -111);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (!fh.a((byte) 73, i.field_e)) {
                            statePc = 139;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        ((stellarshard) this).h(6476);
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        ue.a((byte) 85, 0);
                        if (!il.e(32525)) {
                            statePc = 147;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var2_int = ((stellarshard) this).f(-16028);
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (2 == var2_int) {
                            statePc = 144;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        jj.a(true, 0, 8, 240, 320, 8, 0, (pb[]) null, (pb[]) null, l.field_f.field_N, 0, qj.field_a.field_N, (bd) (Object) qj.field_a, (bd) (Object) l.field_f);
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 146: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.LA(" + param0 + 41);
                }
                case 147: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_9_0 = false;
        int stackIn_13_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_12_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 > 125) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((stellarshard) this).l((byte) -28);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (bi.field_u != null) {
                            statePc = 24;
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
                        if (-1 <= (param1 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = e.field_c;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0) {
                            statePc = 19;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = -1;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (ah.a(stackIn_13_0)) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ue.field_a = param1;
                        bi.field_u = bb.a(5, gg.field_i, cl.field_a, si.field_gb, 3, new int[1], 65530, 0, qb.field_k);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
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
                        ue.field_a = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var3, "stellarshard.AB(" + param0 + 44 + param1 + 41);
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        float var6_float = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((stellarshard) this).a(8, 0, 10, 6, false, 10, (byte) -7, 9);
                        cc.b(0.800000011920929f);
                        cc.a();
                        cc.field_f = false;
                        eh.field_e = new int[256];
                        var2_array = new int[256];
                        var3 = new int[256];
                        var4 = new int[256];
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 >= eh.field_e.length) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        eh.field_e[var5] = 65793 * var5;
                        var2_array[var5] = var5 * 256;
                        var3[var5] = var5 * 1;
                        var4[var5] = 65536 * var5;
                        var5++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((stellarshard) this).field_H = new pi();
                        sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 1.0);
                        ((stellarshard) this).field_H.a(sg.field_a, 19);
                        sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.5);
                        ((stellarshard) this).field_H.a(sg.field_a, 103);
                        ea.field_m = new pb(80, 160);
                        ea.field_m.e();
                        var5 = 0;
                        var6_float = 0.0f;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (20.0f <= var6_float) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = (int)(-((-var6_float + 20.0f) * (-var6_float + 20.0f) / 20.0f) + 40.0f);
                        ti.e(40, (int)(-(var6_float * 2.0f) + 120.0f), var5, (int)(Math.random() * 16.0) * 1052688 | 1);
                        var6_float = (float)((double)var6_float + 0.1);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6_float = 20.0f;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6_float > 40.0f) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = (int)(40.0f - (var6_float - 20.0f) * (var6_float - 20.0f) / 20.0f);
                        ti.e(40, (int)(120.0f - var6_float * 2.0f), var5, 1 | (int)(16.0 * Math.random()) * 1052688);
                        var6_float = (float)((double)var6_float + 0.1);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        pd.field_h.a((byte) -107);
                        ei.field_D = new pb[12];
                        fk.field_k = new int[48];
                        var5 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var5 ^ -1) <= -13) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        fk.field_k[0 + var5 * 4] = (int)(640.0 * Math.random()) << -848692028;
                        fk.field_k[var5 * 4 - -1] = (int)(Math.random() * 480.0) << 1186934916;
                        fk.field_k[2 + var5 * 4] = (int)(33.0 * Math.random() - 16.0);
                        fk.field_k[3 + 4 * var5] = (int)(33.0 * Math.random() - 16.0);
                        ei.field_D[var5] = new pb(256, 256);
                        ei.field_D[var5].e();
                        var6 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var6 >= 4) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = (int)(64.0 * Math.random() + 64.0);
                        var8 = (int)(Math.random() * (double)((128 - var7) * 2) + (double)var7);
                        var9_int = (int)(Math.random() * (double)(2 * (-var7 + 128)) + (double)var7);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ti.a(var8 << 712095268, var9_int << -78655388, var7 << -496645788, -var7 + 128, eh.field_e);
                        var6++;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        lc.field_k = new pb(640, 480);
                        lc.field_k.e();
                        var5 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var5 ^ -1) <= -257) {
                            statePc = 54;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6 = (int)(Math.random() * 112.0 + 16.0);
                        var7 = (int)(640.0 * Math.random() - (double)var6);
                        var8 = (int)(480.0 * Math.random() - (double)var6);
                        var9 = eh.field_e;
                        var10 = (int)(4.0 * Math.random());
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (1 == var10) {
                            statePc = 34;
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
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = var2_array;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var10 ^ -1) != -3) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = var3;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var10 != 3) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = var4;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (4 <= var11) {
                            statePc = 53;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ti.a(var7 << 1540194404, var8 << 1687099620, var6 << -412111996, -var6 + 128, var9);
                        if (0 == var11) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        // wide iinc 7 640
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (1 != var11) {
                            statePc = 48;
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
                        // wide iinc 8 480
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
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-3 == (var11 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        // wide iinc 7 -640
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11++;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var5++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        pd.field_h.a((byte) -107);
                        ba.a(22050, false, 10);
                        ac.field_h = ba.a(ic.field_d, (java.awt.Component) (Object) qd.field_j, 0, 512);
                        ka.field_m = ba.a(ic.field_d, (java.awt.Component) (Object) qd.field_j, 1, 22050);
                        ll.field_c = new hl();
                        nj.field_o = new hl();
                        ac.field_h.a((kd) (Object) ll.field_c);
                        ka.field_m.a((kd) (Object) nj.field_o);
                        fe.field_e = param0;
                        s.field_i = false;
                        wh.field_c = 0;
                        ke.field_a = 16777215;
                        kg.field_D = 255;
                        al.field_c = 0;
                        jg.field_pb = 512;
                        ll.a(16);
                        tc.field_r = 0;
                        qi.field_a = 0;
                        cc.a((cf) this);
                        ((stellarshard) this).a(true, -113, false, false, true);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.GA(" + param0 + 41);
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void m(byte param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        a.field_h[pl.e((byte) 63)] = new qe(-1);
                        ue.field_a = 0;
                        bi.field_u = null;
                        cl.field_a = cl.field_a + te.field_c;
                        s.field_i = true;
                        if (qi.field_a > 10) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        e.field_e = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == 127) {
                            statePc = 8;
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
                        ((stellarshard) this).a(false);
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        vh.field_e = 0;
                        ta.field_p = 0;
                        nc.field_H = 3;
                        te.field_c = 0;
                        sj.field_K = 0;
                        gh.field_b = 250;
                        sf.field_b = 0;
                        ua.field_d = 0;
                        ((stellarshard) this).field_R = 255;
                        mg.field_t = qi.field_a;
                        nc.field_A = 0;
                        tb.field_K = 0;
                        sd.field_b = 0;
                        if (qi.field_a > 20) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
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
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        e.field_e = 2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-31 <= (qi.field_a ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        e.field_e = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        gf.field_c = 0;
                        lh.field_d = lh.field_d - 1;
                        if (-41 <= (qi.field_a ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        e.field_e = 3;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ml.field_h = 0;
                        q.field_a = qi.field_a;
                        ag.field_a = 0;
                        hk.field_p = hk.field_p - ed.field_b;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.HB(" + param0 + 41);
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(boolean param0) {
        int var2_int = 0;
        pi var2 = null;
        pi var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        vl var4_ref = null;
        int var5 = 0;
        double var5_double = 0.0;
        int var6 = 0;
        double var6_double = 0.0;
        qe var6_ref_qe = null;
        int var7 = 0;
        qe var8 = null;
        int var9 = 0;
        qe var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_243_0 = 0;
        int stackIn_244_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_246_1 = 0;
        qe stackIn_273_0 = null;
        double stackIn_273_1 = 0.0;
        double stackIn_273_2 = 0.0;
        qe stackIn_274_0 = null;
        double stackIn_274_1 = 0.0;
        double stackIn_274_2 = 0.0;
        qe stackIn_275_0 = null;
        double stackIn_275_1 = 0.0;
        double stackIn_275_2 = 0.0;
        qe stackIn_276_0 = null;
        double stackIn_276_1 = 0.0;
        double stackIn_276_2 = 0.0;
        double stackIn_276_3 = 0.0;
        qe stackIn_277_0 = null;
        double stackIn_277_1 = 0.0;
        double stackIn_277_2 = 0.0;
        qe stackIn_278_0 = null;
        double stackIn_278_1 = 0.0;
        double stackIn_278_2 = 0.0;
        qe stackIn_279_0 = null;
        double stackIn_279_1 = 0.0;
        double stackIn_279_2 = 0.0;
        double stackIn_279_3 = 0.0;
        vl stackIn_291_0 = null;
        vl stackIn_291_1 = null;
        vl stackIn_292_0 = null;
        vl stackIn_292_1 = null;
        vl stackIn_293_0 = null;
        vl stackIn_293_1 = null;
        vl stackIn_294_0 = null;
        vl stackIn_294_1 = null;
        int stackIn_294_2 = 0;
        vl stackIn_302_0 = null;
        vl stackIn_302_1 = null;
        vl stackIn_303_0 = null;
        vl stackIn_303_1 = null;
        vl stackIn_304_0 = null;
        vl stackIn_304_1 = null;
        vl stackIn_305_0 = null;
        vl stackIn_305_1 = null;
        int stackIn_305_2 = 0;
        gd stackIn_322_0 = null;
        int stackIn_322_1 = 0;
        gd stackIn_323_0 = null;
        int stackIn_323_1 = 0;
        gd stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        gd stackIn_325_0 = null;
        int stackIn_325_1 = 0;
        int stackIn_325_2 = 0;
        gd stackIn_327_0 = null;
        int stackIn_327_1 = 0;
        gd stackIn_328_0 = null;
        int stackIn_328_1 = 0;
        gd stackIn_329_0 = null;
        int stackIn_329_1 = 0;
        gd stackIn_330_0 = null;
        int stackIn_330_1 = 0;
        int stackIn_330_2 = 0;
        int stackIn_338_0 = 0;
        int stackIn_356_0 = 0;
        int stackIn_653_0 = 0;
        int stackIn_654_0 = 0;
        int stackIn_654_1 = 0;
        int stackIn_667_0 = 0;
        qe stackIn_721_0 = null;
        int stackIn_726_0 = 0;
        vl stackIn_778_0 = null;
        Object stackIn_810_0 = null;
        vl stackIn_810_1 = null;
        int stackOut_175_0 = 0;
        int stackOut_175_1 = 0;
        int stackOut_242_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_245_1 = 0;
        int stackOut_243_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_244_1 = 0;
        qe stackOut_272_0 = null;
        double stackOut_272_1 = 0.0;
        double stackOut_272_2 = 0.0;
        qe stackOut_275_0 = null;
        double stackOut_275_1 = 0.0;
        double stackOut_275_2 = 0.0;
        double stackOut_275_3 = 0.0;
        qe stackOut_273_0 = null;
        double stackOut_273_1 = 0.0;
        double stackOut_273_2 = 0.0;
        qe stackOut_274_0 = null;
        double stackOut_274_1 = 0.0;
        double stackOut_274_2 = 0.0;
        double stackOut_274_3 = 0.0;
        qe stackOut_276_0 = null;
        double stackOut_276_1 = 0.0;
        double stackOut_276_2 = 0.0;
        qe stackOut_278_0 = null;
        double stackOut_278_1 = 0.0;
        double stackOut_278_2 = 0.0;
        double stackOut_278_3 = 0.0;
        qe stackOut_277_0 = null;
        double stackOut_277_1 = 0.0;
        double stackOut_277_2 = 0.0;
        double stackOut_277_3 = 0.0;
        vl stackOut_301_0 = null;
        vl stackOut_301_1 = null;
        vl stackOut_304_0 = null;
        vl stackOut_304_1 = null;
        int stackOut_304_2 = 0;
        vl stackOut_302_0 = null;
        vl stackOut_302_1 = null;
        vl stackOut_303_0 = null;
        vl stackOut_303_1 = null;
        int stackOut_303_2 = 0;
        vl stackOut_290_0 = null;
        vl stackOut_290_1 = null;
        vl stackOut_293_0 = null;
        vl stackOut_293_1 = null;
        int stackOut_293_2 = 0;
        vl stackOut_291_0 = null;
        vl stackOut_291_1 = null;
        vl stackOut_292_0 = null;
        vl stackOut_292_1 = null;
        int stackOut_292_2 = 0;
        gd stackOut_326_0 = null;
        int stackOut_326_1 = 0;
        gd stackOut_329_0 = null;
        int stackOut_329_1 = 0;
        int stackOut_329_2 = 0;
        gd stackOut_327_0 = null;
        int stackOut_327_1 = 0;
        gd stackOut_328_0 = null;
        int stackOut_328_1 = 0;
        int stackOut_328_2 = 0;
        gd stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        gd stackOut_324_0 = null;
        int stackOut_324_1 = 0;
        int stackOut_324_2 = 0;
        gd stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        gd stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        int stackOut_323_2 = 0;
        int stackOut_337_0 = 0;
        int stackOut_336_0 = 0;
        int stackOut_355_0 = 0;
        int stackOut_354_0 = 0;
        int stackOut_652_0 = 0;
        int stackOut_653_0 = 0;
        int stackOut_653_1 = 0;
        int stackOut_666_0 = 0;
        int stackOut_665_0 = 0;
        qe stackOut_720_0 = null;
        int stackOut_724_0 = 0;
        int stackOut_725_0 = 0;
        Object stackOut_809_0 = null;
        vl stackOut_809_1 = null;
        vl stackOut_777_0 = null;
        L0: {
          L1: {
            var15 = field_B;
            if (ni.field_e != ((stellarshard) this).field_Q) {
              break L1;
            } else {
              if (eb.field_a != ((stellarshard) this).field_O) {
                break L1;
              } else {
                if (0 == gh.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          ((stellarshard) this).field_Q = ni.field_e;
          v.field_e = true;
          ((stellarshard) this).field_O = eb.field_a;
          ld.field_F = -1;
          break L0;
        }
        L2: {
          if (!si.field_jb[98]) {
            break L2;
          } else {
            ld.field_F = 0;
            v.field_e = false;
            break L2;
          }
        }
        L3: {
          if (!si.field_jb[99]) {
            break L3;
          } else {
            ld.field_F = 1;
            v.field_e = false;
            break L3;
          }
        }
        L4: {
          ki.field_s = ki.field_s + 1;
          if (!si.field_jb[84]) {
            break L4;
          } else {
            v.field_e = false;
            break L4;
          }
        }
        L5: {
          qb.field_k = qb.field_k + 1;
          lg.field_f = lg.field_f - 1;
          hk.field_p = hk.field_p + 1;
          if (10 >= ki.field_s) {
            break L5;
          } else {
            ki.field_s = 0;
            break L5;
          }
        }
        L6: {
          if ((qi.field_a ^ -1) >= -2) {
            break L6;
          } else {
            if ((((stellarshard) this).field_J ^ -1) < -1) {
              ((stellarshard) this).field_J = ((stellarshard) this).field_J - 1;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          cl.field_a = cl.field_a + 1;
          if (0 != gh.field_c) {
            qb.field_k = qb.field_k - gg.field_i;
            si.field_gb = si.field_gb + 1;
            hk.field_p = hk.field_p + lh.field_d;
            ed.field_b = ed.field_b + 1;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (null == hf.field_i.b(-97)) {
            break L8;
          } else {
            ((stellarshard) this).field_I = ((stellarshard) this).field_I + 1;
            if (((stellarshard) this).field_I + 1 != 335) {
              break L8;
            } else {
              ((stellarshard) this).field_I = 0;
              gg discarded$1 = hf.field_i.d((byte) -35);
              break L8;
            }
          }
        }
        L9: {
          if (af.field_o <= 0) {
            break L9;
          } else {
            af.field_o = af.field_o - 1;
            break L9;
          }
        }
        L10: {
          if (0 >= og.field_a) {
            break L10;
          } else {
            og.field_a = og.field_a - 1;
            break L10;
          }
        }
        L11: {
          bf.field_c = bf.field_c + 1;
          if ((bf.field_c ^ -1) >= (qj.field_a.b(sj.field_C) ^ -1)) {
            break L11;
          } else {
            bf.field_c = bf.field_c - qj.field_a.b(sj.field_C) * 2;
            break L11;
          }
        }
        L12: {
          if (0 < ((stellarshard) this).field_R) {
            ((stellarshard) this).field_R = ((stellarshard) this).field_R / 2;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (((stellarshard) this).field_R <= 0) {
            break L13;
          } else {
            ((stellarshard) this).field_R = ((stellarshard) this).field_R - 1;
            break L13;
          }
        }
        L14: {
          if (null == na.field_j) {
            break L14;
          } else {
            L15: {
              if (s.field_i) {
                break L15;
              } else {
                sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001);
                ((stellarshard) this).field_H.a(sg.field_a, -127);
                sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.0005);
                ((stellarshard) this).field_H.a(sg.field_a, -125);
                break L15;
              }
            }
            L16: {
              if (null == gj.field_r) {
                break L16;
              } else {
                if ((og.field_a ^ -1) >= -1) {
                  og.field_a = 25;
                  gj.field_r.b(25, 0);
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if ((tl.field_c ^ -1) == -9) {
                L18: {
                  var2_int = qc.a((byte) -115, true);
                  if (3 != var2_int) {
                    break L18;
                  } else {
                    qd.a(hf.a((byte) -68), (byte) -30);
                    break L18;
                  }
                }
                if (var2_int != 1) {
                  if ((var2_int ^ -1) != -3) {
                    break L17;
                  } else {
                    tl.field_c = 0;
                    na.field_j.field_l = -1;
                    return;
                  }
                } else {
                  na.field_j.field_l = 0;
                  tl.field_c = 0;
                  return;
                }
              } else {
                break L17;
              }
            }
            L19: {
              if ((tl.field_c ^ -1) != -4) {
                break L19;
              } else {
                if (gh.field_c == 1) {
                  if (0 != (na.field_j.field_r ^ -1)) {
                    if (na.field_j.field_u == na.field_j.field_r) {
                      na.field_j.field_u = -1;
                      break L19;
                    } else {
                      na.field_j.field_u = na.field_j.field_r;
                      break L19;
                    }
                  } else {
                    break L19;
                  }
                } else {
                  break L19;
                }
              }
            }
            L20: {
              if (qi.field_a > na.field_j.field_t) {
                na.field_j.field_p = na.field_j.field_p + 1;
                if (10 < na.field_j.field_p) {
                  na.field_j.field_t = na.field_j.field_t + 1;
                  na.field_j.field_p = na.field_j.field_p - 10;
                  break L20;
                } else {
                  break L20;
                }
              } else {
                if (4 == tl.field_c) {
                  L21: {
                    na.field_j.field_p = na.field_j.field_p + 1;
                    if ((na.field_j.field_p ^ -1) >= -51) {
                      break L21;
                    } else {
                      na.field_j.field_p = na.field_j.field_p - 50;
                      na.field_j.field_s = na.field_j.field_s - 1;
                      break L21;
                    }
                  }
                  if (-1 <= (na.field_j.field_s ^ -1)) {
                    L22: {
                      gh.field_d = null;
                      tl.field_c = 2;
                      na.field_j.field_l = 9;
                      if (-1 > (tl.field_a ^ -1)) {
                        tl.field_c = 3;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    n.field_L = 256;
                    break L20;
                  } else {
                    break L20;
                  }
                } else {
                  break L20;
                }
              }
            }
            L23: {
              if (tl.field_c == 0) {
                var2_int = 0;
                L24: while (true) {
                  if (var2_int >= 9) {
                    if (-3 < (ph.field_D ^ -1)) {
                      break L23;
                    } else {
                      L25: {
                        if (si.field_jb[16]) {
                          ((stellarshard) this).field_H.field_b = 1.0;
                          var2 = ((stellarshard) this).field_H;
                          var3_ref = ((stellarshard) this).field_H;
                          ((stellarshard) this).field_H.field_a = 0.0;
                          var2.field_d = 0.0;
                          var3_ref.field_c = 0.0;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        if (si.field_jb[17]) {
                          ((stellarshard) this).field_H.field_b = 0.1513824462890625;
                          ((stellarshard) this).field_H.field_c = -0.939178466796875;
                          ((stellarshard) this).field_H.field_a = -0.258941650390625;
                          ((stellarshard) this).field_H.field_d = -0.949249267578125;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        if (!si.field_jb[18]) {
                          break L27;
                        } else {
                          ((stellarshard) this).field_H.field_c = -0.0067138671875;
                          ((stellarshard) this).field_H.field_a = -0.82244873046875;
                          ((stellarshard) this).field_H.field_b = 0.13287353515625;
                          ((stellarshard) this).field_H.field_d = -0.552978515625;
                          break L27;
                        }
                      }
                      L28: {
                        if (si.field_jb[19]) {
                          ((stellarshard) this).field_H.field_d = -0.846764809241;
                          ((stellarshard) this).field_H.field_b = 0.26812744140625;
                          ((stellarshard) this).field_H.field_a = 0.4404144287109375;
                          ((stellarshard) this).field_H.field_c = 0.130889892578125;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        if (si.field_jb[20]) {
                          ((stellarshard) this).field_H.field_b = 0.7213134765625;
                          ((stellarshard) this).field_H.field_c = 0.5408782958984375;
                          ((stellarshard) this).field_H.field_a = -0.334014892578125;
                          ((stellarshard) this).field_H.field_d = 0.2748870849609375;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      if (si.field_jb[21]) {
                        ((stellarshard) this).field_H.field_d = -0.5489211794018304;
                        ((stellarshard) this).field_H.field_a = -0.49565616706475396;
                        ((stellarshard) this).field_H.field_b = -0.6729829114278874;
                        ((stellarshard) this).field_H.field_c = -0.010222709116862912;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  } else {
                    L30: {
                      if (na.field_j.field_l != var2_int) {
                        nj.field_f[var2_int] = 0 + nj.field_f[var2_int] * 15 >> -684140508;
                        break L30;
                      } else {
                        nj.field_f[var2_int] = nj.field_f[var2_int] * 15 - -64 >> -1454863004;
                        break L30;
                      }
                    }
                    var2_int++;
                    continue L24;
                  }
                }
              } else {
                break L23;
              }
            }
            L31: {
              if (tl.field_c == 4) {
                var2_int = 8;
                L32: while (true) {
                  if (-10 >= (var2_int ^ -1)) {
                    break L31;
                  } else {
                    L33: {
                      if (var2_int == na.field_j.field_l) {
                        nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> -1379369532;
                        break L33;
                      } else {
                        nj.field_f[var2_int] = 0 + 15 * nj.field_f[var2_int] >> -2026623196;
                        break L33;
                      }
                    }
                    var2_int++;
                    continue L32;
                  }
                }
              } else {
                break L31;
              }
            }
            L34: {
              if ((tl.field_c ^ -1) == -2) {
                var2_int = 9;
                L35: while (true) {
                  if (var2_int >= 10) {
                    break L34;
                  } else {
                    L36: {
                      if ((var2_int ^ -1) == (na.field_j.field_l ^ -1)) {
                        nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> -1291897628;
                        break L36;
                      } else {
                        nj.field_f[var2_int] = nj.field_f[var2_int] * 15 - 0 >> 344090308;
                        break L36;
                      }
                    }
                    var2_int++;
                    continue L35;
                  }
                }
              } else {
                break L34;
              }
            }
            L37: {
              if (2 != tl.field_c) {
                break L37;
              } else {
                var2_int = 8;
                var3 = var2_int;
                L38: while (true) {
                  if (10 <= var3) {
                    break L37;
                  } else {
                    L39: {
                      if ((na.field_j.field_l ^ -1) == (var3 ^ -1)) {
                        nj.field_f[var3] = nj.field_f[var3] * 15 - -64 >> -1495521532;
                        break L39;
                      } else {
                        nj.field_f[var3] = 0 + 15 * nj.field_f[var3] >> -1540175100;
                        break L39;
                      }
                    }
                    var3++;
                    continue L38;
                  }
                }
              }
            }
            L40: {
              if ((tl.field_c ^ -1) == -4) {
                L41: {
                  var2_int = 8;
                  if (ah.a(-1)) {
                    break L41;
                  } else {
                    if (oc.field_d) {
                      break L41;
                    } else {
                      var2_int = 9;
                      break L41;
                    }
                  }
                }
                var3 = var2_int;
                L42: while (true) {
                  if (-11 >= (var3 ^ -1)) {
                    break L40;
                  } else {
                    L43: {
                      if (na.field_j.field_l != var3) {
                        nj.field_f[var3] = 15 * nj.field_f[var3] + 0 >> -1489526652;
                        break L43;
                      } else {
                        nj.field_f[var3] = 15 * nj.field_f[var3] - -64 >> 914360292;
                        break L43;
                      }
                    }
                    var3++;
                    continue L42;
                  }
                }
              } else {
                break L40;
              }
            }
            L44: {
              if (0 < n.field_L) {
                n.field_L = n.field_L / 2;
                break L44;
              } else {
                break L44;
              }
            }
            if ((n.field_L ^ -1) >= -1) {
              break L14;
            } else {
              n.field_L = n.field_L - 1;
              break L14;
            }
          }
        }
        L45: {
          if (null == na.field_j) {
            break L45;
          } else {
            if (s.field_i) {
              L46: while (true) {
                if (!qh.c(103)) {
                  L47: {
                    if (na.field_j == null) {
                      break L47;
                    } else {
                      stackOut_175_0 = -4;
                      stackOut_175_1 = tl.field_c ^ -1;
                      stackIn_176_0 = stackOut_175_0;
                      stackIn_176_1 = stackOut_175_1;
                      L48: {
                        if (stackIn_176_0 == stackIn_176_1) {
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                      L49: {
                        if ((tl.field_c ^ -1) == -3) {
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                      L50: {
                        if (-2 == (tl.field_c ^ -1)) {
                          break L50;
                        } else {
                          break L50;
                        }
                      }
                      na.field_j.a(true);
                      break L47;
                    }
                  }
                  return;
                } else {
                  L51: {
                    if (gi.field_f != 13) {
                      break L51;
                    } else {
                      if (tl.field_c != 0) {
                        break L51;
                      } else {
                        na.field_j = null;
                        break L51;
                      }
                    }
                  }
                  L52: {
                    if (na.field_j == null) {
                      break L52;
                    } else {
                      if (gi.field_f != 13) {
                        break L52;
                      } else {
                        L53: {
                          if ((tl.field_c ^ -1) == -3) {
                            break L53;
                          } else {
                            if (tl.field_c == 1) {
                              break L53;
                            } else {
                              if (-4 != (tl.field_c ^ -1)) {
                                break L52;
                              } else {
                                break L53;
                              }
                            }
                          }
                        }
                        n.field_L = 256;
                        tl.field_c = 0;
                        gh.field_d = null;
                        continue L46;
                      }
                    }
                  }
                  if (null != na.field_j) {
                    na.field_j.b(8);
                    continue L46;
                  } else {
                    continue L46;
                  }
                }
              }
            } else {
              break L45;
            }
          }
        }
        L54: {
          if (0 < ig.field_D) {
            ig.field_D = ig.field_D - 6;
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          if (0 != wh.field_c) {
            break L55;
          } else {
            jg.field_pb = jg.field_pb - 8;
            if (jg.field_pb > 0) {
              break L55;
            } else {
              wh.field_c = 1;
              jg.field_pb = 0;
              if (!fe.field_e) {
                break L55;
              } else {
                ll.field_c.a(sb.field_e[36], 100, pk.field_h * 2);
                break L55;
              }
            }
          }
        }
        L56: {
          if (wh.field_c != 1) {
            break L56;
          } else {
            jg.field_pb = jg.field_pb + 1;
            if ((jg.field_pb ^ -1) <= -37) {
              jg.field_pb = 0;
              wh.field_c = 2;
              break L56;
            } else {
              break L56;
            }
          }
        }
        L57: {
          if (2 == wh.field_c) {
            jg.field_pb = jg.field_pb + 1;
            if ((jg.field_pb ^ -1) > -31) {
              break L57;
            } else {
              wh.field_c = 3;
              jg.field_pb = 0;
              break L57;
            }
          } else {
            break L57;
          }
        }
        L58: {
          if (-4 == (wh.field_c ^ -1)) {
            L59: {
              jg.field_pb = jg.field_pb + 1;
              if (1 == jg.field_pb) {
                if (!fe.field_e) {
                  break L59;
                } else {
                  if (s.field_i) {
                    break L59;
                  } else {
                    ll.field_c.a(sb.field_e[37], 100, pk.field_h * 2);
                    break L59;
                  }
                }
              } else {
                break L59;
              }
            }
            if (-251 <= (jg.field_pb ^ -1)) {
              break L58;
            } else {
              jg.field_pb = 0;
              wh.field_c = 2;
              break L58;
            }
          } else {
            break L58;
          }
        }
        L60: {
          if ((al.field_c ^ -1) == (ke.field_a ^ -1)) {
            break L60;
          } else {
            kg.field_D = kg.field_D - 1;
            if (-1 <= (kg.field_D ^ -1)) {
              kg.field_D = 255;
              ke.field_a = al.field_c;
              break L60;
            } else {
              break L60;
            }
          }
        }
        L61: {
          al.field_c = qi.field_a % 7 * 6912 + qi.field_a % 10 * 19 + 851968 * (qi.field_a % 14);
          if (s.field_i) {
            break L61;
          } else {
            al.field_c = 858899;
            break L61;
          }
        }
        L62: {
          if (-2 == (nc.field_H ^ -1)) {
            L63: {
              if ((a.field_h[0].field_g ^ -1) > -2) {
                a.field_h[0].field_g = a.field_h[0].field_g + 1;
                gh.field_b = gh.field_b - 1;
                break L63;
              } else {
                break L63;
              }
            }
            if (0 >= gh.field_b) {
              nc.field_H = 0;
              break L62;
            } else {
              break L62;
            }
          } else {
            break L62;
          }
        }
        L64: {
          if (nc.field_H == 2) {
            gh.field_b = gh.field_b - 1;
            if (0 >= gh.field_b) {
              gh.field_b = 5;
              nc.field_H = 1;
              break L64;
            } else {
              break L64;
            }
          } else {
            break L64;
          }
        }
        L65: {
          if (nc.field_H != 3) {
            break L65;
          } else {
            gh.field_b = gh.field_b - 1;
            if (gh.field_b > 0) {
              break L65;
            } else {
              gh.field_b = 5;
              nc.field_H = 1;
              break L65;
            }
          }
        }
        L66: {
          if (96 <= tc.field_r) {
            break L66;
          } else {
            tc.field_r = tc.field_r + 1;
            break L66;
          }
        }
        L67: {
          if (nc.field_H != 4) {
            break L67;
          } else {
            gh.field_b = gh.field_b - 1;
            if (0 < gh.field_b) {
              break L67;
            } else {
              gh.field_b = 5;
              nc.field_H = 1;
              break L67;
            }
          }
        }
        L68: {
          L69: {
            if (null == a.field_h[0]) {
              break L69;
            } else {
              if (0 == (a.field_h[0].field_m ^ -1)) {
                break L68;
              } else {
                break L69;
              }
            }
          }
          L70: {
            stackOut_242_0 = 0;
            stackIn_245_0 = stackOut_242_0;
            stackIn_243_0 = stackOut_242_0;
            if (s.field_i) {
              stackOut_245_0 = stackIn_245_0;
              stackOut_245_1 = 0;
              stackIn_246_0 = stackOut_245_0;
              stackIn_246_1 = stackOut_245_1;
              break L70;
            } else {
              stackOut_243_0 = stackIn_243_0;
              stackIn_244_0 = stackOut_243_0;
              stackOut_244_0 = stackIn_244_0;
              stackOut_244_1 = 1;
              stackIn_246_0 = stackOut_244_0;
              stackIn_246_1 = stackOut_244_1;
              break L70;
            }
          }
          if (stackIn_246_0 != stackIn_246_1) {
            break L68;
          } else {
            this.k((byte) -69);
            break L68;
          }
        }
        L71: {
          if (s.field_i) {
            L72: {
              L73: {
                L74: {
                  if (si.field_jb[98]) {
                    break L74;
                  } else {
                    if (4 != nc.field_H) {
                      break L73;
                    } else {
                      break L74;
                    }
                  }
                }
                if ((a.field_h[0].field_g ^ -1) < -1) {
                  L75: {
                    stackOut_272_0 = a.field_h[0];
                    stackOut_272_1 = a.field_h[0].field_k;
                    stackOut_272_2 = Math.cos(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                    stackIn_275_0 = stackOut_272_0;
                    stackIn_275_1 = stackOut_272_1;
                    stackIn_275_2 = stackOut_272_2;
                    stackIn_273_0 = stackOut_272_0;
                    stackIn_273_1 = stackOut_272_1;
                    stackIn_273_2 = stackOut_272_2;
                    if (8 != e.field_e) {
                      stackOut_275_0 = (qe) (Object) stackIn_275_0;
                      stackOut_275_1 = stackIn_275_1;
                      stackOut_275_2 = stackIn_275_2;
                      stackOut_275_3 = 0.1;
                      stackIn_276_0 = stackOut_275_0;
                      stackIn_276_1 = stackOut_275_1;
                      stackIn_276_2 = stackOut_275_2;
                      stackIn_276_3 = stackOut_275_3;
                      break L75;
                    } else {
                      stackOut_273_0 = (qe) (Object) stackIn_273_0;
                      stackOut_273_1 = stackIn_273_1;
                      stackOut_273_2 = stackIn_273_2;
                      stackIn_274_0 = stackOut_273_0;
                      stackIn_274_1 = stackOut_273_1;
                      stackIn_274_2 = stackOut_273_2;
                      stackOut_274_0 = (qe) (Object) stackIn_274_0;
                      stackOut_274_1 = stackIn_274_1;
                      stackOut_274_2 = stackIn_274_2;
                      stackOut_274_3 = 0.15;
                      stackIn_276_0 = stackOut_274_0;
                      stackIn_276_1 = stackOut_274_1;
                      stackIn_276_2 = stackOut_274_2;
                      stackIn_276_3 = stackOut_274_3;
                      break L75;
                    }
                  }
                  L76: {
                    stackIn_276_0.field_k = stackIn_276_1 - stackIn_276_2 * stackIn_276_3;
                    stackOut_276_0 = a.field_h[0];
                    stackOut_276_1 = a.field_h[0].field_d;
                    stackOut_276_2 = Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                    stackIn_278_0 = stackOut_276_0;
                    stackIn_278_1 = stackOut_276_1;
                    stackIn_278_2 = stackOut_276_2;
                    stackIn_277_0 = stackOut_276_0;
                    stackIn_277_1 = stackOut_276_1;
                    stackIn_277_2 = stackOut_276_2;
                    if (-9 == (e.field_e ^ -1)) {
                      stackOut_278_0 = (qe) (Object) stackIn_278_0;
                      stackOut_278_1 = stackIn_278_1;
                      stackOut_278_2 = stackIn_278_2;
                      stackOut_278_3 = 0.15;
                      stackIn_279_0 = stackOut_278_0;
                      stackIn_279_1 = stackOut_278_1;
                      stackIn_279_2 = stackOut_278_2;
                      stackIn_279_3 = stackOut_278_3;
                      break L76;
                    } else {
                      stackOut_277_0 = (qe) (Object) stackIn_277_0;
                      stackOut_277_1 = stackIn_277_1;
                      stackOut_277_2 = stackIn_277_2;
                      stackOut_277_3 = 0.1;
                      stackIn_279_0 = stackOut_277_0;
                      stackIn_279_1 = stackOut_277_1;
                      stackIn_279_2 = stackOut_277_2;
                      stackIn_279_3 = stackOut_277_3;
                      break L76;
                    }
                  }
                  L77: {
                    stackIn_279_0.field_d = stackIn_279_1 - stackIn_279_2 * stackIn_279_3;
                    if ((nc.field_H ^ -1) != -5) {
                      break L77;
                    } else {
                      a.field_h[0].field_k = a.field_h[0].field_k - 0.1 * Math.cos(3.141592653589793 * (double)a.field_h[0].field_h * 2.0 / 256.0);
                      a.field_h[0].field_d = a.field_h[0].field_d - 0.1 * Math.sin((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0);
                      if (!fe.field_e) {
                        break L77;
                      } else {
                        if (-1 > (og.field_a ^ -1)) {
                          break L77;
                        } else {
                          ll.field_c.a(sb.field_e[35], 100, pk.field_h / 2);
                          og.field_a = 7;
                          break L77;
                        }
                      }
                    }
                  }
                  L78: {
                    var2_int = 3;
                    var3 = 5;
                    if ((nc.field_H ^ -1) == -5) {
                      var3 = 10;
                      var2_int = 6;
                      break L78;
                    } else {
                      break L78;
                    }
                  }
                  var5 = 0;
                  L79: while (true) {
                    if (var5 >= var2_int) {
                      if (4 != nc.field_H) {
                        break L72;
                      } else {
                        var5 = 4 * (gh.field_b % 8);
                        L80: while (true) {
                          if (-257 >= (var5 ^ -1)) {
                            break L72;
                          } else {
                            L81: {
                              stackOut_301_0 = null;
                              stackOut_301_1 = null;
                              stackIn_304_0 = stackOut_301_0;
                              stackIn_304_1 = stackOut_301_1;
                              stackIn_302_0 = stackOut_301_0;
                              stackIn_302_1 = stackOut_301_1;
                              if (nc.field_H == 4) {
                                stackOut_304_0 = null;
                                stackOut_304_1 = null;
                                stackOut_304_2 = 4;
                                stackIn_305_0 = stackOut_304_0;
                                stackIn_305_1 = stackOut_304_1;
                                stackIn_305_2 = stackOut_304_2;
                                break L81;
                              } else {
                                stackOut_302_0 = null;
                                stackOut_302_1 = null;
                                stackIn_303_0 = stackOut_302_0;
                                stackIn_303_1 = stackOut_302_1;
                                stackOut_303_0 = null;
                                stackOut_303_1 = null;
                                stackOut_303_2 = 1;
                                stackIn_305_0 = stackOut_303_0;
                                stackIn_305_1 = stackOut_303_1;
                                stackIn_305_2 = stackOut_303_2;
                                break L81;
                              }
                            }
                            L82: {
                              new vl(stackIn_305_2, a.field_h[0]);
                              var4_ref = stackIn_305_0;
                              var4_ref.field_q = 16711680;
                              if (nc.field_H != 4) {
                                break L82;
                              } else {
                                var4_ref.field_p = 10;
                                var4_ref.field_q = 16776960;
                                break L82;
                              }
                            }
                            var4_ref.field_j = var4_ref.field_j + 2.0 * Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var5)) / 256.0);
                            var4_ref.field_a = var4_ref.field_a + Math.cos(2.0 * ((double)(var5 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 2.0;
                            var4_ref.field_a = var4_ref.field_a + a.field_h[0].field_k * 0.8;
                            var4_ref.field_j = var4_ref.field_j + a.field_h[0].field_d * 0.8;
                            var4_ref.field_c = a.field_h[0].field_a;
                            var4_ref.field_k = a.field_h[0].field_l;
                            wk.field_b[eg.a(-67)] = var4_ref;
                            var5 += 32;
                            continue L80;
                          }
                        }
                      }
                    } else {
                      L83: {
                        stackOut_290_0 = null;
                        stackOut_290_1 = null;
                        stackIn_293_0 = stackOut_290_0;
                        stackIn_293_1 = stackOut_290_1;
                        stackIn_291_0 = stackOut_290_0;
                        stackIn_291_1 = stackOut_290_1;
                        if ((nc.field_H ^ -1) != -5) {
                          stackOut_293_0 = null;
                          stackOut_293_1 = null;
                          stackOut_293_2 = 1;
                          stackIn_294_0 = stackOut_293_0;
                          stackIn_294_1 = stackOut_293_1;
                          stackIn_294_2 = stackOut_293_2;
                          break L83;
                        } else {
                          stackOut_291_0 = null;
                          stackOut_291_1 = null;
                          stackIn_292_0 = stackOut_291_0;
                          stackIn_292_1 = stackOut_291_1;
                          stackOut_292_0 = null;
                          stackOut_292_1 = null;
                          stackOut_292_2 = 4;
                          stackIn_294_0 = stackOut_292_0;
                          stackIn_294_1 = stackOut_292_1;
                          stackIn_294_2 = stackOut_292_2;
                          break L83;
                        }
                      }
                      L84: {
                        new vl(stackIn_294_2, a.field_h[0]);
                        var4_ref = stackIn_294_0;
                        var4_ref.field_q = 16711680;
                        if (-5 == (nc.field_H ^ -1)) {
                          var4_ref.field_q = 16776960;
                          var4_ref.field_p = 10;
                          break L84;
                        } else {
                          break L84;
                        }
                      }
                      var4_ref.field_j = var4_ref.field_j + 4.0 * Math.sin(((double)(-var3) + ((double)a.field_h[0].field_h + Math.random() * (double)var3 * 2.0)) * 3.141592653589793 * 2.0 / 256.0);
                      var4_ref.field_a = var4_ref.field_a + 4.0 * Math.cos(2.0 * (((double)(-var3) + ((double)a.field_h[0].field_h + (double)var3 * Math.random() * 2.0)) * 3.141592653589793) / 256.0);
                      var4_ref.field_c = var4_ref.field_j * 4.0 + a.field_h[0].field_a;
                      var4_ref.field_k = var4_ref.field_a * 4.0 + a.field_h[0].field_l;
                      var4_ref.field_a = var4_ref.field_a + a.field_h[0].field_k;
                      var4_ref.field_j = var4_ref.field_j + a.field_h[0].field_d;
                      wk.field_b[eg.a(-87)] = var4_ref;
                      var5++;
                      continue L79;
                    }
                  }
                } else {
                  break L73;
                }
              }
              if (!si.field_jb[99]) {
                break L72;
              } else {
                if (0 < a.field_h[0].field_g) {
                  L85: {
                    a.field_h[0].field_k = a.field_h[0].field_k + 0.05 * Math.cos(2.0 * ((double)a.field_h[0].field_h * 3.141592653589793) / 256.0);
                    a.field_h[0].field_d = a.field_h[0].field_d + 0.05 * Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
                    if (!fe.field_e) {
                      break L85;
                    } else {
                      if (og.field_a <= 0) {
                        ll.field_c.a(sb.field_e[0], 100, pk.field_h / 4);
                        og.field_a = 5;
                        break L85;
                      } else {
                        break L85;
                      }
                    }
                  }
                  var2_int = 3;
                  var3 = 5;
                  var5 = 0;
                  L86: while (true) {
                    if ((var2_int ^ -1) >= (var5 ^ -1)) {
                      var5 = 0;
                      L87: while (true) {
                        if ((var2_int ^ -1) >= (var5 ^ -1)) {
                          break L72;
                        } else {
                          var4_ref = new vl(1, a.field_h[0]);
                          var4_ref.field_q = 16711680;
                          var4_ref.field_j = var4_ref.field_j + 2.0 * Math.sin(2.0 * (3.141592653589793 * ((double)(32 + a.field_h[0].field_h - -128) + 2.0 * ((double)var3 * Math.random()) - (double)var3)) / 256.0);
                          var4_ref.field_a = var4_ref.field_a + 2.0 * Math.cos(((double)(32 + (a.field_h[0].field_h + 128)) + (double)var3 * Math.random() * 2.0 - (double)var3) * 3.141592653589793 * 2.0 / 256.0);
                          var4_ref.field_c = var4_ref.field_j * 4.0 + a.field_h[0].field_a;
                          var4_ref.field_k = 4.0 * var4_ref.field_a + a.field_h[0].field_l;
                          var4_ref.field_j = var4_ref.field_j + a.field_h[0].field_d;
                          var4_ref.field_a = var4_ref.field_a + a.field_h[0].field_k;
                          wk.field_b[eg.a(-53)] = var4_ref;
                          var5++;
                          continue L87;
                        }
                      }
                    } else {
                      var4_ref = new vl(1, a.field_h[0]);
                      var4_ref.field_q = 16711680;
                      var4_ref.field_j = var4_ref.field_j + Math.sin(2.0 * (((double)(96 + a.field_h[0].field_h) + 2.0 * ((double)var3 * Math.random()) - (double)var3) * 3.141592653589793) / 256.0) * 2.0;
                      var4_ref.field_a = var4_ref.field_a + 2.0 * Math.cos(2.0 * (((double)(-var3) + ((double)(-32 + (a.field_h[0].field_h - -128)) + 2.0 * ((double)var3 * Math.random()))) * 3.141592653589793) / 256.0);
                      var4_ref.field_c = var4_ref.field_j * 4.0 + a.field_h[0].field_a;
                      var4_ref.field_k = a.field_h[0].field_l + var4_ref.field_a * 4.0;
                      var4_ref.field_a = var4_ref.field_a + a.field_h[0].field_k;
                      var4_ref.field_j = var4_ref.field_j + a.field_h[0].field_d;
                      wk.field_b[eg.a(-71)] = var4_ref;
                      var5++;
                      continue L86;
                    }
                  }
                } else {
                  break L72;
                }
              }
            }
            L88: {
              L89: {
                if (si.field_jb[98]) {
                  break L89;
                } else {
                  if (si.field_jb[99]) {
                    break L89;
                  } else {
                    if (0 >= a.field_h[0].field_g) {
                      break L89;
                    } else {
                      a.field_h[0].field_d = a.field_h[0].field_d * 0.99;
                      a.field_h[0].field_k = a.field_h[0].field_k * 0.99;
                      if (gj.field_r == null) {
                        break L88;
                      } else {
                        if (0 > og.field_a) {
                          break L88;
                        } else {
                          og.field_a = -1;
                          gj.field_r.b(25, 0);
                          break L88;
                        }
                      }
                    }
                  }
                }
              }
              if (null == gj.field_r) {
                L90: {
                  gj.field_r = gd.a(sb.field_e[0], 100, 0);
                  gj.field_r.e(-1);
                  ll.field_c.a((kd) (Object) gj.field_r);
                  stackOut_326_0 = gj.field_r;
                  stackOut_326_1 = 10;
                  stackIn_329_0 = stackOut_326_0;
                  stackIn_329_1 = stackOut_326_1;
                  stackIn_327_0 = stackOut_326_0;
                  stackIn_327_1 = stackOut_326_1;
                  if (fe.field_e) {
                    stackOut_329_0 = (gd) (Object) stackIn_329_0;
                    stackOut_329_1 = stackIn_329_1;
                    stackOut_329_2 = pk.field_h / 2;
                    stackIn_330_0 = stackOut_329_0;
                    stackIn_330_1 = stackOut_329_1;
                    stackIn_330_2 = stackOut_329_2;
                    break L90;
                  } else {
                    stackOut_327_0 = (gd) (Object) stackIn_327_0;
                    stackOut_327_1 = stackIn_327_1;
                    stackIn_328_0 = stackOut_327_0;
                    stackIn_328_1 = stackOut_327_1;
                    stackOut_328_0 = (gd) (Object) stackIn_328_0;
                    stackOut_328_1 = stackIn_328_1;
                    stackOut_328_2 = 0;
                    stackIn_330_0 = stackOut_328_0;
                    stackIn_330_1 = stackOut_328_1;
                    stackIn_330_2 = stackOut_328_2;
                    break L90;
                  }
                }
                ((gd) (Object) stackIn_330_0).b(stackIn_330_1, stackIn_330_2);
                break L88;
              } else {
                if (0 < og.field_a) {
                  break L88;
                } else {
                  L91: {
                    og.field_a = 10;
                    stackOut_321_0 = gj.field_r;
                    stackOut_321_1 = 10;
                    stackIn_324_0 = stackOut_321_0;
                    stackIn_324_1 = stackOut_321_1;
                    stackIn_322_0 = stackOut_321_0;
                    stackIn_322_1 = stackOut_321_1;
                    if (fe.field_e) {
                      stackOut_324_0 = (gd) (Object) stackIn_324_0;
                      stackOut_324_1 = stackIn_324_1;
                      stackOut_324_2 = pk.field_h / 2;
                      stackIn_325_0 = stackOut_324_0;
                      stackIn_325_1 = stackOut_324_1;
                      stackIn_325_2 = stackOut_324_2;
                      break L91;
                    } else {
                      stackOut_322_0 = (gd) (Object) stackIn_322_0;
                      stackOut_322_1 = stackIn_322_1;
                      stackIn_323_0 = stackOut_322_0;
                      stackIn_323_1 = stackOut_322_1;
                      stackOut_323_0 = (gd) (Object) stackIn_323_0;
                      stackOut_323_1 = stackIn_323_1;
                      stackOut_323_2 = 0;
                      stackIn_325_0 = stackOut_323_0;
                      stackIn_325_1 = stackOut_323_1;
                      stackIn_325_2 = stackOut_323_2;
                      break L91;
                    }
                  }
                  ((gd) (Object) stackIn_325_0).b(stackIn_325_1, stackIn_325_2);
                  break L88;
                }
              }
            }
            L92: {
              L93: {
                a.field_h[0].field_k = a.field_h[0].field_k * 0.99;
                if (!si.field_jb[97]) {
                  break L93;
                } else {
                  if ((a.field_h[0].field_g ^ -1) >= -1) {
                    break L93;
                  } else {
                    L94: {
                      if (8 != e.field_e) {
                        stackOut_337_0 = -75;
                        stackIn_338_0 = stackOut_337_0;
                        break L94;
                      } else {
                        stackOut_336_0 = -150;
                        stackIn_338_0 = stackOut_336_0;
                        break L94;
                      }
                    }
                    L95: {
                      var2_int = stackIn_338_0;
                      if (((stellarshard) this).field_M > var2_int / 3) {
                        ((stellarshard) this).field_M = var2_int / 3;
                        break L95;
                      } else {
                        break L95;
                      }
                    }
                    L96: {
                      if (var2_int >= ((stellarshard) this).field_M) {
                        break L96;
                      } else {
                        ((stellarshard) this).field_M = ((stellarshard) this).field_M - 6;
                        break L96;
                      }
                    }
                    break L92;
                  }
                }
              }
              if ((((stellarshard) this).field_M ^ -1) <= -1) {
                break L92;
              } else {
                ((stellarshard) this).field_M = ((stellarshard) this).field_M + 5;
                if (0 >= ((stellarshard) this).field_M) {
                  break L92;
                } else {
                  ((stellarshard) this).field_M = 0;
                  break L92;
                }
              }
            }
            L97: {
              L98: {
                a.field_h[0].field_d = a.field_h[0].field_d * 0.99;
                if (!si.field_jb[96]) {
                  break L98;
                } else {
                  if (a.field_h[0].field_g <= 0) {
                    break L98;
                  } else {
                    L99: {
                      if (e.field_e != 8) {
                        stackOut_355_0 = 75;
                        stackIn_356_0 = stackOut_355_0;
                        break L99;
                      } else {
                        stackOut_354_0 = 150;
                        stackIn_356_0 = stackOut_354_0;
                        break L99;
                      }
                    }
                    L100: {
                      var2_int = stackIn_356_0;
                      if ((var2_int / 3 ^ -1) >= (((stellarshard) this).field_M ^ -1)) {
                        break L100;
                      } else {
                        ((stellarshard) this).field_M = var2_int / 3;
                        break L100;
                      }
                    }
                    L101: {
                      if (((stellarshard) this).field_M >= var2_int) {
                        break L101;
                      } else {
                        ((stellarshard) this).field_M = ((stellarshard) this).field_M + 6;
                        break L101;
                      }
                    }
                    break L97;
                  }
                }
              }
              if (-1 > (((stellarshard) this).field_M ^ -1)) {
                ((stellarshard) this).field_M = ((stellarshard) this).field_M - 5;
                if ((((stellarshard) this).field_M ^ -1) <= -1) {
                  break L97;
                } else {
                  ((stellarshard) this).field_M = 0;
                  break L97;
                }
              } else {
                break L97;
              }
            }
            L102: {
              a.field_h[0].field_j = ((stellarshard) this).field_M;
              if (si.field_jb[83]) {
                break L102;
              } else {
                if (si.field_jb[82]) {
                  break L102;
                } else {
                  if (10 != e.field_e) {
                    break L71;
                  } else {
                    if (-1 >= (a.field_h[0].field_i ^ -1)) {
                      break L71;
                    } else {
                      break L102;
                    }
                  }
                }
              }
            }
            if (0 < a.field_h[0].field_g) {
              L103: {
                var2_int = e.field_e;
                if (var2_int == -1) {
                  if (!fe.field_e) {
                    break L103;
                  } else {
                    if (-1 > (a.field_h[0].field_i ^ -1)) {
                      break L103;
                    } else {
                      ll.field_c.a(sb.field_e[27], 100, 2 * pk.field_h);
                      break L103;
                    }
                  }
                } else {
                  if ((var2_int ^ -1) == -1) {
                    if (!fe.field_e) {
                      break L103;
                    } else {
                      if (0 < a.field_h[0].field_i) {
                        break L103;
                      } else {
                        ll.field_c.a(sb.field_e[38], 100, pk.field_h * 2);
                        break L103;
                      }
                    }
                  } else {
                    if ((var2_int ^ -1) != -2) {
                      if (2 == var2_int) {
                        if (!fe.field_e) {
                          break L103;
                        } else {
                          if (-1 > (a.field_h[0].field_i ^ -1)) {
                            break L103;
                          } else {
                            ll.field_c.a(sb.field_e[1], 100, pk.field_h * 2);
                            break L103;
                          }
                        }
                      } else {
                        if (3 != var2_int) {
                          if (4 == var2_int) {
                            if (!fe.field_e) {
                              break L103;
                            } else {
                              if (0 >= af.field_o) {
                                ll.field_c.a(sb.field_e[24], 100, 2 * pk.field_h);
                                af.field_o = 3;
                                break L103;
                              } else {
                                break L103;
                              }
                            }
                          } else {
                            if (-6 == (var2_int ^ -1)) {
                              if (!fe.field_e) {
                                break L103;
                              } else {
                                if (0 < a.field_h[0].field_i) {
                                  break L103;
                                } else {
                                  ll.field_c.a(sb.field_e[39], 100, pk.field_h * 2);
                                  break L103;
                                }
                              }
                            } else {
                              if (var2_int == 6) {
                                if (!fe.field_e) {
                                  break L103;
                                } else {
                                  if (a.field_h[0].field_i > 0) {
                                    break L103;
                                  } else {
                                    ll.field_c.a(sb.field_e[22], 100, 2 * pk.field_h);
                                    break L103;
                                  }
                                }
                              } else {
                                if (-8 == (var2_int ^ -1)) {
                                  if (!fe.field_e) {
                                    break L103;
                                  } else {
                                    if (a.field_h[0].field_i > 0) {
                                      break L103;
                                    } else {
                                      ll.field_c.a(sb.field_e[34], 100, 2 * pk.field_h);
                                      break L103;
                                    }
                                  }
                                } else {
                                  if (var2_int != 8) {
                                    if (var2_int == 9) {
                                      if (!fe.field_e) {
                                        break L103;
                                      } else {
                                        if ((af.field_o ^ -1) >= -1) {
                                          ll.field_c.a(sb.field_e[7], 100, 2 * pk.field_h);
                                          af.field_o = 5;
                                          break L103;
                                        } else {
                                          break L103;
                                        }
                                      }
                                    } else {
                                      if (-11 != (var2_int ^ -1)) {
                                        break L103;
                                      } else {
                                        if (!fe.field_e) {
                                          break L103;
                                        } else {
                                          if (a.field_h[0].field_i != -1) {
                                            break L103;
                                          } else {
                                            ll.field_c.a(sb.field_e[25], 100, pk.field_h * 2);
                                            break L103;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (!fe.field_e) {
                                      break L103;
                                    } else {
                                      if (af.field_o <= 0) {
                                        ll.field_c.a(sb.field_e[20], 100, pk.field_h * 2);
                                        af.field_o = (int)(Math.random() * 10.0) + 15;
                                        break L103;
                                      } else {
                                        break L103;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (!fe.field_e) {
                            break L103;
                          } else {
                            if (-1 <= (a.field_h[0].field_i ^ -1)) {
                              ll.field_c.a(sb.field_e[21], 100, 2 * pk.field_h);
                              break L103;
                            } else {
                              break L103;
                            }
                          }
                        }
                      }
                    } else {
                      if (!fe.field_e) {
                        break L103;
                      } else {
                        if ((a.field_h[0].field_i ^ -1) >= -1) {
                          ll.field_c.a(sb.field_e[33], 100, pk.field_h * 2);
                          break L103;
                        } else {
                          break L103;
                        }
                      }
                    }
                  }
                }
              }
              if (-1 > (a.field_h[0].field_i ^ -1)) {
                break L71;
              } else {
                var4 = e.field_e;
                if (var4 != -1) {
                  if ((var4 ^ -1) == -1) {
                    L104: {
                      mj.field_F = mj.field_F + 1;
                      if (mj.field_F + 1 <= 1) {
                        break L104;
                      } else {
                        mj.field_F = 0;
                        break L104;
                      }
                    }
                    a.field_h[0].field_i = 10;
                    var4 = -4;
                    L105: while (true) {
                      if (-5 > (var4 ^ -1)) {
                        break L71;
                      } else {
                        L106: {
                          L107: {
                            L108: {
                              var2 = (pi) (Object) new vl(0, a.field_h[0]);
                              ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - Math.sin(2.0 * ((double)(a.field_h[0].field_h - -(1 * var4)) * 3.141592653589793) / 256.0) * 8.0;
                              ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - Math.cos(3.141592653589793 * (double)(1 * var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 8.0;
                              ((vl) (Object) var2).field_k = -((double)var4 * ((vl) (Object) var2).field_j / 4.0) + (a.field_h[0].field_l + 2.0 * ((vl) (Object) var2).field_a);
                              ((vl) (Object) var2).field_c = ((vl) (Object) var2).field_a * (double)var4 / 4.0 + (a.field_h[0].field_a + 2.0 * ((vl) (Object) var2).field_j);
                              ((vl) (Object) var2).field_q = 255;
                              ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k;
                              ((vl) (Object) var2).field_n = e.field_e;
                              ((vl) (Object) var2).field_p = 2;
                              ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d;
                              if ((var4 ^ -1) != -1) {
                                break L108;
                              } else {
                                if (-1 == (mj.field_F ^ -1)) {
                                  break L107;
                                } else {
                                  break L108;
                                }
                              }
                            }
                            if ((var4 ^ -1) == -1) {
                              break L106;
                            } else {
                              if (1 != mj.field_F) {
                                break L106;
                              } else {
                                break L107;
                              }
                            }
                          }
                          ((vl) (Object) var2).field_q = 8421631;
                          break L106;
                        }
                        wk.field_b[eg.a(-109)] = (vl) (Object) var2;
                        var4 += 4;
                        continue L105;
                      }
                    }
                  } else {
                    if (var4 == 1) {
                      L109: {
                        mj.field_F = mj.field_F + 1;
                        if ((mj.field_F + 1 ^ -1) < -2) {
                          mj.field_F = 0;
                          break L109;
                        } else {
                          break L109;
                        }
                      }
                      a.field_h[0].field_i = 5;
                      var4 = -3;
                      L110: while (true) {
                        if (-4 > (var4 ^ -1)) {
                          break L71;
                        } else {
                          L111: {
                            L112: {
                              var2 = (pi) (Object) new vl(0, a.field_h[0]);
                              ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var4)) / 256.0) * 6.0;
                              ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - 6.0 * Math.cos((double)(a.field_h[0].field_h - -var4) * 3.141592653589793 * 2.0 / 256.0);
                              ((vl) (Object) var2).field_k = a.field_h[0].field_l + ((vl) (Object) var2).field_a * 4.0 - (double)var4 * ((vl) (Object) var2).field_j / 2.0;
                              ((vl) (Object) var2).field_c = ((vl) (Object) var2).field_a * (double)var4 / 2.0 + (((vl) (Object) var2).field_j * 4.0 + a.field_h[0].field_a);
                              ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d;
                              ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k;
                              ((vl) (Object) var2).field_p = 1;
                              wk.field_b[eg.a(-91)] = (vl) (Object) var2;
                              ((vl) (Object) var2).field_q = 16728128;
                              ((vl) (Object) var2).field_n = e.field_e;
                              if ((Math.abs(var4) ^ -1) < -2) {
                                if ((Math.abs(var4) ^ -1) >= -2) {
                                  break L111;
                                } else {
                                  if (mj.field_F == 1) {
                                    break L112;
                                  } else {
                                    break L111;
                                  }
                                }
                              } else {
                                break L112;
                              }
                            }
                            ((vl) (Object) var2).field_q = 16760896;
                            break L111;
                          }
                          var4 += 2;
                          continue L110;
                        }
                      }
                    } else {
                      if (-3 != (var4 ^ -1)) {
                        if (3 != var4) {
                          if (-5 != (var4 ^ -1)) {
                            if (5 != var4) {
                              if (6 == var4) {
                                a.field_h[0].field_i = 5;
                                var4 = -10;
                                L113: while (true) {
                                  if (-11 > (var4 ^ -1)) {
                                    break L71;
                                  } else {
                                    var2 = (pi) (Object) new vl(0, a.field_h[0]);
                                    ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - Math.sin((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                                    ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - 6.0 * Math.cos(2.0 * ((double)(a.field_h[0].field_h - -var4) * 3.141592653589793) / 256.0);
                                    ((vl) (Object) var2).field_c = ((vl) (Object) var2).field_j * 4.0 + a.field_h[0].field_a;
                                    ((vl) (Object) var2).field_k = a.field_h[0].field_l + ((vl) (Object) var2).field_a * 4.0;
                                    ((vl) (Object) var2).field_p = 1;
                                    ((vl) (Object) var2).field_d = 65535;
                                    ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k;
                                    ((vl) (Object) var2).field_q = 16776960;
                                    ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d;
                                    wk.field_b[eg.a(-113)] = (vl) (Object) var2;
                                    ((vl) (Object) var2).field_n = e.field_e;
                                    var4 += 4;
                                    continue L113;
                                  }
                                }
                              } else {
                                if (var4 != 7) {
                                  if ((var4 ^ -1) != -9) {
                                    if ((var4 ^ -1) == -10) {
                                      a.field_h[0].field_i = 1;
                                      var4 = -2;
                                      L114: while (true) {
                                        if ((var4 ^ -1) < -3) {
                                          break L71;
                                        } else {
                                          var2 = (pi) (Object) new vl(0, a.field_h[0]);
                                          ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 2.0;
                                          ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - Math.cos(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h - -var4)) / 256.0) * 2.0;
                                          ((vl) (Object) var2).field_m = 2;
                                          ((vl) (Object) var2).field_q = 16711680;
                                          ((vl) (Object) var2).field_d = 16776960;
                                          ((vl) (Object) var2).field_k = 8.0 * ((vl) (Object) var2).field_a + a.field_h[0].field_l;
                                          ((vl) (Object) var2).field_p = 1;
                                          ((vl) (Object) var2).field_c = 8.0 * ((vl) (Object) var2).field_j + a.field_h[0].field_a;
                                          wk.field_b[eg.a(-70)] = (vl) (Object) var2;
                                          ((vl) (Object) var2).field_l = 1001;
                                          ((vl) (Object) var2).field_n = e.field_e;
                                          var4 += 4;
                                          continue L114;
                                        }
                                      }
                                    } else {
                                      if (10 != var4) {
                                        break L71;
                                      } else {
                                        L115: {
                                          a.field_h[0].field_i = a.field_h[0].field_i - 1;
                                          if ((a.field_h[0].field_i ^ -1) < 24) {
                                            break L115;
                                          } else {
                                            a.field_h[0].field_i = 10;
                                            break L115;
                                          }
                                        }
                                        L116: {
                                          var3 = -a.field_h[0].field_i;
                                          if (15 < var3) {
                                            var3 = -var3 + 25;
                                            break L116;
                                          } else {
                                            break L116;
                                          }
                                        }
                                        L117: {
                                          if (-11 <= (var3 ^ -1)) {
                                            break L117;
                                          } else {
                                            var3 = 10;
                                            break L117;
                                          }
                                        }
                                        L118: {
                                          if (-2 < (var3 ^ -1)) {
                                            var3 = 1;
                                            break L118;
                                          } else {
                                            break L118;
                                          }
                                        }
                                        var4 = -1;
                                        L119: while (true) {
                                          if (-2 > (var4 ^ -1)) {
                                            break L71;
                                          } else {
                                            L120: {
                                              var2 = (pi) (Object) new vl(0, a.field_h[0]);
                                              ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h - -(0 * var4))) / 256.0) * 8.0;
                                              ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - Math.cos(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var4 * 0)) / 256.0) * 8.0;
                                              ((vl) (Object) var2).field_m = 2;
                                              ((vl) (Object) var2).field_p = var3;
                                              ((vl) (Object) var2).field_q = 65535;
                                              ((vl) (Object) var2).field_d = 16777215;
                                              ((vl) (Object) var2).field_c = (double)var4 * ((vl) (Object) var2).field_a * (double)var3 / 10.0 + (((vl) (Object) var2).field_j * 2.0 + a.field_h[0].field_a);
                                              ((vl) (Object) var2).field_k = a.field_h[0].field_l + ((vl) (Object) var2).field_a * 2.0 - ((vl) (Object) var2).field_j * (double)var4 * (double)var3 / 10.0;
                                              wk.field_b[eg.a(-75)] = (vl) (Object) var2;
                                              ((vl) (Object) var2).field_l = 6;
                                              ((vl) (Object) var2).field_n = e.field_e;
                                              if (var4 == 0) {
                                                break L120;
                                              } else {
                                                ((vl) (Object) var2).field_n = 11;
                                                break L120;
                                              }
                                            }
                                            var4++;
                                            continue L119;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    a.field_h[0].field_i = 1;
                                    var4 = 0;
                                    L121: while (true) {
                                      if (10 <= var4) {
                                        break L71;
                                      } else {
                                        var5_double = -8.0 + Math.random() * 17.0;
                                        var2 = (pi) (Object) new vl(4, a.field_h[0]);
                                        ((vl) (Object) var2).field_q = 16776960;
                                        ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - 5.0 * Math.sin(2.0 * (3.141592653589793 * (var5_double + (double)a.field_h[0].field_h)) / 256.0);
                                        ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - 5.0 * Math.cos(2.0 * (((double)a.field_h[0].field_h + var5_double) * 3.141592653589793) / 256.0);
                                        ((vl) (Object) var2).field_c = ((vl) (Object) var2).field_j * 3.0 + a.field_h[0].field_a;
                                        ((vl) (Object) var2).field_k = a.field_h[0].field_l + ((vl) (Object) var2).field_a * 3.0;
                                        ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d;
                                        ((vl) (Object) var2).field_p = 2;
                                        ((vl) (Object) var2).field_m = 1;
                                        ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k;
                                        wk.field_b[eg.a(-80)] = (vl) (Object) var2;
                                        var4++;
                                        continue L121;
                                      }
                                    }
                                  }
                                } else {
                                  a.field_h[0].field_i = 10;
                                  var4 = -11;
                                  L122: while (true) {
                                    if (var4 > -9) {
                                      var4 = -3;
                                      L123: while (true) {
                                        if (var4 > 3) {
                                          var4 = 9;
                                          L124: while (true) {
                                            if ((var4 ^ -1) < -12) {
                                              break L71;
                                            } else {
                                              L125: {
                                                var2 = (pi) (Object) new vl(0, a.field_h[0]);
                                                var5_double = 5.0;
                                                if (Math.abs(var4 + -10) == 3) {
                                                  var5_double = 4.5;
                                                  break L125;
                                                } else {
                                                  break L125;
                                                }
                                              }
                                              L126: {
                                                if (-3 == (Math.abs(var4 - 10) ^ -1)) {
                                                  var5_double = 4.8;
                                                  break L126;
                                                } else {
                                                  break L126;
                                                }
                                              }
                                              ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - var5_double * Math.sin(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                              ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - Math.cos(2.0 * ((double)(a.field_h[0].field_h - -var4) * 3.141592653589793) / 256.0) * var5_double;
                                              ((vl) (Object) var2).field_k = 4.0 * ((vl) (Object) var2).field_a + a.field_h[0].field_l;
                                              ((vl) (Object) var2).field_c = a.field_h[0].field_a + 4.0 * ((vl) (Object) var2).field_j;
                                              ((vl) (Object) var2).field_q = 255;
                                              ((vl) (Object) var2).field_p = 2;
                                              ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d / 5.0;
                                              ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k / 5.0;
                                              ((vl) (Object) var2).field_d = 8454143;
                                              wk.field_b[eg.a(-112)] = (vl) (Object) var2;
                                              ((vl) (Object) var2).field_n = e.field_e;
                                              ((vl) (Object) var2).field_l = 5;
                                              var4++;
                                              continue L124;
                                            }
                                          }
                                        } else {
                                          L127: {
                                            var2 = (pi) (Object) new vl(0, a.field_h[0]);
                                            var5_double = 5.0;
                                            if ((Math.abs(var4) ^ -1) != -4) {
                                              break L127;
                                            } else {
                                              var5_double = 4.5;
                                              break L127;
                                            }
                                          }
                                          L128: {
                                            if (-3 != (Math.abs(var4) ^ -1)) {
                                              break L128;
                                            } else {
                                              var5_double = 4.8;
                                              break L128;
                                            }
                                          }
                                          ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - var5_double * Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0);
                                          ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - var5_double * Math.cos(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                          ((vl) (Object) var2).field_c = ((vl) (Object) var2).field_j * 4.0 + a.field_h[0].field_a;
                                          ((vl) (Object) var2).field_k = ((vl) (Object) var2).field_a * 4.0 + a.field_h[0].field_l;
                                          ((vl) (Object) var2).field_p = 3;
                                          ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k / 5.0;
                                          ((vl) (Object) var2).field_q = 49407;
                                          ((vl) (Object) var2).field_d = 8454143;
                                          ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d / 5.0;
                                          wk.field_b[eg.a(-40)] = (vl) (Object) var2;
                                          ((vl) (Object) var2).field_n = e.field_e;
                                          ((vl) (Object) var2).field_l = 5;
                                          var4++;
                                          continue L123;
                                        }
                                      }
                                    } else {
                                      L129: {
                                        var2 = (pi) (Object) new vl(0, a.field_h[0]);
                                        var5_double = 5.0;
                                        if (3 != Math.abs(var4 + 10)) {
                                          break L129;
                                        } else {
                                          var5_double = 4.5;
                                          break L129;
                                        }
                                      }
                                      L130: {
                                        if (2 == Math.abs(var4 - -10)) {
                                          var5_double = 4.8;
                                          break L130;
                                        } else {
                                          break L130;
                                        }
                                      }
                                      ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - var5_double * Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0);
                                      ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - var5_double * Math.cos(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                      ((vl) (Object) var2).field_c = a.field_h[0].field_a + 4.0 * ((vl) (Object) var2).field_j;
                                      ((vl) (Object) var2).field_k = a.field_h[0].field_l + ((vl) (Object) var2).field_a * 4.0;
                                      ((vl) (Object) var2).field_l = 5;
                                      ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k / 5.0;
                                      ((vl) (Object) var2).field_d = 8454143;
                                      ((vl) (Object) var2).field_q = 255;
                                      ((vl) (Object) var2).field_p = 2;
                                      ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d / 5.0;
                                      wk.field_b[eg.a(-71)] = (vl) (Object) var2;
                                      ((vl) (Object) var2).field_n = e.field_e;
                                      var4++;
                                      continue L122;
                                    }
                                  }
                                }
                              }
                            } else {
                              a.field_h[0].field_i = 35;
                              var4 = -30;
                              L131: while (true) {
                                if (30 < var4) {
                                  break L71;
                                } else {
                                  var2 = (pi) (Object) new vl(0, a.field_h[0]);
                                  ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 4.0;
                                  ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - 4.0 * Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                                  ((vl) (Object) var2).field_c = a.field_h[0].field_a + ((vl) (Object) var2).field_j * 4.0;
                                  ((vl) (Object) var2).field_k = a.field_h[0].field_l + 4.0 * ((vl) (Object) var2).field_a;
                                  ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d;
                                  ((vl) (Object) var2).field_p = 1;
                                  ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k;
                                  ((vl) (Object) var2).field_q = 65280 + (Math.abs(var4) * 255 / 30 << 1688133712 & 16771312);
                                  wk.field_b[eg.a(-54)] = (vl) (Object) var2;
                                  ((vl) (Object) var2).field_n = e.field_e;
                                  var4++;
                                  continue L131;
                                }
                              }
                            }
                          } else {
                            L132: {
                              a.field_h[0].field_i = 0;
                              var2 = (pi) (Object) new vl(0, a.field_h[0]);
                              ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0) * 8.0;
                              ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - Math.cos((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0) * 8.0;
                              ((vl) (Object) var2).field_q = 12422335;
                              ((vl) (Object) var2).field_m = 2;
                              ((vl) (Object) var2).field_k = ((vl) (Object) var2).field_a * 2.0 + a.field_h[0].field_l;
                              ((vl) (Object) var2).field_d = 9578383;
                              ((vl) (Object) var2).field_c = 2.0 * ((vl) (Object) var2).field_j + a.field_h[0].field_a;
                              ((vl) (Object) var2).field_l = 1000;
                              ((vl) (Object) var2).field_p = 1;
                              var4 = eg.a(-36);
                              if (var4 == -1) {
                                break L132;
                              } else {
                                wk.field_b[var4] = (vl) (Object) var2;
                                break L132;
                              }
                            }
                            ((vl) (Object) var2).field_n = e.field_e;
                            break L71;
                          }
                        } else {
                          a.field_h[0].field_i = 10;
                          var4 = -3;
                          L133: while (true) {
                            if (var4 > 3) {
                              break L71;
                            } else {
                              L134: {
                                var2 = (pi) (Object) new vl(0, a.field_h[0]);
                                var5_double = 5.0;
                                if ((Math.abs(var4) ^ -1) == -4) {
                                  var5_double = 4.5;
                                  break L134;
                                } else {
                                  break L134;
                                }
                              }
                              L135: {
                                if (2 != Math.abs(var4)) {
                                  break L135;
                                } else {
                                  var5_double = 4.8;
                                  break L135;
                                }
                              }
                              L136: {
                                ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - var5_double * Math.sin((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                                ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - var5_double * Math.cos((double)(a.field_h[0].field_h - -var4) * 3.141592653589793 * 2.0 / 256.0);
                                ((vl) (Object) var2).field_k = ((vl) (Object) var2).field_a * 4.0 + a.field_h[0].field_l;
                                ((vl) (Object) var2).field_c = a.field_h[0].field_a + ((vl) (Object) var2).field_j * 4.0;
                                ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k / 5.0;
                                ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d / 5.0;
                                ((vl) (Object) var2).field_q = 16711680;
                                ((vl) (Object) var2).field_d = 16744576;
                                ((vl) (Object) var2).field_p = 3;
                                if (2 == Math.abs(var4)) {
                                  ((vl) (Object) var2).field_q = 16711680;
                                  ((vl) (Object) var2).field_d = 16760960;
                                  break L136;
                                } else {
                                  break L136;
                                }
                              }
                              L137: {
                                if ((Math.abs(var4) ^ -1) == -2) {
                                  ((vl) (Object) var2).field_q = 16711680;
                                  ((vl) (Object) var2).field_d = 16777088;
                                  break L137;
                                } else {
                                  break L137;
                                }
                              }
                              L138: {
                                if ((Math.abs(var4) ^ -1) == -1) {
                                  ((vl) (Object) var2).field_q = 16711680;
                                  ((vl) (Object) var2).field_d = 16777088;
                                  break L138;
                                } else {
                                  break L138;
                                }
                              }
                              wk.field_b[eg.a(-67)] = (vl) (Object) var2;
                              ((vl) (Object) var2).field_n = e.field_e;
                              ((vl) (Object) var2).field_l = 5;
                              var4++;
                              continue L133;
                            }
                          }
                        }
                      } else {
                        L139: {
                          a.field_h[0].field_i = 6;
                          mj.field_F = mj.field_F + 1;
                          if ((mj.field_F + 1 ^ -1) >= -4) {
                            break L139;
                          } else {
                            mj.field_F = 0;
                            break L139;
                          }
                        }
                        var4 = -1;
                        L140: while (true) {
                          if (-2 > (var4 ^ -1)) {
                            break L71;
                          } else {
                            L141: {
                              var2 = (pi) (Object) new vl(0, a.field_h[0]);
                              if ((var4 ^ -1) != 0) {
                                break L141;
                              } else {
                                mj.field_F = 3 - mj.field_F;
                                break L141;
                              }
                            }
                            L142: {
                              ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - Math.sin(3.141592653589793 * (double)(a.field_h[0].field_h + 4 * (1 + mj.field_F) * var4) * 2.0 / 256.0) * 6.0;
                              ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - Math.cos((double)(a.field_h[0].field_h + (mj.field_F - -1) * (var4 * 4)) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                              ((vl) (Object) var2).field_c = ((vl) (Object) var2).field_j * 3.0 + a.field_h[0].field_a;
                              if ((var4 ^ -1) == 0) {
                                mj.field_F = -mj.field_F + 3;
                                break L142;
                              } else {
                                break L142;
                              }
                            }
                            L143: {
                              L144: {
                                L145: {
                                  ((vl) (Object) var2).field_k = a.field_h[0].field_l + ((vl) (Object) var2).field_a * 3.0;
                                  ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d;
                                  ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k;
                                  ((vl) (Object) var2).field_q = 255;
                                  ((vl) (Object) var2).field_p = 4;
                                  ((vl) (Object) var2).field_n = e.field_e;
                                  if (var4 != 0) {
                                    break L145;
                                  } else {
                                    if (0 == mj.field_F % 2) {
                                      break L144;
                                    } else {
                                      break L145;
                                    }
                                  }
                                }
                                if (-1 == (var4 ^ -1)) {
                                  break L143;
                                } else {
                                  if ((mj.field_F % 2 ^ -1) == -2) {
                                    break L144;
                                  } else {
                                    break L143;
                                  }
                                }
                              }
                              ((vl) (Object) var2).field_q = 8421631;
                              break L143;
                            }
                            wk.field_b[eg.a(-51)] = (vl) (Object) var2;
                            var4 += 2;
                            continue L140;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L146: {
                    mj.field_F = mj.field_F + 1;
                    if ((mj.field_F + 1 ^ -1) < -5) {
                      mj.field_F = 0;
                      break L146;
                    } else {
                      break L146;
                    }
                  }
                  L147: {
                    a.field_h[0].field_i = 5;
                    var4 = mj.field_F + -1;
                    if ((var4 ^ -1) != -3) {
                      break L147;
                    } else {
                      var4 = 0;
                      break L147;
                    }
                  }
                  L148: {
                    if ((var4 ^ -1) == -4) {
                      var4 = -1;
                      break L148;
                    } else {
                      break L148;
                    }
                  }
                  L149: {
                    var2 = (pi) (Object) new vl(0, a.field_h[0]);
                    ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j - Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 8.0;
                    ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a - Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0) * 8.0;
                    ((vl) (Object) var2).field_k = ((vl) (Object) var2).field_a * 2.0 + a.field_h[0].field_l;
                    ((vl) (Object) var2).field_c = a.field_h[0].field_a + ((vl) (Object) var2).field_j * 2.0;
                    ((vl) (Object) var2).field_q = 255;
                    ((vl) (Object) var2).field_p = 1;
                    ((vl) (Object) var2).field_n = e.field_e;
                    ((vl) (Object) var2).field_j = ((vl) (Object) var2).field_j + a.field_h[0].field_d;
                    ((vl) (Object) var2).field_a = ((vl) (Object) var2).field_a + a.field_h[0].field_k;
                    if (0 != var4) {
                      break L149;
                    } else {
                      ((vl) (Object) var2).field_q = 8421631;
                      ((vl) (Object) var2).field_p = 2;
                      break L149;
                    }
                  }
                  wk.field_b[eg.a(-27)] = (vl) (Object) var2;
                  break L71;
                }
              }
            } else {
              break L71;
            }
          } else {
            break L71;
          }
        }
        L150: {
          if (!s.field_i) {
            break L150;
          } else {
            if (na.field_j == null) {
              L151: while (true) {
                if (!qh.c(89)) {
                  break L150;
                } else {
                  stackOut_652_0 = gi.field_f ^ -1;
                  stackIn_653_0 = stackOut_652_0;
                  stackOut_653_0 = stackIn_653_0;
                  stackOut_653_1 = -34;
                  stackIn_654_0 = stackOut_653_0;
                  stackIn_654_1 = stackOut_653_1;
                  L152: {
                    if (stackIn_654_0 != stackIn_654_1) {
                      break L152;
                    } else {
                      if (ph.field_D < 2) {
                        break L152;
                      } else {
                        e.field_e = e.field_e + 1;
                        e.field_c = true;
                        if (-11 <= (e.field_e ^ -1)) {
                          break L152;
                        } else {
                          e.field_e = -1;
                          break L152;
                        }
                      }
                    }
                  }
                  L153: {
                    if (41 != gi.field_f) {
                      break L153;
                    } else {
                      if (ph.field_D < 2) {
                        break L153;
                      } else {
                        L154: {
                          if (hd.field_b) {
                            stackOut_666_0 = 0;
                            stackIn_667_0 = stackOut_666_0;
                            break L154;
                          } else {
                            stackOut_665_0 = 1;
                            stackIn_667_0 = stackOut_665_0;
                            break L154;
                          }
                        }
                        hd.field_b = stackIn_667_0 != 0;
                        break L153;
                      }
                    }
                  }
                  L155: {
                    if (gi.field_f != 48) {
                      break L155;
                    } else {
                      if (-3 >= (ph.field_D ^ -1)) {
                        hj.a(255, 0, 1);
                        break L155;
                      } else {
                        break L155;
                      }
                    }
                  }
                  if ((gi.field_f ^ -1) == -14) {
                    na.field_j = new ij((stellarshard) this);
                    tl.field_c = 0;
                    return;
                  } else {
                    continue L151;
                  }
                }
              }
            } else {
              break L150;
            }
          }
        }
        this.q(50);
        var2_int = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        L156: while (true) {
          if (var5 >= 1000) {
            L157: {
              if (!s.field_i) {
                break L157;
              } else {
                if (pk.a(-12663, 0)) {
                  L158: {
                    L159: {
                      if (null == a.field_h[0]) {
                        break L159;
                      } else {
                        if (0 != (a.field_h[0].field_m ^ -1)) {
                          break L159;
                        } else {
                          stackOut_720_0 = a.field_h[0];
                          stackIn_721_0 = stackOut_720_0;
                          if (stackIn_721_0.field_g > 0) {
                            break L159;
                          } else {
                            if (0 != nc.field_H) {
                              break L159;
                            } else {
                              stackOut_724_0 = 1;
                              stackIn_726_0 = stackOut_724_0;
                              break L158;
                            }
                          }
                        }
                      }
                    }
                    stackOut_725_0 = 0;
                    stackIn_726_0 = stackOut_725_0;
                    break L158;
                  }
                  L160: {
                    var5 = stackIn_726_0;
                    if (var5 == 0) {
                      pk.field_c = pk.field_c - 1;
                      if (-1 < (pk.field_c ^ -1)) {
                        L161: {
                          var6 = gh.field_b;
                          if ((var6 ^ -1) < -6) {
                            var6 = 5;
                            break L161;
                          } else {
                            break L161;
                          }
                        }
                        pk.field_c = 25 + var6 * 25;
                        var7 = 160 + -(var6 * 32);
                        if (-1 <= (var7 ^ -1)) {
                          break L160;
                        } else {
                          if (fe.field_e) {
                            ll.field_c.a(sb.field_e[46], var7, pk.field_h * 6);
                            break L160;
                          } else {
                            break L160;
                          }
                        }
                      } else {
                        break L160;
                      }
                    } else {
                      break L160;
                    }
                  }
                  gf.field_c = gf.field_c + 1;
                  var6_double = 1.7976931348623157e+308;
                  var8 = null;
                  var9 = 0;
                  L162: while (true) {
                    if ((var9 ^ -1) <= -1001) {
                      if (null == var8) {
                        break L157;
                      } else {
                        L163: {
                          var9 = 128;
                          if (var6_double <= 0.0) {
                            break L163;
                          } else {
                            var9 = (int)(2560.0 / var6_double);
                            break L163;
                          }
                        }
                        L164: {
                          if (-129 > (var9 ^ -1)) {
                            var9 = 128;
                            break L164;
                          } else {
                            break L164;
                          }
                        }
                        ag.field_a = ag.field_a + var9;
                        if (256 >= ag.field_a) {
                          break L157;
                        } else {
                          L165: {
                            if (fe.field_e) {
                              ll.field_c.a(sb.field_e[13], var9, pk.field_h * 64 / 50);
                              break L165;
                            } else {
                              break L165;
                            }
                          }
                          ag.field_a = 0;
                          break L157;
                        }
                      }
                    } else {
                      L166: {
                        var10 = a.field_h[var9];
                        if (var10 == null) {
                          break L166;
                        } else {
                          if (0 == (var10.field_m ^ -1)) {
                            break L166;
                          } else {
                            if (var10.a((byte) -102)) {
                              var11 = -(int)var10.field_a + var2_int;
                              var12 = var3 - (int)var10.field_l;
                              var13 = Math.sqrt((double)(var12 * var12 + var11 * var11));
                              if (var13 >= var6_double) {
                                break L166;
                              } else {
                                var6_double = var13;
                                var8 = var10;
                                break L166;
                              }
                            } else {
                              break L166;
                            }
                          }
                        }
                      }
                      var9++;
                      continue L162;
                    }
                  }
                } else {
                  break L157;
                }
              }
            }
            fb.field_b = fb.field_b - var2_int;
            tk.field_b = tk.field_b - var3;
            sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001 * (double)var3);
            ((stellarshard) this).field_H.a(sg.field_a, -125);
            sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.001 * (double)(-var2_int));
            ((stellarshard) this).field_H.a(sg.field_a, -126);
            var5 = 0;
            var6 = 0;
            L167: while (true) {
              if (var6 >= 12) {
                var5 = 0;
                L168: while (true) {
                  if (var5 >= 3000) {
                    var5 = 0;
                    L169: while (true) {
                      if (3000 <= var5) {
                        o.field_j = 0;
                        var5 = 0;
                        L170: while (true) {
                          if (var5 >= 1000) {
                            var5 = 0;
                            L171: while (true) {
                              if (var5 >= 1000) {
                                if (param0) {
                                  var5 = 0;
                                  L172: while (true) {
                                    if (-3001 >= (var5 ^ -1)) {
                                      L173: {
                                        if (qi.field_a < 10) {
                                          break L173;
                                        } else {
                                          if (-1 > (mk.field_k ^ -1)) {
                                            break L173;
                                          } else {
                                            if (!s.field_i) {
                                              break L173;
                                            } else {
                                              nc.field_A = nc.field_A - 1;
                                              if ((nc.field_A ^ -1) >= -1) {
                                                a.field_h[0] = null;
                                                this.k((byte) 97);
                                                break L173;
                                              } else {
                                                break L173;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L174: {
                                        if (50 != qi.field_a) {
                                          break L174;
                                        } else {
                                          if ((nc.field_A ^ -1) < -1) {
                                            nc.field_A = nc.field_A - 1;
                                            if ((nc.field_A ^ -1) < -1) {
                                              break L174;
                                            } else {
                                              a.field_h[0] = null;
                                              this.k((byte) 121);
                                              break L174;
                                            }
                                          } else {
                                            break L174;
                                          }
                                        }
                                      }
                                      L175: {
                                        if (qi.field_a < var4) {
                                          break L175;
                                        } else {
                                          L176: {
                                            if (-11 < (qi.field_a ^ -1)) {
                                              break L176;
                                            } else {
                                              if (mk.field_k <= 0) {
                                                break L175;
                                              } else {
                                                break L176;
                                              }
                                            }
                                          }
                                          if (na.field_j == null) {
                                            this.n(3);
                                            break L175;
                                          } else {
                                            break L175;
                                          }
                                        }
                                      }
                                      L177: {
                                        if (null == na.field_j) {
                                          break L177;
                                        } else {
                                          if (!s.field_i) {
                                            L178: while (true) {
                                              if (!qh.c(79)) {
                                                L179: {
                                                  if (null == na.field_j) {
                                                    break L179;
                                                  } else {
                                                    L180: {
                                                      if (-2 == (tl.field_c ^ -1)) {
                                                        if (((stellarshard) this).field_Q < 612) {
                                                          break L180;
                                                        } else {
                                                          if (628 <= ((stellarshard) this).field_Q) {
                                                            break L180;
                                                          } else {
                                                            if (((stellarshard) this).field_O < 176) {
                                                              break L180;
                                                            } else {
                                                              if (-193 >= (((stellarshard) this).field_O ^ -1)) {
                                                                break L180;
                                                              } else {
                                                                if (gh.field_c == 1) {
                                                                  n.field_L = 256;
                                                                  tl.field_c = 0;
                                                                  break L180;
                                                                } else {
                                                                  break L180;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        break L180;
                                                      }
                                                    }
                                                    L181: {
                                                      if (tl.field_c != 2) {
                                                        break L181;
                                                      } else {
                                                        L182: {
                                                          if ((((stellarshard) this).field_Q ^ -1) > -497) {
                                                            break L182;
                                                          } else {
                                                            if (512 <= ((stellarshard) this).field_Q) {
                                                              break L182;
                                                            } else {
                                                              if (208 > ((stellarshard) this).field_O) {
                                                                break L182;
                                                              } else {
                                                                if (-225 >= (((stellarshard) this).field_O ^ -1)) {
                                                                  break L182;
                                                                } else {
                                                                  if (-2 != (gh.field_c ^ -1)) {
                                                                    break L182;
                                                                  } else {
                                                                    tl.field_c = 0;
                                                                    gh.field_d = null;
                                                                    n.field_L = 256;
                                                                    break L182;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L183: {
                                                          if ((((stellarshard) this).field_Q ^ -1) > -249) {
                                                            break L183;
                                                          } else {
                                                            if ((((stellarshard) this).field_Q ^ -1) < -265) {
                                                              break L183;
                                                            } else {
                                                              if (460 > ((stellarshard) this).field_O) {
                                                                break L183;
                                                              } else {
                                                                if (-485 > (((stellarshard) this).field_O ^ -1)) {
                                                                  break L183;
                                                                } else {
                                                                  if (1 == gh.field_c) {
                                                                    si.field_X = si.field_X - 1;
                                                                    if (si.field_X - 1 < 0) {
                                                                      si.field_X = si.field_X + 3;
                                                                      break L183;
                                                                    } else {
                                                                      break L183;
                                                                    }
                                                                  } else {
                                                                    break L183;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        if (((stellarshard) this).field_Q < 376) {
                                                          break L181;
                                                        } else {
                                                          if ((((stellarshard) this).field_Q ^ -1) < -393) {
                                                            break L181;
                                                          } else {
                                                            if (460 > ((stellarshard) this).field_O) {
                                                              break L181;
                                                            } else {
                                                              if ((((stellarshard) this).field_O ^ -1) < -485) {
                                                                break L181;
                                                              } else {
                                                                if (-2 != (gh.field_c ^ -1)) {
                                                                  break L181;
                                                                } else {
                                                                  si.field_X = si.field_X + 1;
                                                                  if (-4 >= (si.field_X + 1 ^ -1)) {
                                                                    si.field_X = si.field_X - 3;
                                                                    break L181;
                                                                  } else {
                                                                    break L181;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L184: {
                                                      if (3 != tl.field_c) {
                                                        break L184;
                                                      } else {
                                                        if ((((stellarshard) this).field_Q ^ -1) > -497) {
                                                          break L184;
                                                        } else {
                                                          if ((((stellarshard) this).field_Q ^ -1) <= -513) {
                                                            break L184;
                                                          } else {
                                                            if (208 > ((stellarshard) this).field_O) {
                                                              break L184;
                                                            } else {
                                                              if ((((stellarshard) this).field_O ^ -1) <= -225) {
                                                                break L184;
                                                              } else {
                                                                if (-2 == (gh.field_c ^ -1)) {
                                                                  tl.field_c = 0;
                                                                  n.field_L = 256;
                                                                  if (!oc.field_d) {
                                                                    break L184;
                                                                  } else {
                                                                    tl.field_c = 2;
                                                                    oc.field_d = false;
                                                                    break L184;
                                                                  }
                                                                } else {
                                                                  break L184;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    na.field_j.a(true);
                                                    break L179;
                                                  }
                                                }
                                                return;
                                              } else {
                                                L185: {
                                                  if (null == na.field_j) {
                                                    break L185;
                                                  } else {
                                                    if (-14 != (gi.field_f ^ -1)) {
                                                      break L185;
                                                    } else {
                                                      L186: {
                                                        if ((tl.field_c ^ -1) == -3) {
                                                          break L186;
                                                        } else {
                                                          if ((tl.field_c ^ -1) == -2) {
                                                            break L186;
                                                          } else {
                                                            if (-4 != (tl.field_c ^ -1)) {
                                                              break L185;
                                                            } else {
                                                              break L186;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      n.field_L = 256;
                                                      tl.field_c = 0;
                                                      continue L178;
                                                    }
                                                  }
                                                }
                                                if (na.field_j != null) {
                                                  na.field_j.b(8);
                                                  continue L178;
                                                } else {
                                                  continue L178;
                                                }
                                              }
                                            }
                                          } else {
                                            break L177;
                                          }
                                        }
                                      }
                                      L187: {
                                        if (s.field_i) {
                                          break L187;
                                        } else {
                                          L188: {
                                            if ((wh.field_c ^ -1) < -2) {
                                              break L188;
                                            } else {
                                              if (ni.field_a) {
                                                break L187;
                                              } else {
                                                break L188;
                                              }
                                            }
                                          }
                                          L189: {
                                            na.field_j = new ij((stellarshard) this);
                                            if (!ni.field_a) {
                                              tl.field_c = 4;
                                              na.field_j.field_l = 8;
                                              break L189;
                                            } else {
                                              break L189;
                                            }
                                          }
                                          ni.field_a = false;
                                          break L187;
                                        }
                                      }
                                      return;
                                    } else {
                                      stackOut_809_0 = null;
                                      stackOut_809_1 = wk.field_b[var5];
                                      stackIn_810_0 = stackOut_809_0;
                                      stackIn_810_1 = stackOut_809_1;
                                      L190: {
                                        if (stackIn_810_0 != (Object) (Object) stackIn_810_1) {
                                          wk.field_b[var5].a(var3, var2_int, param0);
                                          break L190;
                                        } else {
                                          break L190;
                                        }
                                      }
                                      var5++;
                                      continue L172;
                                    }
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                L191: {
                                  if (null == a.field_h[var5]) {
                                    break L191;
                                  } else {
                                    a.field_h[var5].a((byte) -110, var2_int, var3);
                                    break L191;
                                  }
                                }
                                var5++;
                                continue L171;
                              }
                            }
                          } else {
                            L192: {
                              if (null != hf.field_e[var5]) {
                                hf.field_e[var5] = hf.field_e[var5].a(0);
                                o.field_j = o.field_j + 1;
                                break L192;
                              } else {
                                break L192;
                              }
                            }
                            var5++;
                            continue L170;
                          }
                        }
                      } else {
                        L193: {
                          if (null != wk.field_b[var5]) {
                            wk.field_b[var5] = wk.field_b[var5].a((byte) -126);
                            break L193;
                          } else {
                            break L193;
                          }
                        }
                        var5++;
                        continue L169;
                      }
                    }
                  } else {
                    stackOut_777_0 = wk.field_b[var5];
                    stackIn_778_0 = stackOut_777_0;
                    L194: {
                      if (stackIn_778_0 == null) {
                        break L194;
                      } else {
                        if (5 == wk.field_b[var5].field_f) {
                          wk.field_b[var5] = null;
                          break L194;
                        } else {
                          break L194;
                        }
                      }
                    }
                    var5++;
                    continue L168;
                  }
                }
              } else {
                L195: {
                  fk.field_k[var5] = fk.field_k[var5] + (-(var2_int << -887623772) + fk.field_k[var5 - -2]);
                  fk.field_k[1 + var5] = fk.field_k[1 + var5] + (fk.field_k[var5 - -3] - (var3 << 1176895620));
                  if (fk.field_k[var5] >= -2048) {
                    break L195;
                  } else {
                    fk.field_k[var5] = fk.field_k[var5] + 14336;
                    break L195;
                  }
                }
                L196: {
                  if ((fk.field_k[var5] ^ -1) >= -12289) {
                    break L196;
                  } else {
                    fk.field_k[var5] = fk.field_k[var5] - 14336;
                    break L196;
                  }
                }
                L197: {
                  if ((fk.field_k[1 + var5] ^ -1) > 2047) {
                    fk.field_k[1 + var5] = fk.field_k[1 + var5] + 11776;
                    break L197;
                  } else {
                    break L197;
                  }
                }
                L198: {
                  if ((fk.field_k[1 + var5] ^ -1) >= -9729) {
                    break L198;
                  } else {
                    fk.field_k[var5 + 1] = fk.field_k[var5 + 1] - 11776;
                    break L198;
                  }
                }
                var5 += 4;
                var6++;
                continue L167;
              }
            }
          } else {
            L199: {
              if (a.field_h[var5] == null) {
                break L199;
              } else {
                if (14 != a.field_h[var5].field_m) {
                  break L199;
                } else {
                  if ((var5 ^ -1) <= -1000) {
                    break L199;
                  } else {
                    L200: {
                      if (null == a.field_h[1 + var5]) {
                        break L200;
                      } else {
                        if ((a.field_h[1 + var5].field_m ^ -1) == -15) {
                          break L199;
                        } else {
                          break L200;
                        }
                      }
                    }
                    var6_ref_qe = a.field_h[var5];
                    a.field_h[var5] = a.field_h[1 + var5];
                    a.field_h[1 + var5] = var6_ref_qe;
                    break L199;
                  }
                }
              }
            }
            L201: {
              if (a.field_h[var5] == null) {
                break L201;
              } else {
                L202: {
                  if (a.field_h[var5].field_m == -1) {
                    var2_int = (int)a.field_h[var5].field_a;
                    var3 = (int)a.field_h[var5].field_l;
                    break L202;
                  } else {
                    if (a.field_h[var5].field_m == 11) {
                      break L202;
                    } else {
                      L203: {
                        var4++;
                        if (1 == a.field_h[var5].field_m) {
                          var4 += 2;
                          break L203;
                        } else {
                          break L203;
                        }
                      }
                      L204: {
                        if (a.field_h[var5].field_m != 5) {
                          break L204;
                        } else {
                          var4 += 2;
                          break L204;
                        }
                      }
                      L205: {
                        if (3 != a.field_h[var5].field_m) {
                          break L205;
                        } else {
                          var4 += 2;
                          break L205;
                        }
                      }
                      L206: {
                        if (7 != a.field_h[var5].field_m) {
                          break L206;
                        } else {
                          var4 += 4;
                          break L206;
                        }
                      }
                      L207: {
                        if (6 == a.field_h[var5].field_m) {
                          var4 += 4;
                          break L207;
                        } else {
                          break L207;
                        }
                      }
                      if ((a.field_h[var5].field_m ^ -1) == -15) {
                        var4 += 20;
                        break L202;
                      } else {
                        break L202;
                      }
                    }
                  }
                }
                a.field_h[var5] = a.field_h[var5].a(-95);
                break L201;
              }
            }
            var5++;
            continue L156;
          }
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_18_0 = null;
        String stackOut_17_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4_int = 0;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (!param1) {
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
                        var4_int += 4;
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2 == 6) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_T = 20;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!param0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4_int += 2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!param3) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = mh.field_h[var4_int];
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
                    return stackIn_18_0;
                }
                case 19: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var4, "stellarshard.EB(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(byte param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null != s.field_e) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        nd.a(-26621, (java.awt.Canvas) (Object) s.field_e);
                        s.field_e.a(ic.field_d, -101);
                        s.field_e = null;
                        qd.field_j.requestFocus();
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == ac.field_h) {
                            statePc = 8;
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
                        ac.field_h.e();
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 > 47) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        if (null == ka.field_m) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ka.field_m.e();
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
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
                case 14: {
                    try {
                        t.a(false);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.FA(" + param0 + 41);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stellarshard.r(50);
                        ni.a(-78);
                        eb.a(-1);
                        ob.a(30063);
                        rl.a((byte) -84);
                        rb.m(-12);
                        wg.a((byte) -107);
                        ac.b(-53);
                        be.a((byte) -20);
                        fe.a(31147);
                        ti.a();
                        pf.a(30300);
                        t.a(param0 ^ 6079);
                        wi.a((byte) -93);
                        ka.a((byte) -14);
                        ih.a(38858);
                        te.a((byte) -84);
                        hj.a(121);
                        ak.a(true);
                        wd.a((byte) 104);
                        ca.a(false);
                        qj.a((byte) -69);
                        hd.a((byte) -41);
                        nj.a(param0 ^ 49);
                        cj.a(0);
                        ed.a(param0 + 30);
                        bl.a(false);
                        sf.a(false);
                        ci.c(-1);
                        vi.b((byte) 82);
                        fj.a((byte) 59);
                        va.a((byte) 88);
                        jb.a(0);
                        vl.a(-118);
                        mb.a(false);
                        oj.a(true);
                        jj.a(param0 + 19045);
                        d.e();
                        ba.d();
                        ag.a((byte) 126);
                        gg.b((byte) -127);
                        fb.c(-2918);
                        rk.a(true);
                        vh.b((byte) 48);
                        fh.a((byte) 89);
                        jf.a(-15917);
                        ha.i(param0 + 244);
                        pk.a((byte) 96);
                        cc.b();
                        ie.e(-28692);
                        ah.a((byte) -31);
                        ra.b(-14755);
                        qf.a(-15967);
                        gf.a(-118);
                        bd.a();
                        de.a(4);
                        bf.a(2);
                        qd.b(54);
                        eh.a((byte) 5);
                        k.a((byte) 98);
                        h.a((byte) 45);
                        ei.g((byte) 77);
                        jg.e(true);
                        pg.m(7694);
                        ck.m(-121);
                        mj.l(120);
                        se.e((byte) 9);
                        la.a(param0 ^ -16);
                        lj.h(120);
                        am.b(param0 ^ 36);
                        hc.a(param0 ^ -21153);
                        lg.a(param0 ^ 69);
                        lh.a((byte) -16);
                        sl.a(-127);
                        wf.b(param0 + 227);
                        qh.a(param0 + -15392);
                        tj.a();
                        ad.c();
                        mi.a();
                        gk.a(param0 + 129);
                        fc.a((byte) 86);
                        tf.b(param0 + 22);
                        l.a(0);
                        nk.a((byte) 52);
                        o.a(1);
                        ve.a(-9746);
                        bi.e(0);
                        tk.a((byte) -86);
                        jd.a(-126);
                        ib.a(0);
                        ok.b((byte) -30);
                        if (param0 == -128) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((stellarshard) this).l((byte) 47);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
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
                case 5: {
                    try {
                        mf.a(119);
                        ue.b((byte) -99);
                        oe.a(0);
                        ua.a((byte) -50);
                        sk.a(true);
                        a.a(-3323);
                        qa.c();
                        vd.a(94);
                        kc.a(true);
                        wj.d((byte) 92);
                        al.b(param0 + 128);
                        ph.h(param0 ^ -15);
                        el.h(param0 + 186);
                        wc.a(true);
                        kb.a((byte) 37);
                        rh.a(param0 + 26);
                        ki.e(param0 + 16512);
                        na.b(124);
                        tg.b((byte) 0);
                        dj.a(4);
                        id.a(param0 + 1392322593);
                        wh.b(-1);
                        n.c((byte) -11);
                        fl.a(43);
                        ke.a(false);
                        ng.a((byte) -60);
                        eg.b(-89);
                        aa.a((byte) 77);
                        si.f(-16412);
                        sb.a((byte) 105);
                        hi.a((byte) -92);
                        e.a(186);
                        vj.a((byte) 104);
                        i.b(64);
                        j.a();
                        mg.a(true);
                        lb.a((byte) 122);
                        og.a((byte) 78);
                        bb.a(false);
                        tc.e(-64);
                        hh.a(25434);
                        df.b(11324);
                        vk.a((byte) 112);
                        rj.b(true);
                        ig.a(-8278);
                        dg.h(32);
                        ui.e((byte) -29);
                        g.d((byte) 109);
                        ug.c(param0 ^ -72);
                        q.a((byte) 84);
                        oc.a(0);
                        ch.a((byte) -56);
                        od.d((byte) 11);
                        cm.a(-118);
                        wk.a((byte) 31);
                        wa.b(0);
                        mc.a(17913);
                        dd.b(-26269);
                        pe.a(param0 ^ -126);
                        ce.a((byte) 125);
                        nl.a((byte) 64);
                        rc.d(23805);
                        mh.a(2188);
                        sc.b();
                        gh.a((byte) 125);
                        we.b((byte) 116);
                        pl.q(0);
                        ae.m(122);
                        wl.k(115);
                        nc.e(true);
                        ul.a(160);
                        rg.d(true);
                        ii.a((byte) 25);
                        cd.d((byte) 122);
                        nd.h(-94);
                        lk.d(67);
                        aj.a((byte) 101);
                        sj.e((byte) 23);
                        fg.g(param0 ^ -128);
                        nb.a((byte) 105);
                        dh.a();
                        sg.a(-29297);
                        pd.b((byte) 117);
                        sa.c(-17002);
                        ol.a(true);
                        dl.i(80);
                        of.d((byte) -120);
                        li.a((byte) 89);
                        ai.a(-1);
                        bg.a((byte) -117);
                        gj.d((byte) -66);
                        ld.g(param0 + 13566);
                        bc.b((byte) 55);
                        td.b((byte) -17);
                        ga.a((byte) 3);
                        s.a(false);
                        u.a(540);
                        b.b(true);
                        ll.b(512);
                        vg.c(-7392);
                        il.d(param0 ^ 5634);
                        kf.a((byte) 63);
                        oa.i(-80);
                        hk.a(false);
                        nf.a(65535);
                        uf.a((byte) 43);
                        fd.g(-30900);
                        ta.a(true);
                        vc.a(-1);
                        he.a((byte) -82);
                        kl.c((byte) -106);
                        af.a(54);
                        fk.a(param0 ^ -24024);
                        uc.a(-8749);
                        ml.a((byte) -102);
                        bk.a(-127);
                        th.a(-116);
                        fa.a(false);
                        vf.d(false);
                        bh.a((byte) -120);
                        nh.b(245);
                        hf.b(-27159);
                        ma.a((byte) 6);
                        mk.a((byte) -64);
                        le.a(param0 ^ 63);
                        uj.b(0);
                        ge.b(false);
                        lc.f(3988);
                        qb.g(21403);
                        ef.a(false);
                        kk.e((byte) -61);
                        ea.g((byte) 117);
                        rd.a((byte) -83);
                        ja.a((byte) -121);
                        cg.a(param0 + -26686);
                        ic.d((byte) 37);
                        wb.a(param0 ^ 61);
                        ((stellarshard) this).field_G = null;
                        ((stellarshard) this).field_H = null;
                        ((stellarshard) this).field_S = null;
                        ((stellarshard) this).field_C = null;
                        ((stellarshard) this).field_N = null;
                        ((stellarshard) this).field_P = null;
                        ((stellarshard) this).field_F = null;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.IA(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, byte param1) {
        pb var3 = null;
        pb[] var3_array = null;
        pb[] var4 = null;
        int var4_int = 0;
        pb var4_ref = null;
        ek[] var4_array = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        String var6 = null;
        int var6_int = 0;
        pb var7 = null;
        int[] var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        bj var10_ref = null;
        int var11 = 0;
        int stackIn_182_0 = 0;
        int stackOut_181_0 = 0;
        L0: {
          var11 = field_B;
          cl.a((byte) -70);
          if (!param0) {
            break L0;
          } else {
            sg.a(116, ke.field_b);
            break L0;
          }
        }
        if (mf.field_b == null) {
          if (bh.field_a != null) {
            if (null == cm.field_d[0]) {
              rd.a((byte) -127, 75.0f, ea.field_k);
              ((stellarshard) this).d(-20880);
              pb discarded$5 = qd.a(bh.field_a, "space", "", (byte) 42);
              pb discarded$6 = qd.a(bh.field_a, "nebula", "", (byte) 73);
              wh.field_e = ml.a("", (byte) 83, bh.field_a, "achievements_lrg");
              pg.field_hb = ml.a("", (byte) -88, bh.field_a, "explosion");
              hk.field_l = ml.a("", (byte) 107, bh.field_a, "titlepics");
              uf.field_g = qd.a(fc.field_a, "unachieved", "basic", (byte) 106);
              ce.field_a = qd.a(fc.field_a, "locked", "basic", (byte) 60);
              af.field_n = qd.a(fc.field_a, "orbcoin", "basic", (byte) 111);
              var4 = new pb[16];
              var4 = ml.a("", (byte) 85, bh.field_a, "powerups");
              var5 = 0;
              L1: while (true) {
                if (16 <= var5) {
                  var5 = 0;
                  L2: while (true) {
                    if (64 <= var5) {
                      pd.field_h.a((byte) -107);
                      cg.field_c = 0;
                      rg.g(-33);
                      return;
                    } else {
                      cm.field_d[var5] = new pb(96, 96);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  var3 = new pb(96, 96);
                  var3.e();
                  var4[var5].b(48, 48, 0, 4096);
                  e.field_g[var5] = var3;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (cg.field_c < 16) {
                L3: {
                  rd.a((byte) -47, (float)(80 + cg.field_c), ea.field_k);
                  ((stellarshard) this).d(-20880);
                  var3 = null;
                  var4_int = 0;
                  if (0 != cg.field_c) {
                    break L3;
                  } else {
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "asteroid_craters_2");
                    var4_int = 0;
                    break L3;
                  }
                }
                L4: {
                  var5 = 1500;
                  if (1 == cg.field_c) {
                    var4_int = 1;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "asteroid_craters_3");
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == cg.field_c) {
                    var4_int = 0;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "asteroid_iron_2");
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (3 == cg.field_c) {
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "asteroid_iron_3");
                    var4_int = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if ((cg.field_c ^ -1) == -5) {
                    var4_int = 0;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "asteroid_ice_2");
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (5 != cg.field_c) {
                    break L8;
                  } else {
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "asteroid_ice_3");
                    var4_int = 1;
                    break L8;
                  }
                }
                L9: {
                  if (cg.field_c != 6) {
                    break L9;
                  } else {
                    var4_int = 1;
                    var5 = 2000;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "shooter_hub");
                    break L9;
                  }
                }
                L10: {
                  if (cg.field_c != 7) {
                    break L10;
                  } else {
                    var5 = 2000;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "homer_hub");
                    var4_int = 1;
                    break L10;
                  }
                }
                L11: {
                  if ((cg.field_c ^ -1) != -9) {
                    break L11;
                  } else {
                    var5 = 2500;
                    var4_int = 2;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "asteroid_craters_1");
                    break L11;
                  }
                }
                L12: {
                  if (cg.field_c != 9) {
                    break L12;
                  } else {
                    var4_int = 2;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "asteroid_iron_1");
                    var5 = 2500;
                    break L12;
                  }
                }
                L13: {
                  if (-11 != (cg.field_c ^ -1)) {
                    break L13;
                  } else {
                    var5 = 2500;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "asteroid_ice_1");
                    var4_int = 2;
                    break L13;
                  }
                }
                L14: {
                  if (-12 == (cg.field_c ^ -1)) {
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "player");
                    var4_int = 3;
                    rh.field_b = (pa) (Object) var3;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (12 == cg.field_c) {
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "shooter");
                    var4_int = 4;
                    var5 = 2000;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (13 != cg.field_c) {
                    break L16;
                  } else {
                    var5 = 2000;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "homer");
                    var4_int = 2;
                    break L16;
                  }
                }
                L17: {
                  if ((cg.field_c ^ -1) == -15) {
                    var5 = 2500;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "gravity_well");
                    var4_int = 4;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (cg.field_c == 15) {
                    var5 = 2500;
                    var3 = (pb) (Object) pa.a(jf.field_m, "", "spinner");
                    var4_int = 4;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                var6_int = 0;
                L19: while (true) {
                  if (-129 >= (var6_int ^ -1)) {
                    L20: {
                      pd.field_h.a((byte) -107);
                      if ((cg.field_c ^ -1) != -16) {
                        break L20;
                      } else {
                        jf.field_n = ml.a("", (byte) 87, bh.field_a, "bar");
                        jf.field_m = null;
                        break L20;
                      }
                    }
                    cg.field_c = cg.field_c + 1;
                    rg.g(-33);
                    return;
                  } else {
                    L21: {
                      var7 = (pb) (Object) new pa((pa) (Object) var3, false, false, false, false);
                      var8_int = (int)(65536.0 * Math.cos(3.141592653589793 * (double)var6_int / 64.0));
                      var9 = (int)(65536.0 * Math.sin((double)var6_int * 3.141592653589793 / 64.0));
                      if (-4 < (var4_int ^ -1)) {
                        break L21;
                      } else {
                        ((pa) (Object) var7).a(new int[12]);
                        ((pa) (Object) var7).a(new int[12]);
                        break L21;
                      }
                    }
                    L22: {
                      ((pa) (Object) var7).a(new int[12]);
                      if (-4 >= (var4_int ^ -1)) {
                        break L22;
                      } else {
                        ((pa) (Object) var7).a(new int[12]);
                        ((pa) (Object) var7).a(new int[12]);
                        break L22;
                      }
                    }
                    L23: {
                      var10_ref = ((pa) (Object) var7).a(128, 341, 50, 50, -50);
                      if (1 != var4_int) {
                        break L23;
                      } else {
                        fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                        fe.field_d[cg.field_c][var6_int].e();
                        ti.f(0, 0, 96, 96, 0);
                        cc.a();
                        var10_ref.a(0, 0, 0, 0, 0, 0, var5, -1L);
                        fe.field_d[cg.field_c][var6_int].d();
                        break L23;
                      }
                    }
                    L24: {
                      if (0 == var4_int) {
                        fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                        fe.field_d[cg.field_c][var6_int].e();
                        ti.f(0, 0, 96, 96, 0);
                        cc.a();
                        var10_ref.a(0, 0, 0, 0, 0, 0, var5, -1L);
                        fe.field_d[cg.field_c][var6_int].d();
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      L26: {
                        if (-3 == (var4_int ^ -1)) {
                          break L26;
                        } else {
                          if ((var4_int ^ -1) != -5) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      rd.field_a[cg.field_c + -8][var6_int >> 1267709602] = new pb(96, 96);
                      rd.field_a[-8 + cg.field_c][var6_int >> 187928066].e();
                      ti.f(0, 0, 96, 96, 0);
                      cc.a();
                      var10_ref.a(0, 0, 0, 0, 0, 0, var5, -1L);
                      rd.field_a[-8 + cg.field_c][var6_int >> 1284941826].d();
                      break L25;
                    }
                    L27: {
                      if ((var4_int ^ -1) != -4) {
                        break L27;
                      } else {
                        cm.field_d[var6_int >> 1356809249] = new pb(96, 96);
                        cm.field_d[var6_int >> 1944614753].e();
                        ti.f(0, 0, 96, 96, 0);
                        cc.a();
                        var10_ref.a(0, 0, 0, 0, 0, 0, 2500, -1L);
                        cm.field_d[var6_int >> -875018111].d();
                        break L27;
                      }
                    }
                    var6_int++;
                    continue L19;
                  }
                }
              } else {
                if (null == l.field_f) {
                  rd.a((byte) -53, 98.0f, ua.field_g);
                  ((stellarshard) this).d(-20880);
                  fh.field_k = ml.a("", (byte) 98, bh.field_a, "slider");
                  fg.field_P = ml.a("", (byte) 124, bh.field_a, "frame");
                  fg.field_P[4] = null;
                  wc.field_s = qd.a(bh.field_a, "stel", "", (byte) 107);
                  pl.field_R = qd.a(bh.field_a, "lar", "", (byte) 93);
                  aa.field_b = qd.a(bh.field_a, "central_iceblock", "", (byte) 81);
                  pb[] discarded$7 = ml.a("", (byte) -32, bh.field_a, "menu");
                  rh.field_a = new pb[12];
                  var3 = null;
                  var4_int = 0;
                  L28: while (true) {
                    if (-13 >= (var4_int ^ -1)) {
                      fa.field_k = new pb[15];
                      var4_int = 0;
                      L29: while (true) {
                        if (var4_int >= 15) {
                          pb discarded$8 = qd.a(bh.field_a, "title", "", (byte) 119);
                          qj.field_a = ae.a("", "b12", bh.field_a, -115, be.field_d);
                          var4_array = new ek[7];
                          var5_ref_int__ = new int[7];
                          var6_int = 0;
                          L30: while (true) {
                            if (var6_int >= 7) {
                              var4_array[0] = el.a("keyboard_up", bh.field_a, (byte) -90, "");
                              var4_array[1] = el.a("keyboard_space", bh.field_a, (byte) -74, "");
                              var4_array[2] = el.a("keyboard_ctrl", bh.field_a, (byte) -123, "");
                              var4_array[3] = el.a("keyboard_esc", bh.field_a, (byte) 127, "");
                              var4_array[4] = el.a("keyboard_left", bh.field_a, (byte) -82, "");
                              var4_array[5] = el.a("keyboard_right", bh.field_a, (byte) -116, "");
                              var4_array[6] = el.a("keyboard_down", bh.field_a, (byte) 126, "");
                              qj.field_a.a((o[]) (Object) var4_array, var5_ref_int__);
                              l.field_f = ae.a("", "b122", bh.field_a, -117, be.field_d);
                              rg.g(-33);
                              return;
                            } else {
                              var5_ref_int__[var6_int] = 12;
                              var6_int++;
                              continue L30;
                            }
                          }
                        } else {
                          L31: {
                            if (var4_int == 0) {
                              var3_array = ml.a("", (byte) 121, bh.field_a, "anim_shine");
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (-4 == (var4_int ^ -1)) {
                              var3_array = ml.a("", (byte) 118, bh.field_a, "anim_shine2");
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            if (6 != var4_int) {
                              break L33;
                            } else {
                              var3_array = ml.a("", (byte) 110, bh.field_a, "anim_shine3");
                              break L33;
                            }
                          }
                          L34: {
                            if (9 == var4_int) {
                              var3_array = ml.a("", (byte) 83, bh.field_a, "anim_shine4");
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          L35: {
                            if ((var4_int ^ -1) == -13) {
                              var3_array = ml.a("", (byte) -25, bh.field_a, "anim_shine5");
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          fa.field_k[var4_int + 0] = var3_array[0];
                          fa.field_k[1 + var4_int] = var3_array[1];
                          fa.field_k[2 + var4_int] = var3_array[2];
                          fa.field_k[0 + var4_int].d();
                          fa.field_k[1 + var4_int].d();
                          fa.field_k[2 + var4_int].d();
                          var4_int += 3;
                          continue L29;
                        }
                      }
                    } else {
                      L36: {
                        if (var4_int != 0) {
                          break L36;
                        } else {
                          var3_array = ml.a("", (byte) 94, bh.field_a, "anim_shatter");
                          break L36;
                        }
                      }
                      L37: {
                        if (3 == var4_int) {
                          var3_array = ml.a("", (byte) 103, bh.field_a, "anim_shatter2");
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      L38: {
                        if ((var4_int ^ -1) != -7) {
                          break L38;
                        } else {
                          var3_array = ml.a("", (byte) -72, bh.field_a, "anim_shatter3");
                          break L38;
                        }
                      }
                      L39: {
                        if (-10 != (var4_int ^ -1)) {
                          break L39;
                        } else {
                          var3_array = ml.a("", (byte) 119, bh.field_a, "anim_shatter4");
                          break L39;
                        }
                      }
                      rh.field_a[var4_int - 0] = var3_array[0];
                      rh.field_a[var4_int + 1] = var3_array[1];
                      rh.field_a[2 + var4_int] = var3_array[2];
                      rh.field_a[var4_int + 0].d();
                      rh.field_a[1 + var4_int].d();
                      rh.field_a[2 + var4_int].d();
                      var4_int += 3;
                      continue L28;
                    }
                  }
                } else {
                  rd.a((byte) -65, 99.0f, ua.field_g);
                  ((stellarshard) this).d(-20880);
                  var3_array = ml.a("", (byte) 80, bh.field_a, "screenshots");
                  sd.a(qd.a(bh.field_a, "mbfg", "", (byte) 104), (byte) 60, "Stellar Shard");
                  ga.a(-8039, qd.a(bh.field_a, "smalllogo", "", (byte) 124));
                  te.a(8, 129, 1500, 0, qd.a(bh.field_a, "mbpb", "", (byte) 124), 40, 134, 97, 0);
                  q.a(118, var3_array);
                  ie.field_u = null;
                  fb.a(192, sg.field_c, 0, (java.applet.Applet) this, -1, 16777215);
                  var4_ref = new pb(128, 128);
                  mf.field_a = new pb[64];
                  var5 = 0;
                  L40: while (true) {
                    if ((var5 ^ -1) <= -5) {
                      be.field_d = null;
                      bh.field_a = null;
                      rg.g(-33);
                      return;
                    } else {
                      L41: {
                        var6 = null;
                        if (var5 != 0) {
                          break L41;
                        } else {
                          var6 = "stars2";
                          break L41;
                        }
                      }
                      L42: {
                        if (var5 != 1) {
                          break L42;
                        } else {
                          var6 = "stars3";
                          break L42;
                        }
                      }
                      L43: {
                        if ((var5 ^ -1) == -3) {
                          var6 = "stars0";
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      L44: {
                        if (3 != var5) {
                          break L44;
                        } else {
                          var6 = "stars1";
                          break L44;
                        }
                      }
                      var7 = n.a(qd.a(bh.field_a, var6, "", (byte) 42), (byte) -42, true);
                      var7.e();
                      ti.d(1, 1, 0, 0, 496, 496);
                      var8 = ti.field_a;
                      var9 = 0;
                      L45: while (true) {
                        if (var8.length <= var9) {
                          var9 = 0;
                          L46: while (true) {
                            if ((var9 ^ -1) <= -5) {
                              pd.field_h.a((byte) -107);
                              var5++;
                              continue L40;
                            } else {
                              stackOut_181_0 = 0;
                              stackIn_182_0 = stackOut_181_0;
                              var10 = stackIn_182_0;
                              L47: while (true) {
                                if (var10 >= 4) {
                                  var9++;
                                  continue L46;
                                } else {
                                  var4_ref.e();
                                  ti.d(2, 2, 126, 126);
                                  var7.e(2 + -var9 * 124, -var10 * 124 - -2);
                                  ti.d(0, 2, 1, 126);
                                  var4_ref.e(-2, 0);
                                  ti.d(1, 2, 2, 126);
                                  var4_ref.e(-1, 0);
                                  ti.d(127, 2, 128, 126);
                                  var4_ref.e(2, 0);
                                  ti.d(126, 2, 127, 126);
                                  var4_ref.e(1, 0);
                                  ti.d(0, 0, 128, 1);
                                  var4_ref.e(0, -2);
                                  ti.d(0, 1, 128, 2);
                                  var4_ref.e(0, -1);
                                  ti.d(0, 127, 128, 128);
                                  var4_ref.e(0, 2);
                                  ti.d(0, 126, 128, 127);
                                  var4_ref.e(0, 1);
                                  mf.field_a[var9 + var10 * 4 + var5 * 16] = var4_ref.a();
                                  var10++;
                                  continue L47;
                                }
                              }
                            }
                          }
                        } else {
                          L48: {
                            if ((var8[var9] ^ -1) == -1) {
                              var8[var9] = 1;
                              break L48;
                            } else {
                              break L48;
                            }
                          }
                          var9++;
                          continue L45;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            L49: {
              rd.a((byte) -60, 100.0f, ve.field_b);
              ((stellarshard) this).d(-20880);
              kl.field_k = 16777215;
              ul.field_G = 10742263;
              if (param1 < -60) {
                break L49;
              } else {
                int discarded$9 = ((stellarshard) this).a(70, -17);
                break L49;
              }
            }
            L50: {
              vf.field_L = fe.field_c;
              lg.field_b = 5883647;
              aj.a(50, 11236);
              ef.a(50, (byte) 63);
              fe.field_c = new d(oe.field_a);
              if (vf.field_L != null) {
                nj.field_o.b((p) (Object) vf.field_L);
                vf.field_L.c();
                nj.field_o.a((p) (Object) vf.field_L);
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              vf.field_L = fe.field_c;
              nj.field_o.a((p) (Object) vf.field_L);
              vf.field_L.d(ai.field_c / 2);
              if (ah.a(-1)) {
                break L51;
              } else {
                be.field_g = ab.a(-5094, 4);
                wh.a(-124);
                break L51;
              }
            }
            hf.field_f = true;
            rg.g(-33);
            return;
          }
        } else {
          L52: {
            if (!wk.field_a.a((byte) -36)) {
              break L52;
            } else {
              if (!wk.field_a.c((byte) -111)) {
                break L52;
              } else {
                L53: {
                  if (!mf.field_b.a((byte) -36)) {
                    break L53;
                  } else {
                    if (mf.field_b.c((byte) -111)) {
                      L54: {
                        if (!ka.field_n.a((byte) -36)) {
                          break L54;
                        } else {
                          if (ka.field_n.c((byte) -111)) {
                            L55: {
                              if (!bh.field_a.a((byte) -36)) {
                                break L55;
                              } else {
                                if (!bh.field_a.c((byte) -111)) {
                                  break L55;
                                } else {
                                  L56: {
                                    if (!fc.field_a.a((byte) -36)) {
                                      break L56;
                                    } else {
                                      if (!fc.field_a.a("basic", (byte) -109)) {
                                        break L56;
                                      } else {
                                        L57: {
                                          if (!be.field_d.a((byte) -36)) {
                                            break L57;
                                          } else {
                                            if (be.field_d.c((byte) -111)) {
                                              L58: {
                                                if (!jf.field_m.a((byte) -36)) {
                                                  break L58;
                                                } else {
                                                  if (jf.field_m.c((byte) -111)) {
                                                    rd.a((byte) -72, 70.0f, ve.field_b);
                                                    if (param0) {
                                                      L59: {
                                                        hi.b((byte) 109);
                                                        ((stellarshard) this).d(-20880);
                                                        var3 = (pb) (Object) new qh(22050, ba.field_m);
                                                        if (pk.a(-12663, 0)) {
                                                          sb.field_e = new ud[61];
                                                          break L59;
                                                        } else {
                                                          sb.field_e = new ud[41];
                                                          break L59;
                                                        }
                                                      }
                                                      L60: {
                                                        sb.field_e[0] = kj.a(wk.field_a, "", "afterburner").a().a((qh) (Object) var3);
                                                        sb.field_e[1] = kj.a(wk.field_a, "", "bounce-gun").a().a((qh) (Object) var3);
                                                        sb.field_e[2] = kj.a(wk.field_a, "", "collision_asteroid").a().a((qh) (Object) var3);
                                                        sb.field_e[3] = kj.a(wk.field_a, "", "collision_ice").a().a((qh) (Object) var3);
                                                        sb.field_e[4] = kj.a(wk.field_a, "", "collision_iron").a().a((qh) (Object) var3);
                                                        sb.field_e[5] = kj.a(wk.field_a, "", "combined-homer_loop_1000ms").a().a((qh) (Object) var3);
                                                        sb.field_e[6] = kj.a(wk.field_a, "", "combined-shooter_loop_1000ms").a().a((qh) (Object) var3);
                                                        sb.field_e[7] = kj.a(wk.field_a, "", "dual-laser_loop_100ms").a().a((qh) (Object) var3);
                                                        sb.field_e[8] = kj.a(wk.field_a, "", "enemy_shoot").a().a((qh) (Object) var3);
                                                        sb.field_e[9] = kj.a(wk.field_a, "", "explosion_asteroid_large").a().a((qh) (Object) var3);
                                                        sb.field_e[10] = kj.a(wk.field_a, "", "explosion_asteroid_medium").a().a((qh) (Object) var3);
                                                        sb.field_e[11] = kj.a(wk.field_a, "", "explosion_asteroid_small").a().a((qh) (Object) var3);
                                                        sb.field_e[12] = kj.a(wk.field_a, "", "explosion_enemy").a().a((qh) (Object) var3);
                                                        sb.field_e[13] = kj.a(wk.field_a, "", "explosion_ice_large").a().a((qh) (Object) var3);
                                                        sb.field_e[14] = kj.a(wk.field_a, "", "explosion_ice_medium").a().a((qh) (Object) var3);
                                                        sb.field_e[15] = kj.a(wk.field_a, "", "explosion_ice_small").a().a((qh) (Object) var3);
                                                        sb.field_e[16] = kj.a(wk.field_a, "", "explosion_iron_large").a().a((qh) (Object) var3);
                                                        sb.field_e[17] = kj.a(wk.field_a, "", "explosion_iron_medium").a().a((qh) (Object) var3);
                                                        sb.field_e[18] = kj.a(wk.field_a, "", "explosion_iron_small").a().a((qh) (Object) var3);
                                                        sb.field_e[19] = kj.a(wk.field_a, "", "explosion_player").a().a((qh) (Object) var3);
                                                        sb.field_e[20] = kj.a(wk.field_a, "", "flame-cannon_loop_300-500ms").a().a((qh) (Object) var3);
                                                        sb.field_e[21] = kj.a(wk.field_a, "", "heavy-cannon").a().a((qh) (Object) var3);
                                                        sb.field_e[22] = kj.a(wk.field_a, "", "hex-cannon_70ms_loop").a().a((qh) (Object) var3);
                                                        sb.field_e[23] = kj.a(wk.field_a, "", "homing_loop_200ms").a().a((qh) (Object) var3);
                                                        sb.field_e[24] = kj.a(wk.field_a, "", "laser_70ms_loop").a().a((qh) (Object) var3);
                                                        sb.field_e[25] = kj.a(wk.field_a, "", "mega-laser_loop_500ms").a().a((qh) (Object) var3);
                                                        sb.field_e[26] = kj.a(wk.field_a, "", "mine_loop_200ms").a().a((qh) (Object) var3);
                                                        sb.field_e[27] = kj.a(wk.field_a, "", "narrowgun").a().a((qh) (Object) var3);
                                                        sb.field_e[28] = kj.a(wk.field_a, "", "nuke_explosion").a().a((qh) (Object) var3);
                                                        sb.field_e[29] = kj.a(wk.field_a, "", "powerup_invulnerability").a().a((qh) (Object) var3);
                                                        sb.field_e[30] = kj.a(wk.field_a, "", "powerup_phase_shield").a().a((qh) (Object) var3);
                                                        sb.field_e[31] = kj.a(wk.field_a, "", "powerup_shield").a().a((qh) (Object) var3);
                                                        sb.field_e[32] = kj.a(wk.field_a, "", "powerup_weapon").a().a((qh) (Object) var3);
                                                        sb.field_e[33] = kj.a(wk.field_a, "", "quad-cannon").a().a((qh) (Object) var3);
                                                        sb.field_e[34] = kj.a(wk.field_a, "", "super-cannon").a().a((qh) (Object) var3);
                                                        sb.field_e[35] = kj.a(wk.field_a, "", "thruster").a().a((qh) (Object) var3);
                                                        sb.field_e[36] = kj.a(wk.field_a, "", "title_explosion").a().a((qh) (Object) var3);
                                                        sb.field_e[37] = kj.a(wk.field_a, "", "title_shinesound").a().a((qh) (Object) var3);
                                                        sb.field_e[38] = kj.a(wk.field_a, "", "trigun").a().a((qh) (Object) var3);
                                                        sb.field_e[39] = kj.a(wk.field_a, "", "wavegun").a().a((qh) (Object) var3);
                                                        sb.field_e[40] = kj.a(wk.field_a, "", "hit").a().a((qh) (Object) var3);
                                                        if (pk.a(-12663, 0)) {
                                                          sb.field_e[41] = kj.a(wk.field_a, "", "collect_ghost").a().a((qh) (Object) var3);
                                                          sb.field_e[42] = kj.a(wk.field_a, "", "eerie_creak1").a().a((qh) (Object) var3);
                                                          sb.field_e[43] = kj.a(wk.field_a, "", "eerie_creak2").a().a((qh) (Object) var3);
                                                          sb.field_e[44] = kj.a(wk.field_a, "", "eerie_creak3").a().a((qh) (Object) var3);
                                                          sb.field_e[45] = kj.a(wk.field_a, "", "eerie_creak4").a().a((qh) (Object) var3);
                                                          sb.field_e[46] = ad.a(mf.field_b, "", "heartbeat").b().a((qh) (Object) var3);
                                                          sb.field_e[47] = kj.a(wk.field_a, "", "howling1").a().a((qh) (Object) var3);
                                                          sb.field_e[48] = kj.a(wk.field_a, "", "howling2").a().a((qh) (Object) var3);
                                                          sb.field_e[49] = kj.a(wk.field_a, "", "howling3").a().a((qh) (Object) var3);
                                                          sb.field_e[50] = kj.a(wk.field_a, "", "howling4").a().a((qh) (Object) var3);
                                                          sb.field_e[51] = kj.a(wk.field_a, "", "static2").a().a((qh) (Object) var3);
                                                          sb.field_e[52] = kj.a(wk.field_a, "", "static3").a().a((qh) (Object) var3);
                                                          sb.field_e[53] = kj.a(wk.field_a, "", "static4").a().a((qh) (Object) var3);
                                                          sb.field_e[54] = kj.a(wk.field_a, "", "trans1").a().a((qh) (Object) var3);
                                                          sb.field_e[55] = kj.a(wk.field_a, "", "trans2").a().a((qh) (Object) var3);
                                                          sb.field_e[56] = kj.a(wk.field_a, "", "trans3").a().a((qh) (Object) var3);
                                                          sb.field_e[57] = ad.a(mf.field_b, "", "cyber_laugh1").b().a((qh) (Object) var3);
                                                          sb.field_e[58] = ad.a(mf.field_b, "", "cyber_laugh2").b().a((qh) (Object) var3);
                                                          sb.field_e[59] = ad.a(mf.field_b, "", "cyber_laugh4").b().a((qh) (Object) var3);
                                                          sb.field_e[60] = ad.a(mf.field_b, "", "cyber_laugh5_rev").b().a((qh) (Object) var3);
                                                          break L60;
                                                        } else {
                                                          break L60;
                                                        }
                                                      }
                                                      L61: {
                                                        var4_ref = (pb) (Object) new gk(wk.field_a, mf.field_b);
                                                        wk.field_a = null;
                                                        mf.field_b = null;
                                                        if (!pk.a(-12663, 0)) {
                                                          oe.field_a = ij.a(576, (gk) (Object) var4_ref, "music/Stellar_Shard_ingame", ka.field_n, "");
                                                          break L61;
                                                        } else {
                                                          oe.field_a = ij.a(576, (gk) (Object) var4_ref, "music/Stellar_Shard_Halloween", ka.field_n, "");
                                                          break L61;
                                                        }
                                                      }
                                                      ka.field_n = null;
                                                      rg.g(-33);
                                                      return;
                                                    } else {
                                                      return;
                                                    }
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                              rd.a((byte) -115, 60.0f, ak.a("", he.field_o, jf.field_m, (byte) 51, lj.field_B));
                                              return;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        rd.a((byte) -105, 50.0f, ak.a("", mb.field_c, be.field_d, (byte) 51, le.field_l));
                                        return;
                                      }
                                    }
                                  }
                                  rd.a((byte) -96, 40.0f, ak.a("basic", lg.field_e, fc.field_a, (byte) 51, am.field_e));
                                  return;
                                }
                              }
                            }
                            rd.a((byte) -89, 30.0f, ak.a("", lg.field_e, bh.field_a, (byte) 51, am.field_e));
                            return;
                          } else {
                            break L54;
                          }
                        }
                      }
                      rd.a((byte) -63, 20.0f, ak.a("", qh.field_f, ka.field_n, (byte) 51, qd.field_e));
                      return;
                    } else {
                      break L53;
                    }
                  }
                }
                rd.a((byte) -90, 10.0f, ak.a("", qh.field_f, mf.field_b, (byte) 51, qd.field_e));
                return;
              }
            }
          }
          rd.a((byte) -71, 8.0f, ak.a("", ma.field_o, wk.field_a, (byte) 51, hc.field_k));
          return;
        }
    }

    private final void n(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var2_array = null;
        fk var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_63_0 = false;
        boolean stackIn_86_0 = false;
        boolean stackIn_94_0 = false;
        int stackIn_219_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        boolean stackOut_62_0 = false;
        boolean stackOut_85_0 = false;
        boolean stackOut_93_0 = false;
        int stackOut_218_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_U[8] = field_U[8] + 1;
                        if (5 >= field_U[8]) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_U[8] = 5;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        cl.field_a = cl.field_a + si.field_gb;
                        gg.field_i = gg.field_i + 1;
                        lg.field_f = lg.field_f - 127;
                        hk.field_p = hk.field_p + 127;
                        if (7 != e.field_e) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        vh.field_e = vh.field_e + 1;
                        if (vh.field_e != 5) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        hj.a(255, 0, 1);
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
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((e.field_e ^ -1) != -9) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        sf.field_b = sf.field_b + 1;
                        if ((sf.field_b ^ -1) != -6) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        hj.a(253, 2, 1);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((e.field_e ^ -1) == -10) {
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
                        statePc = 26;
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
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        sj.field_K = sj.field_K + 1;
                        if (sj.field_K == 5) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        hj.a(252, 3, 1);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (e.field_e == 10) {
                            statePc = 29;
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
                        statePc = 33;
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
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ua.field_d = ua.field_d + 1;
                        if ((ua.field_d ^ -1) == -6) {
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
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        hj.a(251, 4, 1);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        qi.field_a = qi.field_a + 1;
                        if (e.field_e == -1) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        field_U[0] = 5;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((qi.field_a ^ -1) < (-1 + mg.field_t ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var2_int = of.field_A;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        of.field_A = Math.max(qi.field_a, of.field_A);
                        if ((of.field_A ^ -1) < -51) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        of.field_A = 50;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var3_ref = new fk(0, -1 + qi.field_a, 0, 0, 0, 0);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (ah.a(-1)) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        hf.a(var3_ref, 89, 5);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        tf.field_a.b(-113, (gg) (Object) var3_ref);
                        of.field_A = var2_int;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (10 > qi.field_a) {
                            statePc = 69;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = -1;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 > (nc.field_A ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = -1;
                        stackIn_59_0 = stackOut_58_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (stackIn_59_0 > (mk.field_k ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = s.field_i;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (!stackIn_63_0) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        nc.field_A = 1500;
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
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (null == ((stellarshard) this).field_F) {
                            statePc = 72;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        ((stellarshard) this).field_F = new pb(640, 480);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (-51 <= (qi.field_a ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        qi.field_a = 50;
                        if (-1 <= (nc.field_A ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        nc.field_A = 1500;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if ((qi.field_a ^ -1) != -2) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ((stellarshard) this).field_J = 100;
                        statePc = 82;
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
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (10 != qi.field_a) {
                            statePc = 92;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = nf.field_r;
                        stackIn_86_0 = stackOut_85_0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (!stackIn_86_0) {
                            statePc = 92;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        hj.a(249, 6, 1);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (-21 != (qi.field_a ^ -1)) {
                            statePc = 100;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = nf.field_r;
                        stackIn_94_0 = stackOut_93_0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        hj.a(248, 7, 1);
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (-11 != (qi.field_a ^ -1)) {
                            statePc = 107;
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
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (30 != qi.field_a) {
                            statePc = 114;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (-51 != (qi.field_a ^ -1)) {
                            statePc = 121;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var2_array = new int[16];
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (-2 != (qi.field_a ^ -1)) {
                            statePc = 126;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var2_array[1] = 4;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 125;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (2 != qi.field_a) {
                            statePc = 130;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var2_array[1] = 6;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (qi.field_a != param0) {
                            statePc = 134;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var2_array[1] = 4;
                        var2_array[3] = 4;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (qi.field_a == 6) {
                            statePc = 137;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 136;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        var2_array[5] = 6;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (qi.field_a != 4) {
                            statePc = 142;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var2_array[13] = 2;
                        var2_array[1] = 8;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (-6 == (qi.field_a ^ -1)) {
                            statePc = 145;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var2_array[12] = 2;
                        var2_array[3] = 8;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if ((qi.field_a ^ -1) == -9) {
                            statePc = 149;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var2_array[5] = 8;
                        var2_array[7] = 1;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if ((qi.field_a ^ -1) != -8) {
                            statePc = 154;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var2_array[15] = 2;
                        var2_array[1] = 10;
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if ((qi.field_a ^ -1) != -10) {
                            statePc = 158;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        var2_array[6] = 1;
                        var2_array[3] = 8;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (qi.field_a != 10) {
                            statePc = 162;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        var2_array[14] = 1;
                        var2_array[1] = 5;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        if (10 < qi.field_a) {
                            statePc = 165;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (qi.field_a % 10 == 1) {
                            statePc = 168;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        var2_array[1] = qi.field_a / 2 - -5;
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        if (4 == qi.field_a % 10) {
                            statePc = 172;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 171;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        var2_array[15] = qi.field_a / 10 - -1;
                        var2_array[5] = qi.field_a / 3 - -5;
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        if (3 == qi.field_a % 10) {
                            statePc = 176;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 175;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var2_array[12] = qi.field_a / 5;
                        var2_array[3] = 5 + qi.field_a / 3;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        if ((qi.field_a % 10 ^ -1) == -3) {
                            statePc = 180;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 179;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 179;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        var2_array[1] = 5 + qi.field_a / 3;
                        var2_array[13] = qi.field_a / 5;
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (qi.field_a % 10 == 5) {
                            statePc = 184;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 183;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        var2_array[1] = qi.field_a / 4 + 3;
                        var2_array[14] = 1;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if ((qi.field_a % 10 ^ -1) == -8) {
                            statePc = 188;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 187;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        var2_array[6] = qi.field_a / 10;
                        var2_array[5] = qi.field_a / 3 - -5;
                        var2_array[12] = qi.field_a / 5;
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        if (6 == qi.field_a % 10) {
                            statePc = 192;
                        } else {
                            statePc = 190;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        var2_array[7] = qi.field_a / 10;
                        var2_array[13] = qi.field_a / 5;
                        var2_array[3] = qi.field_a / 3 - -5;
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (8 != qi.field_a % 10) {
                            statePc = 197;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        var2_array[15] = qi.field_a / 6;
                        var2_array[1] = qi.field_a / 4 + 3;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        if (qi.field_a % 10 != 9) {
                            statePc = 201;
                        } else {
                            statePc = 198;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        var2_array[3] = qi.field_a / 6;
                        var2_array[1] = qi.field_a / 6;
                        var2_array[5] = qi.field_a / 6;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 200;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        statePc = 201;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        if (-21 == (qi.field_a ^ -1)) {
                            statePc = 204;
                        } else {
                            statePc = 202;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        var2_array[14] = 1;
                        var2_array[7] = 10;
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        if (-31 != (qi.field_a ^ -1)) {
                            statePc = 209;
                        } else {
                            statePc = 206;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        var2_array[14] = 2;
                        var2_array[6] = 10;
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        if (qi.field_a != 40) {
                            statePc = 213;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        var2_array[14] = 4;
                        var2_array[6] = 5;
                        var2_array[7] = 5;
                        var2_array[15] = 5;
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 212;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (qi.field_a != 50) {
                            statePc = 217;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        var2_array[14] = qi.field_a / 5;
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        if (-1 != (qi.field_a % 10 ^ -1)) {
                            statePc = 225;
                        } else {
                            statePc = 218;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        stackOut_218_0 = qi.field_a;
                        stackIn_219_0 = stackOut_218_0;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        if ((stackIn_219_0 ^ -1) >= -51) {
                            statePc = 225;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        var2_array[14] = qi.field_a / 5;
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        var3 = 0;
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        if ((var3 ^ -1) <= -17) {
                            statePc = 235;
                        } else {
                            statePc = 227;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        var4 = 0;
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        if ((var4 ^ -1) <= (var2_array[var3] ^ -1)) {
                            statePc = 232;
                        } else {
                            statePc = 229;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        a.field_h[pl.e((byte) 63)] = new qe(var3);
                        var4++;
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        var3++;
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 234: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.FB(" + param0 + 41);
                }
                case 235: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void l(byte param0) {
        RuntimeException var2 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_20_3 = null;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_19_3 = null;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 < -107) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((stellarshard) this).field_H = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 <= (mk.field_k ^ -1)) {
                            statePc = 14;
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
                        if (!lh.a(ic.field_d, (byte) 115)) {
                            statePc = 14;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        s.field_e = wb.a(0, -107, 480, ic.field_d, 640, 0);
                        if (null != s.field_e) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        nc.a((java.awt.Canvas) (Object) s.field_e, (byte) 121);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = qj.field_a.field_N;
                        stackOut_14_1 = 0;
                        stackOut_14_2 = l.field_f.field_N;
                        stackIn_27_0 = stackOut_14_0;
                        stackIn_27_1 = stackOut_14_1;
                        stackIn_27_2 = stackOut_14_2;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        if (ah.a(-1)) {
                            statePc = 27;
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
                        stackOut_15_0 = stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = stackIn_15_2;
                        stackOut_15_3 = mk.field_k;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        stackIn_16_3 = stackOut_15_3;
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
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = stackIn_16_2;
                        stackIn_26_0 = stackOut_16_0;
                        stackIn_26_1 = stackOut_16_1;
                        stackIn_26_2 = stackOut_16_2;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        if (stackIn_16_3 <= 0) {
                            statePc = 26;
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
                        stackOut_17_0 = stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = stackIn_17_2;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
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
                        stackOut_19_0 = stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = null;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        stackIn_20_3 = stackOut_19_3;
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
                        stackOut_20_0 = stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackIn_25_0 = stackOut_20_0;
                        stackIn_25_1 = stackOut_20_1;
                        stackIn_25_2 = stackOut_20_2;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        if (stackIn_20_3 == (Object) (Object) s.field_e) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = stackIn_21_0;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = stackIn_21_2;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = stackIn_23_0;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = 2;
                        stackIn_28_0 = stackOut_23_0;
                        stackIn_28_1 = stackOut_23_1;
                        stackIn_28_2 = stackOut_23_2;
                        stackIn_28_3 = stackOut_23_3;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = stackIn_25_0;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = 3;
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        stackIn_28_3 = stackOut_25_3;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = stackIn_26_0;
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = stackIn_26_2;
                        stackOut_26_3 = 1;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        stackIn_28_2 = stackOut_26_2;
                        stackIn_28_3 = stackOut_26_3;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = stackIn_27_0;
                        stackOut_27_1 = stackIn_27_1;
                        stackOut_27_2 = stackIn_27_2;
                        stackOut_27_3 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        stackIn_28_2 = stackOut_27_2;
                        stackIn_28_3 = stackOut_27_3;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        vf.a(stackIn_28_0, stackIn_28_1, stackIn_28_2, stackIn_28_3, (pb[]) null, 320, (bd) (Object) qj.field_a, 8, (pb[]) null, 8, 8 + qj.field_a.field_N, l.field_f.field_N, 260, true, 240, (bd) (Object) l.field_f);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.WA(" + param0 + 41);
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          stackOut_0_0 = param0 & param1;
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return 0L;
    }

    final void d(int param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6_int = 0;
        String var6 = null;
        jf var6_ref = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_82_0 = null;
        int stackIn_91_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_359_0 = 0;
        Object stackIn_363_0 = null;
        va stackOut_2_0 = null;
        java.awt.Canvas stackOut_1_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        boolean stackOut_6_2 = false;
        int stackOut_358_0 = 0;
        boolean stackOut_357_0 = false;
        java.awt.Canvas stackOut_362_0 = null;
        va stackOut_361_0 = null;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        Object stackOut_81_0 = null;
        Object stackOut_58_0 = null;
        L0: {
          var20 = field_B;
          if (s.field_e != null) {
            stackOut_2_0 = s.field_e;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = qd.field_j;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (ee.b(93)) {
          L1: {
            stackOut_5_0 = var2;
            stackOut_5_1 = -11;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (s.field_e != null) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = ua.field_b;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2 ? 1 : 0;
              break L1;
            }
          }
          rl.a((java.awt.Canvas) (Object) stackIn_8_0, stackIn_8_1, stackIn_8_2 != 0);
          return;
        } else {
          if (hf.field_f) {
            if (null == be.field_g) {
              if (null == gg.field_f) {
                L2: {
                  if (null != ((stellarshard) this).field_F) {
                    var3 = 0;
                    var4 = -((stellarshard) this).field_F.field_z.length;
                    L3: while (true) {
                      if (-1 >= (var4 ^ -1)) {
                        break L2;
                      } else {
                        var3++;
                        ((stellarshard) this).field_F.field_z[var3] = pd.field_h.field_e[var3];
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (null != na.field_j) {
                    break L4;
                  } else {
                    if (s.field_i) {
                      break L4;
                    } else {
                      L5: {
                        if ((wh.field_c ^ -1) < -2) {
                          break L5;
                        } else {
                          if (ni.field_a) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        na.field_j = new ij((stellarshard) this);
                        if (!ni.field_a) {
                          tl.field_c = 4;
                          na.field_j.field_l = 8;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ni.field_a = false;
                      break L4;
                    }
                  }
                }
                L7: {
                  if (0 > fb.field_b) {
                    fb.field_b = fb.field_b + 640;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (0 > tk.field_b) {
                    tk.field_b = tk.field_b + 480;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (fb.field_b >= 640) {
                    fb.field_b = fb.field_b - 640;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (tk.field_b < 480) {
                    break L10;
                  } else {
                    tk.field_b = tk.field_b - 480;
                    break L10;
                  }
                }
                L11: {
                  this.p(param0 ^ -20914);
                  if (null == ((stellarshard) this).field_F) {
                    break L11;
                  } else {
                    if ((el.field_I ^ -1) >= -1) {
                      break L11;
                    } else {
                      if (na.field_j == null) {
                        ((stellarshard) this).field_F.e(0, 0, 5 * el.field_I);
                        if (s.field_i) {
                          break L11;
                        } else {
                          el.field_I = el.field_I - 1;
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                L12: {
                  var3 = 0;
                  if (param0 == -20880) {
                    break L12;
                  } else {
                    String discarded$8 = stellarshard.a(true, false, -57, true);
                    break L12;
                  }
                }
                var4 = 0;
                L13: while (true) {
                  if (var4 >= 12) {
                    var3 = 0;
                    L14: while (true) {
                      if ((var3 ^ -1) <= -1001) {
                        L15: {
                          if (((stellarshard) this).field_G == null) {
                            ((stellarshard) this).field_G = new pb(640, 480);
                            break L15;
                          } else {
                            ((stellarshard) this).field_G.e();
                            ti.f(0, 0, 640, 480, 0);
                            pd.field_h.a((byte) -107);
                            break L15;
                          }
                        }
                        var3 = 0;
                        L16: while (true) {
                          if (var3 >= 3000) {
                            var3 = 0;
                            L17: while (true) {
                              if (1000 <= var3) {
                                var3 = 0;
                                var3 = var3 + ((stellarshard) this).field_G.field_t;
                                var5_int = 0;
                                L18: while (true) {
                                  if (((stellarshard) this).field_G.field_y <= var5_int) {
                                    ((stellarshard) this).field_G.d(0, 0, 255);
                                    var5_int = 0;
                                    L19: while (true) {
                                      if (1000 <= var5_int) {
                                        var5_int = 4;
                                        var6_int = 1;
                                        L20: while (true) {
                                          if (var6_int >= 12) {
                                            L21: {
                                              if (!pk.a(param0 ^ 24825, 0)) {
                                                break L21;
                                              } else {
                                                if (s.field_i) {
                                                  L22: {
                                                    if ((ag.field_a ^ -1) >= -1) {
                                                      break L22;
                                                    } else {
                                                      if (128 <= ag.field_a) {
                                                        break L22;
                                                      } else {
                                                        ti.e(10, 330, 4, 16711680);
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  L23: {
                                                    if ((ag.field_a ^ -1) >= -1) {
                                                      break L23;
                                                    } else {
                                                      if (-129 < (ag.field_a ^ -1)) {
                                                        qj.field_a.a(nd.field_F, 20, 335, 16711680, -1);
                                                        break L23;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  var5_int = gf.field_c;
                                                  var6_int = 100;
                                                  if (-1 <= (ml.field_h ^ -1)) {
                                                    break L21;
                                                  } else {
                                                    if ((var6_int ^ -1) <= (var5_int ^ -1)) {
                                                      L24: {
                                                        var7 = 32;
                                                        var8 = var7 >> 1675413121;
                                                        if (16 > var5_int) {
                                                          var7 = var5_int * 4;
                                                          break L24;
                                                        } else {
                                                          if ((-64 + var6_int ^ -1) > (var5_int ^ -1)) {
                                                            var7 = -var5_int + var6_int;
                                                            break L24;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      var9 = (int)((Math.exp((double)((float)(-var5_int) / 20.0f)) - Math.exp((double)((float)(-var6_int) / 20.0f))) * 200.0);
                                                      ja.a(320, 2 * var5_int, var8, 240, false, var9, 256, 1);
                                                      break L21;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            L25: {
                                              if (s.field_i) {
                                                var5_int = 148;
                                                ti.b(1, 351, var5_int, 128, 65280, 64);
                                                ti.d(2, 352, var5_int + -1, 478);
                                                var6_int = 0;
                                                L26: while (true) {
                                                  if (1000 <= var6_int) {
                                                    L27: {
                                                      ti.b();
                                                      var6 = wb.field_i;
                                                      if (hf.field_i.a(0)) {
                                                        break L27;
                                                      } else {
                                                        var6 = te.field_a;
                                                        break L27;
                                                      }
                                                    }
                                                    L28: {
                                                      var7 = qj.field_a.b(var6) + 10;
                                                      ti.e(0, 350, var5_int - -2, 130, 4, 0);
                                                      ti.f(-(var7 / 2) + var5_int / 2 - 3, 341, 6 + var7, 21, 10, 0);
                                                      ti.e(1, 351, var5_int, 128, 3, 8421504);
                                                      ti.e(2, 352, var5_int + -2, 126, 2, 8421504);
                                                      ti.g(3, 351, var5_int + -5, 16777215);
                                                      ti.f(1, 353, 123, 16777215);
                                                      ti.g(4, 478, var5_int + -1 + -4, 4210752);
                                                      ti.f(-1 + var5_int + 1, 354, 123, 4210752);
                                                      ti.e(3, 353, -4 + var5_int, 124, 1, 0);
                                                      ti.f(-2 + -(var7 / 2) + var5_int / 2, 342, 4 + var7, 19, 9, 8421504);
                                                      ti.e(-2 + -(var7 / 2) + var5_int / 2, 342, var7 + 4, 19, 9, 16777215);
                                                      ti.d(-(var7 / 2) + var5_int / 2 - 2, 350, 8 + var5_int / 2 + var7 / 2 + -2, 361);
                                                      ti.e(-(var7 / 2) + var5_int / 2 - 2, 342, 4 + var7, 19, 9, 4210752);
                                                      ti.b();
                                                      if ((var7 ^ -1) <= -101) {
                                                        break L28;
                                                      } else {
                                                        var8 = 0;
                                                        L29: while (true) {
                                                          if (var8 >= 15) {
                                                            break L28;
                                                          } else {
                                                            L30: {
                                                              var9 = (int)(5.0 + Math.cos(3.14 * (double)var8 / 20.0) * 5.0);
                                                              if ((var9 ^ -1) < -10) {
                                                                var9 = 9;
                                                                break L30;
                                                              } else {
                                                                break L30;
                                                              }
                                                            }
                                                            ti.f(var5_int / 2 + (4 + -var7 / 2) + -var8, -var9 + 351, var9 * 2, 8421504);
                                                            ti.f(-var7 / 2 + -var8 - (-4 - var5_int / 2), 1 + (351 + -var9), 1, 16777215);
                                                            ti.f(4 + (-var8 + (-var7 / 2 + var5_int / 2)), 351 - var9, 1, 0);
                                                            ti.f(var5_int / 2 + (-var7 / 2 + (-var8 + 4)), 351 + (var9 - 1), 1, 4210752);
                                                            ti.f(var5_int / 2 + (-var7 / 2 + -var8 - -4), var9 + 351, 1, 0);
                                                            ti.f(var8 + -(-var7 / 2) - (4 - var5_int / 2), -var9 + 351, 2 * var9, 8421504);
                                                            ti.f(var5_int / 2 - 4 - (-var8 + -var7 / 2), 1 + -var9 + 351, 1, 16777215);
                                                            ti.f(-4 + (-(-var7 / 2) - (-var8 - var5_int / 2)), -var9 + 351, 1, 0);
                                                            ti.f(var5_int / 2 - (4 + -var8) - -var7 / 2, 351 - (-var9 + 1), 1, 4210752);
                                                            ti.f(var5_int / 2 - -var8 - (-var7 / 2 + 4), 351 - -var9, 1, 0);
                                                            var8++;
                                                            continue L29;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    ti.f(var5_int / 2 - var7 / 2, 344, var7, 15, 7, 0);
                                                    qj.field_a.c(var6, 1 + (var5_int / 2 - 1), 355, 0, -1);
                                                    qj.field_a.c(var6, -1 + (1 + var5_int / 2), 357, 0, -1);
                                                    qj.field_a.c(var6, -1 + var5_int / 2, 356, 0, -1);
                                                    qj.field_a.c(var6, -1 + (var5_int / 2 + 2), 356, 0, -1);
                                                    qj.field_a.c(var6, 1 + (var5_int / 2 + -1), 356, 16777215, -1);
                                                    break L25;
                                                  } else {
                                                    L31: {
                                                      if (a.field_h[var6_int] != null) {
                                                        a.field_h[var6_int].a(false);
                                                        break L31;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                    var6_int++;
                                                    continue L26;
                                                  }
                                                }
                                              } else {
                                                break L25;
                                              }
                                            }
                                            L32: {
                                              if (s.field_i) {
                                                break L32;
                                              } else {
                                                L33: {
                                                  if (na.field_j == null) {
                                                    break L33;
                                                  } else {
                                                    if (-9 == (tl.field_c ^ -1)) {
                                                      break L32;
                                                    } else {
                                                      if (tl.field_c == 1) {
                                                        break L32;
                                                      } else {
                                                        if (tl.field_c == 3) {
                                                          break L32;
                                                        } else {
                                                          if (-3 != (tl.field_c ^ -1)) {
                                                            break L33;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L34: {
                                                  if (wh.field_c != 0) {
                                                    break L34;
                                                  } else {
                                                    if (rh.field_a != null) {
                                                      break L34;
                                                    } else {
                                                      pl.field_R = null;
                                                      wh.field_c = 2;
                                                      jg.field_pb = 0;
                                                      aa.field_b = null;
                                                      wc.field_s = null;
                                                      break L34;
                                                    }
                                                  }
                                                }
                                                L35: {
                                                  if (0 == wh.field_c) {
                                                    aa.field_b.a(0, 128, 310, (byte) -120, 90);
                                                    wc.field_s.a(0, 128, -jg.field_pb + 320 + -10, (byte) -124, 90);
                                                    pl.field_R.a(0, 128, 310 + jg.field_pb, (byte) -119, 90);
                                                    break L35;
                                                  } else {
                                                    break L35;
                                                  }
                                                }
                                                L36: {
                                                  if (wh.field_c != 1) {
                                                    break L36;
                                                  } else {
                                                    rh.field_a[jg.field_pb / 3].a(0, 128, 310, (byte) 82, 90);
                                                    break L36;
                                                  }
                                                }
                                                L37: {
                                                  if (wh.field_c == 2) {
                                                    rh.field_a = null;
                                                    fa.field_k[0].a(0, 128, 310, (byte) -120, 90);
                                                    fa.field_k[jg.field_pb / 2].a(0, 128, 310, (byte) 37, 90);
                                                    break L37;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                                if (-4 == (wh.field_c ^ -1)) {
                                                  fa.field_k[0].a(0, 128, 310, (byte) 54, 90);
                                                  break L32;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                            L38: {
                                              if (s.field_i) {
                                                L39: {
                                                  var5 = h.a(hh.field_d, 0, new String[1]);
                                                  var6_int = nj.field_f[0];
                                                  nj.field_f[0] = qi.field_a * 64 / 50;
                                                  if (-64 > (nj.field_f[0] ^ -1)) {
                                                    nj.field_f[0] = 63;
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                                L40: {
                                                  ic.a(var5, 0, -1, false, 480, 16777215, 0);
                                                  nj.field_f[0] = 64 * te.field_c / 250000;
                                                  var5 = ce.field_f + te.field_c;
                                                  if (-64 > (nj.field_f[0] ^ -1)) {
                                                    nj.field_f[0] = 63;
                                                    break L40;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                                L41: {
                                                  ic.a(var5, 0, -1, false, 160, 16777215, 0);
                                                  var5 = bb.field_f;
                                                  var7_ref = null;
                                                  var8 = e.field_e;
                                                  if (0 != e.field_e) {
                                                    break L41;
                                                  } else {
                                                    var7_ref = ei.field_A;
                                                    break L41;
                                                  }
                                                }
                                                L42: {
                                                  if ((e.field_e ^ -1) == -2) {
                                                    var7_ref = gf.field_a;
                                                    break L42;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                                L43: {
                                                  if (-3 == (e.field_e ^ -1)) {
                                                    var7_ref = ka.field_l;
                                                    break L43;
                                                  } else {
                                                    break L43;
                                                  }
                                                }
                                                L44: {
                                                  if (3 != e.field_e) {
                                                    break L44;
                                                  } else {
                                                    var7_ref = he.field_l;
                                                    break L44;
                                                  }
                                                }
                                                L45: {
                                                  if (4 == e.field_e) {
                                                    var7_ref = td.field_e;
                                                    break L45;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                                L46: {
                                                  if (e.field_e != 5) {
                                                    break L46;
                                                  } else {
                                                    var7_ref = nl.field_f;
                                                    break L46;
                                                  }
                                                }
                                                L47: {
                                                  if (e.field_e != 6) {
                                                    break L47;
                                                  } else {
                                                    var7_ref = qh.field_h;
                                                    break L47;
                                                  }
                                                }
                                                L48: {
                                                  if (-8 != (e.field_e ^ -1)) {
                                                    break L48;
                                                  } else {
                                                    var7_ref = we.field_e;
                                                    break L48;
                                                  }
                                                }
                                                L49: {
                                                  if (e.field_e != 8) {
                                                    break L49;
                                                  } else {
                                                    var7_ref = nb.field_O;
                                                    var8 += 5;
                                                    break L49;
                                                  }
                                                }
                                                L50: {
                                                  if ((e.field_e ^ -1) == -10) {
                                                    var7_ref = ja.field_k;
                                                    var8 += 5;
                                                    break L50;
                                                  } else {
                                                    break L50;
                                                  }
                                                }
                                                L51: {
                                                  if (10 == e.field_e) {
                                                    var8 += 5;
                                                    var7_ref = rd.field_b;
                                                    break L51;
                                                  } else {
                                                    break L51;
                                                  }
                                                }
                                                L52: {
                                                  if (var7_ref == null) {
                                                    break L52;
                                                  } else {
                                                    var7_ref = var7_ref.toUpperCase();
                                                    var9 = qj.field_a.b(var7_ref) - -40;
                                                    var10_int = 307;
                                                    ti.f(-20 + var10_int, 427, 42, 42, 20, 0);
                                                    ti.f(-2 + var10_int + -var9, 435, var9 - -4 + 19, 26, 12, 0);
                                                    ti.f(var10_int + -var9, 437, 19 - -var9, 22, 10, 11186350);
                                                    ti.f(var10_int + -18, 429, 38, 38, 18, 11186350);
                                                    ti.a(var10_int - 20 << -974064924, 7152, 200, 100, eh.field_e);
                                                    ti.a(var10_int - -10 - var9 << 504782724, 7152, 200, 150, eh.field_e);
                                                    ti.a(-var9 + var10_int + 40 << 242496644, 7152, 200, 150, eh.field_e);
                                                    ti.a(var10_int + 10 << 1772377540, 7152, 200, 200, eh.field_e);
                                                    ti.f(-var9 - -2 + var10_int, 439, 21 - (-var9 + -96) + -140, 18, 8, 0);
                                                    qj.field_a.b(var7_ref, -63 + var10_int - -33, 453, 16777215, -1);
                                                    ti.a(var10_int - 15, 432, 32, 32, 14, 0, 192);
                                                    e.field_g[var8].e(var10_int + 33 + -80, 400);
                                                    break L52;
                                                  }
                                                }
                                                L53: {
                                                  var9 = 250;
                                                  var10 = null;
                                                  var11 = -1;
                                                  if (-2 == (nc.field_H ^ -1)) {
                                                    var10 = pe.field_a;
                                                    var11 = 8;
                                                    break L53;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                                L54: {
                                                  if (2 == nc.field_H) {
                                                    var10 = ha.field_x;
                                                    var11 = 10;
                                                    break L54;
                                                  } else {
                                                    break L54;
                                                  }
                                                }
                                                L55: {
                                                  if (3 != nc.field_H) {
                                                    break L55;
                                                  } else {
                                                    var11 = 11;
                                                    var10 = fc.field_c;
                                                    break L55;
                                                  }
                                                }
                                                L56: {
                                                  if (4 != nc.field_H) {
                                                    break L56;
                                                  } else {
                                                    var11 = 12;
                                                    var10 = wg.field_e;
                                                    break L56;
                                                  }
                                                }
                                                L57: {
                                                  if (null != var10) {
                                                    L58: {
                                                      var10 = var10.toUpperCase();
                                                      var12 = 40 + qj.field_a.b(var10);
                                                      var13 = 100;
                                                      // wide iinc 9 250
                                                      ti.f(var9 + -20 - 1, 427, 42, 42, 20, 0);
                                                      ti.f(-2 - var12 + var9, 435, 21 - (-4 + -var12), 26, 12, 0);
                                                      if (0 >= var13) {
                                                        break L58;
                                                      } else {
                                                        ti.f(var9 + -2, 435, 4 + var13 + 21, 26, 12, 0);
                                                        break L58;
                                                      }
                                                    }
                                                    L59: {
                                                      ti.f(var9 - var12, 437, 21 + var12, 22, 10, 11186350);
                                                      if (-1 > (var13 ^ -1)) {
                                                        ti.f(var9, 437, var13 + 21, 22, 10, 11186350);
                                                        break L59;
                                                      } else {
                                                        break L59;
                                                      }
                                                    }
                                                    L60: {
                                                      ti.f(-1 + (-18 + var9), 429, 38, 38, 18, 11186350);
                                                      ti.a(-20 + var9 << 1872140068, 7152, 200, 100, eh.field_e);
                                                      ti.a(var9 - -10 << 1537771172, 7152, 200, 150, eh.field_e);
                                                      ti.a(40 + (-var12 + var9) << -1493931836, 7152, 200, 150, eh.field_e);
                                                      ti.a(-var12 - (-20 - var9) << 481878244, 7152, 200, 200, eh.field_e);
                                                      if (0 < var13) {
                                                        ti.a(var13 + var9 << -1161243260, 7152, 200, 200, eh.field_e);
                                                        break L60;
                                                      } else {
                                                        break L60;
                                                      }
                                                    }
                                                    L61: {
                                                      ti.f(var9 - -2 - var12, 439, -119 - -var12 - -96, 18, 8, 0);
                                                      if ((var13 ^ -1) >= -1) {
                                                        break L61;
                                                      } else {
                                                        L62: {
                                                          var14 = 0;
                                                          var15 = 0;
                                                          if (2 != nc.field_H) {
                                                            break L62;
                                                          } else {
                                                            L63: {
                                                              if (gh.field_b <= 500) {
                                                                break L63;
                                                              } else {
                                                                gh.field_b = 500;
                                                                break L63;
                                                              }
                                                            }
                                                            var14 = 8421504;
                                                            var15 = gh.field_b * 20 / 500;
                                                            if ((gh.field_b ^ -1) > -251) {
                                                              var14 = 327680 * (gh.field_b % 50);
                                                              break L62;
                                                            } else {
                                                              break L62;
                                                            }
                                                          }
                                                        }
                                                        L64: {
                                                          if ((nc.field_H ^ -1) == -4) {
                                                            L65: {
                                                              if (-1501 <= (gh.field_b ^ -1)) {
                                                                break L65;
                                                              } else {
                                                                gh.field_b = 1500;
                                                                break L65;
                                                              }
                                                            }
                                                            var15 = 20 * gh.field_b / 1500;
                                                            var14 = 16777215;
                                                            if ((gh.field_b ^ -1) <= -251) {
                                                              break L64;
                                                            } else {
                                                              var14 = gh.field_b % 50 * 327680;
                                                              break L64;
                                                            }
                                                          } else {
                                                            break L64;
                                                          }
                                                        }
                                                        L66: {
                                                          if (nc.field_H == 4) {
                                                            L67: {
                                                              if (500 >= gh.field_b) {
                                                                break L67;
                                                              } else {
                                                                gh.field_b = 500;
                                                                break L67;
                                                              }
                                                            }
                                                            var14 = 16776960;
                                                            var15 = gh.field_b * 20 / 500;
                                                            if (-251 >= (gh.field_b ^ -1)) {
                                                              break L66;
                                                            } else {
                                                              var14 = gh.field_b % 50 * 327680;
                                                              break L66;
                                                            }
                                                          } else {
                                                            break L66;
                                                          }
                                                        }
                                                        L68: {
                                                          if ((nc.field_H ^ -1) != -2) {
                                                            break L68;
                                                          } else {
                                                            L69: {
                                                              if (-6 == (gh.field_b ^ -1)) {
                                                                var14 = 16777215;
                                                                break L69;
                                                              } else {
                                                                break L69;
                                                              }
                                                            }
                                                            L70: {
                                                              var15 = gh.field_b * 4;
                                                              if (-5 != (gh.field_b ^ -1)) {
                                                                break L70;
                                                              } else {
                                                                var14 = 8454143;
                                                                break L70;
                                                              }
                                                            }
                                                            L71: {
                                                              if ((gh.field_b ^ -1) != -4) {
                                                                break L71;
                                                              } else {
                                                                var14 = 8421631;
                                                                break L71;
                                                              }
                                                            }
                                                            L72: {
                                                              if (-3 == (gh.field_b ^ -1)) {
                                                                var14 = 16744703;
                                                                break L72;
                                                              } else {
                                                                break L72;
                                                              }
                                                            }
                                                            if (gh.field_b == 1) {
                                                              var14 = 16744576;
                                                              break L68;
                                                            } else {
                                                              break L68;
                                                            }
                                                          }
                                                        }
                                                        L73: {
                                                          var16 = 20 + (2 + var9);
                                                          var17 = 439;
                                                          ti.f(var16, var17, -3 + var13, 18, 8, (var14 & 16711422) >> 523782209);
                                                          if (3 != nc.field_H) {
                                                            ti.e(var16, var17, var13 + -3, 18, 8, 4144959 & var14 >> 838676258);
                                                            break L73;
                                                          } else {
                                                            ti.e(var16, var17, -3 + var13, 18, 8, var14);
                                                            break L73;
                                                          }
                                                        }
                                                        var16 = var16 << 4;
                                                        var17 = var17 << 4;
                                                        var19 = 0;
                                                        L74: while (true) {
                                                          if (var19 >= var15) {
                                                            var19 += 2;
                                                            L75: while (true) {
                                                              if ((var19 ^ -1) <= -21) {
                                                                break L61;
                                                              } else {
                                                                L76: {
                                                                  var18 = (var19 + ki.field_s) % 10;
                                                                  if ((var18 ^ -1) >= -6) {
                                                                    var18 = 10 - var18;
                                                                    break L76;
                                                                  } else {
                                                                    break L76;
                                                                  }
                                                                }
                                                                ti.c((var18 + var19 * 10) * (var13 + -35) / 10 + var16 - -136 >> -2047132252, 136 + var17 >> -527722428, 9, 0, 32);
                                                                ti.c((var13 + -35) * (var18 + var19 * 10) / 10 + (var16 + 136) >> 1627503108, var17 + 136 >> 2061627876, 7, 0, 32);
                                                                ti.c(136 + var16 - -((var13 + -35) * (var18 + var19 * 10) / 10) >> -742821596, var17 - -136 >> 419818596, 5, 0, 32);
                                                                var19++;
                                                                continue L75;
                                                              }
                                                            }
                                                          } else {
                                                            L77: {
                                                              var18 = (ki.field_s + var19) % 10;
                                                              if ((var18 ^ -1) < -6) {
                                                                var18 = 10 + -var18;
                                                                break L77;
                                                              } else {
                                                                break L77;
                                                              }
                                                            }
                                                            L78: {
                                                              if ((nc.field_H ^ -1) != -3) {
                                                                ti.a((var13 - 35) * (var18 + var19 * 10) / 10 + var16 + 136, 136 + var17, 144, 50, eh.field_e);
                                                                break L78;
                                                              } else {
                                                                ti.a((var13 - 35) * (10 * var19) / 10 + (136 + var16), (var18 << 2097387618) + (136 + var17), -var18 + 9 << -933891388, 50, eh.field_e);
                                                                break L78;
                                                              }
                                                            }
                                                            var19++;
                                                            continue L74;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var9 -= 48;
                                                    ti.a(var9 + 32, 432, 32, 32, 14, 0, 192);
                                                    e.field_g[var11].e(var9, 400);
                                                    qj.field_a.b(var10, 18 + var9, 453, 16777215, -1);
                                                    break L57;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                                nj.field_f[0] = var6_int;
                                                if ((((stellarshard) this).field_J ^ -1) < -1) {
                                                  var5 = ah.field_k;
                                                  break L38;
                                                } else {
                                                  break L38;
                                                }
                                              } else {
                                                break L38;
                                              }
                                            }
                                            L79: {
                                              if ((ig.field_D ^ -1) >= -1) {
                                                break L79;
                                              } else {
                                                ti.b(0, 0, 640, 480, 16777215, ig.field_D);
                                                break L79;
                                              }
                                            }
                                            L80: {
                                              ti.a(0, 0, 640, 480, 0, 192);
                                              ti.a(1, 1, 638, 478, 0, 128);
                                              ti.a(2, 2, 636, 476, 0, 64);
                                              if (na.field_j != null) {
                                                na.field_j.a((byte) 85);
                                                break L80;
                                              } else {
                                                break L80;
                                              }
                                            }
                                            L81: {
                                              if (((stellarshard) this).field_R <= 0) {
                                                break L81;
                                              } else {
                                                ti.b(0, 0, 640, 480, 16777215, ((stellarshard) this).field_R);
                                                break L81;
                                              }
                                            }
                                            L82: {
                                              if (-1 <= (nc.field_A ^ -1)) {
                                                break L82;
                                              } else {
                                                if (!s.field_i) {
                                                  break L82;
                                                } else {
                                                  if ((mk.field_k ^ -1) < -1) {
                                                    break L82;
                                                  } else {
                                                    var6 = dd.field_i + nc.field_A / 50 + ef.field_o;
                                                    int discarded$9 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                                                    int discarded$10 = l.field_f.a(var6, 32, 68 - l.field_f.field_N, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                                                    int discarded$11 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                                                    break L82;
                                                  }
                                                }
                                              }
                                            }
                                            L83: {
                                              if (nc.field_A <= 0) {
                                                break L83;
                                              } else {
                                                if (!s.field_i) {
                                                  break L83;
                                                } else {
                                                  if (qi.field_a < 50) {
                                                    break L83;
                                                  } else {
                                                    var6 = lk.field_g + hf.field_g + nc.field_A / 50 + ef.field_o;
                                                    int discarded$12 = l.field_f.a(var6, 32, 68 + -l.field_f.field_N, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
                                                    int discarded$13 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
                                                    int discarded$14 = l.field_f.a(var6, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
                                                    break L83;
                                                  }
                                                }
                                              }
                                            }
                                            L84: {
                                              var6_ref = (jf) (Object) hf.field_i.b(-119);
                                              if (null == var6_ref) {
                                                break L84;
                                              } else {
                                                L85: {
                                                  var7 = ((stellarshard) this).field_I;
                                                  if (-81 >= (var7 ^ -1)) {
                                                    if (-231 < (var7 ^ -1)) {
                                                      var8 = 255;
                                                      break L85;
                                                    } else {
                                                      var8 = (310 + -var7) * 255 / 80;
                                                      break L85;
                                                    }
                                                  } else {
                                                    var8 = 255 * var7 / 80;
                                                    break L85;
                                                  }
                                                }
                                                L86: {
                                                  var9 = 148;
                                                  if (var8 < 0) {
                                                    var8 = 0;
                                                    break L86;
                                                  } else {
                                                    break L86;
                                                  }
                                                }
                                                L87: {
                                                  ti.b(4, 353, -6 + var9, 123, 0, var8);
                                                  if (-256 == (var8 ^ -1)) {
                                                    wh.field_e[var6_ref.field_o].a(-24 + var9 / 2, 369, 48, 48);
                                                    int discarded$15 = qj.field_a.a(rc.field_e[var6_ref.field_o], 8, 425, var9 - 16, 56, 65535, -1, 1, 1, qj.field_a.field_N);
                                                    break L87;
                                                  } else {
                                                    break L87;
                                                  }
                                                }
                                                var5 = te.field_a;
                                                qj.field_a.c(var5, var9 / 2 - -1, 355, 0, -1);
                                                qj.field_a.c(var5, 1 + var9 / 2, 357, 0, -1);
                                                qj.field_a.c(var5, var9 / 2, 356, 0, -1);
                                                qj.field_a.c(var5, var9 / 2 + 2, 356, 0, -1);
                                                qj.field_a.c(var5, var9 / 2 - -1, 356, 16777215, -1);
                                                break L84;
                                              }
                                            }
                                            L88: {
                                              if (!fd.d((byte) -21)) {
                                                break L88;
                                              } else {
                                                ti.b(0, 0, 640, 480, 0, 128);
                                                ti.f(-(ok.a((byte) 126) / 2) + 320 + -19, -16 + -(kb.b((byte) -114) / 2) + 240 - 5, ok.a((byte) 125) + 6 - -32, kb.b((byte) 121) + 10 + 32, 0);
                                                na.a(28, 256, 28, fg.field_P);
                                                break L88;
                                              }
                                            }
                                            L89: {
                                              if (!hd.field_b) {
                                                break L89;
                                              } else {
                                                ti.b(0, 0, 150, 480, 0, 64);
                                                ti.b(0, 0, 150, 480, 16777215);
                                                break L89;
                                              }
                                            }
                                            L90: {
                                              if (!id.b(param0 ^ 20876)) {
                                                break L90;
                                              } else {
                                                if (fd.d((byte) -21)) {
                                                  break L90;
                                                } else {
                                                  L91: {
                                                    if (null != s.field_e) {
                                                      stackOut_358_0 = 1;
                                                      stackIn_359_0 = stackOut_358_0;
                                                      break L91;
                                                    } else {
                                                      stackOut_357_0 = ua.field_b;
                                                      stackIn_359_0 = stackOut_357_0 ? 1 : 0;
                                                      break L91;
                                                    }
                                                  }
                                                  bc.a(stackIn_359_0 != 0, -102);
                                                  break L90;
                                                }
                                              }
                                            }
                                            L92: {
                                              if (null == s.field_e) {
                                                stackOut_362_0 = qd.field_j;
                                                stackIn_363_0 = (Object) (Object) stackOut_362_0;
                                                break L92;
                                              } else {
                                                stackOut_361_0 = s.field_e;
                                                stackIn_363_0 = (Object) (Object) stackOut_361_0;
                                                break L92;
                                              }
                                            }
                                            pd.a((java.awt.Canvas) (Object) stackIn_363_0, 0, 0, (byte) -73);
                                            return;
                                          } else {
                                            ei.field_D[var6_int].d(-128 + (fk.field_k[var5_int] >> 346012836), -128 + (fk.field_k[1 + var5_int] >> -2060443996), -(el.field_I * 2) + 128);
                                            var5_int += 8;
                                            var6_int += 2;
                                            continue L20;
                                          }
                                        }
                                      } else {
                                        L93: {
                                          if (a.field_h[var5_int] == null) {
                                            break L93;
                                          } else {
                                            L94: {
                                              if (14 == a.field_h[var5_int].field_m) {
                                                break L94;
                                              } else {
                                                if (!a.field_h[var5_int].a((byte) -83)) {
                                                  break L93;
                                                } else {
                                                  break L94;
                                                }
                                              }
                                            }
                                            a.field_h[var5_int].e(122);
                                            break L93;
                                          }
                                        }
                                        var5_int++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L95: {
                                      var6_int = var3;
                                      var7 = var5_int * ((stellarshard) this).field_G.field_v;
                                      if ((var6_int ^ -1) > -1) {
                                        stackOut_90_0 = -var6_int;
                                        stackIn_91_0 = stackOut_90_0;
                                        break L95;
                                      } else {
                                        stackOut_89_0 = 0;
                                        stackIn_91_0 = stackOut_89_0;
                                        break L95;
                                      }
                                    }
                                    L96: {
                                      var8 = stackIn_91_0;
                                      if (-641 <= (((stellarshard) this).field_G.field_v + var6_int ^ -1)) {
                                        stackOut_93_0 = ((stellarshard) this).field_G.field_v;
                                        stackIn_94_0 = stackOut_93_0;
                                        break L96;
                                      } else {
                                        stackOut_92_0 = 640 + -var6_int;
                                        stackIn_94_0 = stackOut_92_0;
                                        break L96;
                                      }
                                    }
                                    var9 = stackIn_94_0;
                                    var10_int = var8;
                                    L97: while (true) {
                                      if ((var10_int ^ -1) <= (var9 ^ -1)) {
                                        var5_int++;
                                        continue L18;
                                      } else {
                                        L98: {
                                          var4 = ((stellarshard) this).field_G.field_z[var7 + var10_int];
                                          if (-1 > (var4 ^ -1)) {
                                            L99: {
                                              if ((var4 ^ -1) >= -1) {
                                                break L99;
                                              } else {
                                                if (-97 <= (var4 ^ -1)) {
                                                  ((stellarshard) this).field_G.field_z[var7 + var10_int] = var4 * 255 / 96 << 1305875024;
                                                  break L99;
                                                } else {
                                                  break L99;
                                                }
                                              }
                                            }
                                            L100: {
                                              if ((var4 ^ -1) >= -97) {
                                                break L100;
                                              } else {
                                                if (var4 < 160) {
                                                  ((stellarshard) this).field_G.field_z[var7 + var10_int] = 16711680 - -((-24480 + 255 * var4) / 64 << 1954957448);
                                                  break L100;
                                                } else {
                                                  break L100;
                                                }
                                              }
                                            }
                                            if (160 > var4) {
                                              break L98;
                                            } else {
                                              if ((var4 ^ -1) <= -256) {
                                                break L98;
                                              } else {
                                                ((stellarshard) this).field_G.field_z[var10_int + var7] = 255 * (-160 + var4) / 95 + 16776960;
                                                break L98;
                                              }
                                            }
                                          } else {
                                            break L98;
                                          }
                                        }
                                        var10_int++;
                                        continue L97;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_81_0 = null;
                                stackIn_82_0 = stackOut_81_0;
                                L101: {
                                  if (stackIn_82_0 == (Object) (Object) hf.field_e[var3]) {
                                    break L101;
                                  } else {
                                    hf.field_e[var3].a(true);
                                    break L101;
                                  }
                                }
                                var3++;
                                continue L17;
                              }
                            }
                          } else {
                            L102: {
                              if (wk.field_b[var3] != null) {
                                wk.field_b[var3].a(-57, ((stellarshard) this).field_G);
                                break L102;
                              } else {
                                break L102;
                              }
                            }
                            var3++;
                            continue L16;
                          }
                        }
                      } else {
                        stackOut_58_0 = null;
                        stackIn_59_0 = stackOut_58_0;
                        L103: {
                          if (stackIn_59_0 == (Object) (Object) a.field_h[var3]) {
                            break L103;
                          } else {
                            if (-15 == (a.field_h[var3].field_m ^ -1)) {
                              break L103;
                            } else {
                              if (!a.field_h[var3].a((byte) -96)) {
                                a.field_h[var3].e(106);
                                break L103;
                              } else {
                                break L103;
                              }
                            }
                          }
                        }
                        var3++;
                        continue L14;
                      }
                    }
                  } else {
                    ei.field_D[var4].d((fk.field_k[var3] >> -573905436) - 128, (fk.field_k[var3 - -1] >> -1973196764) + -128, 128 - el.field_I * 2);
                    var3 += 8;
                    var4 += 2;
                    continue L13;
                  }
                }
              } else {
                i.a((java.awt.Canvas) var2, -99);
                return;
              }
            } else {
              i.a((java.awt.Canvas) var2, -101);
              return;
            }
          } else {
            i.a((java.awt.Canvas) var2, -113);
            return;
          }
        }
    }

    public final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 == -77) {
                break L0;
              } else {
                ((stellarshard) this).c((byte) -68);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    public final void init() {
        try {
            ((stellarshard) this).a(11, true, "stellarshard");
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "stellarshard.init()");
        }
    }

    public stellarshard() {
        ((stellarshard) this).field_P = new int[]{384, 384, -384, -384, 384, 384, -384, -384};
        ((stellarshard) this).field_N = new int[]{384, -384, -384, 384, 384, -384, -384, 384};
        ((stellarshard) this).field_S = new int[]{384, 384, 384, 384, -384, -384, -384, -384};
        ((stellarshard) this).field_I = 0;
    }

    private final void o(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null != ld.field_G) {
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
                        le.a(ld.field_G, 26949);
                        ld.field_G = null;
                        rg.g(-33);
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
                        bh.field_a = wl.a(1, 1);
                        wk.field_a = wl.a(1, 2);
                        var2_int = 122 / ((-3 - param0) / 34);
                        mf.field_b = wl.a(1, 3);
                        ka.field_n = wl.a(1, 4);
                        be.field_d = wl.a(1, 5);
                        jf.field_m = wl.a(1, 7);
                        jg.a(ie.field_u, fc.field_a, (byte) 118);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw ma.a((Throwable) (Object) var2, "stellarshard.GB(" + param0 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new int[16];
        field_E = new th();
    }
}
