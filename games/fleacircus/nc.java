/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static dd field_d;
    static String field_c;
    static int[] field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 < 48) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.equals("I")) {
                stackIn_7_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param1.equals("S")) {
                  if (param1.equals("J")) {
                    stackIn_14_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1.equals("Z")) {
                      stackIn_18_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param1.equals("F")) {
                        stackIn_22_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1.equals("D")) {
                          if (!param1.equals("C")) {
                            L1: {
                              if (param0 < -88) {
                                break L1;
                              } else {
                                field_a = (int[]) null;
                                break L1;
                              }
                            }
                            stackIn_32_0 = Class.forName(param1);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_28_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_25_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var2);

            stackIn_35_1 = new StringBuilder().append("nc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L2;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        return stackIn_32_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        int var1;
        int var2;
        var1 = -126 / ((-26 - param0) / 54);
        if ((th.field_D ^ -1) >= -33) {
          lg.a(-103, 0);
          if (fleas.field_A) {
            L0: {
              var2 = th.field_D % 32;
              if (0 != var2) {
                break L0;
              } else {
                var2 = 32;
                break L0;
              }
            }
            lg.a(-116, th.field_D - var2);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            var2 = th.field_D % 32;
            if (0 != var2) {
              break L1;
            } else {
              var2 = 32;
              break L1;
            }
          }
          lg.a(-116, th.field_D - var2);
          return;
        }
    }

    static {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_b = "End of free game!";
    }
}
