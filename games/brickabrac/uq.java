/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uq {
    final static void a(jp param0, int param1, int param2) {
        int var10 = 0;
        param1 = param1 + param0.field_E;
        param2 = param2 + param0.field_F;
        int var3 = param1 + param2 * lb.field_c;
        int var4 = param0.field_C;
        int var5 = param0.field_C;
        int var6 = param0.field_D;
        int var7 = 0;
        int var8 = -var6;
        int var9 = 0;
        if (param2 < lb.field_b) {
            var10 = lb.field_b - param2;
            param2 = lb.field_b;
            if (var10 < var5) {
                var4 = param0.field_G[var10];
            }
            var5 = var5 - var10;
            var3 = var3 + var10 * lb.field_c;
        }
        if (param2 + var5 > lb.field_j) {
            var5 = var5 - (param2 + var5 - lb.field_j);
        }
        if (param1 < lb.field_i) {
            var8 = var8 + (lb.field_i - param1);
        }
        if (param1 + var6 > lb.field_f) {
            var9 = var9 - (param1 + var6 - lb.field_f);
        }
        if (var6 > 0) {
            if (var5 <= 0) {
                return;
            }
            uq.a(lb.field_l, param0.field_G, var4, var3, var7, var8, var9, var6, var5);
            return;
        }
    }

    private final static void a(jp param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var1 = param0.field_D * param0.field_C - 1;
        var2 = param0.field_C - 1;
        L0: while (true) {
          if (var2 < 0) {
            return;
          } else {
            var3 = 0;
            var4 = param0.field_D - 1;
            L1: while (true) {
              if (var4 < 0) {
                var2--;
                continue L0;
              } else {
                var5 = param0.field_G[var1];
                if (var5 != 0) {
                  var3 = 0;
                  var1--;
                  var4--;
                  continue L1;
                } else {
                  var3++;
                  param0.field_G[var1] = -var3;
                  var1--;
                  var4--;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void b(jp param0) {
        int var1 = 0;
        int var2 = 0;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        uq.a(param0);
        var1 = 0;
        var2 = 0;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= param0.field_C) {
            var11 = new int[param0.field_C + var1];
            var10 = var11;
            var9 = var10;
            var8 = var9;
            var3 = var8;
            var2 = 0;
            var4 = param0.field_C;
            var5 = 0;
            L1: while (true) {
              if (var5 >= param0.field_C) {
                param0.field_G = var3;
                return;
              } else {
                var11[var5] = var4;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= param0.field_D) {
                    var5++;
                    continue L1;
                  } else {
                    L3: {
                      var2++;
                      var7 = param0.field_G[var2];
                      if (var7 >= 0) {
                        break L3;
                      } else {
                        var2 = var2 - var7;
                        var6 = var6 - var7;
                        break L3;
                      }
                    }
                    var4++;
                    var3[var4] = var7;
                    var6++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var4 = 0;
            L4: while (true) {
              if (var4 >= param0.field_D) {
                var3_int++;
                continue L0;
              } else {
                var2++;
                var5 = param0.field_G[var2];
                if (var5 < 0) {
                  var2 = var2 - var5;
                  var4 = var4 - var5;
                  var1++;
                  var4++;
                  continue L4;
                } else {
                  var1++;
                  var4++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        param3 = param3 + param7;
        var9 = 0;
        var10 = -param8;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var9 = var9 - param7;
            L1: while (true) {
              if (var9 >= param5) {
                L2: while (true) {
                  if (var9 >= param6) {
                    param3 = param3 + lb.field_c;
                    var10++;
                    continue L0;
                  } else {
                    param2++;
                    param4 = param1[param2];
                    if (param4 > 0) {
                      param0[param3 + var9] = param4;
                      var9++;
                      continue L2;
                    } else {
                      var9 = var9 - param4;
                      var9++;
                      continue L2;
                    }
                  }
                }
              } else {
                param2++;
                param4 = param1[param2];
                if (param4 <= 0) {
                  var9 = var9 - param4;
                  var9++;
                  continue L1;
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
