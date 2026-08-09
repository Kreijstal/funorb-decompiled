/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static ck field_b;
    static String field_d;
    static String field_a;
    static String field_c;

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != jk.field_a) {
              L1: {
                if (param0 == 2048) {
                  break L1;
                } else {
                  var3 = (String) null;
                  ue.a(-5, (String) null);
                  break L1;
                }
              }
              L2: {
                if (-1 < (param1.toLowerCase().indexOf(jk.field_a.toLowerCase()) ^ -1)) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("ue.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 >= -4) {
          ue.a(-36, 12);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        param0 = param0 & 8191;
        var2 = -44 % ((param1 - -3) / 44);
        if ((param0 ^ -1) > -4097) {
          L0: {
            if (2048 > param0) {
              stackIn_8_0 = pd.field_i[-param0 + 2048];
              break L0;
            } else {
              stackIn_8_0 = -pd.field_i[-2048 + param0];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 < 6144) {
              stackIn_4_0 = -pd.field_i[-param0 + 6144];
              break L1;
            } else {
              stackIn_4_0 = pd.field_i[-6144 + param0];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    static {
        field_d = "Solicitation";
        field_c = "Tips";
        field_a = "Report abuse";
    }
}
