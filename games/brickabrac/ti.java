/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    private static String field_z;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param5 <= param6) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 > 1 + param6) {
                L1: {
                  if (5 + param6 >= param2) {
                    break L1;
                  } else {
                    if (param0 != param1) {
                      if (param4 > 93) {
                        var7_int = (param1 >> -638526559) - (-(param0 >> 502774113) - (1 & (param0 & param1)));
                        var8 = param6;
                        var9 = param0;
                        var10 = param1;
                        var11 = param6;
                        L2: while (true) {
                          if (param2 <= var11) {
                            ti.a(param0, var9, var8, param3, 125, param5, param6);
                            ti.a(var10, param1, param2, param3, 99, param5, var8);
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            L3: {
                              var12 = fj.field_Pb[var11];
                              if (param3) {
                                stackOut_24_0 = ec.field_N[var12];
                                stackIn_25_0 = stackOut_24_0;
                                break L3;
                              } else {
                                stackOut_23_0 = pj.field_b[var12];
                                stackIn_25_0 = stackOut_23_0;
                                break L3;
                              }
                            }
                            L4: {
                              var13 = stackIn_25_0;
                              if (var7_int < var13) {
                                L5: {
                                  fj.field_Pb[var11] = fj.field_Pb[var8];
                                  if (var13 >= var9) {
                                    break L5;
                                  } else {
                                    var9 = var13;
                                    break L5;
                                  }
                                }
                                incrementValue$1 = var8;
                                var8++;
                                fj.field_Pb[incrementValue$1] = var12;
                                break L4;
                              } else {
                                if (var10 < var13) {
                                  var10 = var13;
                                  break L4;
                                } else {
                                  var11++;
                                  continue L2;
                                }
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param2;
                L6: while (true) {
                  if (var7_int <= param6) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param6;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = fj.field_Pb[var8];
                          var10 = fj.field_Pb[var8 + 1];
                          if (!nd.a(true, var10, var9, param3)) {
                            break L8;
                          } else {
                            fj.field_Pb[var8] = var10;
                            fj.field_Pb[1 + var8] = var9;
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var7), field_z + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        field_z = "ti.A(";
    }
}
