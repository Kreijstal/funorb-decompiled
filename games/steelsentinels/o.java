/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static String field_f;
    static int field_b;
    static boolean field_c;
    static String field_a;
    static ul field_d;
    static String field_e;

    final static int a(byte param0, int param1) {
        if (param1 == 0) {
          return 0;
        } else {
          if (-56 == (param1 ^ -1)) {
            return 1;
          } else {
            if (param1 != 57) {
              if ((param1 ^ -1) != -63) {
                if (param1 == 65) {
                  return 4;
                } else {
                  if (-70 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    if (param0 == 84) {
                      if (-73 != (param1 ^ -1)) {
                        if (param1 == 75) {
                          return 7;
                        } else {
                          if (79 == param1) {
                            return 8;
                          } else {
                            if ((param1 ^ -1) == -85) {
                              return 9;
                            } else {
                              if (param1 == 88) {
                                return 10;
                              } else {
                                if (92 == param1) {
                                  return 11;
                                } else {
                                  if (-110 == (param1 ^ -1)) {
                                    return 12;
                                  } else {
                                    if (param1 == 107) {
                                      return 12;
                                    } else {
                                      if (param1 == 108) {
                                        return 12;
                                      } else {
                                        return -1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        return 6;
                      }
                    } else {
                      return -41;
                    }
                  }
                }
              } else {
                return 3;
              }
            } else {
              return 2;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
        if (param0 > -16) {
            field_d = (ul) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 < -29) {
              L1: {
                if (null == da.a(param1, (byte) -41)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("o.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    static {
        field_f = "You cannot add yourself!";
        field_c = false;
        field_a = "Camera up/down: Inverted";
        field_e = "The '<%0>' setting needs to be changed.";
    }
}
