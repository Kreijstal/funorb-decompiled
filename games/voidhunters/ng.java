/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng implements dja {
    static String field_a;

    final static caa[] a(int param0, byte param1, int param2, asb param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        caa[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        caa[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (pa.a(param0, 2, param3, param2)) {
              var4_int = -44 % ((param1 - 53) / 50);
              stackOut_3_0 = ola.d((byte) -91);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ng.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public final tv a(byte param0) {
        int var2 = 29 / ((-64 - param0) / 50);
        return (tv) (Object) new tw();
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        if (Math.max(param3, param5) >= Math.min(param7, param4)) {
          if (Math.max(param1, param9) >= Math.min(param6, param8)) {
            if (Math.max(param7, param4) >= Math.min(param3, param5)) {
              if (Math.max(param6, param8) >= Math.min(param1, param9)) {
                L0: {
                  param4 = param4 - param7;
                  param9 = param9 - param1;
                  param5 = param5 - param3;
                  param8 = param8 - param6;
                  param1 = param1 - param6;
                  param3 = param3 - param7;
                  var10 = -14 + Math.max(Math.max(vma.a(112, param3), vma.a(119, param5)), vma.a(112, param4));
                  if (var10 <= 0) {
                    break L0;
                  } else {
                    param5 = param5 >> var10;
                    param4 = param4 >> var10;
                    param3 = param3 >> var10;
                    break L0;
                  }
                }
                L1: {
                  var10 = -14 + Math.max(Math.max(vma.a(116, param1), vma.a(123, param9)), vma.a(111, param8));
                  if (0 >= var10) {
                    break L1;
                  } else {
                    param9 = param9 >> var10;
                    param1 = param1 >> var10;
                    param8 = param8 >> var10;
                    break L1;
                  }
                }
                if (param2 < 45) {
                  field_a = null;
                  return joa.a(param8, param5, param1, param4, param0, param9, param3, 0);
                } else {
                  return joa.a(param8, param5, param1, param4, param0, param9, param3, 0);
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            Object var2 = null;
            caa[] discarded$0 = ng.a(-49, (byte) -68, 33, (asb) null);
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            ng.a(true);
            return (tv[]) (Object) new tw[param1];
        }
        return (tv[]) (Object) new tw[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Activate scrambler pulse";
    }
}
