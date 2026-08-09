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
        int var2;
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
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.equals("I")) {
                stackIn_7_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.equals("S")) {
                  stackIn_11_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.equals("J")) {
                    stackIn_15_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1) {
                      if (param0.equals("Z")) {
                        stackIn_22_0 = Boolean.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param0.equals("F")) {
                          if (param0.equals("D")) {
                            stackIn_29_0 = Double.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (param0.equals("C")) {
                              stackIn_33_0 = Character.TYPE;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return Class.forName(param0);
                            }
                          }
                        } else {
                          stackIn_25_0 = Float.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_18_0 = (Class) null;
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
            stackIn_36_0 = (RuntimeException) (var2);

            stackIn_36_1 = new StringBuilder().append("pj.J(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L1;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
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
