/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends kc {
    private byte[][] field_I;
    int[][] field_J;

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
                    int incrementValue$10 = param4;
                    param4++;
                    param0 = param2[incrementValue$10];
                    if (param2[incrementValue$10] == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      int incrementValue$11 = param5;
                      param5++;
                      param1[incrementValue$11] = param3[param0 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$12 = param4;
                  param4++;
                  param0 = param2[incrementValue$12];
                  if (param2[incrementValue$12] == 0) {
                    param5++;
                    break L3;
                  } else {
                    int incrementValue$13 = param5;
                    param5++;
                    param1[incrementValue$13] = param3[param0 & 255];
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$14 = param4;
                  param4++;
                  param0 = param2[incrementValue$14];
                  if (param2[incrementValue$14] == 0) {
                    param5++;
                    break L4;
                  } else {
                    int incrementValue$15 = param5;
                    param5++;
                    param1[incrementValue$15] = param3[param0 & 255];
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$16 = param4;
                  param4++;
                  param0 = param2[incrementValue$16];
                  if (param2[incrementValue$16] == 0) {
                    param5++;
                    break L5;
                  } else {
                    int incrementValue$17 = param5;
                    param5++;
                    param1[incrementValue$17] = param3[param0 & 255];
                    break L5;
                  }
                }
                int incrementValue$18 = param4;
                param4++;
                param0 = param2[incrementValue$18];
                if (param2[incrementValue$18] == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  int incrementValue$19 = param5;
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

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var8 = param1 + param2 * ul.field_f;
          var9 = ul.field_f - param3;
          var10 = 0;
          var11 = 0;
          if (param2 >= ul.field_d) {
            break L0;
          } else {
            var12 = ul.field_d - param2;
            param4 = param4 - var12;
            param2 = ul.field_d;
            var11 = var11 + var12 * param3;
            var8 = var8 + var12 * ul.field_f;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= ul.field_a) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - ul.field_a);
            break L1;
          }
        }
        L2: {
          if (param1 >= ul.field_i) {
            break L2;
          } else {
            var12 = ul.field_i - param1;
            param3 = param3 - var12;
            param1 = ul.field_i;
            var11 = var11 + var12;
            var8 = var8 + var12;
            var10 = var10 + var12;
            var9 = var9 + var12;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= ul.field_e) {
            break L3;
          } else {
            var12 = param1 + param3 - ul.field_e;
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
                  wa.a(0, ul.field_b, ((wa) this).field_I[param0], ((wa) this).field_J[param5], var11, var8, param3, param4, var9, var10);
                  break L5;
                } else {
                  sc.a(ul.field_b, ((wa) this).field_I[param0], param5, var11, var8, param3, param4, var9, var10);
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
                int incrementValue$50 = param4;
                param4++;
                param0 = param2[incrementValue$50];
                if (param2[incrementValue$50] == 0) {
                  param5++;
                  var13++;
                  continue L1;
                } else {
                  var14 = param1[param5];
                  var15 = param3[param0 & 255];
                  int incrementValue$51 = param5;
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

    wa(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        ((wa) this).field_I = new byte[256][];
        ((wa) this).field_I = param6;
        ((wa) this).field_J = new int[4][];
        ((wa) this).field_J[0] = param5;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var9 = param1 + param2 * ul.field_f;
          var10 = ul.field_f - param3;
          var11 = 0;
          var12 = 0;
          if (param2 >= ul.field_d) {
            break L0;
          } else {
            var13 = ul.field_d - param2;
            param4 = param4 - var13;
            param2 = ul.field_d;
            var12 = var12 + var13 * param3;
            var9 = var9 + var13 * ul.field_f;
            break L0;
          }
        }
        L1: {
          if (param2 + param4 <= ul.field_a) {
            break L1;
          } else {
            param4 = param4 - (param2 + param4 - ul.field_a);
            break L1;
          }
        }
        L2: {
          if (param1 >= ul.field_i) {
            break L2;
          } else {
            var13 = ul.field_i - param1;
            param3 = param3 - var13;
            param1 = ul.field_i;
            var12 = var12 + var13;
            var9 = var9 + var13;
            var11 = var11 + var13;
            var10 = var10 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= ul.field_e) {
            break L3;
          } else {
            var13 = param1 + param3 - ul.field_e;
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
                  wa.a(0, ul.field_b, ((wa) this).field_I[param0], ((wa) this).field_J[param5], var12, var9, param3, param4, var10, var11, param6);
                  break L5;
                } else {
                  sc.a(ul.field_b, ((wa) this).field_I[param0], param5, var12, var9, param3, param4, var10, var11, param6);
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
