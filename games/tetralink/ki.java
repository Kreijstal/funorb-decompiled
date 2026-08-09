/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static int field_b;
    static java.math.BigInteger field_c;
    static String field_a;

    public static void a(byte param0) {
        if (param0 != -49) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (param3 == -106) {
              ma.field_d = ik.field_d;
              if (param0 == 255) {
                L1: {
                  if (wh.field_k >= 13) {
                    stackIn_11_0 = 0;
                    break L1;
                  } else {
                    stackIn_11_0 = 1;
                    break L1;
                  }
                }
                va.field_n = al.a(stackIn_11_0 != 0, 1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (param0 < 100) {
                    break L2;
                  } else {
                    if ((param0 ^ -1) < -106) {
                      break L2;
                    } else {
                      va.field_n = ng.a((byte) -67, param2);
                      return;
                    }
                  }
                }
                va.field_n = hj.a(param1, param0, false);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ki.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_b = 0;
        field_a = "Game options changed (<%0>)";
        field_c = new java.math.BigInteger("65537");
    }
}
