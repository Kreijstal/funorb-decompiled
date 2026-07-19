/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe implements so {
    static String[] field_b;
    static String field_d;
    static sna field_c;
    static String field_a;

    final static void a(int param0, lu param1, it param2) {
        if (param2 == null) {
            return;
        }
        try {
            param1.d(param2.field_e, 0);
            param1.d(param2.field_h, param0 + 21332);
            param1.d(param2.field_m, 0);
            param1.b(param2.field_b, -114);
            param1.d(param2.field_a ? 1 : 0, param0 ^ param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "oe.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        if (0 > param0) {
            param0 = 0;
        } else {
            if ((param0 ^ -1) < -231) {
                param0 = 230;
            }
        }
        gka.a(102, param0);
        if (param1 < 11) {
            oe.a(-101, -109, 0, -60, 10, -92);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            var6_int = param4 + -param0;
            var7 = param3 - param5;
            if (param2 <= -75) {
              if (0 == var7) {
                L1: {
                  if (0 != var6_int) {
                    ada.a(param0, param1, param5, 117, param4);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (0 != var6_int) {
                  L2: {
                    if (var6_int < 0) {
                      var6_int = -var6_int;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (0 > var7) {
                      var7 = -var7;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var6_int <= var7) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L4;
                    } else {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L4;
                    }
                  }
                  L5: {
                    var8 = stackIn_20_0;
                    if (var8 == 0) {
                      break L5;
                    } else {
                      var9 = param5;
                      var10 = param3;
                      param5 = param0;
                      param0 = var9;
                      param3 = param4;
                      param4 = var10;
                      break L5;
                    }
                  }
                  L6: {
                    if (param5 > param3) {
                      var9 = param5;
                      var10 = param0;
                      param5 = param3;
                      param3 = var9;
                      param0 = param4;
                      param4 = var10;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var9 = param0;
                    var10 = -param5 + param3;
                    var11 = -param0 + param4;
                    var12 = -(var10 >> 1707955873);
                    if (param0 < param4) {
                      stackOut_27_0 = 1;
                      stackIn_28_0 = stackOut_27_0;
                      break L7;
                    } else {
                      stackOut_26_0 = -1;
                      stackIn_28_0 = stackOut_26_0;
                      break L7;
                    }
                  }
                  L8: {
                    var13 = stackIn_28_0;
                    if (var11 >= 0) {
                      break L8;
                    } else {
                      var11 = -var11;
                      break L8;
                    }
                  }
                  L9: {
                    if (var8 != 0) {
                      var16 = param5;
                      var14 = var16;
                      L10: while (true) {
                        if (param3 < var16) {
                          break L9;
                        } else {
                          L11: {
                            tj.field_b[var16][var9] = param1;
                            var12 = var12 + var11;
                            if (var12 > 0) {
                              var12 = var12 - var10;
                              var9 = var9 + var13;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var16++;
                          continue L10;
                        }
                      }
                    } else {
                      var14 = param5;
                      L12: while (true) {
                        if (var14 > param3) {
                          break L9;
                        } else {
                          tj.field_b[var9][var14] = param1;
                          var12 = var12 + var11;
                          if (-1 > (var12 ^ -1)) {
                            var9 = var9 + var13;
                            var12 = var12 - var10;
                            var14++;
                            continue L12;
                          } else {
                            var14++;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  ew.a(param5, param0, -94, param1, param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "oe.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0) {
            field_d = (String) null;
        }
        field_d = null;
    }

    static {
        field_a = "Honour";
        field_b = new String[]{"By rating", "By win percentage"};
        field_d = "Now feel free to experiment and breed more creatures. When you're ready, click the arena portal to enter the arena! Click here to close.";
    }
}
