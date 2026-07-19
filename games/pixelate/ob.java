/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends jl {
    int[][] field_R;
    private byte[][] field_S;

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

    final int g(int param0) {
        return ob.a(this.field_R[0], param0);
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

    ob(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_S = new byte[256][];
        this.field_S = param6;
        this.field_R = new int[4][];
        this.field_R[0] = param5;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var9 = param1 + param2 * t.field_j;
          var10 = t.field_j - param3;
          var11 = 0;
          var12 = 0;
          if (param2 >= t.field_f) {
            break L0;
          } else {
            var13 = t.field_f - param2;
            param4 = param4 - var13;
            param2 = t.field_f;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * t.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= t.field_a) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - t.field_a);
            break L1;
          }
        }
        L2: {
          if (param1 >= t.field_e) {
            break L2;
          } else {
            var13 = t.field_e - param1;
            param3 = param3 - var13;
            param1 = t.field_e;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= t.field_h) {
            break L3;
          } else {
            var13 = param1 + param3 - t.field_h;
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
                  ob.a(0, t.field_k, this.field_S[param0], this.field_R[param5], var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                } else {
                  tc.a(t.field_k, this.field_S[param0], param5, var12, var9, param3, param4, var10, var11, param6);
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
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var8 = param1 + param2 * t.field_j;
          var9 = t.field_j - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= t.field_f) {
            break L0;
          } else {
            var12 = t.field_f - param2;
            param4 = param4 - var12;
            param2 = t.field_f;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * t.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= t.field_a) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - t.field_a);
            break L1;
          }
        }
        L2: {
          if (param1 >= t.field_e) {
            break L2;
          } else {
            var12 = t.field_e - param1;
            param3 = param3 - var12;
            param1 = t.field_e;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= t.field_h) {
            break L3;
          } else {
            var12 = param1 + param3 - t.field_h;
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
                  ob.a(0, t.field_k, this.field_S[param0], this.field_R[param5], var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  tc.a(t.field_k, this.field_S[param0], param5, var11, var8, param3, param4, var9, var10);
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
