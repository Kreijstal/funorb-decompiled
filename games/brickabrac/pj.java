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
        int var2 = 0;
        var2 = -4 / ((-23 - param0) / 56);
        if (!((pj) this).a((byte) -119)) {
          if (~ue.a(false) > ~(350L + ((pj) this).field_f)) {
            return null;
          } else {
            return ((pj) this).b(28600);
          }
        } else {
          return null;
        }
    }

    public final void a(boolean param0) {
        ((pj) this).field_f = ue.a(param0);
    }

    public static void d(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 == 31366) {
            return;
        }
        pj.d(-12);
    }

    abstract qh c(int param0);

    abstract String b(int param0);

    public final qh b(byte param0) {
        if (!((pj) this).a((byte) -44)) {
          L0: {
            if (param0 == -31) {
              break L0;
            } else {
              pj.d(100);
              break L0;
            }
          }
          if (ue.a(false) < ((pj) this).field_f - -350L) {
            return m.field_c;
          } else {
            return ((pj) this).c(4);
          }
        } else {
          return uo.field_f;
        }
    }

    final static Class a(String param0) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_4_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_30_0 = null;
        Class stackIn_35_0 = null;
        Class stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_3_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_18_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_34_0 = null;
        Class stackOut_38_0 = null;
        Class stackOut_29_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
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
                    if (param0.equals((Object) (Object) "Z")) {
                      stackOut_26_0 = Boolean.TYPE;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0;
                    } else {
                      if (!param0.equals((Object) (Object) "F")) {
                        if (param0.equals((Object) (Object) "D")) {
                          stackOut_34_0 = Double.TYPE;
                          stackIn_35_0 = stackOut_34_0;
                          return stackIn_35_0;
                        } else {
                          if (param0.equals((Object) (Object) "C")) {
                            stackOut_38_0 = Character.TYPE;
                            stackIn_39_0 = stackOut_38_0;
                            break L0;
                          } else {
                            return Class.forName(param0);
                          }
                        }
                      } else {
                        stackOut_29_0 = Float.TYPE;
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0;
                      }
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
            stackOut_40_0 = (RuntimeException) var2;
            stackOut_40_1 = new StringBuilder().append("pj.J(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L1;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + 1 + 41);
        }
        return stackIn_39_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Score";
        field_e = "Return to game";
    }
}
