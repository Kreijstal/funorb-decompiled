/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static String field_f;
    int field_c;
    String field_b;
    static ek field_j;
    String field_a;
    static int field_i;
    qk field_d;
    static String field_e;
    String field_g;
    static long field_h;
    static int field_k;

    public static void a(int param0) {
        field_f = null;
        field_j = null;
        if (param0 != 0) {
            field_j = (ek) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.equals("B")) {
              L1: {
                if (param1 <= -54) {
                  break L1;
                } else {
                  t.a((byte) 20);
                  break L1;
                }
              }
              if (param0.equals("I")) {
                stackIn_8_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param0.equals("S")) {
                  if (param0.equals("J")) {
                    stackIn_15_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param0.equals("Z")) {
                      stackIn_19_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!param0.equals("F")) {
                        if (param0.equals("D")) {
                          stackIn_26_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param0.equals("C")) {
                            stackIn_31_0 = Class.forName(param0);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_29_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_22_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_11_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
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
          L2: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("t.C(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
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

    final static void a(byte param0) {
        if (param0 < 84) {
            return;
        }
        ri.field_c = rd.field_j.c(false);
        CharSequence var2 = (CharSequence) ((Object) ri.field_c);
        aa.field_fb = ff.a((byte) 116, var2);
    }

    private t() throws Throwable {
        throw new Error();
    }

    static {
        field_f = "Service unavailable";
        field_i = 111;
        field_e = null;
        field_h = 0L;
        field_k = 20;
    }
}
