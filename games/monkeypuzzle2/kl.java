/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var6 = param0 + param1 * ge.field_h;
        var7 = 255 - param5;
        var8 = param4 >> 16;
        var9 = param4 >> 8 & 255;
        var10 = param4 & 255;
        var11 = ge.field_h - param2;
        var12 = param3 - 1;
        L0: while (true) {
          if (var12 < 0) {
            return;
          } else {
            var13 = param2 - 1;
            L1: while (true) {
              if (var13 < 0) {
                var6 = var6 + var11;
                var12--;
                continue L0;
              } else {
                var14 = ge.field_i[var6];
                var15 = var14 >> 16 & 255;
                var16 = var14 >> 8 & 255;
                var17 = var14 & 255;
                var18 = (var17 + (var15 << 1)) / 6 + (var16 >> 2);
                var19 = var18 * var8 >> 8;
                var20 = var18 * var9 >> 8;
                var21 = var18 * var10 >> 8;
                int incrementValue$1 = var6;
                var6++;
                ge.field_i[incrementValue$1] = (var15 * var7 + var19 * param5 << 8 & 16711680) + (var16 * var7 + var20 * param5 & 65280) + (var17 * var7 + var21 * param5 >> 8);
                var13--;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param3 < ge.field_j) {
          if (param3 + param5 >= ge.field_a) {
            if (param4 < ge.field_k) {
              if (param4 + param6 >= ge.field_f) {
                L0: {
                  if (param3 >= ge.field_a) {
                    break L0;
                  } else {
                    param3 = ge.field_a;
                    break L0;
                  }
                }
                L1: {
                  if (param4 >= ge.field_f) {
                    break L1;
                  } else {
                    param4 = ge.field_f;
                    break L1;
                  }
                }
                L2: {
                  if (param3 + param5 < ge.field_j) {
                    break L2;
                  } else {
                    param5 = ge.field_j - param3;
                    break L2;
                  }
                }
                L3: {
                  if (param4 + param6 < ge.field_k) {
                    break L3;
                  } else {
                    param6 = ge.field_k - param4;
                    break L3;
                  }
                }
                param4 = param4 * ge.field_h;
                var8 = 6.2831854820251465f / (float)param0;
                var9 = param3 + param5;
                var10 = param4 + (param6 - 1) * ge.field_h;
                L4: while (true) {
                  if (var10 < param4) {
                    return;
                  } else {
                    L5: {
                      var11 = (int)((float)param1 * ia.a(true, var8 * (float)(var10 + param2)));
                      if (var11 <= 0) {
                        if (var11 <= 0) {
                          break L5;
                        } else {
                          var12 = param3;
                          L6: while (true) {
                            if (var12 >= var9) {
                              break L5;
                            } else {
                              L7: {
                                var7 = var12 - var11;
                                if (var7 < var9) {
                                  break L7;
                                } else {
                                  var7 = var9 - 1;
                                  break L7;
                                }
                              }
                              ge.field_i[var12 + var10] = ge.field_i[var10 + var7];
                              var12++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        var12 = var9 - 1;
                        L8: while (true) {
                          if (var12 < param3) {
                            break L5;
                          } else {
                            L9: {
                              var7 = var12 - var11;
                              if (var7 >= param3) {
                                break L9;
                              } else {
                                var7 = param3;
                                break L9;
                              }
                            }
                            ge.field_i[var12 + var10] = ge.field_i[var10 + var7];
                            var12--;
                            continue L8;
                          }
                        }
                      }
                    }
                    var10 = var10 - ge.field_h;
                    continue L4;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }
}
