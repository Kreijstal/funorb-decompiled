/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hja extends rka {
    byte[] field_h;
    int[] field_g;

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

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((hja) this).field_d;
          param1 = param1 + ((hja) this).field_e;
          var3 = param0 + param1 * bea.field_g;
          var4 = 0;
          var5 = ((hja) this).field_b;
          var6 = ((hja) this).field_a;
          var7 = bea.field_g - var6;
          var8 = 0;
          if (param1 >= bea.field_h) {
            break L0;
          } else {
            var9 = bea.field_h - param1;
            var5 = var5 - var9;
            param1 = bea.field_h;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * bea.field_g;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= bea.field_k) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - bea.field_k);
            break L1;
          }
        }
        L2: {
          if (param0 >= bea.field_b) {
            break L2;
          } else {
            var9 = bea.field_b - param0;
            var6 = var6 - var9;
            param0 = bea.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= bea.field_d) {
            break L3;
          } else {
            var9 = param0 + var6 - bea.field_d;
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
              hja.a(bea.field_l, ((hja) this).field_h, ((hja) this).field_g, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    hja(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        ((hja) this).field_c = param0;
        ((hja) this).field_f = param1;
        ((hja) this).field_d = param2;
        ((hja) this).field_e = param3;
        ((hja) this).field_a = param4;
        ((hja) this).field_b = param5;
        ((hja) this).field_h = param6;
        ((hja) this).field_g = param7;
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
          param0 = param0 + ((hja) this).field_d;
          param1 = param1 + ((hja) this).field_e;
          var4 = param0 + param1 * bea.field_g;
          var5 = 0;
          var6 = ((hja) this).field_b;
          var7 = ((hja) this).field_a;
          var8 = bea.field_g - var7;
          var9 = 0;
          if (param1 >= bea.field_h) {
            break L0;
          } else {
            var10 = bea.field_h - param1;
            var6 = var6 - var10;
            param1 = bea.field_h;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * bea.field_g;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= bea.field_k) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - bea.field_k);
            break L1;
          }
        }
        L2: {
          if (param0 >= bea.field_b) {
            break L2;
          } else {
            var10 = bea.field_b - param0;
            var7 = var7 - var10;
            param0 = bea.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= bea.field_d) {
            break L3;
          } else {
            var10 = param0 + var7 - bea.field_d;
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
              hja.b(bea.field_l, ((hja) this).field_h, ((hja) this).field_g, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    hja(int param0, int param1, int param2) {
        ((hja) this).field_a = param0;
        ((hja) this).field_c = param0;
        ((hja) this).field_b = param1;
        ((hja) this).field_f = param1;
        ((hja) this).field_e = 0;
        ((hja) this).field_d = 0;
        ((hja) this).field_h = new byte[param0 * param1];
        ((hja) this).field_g = new int[param2];
    }
}
