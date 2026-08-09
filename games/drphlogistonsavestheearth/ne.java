/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    final static boolean a(he param0, int param1, int param2, he param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var22;
        int var23;
        byte[] var30;
        byte[] var31;
        L0: {
          param1 = param1 + param0.field_a;
          param4 = param4 + param3.field_a;
          var6 = param4 - param1;
          var7 = param0.field_d;
          if (var6 >= param0.field_d) {
            break L0;
          } else {
            var8 = param3.field_d;
            if (var6 > -param3.field_d) {
              L1: {
                param2 = param2 + param0.field_f;
                param5 = param5 + param3.field_f;
                var9 = param5 - param2;
                var10 = param0.field_k;
                if (var9 >= param0.field_k) {
                  break L1;
                } else {
                  var11 = param3.field_k;
                  if (var9 > -param3.field_k) {
                    L2: {
                      if (var6 > 0) {
                        stackIn_9_0 = var6;
                        break L2;
                      } else {
                        stackIn_9_0 = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var12 = stackIn_9_0;
                      var13 = var6 + var8;
                      if (var13 <= var7) {
                        break L3;
                      } else {
                        var13 = var7;
                        break L3;
                      }
                    }
                    L4: {
                      if (var9 > 0) {
                        stackIn_14_0 = var9;
                        break L4;
                      } else {
                        stackIn_14_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var14 = stackIn_14_0;
                      var15 = var9 + var11;
                      if (var15 <= var10) {
                        break L5;
                      } else {
                        var15 = var10;
                        break L5;
                      }
                    }
                    var13 = var13 - var12;
                    var15 = var15 - var14;
                    var16 = var14 * var7 + var12;
                    var17 = var7 - var13;
                    var18 = (var14 - var9) * var8 + (var12 - var6);
                    var19 = var8 - var13;
                    var30 = param0.field_m;
                    var31 = param3.field_m;
                    var22 = var15;
                    L6: while (true) {
                      if (var22 > 0) {
                        var23 = var13;
                        L7: while (true) {
                          if (var23 <= 0) {
                            var16 = var16 + var17;
                            var18 = var18 + var19;
                            var22--;
                            continue L6;
                          } else {
                            if (var30[var16] != 0) {
                              if (var31[var18] != 0) {
                                return true;
                              } else {
                                var16++;
                                var18++;
                                var23--;
                                continue L7;
                              }
                            } else {
                              var16++;
                              var18++;
                              var23--;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              return false;
            } else {
              break L0;
            }
          }
        }
        return false;
    }

    final static boolean a(nh param0, int param1, int param2, he param3, int param4, int param5) {
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var22;
        int var23;
        int[] var30;
        byte[] var31;
        L0: {
          param1 = param1 + param0.field_D;
          param4 = param4 + param3.field_a;
          var6 = param4 - param1;
          var7 = param0.field_y;
          if (var6 >= param0.field_y) {
            break L0;
          } else {
            var8 = param3.field_d;
            if (var6 > -param3.field_d) {
              L1: {
                param2 = param2 + param0.field_v;
                param5 = param5 + param3.field_f;
                var9 = param5 - param2;
                var10 = param0.field_w;
                if (var9 >= param0.field_w) {
                  break L1;
                } else {
                  var11 = param3.field_k;
                  if (var9 > -param3.field_k) {
                    L2: {
                      if (var6 > 0) {
                        stackIn_9_0 = var6;
                        break L2;
                      } else {
                        stackIn_9_0 = 0;
                        break L2;
                      }
                    }
                    L3: {
                      var12 = stackIn_9_0;
                      var13 = var6 + var8;
                      if (var13 <= var7) {
                        break L3;
                      } else {
                        var13 = var7;
                        break L3;
                      }
                    }
                    L4: {
                      if (var9 > 0) {
                        stackIn_14_0 = var9;
                        break L4;
                      } else {
                        stackIn_14_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var14 = stackIn_14_0;
                      var15 = var9 + var11;
                      if (var15 <= var10) {
                        break L5;
                      } else {
                        var15 = var10;
                        break L5;
                      }
                    }
                    var13 = var13 - var12;
                    var15 = var15 - var14;
                    var16 = var14 * var7 + var12;
                    var17 = var7 - var13;
                    var18 = (var14 - var9) * var8 + (var12 - var6);
                    var19 = var8 - var13;
                    var30 = param0.field_B;
                    var31 = param3.field_m;
                    var22 = var15;
                    L6: while (true) {
                      if (var22 > 0) {
                        var23 = var13;
                        L7: while (true) {
                          if (var23 <= 0) {
                            var16 = var16 + var17;
                            var18 = var18 + var19;
                            var22--;
                            continue L6;
                          } else {
                            if (var30[var16] != 0) {
                              if (var31[var18] != 0) {
                                return true;
                              } else {
                                var16++;
                                var18++;
                                var23--;
                                continue L7;
                              }
                            } else {
                              var16++;
                              var18++;
                              var23--;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        return false;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              return false;
            } else {
              break L0;
            }
          }
        }
        return false;
    }
}
