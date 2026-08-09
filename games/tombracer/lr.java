/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends RuntimeException {
    String field_d;
    static jea field_b;
    Throwable field_a;
    static String field_e;
    static int field_c;

    final static int a(una param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == una.field_a) {
              stackIn_23_0 = 5120;
              decompiledRegionSelector0 = 7;
              break L0;
            } else {
              if (param0 != una.field_k) {
                if (param0 != una.field_m) {
                  if (una.field_g != param0) {
                    if (una.field_f == param0) {
                      stackIn_21_0 = 5123;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      if (param0 == una.field_i) {
                        stackIn_19_0 = 5125;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0 != una.field_l) {
                          if (param0 != una.field_h) {
                            if (param1 == 5126) {
                              throw new IllegalArgumentException("");
                            } else {
                              stackIn_26_0 = 1;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            stackIn_17_0 = 5126;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        } else {
                          stackIn_14_0 = 5131;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  } else {
                    stackIn_9_0 = 5121;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_6_0 = 5124;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_3_0 = 5122;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("lr.B(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L1;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_21_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_23_0;
                      } else {
                        return stackIn_26_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static float a(float param0, int param1, float param2, float param3) {
        if (param1 != 5122) {
          field_b = (jea) null;
          return param0 * (-param3 + param2) + param3;
        } else {
          return param0 * (-param3 + param2) + param3;
        }
    }

    lr(Throwable param0, String param1) {
        this.field_a = param0;
        this.field_d = param1;
    }

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        if (param0) {
            una var2 = (una) null;
            lr.a((una) null, 48);
        }
    }

    static {
        field_e = "Nutritious and delicious, there are rumours that this foul-smelling concoction has helpful effects when heated.";
    }
}
