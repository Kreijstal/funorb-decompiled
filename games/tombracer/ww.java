/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ww extends ka {
    private tw field_z;
    private ww field_Gb;
    private ww field_u;
    private short[] field_M;
    private int[] field_Ab;
    private short[] field_V;
    private ww field_qb;
    private boolean field_zb;
    private ww field_n;
    private float[][] field_l;
    private ww field_N;
    private int[] field_v;
    private ww field_tb;
    private int[] field_mb;
    private int[] field_E;
    private rga[] field_kb;
    private hna[] field_e;
    private pna field_B;
    private boolean field_ab;
    private ava[] field_i;
    private short field_Bb;
    private int[][] field_Cb;
    private oha[] field_lb;
    private oha[] field_D;
    private short[] field_Eb;
    private int[] field_yb;
    private iua field_w;
    private short[] field_ub;
    private ww field_pb;
    private int field_P;
    private int[] field_C;
    private short field_R;
    private short field_U;
    private int field_Db;
    private int field_gb;
    private short field_O;
    private float[][] field_W;
    private int[] field_T;
    private short[] field_bb;
    private int[] field_xb;
    private short field_cb;
    private int field_Y;
    static int field_G;
    private int field_ib;
    private int[] field_hb;
    private tw field_F;
    private int field_H;
    private int field_eb;
    private short[] field_x;
    private int field_m;
    private int[][] field_sb;
    private byte[] field_k;
    private int[] field_rb;
    private int[] field_s;
    private sfa field_d;
    private gna[] field_I;
    private boolean field_A;
    private short[] field_ob;
    private int[][] field_j;
    private int field_Z;
    private int[] field_o;
    private int[] field_jb;
    private boolean field_L;
    private ww field_K;
    private boolean field_r;
    private boolean field_S;
    private short field_f;
    private nsa[] field_db;
    private byte[] field_h;
    static int field_q;
    private int[] field_Fb;
    private short field_vb;
    private int[] field_nb;
    private int field_p;
    private int[] field_J;
    private short[] field_X;
    private ww field_fb;
    private ww field_Q;
    private int[] field_t;
    private int field_g;
    private int[] field_y;
    private byte[] field_wb;
    private static String field_Hb;

    private final void e() {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((ww) this).field_eb != 0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.a(false);
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    if (((ww) this).field_d.field_u <= 1) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var1 = this;
                    // monitorenter this
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        this.h();
                        // monitorexit var1
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                case 10: {
                    this.h();
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void wa() {
        int var1 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (!((ww) this).field_S) {
            break L0;
          } else {
            var1 = 0;
            try {
              L1: while (true) {
                if (var1 >= ((ww) this).field_p) {
                  break L1;
                } else {
                  ((ww) this).field_xb[var1] = ((ww) this).field_xb[var1] + 7 >> 4;
                  ((ww) this).field_rb[var1] = ((ww) this).field_rb[var1] + 7 >> 4;
                  ((ww) this).field_T[var1] = ((ww) this).field_T[var1] + 7 >> 4;
                  var1++;
                  continue L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              throw (RuntimeException) (Object) decompiledCaughtException;
            }
            ((ww) this).field_S = false;
            break L0;
          }
        }
        try {
          L2: {
            if (!((ww) this).field_L) {
              break L2;
            } else {
              this.e();
              ((ww) this).field_L = false;
              break L2;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        throw (RuntimeException) (Object) decompiledCaughtException;
    }

    final void O(int param0, int param1, int param2) {
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_16_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_15_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 128) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = this;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((((ww) this).field_P & 1) == 1) {
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
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    try {
                        if (param1 == 128) {
                            statePc = 14;
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
                        stackOut_8_0 = this;
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
                        if ((((ww) this).field_P & 2) == 2) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    try {
                        if (param2 == 128) {
                            statePc = 21;
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
                        stackOut_15_0 = this;
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
                        if ((((ww) this).field_P & 4) == 4) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    var4 = this;
                    // monitorenter this
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var5 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5 >= ((ww) this).field_p) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof IllegalStateException ? 25 : 28);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((ww) this).field_xb[var5] = ((ww) this).field_xb[var5] * param0 >> 7;
                        ((ww) this).field_rb[var5] = ((ww) this).field_rb[var5] * param1 >> 7;
                        ((ww) this).field_T[var5] = ((ww) this).field_T[var5] * param2 >> 7;
                        var5++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof IllegalStateException ? 25 : 28);
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
                        ((ww) this).field_r = false;
                        // monitorexit var4
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var6 = caughtException;
                        // monitorexit var4
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 29: {
                    throw (RuntimeException) (Object) var6;
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        oha var16 = null;
        gna var16_ref = null;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((ww) this).field_lb = new oha[((ww) this).field_Z];
                    var1 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var1 >= ((ww) this).field_Z) {
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
                        ((ww) this).field_lb[var1] = new oha();
                        var1++;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 4: {
                    var1 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var1 >= ((ww) this).field_g) {
                        statePc = 44;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2 = ((ww) this).field_M[var1];
                    var3 = ((ww) this).field_bb[var1];
                    var4 = ((ww) this).field_x[var1];
                    var5 = ((ww) this).field_xb[var3] - ((ww) this).field_xb[var2];
                    var6 = ((ww) this).field_rb[var3] - ((ww) this).field_rb[var2];
                    var7 = ((ww) this).field_T[var3] - ((ww) this).field_T[var2];
                    var8 = ((ww) this).field_xb[var4] - ((ww) this).field_xb[var2];
                    var9 = ((ww) this).field_rb[var4] - ((ww) this).field_rb[var2];
                    var10 = ((ww) this).field_T[var4] - ((ww) this).field_T[var2];
                    var11 = var6 * var10 - var9 * var7;
                    var12 = var7 * var8 - var10 * var5;
                    var13 = var5 * var9 - var8 * var6;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        if (var11 > 8192) {
                            statePc = 27;
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
                        stackOut_8_0 = var12;
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
                        if (stackIn_9_0 > 8192) {
                            statePc = 27;
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
                        stackOut_12_0 = var13;
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
                        if (stackIn_13_0 > 8192) {
                            statePc = 27;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = var11;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 < -8192) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var12;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 < -8192) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var13 >= -8192) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    var11 = var11 >> 1;
                    var12 = var12 >> 1;
                    var13 = var13 >> 1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 28: {
                    var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
                    if (var14 > 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var14 = 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var11 = var11 * 256 / var14;
                    var12 = var12 * 256 / var14;
                    var13 = var13 * 256 / var14;
                    if (((ww) this).field_k != null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var15 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    var15 = ((ww) this).field_k[var1];
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (var15 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var16 = ((ww) this).field_lb[var2];
                    var16.field_a = var16.field_a + var11;
                    var16.field_c = var16.field_c + var12;
                    var16.field_b = var16.field_b + var13;
                    var16.field_d = var16.field_d + 1;
                    var16 = ((ww) this).field_lb[var3];
                    var16.field_a = var16.field_a + var11;
                    var16.field_c = var16.field_c + var12;
                    var16.field_b = var16.field_b + var13;
                    var16.field_d = var16.field_d + 1;
                    var16 = ((ww) this).field_lb[var4];
                    var16.field_a = var16.field_a + var11;
                    var16.field_c = var16.field_c + var12;
                    var16.field_b = var16.field_b + var13;
                    var16.field_d = var16.field_d + 1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 35: {
                    try {
                        if (var15 != 1) {
                            statePc = 43;
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
                        if (((ww) this).field_I != null) {
                            statePc = 42;
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
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
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
                        ((ww) this).field_I = new gna[((ww) this).field_g];
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 42: {
                    ((ww) this).field_I[var1] = new gna();
                    var16_ref = new gna();
                    var16_ref.field_a = var11;
                    var16_ref.field_c = var12;
                    var16_ref.field_b = var13;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var1++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int d(int param0) {
        if (param0 < 2) {
            param0 = 2;
        } else {
            if (param0 > 126) {
                param0 = 126;
            }
        }
        return param0;
    }

    final void a() {
        try {
            Object var1 = null;
            Object var1_ref = null;
            InterruptedException var2 = null;
            Throwable var3 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (((ww) this).field_d.field_u <= 1) {
                break L0;
              } else {
                var1_ref = this;
                // monitorenter this
                try {
                  try {
                    L1: while (true) {
                      if (!((ww) this).field_a) {
                        break L1;
                      } else {
                        try {
                          this.wait();
                        } catch (java.lang.InterruptedException decompiledCaughtParameter) {
                          decompiledCaughtException = decompiledCaughtParameter;
                          throw (RuntimeException) (Object) decompiledCaughtException;
                        }
                        continue L1;
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  var2 = (InterruptedException) (Object) decompiledCaughtException;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  ((ww) this).field_a = true;
                  // monitorexit var1_ref
                }
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        L0: {
          var2 = 0;
          var3 = ((ww) this).field_d.field_g;
          var4 = ((ww) this).field_M[param0];
          var5 = ((ww) this).field_bb[param0];
          var6 = ((ww) this).field_x[param0];
          var7 = ((ww) this).field_Ab[var4];
          var8 = ((ww) this).field_Ab[var5];
          var9 = ((ww) this).field_Ab[var6];
          if (((ww) this).field_h != null) {
            ((ww) this).field_w.field_b = ((ww) this).field_h[param0] & 255;
            break L0;
          } else {
            ((ww) this).field_w.field_b = 0;
            break L0;
          }
        }
        L1: {
          if (var7 < var3) {
            L2: {
              var10 = ((ww) this).field_nb[var4];
              var11 = ((ww) this).field_C[var4];
              var12 = ((ww) this).field_t[param0] & 65535;
              if (var9 < var3) {
                break L2;
              } else {
                var13 = (var3 - var7) * (65536 / (var9 - var7));
                ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var6] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
                ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var6] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
                ((ww) this).field_yb[var2] = var3;
                var2++;
                ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_Fb[param0] & 65535) - var12) * var13 >> 16);
                break L2;
              }
            }
            if (var8 < var3) {
              break L1;
            } else {
              var13 = (var3 - var7) * (65536 / (var8 - var7));
              ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var5] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
              ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var5] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
              ((ww) this).field_yb[var2] = var3;
              var2++;
              ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_o[param0] & 65535) - var12) * var13 >> 16);
              break L1;
            }
          } else {
            ((ww) this).field_y[var2] = ((ww) this).field_v[var4];
            ((ww) this).field_E[var2] = ((ww) this).field_J[var4];
            ((ww) this).field_yb[var2] = ((ww) this).field_mb[var4];
            var2++;
            ((ww) this).field_hb[var2] = ((ww) this).field_t[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var8 < var3) {
            L4: {
              var10 = ((ww) this).field_nb[var5];
              var11 = ((ww) this).field_C[var5];
              var12 = ((ww) this).field_o[param0] & 65535;
              if (var7 < var3) {
                break L4;
              } else {
                var13 = (var3 - var8) * (65536 / (var7 - var8));
                ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var4] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
                ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var4] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
                ((ww) this).field_yb[var2] = var3;
                var2++;
                ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_t[param0] & 65535) - var12) * var13 >> 16);
                break L4;
              }
            }
            if (var9 < var3) {
              break L3;
            } else {
              var13 = (var3 - var8) * (65536 / (var9 - var8));
              ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var6] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
              ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var6] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
              ((ww) this).field_yb[var2] = var3;
              var2++;
              ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_Fb[param0] & 65535) - var12) * var13 >> 16);
              break L3;
            }
          } else {
            ((ww) this).field_y[var2] = ((ww) this).field_v[var5];
            ((ww) this).field_E[var2] = ((ww) this).field_J[var5];
            ((ww) this).field_yb[var2] = ((ww) this).field_mb[var5];
            var2++;
            ((ww) this).field_hb[var2] = ((ww) this).field_o[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var9 < var3) {
            L6: {
              var10 = ((ww) this).field_nb[var6];
              var11 = ((ww) this).field_C[var6];
              var12 = ((ww) this).field_Fb[param0] & 65535;
              if (var8 < var3) {
                break L6;
              } else {
                var13 = (var3 - var9) * (65536 / (var8 - var9));
                ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var5] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
                ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var5] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
                ((ww) this).field_yb[var2] = var3;
                var2++;
                ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_o[param0] & 65535) - var12) * var13 >> 16);
                break L6;
              }
            }
            if (var7 < var3) {
              break L5;
            } else {
              var13 = (var3 - var9) * (65536 / (var7 - var9));
              ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var4] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
              ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var4] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
              ((ww) this).field_yb[var2] = var3;
              var2++;
              ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_t[param0] & 65535) - var12) * var13 >> 16);
              break L5;
            }
          } else {
            ((ww) this).field_y[var2] = ((ww) this).field_v[var6];
            ((ww) this).field_E[var2] = ((ww) this).field_J[var6];
            ((ww) this).field_yb[var2] = ((ww) this).field_mb[var6];
            var2++;
            ((ww) this).field_hb[var2] = ((ww) this).field_Fb[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var10 = ((ww) this).field_y[0];
          var11 = ((ww) this).field_y[1];
          var12 = ((ww) this).field_y[2];
          var13 = ((ww) this).field_E[0];
          var14 = ((ww) this).field_E[1];
          var15 = ((ww) this).field_E[2];
          var7 = ((ww) this).field_yb[0];
          var8 = ((ww) this).field_yb[1];
          var9 = ((ww) this).field_yb[2];
          ((ww) this).field_w.field_q = false;
          if (var2 != 3) {
            break L7;
          } else {
            L8: {
              L9: {
                if (var10 < 0) {
                  break L9;
                } else {
                  if (var11 < 0) {
                    break L9;
                  } else {
                    if (var12 < 0) {
                      break L9;
                    } else {
                      if (var10 > ((ww) this).field_F.field_y) {
                        break L9;
                      } else {
                        if (var11 > ((ww) this).field_F.field_y) {
                          break L9;
                        } else {
                          if (var12 <= ((ww) this).field_F.field_y) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              ((ww) this).field_w.field_q = true;
              break L8;
            }
            L10: {
              if (((ww) this).field_X == null) {
                break L10;
              } else {
                if (((ww) this).field_X[param0] != -1) {
                  L11: {
                    var16 = -16777216;
                    if (((ww) this).field_h == null) {
                      break L11;
                    } else {
                      var16 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                      break L11;
                    }
                  }
                  var17 = var16 | ((ww) this).field_t[param0] & 16777215;
                  if (((ww) this).field_Fb[param0] != -1) {
                    ((ww) this).field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    break L7;
                  } else {
                    ((ww) this).field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((ww) this).field_Fb[param0] != -1) {
              ((ww) this).field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, (float)((ww) this).field_hb[0], (float)((ww) this).field_hb[1], (float)((ww) this).field_hb[2]);
              break L7;
            } else {
              ((ww) this).field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, bt.field_h[((ww) this).field_t[param0] & 65535]);
              break L7;
            }
          }
        }
        L12: {
          if (var2 != 4) {
            break L12;
          } else {
            L13: {
              L14: {
                if (var10 < 0) {
                  break L14;
                } else {
                  if (var11 < 0) {
                    break L14;
                  } else {
                    if (var12 < 0) {
                      break L14;
                    } else {
                      if (var10 > ((ww) this).field_F.field_y) {
                        break L14;
                      } else {
                        if (var11 > ((ww) this).field_F.field_y) {
                          break L14;
                        } else {
                          if (var12 > ((ww) this).field_F.field_y) {
                            break L14;
                          } else {
                            if (((ww) this).field_y[3] < 0) {
                              break L14;
                            } else {
                              if (((ww) this).field_y[3] <= ((ww) this).field_F.field_y) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              ((ww) this).field_w.field_q = true;
              break L13;
            }
            L15: {
              if (((ww) this).field_X == null) {
                break L15;
              } else {
                if (((ww) this).field_X[param0] != -1) {
                  L16: {
                    var16 = -16777216;
                    if (((ww) this).field_h == null) {
                      break L16;
                    } else {
                      var16 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                      break L16;
                    }
                  }
                  var17 = var16 | ((ww) this).field_t[param0] & 16777215;
                  if (((ww) this).field_Fb[param0] != -1) {
                    ((ww) this).field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    ((ww) this).field_w.a((float)var13, (float)var15, (float)((ww) this).field_E[3], (float)var10, (float)var12, (float)((ww) this).field_y[3], (float)var7, (float)var9, (float)((ww) this).field_yb[3], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    break L12;
                  } else {
                    ((ww) this).field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    ((ww) this).field_w.a((float)var13, (float)var15, (float)((ww) this).field_E[3], (float)var10, (float)var12, (float)((ww) this).field_y[3], (float)var7, (float)var9, (float)((ww) this).field_yb[3], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    break L12;
                  }
                } else {
                  break L15;
                }
              }
            }
            if (((ww) this).field_Fb[param0] != -1) {
              ((ww) this).field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, (float)((ww) this).field_hb[0], (float)((ww) this).field_hb[1], (float)((ww) this).field_hb[2]);
              ((ww) this).field_w.a((float)var13, (float)var15, (float)((ww) this).field_E[3], (float)var10, (float)var12, (float)((ww) this).field_y[3], (float)var7, (float)var8, (float)((ww) this).field_yb[3], (float)((ww) this).field_hb[0], (float)((ww) this).field_hb[2], (float)((ww) this).field_hb[3]);
              break L12;
            } else {
              var16 = bt.field_h[((ww) this).field_t[param0] & 65535];
              ((ww) this).field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, var16);
              ((ww) this).field_w.b((float)var13, (float)var15, (float)((ww) this).field_E[3], (float)var10, (float)var12, (float)((ww) this).field_y[3], (float)var7, (float)var8, (float)((ww) this).field_yb[3], var16);
              break L12;
            }
          }
        }
    }

    final void a(gda param0, el param1, int param2) {
        this.b(param0, param1, -1, param2);
    }

    private final void f() {
        ((ww) this).field_lb = null;
        ((ww) this).field_D = null;
        ((ww) this).field_I = null;
        ((ww) this).field_r = false;
    }

    final void H(int param0, int param1, int param2) {
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_16_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_15_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = this;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((((ww) this).field_P & 1) == 1) {
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
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    try {
                        if (param1 == 0) {
                            statePc = 14;
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
                        stackOut_8_0 = this;
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
                        if ((((ww) this).field_P & 2) == 2) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    try {
                        if (param2 == 0) {
                            statePc = 21;
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
                        stackOut_15_0 = this;
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
                        if ((((ww) this).field_P & 4) == 4) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    var4 = this;
                    // monitorenter this
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var5 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var5 >= ((ww) this).field_p) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof IllegalStateException ? 25 : 28);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ((ww) this).field_xb[var5] = ((ww) this).field_xb[var5] + param0;
                        ((ww) this).field_rb[var5] = ((ww) this).field_rb[var5] + param1;
                        ((ww) this).field_T[var5] = ((ww) this).field_T[var5] + param2;
                        var5++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof IllegalStateException ? 25 : 28);
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
                        // monitorexit var4
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var6 = caughtException;
                        // monitorexit var4
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 29: {
                    throw (RuntimeException) (Object) var6;
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        hna var11 = null;
        int var12_int = 0;
        nsa var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        Object stackIn_57_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_46_0 = 0;
        Object stackOut_56_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((ww) this).field_Fb[param0] != -2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    var4 = ((ww) this).field_M[param0];
                    var5 = ((ww) this).field_bb[param0];
                    var6 = ((ww) this).field_x[param0];
                    var7 = ((ww) this).field_v[var4];
                    var8 = ((ww) this).field_v[var5];
                    var9 = ((ww) this).field_v[var6];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (!param1) {
                            statePc = 22;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = var7;
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
                        if (stackIn_6_0 == -5000) {
                            statePc = 16;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = var8;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == -5000) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var9 != -5000) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    var10 = ((ww) this).field_nb[var4];
                    var11_int = ((ww) this).field_nb[var5];
                    var12_int = ((ww) this).field_nb[var6];
                    var13 = ((ww) this).field_C[var4];
                    var14 = ((ww) this).field_C[var5];
                    var15 = ((ww) this).field_C[var6];
                    var16 = ((ww) this).field_Ab[var4];
                    var17 = ((ww) this).field_Ab[var5];
                    var18 = ((ww) this).field_Ab[var6];
                    var10 = var10 - var11_int;
                    var12_int = var12_int - var11_int;
                    var13 = var13 - var14;
                    var15 = var15 - var14;
                    var16 = var16 - var17;
                    var18 = var18 - var17;
                    var19 = var13 * var18 - var16 * var15;
                    var20 = var16 * var12_int - var10 * var18;
                    var21 = var10 * var15 - var13 * var12_int;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        if (var11_int * var19 + var14 * var20 + var17 * var21 <= 0) {
                            statePc = 72;
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
                        this.b(param0);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 22: {
                    try {
                        if (((ww) this).field_jb[param0] != -1) {
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
                        stackOut_23_0 = var7;
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
                        if ((stackIn_24_0 - var8) * (((ww) this).field_J[var6] - ((ww) this).field_J[var5]) - (((ww) this).field_J[var4] - ((ww) this).field_J[var5]) * (var9 - var8) <= 0) {
                            statePc = 72;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var7 < 0) {
                            statePc = 50;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = var8;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 < 0) {
                            statePc = 50;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = var9;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 < 0) {
                            statePc = 50;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = var7;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 > ((ww) this).field_F.field_y) {
                            statePc = 50;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = var8;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 > ((ww) this).field_F.field_y) {
                            statePc = 50;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = var9;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 <= ((ww) this).field_F.field_y) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((ww) this).field_w.field_q = true;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 52: {
                    ((ww) this).field_w.field_q = false;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (!param2) {
                        statePc = 64;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var10 = ((ww) this).field_jb[param0];
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    try {
                        if (var10 == -1) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = this;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (((ww) this).field_e[var10].field_d) {
                            statePc = 72;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        this.g(param0);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 64: {
                    var10 = ((ww) this).field_jb[param0];
                    if (var10 == -1) {
                        statePc = 71;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var11 = ((ww) this).field_e[var10];
                    var12 = ((ww) this).field_db[var10];
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    try {
                        if (var11.field_d) {
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
                        this.j(param0);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 70: {
                    ((ww) this).field_d.b(var12.field_e, var12.field_h, var12.field_n, var12.field_l, var12.field_c, var12.field_j, var11.field_h & 65535, var12.field_k, (int) var11.field_c, (int) var11.field_g);
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    this.j(param0);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ((ww) this).field_M[param0];
                    var3 = ((ww) this).field_bb[param0];
                    var4 = ((ww) this).field_x[param0];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((ww) this).field_X == null) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = this;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((ww) this).field_X[param0] != -1) {
                            statePc = 16;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((ww) this).field_h != null) {
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
                        ((ww) this).field_w.field_b = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    ((ww) this).field_w.field_b = ((ww) this).field_h[param0] & 255;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        if (((ww) this).field_Fb[param0] != -1) {
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
                        ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], bt.field_h[((ww) this).field_t[param0] & 65535]);
                        statePc = 21;
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
                    ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], (float)(((ww) this).field_t[param0] & 65535), (float)(((ww) this).field_o[param0] & 65535), (float)(((ww) this).field_Fb[param0] & 65535));
                    statePc = 21;
                    continue stateLoop;
                }
                case 16: {
                    var5 = -16777216;
                    if (((ww) this).field_h == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (((ww) this).field_Fb[param0] != -1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var6 = var5 | ((ww) this).field_t[param0] & 16777215;
                    ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var6, var6, var6, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var5 | ((ww) this).field_t[param0] & 16777215, var5 | ((ww) this).field_o[param0] & 16777215, var5 | ((ww) this).field_Fb[param0] & 16777215, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean c(int param0) {
        Throwable decompiledCaughtException = null;
        try {
          if (((ww) this).field_h != null) {
          } else {
            return false;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw (RuntimeException) (Object) decompiledCaughtException;
        }
        try {
          if (((ww) this).field_h[param0] != 0) {
          } else {
            return false;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw (RuntimeException) (Object) decompiledCaughtException;
        }
        return true;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        hna var6_ref_hna = null;
        int var6 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_58_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_38_0 = null;
        Object stackOut_57_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ww) this).field_e == null) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var5 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var5 >= ((ww) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6_ref_hna = ((ww) this).field_e[var5];
                    ((ww) this).field_jb[var6_ref_hna.field_j] = var5;
                    var5++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (((ww) this).field_ab) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
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
                        if (((ww) this).field_e == null) {
                            statePc = 67;
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
                        if ((((ww) this).field_P & 256) != 0) {
                            statePc = 19;
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
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((ww) this).field_ub == null) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    var5 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var5 >= ((ww) this).field_g) {
                        statePc = 71;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var6 = ((ww) this).field_ub[var5];
                    this.a(var6, param0, param1);
                    var5++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 19: {
                    var5 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        if (var5 >= ((ww) this).field_g) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (this.c(var5)) {
                            statePc = 31;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = this;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!this.h(var5)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 30: {
                    this.a(var5, param0, param1);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var5++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 32: {
                    if (((ww) this).field_wb != null) {
                        statePc = 47;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var5 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    try {
                        if (var5 >= ((ww) this).field_g) {
                            statePc = 71;
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
                        if (this.c(var5)) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = this;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (this.h(var5)) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                    throw (RuntimeException) (Object) caughtException;
                }
                case 44: {
                    this.a(var5, param0, param1);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var5++;
                    statePc = 34;
                    continue stateLoop;
                }
                case 47: {
                    var5 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (var5 >= 12) {
                        statePc = 71;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var6 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    try {
                        if (var6 >= ((ww) this).field_g) {
                            statePc = 65;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (((ww) this).field_wb[var6] == var5) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 56: {
                    try {
                        if (this.c(var6)) {
                            statePc = 63;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = this;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (this.h(var6)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 63: {
                    this.a(var6, param0, param1);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var6++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 65: {
                    var5++;
                    statePc = 48;
                    continue stateLoop;
                }
                case 67: {
                    var5 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    try {
                        if (var5 >= ((ww) this).field_g) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        this.a(var5, param0, param1);
                        var5++;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, short param1, int param2) {
        int var4 = 0;
        dw var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var4 = cla.field_m[this.a(param0, param2)];
          var5 = ((ww) this).field_d.field_c.a((byte) -52, param1 & 65535);
          var6 = var5.field_c & 255;
          if (var6 == 0) {
            break L0;
          } else {
            var7 = 131586 * param2;
            if (var6 != 256) {
              var8 = var6;
              var9 = 256 - var6;
              var4 = ((var7 & 16711935) * var8 + (var4 & 16711935) * var9 & -16711936) + ((var7 & 65280) * var8 + (var4 & 65280) * var9 & 16711680) >> 8;
              break L0;
            } else {
              var4 = var7;
              break L0;
            }
          }
        }
        L1: {
          var7 = var5.field_i & 255;
          if (var7 == 0) {
            break L1;
          } else {
            L2: {
              // wide iinc 7 256
              var8 = ((var4 & 16711680) >> 16) * var7;
              if (var8 <= 65535) {
                break L2;
              } else {
                var8 = 65535;
                break L2;
              }
            }
            L3: {
              var9 = ((var4 & 65280) >> 8) * var7;
              if (var9 <= 65535) {
                break L3;
              } else {
                var9 = 65535;
                break L3;
              }
            }
            L4: {
              var10 = (var4 & 255) * var7;
              if (var10 <= 65535) {
                break L4;
              } else {
                var10 = 65535;
                break L4;
              }
            }
            var4 = (var8 << 8 & 16711680) + (var9 & 65280) + (var10 >> 8);
            break L1;
          }
        }
        return var4;
    }

    private final void g() {
        Object var1 = null;
        Throwable var2 = null;
        Object stackIn_2_0 = null;
        Object stackOut_1_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((ww) this).field_eb != 0) {
                            statePc = 5;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = this;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((ww) this).field_lb == null) {
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
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    if (((ww) this).field_d.field_u <= 1) {
                        statePc = 14;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var1 = this;
                    // monitorenter this
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        this.c();
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var2;
                }
                case 14: {
                    this.c();
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b() {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ww) this).field_d.field_u <= 1) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = this;
                    // monitorenter this
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        ((ww) this).field_a = false;
                        this.notifyAll();
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var2;
                }
                case 6: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ww) this).field_d.field_u <= 1) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var2 = this;
                    // monitorenter this
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        this.b(param0);
                        // monitorexit var2
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var3;
                }
                case 7: {
                    this.b(param0);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hna var10_ref_hna = null;
        int var11_int = 0;
        int[] var11 = null;
        nsa var11_ref = null;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13_int = 0;
        nsa var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var8 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (param0 != 7) {
                    if (param0 != 8) {
                      if (param0 != 10) {
                        if (param0 != 9) {
                          return;
                        } else {
                          L0: {
                            if (((ww) this).field_j == null) {
                              break L0;
                            } else {
                              var9 = 0;
                              L1: while (true) {
                                if (var9 >= var8) {
                                  break L0;
                                } else {
                                  L2: {
                                    var10 = param1[var9];
                                    if (var10 >= ((ww) this).field_j.length) {
                                      break L2;
                                    } else {
                                      var11 = ((ww) this).field_j[var10];
                                      var12 = 0;
                                      L3: while (true) {
                                        if (var12 >= var11.length) {
                                          break L2;
                                        } else {
                                          var13 = ((ww) this).field_db[var11[var12]];
                                          var13.field_j = var13.field_j + param2 & 16383;
                                          var12++;
                                          continue L3;
                                        }
                                      }
                                    }
                                  }
                                  var9++;
                                  continue L1;
                                }
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L4: {
                          if (((ww) this).field_j == null) {
                            break L4;
                          } else {
                            var9 = 0;
                            L5: while (true) {
                              if (var9 >= var8) {
                                break L4;
                              } else {
                                L6: {
                                  var10 = param1[var9];
                                  if (var10 >= ((ww) this).field_j.length) {
                                    break L6;
                                  } else {
                                    var11 = ((ww) this).field_j[var10];
                                    var12 = 0;
                                    L7: while (true) {
                                      if (var12 >= var11.length) {
                                        break L6;
                                      } else {
                                        var13 = ((ww) this).field_db[var11[var12]];
                                        var13.field_m = var13.field_m * param2 >> 7;
                                        var13.field_g = var13.field_g * param3 >> 7;
                                        var12++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var9++;
                                continue L5;
                              }
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L8: {
                        if (((ww) this).field_j == null) {
                          break L8;
                        } else {
                          var9 = 0;
                          L9: while (true) {
                            if (var9 >= var8) {
                              break L8;
                            } else {
                              L10: {
                                var10 = param1[var9];
                                if (var10 >= ((ww) this).field_j.length) {
                                  break L10;
                                } else {
                                  var11 = ((ww) this).field_j[var10];
                                  var12 = 0;
                                  L11: while (true) {
                                    if (var12 >= var11.length) {
                                      break L10;
                                    } else {
                                      var13 = ((ww) this).field_db[var11[var12]];
                                      var13.field_b = var13.field_b + param2;
                                      var13.field_a = var13.field_a + param3;
                                      var12++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                              var9++;
                              continue L9;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L12: {
                      if (((ww) this).field_Cb == null) {
                        break L12;
                      } else {
                        var9 = 0;
                        L13: while (true) {
                          if (var9 >= var8) {
                            if (((ww) this).field_e == null) {
                              break L12;
                            } else {
                              var9 = 0;
                              L14: while (true) {
                                if (var9 >= ((ww) this).field_m) {
                                  break L12;
                                } else {
                                  var10_ref_hna = ((ww) this).field_e[var9];
                                  var11_ref = ((ww) this).field_db[var9];
                                  var11_ref.field_k = var11_ref.field_k & -16777216 | bt.field_h[tg.a((byte) -123, ((ww) this).field_ob[var10_ref_hna.field_j] & 65535) & 65535] & 16777215;
                                  var9++;
                                  continue L14;
                                }
                              }
                            }
                          } else {
                            L15: {
                              var10 = param1[var9];
                              if (var10 >= ((ww) this).field_Cb.length) {
                                break L15;
                              } else {
                                var11 = ((ww) this).field_Cb[var10];
                                var12 = 0;
                                L16: while (true) {
                                  if (var12 >= var11.length) {
                                    ((ww) this).field_L = true;
                                    break L15;
                                  } else {
                                    L17: {
                                      var13_int = var11[var12];
                                      var14 = ((ww) this).field_ob[var13_int] & 65535;
                                      var15 = var14 >> 10 & 63;
                                      var16 = var14 >> 7 & 7;
                                      var17 = var14 & 127;
                                      var15 = var15 + param2 & 63;
                                      var16 = var16 + param3;
                                      if (var16 >= 0) {
                                        if (var16 <= 7) {
                                          break L17;
                                        } else {
                                          var16 = 7;
                                          break L17;
                                        }
                                      } else {
                                        var16 = 0;
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      var17 = var17 + param4;
                                      if (var17 >= 0) {
                                        if (var17 <= 127) {
                                          break L18;
                                        } else {
                                          var17 = 127;
                                          break L18;
                                        }
                                      } else {
                                        var17 = 0;
                                        break L18;
                                      }
                                    }
                                    ((ww) this).field_ob[var13_int] = (short)(var15 << 10 | var16 << 7 | var17);
                                    var12++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                            var9++;
                            continue L13;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L19: {
                    if (((ww) this).field_Cb == null) {
                      break L19;
                    } else {
                      if (((ww) this).field_h == null) {
                        break L19;
                      } else {
                        var9 = 0;
                        L20: while (true) {
                          if (var9 >= var8) {
                            if (((ww) this).field_e == null) {
                              break L19;
                            } else {
                              var9 = 0;
                              L21: while (true) {
                                if (var9 >= ((ww) this).field_m) {
                                  break L19;
                                } else {
                                  var10_ref_hna = ((ww) this).field_e[var9];
                                  var11_ref = ((ww) this).field_db[var9];
                                  var11_ref.field_k = var11_ref.field_k & 16777215 | 255 - (((ww) this).field_h[var10_ref_hna.field_j] & 255) << 24;
                                  var9++;
                                  continue L21;
                                }
                              }
                            }
                          } else {
                            L22: {
                              var10 = param1[var9];
                              if (var10 >= ((ww) this).field_Cb.length) {
                                break L22;
                              } else {
                                var11 = ((ww) this).field_Cb[var10];
                                var12 = 0;
                                L23: while (true) {
                                  if (var12 >= var11.length) {
                                    break L22;
                                  } else {
                                    L24: {
                                      var13_int = var11[var12];
                                      var14 = (((ww) this).field_h[var13_int] & 255) + param2 * 8;
                                      if (var14 >= 0) {
                                        if (var14 <= 255) {
                                          break L24;
                                        } else {
                                          var14 = 255;
                                          break L24;
                                        }
                                      } else {
                                        var14 = 0;
                                        break L24;
                                      }
                                    }
                                    ((ww) this).field_h[var13_int] = (byte)var14;
                                    var12++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                            var9++;
                            continue L20;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                var9 = 0;
                L25: while (true) {
                  if (var9 >= var8) {
                    return;
                  } else {
                    L26: {
                      var10 = param1[var9];
                      if (var10 >= ((ww) this).field_sb.length) {
                        break L26;
                      } else {
                        var11 = ((ww) this).field_sb[var10];
                        var12 = 0;
                        L27: while (true) {
                          if (var12 >= var11.length) {
                            break L26;
                          } else {
                            var13_int = var11[var12];
                            ((ww) this).field_xb[var13_int] = ((ww) this).field_xb[var13_int] - ((ww) this).field_gb;
                            ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] - ((ww) this).field_H;
                            ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] - ((ww) this).field_Y;
                            ((ww) this).field_xb[var13_int] = ((ww) this).field_xb[var13_int] * param2 / 128;
                            ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] * param3 / 128;
                            ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] * param4 / 128;
                            ((ww) this).field_xb[var13_int] = ((ww) this).field_xb[var13_int] + ((ww) this).field_gb;
                            ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] + ((ww) this).field_H;
                            ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] + ((ww) this).field_Y;
                            var12++;
                            continue L27;
                          }
                        }
                      }
                    }
                    var9++;
                    continue L25;
                  }
                }
              }
            } else {
              var9 = 0;
              L28: while (true) {
                if (var9 >= var8) {
                  return;
                } else {
                  L29: {
                    var10 = param1[var9];
                    if (var10 >= ((ww) this).field_sb.length) {
                      break L29;
                    } else {
                      var11 = ((ww) this).field_sb[var10];
                      if ((param5 & 1) != 0) {
                        var12 = 0;
                        L30: while (true) {
                          if (var12 >= var11.length) {
                            break L29;
                          } else {
                            L31: {
                              var13_int = var11[var12];
                              ((ww) this).field_xb[var13_int] = ((ww) this).field_xb[var13_int] - ((ww) this).field_gb;
                              ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] - ((ww) this).field_H;
                              ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] - ((ww) this).field_Y;
                              if (param2 == 0) {
                                break L31;
                              } else {
                                var14 = qu.field_b[param2];
                                var15 = qu.field_d[param2];
                                var16 = ((ww) this).field_rb[var13_int] * var15 - ((ww) this).field_T[var13_int] * var14 + 16383 >> 14;
                                ((ww) this).field_T[var13_int] = ((ww) this).field_rb[var13_int] * var14 + ((ww) this).field_T[var13_int] * var15 + 16383 >> 14;
                                ((ww) this).field_rb[var13_int] = var16;
                                break L31;
                              }
                            }
                            L32: {
                              if (param4 == 0) {
                                break L32;
                              } else {
                                var14 = qu.field_b[param4];
                                var15 = qu.field_d[param4];
                                var16 = ((ww) this).field_rb[var13_int] * var14 + ((ww) this).field_xb[var13_int] * var15 + 16383 >> 14;
                                ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] * var15 - ((ww) this).field_xb[var13_int] * var14 + 16383 >> 14;
                                ((ww) this).field_xb[var13_int] = var16;
                                break L32;
                              }
                            }
                            L33: {
                              if (param3 == 0) {
                                break L33;
                              } else {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = ((ww) this).field_T[var13_int] * var14 + ((ww) this).field_xb[var13_int] * var15 + 16383 >> 14;
                                ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] * var15 - ((ww) this).field_xb[var13_int] * var14 + 16383 >> 14;
                                ((ww) this).field_xb[var13_int] = var16;
                                break L33;
                              }
                            }
                            ((ww) this).field_xb[var13_int] = ((ww) this).field_xb[var13_int] + ((ww) this).field_gb;
                            ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] + ((ww) this).field_H;
                            ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] + ((ww) this).field_Y;
                            var12++;
                            continue L30;
                          }
                        }
                      } else {
                        var12 = 0;
                        L34: while (true) {
                          if (var12 >= var11.length) {
                            break L29;
                          } else {
                            L35: {
                              var13_int = var11[var12];
                              ((ww) this).field_xb[var13_int] = ((ww) this).field_xb[var13_int] - ((ww) this).field_gb;
                              ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] - ((ww) this).field_H;
                              ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] - ((ww) this).field_Y;
                              if (param4 == 0) {
                                break L35;
                              } else {
                                var14 = qu.field_b[param4];
                                var15 = qu.field_d[param4];
                                var16 = ((ww) this).field_rb[var13_int] * var14 + ((ww) this).field_xb[var13_int] * var15 + 16383 >> 14;
                                ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] * var15 - ((ww) this).field_xb[var13_int] * var14 + 16383 >> 14;
                                ((ww) this).field_xb[var13_int] = var16;
                                break L35;
                              }
                            }
                            L36: {
                              if (param2 == 0) {
                                break L36;
                              } else {
                                var14 = qu.field_b[param2];
                                var15 = qu.field_d[param2];
                                var16 = ((ww) this).field_rb[var13_int] * var15 - ((ww) this).field_T[var13_int] * var14 + 16383 >> 14;
                                ((ww) this).field_T[var13_int] = ((ww) this).field_rb[var13_int] * var14 + ((ww) this).field_T[var13_int] * var15 + 16383 >> 14;
                                ((ww) this).field_rb[var13_int] = var16;
                                break L36;
                              }
                            }
                            L37: {
                              if (param3 == 0) {
                                break L37;
                              } else {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = ((ww) this).field_T[var13_int] * var14 + ((ww) this).field_xb[var13_int] * var15 + 16383 >> 14;
                                ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] * var15 - ((ww) this).field_xb[var13_int] * var14 + 16383 >> 14;
                                ((ww) this).field_xb[var13_int] = var16;
                                break L37;
                              }
                            }
                            ((ww) this).field_xb[var13_int] = ((ww) this).field_xb[var13_int] + ((ww) this).field_gb;
                            ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] + ((ww) this).field_H;
                            ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] + ((ww) this).field_Y;
                            var12++;
                            continue L34;
                          }
                        }
                      }
                    }
                  }
                  var9++;
                  continue L28;
                }
              }
            }
          } else {
            L38: {
              param2 = param2 << 4;
              param3 = param3 << 4;
              param4 = param4 << 4;
              if (((ww) this).field_S) {
                break L38;
              } else {
                var9 = 0;
                L39: while (true) {
                  if (var9 >= ((ww) this).field_p) {
                    ((ww) this).field_S = true;
                    break L38;
                  } else {
                    ((ww) this).field_xb[var9] = ((ww) this).field_xb[var9] << 4;
                    ((ww) this).field_rb[var9] = ((ww) this).field_rb[var9] << 4;
                    ((ww) this).field_T[var9] = ((ww) this).field_T[var9] << 4;
                    var9++;
                    continue L39;
                  }
                }
              }
            }
            var9 = 0;
            L40: while (true) {
              if (var9 >= var8) {
                return;
              } else {
                L41: {
                  var10 = param1[var9];
                  if (var10 >= ((ww) this).field_sb.length) {
                    break L41;
                  } else {
                    var11 = ((ww) this).field_sb[var10];
                    var12 = 0;
                    L42: while (true) {
                      if (var12 >= var11.length) {
                        break L41;
                      } else {
                        var13_int = var11[var12];
                        ((ww) this).field_xb[var13_int] = ((ww) this).field_xb[var13_int] + param2;
                        ((ww) this).field_rb[var13_int] = ((ww) this).field_rb[var13_int] + param3;
                        ((ww) this).field_T[var13_int] = ((ww) this).field_T[var13_int] + param4;
                        var12++;
                        continue L42;
                      }
                    }
                  }
                }
                var9++;
                continue L40;
              }
            }
          }
        } else {
          L43: {
            param2 = param2 << 4;
            param3 = param3 << 4;
            param4 = param4 << 4;
            if (((ww) this).field_S) {
              break L43;
            } else {
              var9 = 0;
              L44: while (true) {
                if (var9 >= ((ww) this).field_p) {
                  ((ww) this).field_S = true;
                  break L43;
                } else {
                  ((ww) this).field_xb[var9] = ((ww) this).field_xb[var9] << 4;
                  ((ww) this).field_rb[var9] = ((ww) this).field_rb[var9] << 4;
                  ((ww) this).field_T[var9] = ((ww) this).field_T[var9] << 4;
                  var9++;
                  continue L44;
                }
              }
            }
          }
          var9 = 0;
          ((ww) this).field_gb = 0;
          ((ww) this).field_H = 0;
          ((ww) this).field_Y = 0;
          var10 = 0;
          L45: while (true) {
            if (var10 >= var8) {
              L46: {
                if (var9 <= 0) {
                  ((ww) this).field_gb = param2;
                  ((ww) this).field_H = param3;
                  ((ww) this).field_Y = param4;
                  break L46;
                } else {
                  ((ww) this).field_gb = ((ww) this).field_gb / var9 + param2;
                  ((ww) this).field_H = ((ww) this).field_H / var9 + param3;
                  ((ww) this).field_Y = ((ww) this).field_Y / var9 + param4;
                  break L46;
                }
              }
              return;
            } else {
              L47: {
                var11_int = param1[var10];
                if (var11_int >= ((ww) this).field_sb.length) {
                  break L47;
                } else {
                  var12_ref_int__ = ((ww) this).field_sb[var11_int];
                  var13_int = 0;
                  L48: while (true) {
                    if (var13_int >= var12_ref_int__.length) {
                      break L47;
                    } else {
                      var14 = var12_ref_int__[var13_int];
                      ((ww) this).field_gb = ((ww) this).field_gb + ((ww) this).field_xb[var14];
                      ((ww) this).field_H = ((ww) this).field_H + ((ww) this).field_rb[var14];
                      ((ww) this).field_Y = ((ww) this).field_Y + ((ww) this).field_T[var14];
                      var9++;
                      var13_int++;
                      continue L48;
                    }
                  }
                }
              }
              var10++;
              continue L45;
            }
          }
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        ww var4 = null;
        ww var5 = null;
        Object stackIn_12_0 = null;
        ww stackIn_12_1 = null;
        ww stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        Object stackIn_14_0 = null;
        ww stackIn_14_1 = null;
        ww stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        Object stackIn_15_0 = null;
        ww stackIn_15_1 = null;
        ww stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        Object stackOut_11_0 = null;
        ww stackOut_11_1 = null;
        ww stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        Object stackOut_12_0 = null;
        ww stackOut_12_1 = null;
        ww stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        Object stackOut_14_0 = null;
        ww stackOut_14_1 = null;
        ww stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    this.a(Thread.currentThread());
                    if (param0 != 1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var5 = ((ww) this).field_n;
                    var4 = ((ww) this).field_pb;
                    statePc = 11;
                    continue stateLoop;
                }
                case 2: {
                    if (param0 != 2) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var5 = ((ww) this).field_qb;
                    var4 = ((ww) this).field_u;
                    statePc = 11;
                    continue stateLoop;
                }
                case 4: {
                    if (param0 != 3) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = ((ww) this).field_K;
                    var4 = ((ww) this).field_Q;
                    statePc = 11;
                    continue stateLoop;
                }
                case 6: {
                    if (param0 != 4) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5 = ((ww) this).field_tb;
                    var4 = ((ww) this).field_Gb;
                    statePc = 11;
                    continue stateLoop;
                }
                case 8: {
                    if (param0 != 5) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = ((ww) this).field_fb;
                    var4 = ((ww) this).field_N;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    var5 = new ww(((ww) this).field_d);
                    var4 = new ww(((ww) this).field_d);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        stackOut_11_0 = this;
                        stackOut_11_1 = (ww) var4;
                        stackOut_11_2 = (ww) var5;
                        stackOut_11_3 = param1;
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        stackIn_14_3 = stackOut_11_3;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        if (param0 == 0) {
                            statePc = 14;
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
                        stackOut_12_0 = this;
                        stackOut_12_1 = (ww) (Object) stackIn_12_1;
                        stackOut_12_2 = (ww) (Object) stackIn_12_2;
                        stackOut_12_3 = stackIn_12_3;
                        stackOut_12_4 = 1;
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        stackIn_15_3 = stackOut_12_3;
                        stackIn_15_4 = stackOut_12_4;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = this;
                    stackOut_14_1 = (ww) (Object) stackIn_14_1;
                    stackOut_14_2 = (ww) (Object) stackIn_14_2;
                    stackOut_14_3 = stackIn_14_3;
                    stackOut_14_4 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    stackIn_15_4 = stackOut_14_4;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return this.a(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4 != 0, param2);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((ww) this).field_F.field_h) {
            L1: {
              var2 = ((ww) this).field_M[param0];
              var3 = ((ww) this).field_bb[param0];
              var4 = ((ww) this).field_x[param0];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              if (((ww) this).field_s[var2] <= ((ww) this).field_F.field_L) {
                if (((ww) this).field_s[var2] <= ((ww) this).field_F.field_M) {
                  break L1;
                } else {
                  var5 = (((ww) this).field_F.field_M - ((ww) this).field_s[var2]) * 255 / (((ww) this).field_F.field_M - ((ww) this).field_F.field_L);
                  break L1;
                }
              } else {
                var5 = 255;
                break L1;
              }
            }
            L2: {
              if (((ww) this).field_s[var3] <= ((ww) this).field_F.field_L) {
                if (((ww) this).field_s[var3] <= ((ww) this).field_F.field_M) {
                  break L2;
                } else {
                  var6 = (((ww) this).field_F.field_M - ((ww) this).field_s[var3]) * 255 / (((ww) this).field_F.field_M - ((ww) this).field_F.field_L);
                  break L2;
                }
              } else {
                var6 = 255;
                break L2;
              }
            }
            L3: {
              if (((ww) this).field_s[var4] <= ((ww) this).field_F.field_L) {
                if (((ww) this).field_s[var4] <= ((ww) this).field_F.field_M) {
                  break L3;
                } else {
                  var7 = (((ww) this).field_F.field_M - ((ww) this).field_s[var4]) * 255 / (((ww) this).field_F.field_M - ((ww) this).field_F.field_L);
                  break L3;
                }
              } else {
                var7 = 255;
                break L3;
              }
            }
            L4: {
              if (((ww) this).field_h != null) {
                ((ww) this).field_w.field_b = ((ww) this).field_h[param0] & 255;
                break L4;
              } else {
                ((ww) this).field_w.field_b = 0;
                break L4;
              }
            }
            L5: {
              if (((ww) this).field_X == null) {
                break L5;
              } else {
                if (((ww) this).field_X[param0] != -1) {
                  L6: {
                    var8 = -16777216;
                    if (((ww) this).field_h == null) {
                      break L6;
                    } else {
                      var8 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                      break L6;
                    }
                  }
                  if (((ww) this).field_Fb[param0] != -1) {
                    ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var8 | ((ww) this).field_t[param0] & 16777215, var8 | ((ww) this).field_o[param0] & 16777215, var8 | ((ww) this).field_Fb[param0] & 16777215, ((ww) this).field_F.field_D, var5, var6, var7, (int) ((ww) this).field_X[param0]);
                    break L0;
                  } else {
                    var9 = var8 | ((ww) this).field_t[param0] & 16777215;
                    ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var9, var9, var9, ((ww) this).field_F.field_D, var5, var6, var7, (int) ((ww) this).field_X[param0]);
                    break L0;
                  }
                } else {
                  break L5;
                }
              }
            }
            if (((ww) this).field_Fb[param0] != -1) {
              ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], l.a(var5 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var6 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_o[param0] & 65535], 20048), l.a(var7 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_Fb[param0] & 65535], 20048));
              break L0;
            } else {
              ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], l.a(var5 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var6 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var7 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048));
              break L0;
            }
          } else {
            L7: {
              var2 = ((ww) this).field_M[param0];
              var3 = ((ww) this).field_bb[param0];
              var4 = ((ww) this).field_x[param0];
              var5 = ((ww) this).field_mb[var2] - ((ww) this).field_F.field_B;
              if (var5 <= 255) {
                if (var5 >= 0) {
                  break L7;
                } else {
                  var5 = 0;
                  break L7;
                }
              } else {
                var5 = 255;
                break L7;
              }
            }
            L8: {
              var6 = ((ww) this).field_mb[var3] - ((ww) this).field_F.field_B;
              if (var6 <= 255) {
                if (var6 >= 0) {
                  break L8;
                } else {
                  var6 = 0;
                  break L8;
                }
              } else {
                var6 = 255;
                break L8;
              }
            }
            L9: {
              var7 = ((ww) this).field_mb[var4] - ((ww) this).field_F.field_B;
              if (var7 <= 255) {
                if (var7 >= 0) {
                  break L9;
                } else {
                  var7 = 0;
                  break L9;
                }
              } else {
                var7 = 255;
                break L9;
              }
            }
            var8 = var5 + var6 + var7;
            if (var8 != 765) {
              if (var8 != 0) {
                L10: {
                  if (((ww) this).field_h != null) {
                    ((ww) this).field_w.field_b = ((ww) this).field_h[param0] & 255;
                    break L10;
                  } else {
                    ((ww) this).field_w.field_b = 0;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (((ww) this).field_X == null) {
                      break L12;
                    } else {
                      if (((ww) this).field_X[param0] != -1) {
                        L13: {
                          var9 = -16777216;
                          if (((ww) this).field_h == null) {
                            break L13;
                          } else {
                            var9 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                            break L13;
                          }
                        }
                        if (((ww) this).field_Fb[param0] != -1) {
                          ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var9 | ((ww) this).field_t[param0] & 16777215, var9 | ((ww) this).field_o[param0] & 16777215, var9 | ((ww) this).field_Fb[param0] & 16777215, ((ww) this).field_F.field_D, var5, var6, var7, (int) ((ww) this).field_X[param0]);
                          break L11;
                        } else {
                          var10 = var9 | ((ww) this).field_t[param0] & 16777215;
                          ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var10, var10, var10, ((ww) this).field_F.field_D, var5, var6, var7, (int) ((ww) this).field_X[param0]);
                          break L11;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (((ww) this).field_Fb[param0] != -1) {
                    ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], l.a(var5 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var6 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_o[param0] & 65535], 20048), l.a(var7 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_Fb[param0] & 65535], 20048));
                    break L11;
                  } else {
                    ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], l.a(var5 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var6 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var7 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048));
                    break L11;
                  }
                }
                break L0;
              } else {
                this.f(param0);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6_int = 0;
        hna var6 = null;
        int var7_int = 0;
        nsa var7 = null;
        int var8 = 0;
        int var9 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if ((((ww) this).field_P & 524288) == 524288) {
          } else {
            throw new IllegalStateException(field_Hb);
          }
        } catch (java.lang.IllegalStateException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw (RuntimeException) (Object) decompiledCaughtException;
        }
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((ww) this).field_g) {
            L1: {
              if (((ww) this).field_e == null) {
                break L1;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= ((ww) this).field_m) {
                    break L1;
                  } else {
                    var6 = ((ww) this).field_e[var5];
                    var7 = ((ww) this).field_db[var5];
                    var7.field_k = var7.field_k & -16777216 | bt.field_h[tg.a((byte) -120, ((ww) this).field_ob[var6.field_j] & 65535)] & 16777215;
                    var5++;
                    continue L2;
                  }
                }
              }
            }
            try {
              L3: {
                if (((ww) this).field_eb != 2) {
                  break L3;
                } else {
                  ((ww) this).field_eb = 1;
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            throw (RuntimeException) (Object) decompiledCaughtException;
          } else {
            L4: {
              var6_int = ((ww) this).field_ob[var5] & 65535;
              var7_int = var6_int >> 10 & 63;
              var8 = var6_int >> 7 & 7;
              var9 = var6_int & 127;
              if (param0 == -1) {
                break L4;
              } else {
                var7_int = var7_int + ((param0 - var7_int) * param3 >> 7);
                break L4;
              }
            }
            L5: {
              if (param1 == -1) {
                break L5;
              } else {
                var8 = var8 + ((param1 - var8) * param3 >> 7);
                break L5;
              }
            }
            L6: {
              if (param2 == -1) {
                break L6;
              } else {
                var9 = var9 + ((param2 - var9) * param3 >> 7);
                break L6;
              }
            }
            ((ww) this).field_ob[var5] = (short)(var7_int << 10 | var8 << 7 | var9);
            var5++;
            continue L0;
          }
        }
    }

    private final ka a(ww param0, ww param1, int param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ww var10_ref = null;
        ww var11_ref = null;
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_28_0 = 0;
        gna[] stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        gna[] stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        gna[] stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        gna[] stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        gna stackIn_148_2 = null;
        int stackIn_179_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_226_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        gna[] stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        gna[] stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        Object stackOut_147_2 = null;
        gna[] stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        gna[] stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        gna stackOut_146_2 = null;
        int stackOut_178_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_224_0 = 0;
        L0: {
          param0.field_r = ((ww) this).field_r;
          if (!((ww) this).field_r) {
            break L0;
          } else {
            param0.field_O = ((ww) this).field_O;
            param0.field_cb = ((ww) this).field_cb;
            param0.field_vb = ((ww) this).field_vb;
            param0.field_R = ((ww) this).field_R;
            param0.field_f = ((ww) this).field_f;
            param0.field_Bb = ((ww) this).field_Bb;
            param0.field_U = ((ww) this).field_U;
            break L0;
          }
        }
        L1: {
          param0.field_Db = ((ww) this).field_Db;
          param0.field_ib = ((ww) this).field_ib;
          param0.field_p = ((ww) this).field_p;
          param0.field_Z = ((ww) this).field_Z;
          param0.field_g = ((ww) this).field_g;
          param0.field_m = ((ww) this).field_m;
          if ((param2 & 256) == 0) {
            param0.field_ab = ((ww) this).field_ab;
            break L1;
          } else {
            param0.field_ab = true;
            break L1;
          }
        }
        L2: {
          if ((param2 & 7) != 7) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          stackOut_8_0 = stackIn_8_0;
          stackIn_10_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if ((param2 & 32) == 0) {
            stackOut_10_0 = stackIn_10_0;
            stackOut_10_1 = 0;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L3;
          } else {
            stackOut_9_0 = stackIn_9_0;
            stackOut_9_1 = 1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            break L3;
          }
        }
        L4: {
          L5: {
            var6 = stackIn_11_0 | stackIn_11_1;
            if (var6 != 0) {
              break L5;
            } else {
              if ((param2 & 1) == 0) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                break L5;
              }
            }
          }
          stackOut_14_0 = 1;
          stackIn_16_0 = stackOut_14_0;
          break L4;
        }
        L6: {
          L7: {
            var7 = stackIn_16_0;
            if (var6 != 0) {
              break L7;
            } else {
              if ((param2 & 2) == 0) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L6;
              } else {
                break L7;
              }
            }
          }
          stackOut_19_0 = 1;
          stackIn_21_0 = stackOut_19_0;
          break L6;
        }
        L8: {
          L9: {
            var8 = stackIn_21_0;
            if (var6 != 0) {
              break L9;
            } else {
              if ((param2 & 4) != 0) {
                break L9;
              } else {
                if ((param2 & 16) == 0) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L8;
                } else {
                  break L9;
                }
              }
            }
          }
          stackOut_26_0 = 1;
          stackIn_28_0 = stackOut_26_0;
          break L8;
        }
        L10: {
          L11: {
            var9 = stackIn_28_0;
            if (var7 != 0) {
              break L11;
            } else {
              if (var8 != 0) {
                break L11;
              } else {
                if (var9 == 0) {
                  param0.field_xb = ((ww) this).field_xb;
                  param0.field_rb = ((ww) this).field_rb;
                  param0.field_T = ((ww) this).field_T;
                  break L10;
                } else {
                  break L11;
                }
              }
            }
          }
          L12: {
            if (var7 == 0) {
              param0.field_xb = ((ww) this).field_xb;
              break L12;
            } else {
              L13: {
                L14: {
                  if (param1.field_xb == null) {
                    break L14;
                  } else {
                    if (param1.field_xb.length >= ((ww) this).field_p) {
                      param0.field_xb = param1.field_xb;
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                param1.field_xb = new int[((ww) this).field_p];
                param0.field_xb = new int[((ww) this).field_p];
                break L13;
              }
              var10 = 0;
              L15: while (true) {
                if (var10 >= ((ww) this).field_p) {
                  break L12;
                } else {
                  param0.field_xb[var10] = ((ww) this).field_xb[var10];
                  var10++;
                  continue L15;
                }
              }
            }
          }
          L16: {
            if (var8 == 0) {
              param0.field_rb = ((ww) this).field_rb;
              break L16;
            } else {
              L17: {
                L18: {
                  if (param1.field_rb == null) {
                    break L18;
                  } else {
                    if (param1.field_rb.length >= ((ww) this).field_p) {
                      param0.field_rb = param1.field_rb;
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                param1.field_rb = new int[((ww) this).field_p];
                param0.field_rb = new int[((ww) this).field_p];
                break L17;
              }
              var10 = 0;
              L19: while (true) {
                if (var10 >= ((ww) this).field_p) {
                  break L16;
                } else {
                  param0.field_rb[var10] = ((ww) this).field_rb[var10];
                  var10++;
                  continue L19;
                }
              }
            }
          }
          if (var9 == 0) {
            param0.field_T = ((ww) this).field_T;
            break L10;
          } else {
            L20: {
              L21: {
                if (param1.field_T == null) {
                  break L21;
                } else {
                  if (param1.field_T.length >= ((ww) this).field_p) {
                    param0.field_T = param1.field_T;
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              param1.field_T = new int[((ww) this).field_p];
              param0.field_T = new int[((ww) this).field_p];
              break L20;
            }
            var10 = 0;
            L22: while (true) {
              if (var10 >= ((ww) this).field_p) {
                break L10;
              } else {
                param0.field_T[var10] = ((ww) this).field_T[var10];
                var10++;
                continue L22;
              }
            }
          }
        }
        L23: {
          if ((param2 & 540800) == 0) {
            param0.field_ob = ((ww) this).field_ob;
            break L23;
          } else {
            L24: {
              L25: {
                if (param1.field_ob == null) {
                  break L25;
                } else {
                  if (param1.field_ob.length >= ((ww) this).field_g) {
                    param0.field_ob = param1.field_ob;
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
              var10 = ((ww) this).field_g;
              param1.field_ob = new short[var10];
              param0.field_ob = new short[var10];
              break L24;
            }
            var10 = 0;
            L26: while (true) {
              if (var10 >= ((ww) this).field_g) {
                break L23;
              } else {
                param0.field_ob[var10] = ((ww) this).field_ob[var10];
                var10++;
                continue L26;
              }
            }
          }
        }
        L27: {
          if ((param2 & 618520) == 0) {
            if ((param2 & 128) == 0) {
              L28: {
                if (!param4) {
                  break L28;
                } else {
                  this.a(false);
                  break L28;
                }
              }
              param0.field_t = ((ww) this).field_t;
              param0.field_o = ((ww) this).field_o;
              param0.field_Fb = ((ww) this).field_Fb;
              param0.field_eb = ((ww) this).field_eb;
              break L27;
            } else {
              L29: {
                if (!param4) {
                  break L29;
                } else {
                  this.a(false);
                  break L29;
                }
              }
              L30: {
                if (((ww) this).field_t == null) {
                  break L30;
                } else {
                  L31: {
                    L32: {
                      if (param1.field_t == null) {
                        break L32;
                      } else {
                        if (param1.field_t.length >= ((ww) this).field_g) {
                          param0.field_t = param1.field_t;
                          param0.field_o = param1.field_o;
                          param0.field_Fb = param1.field_Fb;
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    var10 = ((ww) this).field_g;
                    param1.field_t = new int[var10];
                    param0.field_t = new int[var10];
                    param1.field_o = new int[var10];
                    param0.field_o = new int[var10];
                    param1.field_Fb = new int[var10];
                    param0.field_Fb = new int[var10];
                    break L31;
                  }
                  var10 = 0;
                  L33: while (true) {
                    if (var10 >= ((ww) this).field_g) {
                      break L30;
                    } else {
                      param0.field_t[var10] = ((ww) this).field_t[var10];
                      param0.field_o[var10] = ((ww) this).field_o[var10];
                      param0.field_Fb[var10] = ((ww) this).field_Fb[var10];
                      var10++;
                      continue L33;
                    }
                  }
                }
              }
              param0.field_eb = ((ww) this).field_eb;
              break L27;
            }
          } else {
            param0.field_eb = 0;
            var10_ref = param0;
            var11_ref = param0;
            param0.field_Fb = null;
            var11_ref.field_o = null;
            var10_ref.field_t = null;
            break L27;
          }
        }
        L34: {
          if ((param2 & 256) == 0) {
            param0.field_h = ((ww) this).field_h;
            break L34;
          } else {
            L35: {
              L36: {
                if (param1.field_h == null) {
                  break L36;
                } else {
                  if (param1.field_h.length >= ((ww) this).field_g) {
                    param0.field_h = param1.field_h;
                    break L35;
                  } else {
                    break L36;
                  }
                }
              }
              var10 = ((ww) this).field_g;
              param1.field_h = new byte[var10];
              param0.field_h = new byte[var10];
              break L35;
            }
            if (((ww) this).field_h == null) {
              var10 = 0;
              L37: while (true) {
                if (var10 >= ((ww) this).field_g) {
                  break L34;
                } else {
                  param0.field_h[var10] = (byte) 0;
                  var10++;
                  continue L37;
                }
              }
            } else {
              var10 = 0;
              L38: while (true) {
                if (var10 >= ((ww) this).field_g) {
                  break L34;
                } else {
                  param0.field_h[var10] = ((ww) this).field_h[var10];
                  var10++;
                  continue L38;
                }
              }
            }
          }
        }
        L39: {
          L40: {
            if ((param2 & 8) != 0) {
              break L40;
            } else {
              if ((param2 & 16) == 0) {
                L41: {
                  if (!param4) {
                    break L41;
                  } else {
                    this.g();
                    break L41;
                  }
                }
                param0.field_lb = ((ww) this).field_lb;
                param0.field_I = ((ww) this).field_I;
                break L39;
              } else {
                break L40;
              }
            }
          }
          L42: {
            L43: {
              if (param1.field_lb == null) {
                break L43;
              } else {
                if (param1.field_lb.length >= ((ww) this).field_Z) {
                  param0.field_lb = param1.field_lb;
                  break L42;
                } else {
                  break L43;
                }
              }
            }
            var10 = ((ww) this).field_Z;
            param1.field_lb = new oha[var10];
            param0.field_lb = new oha[var10];
            break L42;
          }
          L44: {
            if (((ww) this).field_lb == null) {
              param0.field_lb = null;
              break L44;
            } else {
              var10 = 0;
              L45: while (true) {
                if (var10 >= ((ww) this).field_Z) {
                  break L44;
                } else {
                  param0.field_lb[var10] = new oha(((ww) this).field_lb[var10]);
                  var10++;
                  continue L45;
                }
              }
            }
          }
          if (((ww) this).field_I == null) {
            param0.field_I = null;
            break L39;
          } else {
            L46: {
              L47: {
                if (param1.field_I == null) {
                  break L47;
                } else {
                  if (param1.field_I.length >= ((ww) this).field_g) {
                    param0.field_I = param1.field_I;
                    break L46;
                  } else {
                    break L47;
                  }
                }
              }
              var10 = ((ww) this).field_g;
              param1.field_I = new gna[var10];
              param0.field_I = new gna[var10];
              break L46;
            }
            var10 = 0;
            L48: while (true) {
              if (var10 >= ((ww) this).field_g) {
                break L39;
              } else {
                L49: {
                  stackOut_144_0 = param0.field_I;
                  stackOut_144_1 = var10;
                  stackIn_147_0 = stackOut_144_0;
                  stackIn_147_1 = stackOut_144_1;
                  stackIn_145_0 = stackOut_144_0;
                  stackIn_145_1 = stackOut_144_1;
                  if (((ww) this).field_I[var10] == null) {
                    stackOut_147_0 = (gna[]) (Object) stackIn_147_0;
                    stackOut_147_1 = stackIn_147_1;
                    stackOut_147_2 = null;
                    stackIn_148_0 = stackOut_147_0;
                    stackIn_148_1 = stackOut_147_1;
                    stackIn_148_2 = (gna) (Object) stackOut_147_2;
                    break L49;
                  } else {
                    stackOut_145_0 = (gna[]) (Object) stackIn_145_0;
                    stackOut_145_1 = stackIn_145_1;
                    stackIn_146_0 = stackOut_145_0;
                    stackIn_146_1 = stackOut_145_1;
                    stackOut_146_0 = (gna[]) (Object) stackIn_146_0;
                    stackOut_146_1 = stackIn_146_1;
                    stackOut_146_2 = new gna(((ww) this).field_I[var10]);
                    stackIn_148_0 = stackOut_146_0;
                    stackIn_148_1 = stackOut_146_1;
                    stackIn_148_2 = stackOut_146_2;
                    break L49;
                  }
                }
                stackIn_148_0[stackIn_148_1] = stackIn_148_2;
                var10++;
                continue L48;
              }
            }
          }
        }
        L50: {
          if ((param2 & 32768) == 0) {
            param0.field_X = ((ww) this).field_X;
            break L50;
          } else {
            if (((ww) this).field_X != null) {
              L51: {
                L52: {
                  if (param1.field_X == null) {
                    break L52;
                  } else {
                    if (param1.field_X.length >= ((ww) this).field_g) {
                      param0.field_X = param1.field_X;
                      break L51;
                    } else {
                      break L52;
                    }
                  }
                }
                var10 = ((ww) this).field_g;
                param1.field_X = new short[var10];
                param0.field_X = new short[var10];
                break L51;
              }
              var10 = 0;
              L53: while (true) {
                if (var10 >= ((ww) this).field_g) {
                  break L50;
                } else {
                  param0.field_X[var10] = ((ww) this).field_X[var10];
                  var10++;
                  continue L53;
                }
              }
            } else {
              param0.field_X = null;
              break L50;
            }
          }
        }
        L54: {
          if ((param2 & 65536) == 0) {
            param0.field_k = ((ww) this).field_k;
            break L54;
          } else {
            if (((ww) this).field_k != null) {
              L55: {
                L56: {
                  if (param1.field_k == null) {
                    break L56;
                  } else {
                    if (param1.field_k.length >= ((ww) this).field_g) {
                      param0.field_k = param1.field_k;
                      break L55;
                    } else {
                      break L56;
                    }
                  }
                }
                L57: {
                  if (!param3) {
                    stackOut_178_0 = ((ww) this).field_g;
                    stackIn_179_0 = stackOut_178_0;
                    break L57;
                  } else {
                    stackOut_177_0 = ((ww) this).field_g + 100;
                    stackIn_179_0 = stackOut_177_0;
                    break L57;
                  }
                }
                var10 = stackIn_179_0;
                param1.field_k = new byte[var10];
                param0.field_k = new byte[var10];
                break L55;
              }
              var10 = 0;
              L58: while (true) {
                if (var10 >= ((ww) this).field_g) {
                  break L54;
                } else {
                  param0.field_k[var10] = ((ww) this).field_k[var10];
                  var10++;
                  continue L58;
                }
              }
            } else {
              param0.field_k = null;
              break L54;
            }
          }
        }
        L59: {
          if ((param2 & 50560) == 0) {
            param0.field_db = ((ww) this).field_db;
            break L59;
          } else {
            L60: {
              if (param1.field_db == null) {
                break L60;
              } else {
                if (param1.field_db.length >= ((ww) this).field_m) {
                  param0.field_db = param1.field_db;
                  var10 = 0;
                  L61: while (true) {
                    if (var10 >= ((ww) this).field_m) {
                      break L59;
                    } else {
                      param0.field_db[var10].a(((ww) this).field_db[var10], (byte) -6);
                      var10++;
                      continue L61;
                    }
                  }
                } else {
                  break L60;
                }
              }
            }
            var10 = ((ww) this).field_m;
            param1.field_db = new nsa[var10];
            param0.field_db = new nsa[var10];
            var11 = 0;
            L62: while (true) {
              if (var11 >= ((ww) this).field_m) {
                break L59;
              } else {
                param0.field_db[var11] = ((ww) this).field_db[var11].a(-2707);
                var11++;
                continue L62;
              }
            }
          }
        }
        L63: {
          L64: {
            if (((ww) this).field_W == null) {
              break L64;
            } else {
              if ((param2 & 16) == 0) {
                break L64;
              } else {
                L65: {
                  L66: {
                    if (param1.field_W == null) {
                      break L66;
                    } else {
                      if (param1.field_W.length >= ((ww) this).field_g) {
                        param0.field_W = param1.field_W;
                        break L65;
                      } else {
                        break L66;
                      }
                    }
                  }
                  L67: {
                    if (!param3) {
                      stackOut_210_0 = ((ww) this).field_g;
                      stackIn_211_0 = stackOut_210_0;
                      break L67;
                    } else {
                      stackOut_209_0 = ((ww) this).field_g + 100;
                      stackIn_211_0 = stackOut_209_0;
                      break L67;
                    }
                  }
                  var10 = stackIn_211_0;
                  param1.field_W = new float[var10][3];
                  param0.field_W = new float[var10][3];
                  break L65;
                }
                var10 = 0;
                L68: while (true) {
                  if (var10 >= ((ww) this).field_g) {
                    L69: {
                      L70: {
                        if (param1.field_l == null) {
                          break L70;
                        } else {
                          if (param1.field_l.length >= ((ww) this).field_g) {
                            param0.field_l = param1.field_l;
                            break L69;
                          } else {
                            break L70;
                          }
                        }
                      }
                      L71: {
                        if (!param3) {
                          stackOut_225_0 = ((ww) this).field_g;
                          stackIn_226_0 = stackOut_225_0;
                          break L71;
                        } else {
                          stackOut_224_0 = ((ww) this).field_g + 100;
                          stackIn_226_0 = stackOut_224_0;
                          break L71;
                        }
                      }
                      var10 = stackIn_226_0;
                      param1.field_l = new float[var10][3];
                      param0.field_l = new float[var10][3];
                      break L69;
                    }
                    var10 = 0;
                    L72: while (true) {
                      if (var10 >= ((ww) this).field_g) {
                        break L63;
                      } else {
                        L73: {
                          if (((ww) this).field_l[var10] == null) {
                            break L73;
                          } else {
                            param0.field_l[var10][0] = ((ww) this).field_l[var10][0];
                            param0.field_l[var10][1] = ((ww) this).field_l[var10][1];
                            param0.field_l[var10][2] = ((ww) this).field_l[var10][2];
                            break L73;
                          }
                        }
                        var10++;
                        continue L72;
                      }
                    }
                  } else {
                    L74: {
                      if (((ww) this).field_W[var10] == null) {
                        break L74;
                      } else {
                        param0.field_W[var10][0] = ((ww) this).field_W[var10][0];
                        param0.field_W[var10][1] = ((ww) this).field_W[var10][1];
                        param0.field_W[var10][2] = ((ww) this).field_W[var10][2];
                        break L74;
                      }
                    }
                    var10++;
                    continue L68;
                  }
                }
              }
            }
          }
          param0.field_W = ((ww) this).field_W;
          param0.field_l = ((ww) this).field_l;
          break L63;
        }
        param0.field_sb = ((ww) this).field_sb;
        param0.field_Cb = ((ww) this).field_Cb;
        param0.field_j = ((ww) this).field_j;
        param0.field_Eb = ((ww) this).field_Eb;
        param0.field_V = ((ww) this).field_V;
        param0.field_wb = ((ww) this).field_wb;
        param0.field_M = ((ww) this).field_M;
        param0.field_bb = ((ww) this).field_bb;
        param0.field_x = ((ww) this).field_x;
        param0.field_i = ((ww) this).field_i;
        param0.field_kb = ((ww) this).field_kb;
        param0.field_e = ((ww) this).field_e;
        param0.field_ub = ((ww) this).field_ub;
        param0.field_P = param2;
        return (ka) (Object) param0;
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hna var11_ref_hna = null;
        int var12_int = 0;
        int[] var12 = null;
        nsa var12_ref = null;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        int var14_int = 0;
        nsa var14 = null;
        int var15 = 0;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int[] var31_ref_int__ = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int[] var35 = null;
        int var35_int = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        var9 = param1.length;
        if (param0 != 0) {
          if (param0 != 1) {
            if (param0 != 2) {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (param0 != 7) {
                    if (param0 != 8) {
                      if (param0 != 10) {
                        if (param0 != 9) {
                          return;
                        } else {
                          L0: {
                            if (((ww) this).field_j == null) {
                              break L0;
                            } else {
                              var10 = 0;
                              L1: while (true) {
                                if (var10 >= var9) {
                                  break L0;
                                } else {
                                  L2: {
                                    var11 = param1[var10];
                                    if (var11 >= ((ww) this).field_j.length) {
                                      break L2;
                                    } else {
                                      var12 = ((ww) this).field_j[var11];
                                      var13 = 0;
                                      L3: while (true) {
                                        if (var13 >= var12.length) {
                                          break L2;
                                        } else {
                                          var14 = ((ww) this).field_db[var12[var13]];
                                          var14.field_j = var14.field_j + param2 & 16383;
                                          var13++;
                                          continue L3;
                                        }
                                      }
                                    }
                                  }
                                  var10++;
                                  continue L1;
                                }
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L4: {
                          if (((ww) this).field_j == null) {
                            break L4;
                          } else {
                            var10 = 0;
                            L5: while (true) {
                              if (var10 >= var9) {
                                break L4;
                              } else {
                                L6: {
                                  var11 = param1[var10];
                                  if (var11 >= ((ww) this).field_j.length) {
                                    break L6;
                                  } else {
                                    var12 = ((ww) this).field_j[var11];
                                    var13 = 0;
                                    L7: while (true) {
                                      if (var13 >= var12.length) {
                                        break L6;
                                      } else {
                                        var14 = ((ww) this).field_db[var12[var13]];
                                        var14.field_m = var14.field_m * param2 >> 7;
                                        var14.field_g = var14.field_g * param3 >> 7;
                                        var13++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var10++;
                                continue L5;
                              }
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L8: {
                        if (((ww) this).field_j == null) {
                          break L8;
                        } else {
                          var10 = 0;
                          L9: while (true) {
                            if (var10 >= var9) {
                              break L8;
                            } else {
                              L10: {
                                var11 = param1[var10];
                                if (var11 >= ((ww) this).field_j.length) {
                                  break L10;
                                } else {
                                  var12 = ((ww) this).field_j[var11];
                                  var13 = 0;
                                  L11: while (true) {
                                    if (var13 >= var12.length) {
                                      break L10;
                                    } else {
                                      var14 = ((ww) this).field_db[var12[var13]];
                                      var14.field_b = var14.field_b + param2;
                                      var14.field_a = var14.field_a + param3;
                                      var13++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                              var10++;
                              continue L9;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L12: {
                      if (((ww) this).field_Cb == null) {
                        break L12;
                      } else {
                        var10 = 0;
                        L13: while (true) {
                          if (var10 >= var9) {
                            if (((ww) this).field_e == null) {
                              break L12;
                            } else {
                              var10 = 0;
                              L14: while (true) {
                                if (var10 >= ((ww) this).field_m) {
                                  break L12;
                                } else {
                                  var11_ref_hna = ((ww) this).field_e[var10];
                                  var12_ref = ((ww) this).field_db[var10];
                                  var12_ref.field_k = var12_ref.field_k & -16777216 | bt.field_h[tg.a((byte) -114, ((ww) this).field_ob[var11_ref_hna.field_j] & 65535) & 65535] & 16777215;
                                  var10++;
                                  continue L14;
                                }
                              }
                            }
                          } else {
                            L15: {
                              var11 = param1[var10];
                              if (var11 >= ((ww) this).field_Cb.length) {
                                break L15;
                              } else {
                                var12 = ((ww) this).field_Cb[var11];
                                var13 = 0;
                                L16: while (true) {
                                  if (var13 >= var12.length) {
                                    ((ww) this).field_L = true;
                                    break L15;
                                  } else {
                                    L17: {
                                      L18: {
                                        var14_int = var12[var13];
                                        if (((ww) this).field_V == null) {
                                          break L18;
                                        } else {
                                          if ((param6 & ((ww) this).field_V[var14_int]) != 0) {
                                            break L18;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L19: {
                                        var15 = ((ww) this).field_ob[var14_int] & 65535;
                                        var16 = var15 >> 10 & 63;
                                        var17 = var15 >> 7 & 7;
                                        var18 = var15 & 127;
                                        var16 = var16 + param2 & 63;
                                        var17 = var17 + param3;
                                        if (var17 >= 0) {
                                          if (var17 <= 7) {
                                            break L19;
                                          } else {
                                            var17 = 7;
                                            break L19;
                                          }
                                        } else {
                                          var17 = 0;
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        var18 = var18 + param4;
                                        if (var18 >= 0) {
                                          if (var18 <= 127) {
                                            break L20;
                                          } else {
                                            var18 = 127;
                                            break L20;
                                          }
                                        } else {
                                          var18 = 0;
                                          break L20;
                                        }
                                      }
                                      ((ww) this).field_ob[var14_int] = (short)(var16 << 10 | var17 << 7 | var18);
                                      break L17;
                                    }
                                    var13++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L13;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L21: {
                    if (((ww) this).field_Cb == null) {
                      break L21;
                    } else {
                      if (((ww) this).field_h == null) {
                        break L21;
                      } else {
                        var10 = 0;
                        L22: while (true) {
                          if (var10 >= var9) {
                            if (((ww) this).field_e == null) {
                              break L21;
                            } else {
                              var10 = 0;
                              L23: while (true) {
                                if (var10 >= ((ww) this).field_m) {
                                  break L21;
                                } else {
                                  var11_ref_hna = ((ww) this).field_e[var10];
                                  var12_ref = ((ww) this).field_db[var10];
                                  var12_ref.field_k = var12_ref.field_k & 16777215 | 255 - (((ww) this).field_h[var11_ref_hna.field_j] & 255) << 24;
                                  var10++;
                                  continue L23;
                                }
                              }
                            }
                          } else {
                            L24: {
                              var11 = param1[var10];
                              if (var11 >= ((ww) this).field_Cb.length) {
                                break L24;
                              } else {
                                var12 = ((ww) this).field_Cb[var11];
                                var13 = 0;
                                L25: while (true) {
                                  if (var13 >= var12.length) {
                                    break L24;
                                  } else {
                                    L26: {
                                      L27: {
                                        var14_int = var12[var13];
                                        if (((ww) this).field_V == null) {
                                          break L27;
                                        } else {
                                          if ((param6 & ((ww) this).field_V[var14_int]) != 0) {
                                            break L27;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      L28: {
                                        var15 = (((ww) this).field_h[var14_int] & 255) + param2 * 8;
                                        if (var15 >= 0) {
                                          if (var15 <= 255) {
                                            break L28;
                                          } else {
                                            var15 = 255;
                                            break L28;
                                          }
                                        } else {
                                          var15 = 0;
                                          break L28;
                                        }
                                      }
                                      ((ww) this).field_h[var14_int] = (byte)var15;
                                      break L26;
                                    }
                                    var13++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L22;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                L29: {
                  if (param7 == null) {
                    var10 = 0;
                    L30: while (true) {
                      if (var10 >= var9) {
                        break L29;
                      } else {
                        L31: {
                          var11 = param1[var10];
                          if (var11 >= ((ww) this).field_sb.length) {
                            break L31;
                          } else {
                            var12 = ((ww) this).field_sb[var11];
                            var13 = 0;
                            L32: while (true) {
                              if (var13 >= var12.length) {
                                break L31;
                              } else {
                                L33: {
                                  L34: {
                                    var14_int = var12[var13];
                                    if (((ww) this).field_Eb == null) {
                                      break L34;
                                    } else {
                                      if ((param6 & ((ww) this).field_Eb[var14_int]) != 0) {
                                        break L34;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                  ((ww) this).field_xb[var14_int] = ((ww) this).field_xb[var14_int] - ((ww) this).field_gb;
                                  ((ww) this).field_rb[var14_int] = ((ww) this).field_rb[var14_int] - ((ww) this).field_H;
                                  ((ww) this).field_T[var14_int] = ((ww) this).field_T[var14_int] - ((ww) this).field_Y;
                                  ((ww) this).field_xb[var14_int] = ((ww) this).field_xb[var14_int] * param2 / 128;
                                  ((ww) this).field_rb[var14_int] = ((ww) this).field_rb[var14_int] * param3 / 128;
                                  ((ww) this).field_T[var14_int] = ((ww) this).field_T[var14_int] * param4 / 128;
                                  ((ww) this).field_xb[var14_int] = ((ww) this).field_xb[var14_int] + ((ww) this).field_gb;
                                  ((ww) this).field_rb[var14_int] = ((ww) this).field_rb[var14_int] + ((ww) this).field_H;
                                  ((ww) this).field_T[var14_int] = ((ww) this).field_T[var14_int] + ((ww) this).field_Y;
                                  break L33;
                                }
                                var13++;
                                continue L32;
                              }
                            }
                          }
                        }
                        var10++;
                        continue L30;
                      }
                    }
                  } else {
                    L35: {
                      if (((ww) this).field_S) {
                        break L35;
                      } else {
                        var10 = 0;
                        L36: while (true) {
                          if (var10 >= ((ww) this).field_p) {
                            ((ww) this).field_S = true;
                            break L35;
                          } else {
                            ((ww) this).field_xb[var10] = ((ww) this).field_xb[var10] << 4;
                            ((ww) this).field_rb[var10] = ((ww) this).field_rb[var10] << 4;
                            ((ww) this).field_T[var10] = ((ww) this).field_T[var10] << 4;
                            var10++;
                            continue L36;
                          }
                        }
                      }
                    }
                    L37: {
                      var10 = param7[9] << 4;
                      var11 = param7[10] << 4;
                      var12_int = param7[11] << 4;
                      var13 = param7[12] << 4;
                      var14_int = param7[13] << 4;
                      var15 = param7[14] << 4;
                      if (!((ww) this).field_A) {
                        break L37;
                      } else {
                        var16 = param7[0] * ((ww) this).field_gb + param7[3] * ((ww) this).field_H + param7[6] * ((ww) this).field_Y + 8192 >> 14;
                        var17 = param7[1] * ((ww) this).field_gb + param7[4] * ((ww) this).field_H + param7[7] * ((ww) this).field_Y + 8192 >> 14;
                        var18 = param7[2] * ((ww) this).field_gb + param7[5] * ((ww) this).field_H + param7[8] * ((ww) this).field_Y + 8192 >> 14;
                        var16 = var16 + var13;
                        var17 = var17 + var14_int;
                        var18 = var18 + var15;
                        ((ww) this).field_gb = var16;
                        ((ww) this).field_H = var17;
                        ((ww) this).field_Y = var18;
                        ((ww) this).field_A = false;
                        break L37;
                      }
                    }
                    var16 = param2 << 15 >> 7;
                    var17 = param3 << 15 >> 7;
                    var18 = param4 << 15 >> 7;
                    var19 = var16 * -((ww) this).field_gb + 8192 >> 14;
                    var20 = var17 * -((ww) this).field_H + 8192 >> 14;
                    var21 = var18 * -((ww) this).field_Y + 8192 >> 14;
                    var22 = var19 + ((ww) this).field_gb;
                    var23 = var20 + ((ww) this).field_H;
                    var24 = var21 + ((ww) this).field_Y;
                    var25 = new int[9];
                    var25[0] = var16 * param7[0] + 8192 >> 14;
                    var25[1] = var16 * param7[3] + 8192 >> 14;
                    var25[2] = var16 * param7[6] + 8192 >> 14;
                    var25[3] = var17 * param7[1] + 8192 >> 14;
                    var25[4] = var17 * param7[4] + 8192 >> 14;
                    var25[5] = var17 * param7[7] + 8192 >> 14;
                    var25[6] = var18 * param7[2] + 8192 >> 14;
                    var25[7] = var18 * param7[5] + 8192 >> 14;
                    var25[8] = var18 * param7[8] + 8192 >> 14;
                    var26 = var16 * var13 + 8192 >> 14;
                    var27 = var17 * var14_int + 8192 >> 14;
                    var28 = var18 * var15 + 8192 >> 14;
                    var26 = var26 + var22;
                    var27 = var27 + var23;
                    var28 = var28 + var24;
                    var29 = new int[9];
                    var30 = 0;
                    L38: while (true) {
                      if (var30 >= 3) {
                        var30 = param7[0] * var26 + param7[1] * var27 + param7[2] * var28 + 8192 >> 14;
                        var31 = param7[3] * var26 + param7[4] * var27 + param7[5] * var28 + 8192 >> 14;
                        var32 = param7[6] * var26 + param7[7] * var27 + param7[8] * var28 + 8192 >> 14;
                        var30 = var30 + var10;
                        var31 = var31 + var11;
                        var32 = var32 + var12_int;
                        var33 = 0;
                        L39: while (true) {
                          if (var33 >= var9) {
                            break L29;
                          } else {
                            L40: {
                              var34 = param1[var33];
                              if (var34 >= ((ww) this).field_sb.length) {
                                break L40;
                              } else {
                                var35 = ((ww) this).field_sb[var34];
                                var36 = 0;
                                L41: while (true) {
                                  if (var36 >= var35.length) {
                                    break L40;
                                  } else {
                                    L42: {
                                      L43: {
                                        var37 = var35[var36];
                                        if (((ww) this).field_Eb == null) {
                                          break L43;
                                        } else {
                                          if ((param6 & ((ww) this).field_Eb[var37]) != 0) {
                                            break L43;
                                          } else {
                                            break L42;
                                          }
                                        }
                                      }
                                      var38 = var29[0] * ((ww) this).field_xb[var37] + var29[1] * ((ww) this).field_rb[var37] + var29[2] * ((ww) this).field_T[var37] + 8192 >> 14;
                                      var39 = var29[3] * ((ww) this).field_xb[var37] + var29[4] * ((ww) this).field_rb[var37] + var29[5] * ((ww) this).field_T[var37] + 8192 >> 14;
                                      var40 = var29[6] * ((ww) this).field_xb[var37] + var29[7] * ((ww) this).field_rb[var37] + var29[8] * ((ww) this).field_T[var37] + 8192 >> 14;
                                      var38 = var38 + var30;
                                      var39 = var39 + var31;
                                      var40 = var40 + var32;
                                      ((ww) this).field_xb[var37] = var38;
                                      ((ww) this).field_rb[var37] = var39;
                                      ((ww) this).field_T[var37] = var40;
                                      break L42;
                                    }
                                    var36++;
                                    continue L41;
                                  }
                                }
                              }
                            }
                            var33++;
                            continue L39;
                          }
                        }
                      } else {
                        var31 = 0;
                        L44: while (true) {
                          if (var31 >= 3) {
                            var30++;
                            continue L38;
                          } else {
                            var32 = 0;
                            var33 = 0;
                            L45: while (true) {
                              if (var33 >= 3) {
                                var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                                var31++;
                                continue L44;
                              } else {
                                var32 = var32 + param7[var30 * 3 + var33] * var25[var31 + var33 * 3];
                                var33++;
                                continue L45;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L46: {
                if (param7 == null) {
                  var10 = 0;
                  L47: while (true) {
                    if (var10 >= var9) {
                      break L46;
                    } else {
                      L48: {
                        var11 = param1[var10];
                        if (var11 >= ((ww) this).field_sb.length) {
                          break L48;
                        } else {
                          var12 = ((ww) this).field_sb[var11];
                          var13 = 0;
                          L49: while (true) {
                            if (var13 >= var12.length) {
                              break L48;
                            } else {
                              L50: {
                                L51: {
                                  var14_int = var12[var13];
                                  if (((ww) this).field_Eb == null) {
                                    break L51;
                                  } else {
                                    if ((param6 & ((ww) this).field_Eb[var14_int]) != 0) {
                                      break L51;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                                L52: {
                                  ((ww) this).field_xb[var14_int] = ((ww) this).field_xb[var14_int] - ((ww) this).field_gb;
                                  ((ww) this).field_rb[var14_int] = ((ww) this).field_rb[var14_int] - ((ww) this).field_H;
                                  ((ww) this).field_T[var14_int] = ((ww) this).field_T[var14_int] - ((ww) this).field_Y;
                                  if (param4 == 0) {
                                    break L52;
                                  } else {
                                    var15 = qu.field_b[param4];
                                    var16 = qu.field_d[param4];
                                    var17 = ((ww) this).field_rb[var14_int] * var15 + ((ww) this).field_xb[var14_int] * var16 + 16383 >> 14;
                                    ((ww) this).field_rb[var14_int] = ((ww) this).field_rb[var14_int] * var16 - ((ww) this).field_xb[var14_int] * var15 + 16383 >> 14;
                                    ((ww) this).field_xb[var14_int] = var17;
                                    break L52;
                                  }
                                }
                                L53: {
                                  if (param2 == 0) {
                                    break L53;
                                  } else {
                                    var15 = qu.field_b[param2];
                                    var16 = qu.field_d[param2];
                                    var17 = ((ww) this).field_rb[var14_int] * var16 - ((ww) this).field_T[var14_int] * var15 + 16383 >> 14;
                                    ((ww) this).field_T[var14_int] = ((ww) this).field_rb[var14_int] * var15 + ((ww) this).field_T[var14_int] * var16 + 16383 >> 14;
                                    ((ww) this).field_rb[var14_int] = var17;
                                    break L53;
                                  }
                                }
                                L54: {
                                  if (param3 == 0) {
                                    break L54;
                                  } else {
                                    var15 = qu.field_b[param3];
                                    var16 = qu.field_d[param3];
                                    var17 = ((ww) this).field_T[var14_int] * var15 + ((ww) this).field_xb[var14_int] * var16 + 16383 >> 14;
                                    ((ww) this).field_T[var14_int] = ((ww) this).field_T[var14_int] * var16 - ((ww) this).field_xb[var14_int] * var15 + 16383 >> 14;
                                    ((ww) this).field_xb[var14_int] = var17;
                                    break L54;
                                  }
                                }
                                ((ww) this).field_xb[var14_int] = ((ww) this).field_xb[var14_int] + ((ww) this).field_gb;
                                ((ww) this).field_rb[var14_int] = ((ww) this).field_rb[var14_int] + ((ww) this).field_H;
                                ((ww) this).field_T[var14_int] = ((ww) this).field_T[var14_int] + ((ww) this).field_Y;
                                break L50;
                              }
                              var13++;
                              continue L49;
                            }
                          }
                        }
                      }
                      var10++;
                      continue L47;
                    }
                  }
                } else {
                  L55: {
                    if (((ww) this).field_S) {
                      break L55;
                    } else {
                      var10 = 0;
                      L56: while (true) {
                        if (var10 >= ((ww) this).field_p) {
                          ((ww) this).field_S = true;
                          break L55;
                        } else {
                          ((ww) this).field_xb[var10] = ((ww) this).field_xb[var10] << 4;
                          ((ww) this).field_rb[var10] = ((ww) this).field_rb[var10] << 4;
                          ((ww) this).field_T[var10] = ((ww) this).field_T[var10] << 4;
                          var10++;
                          continue L56;
                        }
                      }
                    }
                  }
                  L57: {
                    var10 = param7[9] << 4;
                    var11 = param7[10] << 4;
                    var12_int = param7[11] << 4;
                    var13 = param7[12] << 4;
                    var14_int = param7[13] << 4;
                    var15 = param7[14] << 4;
                    if (!((ww) this).field_A) {
                      break L57;
                    } else {
                      var16 = param7[0] * ((ww) this).field_gb + param7[3] * ((ww) this).field_H + param7[6] * ((ww) this).field_Y + 8192 >> 14;
                      var17 = param7[1] * ((ww) this).field_gb + param7[4] * ((ww) this).field_H + param7[7] * ((ww) this).field_Y + 8192 >> 14;
                      var18 = param7[2] * ((ww) this).field_gb + param7[5] * ((ww) this).field_H + param7[8] * ((ww) this).field_Y + 8192 >> 14;
                      var16 = var16 + var13;
                      var17 = var17 + var14_int;
                      var18 = var18 + var15;
                      ((ww) this).field_gb = var16;
                      ((ww) this).field_H = var17;
                      ((ww) this).field_Y = var18;
                      ((ww) this).field_A = false;
                      break L57;
                    }
                  }
                  var16_ref_int__ = new int[9];
                  var17 = qu.field_d[param2];
                  var18 = qu.field_b[param2];
                  var19 = qu.field_d[param3];
                  var20 = qu.field_b[param3];
                  var21 = qu.field_d[param4];
                  var22 = qu.field_b[param4];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var16_ref_int__[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var16_ref_int__[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var16_ref_int__[2] = var20 * var17 + 8192 >> 14;
                  var16_ref_int__[3] = var17 * var22 + 8192 >> 14;
                  var16_ref_int__[4] = var17 * var21 + 8192 >> 14;
                  var16_ref_int__[5] = -var18;
                  var16_ref_int__[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var16_ref_int__[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var16_ref_int__[8] = var19 * var17 + 8192 >> 14;
                  var25_int = var16_ref_int__[0] * -((ww) this).field_gb + var16_ref_int__[1] * -((ww) this).field_H + var16_ref_int__[2] * -((ww) this).field_Y + 8192 >> 14;
                  var26 = var16_ref_int__[3] * -((ww) this).field_gb + var16_ref_int__[4] * -((ww) this).field_H + var16_ref_int__[5] * -((ww) this).field_Y + 8192 >> 14;
                  var27 = var16_ref_int__[6] * -((ww) this).field_gb + var16_ref_int__[7] * -((ww) this).field_H + var16_ref_int__[8] * -((ww) this).field_Y + 8192 >> 14;
                  var28 = var25_int + ((ww) this).field_gb;
                  var29_int = var26 + ((ww) this).field_H;
                  var30 = var27 + ((ww) this).field_Y;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L58: while (true) {
                    if (var32 >= 3) {
                      var32 = var16_ref_int__[0] * var13 + var16_ref_int__[1] * var14_int + var16_ref_int__[2] * var15 + 8192 >> 14;
                      var33 = var16_ref_int__[3] * var13 + var16_ref_int__[4] * var14_int + var16_ref_int__[5] * var15 + 8192 >> 14;
                      var34 = var16_ref_int__[6] * var13 + var16_ref_int__[7] * var14_int + var16_ref_int__[8] * var15 + 8192 >> 14;
                      var32 = var32 + var28;
                      var33 = var33 + var29_int;
                      var34 = var34 + var30;
                      var35 = new int[9];
                      var36 = 0;
                      L59: while (true) {
                        if (var36 >= 3) {
                          var36 = param7[0] * var32 + param7[1] * var33 + param7[2] * var34 + 8192 >> 14;
                          var37 = param7[3] * var32 + param7[4] * var33 + param7[5] * var34 + 8192 >> 14;
                          var38 = param7[6] * var32 + param7[7] * var33 + param7[8] * var34 + 8192 >> 14;
                          var36 = var36 + var10;
                          var37 = var37 + var11;
                          var38 = var38 + var12_int;
                          var39 = 0;
                          L60: while (true) {
                            if (var39 >= var9) {
                              break L46;
                            } else {
                              L61: {
                                var40 = param1[var39];
                                if (var40 >= ((ww) this).field_sb.length) {
                                  break L61;
                                } else {
                                  var41 = ((ww) this).field_sb[var40];
                                  var42 = 0;
                                  L62: while (true) {
                                    if (var42 >= var41.length) {
                                      break L61;
                                    } else {
                                      L63: {
                                        L64: {
                                          var43 = var41[var42];
                                          if (((ww) this).field_Eb == null) {
                                            break L64;
                                          } else {
                                            if ((param6 & ((ww) this).field_Eb[var43]) != 0) {
                                              break L64;
                                            } else {
                                              break L63;
                                            }
                                          }
                                        }
                                        var44 = var35[0] * ((ww) this).field_xb[var43] + var35[1] * ((ww) this).field_rb[var43] + var35[2] * ((ww) this).field_T[var43] + 8192 >> 14;
                                        var45 = var35[3] * ((ww) this).field_xb[var43] + var35[4] * ((ww) this).field_rb[var43] + var35[5] * ((ww) this).field_T[var43] + 8192 >> 14;
                                        var46 = var35[6] * ((ww) this).field_xb[var43] + var35[7] * ((ww) this).field_rb[var43] + var35[8] * ((ww) this).field_T[var43] + 8192 >> 14;
                                        var44 = var44 + var36;
                                        var45 = var45 + var37;
                                        var46 = var46 + var38;
                                        ((ww) this).field_xb[var43] = var44;
                                        ((ww) this).field_rb[var43] = var45;
                                        ((ww) this).field_T[var43] = var46;
                                        break L63;
                                      }
                                      var42++;
                                      continue L62;
                                    }
                                  }
                                }
                              }
                              var39++;
                              continue L60;
                            }
                          }
                        } else {
                          var37 = 0;
                          L65: while (true) {
                            if (var37 >= 3) {
                              var36++;
                              continue L59;
                            } else {
                              var38 = 0;
                              var39 = 0;
                              L66: while (true) {
                                if (var39 >= 3) {
                                  var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                                  var37++;
                                  continue L65;
                                } else {
                                  var38 = var38 + param7[var36 * 3 + var39] * var31_ref_int__[var37 + var39 * 3];
                                  var39++;
                                  continue L66;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = 0;
                      L67: while (true) {
                        if (var33 >= 3) {
                          var32++;
                          continue L58;
                        } else {
                          var34 = 0;
                          var35_int = 0;
                          L68: while (true) {
                            if (var35_int >= 3) {
                              var31_ref_int__[var32 * 3 + var33] = var34 + 8192 >> 14;
                              var33++;
                              continue L67;
                            } else {
                              var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var33 * 3 + var35_int];
                              var35_int++;
                              continue L68;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L69: {
              if (param7 == null) {
                break L69;
              } else {
                var10 = param7[0] * param2 + param7[1] * param3 + param7[2] * param4 + 8192 >> 14;
                var11 = param7[3] * param2 + param7[4] * param3 + param7[5] * param4 + 8192 >> 14;
                var12_int = param7[6] * param2 + param7[7] * param3 + param7[8] * param4 + 8192 >> 14;
                param2 = var10;
                param3 = var11;
                param4 = var12_int;
                break L69;
              }
            }
            L70: {
              param2 = param2 << 4;
              param3 = param3 << 4;
              param4 = param4 << 4;
              if (((ww) this).field_S) {
                break L70;
              } else {
                var10 = 0;
                L71: while (true) {
                  if (var10 >= ((ww) this).field_p) {
                    ((ww) this).field_S = true;
                    break L70;
                  } else {
                    ((ww) this).field_xb[var10] = ((ww) this).field_xb[var10] << 4;
                    ((ww) this).field_rb[var10] = ((ww) this).field_rb[var10] << 4;
                    ((ww) this).field_T[var10] = ((ww) this).field_T[var10] << 4;
                    var10++;
                    continue L71;
                  }
                }
              }
            }
            var10 = 0;
            L72: while (true) {
              if (var10 >= var9) {
                return;
              } else {
                L73: {
                  var11 = param1[var10];
                  if (var11 >= ((ww) this).field_sb.length) {
                    break L73;
                  } else {
                    var12 = ((ww) this).field_sb[var11];
                    var13 = 0;
                    L74: while (true) {
                      if (var13 >= var12.length) {
                        break L73;
                      } else {
                        L75: {
                          L76: {
                            var14_int = var12[var13];
                            if (((ww) this).field_Eb == null) {
                              break L76;
                            } else {
                              if ((param6 & ((ww) this).field_Eb[var14_int]) != 0) {
                                break L76;
                              } else {
                                break L75;
                              }
                            }
                          }
                          ((ww) this).field_xb[var14_int] = ((ww) this).field_xb[var14_int] + param2;
                          ((ww) this).field_rb[var14_int] = ((ww) this).field_rb[var14_int] + param3;
                          ((ww) this).field_T[var14_int] = ((ww) this).field_T[var14_int] + param4;
                          break L75;
                        }
                        var13++;
                        continue L74;
                      }
                    }
                  }
                }
                var10++;
                continue L72;
              }
            }
          }
        } else {
          L77: {
            param2 = param2 << 4;
            param3 = param3 << 4;
            param4 = param4 << 4;
            if (((ww) this).field_S) {
              break L77;
            } else {
              var10 = 0;
              L78: while (true) {
                if (var10 >= ((ww) this).field_p) {
                  ((ww) this).field_S = true;
                  break L77;
                } else {
                  ((ww) this).field_xb[var10] = ((ww) this).field_xb[var10] << 4;
                  ((ww) this).field_rb[var10] = ((ww) this).field_rb[var10] << 4;
                  ((ww) this).field_T[var10] = ((ww) this).field_T[var10] << 4;
                  var10++;
                  continue L78;
                }
              }
            }
          }
          var10 = 0;
          ((ww) this).field_gb = 0;
          ((ww) this).field_H = 0;
          ((ww) this).field_Y = 0;
          var11 = 0;
          L79: while (true) {
            if (var11 >= var9) {
              L80: {
                if (var10 <= 0) {
                  ((ww) this).field_gb = param2;
                  ((ww) this).field_H = param3;
                  ((ww) this).field_Y = param4;
                  break L80;
                } else {
                  ((ww) this).field_gb = ((ww) this).field_gb / var10 + param2;
                  ((ww) this).field_H = ((ww) this).field_H / var10 + param3;
                  ((ww) this).field_Y = ((ww) this).field_Y / var10 + param4;
                  ((ww) this).field_A = true;
                  break L80;
                }
              }
              return;
            } else {
              L81: {
                var12_int = param1[var11];
                if (var12_int >= ((ww) this).field_sb.length) {
                  break L81;
                } else {
                  var13_ref_int__ = ((ww) this).field_sb[var12_int];
                  var14_int = 0;
                  L82: while (true) {
                    if (var14_int >= var13_ref_int__.length) {
                      break L81;
                    } else {
                      L83: {
                        L84: {
                          var15 = var13_ref_int__[var14_int];
                          if (((ww) this).field_Eb == null) {
                            break L84;
                          } else {
                            if ((param6 & ((ww) this).field_Eb[var15]) != 0) {
                              break L84;
                            } else {
                              break L83;
                            }
                          }
                        }
                        ((ww) this).field_gb = ((ww) this).field_gb + ((ww) this).field_xb[var15];
                        ((ww) this).field_H = ((ww) this).field_H + ((ww) this).field_rb[var15];
                        ((ww) this).field_Y = ((ww) this).field_Y + ((ww) this).field_T[var15];
                        var10++;
                        break L83;
                      }
                      var14_int++;
                      continue L82;
                    }
                  }
                }
              }
              var11++;
              continue L79;
            }
          }
        }
    }

    private final boolean h(int param0) {
        Throwable decompiledCaughtException = null;
        try {
          if (((ww) this).field_jb != null) {
          } else {
            return false;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw (RuntimeException) (Object) decompiledCaughtException;
        }
        try {
          if (((ww) this).field_jb[param0] != -1) {
          } else {
            return false;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw (RuntimeException) (Object) decompiledCaughtException;
        }
        return true;
    }

    private final void h() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        short stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var5 >= ((ww) this).field_g) {
                            statePc = 14;
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
                        if (((ww) this).field_X == null) {
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
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = ((ww) this).field_X[var5];
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = -1;
                    stackIn_8_0 = stackOut_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var4 = stackIn_8_0;
                    if (var4 != -1) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var1 = ((ww) this).field_ob[var5] & 65535;
                    var2 = (var1 & 127) * ((ww) this).field_Db >> 7;
                    var1 = tg.a((byte) -117, var1 & -128 | var2);
                    if (((ww) this).field_Fb[var5] != -1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var3 = ((ww) this).field_t[var5] & -131072;
                    ((ww) this).field_t[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                    statePc = 13;
                    continue stateLoop;
                }
                case 11: {
                    if (((ww) this).field_Fb[var5] == -2) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var3 = ((ww) this).field_t[var5] & -131072;
                    ((ww) this).field_t[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                    var3 = ((ww) this).field_o[var5] & -131072;
                    ((ww) this).field_o[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                    var3 = ((ww) this).field_Fb[var5] & -131072;
                    ((ww) this).field_Fb[var5] = var3 | ds.c(-127, var1, var3 >> 17);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var5++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 14: {
                    ((ww) this).field_eb = 2;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((ww) this).field_F.field_h) {
            L1: {
              var2 = ((ww) this).field_M[param0];
              var3 = ((ww) this).field_bb[param0];
              var4 = ((ww) this).field_x[param0];
              var5 = 0;
              var6 = 0;
              var7 = 0;
              if (((ww) this).field_s[var2] <= ((ww) this).field_F.field_L) {
                if (((ww) this).field_s[var2] <= ((ww) this).field_F.field_M) {
                  break L1;
                } else {
                  var5 = (((ww) this).field_F.field_M - ((ww) this).field_s[var2]) * 255 / (((ww) this).field_F.field_M - ((ww) this).field_F.field_L);
                  break L1;
                }
              } else {
                var5 = 255;
                break L1;
              }
            }
            L2: {
              if (((ww) this).field_s[var3] <= ((ww) this).field_F.field_L) {
                if (((ww) this).field_s[var3] <= ((ww) this).field_F.field_M) {
                  break L2;
                } else {
                  var6 = (((ww) this).field_F.field_M - ((ww) this).field_s[var3]) * 255 / (((ww) this).field_F.field_M - ((ww) this).field_F.field_L);
                  break L2;
                }
              } else {
                var6 = 255;
                break L2;
              }
            }
            L3: {
              if (((ww) this).field_s[var4] <= ((ww) this).field_F.field_L) {
                if (((ww) this).field_s[var4] <= ((ww) this).field_F.field_M) {
                  break L3;
                } else {
                  var7 = (((ww) this).field_F.field_M - ((ww) this).field_s[var4]) * 255 / (((ww) this).field_F.field_M - ((ww) this).field_F.field_L);
                  break L3;
                }
              } else {
                var7 = 255;
                break L3;
              }
            }
            L4: {
              if (((ww) this).field_h != null) {
                ((ww) this).field_w.field_b = ((ww) this).field_h[param0] & 255;
                break L4;
              } else {
                ((ww) this).field_w.field_b = 0;
                break L4;
              }
            }
            L5: {
              if (((ww) this).field_X == null) {
                break L5;
              } else {
                if (((ww) this).field_X[param0] != -1) {
                  L6: {
                    var8 = -16777216;
                    if (((ww) this).field_h == null) {
                      break L6;
                    } else {
                      var8 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                      break L6;
                    }
                  }
                  if (((ww) this).field_Fb[param0] != -1) {
                    ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var8 | ((ww) this).field_t[param0] & 16777215, var8 | ((ww) this).field_o[param0] & 16777215, var8 | ((ww) this).field_Fb[param0] & 16777215, ((ww) this).field_F.field_D, var5, var6, var7, (int) ((ww) this).field_X[param0]);
                    break L0;
                  } else {
                    var9 = var8 | ((ww) this).field_t[param0] & 16777215;
                    ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var9, var9, var9, ((ww) this).field_F.field_D, var5, var6, var7, (int) ((ww) this).field_X[param0]);
                    break L0;
                  }
                } else {
                  break L5;
                }
              }
            }
            if (((ww) this).field_Fb[param0] != -1) {
              ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], l.a(var5 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var6 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_o[param0] & 65535], 20048), l.a(var7 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_Fb[param0] & 65535], 20048));
              break L0;
            } else {
              ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], l.a(var5 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var6 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var7 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048));
              break L0;
            }
          } else {
            L7: {
              var2 = ((ww) this).field_M[param0];
              var3 = ((ww) this).field_bb[param0];
              var4 = ((ww) this).field_x[param0];
              var5 = ((ww) this).field_mb[var2] - ((ww) this).field_F.field_B;
              if (var5 <= 255) {
                if (var5 >= 0) {
                  break L7;
                } else {
                  var5 = 0;
                  break L7;
                }
              } else {
                var5 = 255;
                break L7;
              }
            }
            L8: {
              var6 = ((ww) this).field_mb[var3] - ((ww) this).field_F.field_B;
              if (var6 <= 255) {
                if (var6 >= 0) {
                  break L8;
                } else {
                  var6 = 0;
                  break L8;
                }
              } else {
                var6 = 255;
                break L8;
              }
            }
            L9: {
              var7 = ((ww) this).field_mb[var4] - ((ww) this).field_F.field_B;
              if (var7 <= 255) {
                if (var7 >= 0) {
                  break L9;
                } else {
                  var7 = 0;
                  break L9;
                }
              } else {
                var7 = 255;
                break L9;
              }
            }
            var8 = var5 + var6 + var7;
            if (var8 != 765) {
              if (var8 != 0) {
                L10: {
                  if (((ww) this).field_h != null) {
                    ((ww) this).field_w.field_b = ((ww) this).field_h[param0] & 255;
                    break L10;
                  } else {
                    ((ww) this).field_w.field_b = 0;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (((ww) this).field_X == null) {
                      break L12;
                    } else {
                      if (((ww) this).field_X[param0] != -1) {
                        L13: {
                          var9 = -16777216;
                          if (((ww) this).field_h == null) {
                            break L13;
                          } else {
                            var9 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                            break L13;
                          }
                        }
                        if (((ww) this).field_Fb[param0] != -1) {
                          ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var9 | ((ww) this).field_t[param0] & 16777215, var9 | ((ww) this).field_o[param0] & 16777215, var9 | ((ww) this).field_Fb[param0] & 16777215, ((ww) this).field_F.field_D, var5, var6, var7, (int) ((ww) this).field_X[param0]);
                          break L11;
                        } else {
                          var10 = var9 | ((ww) this).field_t[param0] & 16777215;
                          ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var10, var10, var10, ((ww) this).field_F.field_D, var5, var6, var7, (int) ((ww) this).field_X[param0]);
                          break L11;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (((ww) this).field_Fb[param0] != -1) {
                    ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], l.a(var5 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var6 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_o[param0] & 65535], 20048), l.a(var7 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_Fb[param0] & 65535], 20048));
                    break L11;
                  } else {
                    ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], l.a(var5 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var6 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048), l.a(var7 << 24 | ((ww) this).field_F.field_D, bt.field_h[((ww) this).field_t[param0] & 65535], 20048));
                    break L11;
                  }
                }
                break L0;
              } else {
                this.j(param0);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        L0: {
          var2 = 0;
          var3 = ((ww) this).field_d.field_g;
          var4 = ((ww) this).field_M[param0];
          var5 = ((ww) this).field_bb[param0];
          var6 = ((ww) this).field_x[param0];
          var7 = ((ww) this).field_Ab[var4];
          var8 = ((ww) this).field_Ab[var5];
          var9 = ((ww) this).field_Ab[var6];
          if (((ww) this).field_h != null) {
            ((ww) this).field_w.field_b = ((ww) this).field_h[param0] & 255;
            break L0;
          } else {
            ((ww) this).field_w.field_b = 0;
            break L0;
          }
        }
        L1: {
          if (var7 < var3) {
            L2: {
              var10 = ((ww) this).field_nb[var4];
              var11 = ((ww) this).field_C[var4];
              var12 = ((ww) this).field_t[param0] & 65535;
              if (var9 < var3) {
                break L2;
              } else {
                var13 = (var3 - var7) * (65536 / (var9 - var7));
                ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var6] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
                ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var6] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
                ((ww) this).field_yb[var2] = var3;
                var2++;
                ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_Fb[param0] & 65535) - var12) * var13 >> 16);
                break L2;
              }
            }
            if (var8 < var3) {
              break L1;
            } else {
              var13 = (var3 - var7) * (65536 / (var8 - var7));
              ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var5] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
              ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var5] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
              ((ww) this).field_yb[var2] = var3;
              var2++;
              ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_o[param0] & 65535) - var12) * var13 >> 16);
              break L1;
            }
          } else {
            ((ww) this).field_y[var2] = ((ww) this).field_v[var4];
            ((ww) this).field_E[var2] = ((ww) this).field_J[var4];
            ((ww) this).field_yb[var2] = ((ww) this).field_mb[var4];
            var2++;
            ((ww) this).field_hb[var2] = ((ww) this).field_t[param0] & 65535;
            break L1;
          }
        }
        L3: {
          if (var8 < var3) {
            L4: {
              var10 = ((ww) this).field_nb[var5];
              var11 = ((ww) this).field_C[var5];
              var12 = ((ww) this).field_o[param0] & 65535;
              if (var7 < var3) {
                break L4;
              } else {
                var13 = (var3 - var8) * (65536 / (var7 - var8));
                ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var4] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
                ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var4] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
                ((ww) this).field_yb[var2] = var3;
                var2++;
                ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_t[param0] & 65535) - var12) * var13 >> 16);
                break L4;
              }
            }
            if (var9 < var3) {
              break L3;
            } else {
              var13 = (var3 - var8) * (65536 / (var9 - var8));
              ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var6] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
              ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var6] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
              ((ww) this).field_yb[var2] = var3;
              var2++;
              ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_Fb[param0] & 65535) - var12) * var13 >> 16);
              break L3;
            }
          } else {
            ((ww) this).field_y[var2] = ((ww) this).field_v[var5];
            ((ww) this).field_E[var2] = ((ww) this).field_J[var5];
            ((ww) this).field_yb[var2] = ((ww) this).field_mb[var5];
            var2++;
            ((ww) this).field_hb[var2] = ((ww) this).field_o[param0] & 65535;
            break L3;
          }
        }
        L5: {
          if (var9 < var3) {
            L6: {
              var10 = ((ww) this).field_nb[var6];
              var11 = ((ww) this).field_C[var6];
              var12 = ((ww) this).field_Fb[param0] & 65535;
              if (var8 < var3) {
                break L6;
              } else {
                var13 = (var3 - var9) * (65536 / (var8 - var9));
                ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var5] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
                ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var5] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
                ((ww) this).field_yb[var2] = var3;
                var2++;
                ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_o[param0] & 65535) - var12) * var13 >> 16);
                break L6;
              }
            }
            if (var7 < var3) {
              break L5;
            } else {
              var13 = (var3 - var9) * (65536 / (var7 - var9));
              ((ww) this).field_y[var2] = ((ww) this).field_F.field_o + (var10 + ((((ww) this).field_nb[var4] - var10) * var13 >> 16)) * ((ww) this).field_d.field_Q / var3;
              ((ww) this).field_E[var2] = ((ww) this).field_F.field_H + (var11 + ((((ww) this).field_C[var4] - var11) * var13 >> 16)) * ((ww) this).field_d.field_C / var3;
              ((ww) this).field_yb[var2] = var3;
              var2++;
              ((ww) this).field_hb[var2] = var12 + (((((ww) this).field_t[param0] & 65535) - var12) * var13 >> 16);
              break L5;
            }
          } else {
            ((ww) this).field_y[var2] = ((ww) this).field_v[var6];
            ((ww) this).field_E[var2] = ((ww) this).field_J[var6];
            ((ww) this).field_yb[var2] = ((ww) this).field_mb[var6];
            var2++;
            ((ww) this).field_hb[var2] = ((ww) this).field_Fb[param0] & 65535;
            break L5;
          }
        }
        L7: {
          var10 = ((ww) this).field_y[0];
          var11 = ((ww) this).field_y[1];
          var12 = ((ww) this).field_y[2];
          var13 = ((ww) this).field_E[0];
          var14 = ((ww) this).field_E[1];
          var15 = ((ww) this).field_E[2];
          var7 = ((ww) this).field_yb[0];
          var8 = ((ww) this).field_yb[1];
          var9 = ((ww) this).field_yb[2];
          ((ww) this).field_w.field_q = false;
          if (var2 != 3) {
            break L7;
          } else {
            L8: {
              L9: {
                if (var10 < 0) {
                  break L9;
                } else {
                  if (var11 < 0) {
                    break L9;
                  } else {
                    if (var12 < 0) {
                      break L9;
                    } else {
                      if (var10 > ((ww) this).field_F.field_y) {
                        break L9;
                      } else {
                        if (var11 > ((ww) this).field_F.field_y) {
                          break L9;
                        } else {
                          if (var12 <= ((ww) this).field_F.field_y) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              ((ww) this).field_w.field_q = true;
              break L8;
            }
            L10: {
              if (((ww) this).field_X == null) {
                break L10;
              } else {
                if (((ww) this).field_X[param0] != -1) {
                  L11: {
                    var16 = -16777216;
                    if (((ww) this).field_h == null) {
                      break L11;
                    } else {
                      var16 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                      break L11;
                    }
                  }
                  var17 = var16 | ((ww) this).field_t[param0] & 16777215;
                  if (((ww) this).field_Fb[param0] != -1) {
                    ((ww) this).field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    break L7;
                  } else {
                    ((ww) this).field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    break L7;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (((ww) this).field_Fb[param0] != -1) {
              ((ww) this).field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, (float)((ww) this).field_hb[0], (float)((ww) this).field_hb[1], (float)((ww) this).field_hb[2]);
              break L7;
            } else {
              ((ww) this).field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, bt.field_h[((ww) this).field_t[param0] & 65535]);
              break L7;
            }
          }
        }
        L12: {
          if (var2 != 4) {
            break L12;
          } else {
            L13: {
              L14: {
                if (var10 < 0) {
                  break L14;
                } else {
                  if (var11 < 0) {
                    break L14;
                  } else {
                    if (var12 < 0) {
                      break L14;
                    } else {
                      if (var10 > ((ww) this).field_F.field_y) {
                        break L14;
                      } else {
                        if (var11 > ((ww) this).field_F.field_y) {
                          break L14;
                        } else {
                          if (var12 > ((ww) this).field_F.field_y) {
                            break L14;
                          } else {
                            if (((ww) this).field_y[3] < 0) {
                              break L14;
                            } else {
                              if (((ww) this).field_y[3] <= ((ww) this).field_F.field_y) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              ((ww) this).field_w.field_q = true;
              break L13;
            }
            L15: {
              if (((ww) this).field_X == null) {
                break L15;
              } else {
                if (((ww) this).field_X[param0] != -1) {
                  L16: {
                    var16 = -16777216;
                    if (((ww) this).field_h == null) {
                      break L16;
                    } else {
                      var16 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                      break L16;
                    }
                  }
                  var17 = var16 | ((ww) this).field_t[param0] & 16777215;
                  if (((ww) this).field_Fb[param0] != -1) {
                    ((ww) this).field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    ((ww) this).field_w.b((float)var13, (float)var15, (float)((ww) this).field_E[3], (float)var10, (float)var12, (float)((ww) this).field_y[3], (float)var7, (float)var9, (float)((ww) this).field_yb[3], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    break L12;
                  } else {
                    ((ww) this).field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    ((ww) this).field_w.b((float)var13, (float)var15, (float)((ww) this).field_E[3], (float)var10, (float)var12, (float)((ww) this).field_y[3], (float)var7, (float)var9, (float)((ww) this).field_yb[3], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var17, var17, var17, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    break L12;
                  }
                } else {
                  break L15;
                }
              }
            }
            if (((ww) this).field_Fb[param0] != -1) {
              ((ww) this).field_w.b((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, (float)((ww) this).field_hb[0], (float)((ww) this).field_hb[1], (float)((ww) this).field_hb[2]);
              ((ww) this).field_w.b((float)var13, (float)var15, (float)((ww) this).field_E[3], (float)var10, (float)var12, (float)((ww) this).field_y[3], (float)var7, (float)var8, (float)((ww) this).field_yb[3], (float)((ww) this).field_hb[0], (float)((ww) this).field_hb[2], (float)((ww) this).field_hb[3]);
              break L12;
            } else {
              var16 = bt.field_h[((ww) this).field_t[param0] & 65535];
              ((ww) this).field_w.a((float)var13, (float)var14, (float)var15, (float)var10, (float)var11, (float)var12, (float)var7, (float)var8, (float)var9, var16);
              ((ww) this).field_w.a((float)var13, (float)var15, (float)((ww) this).field_E[3], (float)var10, (float)var12, (float)((ww) this).field_y[3], (float)var7, (float)var8, (float)((ww) this).field_yb[3], var16);
              break L12;
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
            param1 = 2;
        } else {
            if (param1 > 126) {
                param1 = 126;
            }
        }
        return (param0 & 65408) + param1;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ((ww) this).field_M[param0];
                    var3 = ((ww) this).field_bb[param0];
                    var4 = ((ww) this).field_x[param0];
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((ww) this).field_X == null) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = this;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((ww) this).field_X[param0] != -1) {
                            statePc = 16;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (((ww) this).field_h != null) {
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
                        ((ww) this).field_w.field_b = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    ((ww) this).field_w.field_b = ((ww) this).field_h[param0] & 255;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        if (((ww) this).field_Fb[param0] != -1) {
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
                        ((ww) this).field_w.a((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], bt.field_h[((ww) this).field_t[param0] & 65535]);
                        statePc = 21;
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
                    ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], (float)(((ww) this).field_t[param0] & 65535), (float)(((ww) this).field_o[param0] & 65535), (float)(((ww) this).field_Fb[param0] & 65535));
                    statePc = 21;
                    continue stateLoop;
                }
                case 16: {
                    var5 = -16777216;
                    if (((ww) this).field_h == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = 255 - (((ww) this).field_h[param0] & 255) << 24;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (((ww) this).field_Fb[param0] != -1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var6 = var5 | ((ww) this).field_t[param0] & 16777215;
                    ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var6, var6, var6, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    ((ww) this).field_w.b((float)((ww) this).field_J[var2], (float)((ww) this).field_J[var3], (float)((ww) this).field_J[var4], (float)((ww) this).field_v[var2], (float)((ww) this).field_v[var3], (float)((ww) this).field_v[var4], (float)((ww) this).field_mb[var2], (float)((ww) this).field_mb[var3], (float)((ww) this).field_mb[var4], ((ww) this).field_W[param0][0], ((ww) this).field_W[param0][1], ((ww) this).field_W[param0][2], ((ww) this).field_l[param0][0], ((ww) this).field_l[param0][1], ((ww) this).field_l[param0][2], var5 | ((ww) this).field_t[param0] & 16777215, var5 | ((ww) this).field_o[param0] & 16777215, var5 | ((ww) this).field_Fb[param0] & 16777215, ((ww) this).field_F.field_D, 0, 0, 0, (int) ((ww) this).field_X[param0]);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void FA(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        Throwable var7 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((((ww) this).field_P & 6) == 6) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        throw new IllegalStateException();
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    var2 = qu.field_b[param0];
                    var3 = qu.field_d[param0];
                    var4 = this;
                    // monitorenter this
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 >= ((ww) this).field_p) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = ((ww) this).field_rb[var5] * var3 - ((ww) this).field_T[var5] * var2 >> 14;
                        ((ww) this).field_T[var5] = ((ww) this).field_rb[var5] * var2 + ((ww) this).field_T[var5] * var3 >> 14;
                        ((ww) this).field_rb[var5] = var6;
                        var5++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.f();
                        // monitorexit var4
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7 = caughtException;
                        // monitorexit var4
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var7;
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean NA() {
        Throwable decompiledCaughtException = null;
        try {
          if (((ww) this).field_sb != null) {
          } else {
            return false;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw (RuntimeException) (Object) decompiledCaughtException;
        }
        ((ww) this).field_gb = 0;
        ((ww) this).field_H = 0;
        ((ww) this).field_Y = 0;
        return true;
    }

    private final void b(gda param0, el param1, int param2, int param3) {
        try {
            pna var5 = null;
            int var6 = 0;
            float var7 = 0.0f;
            float var8 = 0.0f;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            float var13 = 0.0f;
            float var14 = 0.0f;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            float var19 = 0.0f;
            float var20 = 0.0f;
            int var21 = 0;
            int var22 = 0;
            int var23 = 0;
            int var24 = 0;
            float var25 = 0.0f;
            float var26 = 0.0f;
            float var27 = 0.0f;
            float var28 = 0.0f;
            float var29 = 0.0f;
            float var30 = 0.0f;
            Object var31_ref_Object = null;
            int var31 = 0;
            int var32 = 0;
            int var33 = 0;
            float var34 = 0.0f;
            float var35 = 0.0f;
            float var36 = 0.0f;
            int var37 = 0;
            int var38 = 0;
            int var39 = 0;
            int var40 = 0;
            int var41 = 0;
            int var42 = 0;
            int var43_int = 0;
            Object var43 = null;
            int var44 = 0;
            hna var44_ref_hna = null;
            int var45 = 0;
            nsa var45_ref_nsa = null;
            int var46 = 0;
            int var47_int = 0;
            float var47 = 0.0f;
            int var48 = 0;
            nsa var49 = null;
            float stackIn_25_0 = 0.0f;
            float stackIn_35_0 = 0.0f;
            float stackIn_51_0 = 0.0f;
            int stackIn_78_0 = 0;
            int stackIn_85_0 = 0;
            iua stackIn_147_0 = null;
            iua stackIn_148_0 = null;
            iua stackIn_149_0 = null;
            int stackIn_149_1 = 0;
            int stackIn_152_0 = 0;
            Object stackIn_154_0 = null;
            int stackIn_154_1 = 0;
            Object stackIn_155_0 = null;
            int stackIn_155_1 = 0;
            Object stackIn_156_0 = null;
            int stackIn_156_1 = 0;
            Object stackIn_157_0 = null;
            int stackIn_157_1 = 0;
            Object stackIn_158_0 = null;
            int stackIn_158_1 = 0;
            Object stackIn_159_0 = null;
            int stackIn_159_1 = 0;
            Object stackIn_160_0 = null;
            int stackIn_160_1 = 0;
            Object stackIn_161_0 = null;
            int stackIn_161_1 = 0;
            int stackIn_161_2 = 0;
            Object stackIn_163_0 = null;
            int stackIn_163_1 = 0;
            Object stackIn_164_0 = null;
            int stackIn_164_1 = 0;
            Object stackIn_165_0 = null;
            int stackIn_165_1 = 0;
            Object stackIn_166_0 = null;
            int stackIn_166_1 = 0;
            Object stackIn_167_0 = null;
            int stackIn_167_1 = 0;
            Object stackIn_168_0 = null;
            int stackIn_168_1 = 0;
            Object stackIn_169_0 = null;
            int stackIn_169_1 = 0;
            int stackIn_169_2 = 0;
            float stackOut_24_0 = 0.0f;
            float stackOut_23_0 = 0.0f;
            float stackOut_34_0 = 0.0f;
            float stackOut_33_0 = 0.0f;
            float stackOut_50_0 = 0.0f;
            float stackOut_49_0 = 0.0f;
            int stackOut_77_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_83_0 = 0;
            iua stackOut_146_0 = null;
            iua stackOut_148_0 = null;
            int stackOut_148_1 = 0;
            iua stackOut_147_0 = null;
            int stackOut_147_1 = 0;
            int stackOut_151_0 = 0;
            int stackOut_150_0 = 0;
            Object stackOut_162_0 = null;
            int stackOut_162_1 = 0;
            Object stackOut_163_0 = null;
            int stackOut_163_1 = 0;
            Object stackOut_164_0 = null;
            int stackOut_164_1 = 0;
            Object stackOut_165_0 = null;
            int stackOut_165_1 = 0;
            Object stackOut_168_0 = null;
            int stackOut_168_1 = 0;
            int stackOut_168_2 = 0;
            Object stackOut_166_0 = null;
            int stackOut_166_1 = 0;
            Object stackOut_167_0 = null;
            int stackOut_167_1 = 0;
            int stackOut_167_2 = 0;
            Object stackOut_153_0 = null;
            int stackOut_153_1 = 0;
            Object stackOut_154_0 = null;
            int stackOut_154_1 = 0;
            Object stackOut_155_0 = null;
            int stackOut_155_1 = 0;
            Object stackOut_156_0 = null;
            int stackOut_156_1 = 0;
            Object stackOut_157_0 = null;
            int stackOut_157_1 = 0;
            Object stackOut_160_0 = null;
            int stackOut_160_1 = 0;
            int stackOut_160_2 = 0;
            Object stackOut_158_0 = null;
            int stackOut_158_1 = 0;
            Object stackOut_159_0 = null;
            int stackOut_159_1 = 0;
            int stackOut_159_2 = 0;
            if (((ww) this).field_Z >= 1) {
              L0: {
                ((ww) this).field_B = (pna) (Object) param0;
                var5 = ((ww) this).field_d.field_A;
                if (((ww) this).field_r) {
                  break L0;
                } else {
                  this.d();
                  break L0;
                }
              }
              L1: {
                var6 = 0;
                if (((ww) this).field_B.field_g != 16384.0f) {
                  break L1;
                } else {
                  if (((ww) this).field_B.field_i != 0.0f) {
                    break L1;
                  } else {
                    if (((ww) this).field_B.field_n != 0.0f) {
                      break L1;
                    } else {
                      if (((ww) this).field_B.field_h != 0.0f) {
                        break L1;
                      } else {
                        if (((ww) this).field_B.field_s != 16384.0f) {
                          break L1;
                        } else {
                          if (((ww) this).field_B.field_j != 0.0f) {
                            break L1;
                          } else {
                            if (((ww) this).field_B.field_r != 0.0f) {
                              break L1;
                            } else {
                              if (((ww) this).field_B.field_o != 0.0f) {
                                break L1;
                              } else {
                                if (((ww) this).field_B.field_f != 16384.0f) {
                                  break L1;
                                } else {
                                  var6 = 1;
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                var7 = var5.field_m + var5.field_r * ((ww) this).field_B.field_l + var5.field_o * ((ww) this).field_B.field_e + var5.field_f * ((ww) this).field_B.field_m;
                if (var6 == 0) {
                  stackOut_24_0 = var5.field_r * ((ww) this).field_B.field_i + var5.field_o * ((ww) this).field_B.field_s + var5.field_f * ((ww) this).field_B.field_o;
                  stackIn_25_0 = stackOut_24_0;
                  break L2;
                } else {
                  stackOut_23_0 = var5.field_o;
                  stackIn_25_0 = stackOut_23_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_25_0;
                var9 = (int)(var7 + (float)((ww) this).field_f * var8);
                var10 = (int)(var7 + (float)((ww) this).field_cb * var8);
                if (var9 <= var10) {
                  var11 = var9 - ((ww) this).field_U;
                  var12 = var10 + ((ww) this).field_U;
                  break L3;
                } else {
                  var11 = var10 - ((ww) this).field_U;
                  var12 = var9 + ((ww) this).field_U;
                  break L3;
                }
              }
              if (var11 < ((ww) this).field_d.field_U) {
                if (var12 > ((ww) this).field_d.field_g) {
                  L4: {
                    var13 = var5.field_l + var5.field_g * ((ww) this).field_B.field_l + var5.field_i * ((ww) this).field_B.field_e + var5.field_n * ((ww) this).field_B.field_m;
                    if (var6 == 0) {
                      stackOut_34_0 = var5.field_g * ((ww) this).field_B.field_i + var5.field_i * ((ww) this).field_B.field_s + var5.field_n * ((ww) this).field_B.field_o;
                      stackIn_35_0 = stackOut_34_0;
                      break L4;
                    } else {
                      stackOut_33_0 = var5.field_i;
                      stackIn_35_0 = stackOut_33_0;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = stackIn_35_0;
                    var15 = (int)(var13 + (float)((ww) this).field_f * var14);
                    var16 = (int)(var13 + (float)((ww) this).field_cb * var14);
                    if (var15 <= var16) {
                      var17 = (var15 - ((ww) this).field_U) * ((ww) this).field_d.field_Q;
                      var18 = (var16 + ((ww) this).field_U) * ((ww) this).field_d.field_Q;
                      break L5;
                    } else {
                      var17 = (var16 - ((ww) this).field_U) * ((ww) this).field_d.field_Q;
                      var18 = (var15 + ((ww) this).field_U) * ((ww) this).field_d.field_Q;
                      break L5;
                    }
                  }
                  L6: {
                    if (param2 != -1) {
                      if (var17 / param2 < ((ww) this).field_d.field_l) {
                        if (var18 / param2 > ((ww) this).field_d.field_p) {
                          break L6;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (var17 / var12 < ((ww) this).field_d.field_l) {
                        if (var18 / var12 > ((ww) this).field_d.field_p) {
                          break L6;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  L7: {
                    var19 = var5.field_e + var5.field_h * ((ww) this).field_B.field_l + var5.field_s * ((ww) this).field_B.field_e + var5.field_j * ((ww) this).field_B.field_m;
                    if (var6 == 0) {
                      stackOut_50_0 = var5.field_h * ((ww) this).field_B.field_i + var5.field_s * ((ww) this).field_B.field_s + var5.field_j * ((ww) this).field_B.field_o;
                      stackIn_51_0 = stackOut_50_0;
                      break L7;
                    } else {
                      stackOut_49_0 = var5.field_s;
                      stackIn_51_0 = stackOut_49_0;
                      break L7;
                    }
                  }
                  L8: {
                    var20 = stackIn_51_0;
                    var21 = (int)(var19 + (float)((ww) this).field_f * var20);
                    var22 = (int)(var19 + (float)((ww) this).field_cb * var20);
                    if (var21 <= var22) {
                      var23 = (var21 - ((ww) this).field_U) * ((ww) this).field_d.field_C;
                      var24 = (var22 + ((ww) this).field_U) * ((ww) this).field_d.field_C;
                      break L8;
                    } else {
                      var23 = (var22 - ((ww) this).field_U) * ((ww) this).field_d.field_C;
                      var24 = (var21 + ((ww) this).field_U) * ((ww) this).field_d.field_C;
                      break L8;
                    }
                  }
                  L9: {
                    if (param2 != -1) {
                      if (var23 / param2 < ((ww) this).field_d.field_o) {
                        if (var24 / param2 > ((ww) this).field_d.field_k) {
                          break L9;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (var23 / var12 < ((ww) this).field_d.field_o) {
                        if (var24 / var12 > ((ww) this).field_d.field_k) {
                          break L9;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  L10: {
                    if (var6 == 0) {
                      var25 = var5.field_g * ((ww) this).field_B.field_g + var5.field_i * ((ww) this).field_B.field_h + var5.field_n * ((ww) this).field_B.field_r;
                      var26 = var5.field_h * ((ww) this).field_B.field_g + var5.field_s * ((ww) this).field_B.field_h + var5.field_j * ((ww) this).field_B.field_r;
                      var27 = var5.field_r * ((ww) this).field_B.field_g + var5.field_o * ((ww) this).field_B.field_h + var5.field_f * ((ww) this).field_B.field_r;
                      var28 = var5.field_g * ((ww) this).field_B.field_n + var5.field_i * ((ww) this).field_B.field_j + var5.field_n * ((ww) this).field_B.field_f;
                      var29 = var5.field_h * ((ww) this).field_B.field_n + var5.field_s * ((ww) this).field_B.field_j + var5.field_j * ((ww) this).field_B.field_f;
                      var30 = var5.field_r * ((ww) this).field_B.field_n + var5.field_o * ((ww) this).field_B.field_j + var5.field_f * ((ww) this).field_B.field_f;
                      break L10;
                    } else {
                      var25 = var5.field_g;
                      var26 = var5.field_h;
                      var27 = var5.field_r;
                      var28 = var5.field_n;
                      var29 = var5.field_j;
                      var30 = var5.field_f;
                      break L10;
                    }
                  }
                  L11: {
                    if (((ww) this).field_d.field_u <= 1) {
                      break L11;
                    } else {
                      var31_ref_Object = this;
                      // monitorenter this
                      L12: while (true) {
                        if (!((ww) this).field_zb) {
                          ((ww) this).field_zb = true;
                          // monitorexit var31_ref_Object
                          break L11;
                        } else {
                          this.wait();
                          continue L12;
                        }
                      }
                    }
                  }
                  L13: {
                    this.b(Thread.currentThread());
                    if ((param3 & 2) == 0) {
                      ((ww) this).field_w.a(false);
                      break L13;
                    } else {
                      ((ww) this).field_w.a(true);
                      break L13;
                    }
                  }
                  L14: {
                    var31 = 0;
                    if (var11 > ((ww) this).field_d.field_g) {
                      stackOut_77_0 = 0;
                      stackIn_78_0 = stackOut_77_0;
                      break L14;
                    } else {
                      stackOut_76_0 = 1;
                      stackIn_78_0 = stackOut_76_0;
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      var32 = stackIn_78_0;
                      if (var32 != 0) {
                        break L16;
                      } else {
                        if (((ww) this).field_i != null) {
                          break L16;
                        } else {
                          if (((ww) this).field_kb == null) {
                            stackOut_84_0 = 0;
                            stackIn_85_0 = stackOut_84_0;
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    stackOut_83_0 = 1;
                    stackIn_85_0 = stackOut_83_0;
                    break L15;
                  }
                  L17: {
                    var33 = stackIn_85_0;
                    ((ww) this).field_F.field_y = ((ww) this).field_w.field_h;
                    ((ww) this).field_F.field_o = ((ww) this).field_w.field_e;
                    ((ww) this).field_F.field_H = ((ww) this).field_w.field_n;
                    var40 = ((ww) this).field_d.field_Q;
                    var41 = ((ww) this).field_d.field_C;
                    var42 = ((ww) this).field_d.field_g;
                    if (param2 != -1) {
                      var43_int = 0;
                      L18: while (true) {
                        if (var43_int >= ((ww) this).field_p) {
                          if (((ww) this).field_e == null) {
                            break L17;
                          } else {
                            var43_int = 0;
                            L19: while (true) {
                              if (var43_int >= ((ww) this).field_m) {
                                break L17;
                              } else {
                                var44_ref_hna = ((ww) this).field_e[var43_int];
                                var45_ref_nsa = ((ww) this).field_db[var43_int];
                                var46 = ((ww) this).field_M[var44_ref_hna.field_j];
                                var47_int = ((ww) this).field_bb[var44_ref_hna.field_j];
                                var48 = ((ww) this).field_x[var44_ref_hna.field_j];
                                var37 = (((ww) this).field_xb[var46] + ((ww) this).field_xb[var47_int] + ((ww) this).field_xb[var48]) / 3;
                                var38 = (((ww) this).field_rb[var46] + ((ww) this).field_rb[var47_int] + ((ww) this).field_rb[var48]) / 3;
                                var39 = (((ww) this).field_T[var46] + ((ww) this).field_T[var47_int] + ((ww) this).field_T[var48]) / 3;
                                var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
                                var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
                                var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                                var45_ref_nsa.field_e = ((ww) this).field_d.field_L + (int)(var34 * (float)var40 / (float)param2);
                                var45_ref_nsa.field_h = ((ww) this).field_d.field_w + (int)(var35 * (float)var41 / (float)param2);
                                var45_ref_nsa.field_n = param2 - var44_ref_hna.field_f;
                                var45_ref_nsa.field_l = var45_ref_nsa.field_m * var44_ref_hna.field_i * var40 / (param2 << 7);
                                var45_ref_nsa.field_c = var45_ref_nsa.field_g * var44_ref_hna.field_b * var41 / (param2 << 7);
                                var43_int++;
                                continue L19;
                              }
                            }
                          }
                        } else {
                          L20: {
                            var37 = ((ww) this).field_xb[var43_int];
                            var38 = ((ww) this).field_rb[var43_int];
                            var39 = ((ww) this).field_T[var43_int];
                            var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
                            var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
                            var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                            ((ww) this).field_mb[var43_int] = (int)var36;
                            ((ww) this).field_v[var43_int] = ((ww) this).field_F.field_o + (int)(var34 * (float)var40 / (float)param2);
                            ((ww) this).field_J[var43_int] = ((ww) this).field_F.field_H + (int)(var35 * (float)var41 / (float)param2);
                            if (var33 == 0) {
                              break L20;
                            } else {
                              ((ww) this).field_nb[var43_int] = (int)var34;
                              ((ww) this).field_C[var43_int] = (int)var35;
                              ((ww) this).field_Ab[var43_int] = param2;
                              break L20;
                            }
                          }
                          L21: {
                            if (!((ww) this).field_F.field_h) {
                              break L21;
                            } else {
                              ((ww) this).field_s[var43_int] = (int)(((ww) this).field_B.field_e + (((ww) this).field_B.field_h * (float)var37 + ((ww) this).field_B.field_s * (float)var38 + ((ww) this).field_B.field_j * (float)var39));
                              break L21;
                            }
                          }
                          var43_int++;
                          continue L18;
                        }
                      }
                    } else {
                      var43_int = 0;
                      L22: while (true) {
                        if (var43_int >= ((ww) this).field_p) {
                          if (((ww) this).field_e == null) {
                            break L17;
                          } else {
                            var43_int = 0;
                            L23: while (true) {
                              if (var43_int >= ((ww) this).field_m) {
                                break L17;
                              } else {
                                L24: {
                                  var44_ref_hna = ((ww) this).field_e[var43_int];
                                  var45_ref_nsa = ((ww) this).field_db[var43_int];
                                  var46 = ((ww) this).field_M[var44_ref_hna.field_j];
                                  var47_int = ((ww) this).field_bb[var44_ref_hna.field_j];
                                  var48 = ((ww) this).field_x[var44_ref_hna.field_j];
                                  var37 = (((ww) this).field_xb[var46] + ((ww) this).field_xb[var47_int] + ((ww) this).field_xb[var48]) / 3;
                                  var38 = (((ww) this).field_rb[var46] + ((ww) this).field_rb[var47_int] + ((ww) this).field_rb[var48]) / 3;
                                  var39 = (((ww) this).field_T[var46] + ((ww) this).field_T[var47_int] + ((ww) this).field_T[var48]) / 3;
                                  var34 = (float)var45_ref_nsa.field_b + (var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39);
                                  var35 = (float)var45_ref_nsa.field_a + (var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39);
                                  var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                                  if (var36 <= (float)((ww) this).field_d.field_g) {
                                    var49 = var45_ref_nsa;
                                    var45_ref_nsa.field_c = 0;
                                    var49.field_l = 0;
                                    break L24;
                                  } else {
                                    var45_ref_nsa.field_e = ((ww) this).field_d.field_L + (int)(var34 * (float)var40 / var36);
                                    var45_ref_nsa.field_h = ((ww) this).field_d.field_w + (int)(var35 * (float)var41 / var36);
                                    var45_ref_nsa.field_n = (int)var36 - var44_ref_hna.field_f;
                                    var45_ref_nsa.field_l = (int)((float)(var45_ref_nsa.field_m * var44_ref_hna.field_i * var40) / (var36 * 128.0f));
                                    var45_ref_nsa.field_c = (int)((float)(var45_ref_nsa.field_g * var44_ref_hna.field_b * var41) / (var36 * 128.0f));
                                    break L24;
                                  }
                                }
                                var43_int++;
                                continue L23;
                              }
                            }
                          }
                        } else {
                          L25: {
                            var37 = ((ww) this).field_xb[var43_int];
                            var38 = ((ww) this).field_rb[var43_int];
                            var39 = ((ww) this).field_T[var43_int];
                            var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
                            var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
                            var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                            ((ww) this).field_mb[var43_int] = (int)var36;
                            if (var36 < (float)var42) {
                              ((ww) this).field_v[var43_int] = -5000;
                              var31 = 1;
                              break L25;
                            } else {
                              ((ww) this).field_v[var43_int] = ((ww) this).field_F.field_o + (int)(var34 * (float)var40 / var36);
                              ((ww) this).field_J[var43_int] = ((ww) this).field_F.field_H + (int)(var35 * (float)var41 / var36);
                              break L25;
                            }
                          }
                          L26: {
                            if (var33 == 0) {
                              break L26;
                            } else {
                              ((ww) this).field_nb[var43_int] = (int)var34;
                              ((ww) this).field_C[var43_int] = (int)var35;
                              ((ww) this).field_Ab[var43_int] = (int)var36;
                              break L26;
                            }
                          }
                          L27: {
                            if (!((ww) this).field_F.field_h) {
                              break L27;
                            } else {
                              ((ww) this).field_s[var43_int] = (int)(((ww) this).field_B.field_e + (((ww) this).field_B.field_h * (float)var37 + ((ww) this).field_B.field_s * (float)var38 + ((ww) this).field_B.field_j * (float)var39));
                              break L27;
                            }
                          }
                          var43_int++;
                          continue L22;
                        }
                      }
                    }
                  }
                  L28: {
                    if (param1 == null) {
                      break L28;
                    } else {
                      L29: {
                        var43_int = 0;
                        var44 = 1;
                        var45 = ((ww) this).field_R + ((ww) this).field_O >> 1;
                        var46 = ((ww) this).field_Bb + ((ww) this).field_vb >> 1;
                        var37 = var45;
                        var38 = ((ww) this).field_f;
                        var39 = var46;
                        var34 = var13 + var25 * (float)var37 + var14 * (float)var38 + var28 * (float)var39;
                        var35 = var19 + var26 * (float)var37 + var20 * (float)var38 + var29 * (float)var39;
                        var36 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                        if (var36 < (float)var42) {
                          var43_int = 1;
                          break L29;
                        } else {
                          if (param2 == -1) {
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L30: {
                        var37 = var45;
                        var38 = ((ww) this).field_cb;
                        var39 = var46;
                        var47 = var7 + var27 * (float)var37 + var8 * (float)var38 + var30 * (float)var39;
                        if (var47 < (float)var42) {
                          var43_int = 1;
                          break L30;
                        } else {
                          if (param2 == -1) {
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L31: {
                        if (var43_int == 0) {
                          break L31;
                        } else {
                          L32: {
                            if (var36 >= (float)var42) {
                              break L32;
                            } else {
                              if (var47 >= (float)var42) {
                                break L32;
                              } else {
                                var44 = 0;
                                break L31;
                              }
                            }
                          }
                          if (var36 >= (float)var42) {
                            if (var47 >= (float)var42) {
                              break L31;
                            } else {
                              if (param2 == -1) {
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                          } else {
                            if (param2 == -1) {
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                      if (var44 == 0) {
                        break L28;
                      } else {
                        if (var36 <= var47) {
                          if (param2 == -1) {
                            break L28;
                          } else {
                            break L28;
                          }
                        } else {
                          if (param2 == -1) {
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                  }
                  L33: {
                    this.a(true);
                    stackOut_146_0 = ((ww) this).field_w;
                    stackIn_148_0 = stackOut_146_0;
                    stackIn_147_0 = stackOut_146_0;
                    if ((param3 & 1) != 0) {
                      stackOut_148_0 = (iua) (Object) stackIn_148_0;
                      stackOut_148_1 = 0;
                      stackIn_149_0 = stackOut_148_0;
                      stackIn_149_1 = stackOut_148_1;
                      break L33;
                    } else {
                      stackOut_147_0 = (iua) (Object) stackIn_147_0;
                      stackOut_147_1 = 1;
                      stackIn_149_0 = stackOut_147_0;
                      stackIn_149_1 = stackOut_147_1;
                      break L33;
                    }
                  }
                  L34: {
                    stackIn_149_0.field_j = stackIn_149_1 != 0;
                    ((ww) this).field_w.field_g = false;
                    if ((param3 & 4) == 0) {
                      stackOut_151_0 = 0;
                      stackIn_152_0 = stackOut_151_0;
                      break L34;
                    } else {
                      stackOut_150_0 = 1;
                      stackIn_152_0 = stackOut_150_0;
                      break L34;
                    }
                  }
                  L35: {
                    var43_int = stackIn_152_0;
                    if (var43_int == 0) {
                      L36: {
                        L37: {
                          L38: {
                            stackOut_162_0 = this;
                            stackOut_162_1 = var31;
                            stackIn_165_0 = stackOut_162_0;
                            stackIn_165_1 = stackOut_162_1;
                            stackIn_163_0 = stackOut_162_0;
                            stackIn_163_1 = stackOut_162_1;
                            if (!((ww) this).field_F.field_J) {
                              break L38;
                            } else {
                              stackOut_163_0 = this;
                              stackOut_163_1 = stackIn_163_1;
                              stackIn_167_0 = stackOut_163_0;
                              stackIn_167_1 = stackOut_163_1;
                              stackIn_164_0 = stackOut_163_0;
                              stackIn_164_1 = stackOut_163_1;
                              if (var12 > ((ww) this).field_F.field_B) {
                                break L37;
                              } else {
                                stackOut_164_0 = this;
                                stackOut_164_1 = stackIn_164_1;
                                stackIn_165_0 = stackOut_164_0;
                                stackIn_165_1 = stackOut_164_1;
                                break L38;
                              }
                            }
                          }
                          stackOut_165_0 = this;
                          stackOut_165_1 = stackIn_165_1;
                          stackIn_168_0 = stackOut_165_0;
                          stackIn_168_1 = stackOut_165_1;
                          stackIn_166_0 = stackOut_165_0;
                          stackIn_166_1 = stackOut_165_1;
                          if (!((ww) this).field_F.field_h) {
                            stackOut_168_0 = this;
                            stackOut_168_1 = stackIn_168_1;
                            stackOut_168_2 = 0;
                            stackIn_169_0 = stackOut_168_0;
                            stackIn_169_1 = stackOut_168_1;
                            stackIn_169_2 = stackOut_168_2;
                            break L36;
                          } else {
                            stackOut_166_0 = this;
                            stackOut_166_1 = stackIn_166_1;
                            stackIn_167_0 = stackOut_166_0;
                            stackIn_167_1 = stackOut_166_1;
                            break L37;
                          }
                        }
                        stackOut_167_0 = this;
                        stackOut_167_1 = stackIn_167_1;
                        stackOut_167_2 = 1;
                        stackIn_169_0 = stackOut_167_0;
                        stackIn_169_1 = stackOut_167_1;
                        stackIn_169_2 = stackOut_167_2;
                        break L36;
                      }
                      this.a(stackIn_169_1 != 0, stackIn_169_2 != 0, var11, var12 - var11);
                      break L35;
                    } else {
                      L39: {
                        L40: {
                          L41: {
                            stackOut_153_0 = this;
                            stackOut_153_1 = var31;
                            stackIn_157_0 = stackOut_153_0;
                            stackIn_157_1 = stackOut_153_1;
                            stackIn_154_0 = stackOut_153_0;
                            stackIn_154_1 = stackOut_153_1;
                            if (!((ww) this).field_F.field_J) {
                              break L41;
                            } else {
                              stackOut_154_0 = this;
                              stackOut_154_1 = stackIn_154_1;
                              stackIn_155_0 = stackOut_154_0;
                              stackIn_155_1 = stackOut_154_1;
                              stackOut_155_0 = this;
                              stackOut_155_1 = stackIn_155_1;
                              stackIn_159_0 = stackOut_155_0;
                              stackIn_159_1 = stackOut_155_1;
                              stackIn_156_0 = stackOut_155_0;
                              stackIn_156_1 = stackOut_155_1;
                              if (var12 > ((ww) this).field_F.field_B) {
                                break L40;
                              } else {
                                stackOut_156_0 = this;
                                stackOut_156_1 = stackIn_156_1;
                                stackIn_157_0 = stackOut_156_0;
                                stackIn_157_1 = stackOut_156_1;
                                break L41;
                              }
                            }
                          }
                          stackOut_157_0 = this;
                          stackOut_157_1 = stackIn_157_1;
                          stackIn_160_0 = stackOut_157_0;
                          stackIn_160_1 = stackOut_157_1;
                          stackIn_158_0 = stackOut_157_0;
                          stackIn_158_1 = stackOut_157_1;
                          if (!((ww) this).field_F.field_h) {
                            stackOut_160_0 = this;
                            stackOut_160_1 = stackIn_160_1;
                            stackOut_160_2 = 0;
                            stackIn_161_0 = stackOut_160_0;
                            stackIn_161_1 = stackOut_160_1;
                            stackIn_161_2 = stackOut_160_2;
                            break L39;
                          } else {
                            stackOut_158_0 = this;
                            stackOut_158_1 = stackIn_158_1;
                            stackIn_159_0 = stackOut_158_0;
                            stackIn_159_1 = stackOut_158_1;
                            break L40;
                          }
                        }
                        stackOut_159_0 = this;
                        stackOut_159_1 = stackIn_159_1;
                        stackOut_159_2 = 1;
                        stackIn_161_0 = stackOut_159_0;
                        stackIn_161_1 = stackOut_159_1;
                        stackIn_161_2 = stackOut_159_2;
                        break L39;
                      }
                      this.b(stackIn_161_1 != 0, stackIn_161_2 != 0, var11, var12 - var11);
                      break L35;
                    }
                  }
                  L42: {
                    if (((ww) this).field_e == null) {
                      break L42;
                    } else {
                      var43_int = 0;
                      L43: while (true) {
                        if (var43_int >= ((ww) this).field_g) {
                          break L42;
                        } else {
                          ((ww) this).field_jb[var43_int] = -1;
                          var43_int++;
                          continue L43;
                        }
                      }
                    }
                  }
                  L44: {
                    ((ww) this).field_w = null;
                    if (((ww) this).field_d.field_u <= 1) {
                      break L44;
                    } else {
                      var43 = this;
                      // monitorenter this
                      ((ww) this).field_zb = false;
                      this.notifyAll();
                      // monitorexit var43
                      break L44;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (!((ww) this).field_r) {
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          throw (RuntimeException) (Object) decompiledCaughtException;
        }
        var1 = 0;
        var2 = 0;
        var3 = 32767;
        var4 = 32767;
        var5 = 32767;
        var6 = -32768;
        var7 = -32768;
        var8 = -32768;
        var9 = 0;
        L0: while (true) {
          if (var9 >= ((ww) this).field_Z) {
            ((ww) this).field_R = (short)var3;
            ((ww) this).field_O = (short)var6;
            ((ww) this).field_f = (short)var4;
            ((ww) this).field_cb = (short)var7;
            ((ww) this).field_Bb = (short)var5;
            ((ww) this).field_vb = (short)var8;
            ((ww) this).field_U = (short)(int)(Math.sqrt((double)var1) + 0.99);
            ((ww) this).field_r = true;
            return;
          } else {
            L1: {
              var10 = ((ww) this).field_xb[var9];
              var11 = ((ww) this).field_rb[var9];
              var12 = ((ww) this).field_T[var9];
              if (var10 >= var3) {
                break L1;
              } else {
                var3 = var10;
                break L1;
              }
            }
            L2: {
              if (var10 <= var6) {
                break L2;
              } else {
                var6 = var10;
                break L2;
              }
            }
            L3: {
              if (var11 >= var4) {
                break L3;
              } else {
                var4 = var11;
                break L3;
              }
            }
            L4: {
              if (var11 <= var7) {
                break L4;
              } else {
                var7 = var11;
                break L4;
              }
            }
            L5: {
              if (var12 >= var5) {
                break L5;
              } else {
                var5 = var12;
                break L5;
              }
            }
            L6: {
              if (var12 <= var8) {
                break L6;
              } else {
                var8 = var12;
                break L6;
              }
            }
            L7: {
              var13 = var10 * var10 + var12 * var12;
              if (var13 <= var1) {
                break L7;
              } else {
                var1 = var13;
                break L7;
              }
            }
            L8: {
              var13 = var13 + var11 * var11;
              if (var13 <= var2) {
                break L8;
              } else {
                var2 = var13;
                break L8;
              }
            }
            var9++;
            continue L0;
          }
        }
    }

    private final void b(Thread param0) {
        tw var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ((ww) this).field_d.a((Runnable) (Object) param0);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ww) this).field_w = var2.field_v;
                        if (var2 != ((ww) this).field_F) {
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
                        return;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 4: {
                    ((ww) this).field_F = var2;
                    ((ww) this).field_s = ((ww) this).field_F.field_A;
                    ((ww) this).field_nb = ((ww) this).field_F.field_c;
                    ((ww) this).field_C = ((ww) this).field_F.field_k;
                    ((ww) this).field_Ab = ((ww) this).field_F.field_G;
                    ((ww) this).field_v = ((ww) this).field_F.field_j;
                    ((ww) this).field_J = ((ww) this).field_F.field_a;
                    ((ww) this).field_mb = ((ww) this).field_F.field_p;
                    ((ww) this).field_y = ((ww) this).field_F.field_i;
                    ((ww) this).field_E = ((ww) this).field_F.field_I;
                    ((ww) this).field_yb = ((ww) this).field_F.field_q;
                    ((ww) this).field_hb = ((ww) this).field_F.field_s;
                    ((ww) this).field_jb = ((ww) this).field_F.field_l;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(boolean param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        hna var6_ref_hna = null;
        int var6 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_58_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_38_0 = null;
        Object stackOut_57_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ww) this).field_e == null) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var5 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var5 >= ((ww) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6_ref_hna = ((ww) this).field_e[var5];
                    ((ww) this).field_jb[var6_ref_hna.field_j] = var5;
                    var5++;
                    statePc = 2;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (((ww) this).field_ab) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
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
                        if (((ww) this).field_e == null) {
                            statePc = 67;
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
                        if ((((ww) this).field_P & 256) != 0) {
                            statePc = 19;
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
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((ww) this).field_ub == null) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    var5 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var5 >= ((ww) this).field_g) {
                        statePc = 71;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var6 = ((ww) this).field_ub[var5];
                    this.b(var6, param0, param1);
                    var5++;
                    statePc = 16;
                    continue stateLoop;
                }
                case 19: {
                    var5 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        if (var5 >= ((ww) this).field_g) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (this.c(var5)) {
                            statePc = 31;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = this;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!this.h(var5)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 30: {
                    this.b(var5, param0, param1);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var5++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 32: {
                    if (((ww) this).field_wb != null) {
                        statePc = 47;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var5 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    try {
                        if (var5 >= ((ww) this).field_g) {
                            statePc = 71;
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
                        if (this.c(var5)) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = this;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (this.h(var5)) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                    throw (RuntimeException) (Object) caughtException;
                }
                case 44: {
                    this.b(var5, param0, param1);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var5++;
                    statePc = 34;
                    continue stateLoop;
                }
                case 47: {
                    var5 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (var5 >= 12) {
                        statePc = 71;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var6 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    try {
                        if (var6 >= ((ww) this).field_g) {
                            statePc = 65;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (((ww) this).field_wb[var6] == var5) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 56: {
                    try {
                        if (this.c(var6)) {
                            statePc = 63;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = this;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (this.h(var6)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 63: {
                    this.b(var6, param0, param1);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var6++;
                    statePc = 50;
                    continue stateLoop;
                }
                case 65: {
                    var5++;
                    statePc = 48;
                    continue stateLoop;
                }
                case 67: {
                    var5 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    try {
                        if (var5 >= ((ww) this).field_g) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        this.b(var5, param0, param1);
                        var5++;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        gna var13 = null;
        oha var13_ref = null;
        int var14 = 0;
        gna var15_ref_gna = null;
        int var15 = 0;
        oha var15_ref_oha = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        Object stackIn_8_0 = null;
        int stackIn_57_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_139_0 = 0;
        Object stackIn_144_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_138_0 = 0;
        Object stackOut_143_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((ww) this).field_eb != 1) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.e();
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    try {
                        if (((ww) this).field_eb != 2) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((ww) this).field_P & 618648) != 0) {
                            statePc = 14;
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
                        stackOut_7_0 = this;
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
                        if (((ww) this).field_W != null) {
                            statePc = 14;
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
                        ((ww) this).field_ob = null;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    try {
                        if (!param0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((ww) this).field_k = null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    return;
                }
                case 19: {
                    this.g();
                    var2 = ((ww) this).field_d.field_x;
                    var3 = ((ww) this).field_d.field_V;
                    var4 = ((ww) this).field_d.field_S;
                    var5 = ((ww) this).field_d.field_f >> 8;
                    var6 = ((ww) this).field_d.field_q * 768 / ((ww) this).field_ib;
                    var7 = ((ww) this).field_d.field_M * 768 / ((ww) this).field_ib;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        if (((ww) this).field_t != null) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((ww) this).field_t = new int[((ww) this).field_g];
                        ((ww) this).field_o = new int[((ww) this).field_g];
                        ((ww) this).field_Fb = new int[((ww) this).field_g];
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 24: {
                    var8 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        if (var8 >= ((ww) this).field_g) {
                            statePc = 142;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (((ww) this).field_k != null) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 29: {
                    var9 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    var9 = ((ww) this).field_k[var8];
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (((ww) this).field_h != null) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var10 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    var10 = ((ww) this).field_h[var8];
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (((ww) this).field_X != null) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var11 = -1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    var11 = ((ww) this).field_X[var8];
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var10 != -2) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var9 = 3;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var10 != -1) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var9 = 2;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    try {
                        if (var11 != -1) {
                            statePc = 93;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var9 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 45: {
                    var12 = ((ww) this).field_ob[var8] & 65535;
                    var13_int = (var12 & 127) * ((ww) this).field_Db >> 7;
                    var14 = tg.a((byte) -128, var12 & -128 | var13_int);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    try {
                        if (((ww) this).field_D == null) {
                            statePc = 51;
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
                        if (((ww) this).field_D[((ww) this).field_M[var8]] == null) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 50: {
                    var15_ref_oha = ((ww) this).field_D[((ww) this).field_M[var8]];
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    var15_ref_oha = ((ww) this).field_lb[((ww) this).field_M[var8]];
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var17 = (var2 * var15_ref_oha.field_a + var3 * var15_ref_oha.field_c + var4 * var15_ref_oha.field_b) / var15_ref_oha.field_d >> 16;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    try {
                        if (var17 <= 256) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = var6;
                        stackIn_57_0 = stackOut_54_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 56: {
                    stackOut_56_0 = var7;
                    stackIn_57_0 = stackOut_56_0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    var18 = stackIn_57_0;
                    var16 = (var5 >> 1) + (var18 * var17 >> 17);
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    try {
                        ((ww) this).field_t[var8] = var16 << 17 | ds.c(-127, var14, var16);
                        if (((ww) this).field_D == null) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (((ww) this).field_D[((ww) this).field_bb[var8]] == null) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 62: {
                    var15_ref_oha = ((ww) this).field_D[((ww) this).field_bb[var8]];
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    var15_ref_oha = ((ww) this).field_lb[((ww) this).field_bb[var8]];
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var17 = (var2 * var15_ref_oha.field_a + var3 * var15_ref_oha.field_c + var4 * var15_ref_oha.field_b) / var15_ref_oha.field_d >> 16;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    try {
                        if (var17 <= 256) {
                            statePc = 68;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = var6;
                        stackIn_69_0 = stackOut_66_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 68: {
                    stackOut_68_0 = var7;
                    stackIn_69_0 = stackOut_68_0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var18 = stackIn_69_0;
                    var16 = (var5 >> 1) + (var18 * var17 >> 17);
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    try {
                        ((ww) this).field_o[var8] = var16 << 17 | ds.c(-127, var14, var16);
                        if (((ww) this).field_D == null) {
                            statePc = 75;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (((ww) this).field_D[((ww) this).field_x[var8]] == null) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 74: {
                    var15_ref_oha = ((ww) this).field_D[((ww) this).field_x[var8]];
                    statePc = 76;
                    continue stateLoop;
                }
                case 75: {
                    var15_ref_oha = ((ww) this).field_lb[((ww) this).field_x[var8]];
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var17 = (var2 * var15_ref_oha.field_a + var3 * var15_ref_oha.field_c + var4 * var15_ref_oha.field_b) / var15_ref_oha.field_d >> 16;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    try {
                        if (var17 <= 256) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackOut_78_0 = var6;
                        stackIn_81_0 = stackOut_78_0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 79: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 80: {
                    stackOut_80_0 = var7;
                    stackIn_81_0 = stackOut_80_0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var18 = stackIn_81_0;
                    var16 = (var5 >> 1) + (var18 * var17 >> 17);
                    ((ww) this).field_Fb[var8] = var16 << 17 | ds.c(-127, var14, var16);
                    statePc = 141;
                    continue stateLoop;
                }
                case 82: {
                    if (var9 != 1) {
                        statePc = 89;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var12 = ((ww) this).field_ob[var8] & 65535;
                    var13_int = (var12 & 127) * ((ww) this).field_Db >> 7;
                    var14 = tg.a((byte) -105, var12 & -128 | var13_int);
                    var15_ref_gna = ((ww) this).field_I[var8];
                    var16 = var2 * var15_ref_gna.field_a + var3 * var15_ref_gna.field_c + var4 * var15_ref_gna.field_b >> 16;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    try {
                        if (var16 <= 256) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = var6;
                        stackIn_88_0 = stackOut_85_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 87: {
                    stackOut_87_0 = var7;
                    stackIn_88_0 = stackOut_87_0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var17 = stackIn_88_0;
                    var18 = (var5 >> 1) + (var17 * var16 >> 17);
                    ((ww) this).field_t[var8] = var18 << 17 | ds.c(-127, var14, var18);
                    ((ww) this).field_Fb[var8] = -1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 89: {
                    try {
                        if (var9 != 3) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        ((ww) this).field_t[var8] = 128;
                        ((ww) this).field_Fb[var8] = -1;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 92: {
                    ((ww) this).field_Fb[var8] = -2;
                    statePc = 141;
                    continue stateLoop;
                }
                case 93: {
                    var12 = ((ww) this).field_ob[var8] & 65535;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    try {
                        if (var9 != 0) {
                            statePc = 133;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (((ww) this).field_D == null) {
                            statePc = 102;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (((ww) this).field_D[((ww) this).field_M[var8]] == null) {
                            statePc = 102;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 100: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 101: {
                    var13_ref = ((ww) this).field_D[((ww) this).field_M[var8]];
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    var13_ref = ((ww) this).field_lb[((ww) this).field_M[var8]];
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var15 = (var2 * var13_ref.field_a + var3 * var13_ref.field_c + var4 * var13_ref.field_b) / var13_ref.field_d >> 16;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    try {
                        if (var15 <= 256) {
                            statePc = 107;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackOut_105_0 = var6;
                        stackIn_108_0 = stackOut_105_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 106: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 107: {
                    stackOut_107_0 = var7;
                    stackIn_108_0 = stackOut_107_0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    var16 = stackIn_108_0;
                    var14 = this.d((var5 >> 2) + (var16 * var15 >> 18));
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    try {
                        ((ww) this).field_t[var8] = var14 << 24 | this.a(var12, (short) var11, var14);
                        if (((ww) this).field_D == null) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (((ww) this).field_D[((ww) this).field_bb[var8]] == null) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 112: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 113: {
                    var13_ref = ((ww) this).field_D[((ww) this).field_bb[var8]];
                    statePc = 115;
                    continue stateLoop;
                }
                case 114: {
                    var13_ref = ((ww) this).field_lb[((ww) this).field_bb[var8]];
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    var15 = (var2 * var13_ref.field_a + var3 * var13_ref.field_c + var4 * var13_ref.field_b) / var13_ref.field_d >> 16;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    try {
                        if (var15 <= 256) {
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
                        stackOut_117_0 = var6;
                        stackIn_120_0 = stackOut_117_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 118: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 119: {
                    stackOut_119_0 = var7;
                    stackIn_120_0 = stackOut_119_0;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var16 = stackIn_120_0;
                    var14 = this.d((var5 >> 2) + (var16 * var15 >> 18));
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    try {
                        ((ww) this).field_o[var8] = var14 << 24 | this.a(var12, (short) var11, var14);
                        if (((ww) this).field_D == null) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (((ww) this).field_D[((ww) this).field_x[var8]] == null) {
                            statePc = 126;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 125: {
                    var13_ref = ((ww) this).field_D[((ww) this).field_x[var8]];
                    statePc = 127;
                    continue stateLoop;
                }
                case 126: {
                    var13_ref = ((ww) this).field_lb[((ww) this).field_x[var8]];
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    var15 = (var2 * var13_ref.field_a + var3 * var13_ref.field_c + var4 * var13_ref.field_b) / var13_ref.field_d >> 16;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    try {
                        if (var15 <= 256) {
                            statePc = 131;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = var6;
                        stackIn_132_0 = stackOut_129_0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 130: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 131: {
                    stackOut_131_0 = var7;
                    stackIn_132_0 = stackOut_131_0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var16 = stackIn_132_0;
                    var14 = this.d((var5 >> 2) + (var16 * var15 >> 18));
                    ((ww) this).field_Fb[var8] = var14 << 24 | this.a(var12, (short) var11, var14);
                    statePc = 141;
                    continue stateLoop;
                }
                case 133: {
                    if (var9 != 1) {
                        statePc = 140;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var13 = ((ww) this).field_I[var8];
                    var14 = var2 * var13.field_a + var3 * var13.field_c + var4 * var13.field_b >> 16;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    try {
                        if (var14 <= 256) {
                            statePc = 138;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        stackOut_136_0 = var6;
                        stackIn_139_0 = stackOut_136_0;
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 137: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 138: {
                    stackOut_138_0 = var7;
                    stackIn_139_0 = stackOut_138_0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var15 = stackIn_139_0;
                    var16 = this.d((var5 >> 2) + (var15 * var14 >> 18));
                    ((ww) this).field_t[var8] = var16 << 24 | this.a(var12, (short) var11, var16);
                    ((ww) this).field_Fb[var8] = -1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 140: {
                    ((ww) this).field_Fb[var8] = -2;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var8++;
                    statePc = 25;
                    continue stateLoop;
                }
                case 142: {
                    try {
                        ((ww) this).field_lb = null;
                        ((ww) this).field_D = null;
                        ((ww) this).field_I = null;
                        if ((((ww) this).field_P & 618648) != 0) {
                            statePc = 150;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackOut_143_0 = this;
                        stackIn_144_0 = stackOut_143_0;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (((ww) this).field_W != null) {
                            statePc = 150;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        ((ww) this).field_ob = null;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 149: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 150: {
                    try {
                        if (!param0) {
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
                        ((ww) this).field_k = null;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 153: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 154: {
                    ((ww) this).field_eb = 2;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(gda param0, el param1, int param2, int param3) {
        this.b(param0, param1, param2, param3);
    }

    private final void a(Thread param0) {
        tw var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ((ww) this).field_d.a((Runnable) (Object) param0);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (var2 != ((ww) this).field_z) {
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
                        return;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 4: {
                    ((ww) this).field_z = var2;
                    ((ww) this).field_pb = ((ww) this).field_z.field_C;
                    ((ww) this).field_u = ((ww) this).field_z.field_t;
                    ((ww) this).field_Q = ((ww) this).field_z.field_m;
                    ((ww) this).field_Gb = ((ww) this).field_z.field_K;
                    ((ww) this).field_N = ((ww) this).field_z.field_x;
                    ((ww) this).field_n = ((ww) this).field_z.field_E;
                    ((ww) this).field_qb = ((ww) this).field_z.field_w;
                    ((ww) this).field_K = ((ww) this).field_z.field_F;
                    ((ww) this).field_tb = ((ww) this).field_z.field_e;
                    ((ww) this).field_fb = ((ww) this).field_z.field_r;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        hna var11 = null;
        int var12_int = 0;
        nsa var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        Object stackIn_57_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_46_0 = 0;
        Object stackOut_56_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((ww) this).field_Fb[param0] != -2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 3: {
                    var4 = ((ww) this).field_M[param0];
                    var5 = ((ww) this).field_bb[param0];
                    var6 = ((ww) this).field_x[param0];
                    var7 = ((ww) this).field_v[var4];
                    var8 = ((ww) this).field_v[var5];
                    var9 = ((ww) this).field_v[var6];
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (!param1) {
                            statePc = 22;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = var7;
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
                        if (stackIn_6_0 == -5000) {
                            statePc = 16;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = var8;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == -5000) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var9 != -5000) {
                            statePc = 22;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    var10 = ((ww) this).field_nb[var4];
                    var11_int = ((ww) this).field_nb[var5];
                    var12_int = ((ww) this).field_nb[var6];
                    var13 = ((ww) this).field_C[var4];
                    var14 = ((ww) this).field_C[var5];
                    var15 = ((ww) this).field_C[var6];
                    var16 = ((ww) this).field_Ab[var4];
                    var17 = ((ww) this).field_Ab[var5];
                    var18 = ((ww) this).field_Ab[var6];
                    var10 = var10 - var11_int;
                    var12_int = var12_int - var11_int;
                    var13 = var13 - var14;
                    var15 = var15 - var14;
                    var16 = var16 - var17;
                    var18 = var18 - var17;
                    var19 = var13 * var18 - var16 * var15;
                    var20 = var16 * var12_int - var10 * var18;
                    var21 = var10 * var15 - var13 * var12_int;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        if (var11_int * var19 + var14 * var20 + var17 * var21 <= 0) {
                            statePc = 72;
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
                        this.e(param0);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 22: {
                    try {
                        if (((ww) this).field_jb[param0] != -1) {
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
                        stackOut_23_0 = var7;
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
                        if ((stackIn_24_0 - var8) * (((ww) this).field_J[var6] - ((ww) this).field_J[var5]) - (((ww) this).field_J[var4] - ((ww) this).field_J[var5]) * (var9 - var8) <= 0) {
                            statePc = 72;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var7 < 0) {
                            statePc = 50;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = var8;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 < 0) {
                            statePc = 50;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = var9;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 < 0) {
                            statePc = 50;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = var7;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 > ((ww) this).field_F.field_y) {
                            statePc = 50;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = var8;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 > ((ww) this).field_F.field_y) {
                            statePc = 50;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = var9;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 <= ((ww) this).field_F.field_y) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((ww) this).field_w.field_q = true;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 52: {
                    ((ww) this).field_w.field_q = false;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (!param2) {
                        statePc = 64;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var10 = ((ww) this).field_jb[param0];
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    try {
                        if (var10 == -1) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = this;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (((ww) this).field_e[var10].field_d) {
                            statePc = 72;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        this.i(param0);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 64: {
                    var10 = ((ww) this).field_jb[param0];
                    if (var10 == -1) {
                        statePc = 71;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var11 = ((ww) this).field_e[var10];
                    var12 = ((ww) this).field_db[var10];
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    try {
                        if (var11.field_d) {
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
                        this.f(param0);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 70: {
                    ((ww) this).field_d.c(var12.field_e, var12.field_h, var12.field_n, var12.field_l, var12.field_c, var12.field_j, var11.field_h & 65535, var12.field_k, (int) var11.field_c, (int) var11.field_g);
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    this.f(param0);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ww(sfa param0) {
        ((ww) this).field_zb = false;
        ((ww) this).field_Z = 0;
        ((ww) this).field_r = false;
        ((ww) this).field_ab = false;
        ((ww) this).field_eb = 0;
        ((ww) this).field_S = false;
        ((ww) this).field_A = false;
        ((ww) this).field_g = 0;
        ((ww) this).field_p = 0;
        ((ww) this).field_d = param0;
    }

    ww(sfa param0, oc param1, int param2, int param3, int param4, int param5) {
        d var7 = null;
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        int var10 = 0;
        int var11_int = 0;
        ima var11 = null;
        int var12_int = 0;
        tw var12 = null;
        jt var12_ref = null;
        lp var13 = null;
        float[] var13_array = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        dw var18 = null;
        int var19_int = 0;
        float[] var19 = null;
        dw var19_ref = null;
        jt var20 = null;
        float[] var20_array = null;
        lp var21_ref = null;
        int var21 = 0;
        dw var22_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        float[] var29 = null;
        float var29_float = 0.0f;
        int var30 = 0;
        float var30_float = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        float var34_float = 0.0f;
        int var34 = 0;
        float var35_float = 0.0f;
        int var35 = 0;
        float var36_float = 0.0f;
        int var36 = 0;
        float var37_float = 0.0f;
        int var37 = 0;
        float var38_float = 0.0f;
        int var38 = 0;
        float var39_float = 0.0f;
        int var39 = 0;
        float var40_float = 0.0f;
        int var40 = 0;
        float var41_float = 0.0f;
        int var41 = 0;
        float var42_float = 0.0f;
        int var42 = 0;
        float var43 = 0.0f;
        float var44 = 0.0f;
        float var45 = 0.0f;
        float var46 = 0.0f;
        float var47 = 0.0f;
        float var48 = 0.0f;
        float var49 = 0.0f;
        float var50 = 0.0f;
        float var51 = 0.0f;
        float var52 = 0.0f;
        float var53 = 0.0f;
        int stackIn_6_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_60_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        short stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        ((ww) this).field_zb = false;
        ((ww) this).field_Z = 0;
        ((ww) this).field_r = false;
        ((ww) this).field_ab = false;
        ((ww) this).field_eb = 0;
        ((ww) this).field_S = false;
        ((ww) this).field_A = false;
        ((ww) this).field_g = 0;
        ((ww) this).field_p = 0;
        ((ww) this).field_d = param0;
        ((ww) this).field_P = param2;
        ((ww) this).field_Db = param3;
        ((ww) this).field_ib = param4;
        var7 = ((ww) this).field_d.field_c;
        ((ww) this).field_p = param1.field_E;
        ((ww) this).field_Z = param1.field_L;
        ((ww) this).field_xb = param1.field_b;
        ((ww) this).field_rb = param1.field_I;
        ((ww) this).field_T = param1.field_p;
        ((ww) this).field_g = param1.field_o;
        ((ww) this).field_M = param1.field_a;
        ((ww) this).field_bb = param1.field_t;
        ((ww) this).field_x = param1.field_J;
        ((ww) this).field_wb = param1.field_C;
        ((ww) this).field_ob = param1.field_A;
        ((ww) this).field_h = param1.field_n;
        ((ww) this).field_V = param1.field_h;
        ((ww) this).field_k = param1.field_G;
        ((ww) this).field_i = param1.field_B;
        ((ww) this).field_kb = param1.field_e;
        ((ww) this).field_Eb = param1.field_y;
        var8 = new int[((ww) this).field_g];
        var9_int = 0;
        L0: while (true) {
          if (var9_int >= ((ww) this).field_g) {
            L1: {
              var9 = new long[((ww) this).field_g];
              if ((((ww) this).field_P & 256) == 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            var10 = stackIn_6_0;
            var11_int = 0;
            L2: while (true) {
              if (var11_int >= ((ww) this).field_g) {
                L3: {
                  ofa.a(var8, var9, 89);
                  if (param1.field_m == null) {
                    break L3;
                  } else {
                    ((ww) this).field_m = param1.field_m.length;
                    ((ww) this).field_e = new hna[((ww) this).field_m];
                    ((ww) this).field_db = new nsa[((ww) this).field_m];
                    var11_int = 0;
                    L4: while (true) {
                      if (var11_int >= param1.field_m.length) {
                        break L3;
                      } else {
                        L5: {
                          var12_ref = param1.field_m[var11_int];
                          var13 = fw.a(var12_ref.field_d, false);
                          var14 = bt.field_h[param1.field_A[var12_ref.field_a] & 65535] & 16777215;
                          stackOut_48_0 = var14;
                          stackOut_48_1 = 255;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          if (param1.field_n == null) {
                            stackOut_50_0 = stackIn_50_0;
                            stackOut_50_1 = stackIn_50_1;
                            stackOut_50_2 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            stackIn_51_2 = stackOut_50_2;
                            break L5;
                          } else {
                            stackOut_49_0 = stackIn_49_0;
                            stackOut_49_1 = stackIn_49_1;
                            stackOut_49_2 = param1.field_n[var12_ref.field_a] & 255;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            stackIn_51_2 = stackOut_49_2;
                            break L5;
                          }
                        }
                        var14 = stackIn_51_0 | stackIn_51_1 - stackIn_51_2 << 24;
                        ((ww) this).field_e[var11_int] = new hna(var12_ref.field_a, (int) param1.field_a[var12_ref.field_a], (int) param1.field_t[var12_ref.field_a], (int) param1.field_J[var12_ref.field_a], var13.field_d, var13.field_b, var13.field_f, var13.field_c, var13.field_e, var13.field_i, var12_ref.field_c);
                        ((ww) this).field_db[var11_int] = new nsa(var14);
                        var11_int++;
                        continue L4;
                      }
                    }
                  }
                }
                ((ww) this).field_W = new float[((ww) this).field_g][];
                ((ww) this).field_l = new float[((ww) this).field_g][];
                var11 = qqa.a(var8, param1, ((ww) this).field_g, (byte) -6);
                var12 = ((ww) this).field_d.a((Runnable) (Object) Thread.currentThread());
                var13_array = var12.field_d;
                var14 = 0;
                var15 = 0;
                L6: while (true) {
                  if (var15 >= ((ww) this).field_g) {
                    L7: {
                      if (var14 != 0) {
                        break L7;
                      } else {
                        ((ww) this).field_l = null;
                        ((ww) this).field_W = null;
                        break L7;
                      }
                    }
                    L8: {
                      if (param1.field_l == null) {
                        break L8;
                      } else {
                        if ((((ww) this).field_P & 32) == 0) {
                          break L8;
                        } else {
                          ((ww) this).field_sb = param1.a(true, (byte) 64);
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param1.field_D == null) {
                        break L9;
                      } else {
                        if ((((ww) this).field_P & 384) == 0) {
                          break L9;
                        } else {
                          ((ww) this).field_Cb = param1.c((byte) -61);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param1.field_m == null) {
                        break L10;
                      } else {
                        if ((((ww) this).field_P & 1024) == 0) {
                          break L10;
                        } else {
                          ((ww) this).field_j = param1.b((byte) -119);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param1.field_r == null) {
                        ((ww) this).field_X = null;
                        break L11;
                      } else {
                        ((ww) this).field_X = new short[((ww) this).field_g];
                        var15 = 0;
                        var16 = 0;
                        L12: while (true) {
                          if (var16 >= ((ww) this).field_g) {
                            L13: {
                              if (var15 != 0) {
                                break L13;
                              } else {
                                ((ww) this).field_X = null;
                                break L13;
                              }
                            }
                            break L11;
                          } else {
                            L14: {
                              var17 = param1.field_r[var16];
                              if (var17 == -1) {
                                ((ww) this).field_X[var16] = (short) -1;
                                break L14;
                              } else {
                                L15: {
                                  L16: {
                                    var18 = ((ww) this).field_d.field_c.a((byte) -2, var17);
                                    if ((param5 & 64) == 0) {
                                      break L16;
                                    } else {
                                      if (var18.field_p) {
                                        ((ww) this).field_X[var16] = (short) -1;
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  L17: {
                                    ((ww) this).field_X[var16] = (short) var17;
                                    var15 = 1;
                                    if (var18.field_d != 2) {
                                      break L17;
                                    } else {
                                      ((ww) this).field_ab = true;
                                      break L17;
                                    }
                                  }
                                  if (var18.field_s != 0) {
                                    break L15;
                                  } else {
                                    if (var18.field_o == 0) {
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                break L14;
                              }
                            }
                            var16++;
                            continue L12;
                          }
                        }
                      }
                    }
                    L18: {
                      L19: {
                        if (((ww) this).field_ab) {
                          break L19;
                        } else {
                          if (((ww) this).field_e == null) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      ((ww) this).field_ub = new short[((ww) this).field_g];
                      var15 = 0;
                      L20: while (true) {
                        if (var15 >= ((ww) this).field_g) {
                          break L18;
                        } else {
                          ((ww) this).field_ub[var15] = (short)var8[var15];
                          var15++;
                          continue L20;
                        }
                      }
                    }
                  } else {
                    L21: {
                      var16 = var8[var15];
                      if (param1.field_g != null) {
                        var17 = param1.field_g[var16];
                        break L21;
                      } else {
                        var17 = -1;
                        break L21;
                      }
                    }
                    L22: {
                      if (param1.field_r != null) {
                        stackOut_59_0 = param1.field_r[var16];
                        stackIn_60_0 = stackOut_59_0;
                        break L22;
                      } else {
                        stackOut_58_0 = -1;
                        stackIn_60_0 = stackOut_58_0;
                        break L22;
                      }
                    }
                    L23: {
                      var18_int = stackIn_60_0;
                      if (var18_int == -1) {
                        break L23;
                      } else {
                        if ((param5 & 64) == 0) {
                          break L23;
                        } else {
                          var19_ref = var7.a((byte) 110, var18_int & 65535);
                          if (!var19_ref.field_p) {
                            break L23;
                          } else {
                            var18_int = -1;
                            break L23;
                          }
                        }
                      }
                    }
                    L24: {
                      if (var18_int == -1) {
                        break L24;
                      } else {
                        var14 = 1;
                        ((ww) this).field_W[var16] = new float[3];
                        var19 = new float[3];
                        ((ww) this).field_l[var16] = new float[3];
                        var20_array = new float[3];
                        var21 = 0;
                        if (var17 != -1) {
                          var17 = var17 & 255;
                          var22 = param1.field_u[var17];
                          if (var22 != 0) {
                            var23 = ((ww) this).field_M[var16];
                            var24 = ((ww) this).field_bb[var16];
                            var25 = ((ww) this).field_x[var16];
                            var26 = var11.field_a[var17];
                            var27 = var11.field_c[var17];
                            var28 = var11.field_d[var17];
                            var29 = var11.field_b[var17];
                            var30 = param1.field_z[var17];
                            var31 = (float)param1.field_d[var17] / 256.0f;
                            if (var22 != 1) {
                              if (var22 != 2) {
                                if (var22 != 3) {
                                  break L24;
                                } else {
                                  ifa.a(((ww) this).field_T[var23], ((ww) this).field_xb[var23], var27, var28, var13_array, var31, var30, var26, var29, (byte) -44, ((ww) this).field_rb[var23]);
                                  var19[0] = var13_array[0];
                                  var20_array[0] = var13_array[1];
                                  ifa.a(((ww) this).field_T[var24], ((ww) this).field_xb[var24], var27, var28, var13_array, var31, var30, var26, var29, (byte) -44, ((ww) this).field_rb[var24]);
                                  var19[1] = var13_array[0];
                                  var20_array[1] = var13_array[1];
                                  ifa.a(((ww) this).field_T[var25], ((ww) this).field_xb[var25], var27, var28, var13_array, var31, var30, var26, var29, (byte) -44, ((ww) this).field_rb[var25]);
                                  var19[2] = var13_array[0];
                                  var20_array[2] = var13_array[1];
                                  if ((var30 & 1) != 0) {
                                    L25: {
                                      if (var20_array[1] - var20_array[0] <= 0.5f) {
                                        if (var20_array[0] - var20_array[1] <= 0.5f) {
                                          break L25;
                                        } else {
                                          var20_array[1] = var20_array[1] + 1.0f;
                                          break L25;
                                        }
                                      } else {
                                        var20_array[1] = var20_array[1] - 1.0f;
                                        break L25;
                                      }
                                    }
                                    if (var20_array[2] - var20_array[0] <= 0.5f) {
                                      if (var20_array[0] - var20_array[2] <= 0.5f) {
                                        break L24;
                                      } else {
                                        var20_array[2] = var20_array[2] + 1.0f;
                                        break L24;
                                      }
                                    } else {
                                      var20_array[2] = var20_array[2] - 1.0f;
                                      break L24;
                                    }
                                  } else {
                                    L26: {
                                      if (var19[1] - var19[0] <= 0.5f) {
                                        if (var19[0] - var19[1] <= 0.5f) {
                                          break L26;
                                        } else {
                                          var19[1] = var19[1] + 1.0f;
                                          break L26;
                                        }
                                      } else {
                                        var19[1] = var19[1] - 1.0f;
                                        break L26;
                                      }
                                    }
                                    if (var19[2] - var19[0] <= 0.5f) {
                                      if (var19[0] - var19[2] <= 0.5f) {
                                        break L24;
                                      } else {
                                        var19[2] = var19[2] + 1.0f;
                                        break L24;
                                      }
                                    } else {
                                      var19[2] = var19[2] - 1.0f;
                                      break L24;
                                    }
                                  }
                                }
                              } else {
                                var32 = (float)param1.field_v[var17] / 256.0f;
                                var33 = (float)param1.field_c[var17] / 256.0f;
                                var34 = ((ww) this).field_xb[var24] - ((ww) this).field_xb[var23];
                                var35 = ((ww) this).field_rb[var24] - ((ww) this).field_rb[var23];
                                var36 = ((ww) this).field_T[var24] - ((ww) this).field_T[var23];
                                var37 = ((ww) this).field_xb[var25] - ((ww) this).field_xb[var23];
                                var38 = ((ww) this).field_rb[var25] - ((ww) this).field_rb[var23];
                                var39 = ((ww) this).field_T[var25] - ((ww) this).field_T[var23];
                                var40 = var35 * var39 - var38 * var36;
                                var41 = var36 * var37 - var39 * var34;
                                var42 = var34 * var38 - var37 * var35;
                                var43 = 64.0f / (float)param1.field_j[var17];
                                var44 = 64.0f / (float)param1.field_f[var17];
                                var45 = 64.0f / (float)param1.field_x[var17];
                                var46 = ((float)var40 * var29[0] + (float)var41 * var29[1] + (float)var42 * var29[2]) / var43;
                                var47 = ((float)var40 * var29[3] + (float)var41 * var29[4] + (float)var42 * var29[5]) / var44;
                                var48 = ((float)var40 * var29[6] + (float)var41 * var29[7] + (float)var42 * var29[8]) / var45;
                                var21 = mr.a(var48, var47, false, var46);
                                as.a(var27, var13_array, ((ww) this).field_rb[var23], var26, var33, var28, var32, ((ww) this).field_xb[var23], var21, ((ww) this).field_T[var23], -94, var31, var30, var29);
                                var19[0] = var13_array[0];
                                var20_array[0] = var13_array[1];
                                as.a(var27, var13_array, ((ww) this).field_rb[var24], var26, var33, var28, var32, ((ww) this).field_xb[var24], var21, ((ww) this).field_T[var24], -125, var31, var30, var29);
                                var19[1] = var13_array[0];
                                var20_array[1] = var13_array[1];
                                as.a(var27, var13_array, ((ww) this).field_rb[var25], var26, var33, var28, var32, ((ww) this).field_xb[var25], var21, ((ww) this).field_T[var25], 73, var31, var30, var29);
                                var19[2] = var13_array[0];
                                var20_array[2] = var13_array[1];
                                break L24;
                              }
                            } else {
                              L27: {
                                var32 = (float)param1.field_x[var17] / 1024.0f;
                                loa.a(var30, var13_array, var32, ((ww) this).field_T[var23], ((ww) this).field_rb[var23], 65, var29, var31, var27, var28, ((ww) this).field_xb[var23], var26);
                                var19[0] = var13_array[0];
                                var20_array[0] = var13_array[1];
                                loa.a(var30, var13_array, var32, ((ww) this).field_T[var24], ((ww) this).field_rb[var24], 64, var29, var31, var27, var28, ((ww) this).field_xb[var24], var26);
                                var19[1] = var13_array[0];
                                var20_array[1] = var13_array[1];
                                loa.a(var30, var13_array, var32, ((ww) this).field_T[var25], ((ww) this).field_rb[var25], 76, var29, var31, var27, var28, ((ww) this).field_xb[var25], var26);
                                var19[2] = var13_array[0];
                                var20_array[2] = var13_array[1];
                                var33 = var32 / 2.0f;
                                if ((var30 & 1) != 0) {
                                  L28: {
                                    if (var20_array[1] - var20_array[0] <= var33) {
                                      if (var20_array[0] - var20_array[1] <= var33) {
                                        break L28;
                                      } else {
                                        var20_array[1] = var20_array[1] + var32;
                                        break L28;
                                      }
                                    } else {
                                      var20_array[1] = var20_array[1] - var32;
                                      break L28;
                                    }
                                  }
                                  if (var20_array[2] - var20_array[0] <= var33) {
                                    if (var20_array[0] - var20_array[2] <= var33) {
                                      break L27;
                                    } else {
                                      var20_array[2] = var20_array[2] + var32;
                                      break L27;
                                    }
                                  } else {
                                    var20_array[2] = var20_array[2] - var32;
                                    break L27;
                                  }
                                } else {
                                  L29: {
                                    if (var19[1] - var19[0] <= var33) {
                                      if (var19[0] - var19[1] <= var33) {
                                        break L29;
                                      } else {
                                        var19[1] = var19[1] + var32;
                                        break L29;
                                      }
                                    } else {
                                      var19[1] = var19[1] - var32;
                                      break L29;
                                    }
                                  }
                                  if (var19[2] - var19[0] <= var33) {
                                    if (var19[0] - var19[2] <= var33) {
                                      break L27;
                                    } else {
                                      var19[2] = var19[2] + var32;
                                      break L27;
                                    }
                                  } else {
                                    var19[2] = var19[2] - var32;
                                    break L27;
                                  }
                                }
                              }
                              break L24;
                            }
                          } else {
                            var23 = ((ww) this).field_M[var16];
                            var24 = ((ww) this).field_bb[var16];
                            var25 = ((ww) this).field_x[var16];
                            var26 = param1.field_s[var17];
                            var27 = param1.field_q[var17];
                            var28 = param1.field_K[var17];
                            var29_float = (float)((ww) this).field_xb[var26];
                            var30_float = (float)((ww) this).field_rb[var26];
                            var31 = (float)((ww) this).field_T[var26];
                            var32 = (float)((ww) this).field_xb[var27] - var29_float;
                            var33 = (float)((ww) this).field_rb[var27] - var30_float;
                            var34_float = (float)((ww) this).field_T[var27] - var31;
                            var35_float = (float)((ww) this).field_xb[var28] - var29_float;
                            var36_float = (float)((ww) this).field_rb[var28] - var30_float;
                            var37_float = (float)((ww) this).field_T[var28] - var31;
                            var38_float = (float)((ww) this).field_xb[var23] - var29_float;
                            var39_float = (float)((ww) this).field_rb[var23] - var30_float;
                            var40_float = (float)((ww) this).field_T[var23] - var31;
                            var41_float = (float)((ww) this).field_xb[var24] - var29_float;
                            var42_float = (float)((ww) this).field_rb[var24] - var30_float;
                            var43 = (float)((ww) this).field_T[var24] - var31;
                            var44 = (float)((ww) this).field_xb[var25] - var29_float;
                            var45 = (float)((ww) this).field_rb[var25] - var30_float;
                            var46 = (float)((ww) this).field_T[var25] - var31;
                            var47 = var33 * var37_float - var34_float * var36_float;
                            var48 = var34_float * var35_float - var32 * var37_float;
                            var49 = var32 * var36_float - var33 * var35_float;
                            var50 = var36_float * var49 - var37_float * var48;
                            var51 = var37_float * var47 - var35_float * var49;
                            var52 = var35_float * var48 - var36_float * var47;
                            var53 = 1.0f / (var50 * var32 + var51 * var33 + var52 * var34_float);
                            var19[0] = (var50 * var38_float + var51 * var39_float + var52 * var40_float) * var53;
                            var19[1] = (var50 * var41_float + var51 * var42_float + var52 * var43) * var53;
                            var19[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                            var50 = var33 * var49 - var34_float * var48;
                            var51 = var34_float * var47 - var32 * var49;
                            var52 = var32 * var48 - var33 * var47;
                            var53 = 1.0f / (var50 * var35_float + var51 * var36_float + var52 * var37_float);
                            var20_array[0] = (var50 * var38_float + var51 * var39_float + var52 * var40_float) * var53;
                            var20_array[1] = (var50 * var41_float + var51 * var42_float + var52 * var43) * var53;
                            var20_array[2] = (var50 * var44 + var51 * var45 + var52 * var46) * var53;
                            break L24;
                          }
                        } else {
                          var19[0] = 0.0f;
                          var20_array[0] = 1.0f;
                          var19[1] = 1.0f;
                          var20_array[1] = 1.0f;
                          var19[2] = 0.0f;
                          var20_array[2] = 0.0f;
                          break L24;
                        }
                      }
                    }
                    var15++;
                    continue L6;
                  }
                }
              } else {
                L30: {
                  var12_int = var8[var11_int];
                  var13_array = null;
                  var14 = 0;
                  var15 = 0;
                  var16 = 0;
                  var17 = 0;
                  if (param1.field_m == null) {
                    break L30;
                  } else {
                    var18_int = 0;
                    var19_int = 0;
                    L31: while (true) {
                      if (var19_int >= param1.field_m.length) {
                        if (var18_int == 0) {
                          break L30;
                        } else {
                          var9[var11_int] = 9223372036854775807L;
                          break L30;
                        }
                      } else {
                        L32: {
                          var20 = param1.field_m[var19_int];
                          if (var12_int != var20.field_a) {
                            break L32;
                          } else {
                            L33: {
                              var21_ref = fw.a(var20.field_d, false);
                              if (!var21_ref.field_i) {
                                break L33;
                              } else {
                                var18_int = 1;
                                break L33;
                              }
                            }
                            if (var21_ref.field_f == -1) {
                              break L32;
                            } else {
                              var22_ref = var7.a((byte) -71, var21_ref.field_f);
                              if (var22_ref.field_d != 2) {
                                break L32;
                              } else {
                                ((ww) this).field_ab = true;
                                break L32;
                              }
                            }
                          }
                        }
                        var19_int++;
                        continue L31;
                      }
                    }
                  }
                }
                L34: {
                  var18_int = -1;
                  if (param1.field_r == null) {
                    break L34;
                  } else {
                    var18_int = param1.field_r[var12_int];
                    if (var18_int == -1) {
                      break L34;
                    } else {
                      L35: {
                        var13 = (lp) (Object) var7.a((byte) -126, var18_int & 65535);
                        if ((param5 & 64) == 0) {
                          break L35;
                        } else {
                          if (((dw) (Object) var13).field_p) {
                            var18_int = -1;
                            break L34;
                          } else {
                            break L35;
                          }
                        }
                      }
                      var16 = ((dw) (Object) var13).field_h;
                      var17 = ((dw) (Object) var13).field_a;
                      break L34;
                    }
                  }
                }
                L36: {
                  L37: {
                    L38: {
                      if (((ww) this).field_h == null) {
                        break L38;
                      } else {
                        if (((ww) this).field_h[var12_int] != 0) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if (var13 == null) {
                        break L39;
                      } else {
                        if (((dw) (Object) var13).field_d != 2) {
                          break L39;
                        } else {
                          break L37;
                        }
                      }
                    }
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    break L36;
                  }
                  stackOut_34_0 = 1;
                  stackIn_36_0 = stackOut_34_0;
                  break L36;
                }
                L40: {
                  L41: {
                    var19_int = stackIn_36_0;
                    if (var10 != 0) {
                      break L41;
                    } else {
                      if (var19_int == 0) {
                        break L40;
                      } else {
                        break L41;
                      }
                    }
                  }
                  if (((ww) this).field_wb == null) {
                    break L40;
                  } else {
                    var14 = var14 + (((ww) this).field_wb[var12_int] << 17);
                    break L40;
                  }
                }
                L42: {
                  if (var19_int == 0) {
                    break L42;
                  } else {
                    var14 = var14 + 65536;
                    break L42;
                  }
                }
                var14 = var14 + ((var16 & 255) << 8);
                var14 = var14 + (var17 & 255);
                var15 = var15 + ((var18_int & 65535) << 16);
                var15 = var15 + (var11_int & 65535);
                var9[var11_int] = ((long)var14 << 32) + (long)var15;
                ((ww) this).field_ab = ((ww) this).field_ab | var19_int != 0;
                var11_int++;
                continue L2;
              }
            }
          } else {
            var8[var9_int] = var9_int;
            var9_int++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Hb = "FMT";
        field_G = 4096;
        field_q = 4096;
    }
}
