/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends df {
    int[] field_i;
    byte[] field_j;

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((wp) this).field_e;
          param1 = param1 + ((wp) this).field_c;
          var3 = param0 + param1 * vp.field_i;
          var4 = 0;
          var5 = ((wp) this).field_d;
          var6 = ((wp) this).field_b;
          var7 = vp.field_i - var6;
          var8 = 0;
          if (param1 >= vp.field_f) {
            break L0;
          } else {
            var9 = vp.field_f - param1;
            var5 = var5 - var9;
            param1 = vp.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * vp.field_i;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= vp.field_d) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - vp.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= vp.field_b) {
            break L2;
          } else {
            var9 = vp.field_b - param0;
            var6 = var6 - var9;
            param0 = vp.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= vp.field_k) {
            break L3;
          } else {
            var9 = param0 + var6 - vp.field_k;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              wp.a(vp.field_j, ((wp) this).field_j, ((wp) this).field_i, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
                    param3 = param1[incrementValue$10];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      int incrementValue$11 = param5;
                      param5++;
                      param0[incrementValue$11] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$12 = param4;
                  param4++;
                  param3 = param1[incrementValue$12];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    int incrementValue$13 = param5;
                    param5++;
                    param0[incrementValue$13] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$14 = param4;
                  param4++;
                  param3 = param1[incrementValue$14];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    int incrementValue$15 = param5;
                    param5++;
                    param0[incrementValue$15] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$16 = param4;
                  param4++;
                  param3 = param1[incrementValue$16];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    int incrementValue$17 = param5;
                    param5++;
                    param0[incrementValue$17] = param2[param3 & 255];
                    break L5;
                  }
                }
                int incrementValue$18 = param4;
                param4++;
                param3 = param1[incrementValue$18];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  int incrementValue$19 = param5;
                  param5++;
                  param0[incrementValue$19] = param2[param3 & 255];
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var10 = 256 - param9;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param5;
            L1: while (true) {
              if (var12 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var11++;
                continue L0;
              } else {
                int incrementValue$66 = param3;
                param3++;
                var13 = param1[incrementValue$66];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((wp) this).field_e;
          param1 = param1 + ((wp) this).field_c;
          var4 = param0 + param1 * vp.field_i;
          var5 = 0;
          var6 = ((wp) this).field_d;
          var7 = ((wp) this).field_b;
          var8 = vp.field_i - var7;
          var9 = 0;
          if (param1 >= vp.field_f) {
            break L0;
          } else {
            var10 = vp.field_f - param1;
            var6 = var6 - var10;
            param1 = vp.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * vp.field_i;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= vp.field_d) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - vp.field_d);
            break L1;
          }
        }
        L2: {
          if (param0 >= vp.field_b) {
            break L2;
          } else {
            var10 = vp.field_b - param0;
            var7 = var7 - var10;
            param0 = vp.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= vp.field_k) {
            break L3;
          } else {
            var10 = param0 + var7 - vp.field_k;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              wp.b(vp.field_j, ((wp) this).field_j, ((wp) this).field_i, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    wp(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((wp) this).field_h = param0;
        ((wp) this).field_a = param1;
        ((wp) this).field_e = param2;
        ((wp) this).field_c = param3;
        ((wp) this).field_b = param4;
        ((wp) this).field_d = param5;
        ((wp) this).field_j = param6;
        ((wp) this).field_i = param7;
    }

    wp(int param0, int param1, int param2) {
        ((wp) this).field_b = param0;
        ((wp) this).field_h = param0;
        ((wp) this).field_d = param1;
        ((wp) this).field_a = param1;
        ((wp) this).field_c = 0;
        ((wp) this).field_e = 0;
        ((wp) this).field_j = new byte[param0 * param1];
        ((wp) this).field_i = new int[param2];
    }
}
