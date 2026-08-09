/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends rm {
    static volatile int field_S;
    static Boolean field_T;
    static String field_U;
    static long[] field_V;
    static o field_W;
    static double[][] field_O;

    final static void b(byte param0) {
        if (param0 != 106) {
            return;
        }
        nn.field_c.field_g = 0;
        nn.field_c.field_k = 0;
    }

    public static void b(int param0) {
        field_O = (double[][]) null;
        field_T = null;
        field_U = null;
        field_V = null;
        field_W = null;
        if (param0 != 2) {
            field_O = (double[][]) null;
        }
    }

    private final int a(double param0, double param1, double param2, byte param3) {
        if (param3 >= -12) {
            return 109;
        }
        return this.a(al.a(param0, (byte) -126), al.a(param2, (byte) 120), al.a(param1, (byte) 62));
    }

    jl(int param0, boolean param1) {
        super(92, 180, 0);
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        double var3 = 0.0;
        double[] var5 = null;
        double var6 = 0.0;
        int var8_int = 0;
        double var8 = 0.0;
        double var9 = 0.0;
        int var10 = 0;
        double var11_double = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var13_double = 0.0;
        int var13 = 0;
        int var14 = 0;
        double var15 = 0.0;
        int var16 = 0;
        double var17_double = 0.0;
        int var17 = 0;
        double var18 = 0.0;
        double var19 = 0.0;
        double var20 = 0.0;
        double var21 = 0.0;
        double var22 = 0.0;
        int var23 = 0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        int var38 = 0;
        double var40 = 0.0;
        int var42 = 0;
        int[][] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        double[] var64 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var42 = Torquing.field_u;
                    var3 = (Math.sqrt(5.0) + 1.0) / 2.0;
                    var5 = new double[]{0.0, 1.0, var3 * 3.0, 0.0, 1.0, -3.0 * var3, 0.0, -1.0, 3.0 * var3, 0.0, -1.0, -3.0 * var3, 1.0, 3.0 * var3, 0.0, 1.0, var3 * -3.0, 0.0, -1.0, 3.0 * var3, 0.0, -1.0, -3.0 * var3, 0.0, 3.0 * var3, 0.0, 1.0, var3 * -3.0, 0.0, 1.0, 3.0 * var3, 0.0, -1.0, -3.0 * var3, 0.0, -1.0, 2.0, 2.0 * var3 + 1.0, var3, 2.0, 1.0 + var3 * 2.0, -var3, 2.0, -(var3 * 2.0) + -1.0, var3, 2.0, -(var3 * 2.0) + -1.0, -var3, -2.0, 1.0 + var3 * 2.0, var3, -2.0, 2.0 * var3 + 1.0, -var3, -2.0, -1.0 - var3 * 2.0, var3, -2.0, -(2.0 * var3) + -1.0, -var3, var3 * 2.0 + 1.0, var3, 2.0, 2.0 * var3 + 1.0, -var3, 2.0, -1.0 - 2.0 * var3, var3, 2.0, -(var3 * 2.0) + -1.0, -var3, 2.0, 1.0 + 2.0 * var3, var3, -2.0, var3 * 2.0 + 1.0, -var3, -2.0, -(var3 * 2.0) + -1.0, var3, -2.0, -(2.0 * var3) + -1.0, -var3, -2.0, var3, 2.0, 2.0 * var3 + 1.0, -var3, 2.0, var3 * 2.0 + 1.0, var3, 2.0, -1.0 - var3 * 2.0, -var3, 2.0, -(var3 * 2.0) + -1.0, var3, -2.0, 1.0 + var3 * 2.0, -var3, -2.0, var3 * 2.0 + 1.0, var3, -2.0, -(var3 * 2.0) + -1.0, -var3, -2.0, -1.0 - var3 * 2.0, 1.0, var3 + 2.0, 2.0 * var3, 1.0, 2.0 + var3, var3 * -2.0, 1.0, -var3 + -2.0, var3 * 2.0, 1.0, -var3 + -2.0, -2.0 * var3, -1.0, 2.0 + var3, 2.0 * var3, -1.0, 2.0 + var3, -2.0 * var3, -1.0, -var3 + -2.0, 2.0 * var3, -1.0, -2.0 - var3, var3 * -2.0, var3 + 2.0, var3 * 2.0, 1.0, var3 + 2.0, -2.0 * var3, 1.0, -var3 + -2.0, 2.0 * var3, 1.0, -var3 + -2.0, var3 * -2.0, 1.0, 2.0 + var3, 2.0 * var3, -1.0, var3 + 2.0, -2.0 * var3, -1.0, -var3 + -2.0, 2.0 * var3, -1.0, -2.0 - var3, -2.0 * var3, -1.0, 2.0 * var3, 1.0, 2.0 + var3, var3 * -2.0, 1.0, var3 + 2.0, var3 * 2.0, 1.0, -2.0 - var3, var3 * -2.0, 1.0, -2.0 - var3, 2.0 * var3, -1.0, 2.0 + var3, var3 * -2.0, -1.0, 2.0 + var3, 2.0 * var3, -1.0, -2.0 - var3, -2.0 * var3, -1.0, -2.0 - var3};
                    var6 = (double)param0 / Math.sqrt(var5[1] * var5[1] + var5[0] * var5[0] + var5[2] * var5[2]);
                    var8_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-61 >= (var8_int ^ -1)) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var9 = var5[var8_int * 3];
                    var11_double = var5[1 + var8_int * 3];
                    var13_double = var5[var8_int * 3 + 2];
                    discarded$4 = this.a(var6 * var9, var13_double * var6, var11_double * var6, (byte) -100);
                    var8_int++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 3: {
                    var8 = Double.POSITIVE_INFINITY;
                    var10 = 1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (-61 >= (var10 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var11_double = var5[var10 * 3] - var5[0];
                    var13_double = -var5[1] + var5[1 + 3 * var10];
                    var15 = -var5[2] + var5[var10 * 3 - -2];
                    var8 = Math.min(var8, Math.sqrt(var13_double * var13_double + var11_double * var11_double + var15 * var15));
                    var10++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 6: {
                    var59 = new int[60][3];
                    var11 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = -61;
                    stackIn_8_1 = var11 ^ -1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 >= stackIn_8_1) {
                        statePc = 20;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var60 = var59[var11];
                    var61 = var59[var11];
                    var59[var11][2] = -1;
                    var60[0] = -1;
                    var61[1] = -1;
                    var14 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var14 >= 60) {
                        statePc = 19;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_8_0 = var14;
                    stackIn_12_0 = stackIn_8_0;
                    stackIn_8_1 = var11;
                    stackIn_12_1 = stackIn_8_1;
                    if (false) {
                        statePc = 8;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 == stackIn_12_1) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var15 = var5[var14 * 3] - var5[3 * var11];
                    var17_double = var5[var14 * 3 - -1] - var5[1 + 3 * var11];
                    var19 = var5[2 + var14 * 3] - var5[var11 * 3 + 2];
                    var21 = Math.sqrt(var15 * var15 + var17_double * var17_double + var19 * var19);
                    if (var21 >= 1.1 * var8) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var23 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-1 == var59[var11][var23]) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var23++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 17: {
                    var59[var11][var23] = var14;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var14++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 19: {
                    var11++;
                    statePc = 7;
                    continue stateLoop;
                }
                case 20: {
                    var11 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (60 <= var11) {
                        statePc = 38;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var62 = var59[var11];
                    var13 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = var13;
                    stackIn_24_1 = var62.length;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 >= stackIn_24_1) {
                        statePc = 37;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var14 = var62[var13];
                    var63 = var59[var14];
                    var16 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var16 >= var63.length) {
                        statePc = 36;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var17 = var63[var16];
                    stackIn_24_0 = var17 ^ -1;
                    stackIn_28_0 = stackIn_24_0;
                    stackIn_24_1 = var11 ^ -1;
                    stackIn_28_1 = stackIn_24_1;
                    if (false) {
                        statePc = 24;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (stackIn_28_0 != stackIn_28_1) {
                        statePc = 30;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var18 = var5[var17 * 3] + var5[var11 * 3] - 2.0 * var5[var14 * 3];
                    var20 = var5[3 * var14] - var5[var11 * 3];
                    var22 = -(var5[1 + 3 * var14] * 2.0) + (var5[3 * var11 - -1] + var5[1 + 3 * var17]);
                    var24 = -var5[var11 * 3 - -1] + var5[var14 * 3 - -1];
                    var26 = var5[2 + 3 * var11] + var5[var17 * 3 + 2] - 2.0 * var5[3 * var14 - -2];
                    var28 = var5[var14 * 3 - -2] - var5[var11 * 3 - -2];
                    var30 = -2.0 / (var28 * var26 + (var18 * var20 + var22 * var24));
                    var32 = var5[var14 * 3] + var18 * var30;
                    var34 = var5[var14 * 3 + 1] + var22 * var30;
                    var36 = var26 * var30 + var5[2 + 3 * var14];
                    if (!param1) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var6 = (double)param0 / Math.sqrt(var36 * var36 + (var32 * var32 + var34 * var34));
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var38 = this.a(var32 * var6, var36 * var6, var6 * var34, (byte) -116);
                    var64 = new double[3];
                    ap.a(var5, 3 * var14, var5, 3 * var11, var64, 0);
                    var40 = var34 * var64[1] + var32 * var64[0] + var64[2] * var36;
                    if (var40 > 0.0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    discarded$5 = this.a(var38, var14, 0, var11, false, 127);
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    discarded$6 = this.a(var14, var38, 0, var11, false, 127);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var16++;
                    statePc = 26;
                    continue stateLoop;
                }
                case 36: {
                    var13++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 37: {
                    var11++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 38: {
                    var11 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = this.field_f;
                    stackIn_40_1 = var11;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (stackIn_40_0 <= stackIn_40_1) {
                        statePc = 60;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var12 = 0;
                    var13 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var13 >= this.field_g) {
                        statePc = 49;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_50_0 = this.field_o[var13] ^ -1;
                    stackIn_44_0 = stackIn_50_0;
                    stackIn_50_1 = var11 ^ -1;
                    stackIn_44_1 = stackIn_50_1;
                    if (false) {
                        statePc = 50;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (stackIn_44_0 == stackIn_44_1) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_y[var13] == var11) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var11 != this.field_q[var13]) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var12++;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var13++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = var12 ^ -1;
                    stackIn_50_1 = -6;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (stackIn_50_0 != stackIn_50_1) {
                        statePc = 59;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var13 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (this.field_g <= var13) {
                        statePc = 59;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_40_0 = this.field_o[var13];
                    stackIn_54_0 = stackIn_40_0;
                    stackIn_40_1 = var11;
                    stackIn_54_1 = stackIn_40_1;
                    if (false) {
                        statePc = 40;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 == stackIn_54_1) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var11 == this.field_y[var13]) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var11 != this.field_q[var13]) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    this.field_m[var13] = (short)32;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var13++;
                    statePc = 52;
                    continue stateLoop;
                }
                case 59: {
                    var11++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 60: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int discarded$1 = 0;
        int var7;
        int var8;
        L0: {
          var8 = Torquing.field_u;
          var7 = 0;
          if (!param4) {
            break L0;
          } else {
            discarded$1 = this.a(-98, 102, 31, -9, false, 113);
            break L0;
          }
        }
        L1: while (true) {
          if (var7 >= this.field_g) {
            return super.a(param3, param0, param1, (byte)param2, (byte) -1, (short)param5, (short) -1);
          } else {
            L2: {
              L3: {
                if (param3 != this.field_o[var7]) {
                  break L3;
                } else {
                  if (param0 != this.field_y[var7]) {
                    break L3;
                  } else {
                    if (param1 == this.field_q[var7]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (param3 != this.field_y[var7]) {
                  break L4;
                } else {
                  if (param0 != this.field_q[var7]) {
                    break L4;
                  } else {
                    if (this.field_o[var7] == param1) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (param3 == this.field_q[var7]) {
                if (this.field_o[var7] == param0) {
                  if (this.field_y[var7] == param1) {
                    break L2;
                  } else {
                    var7++;
                    continue L1;
                  }
                } else {
                  var7++;
                  continue L1;
                }
              } else {
                var7++;
                continue L1;
              }
            }
            return var7;
          }
        }
    }

    static {
        field_S = 0;
        field_U = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_V = new long[32];
        field_O = new double[8][8];
    }
}
