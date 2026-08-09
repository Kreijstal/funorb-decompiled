/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static ka[] field_c;
    static String field_d;
    static wb field_a;
    static String field_b;
    static int field_f;
    static ge[] field_e;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param1.length()) {
                L2: {
                  if (param0 == -8503) {
                    break L2;
                  } else {
                    qf.a((byte) 86);
                    break L2;
                  }
                }
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var2_int != param1.charAt(var3)) {
                  stackIn_7_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("qf.A(").append(param0).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 != 75) {
            return;
        }
        field_e = null;
        field_a = null;
        field_b = null;
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 126 % ((40 - param0) / 33);
        int var5 = 0;
        if (param1) {
            var5 += 4;
        }
        if (param2) {
            var5 += 2;
        }
        if (param3) {
            var5++;
        }
        return tf.field_z[var5];
    }

    static {
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
        field_d = "The account name you use to access RuneScape and other Jagex.com games";
        field_e = null;
        field_f = 0;
    }
}
