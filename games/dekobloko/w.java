/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends km {
    static pf field_H;
    ck[] field_Q;
    int field_nb;
    int field_W;
    mm field_J;
    boolean field_Kb;
    int field_pb;
    String field_Y;
    String field_T;
    private int field_yb;
    int field_gb;
    boolean field_Hb;
    int field_Bb;
    int field_vb;
    ck field_tb;
    int field_ob;
    private boolean field_O;
    ck[] field_lb;
    ck field_bb;
    int field_E;
    static ud field_Eb;
    int field_ub;
    private int field_Jb;
    ck[] field_Ab;
    boolean field_Gb;
    int field_F;
    int field_mb;
    ck[] field_S;
    int field_xb;
    private int field_V;
    private boolean field_L;
    int field_fb;
    private int field_Lb;
    private boolean field_cb;
    int field_Z;
    int field_db;
    int field_Ib;
    static lm field_kb;
    int field_Mb;
    ck field_R;
    private int field_zb;
    boolean field_ab;
    int field_rb;
    private int field_K;
    int field_Db;
    static ck field_qb;
    static int field_Fb;
    int field_G;
    boolean field_jb;
    ck field_sb;
    boolean field_U;
    ck[] field_eb;
    private int field_Cb;
    int field_P;
    int field_ib;
    ck field_I;
    private int field_hb;
    vj field_M;
    int field_N;
    int field_X;
    int field_wb;

    w(long param0, w param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final static void a(int param0, int param1, fa param2) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        int var5 = 0;
        uf var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var6 = we.field_b;
                var6.f(param1, -4);
                var6.field_n = var6.field_n + 1;
                var4 = var6.field_n;
                var6.a(true, 1);
                if (null == param2.field_p) {
                  break L2;
                } else {
                  var6.a(true, param2.field_p.length);
                  var6.a(false, param2.field_p.length, param2.field_p, 0);
                  if (!client.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.a(true, 0);
              break L1;
            }
            var5 = 120 % ((param0 - 60) / 53);
            var6.a((byte) -15, var4);
            var6.field_n = var6.field_n - 4;
            param2.field_s = var6.i(7553);
            var6.b(var6.field_n + -var4, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("w.NA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_K = param1;
        this.field_F = 0;
        this.field_vb = param4;
        this.field_Ib = param2;
        this.field_Mb = 0;
        this.field_N = param3;
        this.field_mb = param0;
        this.field_yb = 0;
    }

    public static void f(byte param0) {
        field_qb = null;
        field_kb = null;
        int var1 = 10 % ((-8 - param0) / 47);
        field_H = null;
        field_Eb = null;
    }

    final int a(boolean param0) {
        if (!param0) {
            return -120;
        }
        return this.a((byte) 84, 2147483647);
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        int stackIn_5_0 = 0;
        int statePc = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ck[] var16 = null;
        ck var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        w var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var25 = client.field_A ? 1 : 0;
                    this.field_E = this.field_vb + param4;
                    this.field_pb = param7 + this.field_Ib;
                    var12 = hk.field_c;
                    var13 = hk.field_h;
                    var14 = hk.field_g;
                    var15 = hk.field_b;
                    hk.f(this.field_E, this.field_pb, this.field_E - -this.field_mb, this.field_N + this.field_pb);
                    param3 = param3 & this.field_Hb;
                    if (!this.field_L) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param2 = this.field_jb;
                    if (0 == this.field_gb) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_5_0 = 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    param9 = stackIn_5_0 != 0;
                    param6 = this.field_ab;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var16 = this.field_lb;
                    var17 = this.field_I;
                    var18 = this.field_G;
                    var19 = 0;
                    if (param3) {
                        statePc = 13;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (0 > this.field_P) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var18 = this.field_P;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_Ab == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var16 = this.field_Ab;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (null == this.field_tb) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var17 = this.field_tb;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var20 = 0;
                    if (!param2) {
                        statePc = 26;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((this.field_Bb ^ -1) <= -1) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var18 = this.field_Bb;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_R == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var17 = this.field_R;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (null == this.field_S) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var16 = this.field_S;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (2147483647 != (this.field_V ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var19 = this.field_V;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (this.field_hb == -2147483648) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var20 = this.field_hb;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (!param9) {
                        statePc = 41;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (null != this.field_bb) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var17 = this.field_bb;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((this.field_fb ^ -1) <= -1) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var18 = this.field_fb;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (this.field_Z != -2147483648) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var19 = this.field_Z;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (null == this.field_eb) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var16 = this.field_eb;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if ((this.field_db ^ -1) != 2147483647) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var20 = this.field_db;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (!param6) {
                        statePc = 55;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (-1 >= (this.field_rb ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var18 = this.field_rb;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_nb != -2147483648) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var20 = this.field_nb;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (null != this.field_Q) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var16 = this.field_Q;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (null == this.field_sb) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var17 = this.field_sb;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (-2147483648 == this.field_ib) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var19 = this.field_ib;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var21 = this.field_Cb + var19;
                    if (param10 == -29696) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    return;
                }
                case 57: {
                    var22 = var20 + this.field_Lb;
                    if (!this.field_Gb) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    vk.a(param5, (byte) 50, var16, param1, param7, param4);
                    if (var25 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    vk.a(this.field_N, (byte) 50, var16, this.field_mb, this.field_pb, this.field_E);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (var17 == null) {
                        statePc = 75;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var23_int = var21 + this.field_E;
                    var24 = this.field_pb + var22;
                    if ((this.field_X ^ -1) != -2) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var23_int = var23_int + (this.field_mb - var17.field_K) / 2;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (this.field_W != 1) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var24 = var24 + (this.field_N + -var17.field_C) / 2;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (2 != this.field_X) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var23_int = var23_int + (-var17.field_K + this.field_mb);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_W == 2) {
                        statePc = 70;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var24 = var24 + (this.field_N + -var17.field_C);
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if ((this.field_zb ^ -1) > -257) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var17.c(var23_int, var24);
                    if (var25 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var17.c(var23_int, var24, this.field_zb);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (null == this.field_Y) {
                        statePc = 101;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (this.field_J != null) {
                        statePc = 78;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var26 = this.field_Y;
                    var23 = var26;
                    var23 = var26;
                    var23 = var26;
                    if (!param0) {
                        statePc = 82;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (this.field_T != null) {
                        statePc = 81;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var23 = var26 + this.field_T;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (this.field_J.a(var23) > this.field_mb + -(2 * this.field_ub)) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (0 > var23.indexOf("<br>")) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_J.a(var23, var21 + this.field_ub + this.field_E, this.field_pb - -var22, -(this.field_ub * 2) + this.field_mb, this.field_N, var18, -1, this.field_wb, this.field_X, this.field_W, this.field_Db);
                    if (var25 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (this.field_W != 1) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var22 = var22 + (this.field_N - this.field_J.field_R + -this.field_J.field_K) / 2;
                    if (var25 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (-3 != (this.field_W ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var22 = var22 + (-this.field_J.field_R + (-this.field_J.field_K + this.field_N));
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (this.field_X != 0) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    this.field_J.c(var23, this.field_ub + (this.field_E + var21), this.field_J.field_R + (var22 + this.field_pb), var18, -1, this.field_wb);
                    if (var25 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if ((this.field_X ^ -1) == -2) {
                        statePc = 100;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (2 == this.field_X) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_J.a(var23, var21 + this.field_ub + this.field_E, var22 + this.field_pb, -(2 * this.field_ub) + this.field_mb, this.field_N, var18, -1, this.field_wb, this.field_X, this.field_W, this.field_Db);
                    if (var25 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    this.field_J.a(var23, -(this.field_ub * 2) + (this.field_mb + this.field_E - -this.field_ub) - -var21, this.field_pb + (var22 - -this.field_J.field_R), var18, -1, this.field_wb);
                    if (var25 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.field_J.b(var23, (-(2 * this.field_ub) + this.field_mb) / 2 + (this.field_E - (-this.field_ub + -var21)), this.field_J.field_R + (this.field_pb + var22), var18, -1, this.field_wb);
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (this.field_M != null) {
                        statePc = 103;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var23_ref = (w) ((Object) this.field_M.c((byte) -124));
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (var23_ref == null) {
                        statePc = 108;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var23_ref.a(param0, this.field_mb, param2, param3, var19 + this.field_E, this.field_N, param6, this.field_pb - -var20, this.field_O, param9, -29696);
                    var23_ref = (w) ((Object) this.field_M.d(true));
                    if (var25 != 0) {
                        statePc = 109;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (var25 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    hk.b(var12, var13, var14, var15);
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static lm a(byte[] param0, byte param1) {
        lm var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        Object stackIn_2_0 = null;
        lm stackIn_6_0 = null;
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
                var2 = new lm(param0, sg.field_d, fh.field_a, tm.field_a, hc.field_c, tc.field_Nb);
                oa.a(127);
                if (param1 == -5) {
                  break L1;
                } else {
                  var3 = (byte[]) null;
                  w.a((byte[]) null, (byte) -7);
                  break L1;
                }
              }
              stackIn_6_0 = (lm) (var2);
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

            stackIn_9_1 = new StringBuilder().append("w.AA(");

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
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (lm) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(byte param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        w var10_ref_w = null;
        int var10 = 0;
        int var11 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = client.field_A ? 1 : 0;
                    var5 = -this.field_Ib;
                    var6 = var5 - this.field_Mb;
                    var7 = this.field_N;
                    var8 = var7 - -this.field_F;
                    if (!param3) {
                        statePc = 2;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var9 = 0;
                    var10_ref_w = (w) ((Object) this.field_M.c((byte) 118));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var10_ref_w == null) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var10_ref_w.field_Mb = -var10_ref_w.field_Ib + var9;
                    var9 = var9 + (var10_ref_w.field_F + var10_ref_w.field_N + param1);
                    var10_ref_w = (w) ((Object) this.field_M.d(true));
                    if (var11 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var11 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var8 = -param1 + var9;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param0 == -94) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_U = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var9 = -param2 + var8;
                    if (var6 > var9) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var6 = var9;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var6 >= 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var6 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var10 = var7 - param2;
                    if (var5 > var10) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = var10;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (0 > var5) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    this.field_F = var8 + -var7;
                    this.field_N = var7;
                    this.field_Mb = var5 - var6;
                    this.field_Ib = -var5;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    w(long param0, w param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            this.field_ub = -111;
        }
        gb.field_Zb = !param1 ? true : false;
        sl.field_c = !param1 ? true : false;
        this.a(0, (byte) 127, true, hk.field_i, hk.field_j, 0);
    }

    final void a(w param0, int param1) {
        try {
            if (param1 != -16834) {
                w var4 = (w) null;
                this.a((w) null, -88);
            }
            if (null == this.field_M) {
                this.field_M = new vj();
            }
            this.field_M.a(param0, 2777);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "w.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        int var3 = 0;
        w var4 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    if (this.field_M == null) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = (w) ((Object) this.field_M.b(true));
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4 == null) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4.field_L = true;
                    var4.d(-92);
                    var4 = (w) ((Object) this.field_M.c(true));
                    if (var3 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var3 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (param0 < -16) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_kb = (lm) null;
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

    private final void a(int param0, byte param1, boolean param2, int param3, int param4, int param5) {
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int statePc = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        w var13 = null;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = client.field_A ? 1 : 0;
                    if (this.field_yb <= 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var7 = -(-this.field_yb >> -992822398);
                    if (var14 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var7 = this.field_yb >> -369067166;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    this.field_vb = this.field_vb + var7;
                    this.field_yb = this.field_yb - var7;
                    if ((this.field_Mb ^ -1) >= -1) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var7 = -(-this.field_Mb >> 1141039778);
                    if (var14 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var7 = this.field_Mb >> -1033044574;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    this.field_Ib = this.field_Ib + var7;
                    this.field_Mb = this.field_Mb - var7;
                    if (-1 > (this.field_K ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var7 = this.field_K >> -1321852478;
                    if (var14 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var7 = -(-this.field_K >> 1990658082);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    this.field_mb = this.field_mb + var7;
                    this.field_K = this.field_K - var7;
                    if ((this.field_F ^ -1) >= -1) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var7 = -(-this.field_F >> 1858545890);
                    if (var14 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var7 = this.field_F >> -1104169118;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    this.field_pb = param5 + this.field_Ib;
                    this.field_F = this.field_F - var7;
                    param2 = param2 & this.field_Hb;
                    this.field_N = this.field_N + var7;
                    this.field_E = this.field_vb + param0;
                    var8 = hk.field_c;
                    var9 = hk.field_h;
                    var10 = hk.field_g;
                    var11 = hk.field_b;
                    hk.f(this.field_E, this.field_pb, this.field_mb + this.field_E, this.field_N + this.field_pb);
                    var12 = 0;
                    if (gb.field_Zb) {
                        statePc = 20;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!param2) {
                        statePc = 20;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (0 == ig.field_Yb) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (he.field_S < hk.field_c) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (hk.field_g <= he.field_S) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (hk.field_h > nf.field_h) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (nf.field_h < hk.field_b) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.field_ob = 0;
                    if (-1 != (ig.field_Yb ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_gb = 0;
                    if (var14 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_xb = -this.field_E + he.field_S;
                    this.field_Jb = -this.field_pb + nf.field_h;
                    this.field_gb = ig.field_Yb;
                    var12 = 1;
                    this.field_ob = ig.field_Yb;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_30_0 = this;
                    stackIn_25_0 = stackIn_30_0;
                    if (sl.field_c) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_30_0 = this;
                    stackIn_26_0 = stackIn_30_0;
                    if (hk.field_c > bh.field_g) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_30_0 = this;
                    stackIn_27_0 = stackIn_30_0;
                    if (bh.field_g >= hk.field_g) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_30_0 = this;
                    stackIn_28_0 = stackIn_30_0;
                    if (hk.field_h > pm.field_f) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = this;
                    stackIn_29_0 = stackIn_30_0;
                    if (pm.field_f >= hk.field_b) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = this;
                    stackIn_31_1 = 1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = this;
                    stackIn_31_1 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    ((w) (this)).field_Kb = stackIn_31_1 != 0;
                    if (0 != be.field_n) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_gb = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_37_0 = this;
                    stackIn_34_0 = stackIn_37_0;
                    if (!this.field_Kb) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_37_0 = this;
                    stackIn_35_0 = stackIn_37_0;
                    if (be.field_n != this.field_gb) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = this;
                    stackIn_36_0 = stackIn_37_0;
                    if (!param2) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = this;
                    stackIn_38_1 = 1;
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = this;
                    stackIn_38_1 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    ((w) (this)).field_jb = stackIn_38_1 != 0;
                    if (null != this.field_M) {
                        statePc = 40;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var13 = (w) ((Object) this.field_M.b(true));
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (var13 == null) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var13.a(this.field_E, (byte) 126, param2, this.field_N, this.field_mb, this.field_pb);
                    var13 = (w) ((Object) this.field_M.c(true));
                    if (var14 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var14 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!this.field_Kb) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    sl.field_c = true;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var12 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    gb.field_Zb = true;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    hk.b(var8, var9, var10, var11);
                    if (this.field_gb == 0) {
                        statePc = 64;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (!this.field_U) {
                        statePc = 64;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.field_vb = -param0 + bh.field_g - this.field_xb;
                    this.field_Ib = -this.field_Jb + pm.field_f - param5;
                    if (-1 < (this.field_vb ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_vb = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (0 <= this.field_Ib) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    this.field_Ib = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (-this.field_mb + param4 < this.field_vb) {
                        statePc = 59;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 59: {
                    this.field_vb = param4 + -this.field_mb;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    this.field_yb = 0;
                    this.field_Mb = 0;
                    if (param3 + -this.field_N < this.field_Ib) {
                        statePc = 62;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 62: {
                    this.field_Ib = param3 - this.field_N;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    this.field_E = param0 - -this.field_vb;
                    this.field_pb = this.field_Ib + param5;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (param1 >= 125) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    this.field_E = 12;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1) {
        this.a(param1, hk.field_j, false, true, 0, hk.field_i, false, 0, false, false, -29696);
        if (param0 != 1141039778) {
            this.field_sb = (ck) null;
        }
    }

    final void a(int param0, w param1) {
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                L2: {
                  if (param1.field_lb == null) {
                    break L2;
                  } else {
                    this.field_lb = param1.field_lb;
                    break L2;
                  }
                }
                L3: {
                  if ((param1.field_rb ^ -1) > -1) {
                    break L3;
                  } else {
                    this.field_rb = param1.field_rb;
                    break L3;
                  }
                }
                L4: {
                  if (!param1.field_ab) {
                    break L4;
                  } else {
                    this.field_ab = param1.field_ab;
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_bb == null) {
                    break L5;
                  } else {
                    this.field_bb = param1.field_bb;
                    break L5;
                  }
                }
                L6: {
                  if (null != param1.field_Y) {
                    this.field_Y = param1.field_Y;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_S != null) {
                    this.field_S = param1.field_S;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param1.field_Gb) {
                    this.field_Gb = param1.field_Gb;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param1.field_Q == null) {
                    break L9;
                  } else {
                    this.field_Q = param1.field_Q;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_Ab != null) {
                    this.field_Ab = param1.field_Ab;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (null == param1.field_T) {
                    break L11;
                  } else {
                    this.field_T = param1.field_T;
                    break L11;
                  }
                }
                L12: {
                  if (0 > param1.field_fb) {
                    break L12;
                  } else {
                    this.field_fb = param1.field_fb;
                    break L12;
                  }
                }
                L13: {
                  if (-1 < (param1.field_P ^ -1)) {
                    break L13;
                  } else {
                    this.field_P = param1.field_P;
                    break L13;
                  }
                }
                L14: {
                  if (-1 != (param1.field_ub ^ -1)) {
                    this.field_ub = param1.field_ub;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (null != param1.field_tb) {
                    this.field_tb = param1.field_tb;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (!param1.field_L) {
                    break L16;
                  } else {
                    this.field_L = param1.field_L;
                    break L16;
                  }
                }
                L17: {
                  if (-1 != (param1.field_Db ^ -1)) {
                    this.field_Db = param1.field_Db;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_Hb) {
                    break L18;
                  } else {
                    this.field_Hb = param1.field_Hb;
                    break L18;
                  }
                }
                L19: {
                  if (0 > param1.field_Bb) {
                    break L19;
                  } else {
                    this.field_Bb = param1.field_Bb;
                    break L19;
                  }
                }
                L20: {
                  if (param1.field_eb != null) {
                    this.field_eb = param1.field_eb;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (null == param1.field_R) {
                    break L21;
                  } else {
                    this.field_R = param1.field_R;
                    break L21;
                  }
                }
                L22: {
                  if (param1.field_I == null) {
                    break L22;
                  } else {
                    this.field_I = param1.field_I;
                    break L22;
                  }
                }
                L23: {
                  if (param1.field_G != 0) {
                    this.field_G = param1.field_G;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (-257 == (param1.field_wb ^ -1)) {
                    break L24;
                  } else {
                    this.field_wb = param1.field_wb;
                    break L24;
                  }
                }
                L25: {
                  if (null == param1.field_J) {
                    break L25;
                  } else {
                    this.field_J = param1.field_J;
                    break L25;
                  }
                }
                L26: {
                  if (null == param1.field_sb) {
                    break L26;
                  } else {
                    this.field_sb = param1.field_sb;
                    break L26;
                  }
                }
                L27: {
                  if (!param1.field_cb) {
                    break L27;
                  } else {
                    this.field_cb = param1.field_cb;
                    break L27;
                  }
                }
                L28: {
                  L29: {
                    stackIn_65_0 = this;

                    if (!this.field_cb) {
                      break L29;
                    } else {
                      stackIn_65_0 = this;

                      if (!param1.field_O) {
                        break L29;
                      } else {
                        stackIn_66_0 = this;
                        stackIn_66_1 = 1;
                        break L28;
                      }
                    }
                  }
                  stackIn_66_0 = this;
                  stackIn_66_1 = 0;
                  break L28;
                }
                L30: {
                  ((w) (this)).field_O = stackIn_66_1 != 0;
                  if (2147483647 != (param1.field_db ^ -1)) {
                    this.field_db = param1.field_db;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (0 == param1.field_Lb) {
                    break L31;
                  } else {
                    this.field_Lb = param1.field_Lb;
                    break L31;
                  }
                }
                L32: {
                  if (0 != param1.field_X) {
                    this.field_X = param1.field_X;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (2147483647 == (param1.field_hb ^ -1)) {
                    break L33;
                  } else {
                    this.field_hb = param1.field_hb;
                    break L33;
                  }
                }
                L34: {
                  if (param1.field_nb == -2147483648) {
                    break L34;
                  } else {
                    this.field_nb = param1.field_nb;
                    break L34;
                  }
                }
                L35: {
                  if (param1.field_ib == -2147483648) {
                    break L35;
                  } else {
                    this.field_ib = param1.field_ib;
                    break L35;
                  }
                }
                L36: {
                  if (param1.field_Cb != 0) {
                    this.field_Cb = param1.field_Cb;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (2147483647 == (param1.field_V ^ -1)) {
                    break L37;
                  } else {
                    this.field_V = param1.field_V;
                    break L37;
                  }
                }
                L38: {
                  if (param1.field_W == 0) {
                    break L38;
                  } else {
                    this.field_W = param1.field_W;
                    break L38;
                  }
                }
                L39: {
                  if (param1.field_Z != -2147483648) {
                    this.field_Z = param1.field_Z;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                if (!param1.field_U) {
                  break L1;
                } else {
                  this.field_U = param1.field_U;
                  break L1;
                }
              }
            }
            L40: {
              if (param0 < -111) {
                break L40;
              } else {
                this.a(true);
                break L40;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackIn_97_0 = (RuntimeException) (var3);

            stackIn_97_1 = new StringBuilder().append("w.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "null";
              break L41;
            } else {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "{...}";
              break L41;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ')');
        }
    }

    final void a(w param0, w param1, int param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param3 == 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    param1.field_Mb = param0.field_Mb - -param0.field_F;
                    param1.field_Ib = param0.field_N + (param0.field_Ib - -param2);
                    if (!client.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1.field_Ib = 0;
                param1.field_Mb = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("w.KA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(byte param0, int param1) {
        int var3;
        int var4_int;
        w var4;
        int var5;
        int var6;
        int stackIn_22_0 = 0;
        L0: {
          var6 = client.field_A ? 1 : 0;
          var3 = 0;
          if (this.field_Y == null) {
            break L0;
          } else {
            if (this.field_J != null) {
              var4_int = this.field_J.b(this.field_Y, param1);
              if (var4_int <= var3) {
                break L0;
              } else {
                var3 = var4_int;
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 84) {
            break L1;
          } else {
            this.field_hb = -71;
            break L1;
          }
        }
        L2: {
          if (this.field_I != null) {
            var4_int = this.field_I.field_K;
            if (var3 < var4_int) {
              var3 = var4_int;
              break L2;
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (null != this.field_M) {
              var4 = (w) ((Object) this.field_M.c((byte) -125));
              L5: while (true) {
                if (var4 == null) {
                  break L4;
                } else {
                  var5 = var4.field_mb + var4.field_vb;
                  stackIn_22_0 = var3 ^ -1;

                  if (var6 != 0) {
                    break L3;
                  } else {
                    L6: {
                      if (stackIn_22_0 > (var5 ^ -1)) {
                        var3 = var5;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = (w) ((Object) this.field_M.d(true));
                    if (var6 == 0) {
                      continue L5;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
          stackIn_22_0 = var3;
          break L3;
        }
        return stackIn_22_0;
    }

    protected w() {
        this.field_nb = -2147483648;
        this.field_Bb = -1;
        this.field_V = -2147483648;
        this.field_O = false;
        this.field_Z = -2147483648;
        this.field_db = -2147483648;
        this.field_cb = false;
        this.field_Hb = true;
        this.field_rb = -1;
        this.field_fb = -1;
        this.field_zb = 256;
        this.field_ib = -2147483648;
        this.field_P = -1;
        this.field_wb = 256;
        this.field_hb = -2147483648;
    }

    w(long param0, w param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_nb = -2147483648;
        this.field_Bb = -1;
        this.field_V = -2147483648;
        this.field_O = false;
        this.field_Z = -2147483648;
        this.field_db = -2147483648;
        this.field_cb = false;
        this.field_Hb = true;
        this.field_rb = -1;
        this.field_fb = -1;
        this.field_zb = 256;
        this.field_ib = -2147483648;
        this.field_P = -1;
        this.field_wb = 256;
        this.field_hb = -2147483648;
        try {
          L0: {
            L1: {
              this.field_mb = param4;
              this.field_i = param0;
              this.field_N = param5;
              this.field_vb = param2;
              this.field_Ib = param3;
              this.a(-119, param1);
              if (param6 == null) {
                break L1;
              } else {
                this.field_Y = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("w.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_Fb = 100;
    }
}
