/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends ph {
    int[] field_m;
    byte[] field_n;

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
                    param4++;
                    param3 = param1[param4];
                    if (param3 == 0) {
                      param5++;
                      var12++;
                      continue L2;
                    } else {
                      param5++;
                      param0[param5] = param2[param3 & 255];
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param4++;
                  param3 = param1[param4];
                  if (param3 == 0) {
                    param5++;
                    break L3;
                  } else {
                    param5++;
                    param0[param5] = param2[param3 & 255];
                    break L3;
                  }
                }
                L4: {
                  param4++;
                  param3 = param1[param4];
                  if (param3 == 0) {
                    param5++;
                    break L4;
                  } else {
                    param5++;
                    param0[param5] = param2[param3 & 255];
                    break L4;
                  }
                }
                L5: {
                  param4++;
                  param3 = param1[param4];
                  if (param3 == 0) {
                    param5++;
                    break L5;
                  } else {
                    param5++;
                    param0[param5] = param2[param3 & 255];
                    break L5;
                  }
                }
                param4++;
                param3 = param1[param4];
                if (param3 == 0) {
                  param5++;
                  var12++;
                  continue L1;
                } else {
                  param5++;
                  param0[param5] = param2[param3 & 255];
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
          param0 = param0 + ((od) this).field_i;
          param1 = param1 + ((od) this).field_j;
          var4 = param0 + param1 * mi.field_a;
          var5 = 0;
          var6 = ((od) this).field_a;
          var7 = ((od) this).field_d;
          var8 = mi.field_a - var7;
          var9 = 0;
          if (param1 >= mi.field_l) {
            break L0;
          } else {
            var10 = mi.field_l - param1;
            var6 = var6 - var10;
            param1 = mi.field_l;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * mi.field_a;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= mi.field_e) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - mi.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= mi.field_b) {
            break L2;
          } else {
            var10 = mi.field_b - param0;
            var7 = var7 - var10;
            param0 = mi.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= mi.field_k) {
            break L3;
          } else {
            var10 = param0 + var7 - mi.field_k;
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
              od.b(mi.field_f, ((od) this).field_n, ((od) this).field_m, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
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
                param3++;
                var13 = param1[param3];
                if (var13 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param2[var13 & 255];
                  var14 = param0[param4];
                  param4++;
                  param0[param4] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((od) this).field_i;
          param1 = param1 + ((od) this).field_j;
          var3 = param0 + param1 * mi.field_a;
          var4 = 0;
          var5 = ((od) this).field_a;
          var6 = ((od) this).field_d;
          var7 = mi.field_a - var6;
          var8 = 0;
          if (param1 >= mi.field_l) {
            break L0;
          } else {
            var9 = mi.field_l - param1;
            var5 = var5 - var9;
            param1 = mi.field_l;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * mi.field_a;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= mi.field_e) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - mi.field_e);
            break L1;
          }
        }
        L2: {
          if (param0 >= mi.field_b) {
            break L2;
          } else {
            var9 = mi.field_b - param0;
            var6 = var6 - var9;
            param0 = mi.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= mi.field_k) {
            break L3;
          } else {
            var9 = param0 + var6 - mi.field_k;
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
              od.a(mi.field_f, ((od) this).field_n, ((od) this).field_m, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    od(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((od) this).field_l = param0;
        ((od) this).field_b = param1;
        ((od) this).field_i = param2;
        ((od) this).field_j = param3;
        ((od) this).field_d = param4;
        ((od) this).field_a = param5;
        ((od) this).field_n = param6;
        ((od) this).field_m = param7;
    }

    od(int param0, int param1, int param2) {
        ((od) this).field_d = param0;
        ((od) this).field_l = param0;
        ((od) this).field_a = param1;
        ((od) this).field_b = param1;
        ((od) this).field_j = 0;
        ((od) this).field_i = 0;
        ((od) this).field_n = new byte[param0 * param1];
        ((od) this).field_m = new int[param2];
    }
}
