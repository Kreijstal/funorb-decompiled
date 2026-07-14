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
        field_O = null;
        field_T = null;
        field_U = null;
        field_V = null;
        field_W = null;
        if (param0 != 2) {
            field_O = null;
        }
    }

    private final int a(double param0, double param1, double param2, byte param3) {
        if (param3 >= -12) {
            return 109;
        }
        return ((jl) this).a(al.a(param0, (byte) -126), al.a(param2, (byte) 120), al.a(param1, (byte) 62));
    }

    jl(int param0, boolean param1) {
        super(92, 180, 0);
        int var8_int = 0;
        double var9 = 0.0;
        double var11_double = 0.0;
        double var13_double = 0.0;
        int var10 = 0;
        double var15 = 0.0;
        int var11 = 0;
        int[] var60 = null;
        int[] var61 = null;
        int var14 = 0;
        double var17_double = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int[] var62 = null;
        int var13 = 0;
        int[] var63 = null;
        int var16 = 0;
        int var17 = 0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        int var38 = 0;
        double[] var64 = null;
        double var40 = 0.0;
        int var12 = 0;
        int var42 = Torquing.field_u;
        double var3 = (Math.sqrt(5.0) + 1.0) / 2.0;
        double[] var5 = new double[]{0.0, 1.0, var3 * 3.0, 0.0, 1.0, -3.0 * var3, 0.0, -1.0, 3.0 * var3, 0.0, -1.0, -3.0 * var3, 1.0, 3.0 * var3, 0.0, 1.0, var3 * -3.0, 0.0, -1.0, 3.0 * var3, 0.0, -1.0, -3.0 * var3, 0.0, 3.0 * var3, 0.0, 1.0, var3 * -3.0, 0.0, 1.0, 3.0 * var3, 0.0, -1.0, -3.0 * var3, 0.0, -1.0, 2.0, 2.0 * var3 + 1.0, var3, 2.0, 1.0 + var3 * 2.0, -var3, 2.0, -(var3 * 2.0) + -1.0, var3, 2.0, -(var3 * 2.0) + -1.0, -var3, -2.0, 1.0 + var3 * 2.0, var3, -2.0, 2.0 * var3 + 1.0, -var3, -2.0, -1.0 - var3 * 2.0, var3, -2.0, -(2.0 * var3) + -1.0, -var3, var3 * 2.0 + 1.0, var3, 2.0, 2.0 * var3 + 1.0, -var3, 2.0, -1.0 - 2.0 * var3, var3, 2.0, -(var3 * 2.0) + -1.0, -var3, 2.0, 1.0 + 2.0 * var3, var3, -2.0, var3 * 2.0 + 1.0, -var3, -2.0, -(var3 * 2.0) + -1.0, var3, -2.0, -(2.0 * var3) + -1.0, -var3, -2.0, var3, 2.0, 2.0 * var3 + 1.0, -var3, 2.0, var3 * 2.0 + 1.0, var3, 2.0, -1.0 - var3 * 2.0, -var3, 2.0, -(var3 * 2.0) + -1.0, var3, -2.0, 1.0 + var3 * 2.0, -var3, -2.0, var3 * 2.0 + 1.0, var3, -2.0, -(var3 * 2.0) + -1.0, -var3, -2.0, -1.0 - var3 * 2.0, 1.0, var3 + 2.0, 2.0 * var3, 1.0, 2.0 + var3, var3 * -2.0, 1.0, -var3 + -2.0, var3 * 2.0, 1.0, -var3 + -2.0, -2.0 * var3, -1.0, 2.0 + var3, 2.0 * var3, -1.0, 2.0 + var3, -2.0 * var3, -1.0, -var3 + -2.0, 2.0 * var3, -1.0, -2.0 - var3, var3 * -2.0, var3 + 2.0, var3 * 2.0, 1.0, var3 + 2.0, -2.0 * var3, 1.0, -var3 + -2.0, 2.0 * var3, 1.0, -var3 + -2.0, var3 * -2.0, 1.0, 2.0 + var3, 2.0 * var3, -1.0, var3 + 2.0, -2.0 * var3, -1.0, -var3 + -2.0, 2.0 * var3, -1.0, -2.0 - var3, -2.0 * var3, -1.0, 2.0 * var3, 1.0, 2.0 + var3, var3 * -2.0, 1.0, var3 + 2.0, var3 * 2.0, 1.0, -2.0 - var3, var3 * -2.0, 1.0, -2.0 - var3, 2.0 * var3, -1.0, 2.0 + var3, var3 * -2.0, -1.0, 2.0 + var3, 2.0 * var3, -1.0, -2.0 - var3, -2.0 * var3, -1.0, -2.0 - var3};
        double var6 = (double)param0 / Math.sqrt(var5[1] * var5[1] + var5[0] * var5[0] + var5[2] * var5[2]);
        for (var8_int = 0; -61 < (var8_int ^ -1); var8_int++) {
            var9 = var5[var8_int * 3];
            var11_double = var5[1 + var8_int * 3];
            var13_double = var5[var8_int * 3 + 2];
            int discarded$0 = this.a(var6 * var9, var13_double * var6, var11_double * var6, (byte) -100);
        }
        double var8 = Double.POSITIVE_INFINITY;
        for (var10 = 1; -61 < (var10 ^ -1); var10++) {
            var11_double = var5[var10 * 3] - var5[0];
            var13_double = -var5[1] + var5[1 + 3 * var10];
            var15 = -var5[2] + var5[var10 * 3 - -2];
            var8 = Math.min(var8, Math.sqrt(var13_double * var13_double + var11_double * var11_double + var15 * var15));
        }
        int[][] var59 = new int[60][3];
        for (var11 = 0; -61 < (var11 ^ -1); var11++) {
            var60 = var59[var11];
            var61 = var59[var11];
            var59[var11][2] = -1;
            var60[0] = -1;
            var61[1] = -1;
            for (var14 = 0; var14 < 60; var14++) {
                if (var14 != var11) {
                    var15 = var5[var14 * 3] - var5[3 * var11];
                    var17_double = var5[var14 * 3 - -1] - var5[1 + 3 * var11];
                    var19 = var5[2 + var14 * 3] - var5[var11 * 3 + 2];
                    var21 = Math.sqrt(var15 * var15 + var17_double * var17_double + var19 * var19);
                    if (var21 < 1.1 * var8) {
                        for (var23 = 0; -1 != var59[var11][var23]; var23++) {
                        }
                        var59[var11][var23] = var14;
                    }
                }
            }
        }
        for (var11 = 0; 60 > var11; var11++) {
            var62 = var59[var11];
            for (var13 = 0; var13 < var62.length; var13++) {
                var14 = var62[var13];
                var63 = var59[var14];
                for (var16 = 0; var16 < var63.length; var16++) {
                    var17 = var63[var16];
                    if ((var17 ^ -1) == (var11 ^ -1)) {
                    } else {
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
                        if (param1) {
                            var6 = (double)param0 / Math.sqrt(var36 * var36 + (var32 * var32 + var34 * var34));
                        }
                        var38 = this.a(var32 * var6, var36 * var6, var6 * var34, (byte) -116);
                        var64 = new double[3];
                        ap.a(var5, 3 * var14, var5, 3 * var11, var64, 0);
                        var40 = var34 * var64[1] + var32 * var64[0] + var64[2] * var36;
                        if (var40 <= 0.0) {
                            int discarded$2 = this.a(var38, var14, 0, var11, false, 127);
                        } else {
                            int discarded$3 = this.a(var14, var38, 0, var11, false, 127);
                        }
                    }
                }
            }
        }
        for (var11 = 0; ((jl) this).field_f > var11; var11++) {
            var12 = 0;
            for (var13 = 0; var13 < ((jl) this).field_g; var13++) {
                if ((((jl) this).field_o[var13] ^ -1) != (var11 ^ -1)) {
                    if (((jl) this).field_y[var13] != var11) {
                        // if_icmpne L2460
                    }
                }
                var12++;
            }
            if ((var12 ^ -1) == -6) {
                for (var13 = 0; ((jl) this).field_g > var13; var13++) {
                    if (((jl) this).field_o[var13] != var11) {
                        if (var11 != ((jl) this).field_y[var13]) {
                            // if_icmpne L2535
                        }
                    }
                    ((jl) this).field_m[var13] = (short)32;
                }
            }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Torquing.field_u;
          var7 = 0;
          if (!param4) {
            break L0;
          } else {
            int discarded$2 = this.a(-98, 102, 31, -9, false, 113);
            break L0;
          }
        }
        L1: while (true) {
          if (var7 >= ((jl) this).field_g) {
            return super.a(param3, param0, param1, (byte)param2, (byte) -1, (short)param5, (short) -1);
          } else {
            L2: {
              L3: {
                if (param3 != ((jl) this).field_o[var7]) {
                  break L3;
                } else {
                  if (param0 != ((jl) this).field_y[var7]) {
                    break L3;
                  } else {
                    if (param1 == ((jl) this).field_q[var7]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (param3 != ((jl) this).field_y[var7]) {
                  break L4;
                } else {
                  if (param0 != ((jl) this).field_q[var7]) {
                    break L4;
                  } else {
                    if (((jl) this).field_o[var7] == param1) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (param3 == ((jl) this).field_q[var7]) {
                if (((jl) this).field_o[var7] == param0) {
                  if (((jl) this).field_y[var7] == param1) {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 0;
        field_U = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_V = new long[32];
        field_O = new double[8][8];
    }
}
