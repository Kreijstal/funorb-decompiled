/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends gg {
    static String field_k;
    static String field_o;
    static String field_l;
    boolean field_n;
    int[] field_m;

    public static void a(byte param0) {
        field_k = null;
        field_o = null;
        int var1 = -67 / ((param0 - 35) / 55);
        field_l = null;
    }

    final static Class b(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
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
            if (param0.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 < -52) {
                if (param0.equals("I")) {
                  stackIn_10_0 = Integer.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param0.equals("S")) {
                    if (!param0.equals("J")) {
                      if (param0.equals("Z")) {
                        stackIn_20_0 = Boolean.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0.equals("F")) {
                          stackIn_24_0 = Float.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param0.equals("D")) {
                            if (!param0.equals("C")) {
                              stackIn_32_0 = Class.forName(param0);
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackIn_30_0 = Character.TYPE;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            stackIn_27_0 = Double.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = Long.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = Short.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = (Class) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var2);

            stackIn_35_1 = new StringBuilder().append("he.B(");

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
          throw ma.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
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
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_30_0;
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
    }

    final static pb[] a(byte param0, int param1) {
        pb[] var2;
        pb[] var3;
        if (param0 > -107) {
          field_k = (String) null;
          var3 = new pb[9];
          var2 = var3;
          var3[4] = cl.a(param1, 1, 64);
          return var2;
        } else {
          var3 = new pb[9];
          var2 = var3;
          var3[4] = cl.a(param1, 1, 64);
          return var2;
        }
    }

    he() {
        this.field_n = false;
    }

    static {
        field_k = "Shoots all round";
        field_o = "Waiting for models";
        field_l = "Heavy cannon";
    }
}
