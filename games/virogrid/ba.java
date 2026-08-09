/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ba {
    static il field_c;
    static int field_a;
    static String field_b;

    final static String a(String param0, int param1, byte param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-4 == (param1 ^ -1)) {
              stackIn_3_0 = nm.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 == 83) {
                if ((param1 ^ -1) != -7) {
                  if (-8 == (param1 ^ -1)) {
                    stackIn_13_0 = hg.field_o;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((param1 ^ -1) != -9) {
                      if (param1 == 9) {
                        stackIn_20_0 = wc.field_e;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if ((param1 ^ -1) == -11) {
                          stackIn_24_0 = se.field_a;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (11 != param1) {
                            if (param1 == 14) {
                              stackIn_31_0 = oi.a(new String[]{param0}, oe.field_d, param2 ^ 81);
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return null;
                            }
                          } else {
                            stackIn_27_0 = qd.field_g;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = ti.field_c;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = na.field_Eb;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("ba.E(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L1;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ')');
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
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    abstract int a(int param0, int param1);

    final static void b(int param0) {
        if (param0 != 14) {
            ba.a(-71);
        }
    }

    abstract sj a(byte param0);

    abstract byte[] b(int param0, int param1);

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 14) {
            field_b = (String) null;
        }
    }

    static {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
