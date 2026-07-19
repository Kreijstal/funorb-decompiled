/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pj implements ia {
    static int[] field_b;
    static String field_e;
    private long field_f;
    static so field_c;
    static String field_d;
    static int field_a;

    public final String a(int param0) {
        int var2 = 0;
        var2 = -4 / ((-23 - param0) / 56);
        if (!this.a((byte) -119)) {
          if ((ue.a(false) ^ -1L) > (350L + this.field_f ^ -1L)) {
            return null;
          } else {
            return this.b(28600);
          }
        } else {
          return null;
        }
    }

    public final void a(boolean param0) {
        this.field_f = ue.a(param0);
    }

    public static void d(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != 31366) {
            pj.d(-12);
        }
    }

    abstract qh c(int param0);

    abstract String b(int param0);

    public final qh b(byte param0) {
        if (!this.a((byte) -44)) {
          if (param0 == -31) {
            if (ue.a(false) < this.field_f - -350L) {
              return m.field_c;
            } else {
              return this.c(4);
            }
          } else {
            pj.d(100);
            if (ue.a(false) < this.field_f - -350L) {
              return m.field_c;
            } else {
              return this.c(4);
            }
          }
        } else {
          return uo.field_f;
        }
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_10_0 = null;
        Class stackOut_14_0 = null;
        Class stackOut_21_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_32_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_17_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        try {
          L0: {
            if (param0.equals("B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.equals("I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.equals("S")) {
                  stackOut_10_0 = Short.TYPE;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.equals("J")) {
                    stackOut_14_0 = Long.TYPE;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1) {
                      if (param0.equals("Z")) {
                        stackOut_21_0 = Boolean.TYPE;
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param0.equals("F")) {
                          if (param0.equals("D")) {
                            stackOut_28_0 = Double.TYPE;
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (param0.equals("C")) {
                              stackOut_32_0 = Character.TYPE;
                              stackIn_33_0 = stackOut_32_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return Class.forName(param0);
                            }
                          }
                        } else {
                          stackOut_24_0 = Float.TYPE;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_17_0 = (Class) null;
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var2);
            stackOut_34_1 = new StringBuilder().append("pj.J(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L1;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
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
                        return stackIn_29_0;
                      } else {
                        return stackIn_33_0;
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
        field_d = "Score";
        field_e = "Return to game";
    }
}
