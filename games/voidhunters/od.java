/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    static int field_a;

    od(uq param0, int param1, int param2, int param3) {
    }

    final static int a(boolean param0, mj param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              if (mj.field_g != param1) {
                if (param1 == mj.field_i) {
                  stackIn_27_0 = 5122;
                  decompiledRegionSelector0 = 8;
                  break L0;
                } else {
                  if (mj.field_c != param1) {
                    if (mj.field_f != param1) {
                      if (mj.field_e == param1) {
                        stackIn_25_0 = 5123;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        if (mj.field_a != param1) {
                          if (mj.field_b == param1) {
                            stackIn_23_0 = 5131;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (param1 == mj.field_d) {
                              stackIn_21_0 = 5126;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              throw new IllegalArgumentException("");
                            }
                          }
                        } else {
                          stackIn_16_0 = 5125;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_12_0 = 5121;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_9_0 = 5124;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = 5120;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 25;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("od.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L1;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_25_0;
                      } else {
                        return stackIn_27_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_a = 0;
    }
}
