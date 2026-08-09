/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static db field_b;
    static hl field_c;
    static String field_a;
    static String[] field_d;

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -29 % ((param1 - -14) / 52);
            if (!param0.equals("B")) {
              if (param0.equals("I")) {
                stackIn_6_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.equals("S")) {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param0.equals("J")) {
                    if (!param0.equals("Z")) {
                      if (param0.equals("F")) {
                        stackIn_20_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0.equals("D")) {
                          stackIn_24_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param0.equals("C")) {
                            stackIn_29_0 = Class.forName(param0);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_27_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("hh.A(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L1;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        return stackIn_29_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 <= 119) {
          hh.a(-5, 126, -83, 41, -91);
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        nj.field_d = param2;
        i.field_n = param1;
        if (param4 >= -87) {
          hh.a((byte) 61);
          h.field_a = param3;
          hl.field_wb = param0;
          return;
        } else {
          h.field_a = param3;
          hl.field_wb = param0;
          return;
        }
    }

    static {
        field_a = "Loading fonts";
        field_b = new db(12, 0, 1, 0);
        field_d = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
