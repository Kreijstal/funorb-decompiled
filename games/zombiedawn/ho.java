/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    static int field_b;
    static String[] field_a;

    final static void a(int param0, byte param1, int param2) {
        param2 = param2 / 24;
        param0 = param0 / 24;
        if (param2 >= 0) {
          if (vm.field_u[0].length > param2) {
            if (0 <= param0) {
              if (param0 >= vm.field_u.length) {
                return;
              } else {
                L0: {
                  vm.field_u[param0][param2] = vm.field_u[param0][param2] - 1;
                  if (vm.field_u[param0][param2] - 1 < 0) {
                    vm.field_u[param0][param2] = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                }
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

    final static void a(vn param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var4_int = 14059691;
              if (param3 < -102) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var5 = 10210196;
                var6 = param2;
                if (var6 == -1) {
                  break L3;
                } else {
                  if (var6 != 0) {
                    if (var6 != 1) {
                      if (var6 != 2) {
                        if (3 == var6) {
                          L4: {
                            var5 = 2267494;
                            if (!param1) {
                              stackOut_27_0 = 4618411;
                              stackIn_28_0 = stackOut_27_0;
                              break L4;
                            } else {
                              stackOut_26_0 = 13357901;
                              stackIn_28_0 = stackOut_26_0;
                              break L4;
                            }
                          }
                          var4_int = stackIn_28_0;
                          break L2;
                        } else {
                          if (var6 != 9) {
                            break L2;
                          } else {
                            var4_int = 13542477;
                            var5 = 13843485;
                            break L2;
                          }
                        }
                      } else {
                        L5: {
                          if (param1) {
                            stackOut_23_0 = 5410749;
                            stackIn_24_0 = stackOut_23_0;
                            break L5;
                          } else {
                            stackOut_22_0 = 4618411;
                            stackIn_24_0 = stackOut_22_0;
                            break L5;
                          }
                        }
                        var4_int = stackIn_24_0;
                        var5 = 8947848;
                        break L2;
                      }
                    } else {
                      L6: {
                        var5 = 15420180;
                        if (param1) {
                          stackOut_19_0 = 14868269;
                          stackIn_20_0 = stackOut_19_0;
                          break L6;
                        } else {
                          stackOut_18_0 = 14084155;
                          stackIn_20_0 = stackOut_18_0;
                          break L6;
                        }
                      }
                      var4_int = stackIn_20_0;
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if (param1) {
                  stackOut_15_0 = 14868413;
                  stackIn_16_0 = stackOut_15_0;
                  break L7;
                } else {
                  stackOut_14_0 = 14059691;
                  stackIn_16_0 = stackOut_14_0;
                  break L7;
                }
              }
              var4_int = stackIn_16_0;
              var5 = 10210196;
              break L2;
            }
            sj.a(var4_int, -1380633400, var5, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var4;
            stackOut_32_1 = new StringBuilder().append("ho.B(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
    }
}
