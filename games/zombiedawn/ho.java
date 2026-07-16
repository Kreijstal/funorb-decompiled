/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    static int field_b;
    static String[] field_a;

    final static void a(int param0, byte param1, int param2) {
        param2 = param2 / 24;
        param0 = param0 / 24;
        if ((param2 ^ -1) <= -1) {
          if (vm.field_u[0].length > param2) {
            if (0 <= param0) {
              if (param0 < vm.field_u.length) {
                if (param1 != 54) {
                  return;
                } else {
                  L0: {
                    vm.field_u[param0][param2] = vm.field_u[param0][param2] - 1;
                    if (-1 < (vm.field_u[param0][param2] - 1 ^ -1)) {
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
        } else {
          return;
        }
    }

    final static void a(vn param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var7 = ZombieDawn.field_J;
        var4 = 14059691;
        if (param3 >= -102) {
          field_a = null;
          var5 = 10210196;
          var6 = param2;
          if (var6 != -1) {
            if ((var6 ^ -1) != -1) {
              if (var6 != 1) {
                if (-3 != (var6 ^ -1)) {
                  if (3 == var6) {
                    L0: {
                      var5 = 2267494;
                      if (!param1) {
                        stackOut_65_0 = 4618411;
                        stackIn_66_0 = stackOut_65_0;
                        break L0;
                      } else {
                        stackOut_64_0 = 13357901;
                        stackIn_66_0 = stackOut_64_0;
                        break L0;
                      }
                    }
                    var4 = stackIn_66_0;
                    sj.a(var4, -1380633400, var5, param0);
                    return;
                  } else {
                    if ((var6 ^ -1) != -10) {
                      sj.a(var4, -1380633400, var5, param0);
                      return;
                    } else {
                      var4 = 13542477;
                      var5 = 13843485;
                      sj.a(var4, -1380633400, var5, param0);
                      return;
                    }
                  }
                } else {
                  L1: {
                    if (param1) {
                      stackOut_61_0 = 5410749;
                      stackIn_62_0 = stackOut_61_0;
                      break L1;
                    } else {
                      stackOut_60_0 = 4618411;
                      stackIn_62_0 = stackOut_60_0;
                      break L1;
                    }
                  }
                  var4 = stackIn_62_0;
                  var5 = 8947848;
                  sj.a(var4, -1380633400, var5, param0);
                  return;
                }
              } else {
                L2: {
                  var5 = 15420180;
                  if (param1) {
                    stackOut_57_0 = 14868269;
                    stackIn_58_0 = stackOut_57_0;
                    break L2;
                  } else {
                    stackOut_56_0 = 14084155;
                    stackIn_58_0 = stackOut_56_0;
                    break L2;
                  }
                }
                var4 = stackIn_58_0;
                sj.a(var4, -1380633400, var5, param0);
                return;
              }
            } else {
              L3: {
                if (param1) {
                  stackOut_53_0 = 14868413;
                  stackIn_54_0 = stackOut_53_0;
                  break L3;
                } else {
                  stackOut_52_0 = 14059691;
                  stackIn_54_0 = stackOut_52_0;
                  break L3;
                }
              }
              var4 = stackIn_54_0;
              var5 = 10210196;
              sj.a(var4, -1380633400, var5, param0);
              return;
            }
          } else {
            L4: {
              if (param1) {
                stackOut_40_0 = 14868413;
                stackIn_41_0 = stackOut_40_0;
                break L4;
              } else {
                stackOut_39_0 = 14059691;
                stackIn_41_0 = stackOut_39_0;
                break L4;
              }
            }
            var4 = stackIn_41_0;
            var5 = 10210196;
            sj.a(var4, -1380633400, var5, param0);
            return;
          }
        } else {
          var5 = 10210196;
          var6 = param2;
          if (var6 == -1) {
            L5: {
              if (param1) {
                stackOut_16_0 = 14868413;
                stackIn_17_0 = stackOut_16_0;
                break L5;
              } else {
                stackOut_15_0 = 14059691;
                stackIn_17_0 = stackOut_15_0;
                break L5;
              }
            }
            var4 = stackIn_17_0;
            var5 = 10210196;
            sj.a(var4, -1380633400, var5, param0);
            return;
          } else {
            if ((var6 ^ -1) != -1) {
              if (var6 != 1) {
                if (-3 != (var6 ^ -1)) {
                  if (3 == var6) {
                    L6: {
                      var5 = 2267494;
                      if (!param1) {
                        stackOut_28_0 = 4618411;
                        stackIn_29_0 = stackOut_28_0;
                        break L6;
                      } else {
                        stackOut_27_0 = 13357901;
                        stackIn_29_0 = stackOut_27_0;
                        break L6;
                      }
                    }
                    var4 = stackIn_29_0;
                    sj.a(var4, -1380633400, var5, param0);
                    return;
                  } else {
                    if ((var6 ^ -1) != -10) {
                      sj.a(var4, -1380633400, var5, param0);
                      return;
                    } else {
                      var4 = 13542477;
                      var5 = 13843485;
                      sj.a(var4, -1380633400, var5, param0);
                      return;
                    }
                  }
                } else {
                  L7: {
                    if (param1) {
                      stackOut_24_0 = 5410749;
                      stackIn_25_0 = stackOut_24_0;
                      break L7;
                    } else {
                      stackOut_23_0 = 4618411;
                      stackIn_25_0 = stackOut_23_0;
                      break L7;
                    }
                  }
                  var4 = stackIn_25_0;
                  var5 = 8947848;
                  sj.a(var4, -1380633400, var5, param0);
                  return;
                }
              } else {
                L8: {
                  var5 = 15420180;
                  if (param1) {
                    stackOut_20_0 = 14868269;
                    stackIn_21_0 = stackOut_20_0;
                    break L8;
                  } else {
                    stackOut_19_0 = 14084155;
                    stackIn_21_0 = stackOut_19_0;
                    break L8;
                  }
                }
                var4 = stackIn_21_0;
                sj.a(var4, -1380633400, var5, param0);
                return;
              }
            } else {
              L9: {
                if (param1) {
                  stackOut_5_0 = 14868413;
                  stackIn_6_0 = stackOut_5_0;
                  break L9;
                } else {
                  stackOut_4_0 = 14059691;
                  stackIn_6_0 = stackOut_4_0;
                  break L9;
                }
              }
              var4 = stackIn_6_0;
              var5 = 10210196;
              sj.a(var4, -1380633400, var5, param0);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 118) {
            Object var2 = null;
            ho.a((vn) null, false, 18, -108);
        }
    }

    static {
    }
}
