/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends rb {
    private byte[][] field_D;
    int[][] field_O;

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
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
                incrementValue$50 = param4;
                param4++;
                param0 = param2[incrementValue$50];
                if (param2[incrementValue$50] == 0) {
                  param5++;
                  var13++;
                  continue L1;
                } else {
                  var14 = param1[param5];
                  var15 = param3[param0 & 255];
                  incrementValue$51 = param5;
                  param5++;
                  param1[incrementValue$51] = ((var15 & 16711935) * param10 + (var14 & 16711935) * var11 & -16711936) + ((var15 & 65280) * param10 + (var14 & 65280) * var11 & 16711680) >> 8;
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final int d(int param0) {
        return tj.a(this.field_O[0], param0);
    }

    tj(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_D = new byte[256][];
        this.field_D = param6;
        this.field_O = new int[4][];
        this.field_O[0] = param5;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var9 = param1 + param2 * bi.field_f;
          var10 = bi.field_f - param3;
          var11 = 0;
          var12 = 0;
          if (param2 >= bi.field_l) {
            break L0;
          } else {
            var13 = bi.field_l - param2;
            param4 = param4 - var13;
            param2 = bi.field_l;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * bi.field_f;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= bi.field_d) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - bi.field_d);
            break L1;
          }
        }
        L2: {
          if (param1 >= bi.field_g) {
            break L2;
          } else {
            var13 = bi.field_g - param1;
            param3 = param3 - var13;
            param1 = bi.field_g;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= bi.field_b) {
            break L3;
          } else {
            var13 = param1 + param3 - bi.field_b;
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
                  tj.a(0, bi.field_c, this.field_D[param0], this.field_O[param5], var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                } else {
                  oi.a(bi.field_c, this.field_D[param0], param5, var12, var9, param3, param4, var10, var11, param6);
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

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
                    incrementValue$10 = param4;
                    param4++;
                    param0 = param2[incrementValue$10];
                    if (param2[incrementValue$10] == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      incrementValue$11 = param5;
                      param5++;
                      param1[incrementValue$11] = param3[param0 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  incrementValue$12 = param4;
                  param4++;
                  param0 = param2[incrementValue$12];
                  if (param2[incrementValue$12] == 0) {
                    param5++;
                    break L3;
                  } else {
                    incrementValue$13 = param5;
                    param5++;
                    param1[incrementValue$13] = param3[param0 & 255];
                    break L3;
                  }
                }
                L4: {
                  incrementValue$14 = param4;
                  param4++;
                  param0 = param2[incrementValue$14];
                  if (param2[incrementValue$14] == 0) {
                    param5++;
                    break L4;
                  } else {
                    incrementValue$15 = param5;
                    param5++;
                    param1[incrementValue$15] = param3[param0 & 255];
                    break L4;
                  }
                }
                L5: {
                  incrementValue$16 = param4;
                  param4++;
                  param0 = param2[incrementValue$16];
                  if (param2[incrementValue$16] == 0) {
                    param5++;
                    break L5;
                  } else {
                    incrementValue$17 = param5;
                    param5++;
                    param1[incrementValue$17] = param3[param0 & 255];
                    break L5;
                  }
                }
                incrementValue$18 = param4;
                param4++;
                param0 = param2[incrementValue$18];
                if (param2[incrementValue$18] == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  incrementValue$19 = param5;
                  param5++;
                  param1[incrementValue$19] = param3[param0 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static int a(int[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var2 = 0;
        var3 = 2147483647;
        var4 = 1;
        L0: while (true) {
          if (var4 >= param0.length) {
            return var2;
          } else {
            var5 = param0[var4];
            var6 = (var5 >> 16) - (param1 >> 16);
            var7 = (var5 >> 8 & 255) - (param1 >> 8 & 255);
            var8 = (var5 & 255) - (param1 & 255);
            var9 = var6 * var6 + var7 * var7 + var8 * var8;
            if (var9 < var3) {
              var2 = var4;
              var3 = var9;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var8 = param1 + param2 * bi.field_f;
          var9 = bi.field_f - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= bi.field_l) {
            break L0;
          } else {
            var12 = bi.field_l - param2;
            param4 = param4 - var12;
            param2 = bi.field_l;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * bi.field_f;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= bi.field_d) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - bi.field_d);
            break L1;
          }
        }
        L2: {
          if (param1 >= bi.field_g) {
            break L2;
          } else {
            var12 = bi.field_g - param1;
            param3 = param3 - var12;
            param1 = bi.field_g;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= bi.field_b) {
            break L3;
          } else {
            var12 = param1 + param3 - bi.field_b;
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
                  tj.a(0, bi.field_c, this.field_D[param0], this.field_O[param5], var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  oi.a(bi.field_c, this.field_D[param0], param5, var11, var8, param3, param4, var9, var10);
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
}
