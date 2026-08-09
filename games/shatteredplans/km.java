/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km implements mn {
    private int[] field_r;
    static ln field_u;
    private int field_D;
    int field_S;
    private int[] field_t;
    k field_Q;
    private int field_g;
    private int field_Z;
    private db field_ab;
    private int[] field_U;
    int field_N;
    boolean[] field_V;
    sd field_c;
    boolean field_L;
    int field_i;
    private boolean[] field_w;
    int field_q;
    private db field_o;
    dc field_P;
    static String field_a;
    private int field_I;
    private boolean field_G;
    private int[] field_J;
    int field_m;
    uj[] field_s;
    private sf field_E;
    private int[] field_d;
    int field_h;
    boolean field_j;
    static String field_A;
    private int field_k;
    private int field_F;
    private sd[] field_l;
    private pf field_H;
    kq field_Y;
    private int[] field_C;
    private int field_x;
    private boolean field_b;
    private fs[] field_R;
    tr field_z;
    private wb field_v;
    private ln field_K;
    boolean field_f;
    boolean field_W;
    private boolean field_T;
    static qr field_e;
    private int field_O;
    boolean field_M;
    private boolean field_y;
    private int[] field_p;
    static String field_X;
    fs field_n;

    private final void a(fs param0, String param1, byte param2) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        String[] var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 51) {
                break L1;
              } else {
                this.field_q = -105;
                break L1;
              }
            }
            if (this.field_W) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var4 = param0.field_t + ": ";
                var5 = ji.field_I.field_K;
                if (this.field_f) {
                  var5 = var5 - ho.field_f.c("[" + re.a(he.field_q, 4371, new String[]{this.field_P.field_v[0].field_t}) + "] ");
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (this.field_f) {
                  stackIn_16_0 = 0;
                  break L3;
                } else {
                  stackIn_16_0 = param0.field_k;
                  break L3;
                }
              }
              L4: {
                var6 = stackIn_16_0;
                var7 = -ho.field_f.c(var4) + var5 + -20;
                if (var7 >= ho.field_f.c(param1)) {
                  md.a(1, var4 + param1, var6, ln.field_o, this.field_P.field_v[0].field_t, -16169);
                  break L4;
                } else {
                  var8 = vi.a(ho.field_f, (byte) 125, param1, new int[]{var7});
                  var9 = var8;
                  var10 = 0;
                  L5: while (true) {
                    if (var9.length <= var10) {
                      break L4;
                    } else {
                      var11 = var9[var10];
                      md.a(1, var4 + var11, var6, ln.field_o, this.field_P.field_v[0].field_t, -16169);
                      var10++;
                      continue L5;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("km.HA(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_30_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, fs param1) {
        sd var3 = null;
        ln var4_ref_ln = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = (sd) ((Object) param1.field_i.d(0));
            L1: while (true) {
              if (var3 == null) {
                var4 = 107 % ((param0 - 77) / 37);
                break L0;
              } else {
                var4_ref_ln = var3.j(18229);
                L2: while (true) {
                  if (var4_ref_ln == null) {
                    var3.b((byte) -89);
                    var3 = (sd) ((Object) param1.field_i.a((byte) -71));
                    continue L1;
                  } else {
                    var4_ref_ln.field_R = null;
                    var4_ref_ln.field_y = null;
                    var4_ref_ln.b((byte) -83);
                    var4_ref_ln = var3.h(-23410);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("km.MA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final void a(int param0, ob param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_P.a(param2, (byte) -124, param1);
              if (param0 == 1) {
                break L1;
              } else {
                this.field_r = (int[]) null;
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

            stackIn_6_1 = new StringBuilder().append("km.OA(").append(param0).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (this.field_f) {
                  break L1;
                } else {
                  qn.b(117);
                  var3_int = param1 ? 1 : 0;
                  ta.a(0, 0, (byte) 96, var3_int != 0);
                  break L1;
                }
              }
              L2: {
                if (-1 == de.field_j) {
                  break L2;
                } else {
                  if ((de.field_j ^ -1) != (uc.field_A ^ -1)) {
                    ta.b((byte) -69);
                    break L2;
                  } else {
                    break L2;
                  }
                }
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
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.WA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(fs param0, int param1) {
        fs stackIn_8_0 = null;
        fs stackIn_8_1 = null;
        fs stackIn_15_0 = null;
        fs stackIn_15_1 = null;
        fs stackIn_28_0 = null;
        fs stackIn_28_1 = null;
        int stackIn_57_0 = 0;
        boolean stackIn_61_0 = false;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        boolean stackIn_84_0 = false;
        boolean stackIn_93_0 = false;
        boolean stackIn_110_0 = false;
        boolean stackIn_117_0 = false;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        String stackIn_138_2 = null;
        boolean stackOut_60_0;
        boolean stackOut_83_0;
        boolean stackOut_116_0;
        int statePc = 0;
        Throwable caughtException = null;
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        ln[] var4_ref_ln__ = null;
        int var4 = 0;
        int var5_int = 0;
        ln[] var5 = null;
        ln var6_ref_ln = null;
        int var6 = 0;
        mg var7 = null;
        int var7_int = 0;
        ln var7_ref = null;
        ln[] var8_ref_ln__ = null;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        ln[] var10_array = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = this.field_P.field_g.field_e;
                        if (param1 <= -65) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.d((byte) -75);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_ref_ln__ = var3;
                        var5_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var4_ref_ln__.length ^ -1) >= (var5_int ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6_ref_ln = var4_ref_ln__[var5_int];
                        this.field_d[var6_ref_ln.field_p] = 0;
                        this.field_U[var6_ref_ln.field_p] = 0;
                        stackIn_8_0 = var6_ref_ln.field_y;
                        stackIn_8_1 = (fs) (param0);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_w[var6_ref_ln.field_p] = false;
                        this.field_p[var6_ref_ln.field_p] = 0;
                        this.field_V[var6_ref_ln.field_p] = false;
                        this.field_J[var6_ref_ln.field_p] = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_w[var6_ref_ln.field_p] = true;
                        this.field_p[var6_ref_ln.field_p] = var6_ref_ln.field_J;
                        this.field_V[var6_ref_ln.field_p] = true;
                        this.field_J[var6_ref_ln.field_p] = var6_ref_ln.field_J;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = (mg) ((Object) var6_ref_ln.field_s.c(-128));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (null == var7) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_8_0 = (fs) (param0);
                        stackIn_15_0 = stackIn_8_0;
                        stackIn_8_1 = var7.field_G;
                        stackIn_15_1 = stackIn_8_1;
                        if (false) {
                            statePc = 8;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 == stackIn_15_1) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_p[var6_ref_ln.field_p] = this.field_p[var6_ref_ln.field_p] + var7.field_z;
                        this.field_w[var6_ref_ln.field_p] = true;
                        if (param0 == var7.field_B.field_y) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var7.field_B.field_x ^ -1) != -1) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_J[var6_ref_ln.field_p] = this.field_J[var6_ref_ln.field_p] + var7.field_z;
                        this.field_V[var6_ref_ln.field_p] = true;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = (mg) ((Object) var6_ref_ln.field_s.b(32));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (null == param0) {
                            statePc = 44;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var8_ref_ln__ = var6_ref_ln.field_D;
                        var9 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var9 >= var8_ref_ln__.length) {
                            statePc = 44;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = var8_ref_ln__[var9];
                        stackIn_8_0 = (fs) (param0);
                        stackIn_28_0 = stackIn_8_0;
                        stackIn_8_1 = var10.field_y;
                        stackIn_28_1 = stackIn_8_1;
                        if (false) {
                            statePc = 8;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 == stackIn_28_1) {
                            statePc = 41;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (null == var10.field_y) {
                            statePc = 41;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!var10.field_y.field_h[param0.field_x]) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var6_ref_ln.field_y == param0) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_V[var6_ref_ln.field_p] = false;
                        this.field_J[var6_ref_ln.field_p] = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9++;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var5_int++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (this.field_P.field_o.field_k) {
                            statePc = 70;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!this.field_P.field_o.field_l) {
                            statePc = 55;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var4_ref_ln__ = var3;
                        var5_int = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var4_ref_ln__.length ^ -1) >= (var5_int ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var6_ref_ln = var4_ref_ln__[var5_int];
                        this.field_t[var6_ref_ln.field_p] = 1;
                        this.field_r[var6_ref_ln.field_p] = 1;
                        var5_int++;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var4_ref_ln__ = var3;
                        var5_int = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = var5_int ^ -1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 <= (var4_ref_ln__.length ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var6_ref_ln = var4_ref_ln__[var5_int];
                        var7_int = var6_ref_ln.field_p;
                        var8 = 0;
                        var9 = 0;
                        var10_array = var6_ref_ln.field_D;
                        var11 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((var10_array.length ^ -1) >= (var11 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var12 = var10_array[var11];
                        stackOut_60_0 = this.field_w[var12.field_p];
                        stackIn_57_0 = stackOut_60_0 ? 1 : 0;
                        stackIn_61_0 = stackOut_60_0;
                        if (false) {
                            statePc = 57;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (!stackIn_61_0) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var8++;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (this.field_V[var12.field_p]) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var9++;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var11++;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        this.field_t[var7_int] = var8;
                        this.field_r[var7_int] = var9;
                        var5_int++;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var4_ref_ln__ = var3;
                        var5_int = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var4_ref_ln__.length <= var5_int) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var6_ref_ln = var4_ref_ln__[var5_int];
                        this.field_t[var6_ref_ln.field_p] = 0;
                        this.field_r[var6_ref_ln.field_p] = 0;
                        var5_int++;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (!this.field_P.field_o.field_k) {
                            statePc = 77;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var4 = 1;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_79_0 = var4;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (stackIn_79_0 == 0) {
                            statePc = 132;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var4 = 0;
                        var5 = var3;
                        var6 = 0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_82_0 = var5.length ^ -1;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (stackIn_82_0 >= (var6 ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var7_ref = var5[var6];
                        var8 = var7_ref.field_p;
                        stackOut_83_0 = this.field_w[var8];
                        stackIn_79_0 = stackOut_83_0 ? 1 : 0;
                        stackIn_84_0 = stackOut_83_0;
                        if (false) {
                            statePc = 79;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (!stackIn_84_0) {
                            statePc = 109;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (this.field_t[var8] > this.field_p[var8]) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        this.field_w[var8] = false;
                        var9 = 1 + this.field_d[var8];
                        var4 = 1;
                        var10_array = var7_ref.field_D;
                        var11 = 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if ((var10_array.length ^ -1) >= (var11 ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var12 = var10_array[var11];
                        stackIn_110_0 = this.field_P.field_o.field_l;
                        stackIn_93_0 = stackIn_110_0;
                        if (false) {
                            statePc = 110;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (stackIn_93_0) {
                            statePc = 99;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        this.field_t[var12.field_p] = this.field_t[var12.field_p] + 1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        this.field_t[var12.field_p] = 1;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if ((this.field_d[var12.field_p] ^ -1) < (var9 ^ -1)) {
                            statePc = 107;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (this.field_w[var12.field_p]) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        this.field_d[var12.field_p] = var9;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var11++;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        stackIn_110_0 = this.field_V[var8];
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (!stackIn_110_0) {
                            statePc = 130;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (this.field_r[var8] <= this.field_J[var8]) {
                            statePc = 130;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        this.field_V[var8] = false;
                        this.field_J[var8] = 0;
                        var9 = 1 + this.field_U[var8];
                        var4 = 1;
                        var10_array = var7_ref.field_D;
                        var11 = 0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if ((var11 ^ -1) <= (var10_array.length ^ -1)) {
                            statePc = 130;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var12 = var10_array[var11];
                        stackOut_116_0 = this.field_P.field_o.field_l;
                        stackIn_82_0 = stackOut_116_0 ? 1 : 0;
                        stackIn_117_0 = stackOut_116_0;
                        if (false) {
                            statePc = 82;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (stackIn_117_0) {
                            statePc = 121;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        this.field_r[var12.field_p] = this.field_r[var12.field_p] + 1;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        this.field_r[var12.field_p] = 1;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var9 < this.field_U[var12.field_p]) {
                            statePc = 127;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (!this.field_V[var12.field_p]) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        this.field_U[var12.field_p] = var9;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var11++;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var6++;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        this.field_z.a(this.field_p, this.field_t, this.field_U, this.field_V, this.field_w, this.field_d, this.field_r, this.field_J, 0);
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 134: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_137_0 = (RuntimeException) (var3_ref);
                    stackIn_135_0 = stackIn_137_0;
                    stackIn_137_1 = new StringBuilder().append("km.RA(");
                    stackIn_135_1 = stackIn_137_1;
                    if (param0 == null) {
                        statePc = 137;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    stackIn_138_0 = (RuntimeException) ((Object) stackIn_135_0);
                    stackIn_138_1 = (StringBuilder) ((Object) stackIn_135_1);
                    stackIn_138_2 = "{...}";
                    statePc = 138;
                    continue stateLoop;
                }
                case 137: {
                    stackIn_138_0 = (RuntimeException) ((Object) stackIn_137_0);
                    stackIn_138_1 = (StringBuilder) ((Object) stackIn_137_1);
                    stackIn_138_2 = "null";
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    throw r.a((Throwable) ((Object) stackIn_138_0), stackIn_138_2 + ',' + param1 + ')');
                }
                case 139: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, ob param1, int param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        qa var4 = null;
        RuntimeException var4_ref = null;
        mg var5 = null;
        ln[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_P.a(param0, (byte) -127, param1);
            var4 = (qa) ((Object) this.field_P.field_q.d(0));
            L1: while (true) {
              if (null == var4) {
                var5 = (mg) ((Object) this.field_P.field_p.a(true));
                L2: while (true) {
                  if (var5 == null) {
                    var6 = this.field_P.field_g.field_e;
                    var7 = 0;
                    var8 = -104 % ((param2 - -36) / 56);
                    L3: while (true) {
                      if ((var7 ^ -1) <= (var6.length ^ -1)) {
                        this.a(this.field_n, -94);
                        break L0;
                      } else {
                        var9 = var6[var7];
                        fl.a(var9, (byte) 49);
                        kr.a((byte) -127, var9);
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    var5.field_y.field_J = var5.field_y.field_J - var5.field_z;
                    var5 = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (this.field_P.field_o.field_i) {
                    var4.field_u.field_y.field_m.field_x = var4.field_u.field_y.field_m.field_x - var4.field_v;
                    break L4;
                  } else {
                    var4.field_u.field_R.field_x = var4.field_u.field_R.field_x - var4.field_v;
                    break L4;
                  }
                }
                var4.field_u.field_J = var4.field_u.field_J + var4.field_v;
                var4 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4_ref);

            stackIn_25_1 = new StringBuilder().append("km.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final void a(l param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_P.a(92, param0);
            this.field_z.a(param0, 0);
            this.field_p = new int[param0.field_e.length];
            this.field_t = new int[param0.field_e.length];
            if (param1 == 6) {
              this.field_w = new boolean[param0.field_e.length];
              this.field_d = new int[param0.field_e.length];
              this.field_J = new int[param0.field_e.length];
              this.field_r = new int[param0.field_e.length];
              this.field_V = new boolean[param0.field_e.length];
              this.field_U = new int[param0.field_e.length];
              this.a(this.field_n, -74);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("km.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        tr stackIn_6_0 = null;
        pf stackIn_6_1 = null;
        pf stackIn_6_2 = null;
        tr stackIn_7_0;
        pf stackIn_7_1;
        pf stackIn_7_2;
        int stackIn_7_3;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -65 / ((param1 - 11) / 62);
                stackIn_6_0 = this.field_z;

                stackIn_6_1 = this.field_P.field_A;

                stackIn_6_2 = this.field_P.field_i;

                if (!this.field_j) {
                  break L2;
                } else {
                  stackIn_6_0 = (tr) ((Object) stackIn_6_0);

                  stackIn_6_1 = (pf) ((Object) stackIn_6_1);

                  stackIn_6_2 = (pf) ((Object) stackIn_6_2);

                  if (!se.field_g) {
                    break L2;
                  } else {



                    stackIn_7_0 = (tr) ((Object) stackIn_6_0);
                    stackIn_7_1 = (pf) ((Object) stackIn_6_1);
                    stackIn_7_2 = (pf) ((Object) stackIn_6_2);
                    stackIn_7_3 = 1;
                    break L1;
                  }
                }
              }
              stackIn_7_0 = (tr) ((Object) stackIn_6_0);
              stackIn_7_1 = (pf) ((Object) stackIn_6_1);
              stackIn_7_2 = (pf) ((Object) stackIn_6_2);
              stackIn_7_3 = 0;
              break L1;
            }
            ((tr) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3 != 0, 12114, param0, this.field_P.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((je.field_d ^ -1) != -3) {
                break L1;
              } else {
                if (!this.field_y) {
                  this.field_Z = param1;
                  this.field_y = true;
                  this.field_D = param2;
                  this.field_T = false;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == -3587) {
              L2: {
                if (!this.field_y) {
                  break L2;
                } else {
                  if (2 == rf.field_n) {
                    if (-26 <= ((this.field_D + -param2) * (this.field_D + -param2) + (-param1 + this.field_Z) * (-param1 + this.field_Z) ^ -1)) {
                      break L2;
                    } else {
                      this.field_T = true;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (!this.field_y) {
                  break L3;
                } else {
                  if ((rf.field_n ^ -1) == -3) {
                    break L3;
                  } else {
                    this.field_y = false;
                    if (this.field_T) {
                      break L3;
                    } else {
                      if (this.field_m == 0) {
                        if (null != this.field_z.field_p) {
                          var4 = (qm) ((Object) this.field_P.field_i.d(param0 + 3587));
                          L4: while (true) {
                            if (var4 == null) {
                              break L3;
                            } else {
                              L5: {
                                if (var4.field_p != this.field_n) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (var4.field_q == this.field_z.field_p) {
                                      break L6;
                                    } else {
                                      if (var4.field_r == this.field_z.field_p) {
                                        break L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  L7: {
                                    var4.field_q = null;
                                    var4.field_r = null;
                                    if (this.field_f) {
                                      this.field_ab.a(var4, 32);
                                      this.e(param0 + 3587);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var4.b((byte) -105);
                                  this.field_Y.c(var4.field_o, 127);
                                  break L5;
                                }
                              }
                              var4 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                              continue L4;
                            }
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        qk.a(us.field_d, param0 ^ -3671);
                        this.field_Y.a(-76, 0);
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4_ref), "km.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final void a(int param0, byte param1, fs param2, fs param3, int param4) {
        fs stackIn_4_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        fs var7 = null;
        String[] var8 = null;
        String var9 = null;
        fs var10 = null;
        try {
          L0: {
            L1: {
              var6_int = -91 / ((-70 - param1) / 36);
              if (this.field_f) {
                stackIn_4_0 = this.field_n;
                break L1;
              } else {
                stackIn_4_0 = this.field_P.field_v[0];
                break L1;
              }
            }
            var7 = stackIn_4_0;
            if (var7 != param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = ma.field_s[param4];
              if (0 != var8.length) {
                L2: {
                  var9 = var8[vc.a((byte) -39, var8.length)];
                  var10 = this.field_P.field_v[this.field_P.field_m[-1 + this.field_P.field_r]];
                  var9 = vm.a(var10.field_t, 108, "largestplayer", var9);
                  var9 = vm.a(this.field_n.field_t, 124, "you", var9);
                  var9 = vm.a(param3.field_t, 121, "me", var9);
                  if ((this.field_P.field_g.field_e.length ^ -1) >= (param0 ^ -1)) {
                    stackIn_14_0 = "";
                    break L2;
                  } else {
                    stackIn_14_0 = this.field_P.field_g.field_e[param0].field_I;
                    break L2;
                  }
                }
                var9 = vm.a(stackIn_14_0, 100, "system", var9);
                this.a(param3, var9, (byte) 51);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("km.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_24_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final boolean c(int param0) {
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_129_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        sl var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (66 == ej.field_e) {
              L1: {
                L2: {
                  var2_int = sa.field_a.j(-108);
                  var3 = sa.field_a.f(param0 + -35735);
                  var4 = sa.field_a.a(16711680);
                  var5 = sa.field_a.a(param0 ^ 16726439);
                  var6 = sa.field_a.j(-75);
                  var7_int = sa.field_a.j(param0 ^ -14818);
                  var8 = sa.field_a.f(-20976);
                  if (this.field_P.field_O >= var2_int) {
                    break L2;
                  } else {
                    if (-1 == this.field_P.field_O) {
                      break L2;
                    } else {
                      L3: {
                        this.b(false);
                        this.a((byte) 96, var4, var3);
                        if ((var5 ^ -1) == (this.field_P.f(-28824) ^ -1)) {
                          this.field_j = false;
                          break L3;
                        } else {
                          L4: {
                            var9 = js.field_f;
                            var9.h(66, param0 ^ 14680);
                            var9.field_j = var9.field_j + 2;
                            var10 = var9.field_j;
                            if (-1 >= (this.field_h ^ -1)) {
                              this.field_P.a(var9, (byte) 68, this.field_n);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            var9.f(param0 + -549356895, var9.field_j + -var10);
                            if (!se.field_g) {
                              d.a(0, (byte) 82);
                              q.g(-112);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_j = true;
                          break L3;
                        }
                      }
                      this.field_P.a(var7_int, var6, false);
                      this.field_L = false;
                      this.field_S = var8;
                      this.a(true);
                      break L1;
                    }
                  }
                }
                if ((this.field_P.field_O ^ -1) != 0) {
                  break L1;
                } else {
                  this.field_P.d(-9778, var2_int);
                  this.a(true, (int[]) null);
                  this.field_q = this.field_P.field_O;
                  break L1;
                }
              }
              this.field_S = var8;
              stackIn_29_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((ej.field_e ^ -1) != -70) {
                if ((ej.field_e ^ -1) != -68) {
                  if (70 == ej.field_e) {
                    this.b(rr.field_t, sa.field_a, -123);
                    stackIn_40_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (68 == ej.field_e) {
                      this.a(sa.field_a, rr.field_t, -80);
                      stackIn_45_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((ej.field_e ^ -1) == -63) {
                        L6: {
                          this.field_P.field_y = sa.field_a.j(param0 ^ -14832);
                          if (this == ce.field_x) {
                            ri.k(8);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        stackIn_54_0 = 1;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (-65 == (ej.field_e ^ -1)) {
                          L7: {
                            this.field_P.field_e = sa.field_a.j(param0 ^ -14814);
                            if (this == ce.field_x) {
                              wp.a(-2);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          stackIn_63_0 = 1;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (-64 == (ej.field_e ^ -1)) {
                            this.field_P.field_f = sa.field_a.j(-119);
                            this.field_P.field_w = this.field_P.field_w | this.field_P.field_f;
                            var2_int = 0;
                            L8: while (true) {
                              L9: {
                                if ((this.field_P.field_r ^ -1) >= (var2_int ^ -1)) {
                                  stackIn_77_0 = 1;
                                  break L9;
                                } else {
                                  stackIn_77_0 = this.field_P.field_f & 1 << var2_int;

                                  L10: {
                                    if (stackIn_77_0 == 0) {
                                      break L10;
                                    } else {
                                      this.field_P.a(this.field_P.field_v[var2_int], (byte) -123);
                                      break L10;
                                    }
                                  }
                                  var2_int++;
                                  continue L8;
                                }
                              }
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          } else {
                            if (-66 != (ej.field_e ^ -1)) {
                              if (61 != ej.field_e) {
                                if (param0 == 14759) {
                                  if (-73 != (ej.field_e ^ -1)) {
                                    if (ej.field_e == 73) {
                                      var2_int = sa.field_a.j(-95);
                                      var3 = sa.field_a.j(-112);
                                      var4 = sa.field_a.j(param0 ^ -14805);
                                      this.a(var4, (byte) 4, this.field_n, this.field_P.field_v[var2_int], var3);
                                      stackIn_116_0 = 1;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    } else {
                                      L11: {
                                        if ((ej.field_e ^ -1) != -75) {
                                          break L11;
                                        } else {
                                          if (se.field_g) {
                                            var2_int = rr.field_t / 4;
                                            var3 = 0;
                                            L12: while (true) {
                                              if ((var2_int ^ -1) >= (var3 ^ -1)) {
                                                stackIn_127_0 = 1;
                                                decompiledRegionSelector0 = 13;
                                                break L0;
                                              } else {
                                                var4 = sa.field_a.j(-128);
                                                var5 = sa.field_a.j(-126);
                                                var6 = sa.field_a.f(param0 ^ -26697);
                                                var7 = "My personality type is " + wk.field_a[var5] + " and my rating is " + var6;
                                                this.a(this.field_P.field_v[var4], var7, (byte) 51);
                                                var3++;
                                                continue L12;
                                              }
                                            }
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      stackIn_129_0 = 0;
                                      decompiledRegionSelector0 = 14;
                                      break L0;
                                    }
                                  } else {
                                    this.i(-126);
                                    stackIn_111_0 = 1;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  }
                                } else {
                                  stackIn_108_0 = 1;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              } else {
                                L13: {
                                  L14: {
                                    L15: {
                                      var2_int = sa.field_a.g(-2852);
                                      this.field_P.a(var2_int, 3);
                                      ta.a(0, -1, (byte) 96, false);
                                      this.field_b = false;
                                      this.field_Y.o(-4956);
                                      if (this.field_n == null) {
                                        break L15;
                                      } else {
                                        if ((this.field_P.field_w & 1 << this.field_h) != 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    if (!this.field_P.field_x.a((byte) 123, this.field_n)) {
                                      if (this.field_P.field_z) {
                                        jo.a(32767, hj.field_n, false, 10);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      break L14;
                                    }
                                  }
                                  jo.a(param0 ^ 18008, wh.field_b, false, 10);
                                  break L13;
                                }
                                L16: {
                                  if (!sm.field_e) {
                                    break L16;
                                  } else {
                                    if ((1 << this.field_h & this.field_P.field_e) != 0) {
                                      break L16;
                                    } else {
                                      this.b(-116);
                                      break L16;
                                    }
                                  }
                                }
                                stackIn_105_0 = 1;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              this.field_i = sa.field_a.j(-57);
                              stackIn_80_0 = 1;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.a(1, sa.field_a, rr.field_t);
                  stackIn_35_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                this.field_N = sa.field_a.j(-78);
                stackIn_32_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_29_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_35_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_40_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_45_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_54_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_63_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_77_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_80_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_105_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_108_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_111_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_116_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_127_0 != 0;
                                  } else {
                                    return stackIn_129_0 != 0;
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
              }
            }
          }
        }
    }

    private final void a(int param0, ln param1, ln param2, int param3) {
        RuntimeException runtimeException = null;
        qm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = (qm) ((Object) this.field_P.field_i.d(0));
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    stackIn_16_0 = param3 ^ -1;

                    stackIn_16_1 = var5.field_o ^ -1;

                    if (stackIn_16_0 != stackIn_16_1) {
                      var5 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                      continue L1;
                    } else {
                      var5.field_r = param1;
                      var5.field_q = param2;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 == null) {
                    var5 = new qm(param3, this.field_n, param2, param1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackIn_16_0 = 86;
                stackIn_16_1 = (param0 - 6) / 34;
                break L2;
              }
              L5: {
                var6 = stackIn_16_0 % stackIn_16_1;
                this.field_P.field_i.a((byte) -113, var5);
                if (this.field_f) {
                  this.field_ab.a(var5, 32);
                  this.e(0);
                  break L5;
                } else {
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (runtimeException);

            stackIn_24_1 = new StringBuilder().append("km.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_29_2 + ',' + param3 + ')');
        }
    }

    private final void b(int param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        boolean stackIn_4_0 = false;
        ln stackIn_22_0 = null;
        Object stackIn_74_0 = null;
        boolean stackIn_78_0 = false;
        int stackIn_94_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_77_0;
        boolean stackOut_3_0;
        ln stackOut_21_0;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        int var5 = 0;
        StringBuilder var6 = null;
        hj var7_ref_hj = null;
        qm var7_ref_qm = null;
        qi var7_ref_qi = null;
        nr var7_ref_nr = null;
        eg var7_ref_eg = null;
        mg var7_ref_mg = null;
        int var7 = 0;
        int var8_int = 0;
        ne var8 = null;
        fs[] var8_array = null;
        mg var9 = null;
        as var10 = null;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_Q = new k();
            this.field_z.b(false);
            var3 = this.c((byte) 44);
            this.field_P.a(param0, 1, this.field_Q, (se) null);
            this.field_z.a(0);
            var4 = this.field_Q.field_a.d(0);
            var5 = 0;
            var6 = new StringBuilder();
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var4) {
                    var4 = this.field_Q.field_a.d(0);
                    L4: while (true) {
                      if (var4 == null) {
                        this.field_z.field_C = true;
                        this.field_P.g(-7954);
                        this.a(true, var3);
                        stackIn_94_0 = var5;
                        break L3;
                      } else {
                        stackOut_77_0 = var4 instanceof hj;
                        stackIn_94_0 = stackOut_77_0 ? 1 : 0;
                        stackIn_78_0 = stackOut_77_0;
                        L5: {
                          if (!stackIn_78_0) {
                            break L5;
                          } else {
                            var7_ref_hj = (hj) (var4);
                            if (var7_ref_hj.field_j != null) {
                              if (var7_ref_hj.field_j != this.field_n) {
                                this.field_z.a(var7_ref_hj.field_j, var7_ref_hj.field_i, false, var7_ref_hj.field_h);
                                if (this.field_z.field_u < var7_ref_hj.field_h) {
                                  this.field_z.field_u = var7_ref_hj.field_h;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            } else {
                              var5 = 1;
                              discarded$0 = var6.append("Construction event at " + var7_ref_hj.field_i.field_I + " has no owner.\n");
                              break L5;
                            }
                          }
                        }
                        var4 = this.field_Q.field_a.a((byte) -71);
                        continue L4;
                      }
                    }
                  } else {
                    stackOut_3_0 = var4 instanceof mg;
                    stackIn_94_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    L6: {
                      L7: {
                        if (!stackIn_4_0) {
                          if (!(var4 instanceof eg)) {
                            if (var4 instanceof qm) {
                              L8: {
                                var7_ref_qm = (qm) (var4);
                                if (0 == var7_ref_qm.field_o) {
                                  this.field_z.a(var7_ref_qm.field_q, -124, 0, var7_ref_qm.field_p);
                                  break L8;
                                } else {
                                  if ((var7_ref_qm.field_o ^ -1) == -2) {
                                    this.field_z.a(var7_ref_qm.field_q, -117, 1, var7_ref_qm.field_p);
                                    break L8;
                                  } else {
                                    if ((var7_ref_qm.field_o ^ -1) == -4) {
                                      this.field_z.a(var7_ref_qm.field_p, var7_ref_qm.field_r, (byte) -128, var7_ref_qm.field_q);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              if (this.field_n != var7_ref_qm.field_p) {
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              if (var4 instanceof qi) {
                                var7_ref_qi = (qi) (var4);
                                this.field_z.a(var7_ref_qi.field_l, -123, 2, var7_ref_qi.field_k);
                                break L7;
                              } else {
                                if (!(var4 instanceof nr)) {
                                  break L7;
                                } else {
                                  L9: {
                                    var7_ref_nr = (nr) (var4);
                                    if (null == var7_ref_nr.field_j) {
                                      break L9;
                                    } else {
                                      var8_int = 0;
                                      L10: while (true) {
                                        if (var7_ref_nr.field_j.length <= var8_int) {
                                          break L9;
                                        } else {
                                          var9 = new mg(var7_ref_nr.field_p, var7_ref_nr.field_j[var8_int], var7_ref_nr.field_p.field_t, var7_ref_nr.field_i[var8_int]);
                                          this.field_z.field_hb.a((byte) -113, sg.a((byte) 101, var9));
                                          stackIn_98_0 = var9.field_z;

                                          stackIn_98_1 = this.field_z.field_y;

                                          L11: {
                                            if (stackIn_98_0 > stackIn_98_1) {
                                              this.field_z.field_y = var9.field_z;
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          var8_int++;
                                          continue L10;
                                        }
                                      }
                                    }
                                  }
                                  this.field_z.field_P[var7_ref_nr.field_p.field_p] = true;
                                  break L7;
                                }
                              }
                            }
                          } else {
                            var7_ref_eg = (eg) (var4);
                            this.field_z.field_m.a((byte) -113, new vn(var7_ref_eg));
                            var8 = (ne) ((Object) var7_ref_eg.field_v.d(0));
                            L12: while (true) {
                              if (var8 == null) {
                                break L7;
                              } else {
                                stackOut_21_0 = var8.field_k;
                                stackIn_74_0 = stackOut_21_0;
                                stackIn_22_0 = stackOut_21_0;
                                L13: {
                                  if (stackIn_22_0 == null) {
                                    break L13;
                                  } else {
                                    if ((var8.field_r ^ -1) == -1) {
                                      break L13;
                                    } else {
                                      if (var8.field_h != var8.field_k.field_y) {
                                        break L13;
                                      } else {
                                        var9 = new mg(var7_ref_eg.field_p, var8.field_k, var8.field_h, var8.field_r);
                                        var10 = bb.a(-2, var9);
                                        this.field_z.field_v.a((byte) -113, var10);
                                        if (var10.field_x <= this.field_z.field_y) {
                                          break L13;
                                        } else {
                                          this.field_z.field_y = var10.field_x;
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                                var8 = (ne) ((Object) var7_ref_eg.field_v.a((byte) -71));
                                continue L12;
                              }
                            }
                          }
                        } else {
                          L14: {
                            var7_ref_mg = (mg) (var4);
                            if (var7_ref_mg.field_G != null) {
                              this.field_z.field_c.a((byte) -113, qn.a(-121, var7_ref_mg));
                              if (var7_ref_mg.field_z > this.field_z.field_y) {
                                this.field_z.field_y = var7_ref_mg.field_z;
                                break L14;
                              } else {
                                break L14;
                              }
                            } else {
                              var5 = 1;
                              discarded$1 = var6.append("Fleet from " + var7_ref_mg.field_y.field_I + " to " + var7_ref_mg.field_B.field_I + " has no owner.\n");
                              break L14;
                            }
                          }
                          break L7;
                        }
                      }
                      stackIn_74_0 = this.field_Q.field_a.a((byte) -71);
                      break L6;
                    }
                    var4 = stackIn_74_0;
                    continue L1;
                  }
                }
                L15: {
                  if (stackIn_94_0 != 0) {
                    jq.a(-29901, (Throwable) null, var6.toString());
                    q.g(-118);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                stackIn_98_0 = -13;
                stackIn_98_1 = (param1 - 35) / 40;
                break L2;
              }
              L16: {
                var7 = stackIn_98_0 % stackIn_98_1;
                if (!this.field_W) {
                  break L16;
                } else {
                  if ((this.field_P.field_w & 1 ^ -1) != -1) {
                    fl.a(0, "losegame");
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (this.field_W) {
                  var8_array = this.field_P.field_x.a((byte) -23);
                  if (var8_array == null) {
                    break L17;
                  } else {
                    if (this.field_n != var8_array[0]) {
                      break L17;
                    } else {
                      fl.a(0, "wingame");
                      break L17;
                    }
                  }
                } else {
                  break L17;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref), "km.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 == -7970) {
              if (!this.field_f) {
                throw new IllegalStateException();
              } else {
                js.field_f.h(64, param0 ^ -8159);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void j(int param0) {
        boolean discarded$0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (!this.field_Y.a(true, (byte) 63)) {
                L2: {
                  if ((je.field_d ^ -1) != -2) {
                    break L2;
                  } else {
                    this.a(td.field_P, (byte) -103, nh.field_p);
                    break L2;
                  }
                }
                this.a(-3587, pd.field_k, bb.field_b);
                this.field_z.a(this.field_m, 0, pd.field_k, bb.field_b);
                break L1;
              } else {
                this.field_T = true;
                var2_int = 1;
                this.field_y = false;
                this.field_z.field_nb[1] = -1;
                this.field_z.field_nb[0] = -1;
                this.field_z.field_p = null;
                this.field_z.field_S = null;
                break L1;
              }
            }
            L3: {
              var3 = this.field_z.field_k;
              var4 = this.field_z.field_E;
              if (!di.field_p[96]) {
                break L3;
              } else {
                var3 = var3 - 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
                if (0.0f <= var3) {
                  break L3;
                } else {
                  var3 = 0.0f;
                  break L3;
                }
              }
            }
            L4: {
              if (param0 == 50) {
                break L4;
              } else {
                this.d(88);
                break L4;
              }
            }
            L5: {
              var5 = this.field_z.field_I;
              if (di.field_p[97]) {
                var3 = var3 + 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
                if ((float)(this.field_P.field_g.field_k + 0) >= var3) {
                  break L5;
                } else {
                  var3 = (float)(0 + this.field_P.field_g.field_k);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (!di.field_p[98]) {
                break L6;
              } else {
                var4 = var4 - 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
                if (var4 >= 0.0f) {
                  break L6;
                } else {
                  var4 = 0.0f;
                  break L6;
                }
              }
            }
            L7: {
              if (!di.field_p[99]) {
                break L7;
              } else {
                var4 = var4 + 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
                if ((float)(0 + this.field_P.field_g.field_b) < var4) {
                  var4 = (float)(this.field_P.field_g.field_b + 0);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              L9: {
                if (di.field_p[27]) {
                  break L9;
                } else {
                  if (di.field_p[87]) {
                    break L9;
                  } else {
                    break L8;
                  }
                }
              }
              var5 = var5 / 1.100000023841858f;
              if (this.field_z.field_g > var5) {
                var5 = this.field_z.field_g;
                break L8;
              } else {
                break L8;
              }
            }
            L10: {
              L11: {
                if (di.field_p[26]) {
                  break L11;
                } else {
                  if (di.field_p[88]) {
                    break L11;
                  } else {
                    break L10;
                  }
                }
              }
              var5 = var5 * 1.100000023841858f;
              if (this.field_z.field_F < var5) {
                var5 = this.field_z.field_F;
                break L10;
              } else {
                break L10;
              }
            }
            L12: {
              L13: {
                if (var2_int != 0) {
                  break L13;
                } else {
                  if ((2 & rf.field_n) != 0) {
                    L14: {
                      if (this.field_G) {
                        L15: {
                          var6 = -this.field_z.field_db + pd.field_k;
                          var7 = -this.field_z.field_e + bb.field_b;
                          var3 = var3 - this.field_z.field_I * (float)var6 / 300.0f;
                          if (0.0f <= var3) {
                            break L15;
                          } else {
                            var3 = 0.0f;
                            break L15;
                          }
                        }
                        L16: {
                          var4 = var4 - (float)var7 * this.field_z.field_I / 300.0f;
                          if (var3 > (float)(this.field_P.field_g.field_k + 0)) {
                            var3 = (float)(this.field_P.field_g.field_k - 0);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (var4 >= 0.0f) {
                            break L17;
                          } else {
                            var4 = 0.0f;
                            break L17;
                          }
                        }
                        if (var4 <= (float)(this.field_P.field_g.field_b + 0)) {
                          break L14;
                        } else {
                          var4 = (float)(this.field_P.field_g.field_b - 0);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    this.field_z.field_e = bb.field_b;
                    this.field_G = true;
                    this.field_z.field_db = pd.field_k;
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              this.field_G = false;
              break L12;
            }
            L18: {
              if (var2_int != 0) {
                break L18;
              } else {
                if (so.field_o == 0) {
                  break L18;
                } else {
                  L19: {
                    var6 = 320;
                    var7 = this.field_Y.d((byte) 14) / 2;
                    var8 = var3 + (float)(pd.field_k - var6) * this.field_z.field_I / 300.0f;
                    var9 = (float)(bb.field_b - var7) * this.field_z.field_I / 300.0f + var4;
                    if (0 < so.field_o) {
                      var10 = 0;
                      L20: while (true) {
                        if ((so.field_o * 2 ^ -1) >= (var10 ^ -1)) {
                          if (var5 <= this.field_z.field_F) {
                            break L19;
                          } else {
                            var5 = this.field_z.field_F;
                            break L19;
                          }
                        } else {
                          var5 = var5 * 1.100000023841858f;
                          var10++;
                          continue L20;
                        }
                      }
                    } else {
                      var10 = 2 * so.field_o;
                      L21: while (true) {
                        if (-1 >= (var10 ^ -1)) {
                          if (this.field_z.field_g <= var5) {
                            break L19;
                          } else {
                            var5 = this.field_z.field_g;
                            break L19;
                          }
                        } else {
                          var5 = var5 / 1.100000023841858f;
                          var10++;
                          continue L21;
                        }
                      }
                    }
                  }
                  L22: {
                    var3 = var8 - var5 * (float)(-var6 + pd.field_k) / 300.0f;
                    var4 = var9 - var5 * (float)(bb.field_b - var7) / 300.0f;
                    if (0.0f > var3) {
                      var3 = 0.0f;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (0.0f > var4) {
                      var4 = 0.0f;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if ((float)(0 + this.field_P.field_g.field_k) >= var3) {
                      break L24;
                    } else {
                      var3 = (float)(this.field_P.field_g.field_k - 0);
                      break L24;
                    }
                  }
                  if (var4 > (float)(this.field_P.field_g.field_b + 0)) {
                    var4 = (float)(this.field_P.field_g.field_b - 0);
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
            }
            L25: {
              L26: {
                if (this.field_z.field_k != var3) {
                  break L26;
                } else {
                  if (this.field_z.field_E != var4) {
                    break L26;
                  } else {
                    if (this.field_z.field_I != var5) {
                      break L26;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              this.field_z.field_I = var5;
              this.field_z.field_x = false;
              this.field_z.field_fb = null;
              this.field_z.field_E = var4;
              this.field_z.field_k = var3;
              this.field_z.a(false);
              break L25;
            }
            L27: {
              if (-1 != (rf.field_n ^ -1)) {
                if (this.field_z.field_S == null) {
                  break L27;
                } else {
                  discarded$0 = this.a((byte) 121, this.field_z.field_S);
                  break L27;
                }
              } else {
                this.field_I = this.field_F;
                this.field_O = 0;
                break L27;
              }
            }
            this.field_z.c(pd.field_k, bb.field_b, param0 ^ 69);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.W(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, ln param2, ln param3) {
        ln stackIn_18_0 = null;
        ln stackIn_18_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = (mg) ((Object) param3.field_T.d(0));
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var5) {
                    break L3;
                  } else {
                    stackIn_18_0 = (ln) (param2);

                    stackIn_18_1 = var5.field_B;

                    L4: {
                      if (stackIn_18_0 != stackIn_18_1) {
                        break L4;
                      } else {
                        if (var5.field_G == this.field_n) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var5 = (mg) ((Object) param3.field_T.a((byte) -71));
                    continue L1;
                  }
                }
                if (!param0) {
                  L5: {
                    if (null != var5) {
                      var5.field_z = var5.field_z + param1;
                      break L5;
                    } else {
                      var5 = new mg(param3, param2, param1);
                      param3.field_T.a((byte) -113, var5);
                      param2.field_s.a(var5, 32);
                      this.field_P.field_p.a((byte) 62, var5);
                      break L5;
                    }
                  }
                  stackIn_18_0 = (ln) (param3);
                  stackIn_18_1 = (ln) (param3);
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              L6: {
                stackIn_18_0.field_J = stackIn_18_1.field_J - param1;
                this.field_C[param3.field_p] = this.field_C[param3.field_p] - param1;
                kr.a((byte) 83, param3);
                fl.a(param2, (byte) 75);
                this.a(this.field_n, -95);
                if (this.field_f) {
                  this.field_v.a((byte) 9, var5);
                  this.e(0);
                  break L6;
                } else {
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5_ref);

            stackIn_26_1 = new StringBuilder().append("km.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void l(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = js.field_f;
            var2.h(59, 255);
            if (param0 < -75) {
              L1: {
                var2.field_j = var2.field_j + 2;
                var3 = var2.field_j;
                var2.c(this.field_P.field_O, (byte) -109);
                se.a(tr.a((byte) 81, this.field_o), -256, tr.a((byte) 93, this.field_ab), rp.a(-125, this.field_v), var2);
                this.field_ab.b((byte) 35);
                this.field_o.b((byte) 87);
                this.field_v.a((byte) 112);
                var2.f(-549342136, -var3 + var2.field_j);
                this.field_g = -1;
                this.field_k = -1;
                if (!sm.field_e) {
                  break L1;
                } else {
                  this.m(126);
                  break L1;
                }
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
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.VA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(mg param0, int param1, int param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              param0.field_y.field_J = param0.field_y.field_J - param1;
              this.field_C[param0.field_y.field_p] = this.field_C[param0.field_y.field_p] - param1;
              param0.field_z = param0.field_z + param1;
              if (param2 == 10755) {
                break L1;
              } else {
                this.a(101);
                break L1;
              }
            }
            if ((param0.field_z ^ -1) <= -1) {
              L2: {
                if (0 != param0.field_z) {
                  break L2;
                } else {
                  param0.b((byte) -106);
                  param0.a(16);
                  param0.d(true);
                  break L2;
                }
              }
              L3: {
                this.a(this.field_n, -117);
                if (this.field_f) {
                  this.field_v.a((byte) 9, param0);
                  this.e(0);
                  break L3;
                } else {
                  break L3;
                }
              }
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("km.IA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 54) {
                break L1;
              } else {
                this.field_c = (sd) null;
                break L1;
              }
            }
            L2: {
              var2_int = 0;
              if (di.field_p[81]) {
                var2_int = 81;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!di.field_p[86]) {
                break L3;
              } else {
                if (0 != var2_int) {
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var2_int = 86;
                  break L3;
                }
              }
            }
            L4: {
              if (!di.field_p[82]) {
                break L4;
              } else {
                if ((var2_int ^ -1) == -1) {
                  var2_int = 82;
                  break L4;
                } else {
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_24_0 = var2_int;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (this.field_f) {
              this.field_P.field_e = this.field_P.field_e | 1 << this.field_h;
              var2_int = 9 / ((-64 - param0) / 51);
              js.field_f.h(65, 255);
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.C(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, mg param1) {
        int fieldTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_88_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 > 95) {
              if (param1.field_G != this.field_n) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (-1 <= (this.field_O ^ -1)) {
                    L2: {
                      if ((rf.field_n ^ -1) != -2) {
                        break L2;
                      } else {
                        if (param1 != this.field_z.field_rb) {
                          this.field_z.b((byte) -127);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      L4: {
                        if ((rf.field_n ^ -1) != -2) {
                          break L4;
                        } else {
                          if (this.field_z.field_Ab) {
                            L5: {
                              var3_int = 1;
                              var4 = this.a((byte) 57);
                              var5 = this.field_z.field_S.field_y;
                              if (82 == var4) {
                                L6: {
                                  if (var5.field_N < var5.field_J) {
                                    stackIn_70_0 = var5.field_J - var5.field_N;
                                    break L6;
                                  } else {
                                    stackIn_70_0 = var5.field_J;
                                    break L6;
                                  }
                                }
                                var3_int = stackIn_70_0;
                                break L5;
                              } else {
                                if ((var4 ^ -1) == -87) {
                                  var3_int = 5;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L7: {
                              if (!this.field_P.field_o.field_e) {
                                stackIn_75_0 = var5.field_N;
                                break L7;
                              } else {
                                stackIn_75_0 = 0;
                                break L7;
                              }
                            }
                            L8: {
                              var6 = stackIn_75_0;
                              if ((var5.field_J - var6 ^ -1) <= (var3_int ^ -1)) {
                                break L8;
                              } else {
                                var3_int = var5.field_J + -var6;
                                break L8;
                              }
                            }
                            if (-1 > (var3_int ^ -1)) {
                              this.a(this.field_z.field_S, var3_int, 10755);
                              break L3;
                            } else {
                              qk.a(jj.field_l, 47);
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      L9: {
                        if ((rf.field_n ^ -1) != -2) {
                          break L9;
                        } else {
                          if (!this.field_z.field_Gb) {
                            break L9;
                          } else {
                            L10: {
                              var3_int = -1;
                              var4 = this.a((byte) 55);
                              if ((var4 ^ -1) == -83) {
                                var3_int = -this.field_z.field_S.field_z;
                                break L10;
                              } else {
                                if (var4 == 86) {
                                  L11: {
                                    if (-6 < (this.field_z.field_S.field_z ^ -1)) {
                                      stackIn_42_0 = this.field_z.field_S.field_z;
                                      break L11;
                                    } else {
                                      stackIn_42_0 = 5;
                                      break L11;
                                    }
                                  }
                                  var3_int = -stackIn_42_0;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L12: {
                              this.a(this.field_z.field_S, var3_int, 10755);
                              if (this.field_z.field_S.field_z != 0) {
                                break L12;
                              } else {
                                this.field_z.field_nb[1] = -1;
                                this.field_z.field_nb[0] = -1;
                                this.field_z.field_S = null;
                                this.field_z.b((byte) -51);
                                break L12;
                              }
                            }
                            break L3;
                          }
                        }
                      }
                      if ((rf.field_n ^ -1) != -2) {
                        break L3;
                      } else {
                        if (this.field_z.field_Bb) {
                          var3_int = -param1.field_z;
                          this.a(this.field_z.field_S, var3_int, 10755);
                          this.field_z.field_nb[1] = -1;
                          this.field_z.field_S = null;
                          this.field_z.field_nb[0] = -1;
                          this.field_z.b((byte) -74);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L13: {
                      fieldTemp$0 = this.field_I - 5;
                      this.field_I = this.field_I - 5;
                      if (0 <= fieldTemp$0) {
                        break L13;
                      } else {
                        this.field_I = 0;
                        break L13;
                      }
                    }
                    this.field_O = this.field_I;
                    this.a(2);
                    break L1;
                  } else {
                    this.field_O = this.field_O - 1;
                    break L1;
                  }
                }
                stackIn_88_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackIn_92_0 = (RuntimeException) (var3);

            stackIn_92_1 = new StringBuilder().append("km.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "null";
              break L14;
            } else {
              stackIn_93_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "{...}";
              break L14;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_93_0), stackIn_93_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_88_0 != 0;
          }
        }
    }

    final void a(int param0) {
        ln[] var2 = null;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_R.length < this.field_P.field_g.field_e.length) {
                this.field_R = new fs[this.field_P.field_g.field_e.length];
                this.field_C = new int[this.field_P.field_g.field_e.length];
                this.field_l = new sd[this.field_P.field_g.field_e.length];
                break L1;
              } else {
                break L1;
              }
            }
            var2 = this.field_P.field_g.field_e;
            var3 = 0;
            L2: while (true) {
              if (var3 >= var2.length) {
                L3: {
                  if (param0 == 2) {
                    break L3;
                  } else {
                    this.field_l = (sd[]) null;
                    break L3;
                  }
                }
                this.field_z.a(this.field_C, true, this.field_l, this.field_R, true);
                break L0;
              } else {
                L4: {
                  var4 = var2[var3];
                  var5 = var4.field_p;
                  this.field_R[var5] = var4.field_y;
                  stackIn_12_0 = this.field_C;

                  stackIn_12_1 = var5;

                  if (var4.field_y != this.field_n) {
                    stackIn_13_0 = (int[]) ((Object) stackIn_12_0);
                    stackIn_13_1 = stackIn_12_1;
                    stackIn_13_2 = var4.field_x;
                    break L4;
                  } else {


                    stackIn_13_0 = (int[]) ((Object) stackIn_12_0);
                    stackIn_13_1 = stackIn_12_1;
                    stackIn_13_2 = var4.field_J;
                    break L4;
                  }
                }
                stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                this.field_l[var5] = var4.field_R;
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.A(" + param0 + ')');
        }
    }

    final void m(int param0) {
        sl var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (param0 >= 122) {
                break L1;
              } else {
                this.a((fs) null, -117);
                break L1;
              }
            }
            L2: {
              if (!this.field_f) {
                this.d((byte) -81);
                break L2;
              } else {
                L3: {
                  if (-1 == this.field_k) {
                    break L3;
                  } else {
                    this.l(-113);
                    break L3;
                  }
                }
                L4: {
                  var2 = js.field_f;
                  var2.h(61, 255);
                  var2.c(this.field_P.field_O, (byte) -93);
                  var2.e(11135, this.f(-41));
                  this.field_L = true;
                  if (-2 > (this.field_N ^ -1)) {
                    this.field_N = this.field_N - 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.QA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        sl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            if (this.field_L) {
              var3 = 82 / ((param0 - 61) / 51);
              var2 = js.field_f;
              var2.h(62, 255);
              var2.c(this.field_P.field_O, (byte) -126);
              this.field_L = false;
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.N(" + param0 + ')');
        }
    }

    private final void a(fs param0, fs param1, boolean param2) {
        String var4 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              if (this.field_n == param0) {
                var4 = re.a(ud.field_b, 4371, new String[]{param1.field_t});
                this.field_H.a(new n(param1, (fs) null, var4), 0);
                break L1;
              } else {
                if (param1 != this.field_n) {
                  break L1;
                } else {
                  var4 = re.a(wf.field_h, 4371, new String[]{param0.field_t});
                  this.field_H.a(new n(param0, (fs) null, var4), 0);
                  break L1;
                }
              }
            }
            L2: {
              if (null == this.field_s[param1.field_x]) {
                break L2;
              } else {
                this.field_s[param1.field_x].a(param0, 7686);
                break L2;
              }
            }
            L3: {
              if (param2) {
                break L3;
              } else {
                this.a(true, 25, (ln) null, (ln) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4_ref);

            stackIn_16_1 = new StringBuilder().append("km.P(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_L) {
                break L1;
              } else {
                this.k(-92);
                break L1;
              }
            }
            L2: {
              if (param0 != (this.field_g ^ -1)) {
                break L2;
              } else {
                this.field_g = 250;
                break L2;
              }
            }
            this.field_k = 25;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.E(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              this.field_P.c(0);
              this.field_P.b(param2, 0);
              if (param0 > 89) {
                break L1;
              } else {
                this.field_n = (fs) null;
                break L1;
              }
            }
            this.b(param1, 123);
            this.field_z.field_d = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4), "km.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int f(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        qm var3 = null;
        int var4 = 0;
        qa var5 = null;
        mg var6 = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 406213746;
            var4 = -1 % ((param0 - 29) / 63);
            var3 = (qm) ((Object) this.field_P.field_i.d(0));
            L1: while (true) {
              if (var3 == null) {
                var5 = (qa) ((Object) this.field_P.field_q.d(0));
                L2: while (true) {
                  if (null == var5) {
                    var6 = (mg) ((Object) this.field_P.field_p.a(true));
                    L3: while (true) {
                      if (var6 == null) {
                        stackIn_15_0 = var2_int;
                        break L0;
                      } else {
                        var2_int = var2_int + ((1 + var6.field_y.field_p) * (1 + (var6.field_B.field_p - -65536)) - -(var6.field_z * ((1 + var6.field_B.field_p) * (1 + var6.field_y.field_p))));
                        var6 = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                        continue L3;
                      }
                    }
                  } else {
                    var2_int = var2_int + (var5.field_u.field_p * (var5.field_v ^ 11) << -1411704405);
                    var5 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                    continue L2;
                  }
                }
              } else {
                L4: {
                  stackIn_6_0 = var2_int;

                  stackIn_6_1 = 17 * var3.field_q.field_p + var3.field_o;

                  if (var3.field_r != null) {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = var3.field_r.field_p - -7;
                    break L4;
                  } else {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = stackIn_6_1;
                    stackIn_7_2 = 5;
                    break L4;
                  }
                }
                var2_int = stackIn_7_0 + stackIn_7_1 * stackIn_7_2;
                var3 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.AA(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    private final void a(ob param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        fs var8_ref_fs = null;
        int var8 = 0;
        fs var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = 30 % ((-1 - param2) / 62);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -1;
                        stackIn_3_1 = param1 ^ -1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= stackIn_3_1) {
                            statePc = 26;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = param0.j(-82);
                        param1--;
                        if ((var5 ^ -1) == -1) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-2 != (var5 ^ -1)) {
                            statePc = 19;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = param0.j(-96);
                        var7 = param0.j(-120);
                        var8_ref_fs = this.field_P.field_v[var6];
                        var9 = this.field_P.field_v[var7];
                        var8_ref_fs.field_f[var7] = 3;
                        var8_ref_fs.field_h[var7] = true;
                        var9.field_f[var6] = 3;
                        var9.field_h[var6] = true;
                        var8_ref_fs.field_A = var8_ref_fs.field_A & (1 << var7 ^ -1);
                        var8_ref_fs.field_w = var8_ref_fs.field_w & (1 << var7 ^ -1);
                        var9.field_A = var9.field_A & (1 << var6 ^ -1);
                        var9.field_w = var9.field_w & (1 << var6 ^ -1);
                        this.a(var8_ref_fs, -27584, var9);
                        param1 -= 3;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = param0.j(-108);
                        var7 = (this.field_n.field_A ^ -1) & var6;
                        this.field_n.field_A = var6;
                        param1--;
                        if (var7 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var8 ^ -1) <= (this.field_P.field_r ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_3_0 = 0;
                        stackIn_15_0 = stackIn_3_0;
                        stackIn_3_1 = var7 & 1 << var8;
                        stackIn_15_1 = stackIn_3_1;
                        if (false) {
                            statePc = 3;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 == stackIn_15_1) {
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
                        this.a(this.field_P.field_v[var8], this.field_n, true);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var4);
                    stackIn_22_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("km.K(");
                    stackIn_22_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, ln param1, int param2) {
        RuntimeException runtimeException = null;
        qm var4 = null;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (qm) ((Object) this.field_P.field_i.d(param2 + param2));
            L1: while (true) {
              L2: {
                if (null == var4) {
                  break L2;
                } else {
                  if (param0 != var4.field_o) {
                    var4 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                    continue L1;
                  } else {
                    var4.field_q = param1;
                    break L2;
                  }
                }
              }
              L3: {
                if (null != var4) {
                  break L3;
                } else {
                  var4 = new qm(param0, this.field_n, param1);
                  break L3;
                }
              }
              L4: {
                this.field_P.field_i.a((byte) -113, var4);
                if (!this.field_f) {
                  break L4;
                } else {
                  this.field_ab.a(var4, 32);
                  this.e(param2 ^ 0);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (runtimeException);

            stackIn_19_1 = new StringBuilder().append("km.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, int[] param1) {
        boolean stackIn_24_0 = false;
        boolean stackIn_45_0 = false;
        fs stackIn_66_0 = null;
        fs stackIn_86_0 = null;
        int stackIn_118_0 = 0;
        int stackIn_122_0 = 0;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        RuntimeException stackIn_151_0 = null;
        StringBuilder stackIn_151_1 = null;
        RuntimeException stackIn_152_0 = null;
        StringBuilder stackIn_152_1 = null;
        String stackIn_152_2 = null;
        boolean stackOut_23_0;
        boolean stackOut_44_0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        ln[] var11_ref_ln__ = null;
        fs[] var11_ref_fs__ = null;
        oh var11_ref_oh = null;
        int var11 = 0;
        int var12 = 0;
        hj var12_ref_hj = null;
        eg var12_ref_eg = null;
        qi var12_ref_qi = null;
        qm var12_ref_qm = null;
        mg var12_ref_mg = null;
        ln var13 = null;
        fs var13_ref = null;
        int var13_int = 0;
        fs[] var13_array = null;
        ne var13_ref2 = null;
        um var13_ref3 = null;
        int var14_int = 0;
        um var14 = null;
        int var15_int = 0;
        sd var15 = null;
        fs var15_ref = null;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = ShatteredPlansClient.field_F ? 1 : 0;
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
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_R = (fs[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = new int[this.field_P.field_r];
                        var4 = new int[this.field_P.field_r];
                        var5 = new int[this.field_P.field_r];
                        var6 = new int[this.field_P.field_r];
                        var7 = new int[this.field_P.field_r];
                        var8 = new int[this.field_P.field_r];
                        var9 = new int[this.field_P.field_r];
                        var10 = new int[this.field_P.field_r];
                        var11_ref_ln__ = this.field_P.field_g.field_e;
                        var12 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var12 >= var11_ref_ln__.length) {
                            statePc = 21;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var13 = var11_ref_ln__[var12];
                        if (null != var13.field_y) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var14_int = var13.field_y.field_x;
                        var6[var14_int] = var6[var14_int] + 1;
                        var3[var14_int] = var3[var14_int] + var13.field_x;
                        if (-1 >= (var13.field_G[0] ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var15_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (4 <= var15_int) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5[var14_int] = var5[var14_int] + var13.field_G[var15_int];
                        var15_int++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var12++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var11_ref_fs__ = this.field_P.field_v;
                        var12 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var11_ref_fs__.length <= var12) {
                            statePc = 39;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var13_ref = var11_ref_fs__[var12];
                        var14_int = var13_ref.field_x;
                        stackOut_23_0 = this.field_P.field_o.field_i;
                        stackIn_118_0 = stackOut_23_0 ? 1 : 0;
                        stackIn_24_0 = stackOut_23_0;
                        if (false) {
                            statePc = 118;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0) {
                            statePc = 33;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var15 = (sd) ((Object) var13_ref.field_i.d(0));
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var15 == null) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var4[var14_int] = var4[var14_int] + var15.field_r;
                        var15 = (sd) ((Object) var13_ref.field_i.a((byte) -71));
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (null == var13_ref.field_m) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var4[var14_int] = var13_ref.field_m.field_r;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var12++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (this.field_Q != null) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11_ref_oh = this.field_Q.field_a.d(0);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null == var11_ref_oh) {
                            statePc = 117;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = var11_ref_oh instanceof hj;
                        stackIn_118_0 = stackOut_44_0 ? 1 : 0;
                        stackIn_45_0 = stackOut_44_0;
                        if (false) {
                            statePc = 118;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (!stackIn_45_0) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var12_ref_hj = (hj) ((Object) var11_ref_oh);
                        if (var12_ref_hj.field_j == null) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var7[var12_ref_hj.field_j.field_x] = var7[var12_ref_hj.field_j.field_x] + var12_ref_hj.field_h;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (!(var11_ref_oh instanceof eg)) {
                            statePc = 106;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var12_ref_eg = (eg) ((Object) var11_ref_oh);
                        var13_int = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (this.field_P.field_r <= var13_int) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8[var13_int] = var8[var13_int] + var12_ref_eg.field_k[var13_int];
                        var13_int++;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var12_ref_eg.field_i != var12_ref_eg.field_w) {
                            statePc = 77;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (null == var12_ref_eg.field_i) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var12_ref_eg.field_i.field_q.field_y = var12_ref_eg.field_i.field_q.field_y + 1;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var13_array = var12_ref_eg.field_h;
                        var14_int = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var14_int >= var13_array.length) {
                            statePc = 76;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var15_ref = var13_array[var14_int];
                        stackIn_86_0 = (fs) (var15_ref);
                        stackIn_66_0 = stackIn_86_0;
                        if (false) {
                            statePc = 86;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 == null) {
                            statePc = 75;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var15_ref != var12_ref_eg.field_w) {
                            statePc = 74;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var15_ref.field_q.field_q = var15_ref.field_q.field_q + 1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var14_int++;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (null == var12_ref_eg.field_w) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var12_ref_eg.field_w.field_q.field_a = var12_ref_eg.field_w.field_q.field_a + 1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (null == var12_ref_eg.field_i) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var12_ref_eg.field_i.field_q.field_m = var12_ref_eg.field_i.field_q.field_m + 1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var13_array = var12_ref_eg.field_h;
                        var14_int = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((var13_array.length ^ -1) >= (var14_int ^ -1)) {
                            statePc = 97;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_86_0 = var13_array[var14_int];
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var15_ref = stackIn_86_0;
                        if (null == var15_ref) {
                            statePc = 96;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var12_ref_eg.field_w == var15_ref) {
                            statePc = 96;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var12_ref_eg.field_i != var15_ref) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var15_ref.field_q.field_q = var15_ref.field_q.field_q + 1;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var14_int++;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var13_ref2 = (ne) ((Object) var12_ref_eg.field_v.d(0));
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var13_ref2 == null) {
                            statePc = 106;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var12_ref_eg.field_w != var13_ref2.field_h) {
                            statePc = 104;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var10[var13_ref2.field_h.field_x] = var10[var13_ref2.field_h.field_x] + var13_ref2.field_i;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var13_ref2 = (ne) ((Object) var12_ref_eg.field_v.a((byte) -71));
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var11_ref_oh instanceof qi) {
                            statePc = 109;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var12_ref_qi = (qi) ((Object) var11_ref_oh);
                        var8[var12_ref_qi.field_k.field_x] = var8[var12_ref_qi.field_k.field_x] + var12_ref_qi.field_i;
                        var12_ref_qi.field_k.field_q.field_s = var12_ref_qi.field_k.field_q.field_s + 1;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (var11_ref_oh instanceof qm) {
                            statePc = 113;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var12_ref_qm = (qm) ((Object) var11_ref_oh);
                        var12_ref_qm.field_p.field_q.field_s = var12_ref_qm.field_p.field_q.field_s + 1;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (!(var11_ref_oh instanceof mg)) {
                            statePc = 116;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var12_ref_mg = (mg) ((Object) var11_ref_oh);
                        var13_ref3 = var12_ref_mg.field_G.field_q;
                        var13_ref3.field_t = var13_ref3.field_t + 1;
                        var13_ref3.field_i = var13_ref3.field_i + var12_ref_mg.field_z;
                        var9[var12_ref_mg.field_G.field_x] = var9[var12_ref_mg.field_G.field_x] + var12_ref_mg.field_z;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var11_ref_oh = this.field_Q.field_a.a((byte) -71);
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        stackIn_118_0 = this.field_P.field_O ^ -1;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (stackIn_118_0 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackIn_122_0 = this.field_P.field_O % 100;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackIn_122_0 = 0;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var11 = stackIn_122_0;
                        var12 = 0;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (this.field_P.field_r <= var12) {
                            statePc = 153;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var13_ref = this.field_P.field_v[var12];
                        var14 = var13_ref.field_q;
                        var14.field_g[var11] = var3[var12];
                        var14.field_f[var11] = var4[var12];
                        var14.field_h[var11] = var6[var12];
                        if ((var3[var12] ^ -1) < (var14.field_A ^ -1)) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var14.field_A = var3[var12];
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var14.field_v = var14.field_v + var8[var12];
                        if ((var4[var12] ^ -1) < (var14.field_x ^ -1)) {
                            statePc = 133;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var14.field_x = var4[var12];
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var14.field_o = var14.field_o + var7[var12];
                        var14.field_r = var14.field_e + (var14.field_o - var3[var12]);
                        if (var13_ref.field_i.g(115)) {
                            statePc = 146;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (param1 == null) {
                            statePc = 145;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if ((var5[var12] ^ -1) < -1) {
                            statePc = 143;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var14.field_u = var14.field_u + (var4[var12] * 800 - -var5[var12]) / (var5[var12] * 2);
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var14.field_z = var14.field_z + (param1[var12] + 200 * var10[var12]) / (2 * param1[var12]);
                        var14.field_w = var14.field_w + (param1[var12] + 200 * var9[var12]) / (2 * param1[var12]);
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var14.field_l = this.field_P.field_O + -this.field_q;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var12++;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 148: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_151_0 = (RuntimeException) (var3_ref);
                    stackIn_149_0 = stackIn_151_0;
                    stackIn_151_1 = new StringBuilder().append("km.SA(").append(param0).append(',');
                    stackIn_149_1 = stackIn_151_1;
                    if (param1 == null) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    stackIn_152_0 = (RuntimeException) ((Object) stackIn_149_0);
                    stackIn_152_1 = (StringBuilder) ((Object) stackIn_149_1);
                    stackIn_152_2 = "{...}";
                    statePc = 152;
                    continue stateLoop;
                }
                case 151: {
                    stackIn_152_0 = (RuntimeException) ((Object) stackIn_151_0);
                    stackIn_152_1 = (StringBuilder) ((Object) stackIn_151_1);
                    stackIn_152_2 = "null";
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    throw r.a((Throwable) ((Object) stackIn_152_0), stackIn_152_2 + ')');
                }
                case 153: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(byte param0, fs param1, fs param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                field_A = (String) null;
                break L1;
              }
            }
            L2: {
              if (this.field_f) {
                if (sm.field_e) {
                  this.a(param2, (byte) 50);
                  break L2;
                } else {
                  throw new RuntimeException();
                }
              } else {
                break L2;
              }
            }
            if (param2 == param1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (0 == (param1.field_w & 1 << param2.field_x)) {
                L3: {
                  param1.field_w = param1.field_w | 1 << param2.field_x;
                  param2.field_A = param2.field_A | 1 << param1.field_x;
                  if ((1 << param2.field_x & param1.field_A ^ -1) == -1) {
                    if (this.field_s[param2.field_x] != null) {
                      this.field_s[param2.field_x].a(param1, param0 ^ -7737);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    L4: {
                      if (null != this.field_s[param2.field_x]) {
                        this.field_s[param2.field_x].a(param1, (byte) -42);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1.field_f[param2.field_x] = 3;
                    param1.field_h[param2.field_x] = true;
                    param2.field_f[param1.field_x] = 3;
                    param2.field_h[param1.field_x] = true;
                    param1.field_A = param1.field_A & (1 << param2.field_x ^ -1);
                    param1.field_w = param1.field_w & (1 << param2.field_x ^ -1);
                    param2.field_A = param2.field_A & (1 << param1.field_x ^ -1);
                    param2.field_w = param2.field_w & (1 << param1.field_x ^ -1);
                    this.a(param2, param0 ^ 27521, param1);
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var4);

            stackIn_34_1 = new StringBuilder().append("km.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L5;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L6;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_35_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (!this.field_f) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  this.c(false);
                  break L1;
                }
              }
              js.field_f.h(63, 255);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.LA(" + param0 + ')');
        }
    }

    final void a(int param0, fs param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka var3 = null;
        RuntimeException var3_ref = null;
        ka[] var4 = null;
        int var5 = 0;
        ka var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_P.a(-5, param1);
            var3 = new ka(this.field_P, param1, (mn) (this), 2);
            var4 = new ka[this.field_s.length + 1];
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_s.length) {
                var4[param1.field_x] = new ka(this.field_P, param1, (mn) (this), param0);
                var4[var5] = var3;
                this.field_s = (uj[]) ((Object) var4);
                break L0;
              } else {
                L2: {
                  if (this.field_s[var5] != null) {
                    var4[var5] = new ka(this.field_P, this.field_P.field_v[var5], (mn) (this), 2);
                    var6 = (ka) ((Object) this.field_s[var5]);
                    var7 = 0;
                    L3: while (true) {
                      if ((var6.field_i.length ^ -1) >= (var7 ^ -1)) {
                        break L2;
                      } else {
                        var4[var5].field_i[var7] = var6.field_i[var7];
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("km.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    final void g(int param0) {
        int stackIn_11_0 = 0;
        boolean stackIn_12_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        fs[] var2 = null;
        mg var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3_int = 0;
        qa var3 = null;
        fs var4 = null;
        qm var4_ref = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_f) {
                break L1;
              } else {
                L2: {
                  if (0 > this.field_h) {
                    L3: {
                      if ((oq.field_j ^ -1) == -14) {
                        stackIn_11_0 = 0;
                        break L3;
                      } else {
                        stackIn_11_0 = 1;
                        break L3;
                      }
                    }
                    stackIn_12_0 = stackIn_11_0 != 0 & ge.field_n;
                    break L2;
                  } else {
                    stackIn_12_0 = sr.field_h;
                    break L2;
                  }
                }
                var2_int = stackIn_12_0 ? 1 : 0;
                if (var2_int != 0) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (13 == oq.field_j) {
              L4: {
                var2_int = 1;
                if (this.field_f) {
                  if (-1 >= (this.field_h ^ -1)) {
                    if (!this.field_b) {
                      var2_int = 3;
                      break L4;
                    } else {
                      var2_int = 2;
                      break L4;
                    }
                  } else {
                    var2_int = 4;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              var3_int = var2_int;
              ta.a(0, var3_int, (byte) 96, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (param0 <= -80) {
                L5: {
                  this.field_Y.h(-1);
                  if (!se.field_g) {
                    break L5;
                  } else {
                    if (this.field_f) {
                      break L5;
                    } else {
                      L6: {
                        if (!di.field_p[86]) {
                          break L6;
                        } else {
                          if (di.field_p[35]) {
                            this.a((byte) -2, this.field_n);
                            this.m(123);
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (!di.field_p[86]) {
                        break L5;
                      } else {
                        if (di.field_p[67]) {
                          var2 = this.field_P.field_v;
                          var3_int = 0;
                          L7: while (true) {
                            if ((var2.length ^ -1) >= (var3_int ^ -1)) {
                              this.m(126);
                              break L5;
                            } else {
                              L8: {
                                var4 = var2[var3_int];
                                if (this.field_n == var4) {
                                  break L8;
                                } else {
                                  this.a((byte) -66, var4);
                                  break L8;
                                }
                              }
                              var3_int++;
                              continue L7;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L9: {
                  if (!se.field_g) {
                    break L9;
                  } else {
                    if (!this.field_f) {
                      break L9;
                    } else {
                      if (null == this.field_n) {
                        break L9;
                      } else {
                        if (!di.field_p[82]) {
                          break L9;
                        } else {
                          if (!di.field_p[81]) {
                            break L9;
                          } else {
                            if ((oq.field_j ^ -1) != -17) {
                              break L9;
                            } else {
                              sm.field_e = true;
                              em.a(mq.c((byte) 73), 1);
                              this.field_s[this.field_h] = (uj) ((Object) new hi(this.field_n, this.field_P, (mn) (this)));
                              var2_ref = (mg) ((Object) this.field_P.field_p.a(true));
                              L10: while (true) {
                                if (null == var2_ref) {
                                  var3 = (qa) ((Object) this.field_P.field_q.d(0));
                                  L11: while (true) {
                                    if (null == var3) {
                                      var4_ref = (qm) ((Object) this.field_P.field_i.d(0));
                                      L12: while (true) {
                                        if (var4_ref == null) {
                                          this.e(0);
                                          this.field_s[this.field_h].b((byte) -98);
                                          this.a(this.field_n, -122);
                                          var5 = this.field_P.field_g.field_e;
                                          var6 = 0;
                                          L13: while (true) {
                                            if ((var6 ^ -1) <= (var5.length ^ -1)) {
                                              var2_ref = (mg) ((Object) this.field_P.field_p.a(true));
                                              L14: while (true) {
                                                if (var2_ref == null) {
                                                  var3 = (qa) ((Object) this.field_P.field_q.d(0));
                                                  L15: while (true) {
                                                    if (var3 == null) {
                                                      var4_ref = (qm) ((Object) this.field_P.field_i.d(0));
                                                      L16: while (true) {
                                                        if (null == var4_ref) {
                                                          this.e(0);
                                                          break L9;
                                                        } else {
                                                          this.field_ab.a(var4_ref, 32);
                                                          var4_ref = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                                                          continue L16;
                                                        }
                                                      }
                                                    } else {
                                                      this.field_o.a(var3, 32);
                                                      var3 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                                                      continue L15;
                                                    }
                                                  }
                                                } else {
                                                  this.field_v.a((byte) 9, var2_ref);
                                                  var2_ref = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              var7 = var5[var6];
                                              fl.a(var7, (byte) 96);
                                              kr.a((byte) -99, var7);
                                              var6++;
                                              continue L13;
                                            }
                                          }
                                        } else {
                                          var4_ref.field_q = null;
                                          var4_ref.field_r = null;
                                          this.field_ab.a(var4_ref, 32);
                                          var4_ref.b((byte) -71);
                                          var4_ref = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                                          continue L12;
                                        }
                                      }
                                    } else {
                                      var3.field_u.field_J = var3.field_u.field_J - var3.field_v;
                                      this.field_C[var3.field_u.field_p] = this.field_C[var3.field_u.field_p] - var3.field_v;
                                      var3.field_v = 0;
                                      var3.b((byte) -74);
                                      this.field_o.a(var3, 32);
                                      var3 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                                      continue L11;
                                    }
                                  }
                                } else {
                                  this.a(var2_ref, -var2_ref.field_z, 10755);
                                  var2_ref = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref2), "km.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_131_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gm var4 = null;
        ln[] var4_array = null;
        ln var4_ref = null;
        int var4_int = 0;
        RuntimeException var4_ref2 = null;
        int var5_int = 0;
        sf var5 = null;
        ln[] var5_array = null;
        fs var5_ref = null;
        int var6 = 0;
        ln var6_ref_ln = null;
        ln var7 = null;
        int var7_int = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_z.a(this.field_m, 0, param2, param0);
            if (this.field_b) {
              if (param1 <= -66) {
                L1: {
                  if (null == this.field_z.field_p) {
                    break L1;
                  } else {
                    if (this.field_m == 2) {
                      L2: {
                        if (this.field_z.field_p.field_R == this.field_c) {
                          break L2;
                        } else {
                          if (!this.field_P.field_o.field_i) {
                            break L1;
                          } else {
                            if (null == this.field_z.field_p.field_y) {
                              break L1;
                            } else {
                              if (this.field_c == this.field_z.field_p.field_y.field_m) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                      L3: {
                        this.field_z.e(-18641);
                        this.a(this.field_z.field_p, -83);
                        if ((this.field_x ^ -1) >= -4) {
                          var4 = qk.a(qc.field_w, 78);
                          break L3;
                        } else {
                          L4: {
                            var5_int = this.field_x - 3;
                            var6 = 96 >> (var5_int >> 1071934977);
                            if (0 == (var5_int & 1)) {
                              break L4;
                            } else {
                              var6 = 46341 * var6 >> -56733360;
                              break L4;
                            }
                          }
                          L5: {
                            if (var6 < 24) {
                              var6 = 24;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var4 = rp.a(96, qc.field_w, var6);
                          break L3;
                        }
                      }
                      L6: {
                        if (null == this.field_E) {
                          this.field_E = new sf(var4, cl.field_n);
                          break L6;
                        } else {
                          var5 = this.field_E;
                          L7: while (true) {
                            if (null == var5.field_b) {
                              var5.field_b = new sf(var4, cl.field_n);
                              break L6;
                            } else {
                              var5 = var5.field_b;
                              continue L7;
                            }
                          }
                        }
                      }
                      this.field_x = this.field_x + 1;
                      this.a(2);
                      break L1;
                    } else {
                      if (-1 == (this.field_m ^ -1)) {
                        if (this.field_n != this.field_z.field_p.field_y) {
                          break L1;
                        } else {
                          if (this.field_n == null) {
                            break L1;
                          } else {
                            if (0 < this.field_z.field_p.field_J) {
                              this.field_K = this.field_z.field_p;
                              qk.a(us.field_d, 74);
                              this.field_Y.a(-107, 1);
                              this.field_z.field_z[this.field_K.field_p] = 1;
                              var4_array = this.field_K.field_D;
                              var5_int = 0;
                              L8: while (true) {
                                if ((var5_int ^ -1) <= (var4_array.length ^ -1)) {
                                  var4_ref = this.field_K.field_R.j(18229);
                                  L9: while (true) {
                                    if (null == var4_ref) {
                                      break L1;
                                    } else {
                                      L10: {
                                        if (var4_ref == this.field_K) {
                                          break L10;
                                        } else {
                                          if (this.field_P.a(this.field_K, var4_ref, -1)) {
                                            this.field_z.field_z[var4_ref.field_p] = 2;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var4_ref = this.field_K.field_R.h(-23410);
                                      continue L9;
                                    }
                                  }
                                } else {
                                  var6_ref_ln = var4_array[var5_int];
                                  this.field_z.field_z[var6_ref_ln.field_p] = 2;
                                  var5_int++;
                                  continue L8;
                                }
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                      } else {
                        if ((this.field_m ^ -1) != -2) {
                          if (-4 == (this.field_m ^ -1)) {
                            if (this.field_z.field_p.field_y != this.field_n) {
                              break L1;
                            } else {
                              if (this.field_z.field_p.field_u) {
                                break L1;
                              } else {
                                this.field_z.e(-18641);
                                this.a(2);
                                this.a(0, this.field_z.field_p, 0);
                                this.field_Y.a(-119, 0);
                                this.field_Y.b(0, 2);
                                break L1;
                              }
                            }
                          } else {
                            if (this.field_m != 4) {
                              if (5 == this.field_m) {
                                L11: {
                                  if (this.field_n != this.field_z.field_p.field_y) {
                                    stackIn_131_0 = 0;
                                    break L11;
                                  } else {
                                    stackIn_131_0 = 1;
                                    break L11;
                                  }
                                }
                                var4_int = stackIn_131_0;
                                var5_array = this.field_z.field_p.field_D;
                                var6 = 0;
                                L12: while (true) {
                                  if ((var6 ^ -1) <= (var5_array.length ^ -1)) {
                                    L13: {
                                      var5_ref = this.field_z.field_p.field_y;
                                      if (var4_int == 0) {
                                        break L13;
                                      } else {
                                        if (this.field_n == var5_ref) {
                                          break L13;
                                        } else {
                                          L14: {
                                            if (null == var5_ref) {
                                              break L14;
                                            } else {
                                              if (this.field_n.field_h[var5_ref.field_x]) {
                                                break L13;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          this.field_z.e(-18641);
                                          this.a(2);
                                          this.a(2, this.field_z.field_p, 0);
                                          this.field_Y.a(-81, 0);
                                          this.field_Y.b(2, 2);
                                          break L13;
                                        }
                                      }
                                    }
                                    break L1;
                                  } else {
                                    L15: {
                                      var7 = var5_array[var6];
                                      if (var7.field_y == this.field_n) {
                                        var4_int = 1;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    var6++;
                                    continue L12;
                                  }
                                }
                              } else {
                                if (this.field_m == 6) {
                                  if (this.field_z.field_p.field_y == this.field_n) {
                                    this.field_z.e(-18641);
                                    this.a(2);
                                    this.field_K = this.field_z.field_p;
                                    this.field_Y.a(-84, 7);
                                    var4_array = this.field_P.field_g.field_e;
                                    var5_int = 0;
                                    L16: while (true) {
                                      if (var5_int >= var4_array.length) {
                                        break L1;
                                      } else {
                                        L17: {
                                          var6_ref_ln = var4_array[var5_int];
                                          if (this.field_z.field_p.b(var6_ref_ln, (byte) 10)) {
                                            break L17;
                                          } else {
                                            if (this.field_z.field_p != var6_ref_ln) {
                                              this.field_z.field_z[var6_ref_ln.field_p] = 2;
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        var5_int++;
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (7 == this.field_m) {
                                    if (this.field_K.b(this.field_z.field_p, (byte) 10)) {
                                      break L1;
                                    } else {
                                      if (this.field_K == this.field_z.field_p) {
                                        break L1;
                                      } else {
                                        this.field_z.e(-18641);
                                        this.a(2);
                                        this.a(41, this.field_z.field_p, this.field_K, 3);
                                        this.field_Y.a(-117, 0);
                                        this.field_Y.b(3, 2);
                                        break L1;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              if (this.field_z.field_p.field_y != this.field_n) {
                                break L1;
                              } else {
                                if ((this.field_z.field_p.field_L ^ -1) != -1) {
                                  break L1;
                                } else {
                                  this.field_z.e(-18641);
                                  this.a(2);
                                  this.a(1, this.field_z.field_p, 0);
                                  this.field_Y.a(-122, 0);
                                  this.field_Y.b(1, 2);
                                  break L1;
                                }
                              }
                            }
                          }
                        } else {
                          L18: {
                            L19: {
                              if (this.field_K.b(this.field_z.field_p, (byte) 10)) {
                                break L19;
                              } else {
                                if (this.field_K == this.field_z.field_p) {
                                  break L18;
                                } else {
                                  if (this.field_K.field_R != this.field_z.field_p.field_R) {
                                    break L18;
                                  } else {
                                    if (this.field_P.a(this.field_K, this.field_z.field_p, -1)) {
                                      break L19;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                            L20: {
                              this.field_z.e(-18641);
                              var4_int = -this.field_K.field_N + this.field_K.field_J;
                              if (0 < var4_int) {
                                stackIn_33_0 = (1 + var4_int) / 2;
                                break L20;
                              } else {
                                stackIn_33_0 = 1;
                                break L20;
                              }
                            }
                            L21: {
                              var5_int = stackIn_33_0;
                              var6 = this.a((byte) 105);
                              if ((var6 ^ -1) != -82) {
                                if ((var6 ^ -1) == -87) {
                                  var5_int = 5;
                                  break L21;
                                } else {
                                  if (82 == var6) {
                                    L22: {
                                      if ((var4_int ^ -1) < -1) {
                                        stackIn_47_0 = var4_int;
                                        break L22;
                                      } else {
                                        stackIn_47_0 = this.field_K.field_J;
                                        break L22;
                                      }
                                    }
                                    var5_int = stackIn_47_0;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                              } else {
                                var5_int = 1;
                                break L21;
                              }
                            }
                            L23: {
                              if (!this.field_P.field_o.field_e) {
                                stackIn_53_0 = this.field_K.field_N;
                                break L23;
                              } else {
                                stackIn_53_0 = 0;
                                break L23;
                              }
                            }
                            L24: {
                              var7_int = stackIn_53_0;
                              if (var5_int > this.field_K.field_J - var7_int) {
                                var5_int = this.field_K.field_J + -var7_int;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            L25: {
                              if (var5_int <= 0) {
                                break L25;
                              } else {
                                L26: {
                                  this.a(false, var5_int, this.field_z.field_p, this.field_K);
                                  if (this.field_n == this.field_z.field_p.field_y) {
                                    break L26;
                                  } else {
                                    L27: {
                                      if (null != this.field_z.field_p.field_y) {
                                        break L27;
                                      } else {
                                        if (this.field_z.field_p.field_x == 0) {
                                          break L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    qk.a(jj.field_l, 78);
                                    break L25;
                                  }
                                }
                                qk.a(hs.field_l, 89);
                                break L25;
                              }
                            }
                            this.a(2);
                            break L18;
                          }
                          this.field_Y.a(-125, 0);
                          break L1;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4_ref2), "km.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void d(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        fs[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fs var4 = null;
        sd var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.b(false);
              if (!this.field_W) {
                break L1;
              } else {
                if (0 != this.field_P.field_O) {
                  break L1;
                } else {
                  if (!this.field_P.field_o.field_i) {
                    var2 = this.field_P.field_v;
                    var3 = 0;
                    L2: while (true) {
                      if ((var2.length ^ -1) >= (var3 ^ -1)) {
                        break L1;
                      } else {
                        var4 = var2[var3];
                        var5 = (sd) ((Object) var4.field_i.d(0));
                        L3: while (true) {
                          if (null == var5) {
                            var3++;
                            continue L2;
                          } else {
                            var5.field_x = 0;
                            var5 = (sd) ((Object) var4.field_i.a((byte) -71));
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var2 = this.field_P.field_v;
                    var3 = 0;
                    L4: while (true) {
                      if ((var3 ^ -1) <= (var2.length ^ -1)) {
                        break L1;
                      } else {
                        var4 = var2[var3];
                        var4.field_m.field_x = 0;
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              fieldTemp$0 = this.field_h + 1;
              this.field_h = this.field_h + 1;
              if (fieldTemp$0 != this.field_P.field_v.length) {
                break L5;
              } else {
                this.field_n = this.field_P.field_v[0];
                this.field_h = 0;
                this.field_P.c(0);
                this.b(lr.a((byte) 27), 79);
                this.field_z.field_d = lr.a((byte) 27);
                this.field_P.c((byte) 119);
                var2_int = 0;
                L6: while (true) {
                  if (this.field_P.field_r <= var2_int) {
                    break L5;
                  } else {
                    L7: {
                      if (null == this.field_s[var2_int]) {
                        break L7;
                      } else {
                        this.field_s[var2_int].a((byte) -63);
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L6;
                  }
                }
              }
            }
            L8: {
              if (param0 == -81) {
                break L8;
              } else {
                this.a(false, 84, (ln) null, (ln) null);
                break L8;
              }
            }
            this.field_n = this.field_P.field_v[this.field_h];
            this.field_S = mb.field_o[this.field_P.field_J];
            this.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.TA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        qm var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = (qm) ((Object) this.field_P.field_i.d(0));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  stackIn_15_0 = param1;
                  stackIn_15_1 = 24;
                  break L2;
                } else {
                  stackIn_15_0 = var3.field_o ^ -1;

                  stackIn_15_1 = param0 ^ -1;

                  L3: {
                    if (stackIn_15_0 == stackIn_15_1) {
                      L4: {
                        var3.field_r = null;
                        var3.field_q = null;
                        if (this.field_f) {
                          this.field_ab.a(var3, 32);
                          this.e(0);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3.b((byte) -117);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                  continue L1;
                }
              }
              L5: {
                if (stackIn_15_0 == stackIn_15_1) {
                  break L5;
                } else {
                  this.field_f = true;
                  break L5;
                }
              }
              this.field_Y.c(param0, 127);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref), "km.BB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void h(int param0) {
        try {
            field_e = null;
            field_u = null;
            field_a = null;
            field_X = null;
            field_A = null;
            if (param0 != 11) {
                km.h(24);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "km.JA(" + param0 + ')');
        }
    }

    final void b(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        tr stackIn_13_0 = null;
        tr stackIn_14_0 = null;
        pf stackIn_14_1 = null;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException decompiledCaughtException = null;
        sl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  if (ol.a(-114)) {
                    break L2;
                  } else {
                    this.j(50);
                    break L1;
                  }
                }
              }
              this.field_Y.a(false, (byte) 110);
              break L1;
            }
            L3: {
              this.field_Y.h((byte) 122);
              stackIn_13_0 = this.field_z;

              if (null == this.field_Q) {
                stackIn_14_0 = (tr) ((Object) stackIn_13_0);
                stackIn_14_1 = null;
                break L3;
              } else {
                stackIn_14_0 = (tr) ((Object) stackIn_13_0);
                stackIn_14_1 = this.field_Q.field_a;
                break L3;
              }
            }
            ((tr) (Object) stackIn_14_0).a(stackIn_14_1, 66);
            L4: while (true) {
              L5: {
                L6: {
                  if (null == this.field_E) {
                    break L6;
                  } else {
                    stackIn_24_0 = cl.field_n + -this.field_E.field_c;

                    stackIn_24_1 = 50;

                    if (stackIn_24_0 < stackIn_24_1) {
                      break L6;
                    } else {
                      this.field_x = this.field_x - 1;
                      this.field_E = this.field_E.field_b;
                      continue L4;
                    }
                  }
                }
                stackIn_24_0 = param1 ? 1 : 0;
                stackIn_24_1 = 1;
                break L5;
              }
              L7: {
                if (stackIn_24_0 == stackIn_24_1) {
                  break L7;
                } else {
                  field_X = (String) null;
                  break L7;
                }
              }
              L8: {
                if (this.field_f) {
                  L9: {
                    if (1 < this.field_S) {
                      fieldTemp$0 = this.field_S - 1;
                      this.field_S = this.field_S - 1;
                      if (fieldTemp$0 != 1) {
                        break L9;
                      } else {
                        if (this.field_L) {
                          break L9;
                        } else {
                          if (this.field_b) {
                            this.m(123);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  if (-1 != (this.field_S % 200 ^ -1)) {
                    break L8;
                  } else {
                    if (!this.field_L) {
                      break L8;
                    } else {
                      var3 = js.field_f;
                      var3.h(61, 255);
                      var3.c(this.field_P.field_O, (byte) -110);
                      var3.e(11135, this.f(109));
                      break L8;
                    }
                  }
                } else {
                  this.field_S = this.field_S - 1;
                  break L8;
                }
              }
              L10: {
                if (!this.field_f) {
                  break L10;
                } else {
                  if (!this.field_b) {
                    break L10;
                  } else {
                    if ((this.field_k ^ -1) == 0) {
                      break L10;
                    } else {
                      L11: {
                        fieldTemp$1 = this.field_k - 1;
                        this.field_k = this.field_k - 1;
                        if (0 == (fieldTemp$1 ^ -1)) {
                          break L11;
                        } else {
                          fieldTemp$2 = this.field_g - 1;
                          this.field_g = this.field_g - 1;
                          if (-1 < (fieldTemp$2 ^ -1)) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      this.l(-106);
                      break L10;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref), "km.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(fs param0, int param1, fs param2) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_n != param0) {
                if (param2 != this.field_n) {
                  var4 = re.a(lh.field_A, 4371, new String[]{param0.field_t, param2.field_t});
                  this.field_H.a(new n(param2, param0, var4), 0);
                  break L1;
                } else {
                  var4 = re.a(se.field_c, 4371, new String[]{param0.field_t});
                  this.field_H.a(new n(param2, param0, var4), 0);
                  break L1;
                }
              } else {
                var4 = re.a(jb.field_a, 4371, new String[]{param2.field_t});
                this.field_H.a(new n(param0, param2, var4), 0);
                break L1;
              }
            }
            L2: {
              if (!this.field_W) {
                break L2;
              } else {
                fl.a(0, "signtreaty");
                break L2;
              }
            }
            L3: {
              this.a(this.field_n, param1 + 27510);
              if (null != this.field_s[param0.field_x]) {
                this.field_s[param0.field_x].a(param2, (byte) -42);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 == -27584) {
                break L4;
              } else {
                this.field_J = (int[]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4_ref);

            stackIn_22_1 = new StringBuilder().append("km.I(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), stackIn_27_2 + ')');
        }
    }

    private final void b(boolean param0) {
        int fieldTemp$0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        n var2 = null;
        RuntimeException var2_ref = null;
        qm var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2 = (n) ((Object) this.field_H.d(0));
            if (!param0) {
              L1: while (true) {
                if (var2 == null) {
                  L2: {
                    if (this.field_W) {
                      var3 = (qm) ((Object) this.field_P.field_i.d(0));
                      L3: while (true) {
                        if (var3 == null) {
                          break L2;
                        } else {
                          L4: {
                            var4 = var3.field_o;
                            if (-1 == (var4 ^ -1)) {
                              fl.a(0, "defensivenet");
                              break L4;
                            } else {
                              if ((var4 ^ -1) == -2) {
                                fl.a(0, "terraforming");
                                break L4;
                              } else {
                                if (-3 == (var4 ^ -1)) {
                                  fl.a(0, "stellarbomb");
                                  break L4;
                                } else {
                                  if ((var4 ^ -1) != -4) {
                                    break L4;
                                  } else {
                                    fl.a(0, "tannhauser");
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                          var3 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L5: {
                    fieldTemp$0 = var2.field_i + 1;
                    var2.field_i = var2.field_i + 1;
                    if (-3 != (fieldTemp$0 ^ -1)) {
                      break L5;
                    } else {
                      var2.b((byte) -85);
                      break L5;
                    }
                  }
                  var2 = (n) ((Object) this.field_H.a((byte) -71));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.DA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0) {
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        ln[] var2 = null;
        int var2_int = 0;
        Exception var2_ref = null;
        mg var2_ref2 = null;
        RuntimeException var2_ref3 = null;
        int var3_int = 0;
        qa var3 = null;
        qm var4 = null;
        ln var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            System.gc();
            this.field_P.field_x.a((byte) -70, this.field_P, this.field_Y);
            var2 = this.field_P.field_g.field_e;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= var2.length) {
                L2: {
                  L3: {
                    if (null == this.field_R) {
                      break L3;
                    } else {
                      if (this.field_P.field_g.field_e.length > this.field_R.length) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = this.field_P.field_g.field_e.length;
                  this.field_C = new int[var2_int];
                  this.field_R = new fs[var2_int];
                  this.field_l = new sd[var2_int];
                  break L2;
                }
                var2 = this.field_P.field_g.field_e;
                var3_int = 0;
                L4: while (true) {
                  if ((var2.length ^ -1) >= (var3_int ^ -1)) {
                    L5: {
                      this.field_z.a(this.field_C, param0, this.field_l, this.field_R, false);
                      this.field_z.a(this.field_p, this.field_t, this.field_U, this.field_V, this.field_w, this.field_d, this.field_r, this.field_J, 0);
                      this.field_z.d(0);
                      this.a(this.field_n, -83);
                      if (this.field_f) {
                        break L5;
                      } else {
                        if (null == this.field_s[this.field_h]) {
                          break L5;
                        } else {
                          try {
                            L6: {
                              this.field_s[this.field_h].b((byte) -91);
                              break L6;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L7: {
                              var2_ref = (Exception) (Object) decompiledCaughtException;
                              jq.a(-29901, (Throwable) ((Object) var2_ref), "AI has errored in single player game");
                              break L7;
                            }
                          }
                          this.a(this.field_n, -84);
                          this.d((byte) -81);
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    L8: {
                      if (!sm.field_e) {
                        break L8;
                      } else {
                        if (!this.field_j) {
                          if (!this.field_b) {
                            break L8;
                          } else {
                            this.field_s[this.field_h].a((byte) -63);
                            this.field_s[this.field_h].b((byte) -15);
                            this.a(this.field_n, -70);
                            var2 = this.field_P.field_g.field_e;
                            var3_int = 0;
                            L9: while (true) {
                              if ((var3_int ^ -1) <= (var2.length ^ -1)) {
                                var2_ref2 = (mg) ((Object) this.field_P.field_p.a(true));
                                L10: while (true) {
                                  if (var2_ref2 == null) {
                                    var3 = (qa) ((Object) this.field_P.field_q.d(0));
                                    L11: while (true) {
                                      if (var3 == null) {
                                        var4 = (qm) ((Object) this.field_P.field_i.d(0));
                                        L12: while (true) {
                                          if (null == var4) {
                                            this.e(0);
                                            break L8;
                                          } else {
                                            this.field_ab.a(var4, 32);
                                            var4 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        this.field_o.a(var3, 32);
                                        var3 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    this.field_v.a((byte) 9, var2_ref2);
                                    var2_ref2 = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                                    continue L10;
                                  }
                                }
                              } else {
                                var4_ref = var2[var3_int];
                                fl.a(var4_ref, (byte) 73);
                                kr.a((byte) 65, var4_ref);
                                var3_int++;
                                continue L9;
                              }
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    this.field_z.a(false);
                    this.field_Y.n(106);
                    this.field_Y.a(-73, 0);
                    this.field_N = 0;
                    var2_int = 0;
                    L13: while (true) {
                      L14: {
                        L15: {
                          if (var2_int >= this.field_P.field_r) {
                            L16: {
                              if (this.field_P.field_z) {
                                break L16;
                              } else {
                                if (this.field_n == null) {
                                  break L14;
                                } else {
                                  if ((1 << this.field_h & this.field_P.field_w ^ -1) == -1) {
                                    break L14;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            stackIn_79_0 = 0;
                            stackIn_79_1 = -1;
                            break L15;
                          } else {
                            stackIn_79_0 = 1 << var2_int & this.field_P.field_w ^ -1;

                            stackIn_79_1 = -1;

                            L17: {
                              if (stackIn_79_0 != stackIn_79_1) {
                                break L17;
                              } else {
                                this.field_N = this.field_N + 1;
                                break L17;
                              }
                            }
                            var2_int++;
                            continue L13;
                          }
                        }
                        L18: {
                          L19: {
                            L20: {
                              ta.a(stackIn_79_0, stackIn_79_1, (byte) 96, false);
                              this.field_b = false;
                              this.field_Y.o(-4956);
                              if (this.field_n == null) {
                                break L20;
                              } else {
                                if ((1 << this.field_h & this.field_P.field_w) != 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            if (this.field_P.field_x.a((byte) -123, this.field_n)) {
                              break L19;
                            } else {
                              if (this.field_P.field_z) {
                                jo.a(32767, hj.field_n, false, 10);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                          }
                          jo.a(32767, wh.field_b, false, 10);
                          break L18;
                        }
                        if (!sm.field_e) {
                          break L14;
                        } else {
                          if ((this.field_P.field_e & 1 << this.field_h) != 0) {
                            break L14;
                          } else {
                            this.b(-118);
                            break L14;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    var4_ref = var2[var3_int];
                    var5 = var4_ref.field_p;
                    this.field_R[var5] = var4_ref.field_y;
                    this.field_C[var5] = var4_ref.field_x;
                    this.field_l[var5] = var4_ref.field_R;
                    var3_int++;
                    continue L4;
                  }
                }
              } else {
                L21: {
                  var4_ref = var2[var3_int];
                  var4_ref.field_J = var4_ref.field_x;
                  if (var4_ref.field_y != this.field_n) {
                    this.field_w[var4_ref.field_p] = false;
                    this.field_V[var4_ref.field_p] = false;
                    this.field_p[var4_ref.field_p] = 0;
                    this.field_J[var4_ref.field_p] = 0;
                    break L21;
                  } else {
                    this.field_p[var4_ref.field_p] = var4_ref.field_x;
                    this.field_J[var4_ref.field_p] = var4_ref.field_x;
                    break L21;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref3 = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref3), "km.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        Object stackIn_5_0;
        Object stackIn_6_0;
        tr stackIn_6_1;
        tr stackIn_6_2;
        l stackIn_6_3;
        fs[] stackIn_6_4;
        fs stackIn_6_5;
        boolean stackIn_6_6;
        Object stackIn_7_0 = null;
        tr stackIn_7_1 = null;
        tr stackIn_7_2 = null;
        l stackIn_7_3 = null;
        fs[] stackIn_7_4 = null;
        fs stackIn_7_5 = null;
        boolean stackIn_7_6 = false;
        int stackIn_7_7 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_47_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_39_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3_ref_String = null;
        fs[] var3_ref_fs__ = null;
        int var3 = 0;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                stackIn_6_0 = this;

                stackIn_6_1 = null;

                stackIn_6_2 = null;

                stackIn_6_3 = this.field_P.field_g;

                stackIn_6_4 = this.field_P.field_v;

                stackIn_6_5 = this.field_n;

                stackIn_6_6 = this.field_W;

                if (this.field_P.field_o.field_k) {
                  break L2;
                } else {
                  stackIn_6_0 = this;

                  stackIn_6_1 = null;

                  stackIn_6_2 = null;

                  stackIn_6_3 = (l) ((Object) stackIn_6_3);

                  stackIn_6_4 = (fs[]) ((Object) stackIn_6_4);

                  stackIn_6_5 = (fs) ((Object) stackIn_6_5);

                  if (this.field_P.field_o.field_l) {
                    break L2;
                  } else {
                    stackIn_5_0 = this;






                    stackIn_7_0 = this;
                    stackIn_7_1 = null;
                    stackIn_7_2 = null;
                    stackIn_7_3 = (l) ((Object) stackIn_6_3);
                    stackIn_7_4 = (fs[]) ((Object) stackIn_6_4);
                    stackIn_7_5 = (fs) ((Object) stackIn_6_5);
                    stackIn_7_6 = stackIn_6_6;
                    stackIn_7_7 = 1;
                    break L1;
                  }
                }
              }
              stackIn_7_0 = this;
              stackIn_7_1 = null;
              stackIn_7_2 = null;
              stackIn_7_3 = (l) ((Object) stackIn_6_3);
              stackIn_7_4 = (fs[]) ((Object) stackIn_6_4);
              stackIn_7_5 = (fs) ((Object) stackIn_6_5);
              stackIn_7_6 = stackIn_6_6;
              stackIn_7_7 = 0;
              break L1;
            }
            L3: {
              ((km) (this)).field_z = new tr(stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7 != 0);
              this.field_z.field_C = true;
              if (this.field_Y == null) {
                this.field_Y = new kq((km) (this));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              this.field_z.a(this.field_Y, param0 + 205);
              if (this.field_f) {
                break L4;
              } else {
                if (!this.field_W) {
                  var2_int = 0;
                  L5: while (true) {
                    if (var2_int >= this.field_P.field_r) {
                      break L4;
                    } else {
                      L6: {
                        if (null == this.field_s[var2_int]) {
                          break L6;
                        } else {
                          this.field_s[var2_int].a(param0 + 7);
                          if (se.field_g) {
                            var3_ref_String = "My personality is " + wk.field_a[this.field_s[var2_int].a(false)];
                            this.a(this.field_P.field_v[var2_int], var3_ref_String, (byte) 51);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var2_int++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L7: {
              var2_int = this.field_P.field_g.field_e.length;
              this.field_J = new int[var2_int];
              this.field_w = new boolean[var2_int];
              this.field_r = new int[var2_int];
              this.field_p = new int[var2_int];
              this.field_d = new int[var2_int];
              this.field_V = new boolean[var2_int];
              this.field_t = new int[var2_int];
              this.field_U = new int[var2_int];
              this.field_P.b(-99);
              this.field_z.a(this.field_p, this.field_t, this.field_U, this.field_V, this.field_w, this.field_d, this.field_r, this.field_J, 0);
              if (this.field_h >= 0) {
                break L7;
              } else {
                sm.field_e = false;
                break L7;
              }
            }
            if (param0 == -81) {
              L8: {
                if (sm.field_e) {
                  this.field_s[this.field_h] = (uj) ((Object) new hi(this.field_n, this.field_P, (mn) (this)));
                  break L8;
                } else {
                  break L8;
                }
              }
              var3_ref_fs__ = this.field_P.field_v;
              var4 = 0;
              L9: while (true) {
                L10: {
                  if (var4 >= var3_ref_fs__.length) {
                    this.field_z.b(false);
                    this.a(true);
                    stackIn_47_0 = 0;
                    break L10;
                  } else {
                    var5 = var3_ref_fs__[var4];
                    stackOut_39_0 = var5.field_i.g(-124);
                    stackIn_47_0 = stackOut_39_0 ? 1 : 0;
                    stackIn_40_0 = stackOut_39_0;
                    L11: {
                      if (!stackIn_40_0) {
                        break L11;
                      } else {
                        this.field_P.field_w = this.field_P.field_w | 1 << var5.field_x;
                        break L11;
                      }
                    }
                    var4++;
                    continue L9;
                  }
                }
                var3 = stackIn_47_0;
                L12: while (true) {
                  if ((this.field_P.field_r ^ -1) >= (var3 ^ -1)) {
                    L13: {
                      L14: {
                        this.a(param0 + 83);
                        if (null == this.field_n) {
                          break L14;
                        } else {
                          if (this.field_n.field_i.g(param0 ^ 27)) {
                            break L14;
                          } else {
                            if (!sm.field_e) {
                              this.field_z.a((sd) ((Object) this.field_n.field_i.d(0)), param0 ^ -82);
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      this.field_z.field_I = this.field_z.field_F;
                      break L13;
                    }
                    this.field_z.a(false);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L15: {
                      if (null != this.field_s[var3]) {
                        this.field_s[var3].a((byte) -63);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var3++;
                    continue L12;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void i(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = js.field_f;
              var2.h(60, 255);
              var2.field_j = var2.field_j + 2;
              var3 = var2.field_j;
              var2.c(this.field_P.field_O, (byte) -73);
              if (param0 < -114) {
                break L1;
              } else {
                this.field_Q = (k) null;
                break L1;
              }
            }
            L2: {
              se.a(fp.a(this.field_P.field_q, -71), -256, fp.a(this.field_P.field_i, -88), eh.a(25, this.field_P.field_p), var2);
              this.field_ab.b((byte) 108);
              this.field_o.b((byte) 127);
              this.field_v.a((byte) 112);
              var2.f(-549342136, -var3 + var2.field_j);
              this.field_k = -1;
              this.field_g = -1;
              if (!this.field_L) {
                break L2;
              } else {
                var2.h(61, 255);
                var2.c(this.field_P.field_O, (byte) -74);
                var2.e(11135, this.f(-78));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.CA(" + param0 + ')');
        }
    }

    private final void a(ln param0, int param1) {
        int stackIn_12_0 = 0;
        boolean stackIn_55_0 = false;
        ln stackIn_62_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        qa var5 = null;
        ln var6 = null;
        sd var6_ref = null;
        ln var7 = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              var4 = this.a((byte) 82);
              if (param1 != (var4 ^ -1)) {
                if (-87 == (var4 ^ -1)) {
                  L2: {
                    if (5 >= this.field_c.field_x) {
                      stackIn_12_0 = this.field_c.field_x;
                      break L2;
                    } else {
                      stackIn_12_0 = 5;
                      break L2;
                    }
                  }
                  var3_int = stackIn_12_0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int = this.field_c.field_x;
                break L1;
              }
            }
            param0.field_J = param0.field_J + var3_int;
            this.field_C[param0.field_p] = this.field_C[param0.field_p] + var3_int;
            this.field_p[param0.field_p] = this.field_p[param0.field_p] + var3_int;
            this.field_J[param0.field_p] = this.field_J[param0.field_p] + var3_int;
            var5 = (qa) ((Object) this.field_P.field_q.d(0));
            L3: while (true) {
              L4: {
                if (null == var5) {
                  break L4;
                } else {
                  if (param0 == var5.field_u) {
                    break L4;
                  } else {
                    var5 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == var5) {
                  var5 = new qa(param0, 0);
                  this.field_P.field_q.a((byte) -113, var5);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var5.field_v = var5.field_v + var3_int;
                if (this.field_f) {
                  this.field_o.a(var5, 32);
                  this.e(0);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                this.field_c.field_x = this.field_c.field_x - var3_int;
                this.field_Y.e((byte) 43);
                if ((this.field_c.field_x ^ -1) < -1) {
                  this.field_Y.a(-73, 2);
                  stackIn_62_0 = this.field_c.j(18229);
                  var6 = stackIn_62_0;
                  L8: while (true) {
                    if (null == var6) {
                      break L7;
                    } else {
                      this.field_z.field_z[var6.field_p] = 2;
                      var6 = this.field_c.h(-23410);
                      continue L8;
                    }
                  }
                } else {
                  L9: {
                    if (null == this.field_n) {
                      break L9;
                    } else {
                      if (!this.field_P.field_o.field_i) {
                        var6_ref = (sd) ((Object) this.field_n.field_i.d(param1 + 83));
                        L10: while (true) {
                          L11: {
                            if (var6_ref == null) {
                              break L11;
                            } else {
                              if (-1 == (var6_ref.field_x ^ -1)) {
                                var6_ref = (sd) ((Object) this.field_n.field_i.a((byte) -71));
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (null == var6_ref) {
                              stackIn_55_0 = this.field_W;
                              L13: {
                                if (stackIn_55_0) {
                                  fl.a(0, "buildships");
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              this.field_Y.a(-86, 0);
                              break L12;
                            } else {
                              this.field_c = var6_ref;
                              this.field_Y.a(-102, 2);
                              var7 = var6_ref.j(18229);
                              L14: while (true) {
                                if (null == var7) {
                                  break L12;
                                } else {
                                  this.field_z.field_z[var7.field_p] = 2;
                                  var7 = var6_ref.h(param1 + -23327);
                                  continue L14;
                                }
                              }
                            }
                          }
                          break L7;
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_Y.a(param1 + -4, 0);
                  break L7;
                }
              }
              this.a(this.field_n, param1 ^ 2);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var3);

            stackIn_72_1 = new StringBuilder().append("km.S(");

            if (param0 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L15;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L15;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ')');
        }
    }

    private final int[] c(byte param0) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int[] stackIn_36_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        ln[] var3 = null;
        fs[] var3_array = null;
        int var4 = 0;
        ln var5 = null;
        fs var5_ref = null;
        int var6 = 0;
        sd var7 = null;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new int[this.field_P.field_r];
                        var3 = this.field_P.field_g.field_e;
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4 ^ -1) <= (var3.length ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = var3[var4];
                        if (null != var5.field_y) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2[var5.field_y.field_x] = var2[var5.field_y.field_x] + var5.field_x;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 == 44) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.a((fs) null, (String) null, (byte) -53);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3_array = this.field_P.field_v;
                        var4 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = var3_array.length ^ -1;
                        stackIn_15_1 = var4 ^ -1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 >= stackIn_15_1) {
                            statePc = 35;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5_ref = var3_array[var4];
                        var6 = var5_ref.field_x;
                        if (this.field_P.field_o.field_i) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = (sd) ((Object) var5_ref.field_i.d(param0 ^ 44));
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var7 == null) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_15_0 = 0;
                        stackIn_20_0 = stackIn_15_0;
                        stackIn_15_1 = var7.field_r;
                        stackIn_20_1 = stackIn_15_1;
                        if (false) {
                            statePc = 15;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 < stackIn_20_1) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var2[var6] = var2[var6] + var7.field_r;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = (sd) ((Object) var5_ref.field_i.a((byte) -71));
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (null != var5_ref.field_m) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var5_ref.field_m.field_r > 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var2[var6] = var2[var6] + var5_ref.field_m.field_r;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = (int[]) (var2);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0;
                }
                case 37: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw r.a((Throwable) ((Object) var2_ref), "km.UA(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(fs param0, byte param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (0 == ((1 << param0.field_x | 1 << this.field_h) & this.field_P.field_w)) {
              L1: {
                if (param1 > 44) {
                  break L1;
                } else {
                  this.a((ob) null, -6, 94);
                  break L1;
                }
              }
              if (param0 == this.field_n) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((1 << param0.field_x & this.field_n.field_w ^ -1) != -1) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    this.field_n.field_w = this.field_n.field_w | 1 << param0.field_x;
                    param0.field_A = param0.field_A | 1 << this.field_n.field_x;
                    if (!this.field_f) {
                      if ((1 << param0.field_x & this.field_n.field_A) != 0) {
                        this.field_n.field_f[param0.field_x] = 3;
                        this.field_n.field_h[param0.field_x] = true;
                        param0.field_f[this.field_n.field_x] = 3;
                        param0.field_h[this.field_n.field_x] = true;
                        this.field_n.field_A = this.field_n.field_A & (1 << param0.field_x ^ -1);
                        this.field_n.field_w = this.field_n.field_w & (1 << param0.field_x ^ -1);
                        param0.field_A = param0.field_A & (1 << this.field_n.field_x ^ -1);
                        param0.field_w = param0.field_w & (1 << this.field_n.field_x ^ -1);
                        this.a(param0, -27584, this.field_n);
                        if (this.field_W) {
                          fl.a(0, "signtreaty");
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        this.a(this.field_n, param0, true);
                        break L2;
                      }
                    } else {
                      L3: {
                        var3 = js.field_f;
                        var3.h(59, 255);
                        var3.field_j = var3.field_j + 2;
                        var4 = var3.field_j;
                        var3.c(this.field_P.field_O, (byte) -106);
                        var3.c(255, (byte) -78);
                        var3.c(this.field_n.field_x, (byte) -126);
                        var3.c(param0.field_x, (byte) -104);
                        var3.f(-549342136, -var4 + var3.field_j);
                        if ((this.field_n.field_A & 1 << param0.field_x) != 0) {
                          break L3;
                        } else {
                          this.a(this.field_n, param0, true);
                          break L3;
                        }
                      }
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3_ref);

            stackIn_34_1 = new StringBuilder().append("km.EA(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L4;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    km(boolean param0, boolean param1, int param2, vr param3, int param4, String[] param5, int param6, boolean param7, kq param8) {
        fs stackIn_20_0 = null;
        fs stackIn_21_0 = null;
        String stackIn_21_1 = null;
        boolean stackIn_25_0 = false;
        int stackIn_32_0 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        StringBuilder stackIn_88_1 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_92_1 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_24_0;
        int var10_int = 0;
        fs[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        fs var12 = null;
        int var13 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_F = 25;
        this.field_T = false;
        this.field_I = this.field_F;
        this.field_y = false;
        try {
          L0: {
            L1: {
              this.field_f = param0;
              this.field_h = param6;
              this.field_W = param1;
              this.field_M = param7;
              if (this.field_f) {
                this.field_P = uq.a(param4, param2, -27579, param5, param3);
                break L1;
              } else {
                if (!this.field_W) {
                  this.field_P = qr.a(param2, 50, param5, param3, param4, 2);
                  break L1;
                } else {
                  this.field_P = jg.a(param3, param5, param2, -22379, 4);
                  ob.a(-126, (km) (this));
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (this.field_f) {
                  var10_int = 0;
                  L4: while (true) {
                    if (var10_int >= this.field_P.field_r) {
                      break L3;
                    } else {
                      stackOut_24_0 = param5[var10_int].equals("bot_sp");
                      stackIn_32_0 = stackOut_24_0 ? 1 : 0;
                      stackIn_25_0 = stackOut_24_0;
                      L5: {
                        if (!stackIn_25_0) {
                          break L5;
                        } else {
                          this.field_P.field_v[var10_int].field_t = hn.field_f[var10_int];
                          break L5;
                        }
                      }
                      var10_int++;
                      continue L4;
                    }
                  }
                } else {
                  var10_int = 1;
                  L6: while (true) {
                    if (this.field_P.field_r <= var10_int) {
                      L7: {
                        stackIn_20_0 = this.field_P.field_v[0];

                        if (w.d(true)) {
                          stackIn_21_0 = (fs) ((Object) stackIn_20_0);
                          stackIn_21_1 = hn.field_f[0];
                          break L7;
                        } else {
                          stackIn_21_0 = (fs) ((Object) stackIn_20_0);
                          stackIn_21_1 = ln.field_o;
                          break L7;
                        }
                      }
                      stackIn_21_0.field_t = stackIn_21_1;
                      break L3;
                    } else {
                      this.field_P.field_v[var10_int].field_t = hn.field_f[var10_int];
                      var10_int++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_32_0 = -1;
              break L2;
            }
            L8: {
              if (stackIn_32_0 >= (this.field_h ^ -1)) {
                this.field_n = this.field_P.field_v[this.field_h];
                break L8;
              } else {
                this.field_n = null;
                break L8;
              }
            }
            L9: {
              stackIn_41_0 = this;

              if (this.field_n == null) {
                stackIn_42_0 = this;
                stackIn_42_1 = 0;
                break L9;
              } else {
                stackIn_42_0 = this;
                stackIn_42_1 = 1;
                break L9;
              }
            }
            ((km) (this)).field_b = stackIn_42_1 != 0;
            this.field_s = (uj[]) ((Object) new hi[this.field_P.field_v.length]);
            var10 = this.field_P.field_v;
            var11 = 0;
            L10: while (true) {
              if ((var10.length ^ -1) >= (var11 ^ -1)) {
                L11: {
                  if (this.field_W) {
                    var10_int = 1;
                    L12: while (true) {
                      if ((this.field_P.field_r ^ -1) >= (var10_int ^ -1)) {
                        break L11;
                      } else {
                        this.field_s[var10_int] = og.a(2, (mn) (this), this.field_P.field_v[var10_int], this.field_P, -114);
                        this.field_s[var10_int].a(false, -6861);
                        var10_int++;
                        continue L12;
                      }
                    }
                  } else {
                    if (!this.field_f) {
                      var10_int = 0;
                      L13: while (true) {
                        if (var10_int >= this.field_P.field_r) {
                          break L11;
                        } else {
                          L14: {
                            if ((this.field_h ^ -1) != (var10_int ^ -1)) {
                              this.field_s[var10_int] = (uj) ((Object) new hi(this.field_P.field_v[var10_int], this.field_P, (mn) (this)));
                              this.field_s[var10_int].a(true, -6861);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var10_int++;
                          continue L13;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                L15: {
                  if (param8 == null) {
                    break L15;
                  } else {
                    param8.a((byte) -33, (km) (this));
                    this.field_Y = param8;
                    break L15;
                  }
                }
                L16: {
                  this.field_H = new pf();
                  if (!this.field_f) {
                    this.b((byte) -81);
                    this.field_z.field_p = null;
                    this.field_P.d(-9778, 0);
                    this.field_S = mb.field_o[this.field_P.field_J];
                    break L16;
                  } else {
                    this.field_ab = new db();
                    this.field_o = new db();
                    this.field_v = new wb();
                    this.field_k = -1;
                    this.field_g = -1;
                    this.field_P.d(-9778, -1);
                    break L16;
                  }
                }
                this.field_G = false;
                this.field_L = false;
                break L0;
              } else {
                var12 = var10[var11];
                var12.field_q = new um(20);
                var11++;
                continue L10;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var10_ref = decompiledCaughtException;
            stackIn_84_0 = (RuntimeException) (var10_ref);

            stackIn_84_1 = new StringBuilder().append("km.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "null";
              break L17;
            } else {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "null";
              break L18;
            } else {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "null";
              break L19;
            } else {
              stackIn_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "{...}";
              break L19;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_85_0), stackIn_93_2 + ')');
        }
    }

    static {
        field_a = "Enter multiplayer lobby";
        field_A = "Enter name of friend to add to list";
        field_X = "Connecting to<br>friend server...";
    }
}
