/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    static cp field_b;
    static int field_a;

    public static void b(int param0) {
        int var1 = -16;
        field_b = null;
    }

    final static boolean a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_66_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        var1 = 1;
        var2 = m.field_i;
        if (var2 != 0) {
          if (1 != var2) {
            if (var2 != 2) {
              if (var2 != 3) {
                if (4 != var2) {
                  if (var2 != 5) {
                    if (6 != var2) {
                      if (7 != var2) {
                        return true;
                      } else {
                        L0: {
                          if (!m.field_f.a(-123, oj.field_q, 22050, ic.field_a, gf.field_e)) {
                            stackOut_41_0 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            break L0;
                          } else {
                            stackOut_40_0 = 1;
                            stackIn_42_0 = stackOut_40_0;
                            break L0;
                          }
                        }
                        L1: {
                          var1 = stackIn_42_0;
                          if (var1 != 0) {
                            m.field_i = m.field_i + 1;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        return false;
                      }
                    } else {
                      L2: {
                        if (!m.field_f.a(-111, c.field_j, 22050, ic.field_a, gf.field_e)) {
                          stackOut_65_0 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          break L2;
                        } else {
                          stackOut_64_0 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          break L2;
                        }
                      }
                      L3: {
                        var1 = stackIn_66_0;
                        if (var1 != 0) {
                          m.field_i = m.field_i + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return false;
                    }
                  } else {
                    L4: {
                      if (!m.field_f.a(-112, uk.field_t, 22050, ic.field_a, gf.field_e)) {
                        stackOut_58_0 = 0;
                        stackIn_59_0 = stackOut_58_0;
                        break L4;
                      } else {
                        stackOut_57_0 = 1;
                        stackIn_59_0 = stackOut_57_0;
                        break L4;
                      }
                    }
                    L5: {
                      var1 = stackIn_59_0;
                      if (var1 != 0) {
                        m.field_i = m.field_i + 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return false;
                  }
                } else {
                  L6: {
                    if (!m.field_f.a(-114, cd.field_g, 22050, ic.field_a, gf.field_e)) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L6;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L6;
                    }
                  }
                  L7: {
                    var1 = stackIn_30_0;
                    if (var1 != 0) {
                      m.field_i = m.field_i + 1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return false;
                }
              } else {
                L8: {
                  oj.field_q = vm.a(kc.field_j, "", "BaB_podium");
                  if (null == oj.field_q) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L8;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L8;
                  }
                }
                L9: {
                  var1 = stackIn_22_0;
                  if (var1 != 0) {
                    m.field_i = m.field_i + 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return false;
              }
            } else {
              L10: {
                c.field_j = vm.a(kc.field_j, "", "BaB_game_completed");
                if (null == c.field_j) {
                  stackOut_50_0 = 0;
                  stackIn_51_0 = stackOut_50_0;
                  break L10;
                } else {
                  stackOut_49_0 = 1;
                  stackIn_51_0 = stackOut_49_0;
                  break L10;
                }
              }
              L11: {
                var1 = stackIn_51_0;
                if (var1 != 0) {
                  m.field_i = m.field_i + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              return false;
            }
          } else {
            L12: {
              uk.field_t = vm.a(kc.field_j, "", "BaB_panic");
              if (uk.field_t == null) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L12;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L12;
              }
            }
            L13: {
              var1 = stackIn_12_0;
              if (var1 != 0) {
                m.field_i = m.field_i + 1;
                break L13;
              } else {
                break L13;
              }
            }
            return false;
          }
        } else {
          L14: {
            cd.field_g = vm.a(kc.field_j, "", "BaB_title_music");
            if (null == cd.field_g) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L14;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L14;
            }
          }
          L15: {
            var1 = stackIn_4_0;
            if (var1 != 0) {
              m.field_i = m.field_i + 1;
              break L15;
            } else {
              break L15;
            }
          }
          return false;
        }
    }

    final static void a(int param0, int param1, jp param2, int param3, int param4, int param5, int param6, int param7, jp param8, jp param9, int param10) {
        RuntimeException var11 = null;
        Object var12 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              param9.d((param4 - param9.field_x) / 2 + (param6 + (param1 * 5 >> 16)), param0);
              uq.a(param2, 5 / param7 + (10 * param1 >> 16) + ((param4 + -param2.field_x) / 2 + param6), 53 / param7 + -param2.field_z + (param5 + param0 - -480));
              uq.a(param8, -(5 / param7) + (param6 - (-((param4 - param8.field_x) / 2) - (param1 * 20 >> 16))), 480 + -param8.field_z);
              if (param3 > 108) {
                break L1;
              } else {
                var12 = null;
                wo.a(25, -97, (jp) null, -16, -115, 10, -8, 2, (jp) null, (jp) null, -69);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var11;
            stackOut_3_1 = new StringBuilder().append("wo.B(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param8 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param9 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param10 + ')');
        }
    }

    static {
    }
}
