/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    static int field_a;
    static bi field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -103) {
            wo.a((byte) 30);
        }
    }

    final static void a(int param0, byte param1, String[] param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -88) {
                break L1;
              } else {
                var6 = (String) null;
                wo.a(10, (byte) 112, (String[]) null, (String) null);
                break L1;
              }
            }
            fj.field_s = rh.field_g;
            if ((param0 ^ -1) != -256) {
              L2: {
                if (100 > param0) {
                  break L2;
                } else {
                  if (param0 <= 105) {
                    var8 = param2;
                    jp.a(var8, false);
                    ij.field_a = tc.a(param2, (byte) -89);
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              ij.field_a = ck.a(param3, param0, param1 + -35);
              return;
            } else {
              L3: {
                stackIn_6_0 = 93;

                if (jm.field_t >= 13) {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = 0;
                  break L3;
                } else {
                  stackIn_7_0 = stackIn_6_0;
                  stackIn_7_1 = 1;
                  break L3;
                }
              }
              ij.field_a = ub.a((byte) stackIn_7_0, stackIn_7_1 != 0);
              var7 = (String[]) null;
              jp.a((String[]) null, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("wo.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    static {
    }
}
