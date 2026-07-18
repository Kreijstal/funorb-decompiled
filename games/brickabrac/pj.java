/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

abstract class pj implements ia {
    static int[] field_b;
    static String field_e;
    private long field_f;
    static so field_c;
    static String field_d;
    static int field_a;

    public final String a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var2_int = -4 / ((-23 - param0) / 56);
            if (!((pj) this).a((byte) -119)) {
              if (~ue.a(false) <= ~(350L + ((pj) this).field_f)) {
                stackOut_6_0 = ((pj) this).b(28600);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "pj.K(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    public final void a(boolean param0) {
        try {
            ((pj) this).field_f = ue.a(param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "pj.P(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        try {
            field_c = null;
            field_e = null;
            field_b = null;
            field_d = null;
            if (param0 != 31366) {
                pj.d(-12);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "pj.N(" + param0 + ')');
        }
    }

    abstract qh c(int param0);

    abstract String b(int param0);

    public final qh b(byte param0) {
        RuntimeException var2 = null;
        qh stackIn_2_0 = null;
        qh stackIn_8_0 = null;
        qh stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        qh stackOut_9_0 = null;
        qh stackOut_7_0 = null;
        qh stackOut_1_0 = null;
        try {
          L0: {
            if (!((pj) this).a((byte) -44)) {
              L1: {
                if (param0 == -31) {
                  break L1;
                } else {
                  pj.d(100);
                  break L1;
                }
              }
              if (ue.a(false) >= ((pj) this).field_f - -350L) {
                stackOut_9_0 = ((pj) this).c(4);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = m.field_c;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_1_0 = uo.field_f;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "pj.M(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_4_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_31_0 = null;
        Class stackIn_37_0 = null;
        Class stackIn_42_0 = null;
        Class stackIn_44_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_3_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_18_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_36_0 = null;
        Class stackOut_41_0 = null;
        Class stackOut_43_0 = null;
        Class stackOut_30_0 = null;
        Object stackOut_21_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_3_0 = Byte.TYPE;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0.equals((Object) (Object) "I")) {
                stackOut_8_0 = Integer.TYPE;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param0.equals((Object) (Object) "S")) {
                  stackOut_13_0 = Short.TYPE;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  if (param0.equals((Object) (Object) "J")) {
                    stackOut_18_0 = Long.TYPE;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0;
                  } else {
                    if (param1) {
                      if (param0.equals((Object) (Object) "Z")) {
                        stackOut_27_0 = Boolean.TYPE;
                        stackIn_28_0 = stackOut_27_0;
                        return stackIn_28_0;
                      } else {
                        if (!param0.equals((Object) (Object) "F")) {
                          if (param0.equals((Object) (Object) "D")) {
                            stackOut_36_0 = Double.TYPE;
                            stackIn_37_0 = stackOut_36_0;
                            return stackIn_37_0;
                          } else {
                            if (param0.equals((Object) (Object) "C")) {
                              stackOut_41_0 = Character.TYPE;
                              stackIn_42_0 = stackOut_41_0;
                              return stackIn_42_0;
                            } else {
                              stackOut_43_0 = Class.forName(param0);
                              stackIn_44_0 = stackOut_43_0;
                              break L0;
                            }
                          }
                        } else {
                          stackOut_30_0 = Float.TYPE;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        }
                      }
                    } else {
                      stackOut_21_0 = null;
                      stackIn_22_0 = stackOut_21_0;
                      return (Class) (Object) stackIn_22_0;
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
            stackOut_45_0 = (RuntimeException) var2;
            stackOut_45_1 = new StringBuilder().append("pj.J(");
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L1;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param1 + ')');
        }
        return stackIn_44_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Score";
        field_e = "Return to game";
    }
}
