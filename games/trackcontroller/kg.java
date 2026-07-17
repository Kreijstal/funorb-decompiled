/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static qj[] field_e;
    static String field_a;
    static boolean field_f;
    static int field_d;
    static int[] field_b;
    static int field_c;

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static void a(boolean param0, byte param1, int param2, wb param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Throwable var6 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var4_int = -101 % ((param1 - 11) / 46);
              if (null == da.field_n) {
                break L1;
              } else {
                ia.a(param0, param2, 1048576, 1000000, param3);
                break L1;
              }
            }
            if (fj.field_P == null) {
              break L0;
            } else {
              var5 = (Object) (Object) sb.field_b;
              synchronized (var5) {
                L2: {
                  fj.field_P.a(param2, (byte) -113, -1);
                  if (param3 == ch.field_n) {
                    return;
                  } else {
                    L3: {
                      fj.field_P.f(11795);
                      sb.field_b.c();
                      ch.field_n = param3;
                      if (ch.field_n != null) {
                        fj.field_P.a(ch.field_n, 14526, param0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("kg.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 480;
        field_b = new int[256];
    }
}
