/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends dh {
    private byte[][] field_U;
    int[][] field_M;

    private final static void a(int param0, int[] param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
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
                param4++;
                param0 = param2[param4];
                if (param2[param4] == 0) {
                  param5++;
                  var13++;
                  continue L1;
                } else {
                  var14 = param1[param5];
                  var15 = param3[param0 & 255];
                  param5++;
                  param1[param5] = ((var15 & 16711935) * param10 + (var14 & 16711935) * var11 & -16711936) + ((var15 & 65280) * param10 + (var14 & 65280) * var11 & 16711680) >> 8;
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var9 = param1 + param2 * lb.field_c;
          var10 = lb.field_c - param3;
          var11 = 0;
          var12 = 0;
          if (param2 >= lb.field_b) {
            break L0;
          } else {
            var13 = lb.field_b - param2;
            param4 = param4 - var13;
            param2 = lb.field_b;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * lb.field_c;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= lb.field_j) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - lb.field_j);
            break L1;
          }
        }
        L2: {
          if (param1 >= lb.field_i) {
            break L2;
          } else {
            var13 = lb.field_i - param1;
            param3 = param3 - var13;
            param1 = lb.field_i;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= lb.field_f) {
            break L3;
          } else {
            var13 = param1 + param3 - lb.field_f;
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
                  bi.a(0, lb.field_l, ((bi) this).field_U[param0], ((bi) this).field_M[param5], var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                } else {
                  hl.a(lb.field_l, ((bi) this).field_U[param0], param5, var12, var9, param3, param4, var10, var11, param6);
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
                    param4++;
                    param0 = param2[param4];
                    if (param2[param4] == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      param5++;
                      param1[param5] = param3[param0 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param4++;
                  param0 = param2[param4];
                  if (param2[param4] == 0) {
                    param5++;
                    break L3;
                  } else {
                    param5++;
                    param1[param5] = param3[param0 & 255];
                    break L3;
                  }
                }
                L4: {
                  param4++;
                  param0 = param2[param4];
                  if (param2[param4] == 0) {
                    param5++;
                    break L4;
                  } else {
                    param5++;
                    param1[param5] = param3[param0 & 255];
                    break L4;
                  }
                }
                L5: {
                  param4++;
                  param0 = param2[param4];
                  if (param2[param4] == 0) {
                    param5++;
                    break L5;
                  } else {
                    param5++;
                    param1[param5] = param3[param0 & 255];
                    break L5;
                  }
                }
                param4++;
                param0 = param2[param4];
                if (param2[param4] == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  param5++;
                  param1[param5] = param3[param0 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    bi(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        ((bi) this).field_U = new byte[256][];
        ((bi) this).field_U = param6;
        ((bi) this).field_M = new int[4][];
        ((bi) this).field_M[0] = param5;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var8 = param1 + param2 * lb.field_c;
          var9 = lb.field_c - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= lb.field_b) {
            break L0;
          } else {
            var12 = lb.field_b - param2;
            param4 = param4 - var12;
            param2 = lb.field_b;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * lb.field_c;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= lb.field_j) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - lb.field_j);
            break L1;
          }
        }
        L2: {
          if (param1 >= lb.field_i) {
            break L2;
          } else {
            var12 = lb.field_i - param1;
            param3 = param3 - var12;
            param1 = lb.field_i;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= lb.field_f) {
            break L3;
          } else {
            var12 = param1 + param3 - lb.field_f;
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
                  bi.a(0, lb.field_l, ((bi) this).field_U[param0], ((bi) this).field_M[param5], var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  hl.a(lb.field_l, ((bi) this).field_U[param0], param5, var11, var8, param3, param4, var9, var10);
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
