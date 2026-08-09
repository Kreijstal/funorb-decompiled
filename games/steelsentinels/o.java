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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -29) {
              L1: {
                if (null == da.a(param1, (byte) -41)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("o.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
