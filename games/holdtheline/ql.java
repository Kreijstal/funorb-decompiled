/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends qi {
    private byte[][] field_M;
    int[][] field_N;

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        byte dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        byte dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        byte dupTemp$13 = 0;
        int incrementValue$14 = 0;
        int var10;
        int var11;
        int var12;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        var11 = -param7;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = var10;
            L1: while (true) {
              if (var12 >= 0) {
                var12 = param6;
                L2: while (true) {
                  if (var12 >= 0) {
                    param5 = param5 + param8;
                    param4 = param4 + param9;
                    var11++;
                    continue L0;
                  } else {
                    incrementValue$0 = param4;
                    param4++;
                    dupTemp$1 = param2[incrementValue$0];
                    param0 = dupTemp$1;
                    if (dupTemp$1 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$2 = param5;
                      param5++;
                      param1[incrementValue$2] = param3[param0 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$3 = param4;
                  param4++;
                  dupTemp$4 = param2[incrementValue$3];
                  param0 = dupTemp$4;
                  if (dupTemp$4 == 0) {
                    param5++;
                    break L3;
                  } else {
                    incrementValue$5 = param5;
                    param5++;
                    param1[incrementValue$5] = param3[param0 & 255];
                    break L3;
                  }
                }
                L4: {
                  incrementValue$6 = param4;
                  param4++;
                  dupTemp$7 = param2[incrementValue$6];
                  param0 = dupTemp$7;
                  if (dupTemp$7 == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$8 = param5;
                    param5++;
                    param1[incrementValue$8] = param3[param0 & 255];
                    break L4;
                  }
                }
                L5: {
                  incrementValue$9 = param4;
                  param4++;
                  dupTemp$10 = param2[incrementValue$9];
                  param0 = dupTemp$10;
                  if (dupTemp$10 == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$11 = param5;
                    param5++;
                    param1[incrementValue$11] = param3[param0 & 255];
                    break L5;
                  }
                }
                incrementValue$12 = param4;
                param4++;
                dupTemp$13 = param2[incrementValue$12];
                param0 = dupTemp$13;
                if (dupTemp$13 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$14 = param5;
                  param5++;
                  param1[incrementValue$14] = param3[param0 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    ql(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_M = new byte[256][];
        this.field_M = param6;
        this.field_N = new int[4][];
        this.field_N[0] = param5;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        L0: {
          var9 = param1 + param2 * tc.field_j;
          var10 = tc.field_j - param3;
          var11 = 0;
          var12 = 0;
          if (param2 >= tc.field_a) {
            break L0;
          } else {
            var13 = tc.field_a - param2;
            param4 = param4 - var13;
            param2 = tc.field_a;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * tc.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= tc.field_i) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - tc.field_i);
            break L1;
          }
        }
        L2: {
          if (param1 >= tc.field_d) {
            break L2;
          } else {
            var13 = tc.field_d - param1;
            param3 = param3 - var13;
            param1 = tc.field_d;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= tc.field_e) {
            break L3;
          } else {
            var13 = param1 + param3 - tc.field_e;
            param3 = param3 - var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L3;
          }
        }
        L4: {
          if (param3 <= 0) {
            break L4;
          } else {
            if (param4 > 0) {
              L5: {
                if (!param7) {
                  ql.a(0, tc.field_b, this.field_M[param0], this.field_N[param5], var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                } else {
                  fn.a(tc.field_b, this.field_M[param0], param5, var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var8 = param1 + param2 * tc.field_j;
          var9 = tc.field_j - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= tc.field_a) {
            break L0;
          } else {
            var12 = tc.field_a - param2;
            param4 = param4 - var12;
            param2 = tc.field_a;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * tc.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= tc.field_i) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - tc.field_i);
            break L1;
          }
        }
        L2: {
          if (param1 >= tc.field_d) {
            break L2;
          } else {
            var12 = tc.field_d - param1;
            param3 = param3 - var12;
            param1 = tc.field_d;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= tc.field_e) {
            break L3;
          } else {
            var12 = param1 + param3 - tc.field_e;
            param3 = param3 - var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L3;
          }
        }
        L4: {
          if (param3 <= 0) {
            break L4;
          } else {
            if (param4 > 0) {
              L5: {
                if (!param6) {
                  ql.a(0, tc.field_b, this.field_M[param0], this.field_N[param5], var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  fn.a(tc.field_b, this.field_M[param0], param5, var11, var8, param3, param4, var9, var10);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int incrementValue$16 = 0;
        byte dupTemp$17 = 0;
        int incrementValue$18 = 0;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        var11 = 256 - param10;
        var12 = -param7;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = -param6;
            L1: while (true) {
              if (var13 >= 0) {
                param5 = param5 + param8;
                param4 = param4 + param9;
                var12++;
                continue L0;
              } else {
                incrementValue$16 = param4;
                param4++;
                dupTemp$17 = param2[incrementValue$16];
                param0 = dupTemp$17;
                if (dupTemp$17 == 0) {
                  param5++;
                  var13++;
                  continue L1;
                } else {
                  var14 = param1[param5];
                  var15 = param3[param0 & 255];
                  incrementValue$18 = param5;
                  param5++;
                  param1[incrementValue$18] = ((var15 & 16711935) * param10 + (var14 & 16711935) * var11 & -16711936) + ((var15 & 65280) * param10 + (var14 & 65280) * var11 & 16711680) >> 8;
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
